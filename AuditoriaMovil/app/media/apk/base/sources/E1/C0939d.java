package e1;

import O0.l0;
/* renamed from: e1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939d implements InterfaceC0958x, InterfaceC0957w {

    /* renamed from: X  reason: collision with root package name */
    public C0941f f10787X;

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0958x f10788a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0957w f10789b;

    /* renamed from: c  reason: collision with root package name */
    public C0938c[] f10790c = new C0938c[0];

    /* renamed from: d  reason: collision with root package name */
    public long f10791d;

    /* renamed from: e  reason: collision with root package name */
    public long f10792e;
    public long f;

    public C0939d(InterfaceC0958x interfaceC0958x, boolean z7, long j, long j8) {
        long j9;
        this.f10788a = interfaceC0958x;
        if (z7) {
            j9 = j;
        } else {
            j9 = -9223372036854775807L;
        }
        this.f10791d = j9;
        this.f10792e = j;
        this.f = j8;
    }

    @Override // e1.V
    public final void B(W w2) {
        InterfaceC0958x interfaceC0958x = (InterfaceC0958x) w2;
        InterfaceC0957w interfaceC0957w = this.f10789b;
        interfaceC0957w.getClass();
        interfaceC0957w.B(this);
    }

    @Override // e1.InterfaceC0957w
    public final void a(InterfaceC0958x interfaceC0958x) {
        if (this.f10787X != null) {
            return;
        }
        InterfaceC0957w interfaceC0957w = this.f10789b;
        interfaceC0957w.getClass();
        interfaceC0957w.a(this);
    }

    public final boolean b() {
        if (this.f10791d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        long j8;
        long j9 = this.f10792e;
        if (j == j9) {
            return j9;
        }
        long k2 = K0.x.k(l0Var.f3798a, 0L, j - j9);
        long j10 = this.f;
        if (j10 == Long.MIN_VALUE) {
            j8 = Long.MAX_VALUE;
        } else {
            j8 = j10 - j;
        }
        long k8 = K0.x.k(l0Var.f3799b, 0L, j8);
        if (k2 != l0Var.f3798a || k8 != l0Var.f3799b) {
            l0Var = new l0(k2, k8);
        }
        return this.f10788a.c(j, l0Var);
    }

    @Override // e1.W
    public final boolean d() {
        return this.f10788a.d();
    }

    @Override // e1.InterfaceC0958x
    public final void f(InterfaceC0957w interfaceC0957w, long j) {
        this.f10789b = interfaceC0957w;
        this.f10788a.f(this, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x011f, code lost:
        if (r1 > r3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    @Override // e1.InterfaceC0958x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i(h1.r[] r16, boolean[] r17, e1.U[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0939d.i(h1.r[], boolean[], e1.U[], boolean[], long):long");
    }

    @Override // e1.W
    public final long k() {
        long k2 = this.f10788a.k();
        if (k2 != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || k2 < j) {
                return k2;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        boolean z7;
        if (b()) {
            long j = this.f10791d;
            this.f10791d = -9223372036854775807L;
            long l8 = l();
            if (l8 != -9223372036854775807L) {
                return l8;
            }
            return j;
        }
        long l9 = this.f10788a.l();
        if (l9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z8 = false;
        if (l9 >= this.f10792e) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        long j8 = this.f;
        if (j8 == Long.MIN_VALUE || l9 <= j8) {
            z8 = true;
        }
        K0.a.j(z8);
        return l9;
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        return this.f10788a.m();
    }

    @Override // e1.W
    public final boolean n(O0.Q q2) {
        return this.f10788a.n(q2);
    }

    @Override // e1.W
    public final long o() {
        long o7 = this.f10788a.o();
        if (o7 != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || o7 < j) {
                return o7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        C0941f c0941f = this.f10787X;
        if (c0941f == null) {
            this.f10788a.p();
            return;
        }
        throw c0941f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > r6) goto L18;
     */
    @Override // e1.InterfaceC0958x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f10791d = r0
            e1.c[] r0 = r5.f10790c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f10784b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            e1.x r0 = r5.f10788a
            long r0 = r0.q(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f10792e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            K0.a.j(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0939d.q(long):long");
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        this.f10788a.r(j);
    }

    @Override // e1.W
    public final void t(long j) {
        this.f10788a.t(j);
    }
}
