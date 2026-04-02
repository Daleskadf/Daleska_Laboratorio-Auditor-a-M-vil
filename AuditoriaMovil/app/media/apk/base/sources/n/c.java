package N;

import D.D;
import D.e0;
import M.g;
import M.n;
import O.h;
import O.i;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: n  reason: collision with root package name */
    public int f3315n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f3316o = -1;

    /* renamed from: p  reason: collision with root package name */
    public final e0 f3317p;

    /* renamed from: q  reason: collision with root package name */
    public final e0 f3318q;

    public c(e0 e0Var, e0 e0Var2) {
        this.f3317p = e0Var;
        this.f3318q = e0Var2;
    }

    @Override // M.g
    public final O.a e(D d7, Map map) {
        O.a e7 = super.e(d7, map);
        this.f3315n = i.h();
        this.f3316o = i.h();
        return e7;
    }

    public final void l(long j, Surface surface, n nVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        i.d(this.f3076a, true);
        i.c(this.f3078c);
        HashMap hashMap = this.f3077b;
        g0.c.g("The surface is not registered.", hashMap.containsKey(surface));
        O.c cVar = (O.c) hashMap.get(surface);
        Objects.requireNonNull(cVar);
        if (cVar == i.j) {
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
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        O.c cVar2 = cVar;
        m(cVar2, nVar, surfaceTexture, this.f3317p, this.f3315n);
        m(cVar2, nVar, surfaceTexture2, this.f3318q, this.f3316o);
        EGLExt.eglPresentationTimeANDROID(this.f3079d, eGLSurface, j);
        if (!EGL14.eglSwapBuffers(this.f3079d, eGLSurface)) {
            org.slf4j.helpers.i.O("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            i(surface, false);
        }
    }

    public final void m(O.c cVar, n nVar, SurfaceTexture surfaceTexture, e0 e0Var, int i7) {
        k(i7);
        int i8 = cVar.f3460b;
        int i9 = cVar.f3461c;
        GLES20.glViewport(0, 0, i8, i9);
        GLES20.glScissor(0, 0, i8, i9);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, nVar.f3123e, 0);
        O.g gVar = this.f3084k;
        gVar.getClass();
        if (gVar instanceof h) {
            GLES20.glUniformMatrix4fv(((h) gVar).f, 1, false, fArr2, 0);
            i.b("glUniformMatrix4fv");
        }
        e0Var.getClass();
        Size size = new Size((int) (i8 * 1.0f), (int) (i9 * 1.0f));
        Size size2 = new Size(i8, i9);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(gVar.f3464b, 1, false, fArr5, 0);
        i.b("glUniformMatrix4fv");
        GLES20.glUniform1f(gVar.f3465c, 1.0f);
        i.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        i.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
