package D;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class P implements androidx.camera.core.impl.S {

    /* renamed from: X  reason: collision with root package name */
    public Executor f641X;

    /* renamed from: Y  reason: collision with root package name */
    public n0 f642Y;

    /* renamed from: Z  reason: collision with root package name */
    public ImageWriter f643Z;

    /* renamed from: a  reason: collision with root package name */
    public A.j f644a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f645b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f646c;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f648e;
    public volatile boolean f;

    /* renamed from: i0  reason: collision with root package name */
    public ByteBuffer f653i0;

    /* renamed from: j0  reason: collision with root package name */
    public ByteBuffer f654j0;

    /* renamed from: k0  reason: collision with root package name */
    public ByteBuffer f655k0;

    /* renamed from: l0  reason: collision with root package name */
    public ByteBuffer f656l0;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f647d = 1;

    /* renamed from: e0  reason: collision with root package name */
    public Rect f649e0 = new Rect();

    /* renamed from: f0  reason: collision with root package name */
    public Rect f650f0 = new Rect();

    /* renamed from: g0  reason: collision with root package name */
    public Matrix f651g0 = new Matrix();

    /* renamed from: h0  reason: collision with root package name */
    public Matrix f652h0 = new Matrix();

    /* renamed from: m0  reason: collision with root package name */
    public final Object f657m0 = new Object();

    /* renamed from: n0  reason: collision with root package name */
    public boolean f658n0 = true;

    public abstract b0 a(androidx.camera.core.impl.T t7);

    @Override // androidx.camera.core.impl.S
    public final void b(androidx.camera.core.impl.T t7) {
        try {
            b0 a7 = a(t7);
            if (a7 != null) {
                f(a7);
            }
        } catch (IllegalStateException e7) {
            org.slf4j.helpers.i.u("ImageAnalysisAnalyzer", "Failed to acquire image.", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final E3.b c(final D.b0 r15) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.P.c(D.b0):E3.b");
    }

    public abstract void d();

    public final void e(b0 b0Var) {
        if (this.f647d == 1) {
            if (this.f654j0 == null) {
                this.f654j0 = ByteBuffer.allocateDirect(b0Var.getHeight() * b0Var.getWidth());
            }
            this.f654j0.position(0);
            if (this.f655k0 == null) {
                this.f655k0 = ByteBuffer.allocateDirect((b0Var.getHeight() * b0Var.getWidth()) / 4);
            }
            this.f655k0.position(0);
            if (this.f656l0 == null) {
                this.f656l0 = ByteBuffer.allocateDirect((b0Var.getHeight() * b0Var.getWidth()) / 4);
            }
            this.f656l0.position(0);
        } else if (this.f647d == 2 && this.f653i0 == null) {
            this.f653i0 = ByteBuffer.allocateDirect(b0Var.getHeight() * b0Var.getWidth() * 4);
        }
    }

    public abstract void f(b0 b0Var);

    public final void g(int i7, int i8, int i9, int i10) {
        int i11 = this.f645b;
        Matrix matrix = new Matrix();
        if (i11 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i7, i8);
            RectF rectF2 = F.g.f1104a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i11);
            RectF rectF3 = new RectF(0.0f, 0.0f, i9, i10);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f649e0);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f650f0 = rect;
        this.f652h0.setConcat(this.f651g0, matrix);
    }

    public final void h(b0 b0Var, int i7) {
        boolean z7;
        int i8;
        n0 n0Var = this.f642Y;
        if (n0Var == null) {
            return;
        }
        n0Var.f();
        int width = b0Var.getWidth();
        int height = b0Var.getHeight();
        int c8 = this.f642Y.c();
        int E4 = this.f642Y.E();
        if (i7 != 90 && i7 != 270) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7) {
            i8 = height;
        } else {
            i8 = width;
        }
        if (!z7) {
            width = height;
        }
        this.f642Y = new n0(m5.d.b(i8, width, c8, E4));
        if (this.f647d == 1) {
            ImageWriter imageWriter = this.f643Z;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f643Z = ImageWriter.newInstance(this.f642Y.getSurface(), this.f642Y.E());
        }
    }

    public final void i(Executor executor, A.j jVar) {
        synchronized (this.f657m0) {
            this.f644a = jVar;
            this.f641X = executor;
        }
    }
}
