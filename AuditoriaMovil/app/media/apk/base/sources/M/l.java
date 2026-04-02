package M;

import D.AbstractC0059i;
import a.AbstractC0412a;
import android.util.Size;
import androidx.camera.core.impl.J;
import h3.AbstractC1079a;
/* loaded from: classes.dex */
public final class l extends J {

    /* renamed from: o  reason: collision with root package name */
    public final U.l f3099o;

    /* renamed from: p  reason: collision with root package name */
    public U.i f3100p;

    /* renamed from: q  reason: collision with root package name */
    public J f3101q;

    /* renamed from: r  reason: collision with root package name */
    public n f3102r;

    public l(Size size, int i7) {
        super(size, i7);
        this.f3099o = AbstractC0412a.s(new A.j(this, 12));
    }

    @Override // androidx.camera.core.impl.J
    public final void a() {
        super.a();
        AbstractC1079a.s(new i(this, 2));
    }

    @Override // androidx.camera.core.impl.J
    public final E3.b f() {
        return this.f3099o;
    }

    public final boolean g(J j, Runnable runnable) {
        boolean z7;
        boolean z8;
        AbstractC1079a.e();
        j.getClass();
        J j8 = this.f3101q;
        boolean z9 = false;
        if (j8 == j) {
            return false;
        }
        if (j8 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z7);
        Size size = this.f7554h;
        Size size2 = j.f7554h;
        g0.c.a("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i7 = j.f7555i;
        int i8 = this.f7555i;
        if (i8 == i7) {
            z9 = true;
        }
        g0.c.a(AbstractC0059i.y("The provider's format(", i8, ") must match the parent(", i7, ")"), z9);
        synchronized (this.f7548a) {
            z8 = this.f7550c;
        }
        g0.c.g("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z8);
        this.f3101q = j;
        H.i.e(true, j.c(), this.f3100p, j3.f.r());
        j.d();
        H.i.d(this.f7552e).a(new C.b(j, 11), j3.f.r());
        H.i.d(j.f7553g).a(runnable, j3.f.C());
        return true;
    }
}
