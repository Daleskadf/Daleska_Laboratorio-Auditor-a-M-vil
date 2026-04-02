package k1;

import K0.x;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
/* loaded from: classes.dex */
public final class l extends HandlerThread implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public K0.d f13641a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f13642b;

    /* renamed from: c  reason: collision with root package name */
    public Error f13643c;

    /* renamed from: d  reason: collision with root package name */
    public RuntimeException f13644d;

    /* renamed from: e  reason: collision with root package name */
    public m f13645e;

    public final void a(int i7) {
        boolean z7;
        boolean z8;
        boolean z9;
        EGLSurface eglCreatePbufferSurface;
        boolean z10;
        boolean z11 = true;
        this.f13641a.getClass();
        K0.d dVar = this.f13641a;
        dVar.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.f("eglGetDisplay failed", z7);
        int[] iArr = new int[2];
        K0.a.f("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        dVar.f2473c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, K0.d.f2470X, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i8 = x.f2529a;
        K0.a.f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z8);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(dVar.f2473c, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        K0.a.f("eglCreateContext failed", z9);
        dVar.f2474d = eglCreateContext;
        EGLDisplay eGLDisplay = dVar.f2473c;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            K0.a.f("eglCreatePbufferSurface failed", z10);
        }
        K0.a.f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        dVar.f2475e = eglCreatePbufferSurface;
        int[] iArr3 = dVar.f2472b;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z12 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z12) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z12 = true;
        }
        if (!z12) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            dVar.f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(dVar);
            SurfaceTexture surfaceTexture2 = this.f13641a.f;
            surfaceTexture2.getClass();
            if (i7 == 0) {
                z11 = false;
            }
            this.f13645e = new m(this, surfaceTexture2, z11);
            return;
        }
        throw new Exception(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public final void b() {
        this.f13641a.getClass();
        K0.d dVar = this.f13641a;
        dVar.f2471a.removeCallbacks(dVar);
        try {
            SurfaceTexture surfaceTexture = dVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, dVar.f2472b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = dVar.f2473c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = dVar.f2473c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = dVar.f2475e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(dVar.f2473c, dVar.f2475e);
            }
            EGLContext eGLContext = dVar.f2474d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(dVar.f2473c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = dVar.f2473c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(dVar.f2473c);
            }
            dVar.f2473c = null;
            dVar.f2474d = null;
            dVar.f2475e = null;
            dVar.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 != 1) {
                if (i7 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (K0.e e7) {
                K0.a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                this.f13644d = new IllegalStateException(e7);
                synchronized (this) {
                    notify();
                }
            } catch (Error e8) {
                K0.a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                this.f13643c = e8;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e9) {
                K0.a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                this.f13644d = e9;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
