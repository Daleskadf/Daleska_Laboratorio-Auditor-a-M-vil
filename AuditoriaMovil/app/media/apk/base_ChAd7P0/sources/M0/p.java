package M0;

import A3.j0;
import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class p extends AbstractC0236c {

    /* renamed from: X  reason: collision with root package name */
    public final int f3192X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f3193Y;

    /* renamed from: Z  reason: collision with root package name */
    public final x f3194Z;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3195e;

    /* renamed from: e0  reason: collision with root package name */
    public final x f3196e0;
    public final int f;

    /* renamed from: f0  reason: collision with root package name */
    public HttpURLConnection f3197f0;

    /* renamed from: g0  reason: collision with root package name */
    public InputStream f3198g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3199h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3200i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f3201j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f3202k0;

    public p(String str, int i7, int i8, boolean z7, x xVar) {
        super(true);
        this.f3193Y = str;
        this.f = i7;
        this.f3192X = i8;
        this.f3195e = z7;
        this.f3194Z = xVar;
        this.f3196e0 = new x(0, (byte) 0);
    }

    public static void z(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection != null && K0.x.f2529a <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void A(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        while (j > 0) {
            InputStream inputStream = this.f3198g0;
            int i7 = K0.x.f2529a;
            int read = inputStream.read(bArr, 0, (int) Math.min(j, (long) RecognitionOptions.AZTEC));
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j -= read;
                    b(read);
                } else {
                    throw new u();
                }
            } else {
                throw new u(new InterruptedIOException(), 2000, 1);
            }
        }
    }

    @Override // M0.h
    public final void close() {
        try {
            InputStream inputStream = this.f3198g0;
            if (inputStream != null) {
                long j = this.f3201j0;
                long j8 = -1;
                if (j != -1) {
                    j8 = j - this.f3202k0;
                }
                z(this.f3197f0, j8);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    int i7 = K0.x.f2529a;
                    throw new u(e7, 2000, 3);
                }
            }
        } finally {
            this.f3198g0 = null;
            r();
            if (this.f3199h0) {
                this.f3199h0 = false;
                c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130 A[Catch: IOException -> 0x013b, TRY_LEAVE, TryCatch #5 {IOException -> 0x013b, blocks: (B:50:0x0128, B:52:0x0130), top: B:110:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    @Override // M0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(M0.l r24) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.p.e(M0.l):long");
    }

    @Override // M0.AbstractC0236c, M0.h
    public final Map j() {
        HttpURLConnection httpURLConnection = this.f3197f0;
        if (httpURLConnection == null) {
            return j0.f157X;
        }
        return new o(httpURLConnection.getHeaderFields());
    }

    @Override // M0.h
    public final Uri p() {
        HttpURLConnection httpURLConnection = this.f3197f0;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void r() {
        HttpURLConnection httpURLConnection = this.f3197f0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                K0.a.o("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f3197f0 = null;
        }
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j = this.f3201j0;
            if (j != -1) {
                long j8 = j - this.f3202k0;
                if (j8 != 0) {
                    i8 = (int) Math.min(i8, j8);
                }
                return -1;
            }
            InputStream inputStream = this.f3198g0;
            int i9 = K0.x.f2529a;
            int read = inputStream.read(bArr, i7, i8);
            if (read == -1) {
                return -1;
            }
            this.f3202k0 += read;
            b(read);
            return read;
        } catch (IOException e7) {
            int i10 = K0.x.f2529a;
            throw u.b(e7, 2);
        }
    }

    public final URL s(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new u(io.flutter.plugins.pathprovider.b.h("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f3195e && !protocol.equals(url.getProtocol())) {
                    throw new u("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e7) {
                throw new u(e7, 2001, 1);
            }
        }
        throw new u("Null location redirect", 2001);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection x(M0.l r25) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.p.x(M0.l):java.net.HttpURLConnection");
    }

    public final HttpURLConnection y(URL url, int i7, byte[] bArr, long j, long j8, boolean z7, boolean z8, Map map) {
        String sb;
        String str;
        boolean z9;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.f3192X);
        HashMap hashMap = new HashMap();
        x xVar = this.f3194Z;
        if (xVar != null) {
            hashMap.putAll(xVar.D());
        }
        hashMap.putAll(this.f3196e0.D());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.f3212a;
        if (j == 0 && j8 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j);
            sb2.append("-");
            if (j8 != -1) {
                sb2.append((j + j8) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.f3193Y;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z7) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z8);
        if (bArr != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        httpURLConnection.setDoOutput(z9);
        int i8 = l.f3171i;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }
}
