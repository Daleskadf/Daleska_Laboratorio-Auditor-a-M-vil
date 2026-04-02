package com.loopj.android.http;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.hpplay.sdk.source.mdns.xbill.dns.TTL;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.util.ByteArrayBuffer;
/* loaded from: classes3.dex */
public abstract class AsyncHttpResponseHandler implements ResponseHandlerInterface {
    protected static final int BUFFER_SIZE = 4096;
    protected static final int CANCEL_MESSAGE = 6;
    public static final String DEFAULT_CHARSET = "UTF-8";
    protected static final int FAILURE_MESSAGE = 1;
    protected static final int FINISH_MESSAGE = 3;
    private static final String LOG_TAG = "AsyncHttpRH";
    protected static final int PROGRESS_MESSAGE = 4;
    protected static final int RETRY_MESSAGE = 5;
    protected static final int START_MESSAGE = 2;
    protected static final int SUCCESS_MESSAGE = 0;
    public static final String UTF8_BOM = "\ufeff";
    private WeakReference<Object> TAG;
    private Handler handler;
    private Looper looper;
    private Header[] requestHeaders;
    private URI requestURI;
    private String responseCharset;
    private boolean usePoolThread;
    private boolean useSynchronousMode;

    /* loaded from: classes3.dex */
    public static class ResponderHandler extends Handler {
        private final AsyncHttpResponseHandler mResponder;

        public ResponderHandler(AsyncHttpResponseHandler asyncHttpResponseHandler, Looper looper) {
            super(looper);
            this.mResponder = asyncHttpResponseHandler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.mResponder.handleMessage(message);
        }
    }

    public AsyncHttpResponseHandler() {
        this((Looper) null);
    }

    public String getCharset() {
        String str = this.responseCharset;
        if (str == null) {
            return "UTF-8";
        }
        return str;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public Header[] getRequestHeaders() {
        return this.requestHeaders;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public URI getRequestURI() {
        return this.requestURI;
    }

    public byte[] getResponseData(HttpEntity httpEntity) {
        InputStream content;
        int i10;
        long j10;
        if (httpEntity != null && (content = httpEntity.getContent()) != null) {
            long contentLength = httpEntity.getContentLength();
            if (contentLength <= TTL.MAX_VALUE) {
                if (contentLength <= 0) {
                    i10 = 4096;
                } else {
                    i10 = (int) contentLength;
                }
                try {
                    ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(i10);
                    byte[] bArr = new byte[4096];
                    long j11 = 0;
                    while (true) {
                        int read = content.read(bArr);
                        if (read == -1 || Thread.currentThread().isInterrupted()) {
                            break;
                        }
                        j11 += read;
                        byteArrayBuffer.append(bArr, 0, read);
                        if (contentLength <= 0) {
                            j10 = 1;
                        } else {
                            j10 = contentLength;
                        }
                        sendProgressMessage(j11, j10);
                    }
                    AsyncHttpClient.silentCloseInputStream(content);
                    AsyncHttpClient.endEntityViaReflection(httpEntity);
                    return byteArrayBuffer.toByteArray();
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    throw new IOException("File too large to fit into available memory");
                }
            }
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        return null;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public Object getTag() {
        return this.TAG.get();
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public boolean getUsePoolThread() {
        return this.usePoolThread;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public boolean getUseSynchronousMode() {
        return this.useSynchronousMode;
    }

    public void handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    Object[] objArr = (Object[]) message.obj;
                    if (objArr != null && objArr.length >= 3) {
                        onSuccess(((Integer) objArr[0]).intValue(), (Header[]) objArr[1], (byte[]) objArr[2]);
                        break;
                    } else {
                        AsyncHttpClient.log.e(LOG_TAG, "SUCCESS_MESSAGE didn't got enough params");
                        break;
                    }
                    break;
                case 1:
                    Object[] objArr2 = (Object[]) message.obj;
                    if (objArr2 != null && objArr2.length >= 4) {
                        onFailure(((Integer) objArr2[0]).intValue(), (Header[]) objArr2[1], (byte[]) objArr2[2], (Throwable) objArr2[3]);
                        break;
                    } else {
                        AsyncHttpClient.log.e(LOG_TAG, "FAILURE_MESSAGE didn't got enough params");
                        break;
                    }
                    break;
                case 2:
                    onStart();
                    break;
                case 3:
                    onFinish();
                    break;
                case 4:
                    Object[] objArr3 = (Object[]) message.obj;
                    if (objArr3 != null && objArr3.length >= 2) {
                        onProgress(((Long) objArr3[0]).longValue(), ((Long) objArr3[1]).longValue());
                        break;
                    } else {
                        AsyncHttpClient.log.e(LOG_TAG, "PROGRESS_MESSAGE didn't got enough params");
                        break;
                    }
                    break;
                case 5:
                    Object[] objArr4 = (Object[]) message.obj;
                    if (objArr4 != null && objArr4.length == 1) {
                        onRetry(((Integer) objArr4[0]).intValue());
                        break;
                    } else {
                        AsyncHttpClient.log.e(LOG_TAG, "RETRY_MESSAGE didn't get enough params");
                        break;
                    }
                    break;
                case 6:
                    onCancel();
                    break;
            }
        } catch (Throwable th) {
            onUserException(th);
        }
    }

    public Message obtainMessage(int i10, Object obj) {
        return Message.obtain(this.handler, i10, obj);
    }

    public void onCancel() {
        AsyncHttpClient.log.d(LOG_TAG, "Request got cancelled");
    }

    public abstract void onFailure(int i10, Header[] headerArr, byte[] bArr, Throwable th);

    public void onFinish() {
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void onPostProcessResponse(ResponseHandlerInterface responseHandlerInterface, HttpResponse httpResponse) {
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void onPreProcessResponse(ResponseHandlerInterface responseHandlerInterface, HttpResponse httpResponse) {
    }

    public void onProgress(long j10, long j11) {
        double d10;
        LogInterface logInterface = AsyncHttpClient.log;
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(j10);
        objArr[1] = Long.valueOf(j11);
        if (j11 > 0) {
            double d11 = j10;
            Double.isNaN(d11);
            double d12 = j11;
            Double.isNaN(d12);
            d10 = ((d11 * 1.0d) / d12) * 100.0d;
        } else {
            d10 = -1.0d;
        }
        objArr[2] = Double.valueOf(d10);
        logInterface.v(LOG_TAG, String.format("Progress %d from %d (%2.0f%%)", objArr));
    }

    public void onRetry(int i10) {
        AsyncHttpClient.log.d(LOG_TAG, String.format("Request retry no. %d", Integer.valueOf(i10)));
    }

    public void onStart() {
    }

    public abstract void onSuccess(int i10, Header[] headerArr, byte[] bArr);

    public void onUserException(Throwable th) {
        AsyncHttpClient.log.e(LOG_TAG, "User-space exception detected!", th);
        throw new RuntimeException(th);
    }

    public void postRunnable(Runnable runnable) {
        Handler handler;
        if (runnable != null) {
            if (!getUseSynchronousMode() && (handler = this.handler) != null) {
                handler.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendCancelMessage() {
        sendMessage(obtainMessage(6, null));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendFailureMessage(int i10, Header[] headerArr, byte[] bArr, Throwable th) {
        sendMessage(obtainMessage(1, new Object[]{Integer.valueOf(i10), headerArr, bArr, th}));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendFinishMessage() {
        sendMessage(obtainMessage(3, null));
    }

    public void sendMessage(Message message) {
        boolean z10;
        if (!getUseSynchronousMode() && this.handler != null) {
            if (!Thread.currentThread().isInterrupted()) {
                if (this.handler != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Utils.asserts(z10, "handler should not be null!");
                this.handler.sendMessage(message);
                return;
            }
            return;
        }
        handleMessage(message);
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendProgressMessage(long j10, long j11) {
        sendMessage(obtainMessage(4, new Object[]{Long.valueOf(j10), Long.valueOf(j11)}));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void sendResponseMessage(HttpResponse httpResponse) {
        if (!Thread.currentThread().isInterrupted()) {
            StatusLine statusLine = httpResponse.getStatusLine();
            byte[] responseData = getResponseData(httpResponse.getEntity());
            if (!Thread.currentThread().isInterrupted()) {
                if (statusLine.getStatusCode() >= 300) {
                    sendFailureMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), responseData, new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase()));
                } else {
                    sendSuccessMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), responseData);
                }
            }
        }
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendRetryMessage(int i10) {
        sendMessage(obtainMessage(5, new Object[]{Integer.valueOf(i10)}));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendStartMessage() {
        sendMessage(obtainMessage(2, null));
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public final void sendSuccessMessage(int i10, Header[] headerArr, byte[] bArr) {
        sendMessage(obtainMessage(0, new Object[]{Integer.valueOf(i10), headerArr, bArr}));
    }

    public void setCharset(String str) {
        this.responseCharset = str;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void setRequestHeaders(Header[] headerArr) {
        this.requestHeaders = headerArr;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void setRequestURI(URI uri) {
        this.requestURI = uri;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void setTag(Object obj) {
        this.TAG = new WeakReference<>(obj);
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void setUsePoolThread(boolean z10) {
        if (z10) {
            this.looper = null;
            this.handler = null;
        }
        this.usePoolThread = z10;
    }

    @Override // com.loopj.android.http.ResponseHandlerInterface
    public void setUseSynchronousMode(boolean z10) {
        if (!z10 && this.looper == null) {
            AsyncHttpClient.log.w(LOG_TAG, "Current thread has not called Looper.prepare(). Forcing synchronous mode.");
            z10 = true;
        }
        if (!z10 && this.handler == null) {
            this.handler = new ResponderHandler(this, this.looper);
        } else if (z10 && this.handler != null) {
            this.handler = null;
        }
        this.useSynchronousMode = z10;
    }

    public AsyncHttpResponseHandler(Looper looper) {
        this.responseCharset = "UTF-8";
        this.requestURI = null;
        this.requestHeaders = null;
        this.looper = null;
        this.TAG = new WeakReference<>(null);
        this.looper = looper == null ? Looper.myLooper() : looper;
        setUseSynchronousMode(false);
        setUsePoolThread(false);
    }

    public AsyncHttpResponseHandler(boolean z10) {
        this.responseCharset = "UTF-8";
        this.requestURI = null;
        this.requestHeaders = null;
        this.looper = null;
        this.TAG = new WeakReference<>(null);
        setUsePoolThread(z10);
        if (getUsePoolThread()) {
            return;
        }
        this.looper = Looper.myLooper();
        setUseSynchronousMode(false);
    }
}
