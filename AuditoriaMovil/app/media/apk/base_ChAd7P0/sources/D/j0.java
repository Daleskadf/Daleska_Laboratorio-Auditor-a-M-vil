package D;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C0498a0;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.camera.core.impl.InterfaceC0521x;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import v.C1878a;
/* loaded from: classes.dex */
public final class j0 extends y0 {

    /* renamed from: v  reason: collision with root package name */
    public static final h0 f722v = new Object();

    /* renamed from: w  reason: collision with root package name */
    public static final G.e f723w = j3.f.C();

    /* renamed from: o  reason: collision with root package name */
    public i0 f724o;

    /* renamed from: p  reason: collision with root package name */
    public G.e f725p;

    /* renamed from: q  reason: collision with root package name */
    public androidx.camera.core.impl.j0 f726q;

    /* renamed from: r  reason: collision with root package name */
    public t0 f727r;

    /* renamed from: s  reason: collision with root package name */
    public M.m f728s;

    /* renamed from: t  reason: collision with root package name */
    public v0 f729t;

    /* renamed from: u  reason: collision with root package name */
    public androidx.camera.core.impl.k0 f730u;

    public final void B() {
        androidx.camera.core.impl.k0 k0Var = this.f730u;
        if (k0Var != null) {
            k0Var.b();
            this.f730u = null;
        }
        t0 t0Var = this.f727r;
        if (t0Var != null) {
            t0Var.a();
            this.f727r = null;
        }
        M.m mVar = this.f728s;
        if (mVar != null) {
            mVar.b();
            this.f728s = null;
        }
        this.f729t = null;
    }

    public final void C(i0 i0Var) {
        Size size;
        AbstractC1079a.e();
        this.f724o = i0Var;
        this.f725p = f723w;
        C0505g c0505g = this.f804g;
        if (c0505g != null) {
            size = c0505g.f7621a;
        } else {
            size = null;
        }
        if (size != null) {
            D((C0498a0) this.f, c0505g);
            n();
        }
        m();
    }

    public final void D(C0498a0 c0498a0, C0505g c0505g) {
        boolean z7;
        Rect rect;
        boolean z8;
        AbstractC1079a.e();
        InterfaceC0521x b5 = b();
        Objects.requireNonNull(b5);
        B();
        if (this.f728s == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        Rect rect2 = null;
        g0.c.g(null, z7);
        Matrix matrix = this.j;
        boolean k2 = b5.k();
        Size size = c0505g.f7621a;
        Rect rect3 = this.f806i;
        if (rect3 != null) {
            rect = rect3;
        } else {
            if (size != null) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect = rect2;
        }
        Objects.requireNonNull(rect);
        int g3 = g(b5, k(b5));
        int d02 = ((androidx.camera.core.impl.Q) this.f).d0();
        if (b5.k() && k(b5)) {
            z8 = true;
        } else {
            z8 = false;
        }
        M.m mVar = new M.m(1, 34, c0505g, matrix, k2, rect, g3, d02, z8);
        this.f728s = mVar;
        C.b bVar = new C.b(this, 2);
        AbstractC1079a.e();
        mVar.a();
        mVar.f3113m.add(bVar);
        v0 c8 = this.f728s.c(true);
        this.f729t = c8;
        this.f727r = c8.j;
        if (this.f724o != null) {
            InterfaceC0521x b7 = b();
            M.m mVar2 = this.f728s;
            if (b7 != null && mVar2 != null) {
                AbstractC1079a.s(new M.j(mVar2, g(b7, k(b7)), ((androidx.camera.core.impl.Q) this.f).d0()));
            }
            i0 i0Var = this.f724o;
            i0Var.getClass();
            v0 v0Var = this.f729t;
            v0Var.getClass();
            this.f725p.execute(new RunnableC0053c(3, i0Var, v0Var));
        }
        androidx.camera.core.impl.j0 d7 = androidx.camera.core.impl.j0.d(c0498a0, c0505g.f7621a);
        n0 n0Var = d7.f7639b;
        n0Var.getClass();
        ((androidx.camera.core.impl.W) n0Var.f755d).j(androidx.camera.core.impl.E.j, c0505g.f7623c);
        int f = AbstractC0059i.f(c0498a0);
        if (f != 0) {
            n0Var.getClass();
            if (f != 0) {
                ((androidx.camera.core.impl.W) n0Var.f755d).j(androidx.camera.core.impl.y0.f7692R, Integer.valueOf(f));
            }
        }
        C1878a c1878a = c0505g.f7624d;
        if (c1878a != null) {
            n0Var.d(c1878a);
        }
        if (this.f724o != null) {
            d7.b(this.f727r, c0505g.f7622b, ((androidx.camera.core.impl.Q) this.f).F());
        }
        androidx.camera.core.impl.k0 k0Var = this.f730u;
        if (k0Var != null) {
            k0Var.b();
        }
        androidx.camera.core.impl.k0 k0Var2 = new androidx.camera.core.impl.k0(new H(this, 2));
        this.f730u = k0Var2;
        d7.f = k0Var2;
        this.f726q = d7;
        Object[] objArr = {d7.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(DesugarCollections.unmodifiableList(arrayList));
    }

    @Override // D.y0
    public final androidx.camera.core.impl.y0 e(boolean z7, B0 b0) {
        f722v.getClass();
        C0498a0 c0498a0 = h0.f718a;
        c0498a0.getClass();
        androidx.camera.core.impl.G a7 = b0.a(AbstractC0059i.c(c0498a0), 1);
        if (z7) {
            a7 = AbstractC0059i.O(a7, c0498a0);
        }
        if (a7 == null) {
            return null;
        }
        return new C0498a0(androidx.camera.core.impl.Z.a(((J) j(a7)).f620b));
    }

    @Override // D.y0
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // D.y0
    public final androidx.camera.core.impl.x0 j(androidx.camera.core.impl.G g3) {
        return new J(androidx.camera.core.impl.W.c(g3), 1);
    }

    @Override // D.y0
    public final androidx.camera.core.impl.y0 r(InterfaceC0519v interfaceC0519v, androidx.camera.core.impl.x0 x0Var) {
        ((androidx.camera.core.impl.W) x0Var.M()).j(androidx.camera.core.impl.O.f7574w, 34);
        return x0Var.a0();
    }

    public final String toString() {
        return "Preview:".concat(f());
    }

    @Override // D.y0
    public final C0505g u(C1878a c1878a) {
        this.f726q.a(c1878a);
        Object[] objArr = {this.f726q.c()};
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
        D((C0498a0) this.f, c0505g);
        return c0505g;
    }

    @Override // D.y0
    public final void w() {
        B();
    }

    @Override // D.y0
    public final void y(Rect rect) {
        this.f806i = rect;
        InterfaceC0521x b5 = b();
        M.m mVar = this.f728s;
        if (b5 != null && mVar != null) {
            AbstractC1079a.s(new M.j(mVar, g(b5, k(b5)), ((androidx.camera.core.impl.Q) this.f).d0()));
        }
    }
}
