package e1;

import O0.l0;
/* renamed from: e1.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953s implements InterfaceC0958x, InterfaceC0957w {

    /* renamed from: X  reason: collision with root package name */
    public long f10834X = -9223372036854775807L;

    /* renamed from: a  reason: collision with root package name */
    public final C0960z f10835a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10836b;

    /* renamed from: c  reason: collision with root package name */
    public final i1.e f10837c;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC0936a f10838d;

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC0958x f10839e;
    public InterfaceC0957w f;

    public C0953s(C0960z c0960z, i1.e eVar, long j) {
        this.f10835a = c0960z;
        this.f10837c = eVar;
        this.f10836b = j;
    }

    @Override // e1.V
    public final void B(W w2) {
        InterfaceC0958x interfaceC0958x = (InterfaceC0958x) w2;
        InterfaceC0957w interfaceC0957w = this.f;
        int i7 = K0.x.f2529a;
        interfaceC0957w.B(this);
    }

    @Override // e1.InterfaceC0957w
    public final void a(InterfaceC0958x interfaceC0958x) {
        InterfaceC0957w interfaceC0957w = this.f;
        int i7 = K0.x.f2529a;
        interfaceC0957w.a(this);
    }

    public final void b(C0960z c0960z) {
        long j = this.f10834X;
        if (j == -9223372036854775807L) {
            j = this.f10836b;
        }
        AbstractC0936a abstractC0936a = this.f10838d;
        abstractC0936a.getClass();
        InterfaceC0958x b5 = abstractC0936a.b(c0960z, this.f10837c, j);
        this.f10839e = b5;
        if (this.f != null) {
            b5.f(this, j);
        }
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        return interfaceC0958x.c(j, l0Var);
    }

    @Override // e1.W
    public final boolean d() {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        if (interfaceC0958x != null && interfaceC0958x.d()) {
            return true;
        }
        return false;
    }

    @Override // e1.InterfaceC0958x
    public final void f(InterfaceC0957w interfaceC0957w, long j) {
        this.f = interfaceC0957w;
        InterfaceC0958x interfaceC0958x = this.f10839e;
        if (interfaceC0958x != null) {
            long j8 = this.f10834X;
            if (j8 == -9223372036854775807L) {
                j8 = this.f10836b;
            }
            interfaceC0958x.f(this, j8);
        }
    }

    @Override // e1.InterfaceC0958x
    public final long i(h1.r[] rVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j) {
        long j8;
        long j9 = this.f10834X;
        if (j9 != -9223372036854775807L && j == this.f10836b) {
            j8 = j9;
        } else {
            j8 = j;
        }
        this.f10834X = -9223372036854775807L;
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        return interfaceC0958x.i(rVarArr, zArr, uArr, zArr2, j8);
    }

    @Override // e1.W
    public final long k() {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        return interfaceC0958x.k();
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        return interfaceC0958x.l();
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        return interfaceC0958x.m();
    }

    @Override // e1.W
    public final boolean n(O0.Q q2) {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        if (interfaceC0958x != null && interfaceC0958x.n(q2)) {
            return true;
        }
        return false;
    }

    @Override // e1.W
    public final long o() {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        return interfaceC0958x.o();
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        if (interfaceC0958x != null) {
            interfaceC0958x.p();
            return;
        }
        AbstractC0936a abstractC0936a = this.f10838d;
        if (abstractC0936a != null) {
            abstractC0936a.k();
        }
    }

    @Override // e1.InterfaceC0958x
    public final long q(long j) {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        return interfaceC0958x.q(j);
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        interfaceC0958x.r(j);
    }

    @Override // e1.W
    public final void t(long j) {
        InterfaceC0958x interfaceC0958x = this.f10839e;
        int i7 = K0.x.f2529a;
        interfaceC0958x.t(j);
    }
}
