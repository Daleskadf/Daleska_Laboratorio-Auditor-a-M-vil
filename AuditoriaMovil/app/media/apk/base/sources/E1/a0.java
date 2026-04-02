package e1;

import O0.l0;
/* loaded from: classes.dex */
public final class a0 implements InterfaceC0958x, InterfaceC0957w {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0958x f10776a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10777b;

    /* renamed from: c  reason: collision with root package name */
    public InterfaceC0957w f10778c;

    public a0(InterfaceC0958x interfaceC0958x, long j) {
        this.f10776a = interfaceC0958x;
        this.f10777b = j;
    }

    @Override // e1.V
    public final void B(W w2) {
        InterfaceC0958x interfaceC0958x = (InterfaceC0958x) w2;
        InterfaceC0957w interfaceC0957w = this.f10778c;
        interfaceC0957w.getClass();
        interfaceC0957w.B(this);
    }

    @Override // e1.InterfaceC0957w
    public final void a(InterfaceC0958x interfaceC0958x) {
        InterfaceC0957w interfaceC0957w = this.f10778c;
        interfaceC0957w.getClass();
        interfaceC0957w.a(this);
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        long j8 = this.f10777b;
        return this.f10776a.c(j - j8, l0Var) + j8;
    }

    @Override // e1.W
    public final boolean d() {
        return this.f10776a.d();
    }

    @Override // e1.InterfaceC0958x
    public final void f(InterfaceC0957w interfaceC0957w, long j) {
        this.f10778c = interfaceC0957w;
        this.f10776a.f(this, j - this.f10777b);
    }

    @Override // e1.InterfaceC0958x
    public final long i(h1.r[] rVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j) {
        U[] uArr2 = new U[uArr.length];
        int i7 = 0;
        while (true) {
            U u7 = null;
            if (i7 >= uArr.length) {
                break;
            }
            Z z7 = (Z) uArr[i7];
            if (z7 != null) {
                u7 = z7.f10768a;
            }
            uArr2[i7] = u7;
            i7++;
        }
        long j8 = this.f10777b;
        long i8 = this.f10776a.i(rVarArr, zArr, uArr2, zArr2, j - j8);
        for (int i9 = 0; i9 < uArr.length; i9++) {
            U u8 = uArr2[i9];
            if (u8 == null) {
                uArr[i9] = null;
            } else {
                U u9 = uArr[i9];
                if (u9 == null || ((Z) u9).f10768a != u8) {
                    uArr[i9] = new Z(u8, j8);
                }
            }
        }
        return i8 + j8;
    }

    @Override // e1.W
    public final long k() {
        long k2 = this.f10776a.k();
        if (k2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f10777b + k2;
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        long l8 = this.f10776a.l();
        if (l8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f10777b + l8;
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        return this.f10776a.m();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O0.P, java.lang.Object] */
    @Override // e1.W
    public final boolean n(O0.Q q2) {
        ?? obj = new Object();
        obj.f3608b = q2.f3611b;
        obj.f3609c = q2.f3612c;
        obj.f3607a = q2.f3610a - this.f10777b;
        return this.f10776a.n(new O0.Q(obj));
    }

    @Override // e1.W
    public final long o() {
        long o7 = this.f10776a.o();
        if (o7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f10777b + o7;
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        this.f10776a.p();
    }

    @Override // e1.InterfaceC0958x
    public final long q(long j) {
        long j8 = this.f10777b;
        return this.f10776a.q(j - j8) + j8;
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        this.f10776a.r(j - this.f10777b);
    }

    @Override // e1.W
    public final void t(long j) {
        this.f10776a.t(j - this.f10777b);
    }
}
