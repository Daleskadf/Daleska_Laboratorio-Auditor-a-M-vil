package e1;

import java.util.ArrayList;
/* renamed from: e1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942g extends c0 {

    /* renamed from: g0  reason: collision with root package name */
    public final long f10796g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f10797h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f10798i0;

    /* renamed from: j0  reason: collision with root package name */
    public final H0.U f10799j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0940e f10800k0;

    /* renamed from: l0  reason: collision with root package name */
    public C0941f f10801l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f10802m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f10803n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0942g(AbstractC0936a abstractC0936a, long j, boolean z7) {
        super(abstractC0936a);
        abstractC0936a.getClass();
        this.f10796g0 = j;
        this.f10797h0 = z7;
        this.f10798i0 = new ArrayList();
        this.f10799j0 = new H0.U();
    }

    @Override // e1.c0
    public final void B(H0.V v6) {
        if (this.f10801l0 != null) {
            return;
        }
        F(v6);
    }

    public final void F(H0.V v6) {
        long j;
        H0.U u7 = this.f10799j0;
        v6.n(0, u7);
        long j8 = u7.f1737p;
        C0940e c0940e = this.f10800k0;
        ArrayList arrayList = this.f10798i0;
        long j9 = this.f10796g0;
        long j10 = Long.MIN_VALUE;
        if (c0940e != null && !arrayList.isEmpty()) {
            long j11 = this.f10802m0 - j8;
            if (j9 != Long.MIN_VALUE) {
                j10 = this.f10803n0 - j8;
            }
            j9 = j10;
            j = j11;
        } else {
            this.f10802m0 = j8;
            if (j9 != Long.MIN_VALUE) {
                j10 = j8 + j9;
            }
            this.f10803n0 = j10;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0939d c0939d = (C0939d) arrayList.get(i7);
                long j12 = this.f10802m0;
                long j13 = this.f10803n0;
                c0939d.f10792e = j12;
                c0939d.f = j13;
            }
            j = 0;
        }
        try {
            C0940e c0940e2 = new C0940e(v6, j, j9);
            this.f10800k0 = c0940e2;
            n(c0940e2);
        } catch (C0941f e7) {
            this.f10801l0 = e7;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C0939d) arrayList.get(i8)).f10787X = this.f10801l0;
            }
        }
    }

    @Override // e1.AbstractC0936a
    public final InterfaceC0958x b(C0960z c0960z, i1.e eVar, long j) {
        C0939d c0939d = new C0939d(this.f10786f0.b(c0960z, eVar, j), this.f10797h0, this.f10802m0, this.f10803n0);
        this.f10798i0.add(c0939d);
        return c0939d;
    }

    @Override // e1.AbstractC0945j, e1.AbstractC0936a
    public final void k() {
        C0941f c0941f = this.f10801l0;
        if (c0941f == null) {
            super.k();
            return;
        }
        throw c0941f;
    }

    @Override // e1.AbstractC0936a
    public final void o(InterfaceC0958x interfaceC0958x) {
        ArrayList arrayList = this.f10798i0;
        K0.a.j(arrayList.remove(interfaceC0958x));
        this.f10786f0.o(((C0939d) interfaceC0958x).f10788a);
        if (arrayList.isEmpty()) {
            C0940e c0940e = this.f10800k0;
            c0940e.getClass();
            F(c0940e.f10826b);
        }
    }

    @Override // e1.AbstractC0945j, e1.AbstractC0936a
    public final void q() {
        super.q();
        this.f10801l0 = null;
        this.f10800k0 = null;
    }
}
