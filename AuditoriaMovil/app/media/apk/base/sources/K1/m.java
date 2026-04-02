package k1;

import K0.x;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
/* loaded from: classes.dex */
public final class m extends Surface {

    /* renamed from: d  reason: collision with root package name */
    public static int f13646d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f13647e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13648a;

    /* renamed from: b  reason: collision with root package name */
    public final l f13649b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13650c;

    public m(l lVar, SurfaceTexture surfaceTexture, boolean z7) {
        super(surfaceTexture);
        this.f13649b = lVar;
        this.f13648a = z7;
    }

    public static synchronized boolean a(Context context) {
        boolean z7;
        String eglQueryString;
        boolean z8;
        int i7;
        synchronized (m.class) {
            try {
                z7 = true;
                if (!f13647e) {
                    int i8 = x.f2529a;
                    if (i8 >= 24 && ((i8 >= 26 || (!"samsung".equals(x.f2531c) && !"XT1650".equals(x.f2532d))) && ((i8 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                        String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            i7 = 1;
                        } else {
                            i7 = 2;
                        }
                        f13646d = i7;
                        f13647e = true;
                    }
                    i7 = 0;
                    f13646d = i7;
                    f13647e = true;
                }
                if (f13646d == 0) {
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.HandlerThread, k1.l, java.lang.Thread, android.os.Handler$Callback, java.lang.Object] */
    public static m d(Context context, boolean z7) {
        boolean z8;
        int i7;
        boolean z9 = false;
        if (z7 && !a(context)) {
            z8 = false;
        } else {
            z8 = true;
        }
        K0.a.j(z8);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z7) {
            i7 = f13646d;
        } else {
            i7 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f13642b = handler;
        handlerThread.f13641a = new K0.d(handler);
        synchronized (handlerThread) {
            handlerThread.f13642b.obtainMessage(1, i7, 0).sendToTarget();
            while (handlerThread.f13645e == null && handlerThread.f13644d == null && handlerThread.f13643c == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f13644d;
        if (runtimeException == null) {
            Error error = handlerThread.f13643c;
            if (error == null) {
                m mVar = handlerThread.f13645e;
                mVar.getClass();
                return mVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f13649b) {
            try {
                if (!this.f13650c) {
                    l lVar = this.f13649b;
                    lVar.f13642b.getClass();
                    lVar.f13642b.sendEmptyMessage(2);
                    this.f13650c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
