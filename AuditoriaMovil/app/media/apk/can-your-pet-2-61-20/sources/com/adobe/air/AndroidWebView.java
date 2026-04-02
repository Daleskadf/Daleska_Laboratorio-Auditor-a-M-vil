package com.adobe.air;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.webkit.URLUtil;
import com.adobe.air.AndroidActivityWrapper;
import com.adobe.air.Entrypoints;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class AndroidWebView implements Entrypoints.AsyncEntryHandler {
    private static final String LOG_TAG = "AndroidWebView";
    private Activity _activity;
    private AndroidWebViewAsync _webViewAsync;
    private boolean _initialized = false;
    private boolean _mediaPlaybackRequiresUserAction = true;
    private long mInternalReference = 0;

    private native void dispatchFocusIn(long j, int i);

    private native void dispatchFocusOut(long j, int i);

    private native void dispatchLoadComplete(long j);

    private native void dispatchLoadError(long j, String str, int i);

    private native boolean dispatchLocationChange(long j);

    private native boolean dispatchLocationChanging(long j, String str);

    public AndroidWebView() {
        Activity activity = AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity();
        this._activity = activity;
        activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.1
            @Override // java.lang.Runnable
            public void run() {
                AndroidWebView.this._webViewAsync = new AndroidWebViewAsync(this);
                AndroidWebView.this._initialized = true;
            }
        });
        Thread.currentThread();
        Looper.getMainLooper().getThread();
    }

    public long internalReference() {
        return this.mInternalReference;
    }

    public void enableLocalDomStorage() {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.2
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.enableLocalDomStorage();
                }
            }
        });
    }

    public void setInternalReference(long j) {
        this.mInternalReference = j;
    }

    public void destroyInternals() {
        this.mInternalReference = 0L;
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.3
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.destroyInternals();
                }
                AndroidWebView.this._webViewAsync = null;
                AndroidWebView.this._initialized = false;
            }
        });
    }

    public void stop() {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.4
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.stop();
                }
            }
        });
    }

    public void reload() {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.5
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.reload();
                }
            }
        });
    }

    public void setMediaPlaybackRequiresUserAction(final boolean z) {
        this._mediaPlaybackRequiresUserAction = z;
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.6
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.setMediaPlaybackRequiresUserAction(z);
                }
            }
        });
    }

    public boolean getMediaPlaybackRequiresUserAction() {
        return this._mediaPlaybackRequiresUserAction;
    }

    public void goBack() {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.7
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.goBack();
                }
            }
        });
    }

    public void goForward() {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.8
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.goForward();
                }
            }
        });
    }

    public boolean canGoBack() {
        if (this._initialized) {
            return this._webViewAsync.canGoBack();
        }
        return false;
    }

    public boolean canGoForward() {
        if (this._initialized) {
            return this._webViewAsync.canGoForward();
        }
        return false;
    }

    public void addedToStage(final AIRWindowSurfaceView aIRWindowSurfaceView) {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.9
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.addedToStage(aIRWindowSurfaceView);
                }
            }
        });
    }

    public void removedFromStage() {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.10
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.removedFromStage();
                }
            }
        });
    }

    public void setVisibility(final boolean z) {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.11
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.setVisibility(z);
                }
            }
        });
    }

    public long updateViewBoundsWithKeyboard(final int i) {
        final long[] jArr = new long[1];
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.12
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    jArr[0] = AndroidWebView.this._webViewAsync.updateViewBoundsWithKeyboard(i);
                }
            }
        });
        return jArr[0];
    }

    public void resetGlobalBounds() {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.13
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.resetGlobalBounds();
                }
            }
        });
    }

    public void adjustViewBounds(final double d, final double d2, final double d3, final double d4) {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.14
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.adjustViewBounds(d, d2, d3, d4);
                }
            }
        });
    }

    public void loadString(final String str, final String str2) {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.15
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.loadString(str, str2);
                }
            }
        });
    }

    public void loadURL(final String str) {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.16
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.loadURL(str);
                }
            }
        });
    }

    private String decodeURL(String str) {
        try {
            return new String(URLUtil.decode(str.getBytes()));
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    public String getCurrentLocation() {
        return this._initialized ? this._webViewAsync.getCurrentLocation() : "";
    }

    public String getPageTitle() {
        return this._initialized ? this._webViewAsync.getPageTitle() : "";
    }

    public void assignFocus(final int i) {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.17
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.assignFocus(i);
                }
            }
        });
    }

    public void clearFocus() {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.18
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.clearFocus();
                }
            }
        });
    }

    public void setStageFocus(final int i) {
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.19
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    AndroidWebView.this._webViewAsync.setStageFocus(i);
                }
            }
        });
    }

    public Bitmap captureSnapshot(final int i, final int i2) {
        final Bitmap[] bitmapArr = new Bitmap[1];
        this._activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.AndroidWebView.20
            @Override // java.lang.Runnable
            public void run() {
                if (AndroidWebView.this._initialized) {
                    bitmapArr[0] = AndroidWebView.this._webViewAsync.captureSnapshot(i, i2);
                }
            }
        });
        return bitmapArr[0];
    }

    public boolean isInTextEditingMode() {
        if (this._initialized) {
            return this._webViewAsync.isInTextEditingMode();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean dispatchLocationChangeJ() {
        return sendDispatchLocationChange(this.mInternalReference);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean dispatchLocationChangingJ(String str) {
        return sendDispatchLocationChanging(this.mInternalReference, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchLoadErrorJ(String str, int i) {
        sendDispatchLoadError(this.mInternalReference, str, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchLoadCompleteJ() {
        sendDispatchLoadComplete(this.mInternalReference);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchFocusInJ(int i) {
        sendDispatchFocusIn(this.mInternalReference, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchFocusOutJ(int i) {
        sendDispatchFocusOut(this.mInternalReference, i);
    }

    @Override // com.adobe.air.Entrypoints.AsyncEntryHandler
    public boolean wrapperInvokeMethod(Method method, Object obj) {
        Boolean bool;
        if (0 == this.mInternalReference) {
            return false;
        }
        try {
            Object[] objArr = (Object[]) obj;
            if (obj == null) {
                bool = method.invoke(this, new Object[0]);
            } else {
                int length = objArr.length;
                if (length == 1) {
                    bool = method.invoke(this, objArr[0]);
                } else if (length == 2) {
                    bool = method.invoke(this, objArr[0], objArr[1]);
                } else if (length != 3) {
                    bool = length != 4 ? method.invoke(this, obj) : method.invoke(this, objArr[0], objArr[1], objArr[2], objArr[3]);
                } else {
                    bool = method.invoke(this, objArr[0], objArr[1], objArr[2]);
                }
            }
        } catch (Exception e) {
            Log.e("AdobeAIR", "Exception when invoking webview method asynchronously: " + e.toString());
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private boolean sendDispatchLocationChange(long j) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            return dispatchLocationChange(j);
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            AndroidActivityWrapper.AsyncEntryDetails asyncEntryDetails = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchLocationChange", Long.TYPE), new Object[]{Long.valueOf(j)}, new Object());
            obtain.obj = asyncEntryDetails;
            asyncHandler.sendMessage(obtain);
            return asyncEntryDetails.getResult();
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for location change event: " + e.toString());
            return false;
        }
    }

    private boolean sendDispatchLocationChanging(long j, String str) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            return dispatchLocationChanging(j, str);
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            AndroidActivityWrapper.AsyncEntryDetails asyncEntryDetails = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchLocationChange", Long.TYPE, String.class), new Object[]{Long.valueOf(j), str}, new Object());
            obtain.obj = asyncEntryDetails;
            asyncHandler.sendMessage(obtain);
            return asyncEntryDetails.getResult();
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for location changing event: " + e.toString());
            return false;
        }
    }

    private void sendDispatchLoadError(long j, String str, int i) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            dispatchLoadError(j, str, i);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchLoadError", Long.TYPE, String.class, Integer.TYPE), new Object[]{Long.valueOf(j), str, Integer.valueOf(i)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for send load error: " + e.toString());
        }
    }

    private void sendDispatchLoadComplete(long j) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            dispatchLoadComplete(j);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchLoadComplete", Long.TYPE), new Object[]{Long.valueOf(j)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for send load complete: " + e.toString());
        }
    }

    private void sendDispatchFocusIn(long j, int i) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            dispatchFocusIn(j, i);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Long.TYPE;
            clsArr[2] = Integer.TYPE;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchFocusIn", clsArr), new Object[]{Long.valueOf(j), Integer.valueOf(i)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for send focus in: " + e.toString());
        }
    }

    private void sendDispatchFocusOut(long j, int i) {
        Handler asyncHandler = Entrypoints.getAsyncHandler();
        if (asyncHandler == null) {
            dispatchFocusOut(j, i);
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = customHandler.ACTIVITY_WRAPPER_MSG_ID;
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Long.TYPE;
            clsArr[2] = Integer.TYPE;
            obtain.obj = new AndroidActivityWrapper.AsyncEntryDetails(this, getClass().getDeclaredMethod("dispatchFocusOut", clsArr), new Object[]{Long.valueOf(j), Integer.valueOf(i)});
            asyncHandler.sendMessage(obtain);
        } catch (NoSuchMethodException e) {
            Log.e("AdobeAIR", "No such method for send focus out: " + e.toString());
        }
    }
}
