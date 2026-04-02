package e1;
/* loaded from: classes.dex */
public abstract class c0 extends AbstractC0945j {

    /* renamed from: f0  reason: collision with root package name */
    public final AbstractC0936a f10786f0;

    public c0(AbstractC0936a abstractC0936a) {
        this.f10786f0 = abstractC0936a;
    }

    public abstract void B(H0.V v6);

    public final void C() {
        z(null, this.f10786f0);
    }

    public void D() {
        C();
    }

    @Override // e1.AbstractC0936a
    public final H0.V g() {
        return this.f10786f0.g();
    }

    @Override // e1.AbstractC0936a
    public final H0.C h() {
        return this.f10786f0.h();
    }

    @Override // e1.AbstractC0936a
    public final boolean i() {
        return this.f10786f0.i();
    }

    @Override // e1.AbstractC0936a
    public final void m(M0.C c8) {
        this.f10811e0 = c8;
        this.f10810Z = K0.x.n(null);
        D();
    }

    @Override // e1.AbstractC0936a
    public void t(H0.C c8) {
        this.f10786f0.t(c8);
    }

    @Override // e1.AbstractC0945j
    public final C0960z u(Object obj, C0960z c0960z) {
        Void r12 = (Void) obj;
        return A(c0960z);
    }

    @Override // e1.AbstractC0945j
    public final long v(Object obj, long j) {
        Void r12 = (Void) obj;
        return j;
    }

    @Override // e1.AbstractC0945j
    public final int w(int i7, Object obj) {
        Void r22 = (Void) obj;
        return i7;
    }

    @Override // e1.AbstractC0945j
    public final void x(Object obj, AbstractC0936a abstractC0936a, H0.V v6) {
        Void r12 = (Void) obj;
        B(v6);
    }

    public C0960z A(C0960z c0960z) {
        return c0960z;
    }
}
