package M;

import D.D;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public Thread f3078c;

    /* renamed from: g  reason: collision with root package name */
    public EGLConfig f3081g;

    /* renamed from: i  reason: collision with root package name */
    public Surface f3083i;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f3076a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f3077b = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public EGLDisplay f3079d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e  reason: collision with root package name */
    public EGLContext f3080e = EGL14.EGL_NO_CONTEXT;
    public int[] f = O.i.f3469a;

    /* renamed from: h  reason: collision with root package name */
    public EGLSurface f3082h = EGL14.EGL_NO_SURFACE;
    public Map j = Collections.emptyMap();

    /* renamed from: k  reason: collision with root package name */
    public O.g f3084k = null;

    /* renamed from: l  reason: collision with root package name */
    public O.f f3085l = O.f.UNKNOWN;

    /* renamed from: m  reason: collision with root package name */
    public int f3086m = -1;

    public final void a(D d7, E.e eVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f3079d = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i11 = 2;
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize(this.f3079d, iArr2, 0, iArr2, 1)) {
                if (eVar != null) {
                    String str = iArr2[0] + "." + iArr2[1];
                    if (str != null) {
                        eVar.f921c = str;
                    } else {
                        throw new NullPointerException("Null eglVersion");
                    }
                }
                if (d7.a()) {
                    i7 = 10;
                } else {
                    i7 = 8;
                }
                if (d7.a()) {
                    i8 = 2;
                } else {
                    i8 = 8;
                }
                if (d7.a()) {
                    i9 = 64;
                } else {
                    i9 = 4;
                }
                int i12 = i9;
                if (d7.a()) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f3079d, new int[]{12324, i7, 12323, i7, 12322, i7, 12321, i8, 12325, 0, 12326, 0, 12352, i12, 12610, i10, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (d7.a()) {
                        i11 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f3079d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i11, 12344}, 0);
                    O.i.a("eglCreateContext");
                    this.f3081g = eGLConfig;
                    this.f3080e = eglCreateContext;
                    EGL14.eglQueryContext(this.f3079d, eglCreateContext, 12440, new int[1], 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f3079d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    public final O.c b(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f3079d;
            EGLConfig eGLConfig = this.f3081g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface i7 = O.i.i(eGLDisplay, eGLConfig, surface, this.f);
            EGLDisplay eGLDisplay2 = this.f3079d;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, i7, 12375, iArr, 0);
            int i8 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, i7, 12374, iArr2, 0);
            Size size = new Size(i8, iArr2[0]);
            return new O.c(i7, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e7) {
            org.slf4j.helpers.i.P("OpenGlRenderer", "Failed to create EGL surface: " + e7.getMessage(), e7);
            return null;
        }
    }

    public final void c() {
        EGLDisplay eGLDisplay = this.f3079d;
        EGLConfig eGLConfig = this.f3081g;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = O.i.f3469a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        O.i.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.f3082h = eglCreatePbufferSurface;
            return;
        }
        throw new IllegalStateException("surface was null");
    }

    public final g0.b d(D d7) {
        O.i.d(this.f3076a, false);
        try {
            a(d7, null);
            c();
            f(this.f3082h);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString(this.f3079d, 12373);
            if (glGetString == null) {
                glGetString = StringUtils.EMPTY;
            }
            if (eglQueryString == null) {
                eglQueryString = StringUtils.EMPTY;
            }
            return new g0.b(glGetString, eglQueryString);
        } catch (IllegalStateException e7) {
            org.slf4j.helpers.i.P("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e7.getMessage(), e7);
            return new g0.b(StringUtils.EMPTY, StringUtils.EMPTY);
        } finally {
            h();
        }
    }

    public O.a e(D d7, Map map) {
        AtomicBoolean atomicBoolean = this.f3076a;
        O.i.d(atomicBoolean, false);
        E.e eVar = new E.e(9, false);
        eVar.f920b = "0.0";
        eVar.f921c = "0.0";
        String str = StringUtils.EMPTY;
        eVar.f922d = StringUtils.EMPTY;
        eVar.f923e = StringUtils.EMPTY;
        try {
            if (d7.a()) {
                g0.b d8 = d(d7);
                String str2 = (String) d8.f11085a;
                String str3 = (String) d8.f11086b;
                if (!str2.contains("GL_EXT_YUV_target")) {
                    org.slf4j.helpers.i.O("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    d7 = D.f607d;
                }
                this.f = O.i.f(str3, d7);
                eVar.f922d = str2;
                eVar.f923e = str3;
            }
            a(d7, eVar);
            c();
            f(this.f3082h);
            String j = O.i.j();
            if (j != null) {
                eVar.f920b = j;
                this.j = O.i.g(d7, map);
                int h8 = O.i.h();
                this.f3086m = h8;
                k(h8);
                this.f3078c = Thread.currentThread();
                atomicBoolean.set(true);
                if (((String) eVar.f920b) == null) {
                    str = " glVersion";
                }
                if (((String) eVar.f921c) == null) {
                    str = str.concat(" eglVersion");
                }
                if (str.isEmpty()) {
                    return new O.a((String) eVar.f920b, (String) eVar.f921c, (String) eVar.f922d, (String) eVar.f923e);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            throw new NullPointerException("Null glVersion");
        } catch (IllegalArgumentException e7) {
            e = e7;
            h();
            throw e;
        } catch (IllegalStateException e8) {
            e = e8;
            h();
            throw e;
        }
    }

    public final void f(EGLSurface eGLSurface) {
        this.f3079d.getClass();
        this.f3080e.getClass();
        if (EGL14.eglMakeCurrent(this.f3079d, eGLSurface, eGLSurface, this.f3080e)) {
            return;
        }
        throw new IllegalStateException("eglMakeCurrent failed");
    }

    public final void g(Surface surface) {
        O.i.d(this.f3076a, true);
        O.i.c(this.f3078c);
        HashMap hashMap = this.f3077b;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, O.i.j);
        }
    }

    public final void h() {
        for (O.g gVar : this.j.values()) {
            GLES20.glDeleteProgram(gVar.f3463a);
        }
        this.j = Collections.emptyMap();
        this.f3084k = null;
        if (!Objects.equals(this.f3079d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f3079d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = this.f3077b;
            for (O.c cVar : hashMap.values()) {
                if (!Objects.equals(cVar.f3459a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f3079d, cVar.f3459a)) {
                    try {
                        O.i.a("eglDestroySurface");
                    } catch (IllegalStateException e7) {
                        org.slf4j.helpers.i.u("GLUtils", e7.toString(), e7);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals(this.f3082h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f3079d, this.f3082h);
                this.f3082h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f3080e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f3079d, this.f3080e);
                this.f3080e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f3079d);
            this.f3079d = EGL14.EGL_NO_DISPLAY;
        }
        this.f3081g = null;
        this.f3086m = -1;
        this.f3085l = O.f.UNKNOWN;
        this.f3083i = null;
        this.f3078c = null;
    }

    public final void i(Surface surface, boolean z7) {
        O.c cVar;
        if (this.f3083i == surface) {
            this.f3083i = null;
            f(this.f3082h);
        }
        HashMap hashMap = this.f3077b;
        if (z7) {
            cVar = (O.c) hashMap.remove(surface);
        } else {
            cVar = (O.c) hashMap.put(surface, O.i.j);
        }
        if (cVar != null && cVar != O.i.j) {
            try {
                EGL14.eglDestroySurface(this.f3079d, cVar.f3459a);
            } catch (RuntimeException e7) {
                org.slf4j.helpers.i.P("OpenGlRenderer", "Failed to destroy EGL surface: " + e7.getMessage(), e7);
            }
        }
    }

    public final void j(long j, float[] fArr, Surface surface) {
        O.i.d(this.f3076a, true);
        O.i.c(this.f3078c);
        HashMap hashMap = this.f3077b;
        g0.c.g("The surface is not registered.", hashMap.containsKey(surface));
        O.c cVar = (O.c) hashMap.get(surface);
        Objects.requireNonNull(cVar);
        if (cVar == O.i.j) {
            cVar = b(surface);
            if (cVar == null) {
                return;
            }
            hashMap.put(surface, cVar);
        }
        Surface surface2 = this.f3083i;
        EGLSurface eGLSurface = cVar.f3459a;
        if (surface != surface2) {
            f(eGLSurface);
            this.f3083i = surface;
            int i7 = cVar.f3460b;
            int i8 = cVar.f3461c;
            GLES20.glViewport(0, 0, i7, i8);
            GLES20.glScissor(0, 0, i7, i8);
        }
        O.g gVar = this.f3084k;
        gVar.getClass();
        if (gVar instanceof O.h) {
            GLES20.glUniformMatrix4fv(((O.h) gVar).f, 1, false, fArr, 0);
            O.i.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        O.i.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f3079d, eGLSurface, j);
        if (!EGL14.eglSwapBuffers(this.f3079d, eGLSurface)) {
            org.slf4j.helpers.i.O("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            i(surface, false);
        }
    }

    public final void k(int i7) {
        O.g gVar = (O.g) this.j.get(this.f3085l);
        if (gVar != null) {
            if (this.f3084k != gVar) {
                this.f3084k = gVar;
                gVar.b();
                Log.d("OpenGlRenderer", "Using program for input format " + this.f3085l + ": " + this.f3084k);
            }
            GLES20.glActiveTexture(33984);
            O.i.b("glActiveTexture");
            GLES20.glBindTexture(36197, i7);
            O.i.b("glBindTexture");
            return;
        }
        throw new IllegalStateException("Unable to configure program for input format: " + this.f3085l);
    }
}
