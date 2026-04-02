package D;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import v.C1878a;
/* loaded from: classes.dex */
public final class M extends y0 {

    /* renamed from: u  reason: collision with root package name */
    public static final K f622u = new Object();

    /* renamed from: o  reason: collision with root package name */
    public final P f623o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f624p;

    /* renamed from: q  reason: collision with root package name */
    public X5.E f625q;

    /* renamed from: r  reason: collision with root package name */
    public androidx.camera.core.impl.j0 f626r;

    /* renamed from: s  reason: collision with root package name */
    public t0 f627s;

    /* renamed from: t  reason: collision with root package name */
    public androidx.camera.core.impl.k0 f628t;

    public M(androidx.camera.core.impl.M m7) {
        super(m7);
        this.f624p = new Object();
        if (((Integer) ((androidx.camera.core.impl.Z) ((androidx.camera.core.impl.M) this.f).u()).f0(androidx.camera.core.impl.M.f7560b, 0)).intValue() == 1) {
            this.f623o = new P();
        } else {
            this.f623o = new U((Executor) AbstractC0059i.q(m7, I.m.f2122k, j3.f.z()));
        }
        this.f623o.f647d = C();
        P p7 = this.f623o;
        androidx.camera.core.impl.M m8 = (androidx.camera.core.impl.M) this.f;
        Boolean bool = Boolean.FALSE;
        m8.getClass();
        p7.f648e = ((Boolean) AbstractC0059i.q(m8, androidx.camera.core.impl.M.f7559X, bool)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
        if (r10.equals((java.lang.Boolean) D.AbstractC0059i.q(r11, androidx.camera.core.impl.M.f, null)) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.core.impl.j0 B(androidx.camera.core.impl.M r14, androidx.camera.core.impl.C0505g r15) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.M.B(androidx.camera.core.impl.M, androidx.camera.core.impl.g):androidx.camera.core.impl.j0");
    }

    public final int C() {
        androidx.camera.core.impl.M m7 = (androidx.camera.core.impl.M) this.f;
        m7.getClass();
        return ((Integer) AbstractC0059i.q(m7, androidx.camera.core.impl.M.f7563e, 1)).intValue();
    }

    @Override // D.y0
    public final androidx.camera.core.impl.y0 e(boolean z7, B0 b0) {
        f622u.getClass();
        androidx.camera.core.impl.M m7 = K.f621a;
        m7.getClass();
        androidx.camera.core.impl.G a7 = b0.a(AbstractC0059i.c(m7), 1);
        if (z7) {
            a7 = AbstractC0059i.O(a7, m7);
        }
        if (a7 == null) {
            return null;
        }
        return new androidx.camera.core.impl.M(androidx.camera.core.impl.Z.a(((J) j(a7)).f620b));
    }

    @Override // D.y0
    public final androidx.camera.core.impl.x0 j(androidx.camera.core.impl.G g3) {
        return new J(androidx.camera.core.impl.W.c(g3), 0);
    }

    @Override // D.y0
    public final void p() {
        this.f623o.f658n0 = true;
    }

    @Override // D.y0
    public final androidx.camera.core.impl.y0 r(InterfaceC0519v interfaceC0519v, androidx.camera.core.impl.x0 x0Var) {
        androidx.camera.core.impl.M m7 = (androidx.camera.core.impl.M) this.f;
        m7.getClass();
        Boolean bool = (Boolean) AbstractC0059i.q(m7, androidx.camera.core.impl.M.f, null);
        boolean T7 = interfaceC0519v.h().T(OnePixelShiftQuirk.class);
        P p7 = this.f623o;
        if (bool != null) {
            T7 = bool.booleanValue();
        }
        p7.f = T7;
        synchronized (this.f624p) {
        }
        return x0Var.a0();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(f());
    }

    @Override // D.y0
    public final C0505g u(C1878a c1878a) {
        this.f626r.a(c1878a);
        Object[] objArr = {this.f626r.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(DesugarCollections.unmodifiableList(arrayList));
        F3.o a7 = this.f804g.a();
        a7.f1181e = c1878a;
        return a7.f();
    }

    @Override // D.y0
    public final C0505g v(C0505g c0505g, C0505g c0505g2) {
        d();
        androidx.camera.core.impl.j0 B7 = B((androidx.camera.core.impl.M) this.f, c0505g);
        this.f626r = B7;
        Object[] objArr = {B7.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(DesugarCollections.unmodifiableList(arrayList));
        return c0505g;
    }

    @Override // D.y0
    public final void w() {
        AbstractC1079a.e();
        androidx.camera.core.impl.k0 k0Var = this.f628t;
        if (k0Var != null) {
            k0Var.b();
            this.f628t = null;
        }
        t0 t0Var = this.f627s;
        if (t0Var != null) {
            t0Var.a();
            this.f627s = null;
        }
        P p7 = this.f623o;
        p7.f658n0 = false;
        p7.d();
    }

    @Override // D.y0
    public final void x(Matrix matrix) {
        super.x(matrix);
        P p7 = this.f623o;
        synchronized (p7.f657m0) {
            p7.f651g0 = matrix;
            p7.f652h0 = new Matrix(p7.f651g0);
        }
    }

    @Override // D.y0
    public final void y(Rect rect) {
        this.f806i = rect;
        P p7 = this.f623o;
        synchronized (p7.f657m0) {
            p7.f649e0 = rect;
            p7.f650f0 = new Rect(p7.f649e0);
        }
    }
}
