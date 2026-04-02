package e1;

import O0.i0;
/* renamed from: e1.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956v extends c0 {

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f10844g0;

    /* renamed from: h0  reason: collision with root package name */
    public final H0.U f10845h0;

    /* renamed from: i0  reason: collision with root package name */
    public final H0.T f10846i0;

    /* renamed from: j0  reason: collision with root package name */
    public C0954t f10847j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0953s f10848k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f10849l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f10850m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f10851n0;

    public C0956v(AbstractC0936a abstractC0936a, boolean z7) {
        super(abstractC0936a);
        boolean z8;
        if (z7 && abstractC0936a.i()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f10844g0 = z8;
        this.f10845h0 = new H0.U();
        this.f10846i0 = new H0.T();
        H0.V g3 = abstractC0936a.g();
        if (g3 != null) {
            this.f10847j0 = new C0954t(g3, null, null);
            this.f10851n0 = true;
            return;
        }
        this.f10847j0 = new C0954t(new C0955u(abstractC0936a.h()), H0.U.f1722q, C0954t.f10840e);
    }

    @Override // e1.c0
    public final C0960z A(C0960z c0960z) {
        Object obj = c0960z.f10852a;
        Object obj2 = this.f10847j0.f10842d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0954t.f10840e;
        }
        return c0960z.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // e1.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(H0.V r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0956v.B(H0.V):void");
    }

    @Override // e1.c0
    public final void D() {
        if (!this.f10844g0) {
            this.f10849l0 = true;
            C();
        }
    }

    @Override // e1.AbstractC0936a
    /* renamed from: F */
    public final C0953s b(C0960z c0960z, i1.e eVar, long j) {
        boolean z7;
        C0953s c0953s = new C0953s(c0960z, eVar, j);
        if (c0953s.f10838d == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        c0953s.f10838d = this.f10786f0;
        if (this.f10850m0) {
            Object obj = this.f10847j0.f10842d;
            Object obj2 = c0960z.f10852a;
            if (obj != null && obj2.equals(C0954t.f10840e)) {
                obj2 = this.f10847j0.f10842d;
            }
            c0953s.b(c0960z.a(obj2));
        } else {
            this.f10848k0 = c0953s;
            if (!this.f10849l0) {
                this.f10849l0 = true;
                C();
            }
        }
        return c0953s;
    }

    public final boolean G(long j) {
        C0953s c0953s = this.f10848k0;
        int b5 = this.f10847j0.b(c0953s.f10835a.f10852a);
        if (b5 == -1) {
            return false;
        }
        C0954t c0954t = this.f10847j0;
        H0.T t7 = this.f10846i0;
        c0954t.f(b5, t7, false);
        long j8 = t7.f1719d;
        if (j8 != -9223372036854775807L && j >= j8) {
            j = Math.max(0L, j8 - 1);
        }
        c0953s.f10834X = j;
        return true;
    }

    @Override // e1.AbstractC0936a
    public final void o(InterfaceC0958x interfaceC0958x) {
        C0953s c0953s = (C0953s) interfaceC0958x;
        if (c0953s.f10839e != null) {
            AbstractC0936a abstractC0936a = c0953s.f10838d;
            abstractC0936a.getClass();
            abstractC0936a.o(c0953s.f10839e);
        }
        if (interfaceC0958x == this.f10848k0) {
            this.f10848k0 = null;
        }
    }

    @Override // e1.AbstractC0945j, e1.AbstractC0936a
    public final void q() {
        this.f10850m0 = false;
        this.f10849l0 = false;
        super.q();
    }

    @Override // e1.c0, e1.AbstractC0936a
    public final void t(H0.C c8) {
        if (this.f10851n0) {
            C0954t c0954t = this.f10847j0;
            this.f10847j0 = new C0954t(new i0(this.f10847j0.f10826b, c8), c0954t.f10841c, c0954t.f10842d);
        } else {
            this.f10847j0 = new C0954t(new C0955u(c8), H0.U.f1722q, C0954t.f10840e);
        }
        this.f10786f0.t(c8);
    }

    @Override // e1.AbstractC0945j, e1.AbstractC0936a
    public final void k() {
    }
}
