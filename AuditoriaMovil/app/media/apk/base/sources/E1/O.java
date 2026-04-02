package e1;

import H0.C0145z;
import android.os.Looper;
/* loaded from: classes.dex */
public final class O extends AbstractC0936a {

    /* renamed from: Y  reason: collision with root package name */
    public final A.f f10704Y;

    /* renamed from: Z  reason: collision with root package name */
    public final X5.E f10705Z;

    /* renamed from: e0  reason: collision with root package name */
    public final T0.g f10706e0;

    /* renamed from: f0  reason: collision with root package name */
    public final com.google.firebase.firestore.Z f10707f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f10708g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f10709h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public long f10710i0 = -9223372036854775807L;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f10711j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f10712k0;

    /* renamed from: l0  reason: collision with root package name */
    public M0.C f10713l0;

    /* renamed from: m0  reason: collision with root package name */
    public H0.C f10714m0;

    public O(H0.C c8, A.f fVar, X5.E e7, T0.g gVar, com.google.firebase.firestore.Z z7, int i7) {
        this.f10714m0 = c8;
        this.f10704Y = fVar;
        this.f10705Z = e7;
        this.f10706e0 = gVar;
        this.f10707f0 = z7;
        this.f10708g0 = i7;
    }

    @Override // e1.AbstractC0936a
    public final InterfaceC0958x b(C0960z c0960z, i1.e eVar, long j) {
        M0.h a7 = this.f10704Y.a();
        M0.C c8 = this.f10713l0;
        if (c8 != null) {
            ((M0.m) a7).n(c8);
        }
        C0145z c0145z = h().f1642b;
        c0145z.getClass();
        K0.a.k(this.f10770X);
        R1.j jVar = new R1.j((m1.r) this.f10705Z.f6409b);
        T0.d dVar = new T0.d(this.f10774d.f5289c, 0, c0960z);
        T0.d a8 = a(c0960z);
        long M7 = K0.x.M(c0145z.f1918e);
        return new M(c0145z.f1914a, a7, jVar, this.f10706e0, dVar, this.f10707f0, a8, this, eVar, this.f10708g0, M7);
    }

    @Override // e1.AbstractC0936a
    public final synchronized H0.C h() {
        return this.f10714m0;
    }

    @Override // e1.AbstractC0936a
    public final void m(M0.C c8) {
        this.f10713l0 = c8;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        P0.k kVar = this.f10770X;
        K0.a.k(kVar);
        T0.g gVar = this.f10706e0;
        gVar.p(myLooper, kVar);
        gVar.b();
        u();
    }

    @Override // e1.AbstractC0936a
    public final void o(InterfaceC0958x interfaceC0958x) {
        T[] tArr;
        M m7 = (M) interfaceC0958x;
        if (m7.q0) {
            for (T t7 : m7.f10687n0) {
                t7.j();
                A.m mVar = t7.f10736h;
                if (mVar != null) {
                    mVar.k0(t7.f10734e);
                    t7.f10736h = null;
                    t7.f10735g = null;
                }
            }
        }
        m7.f10679f0.e(m7);
        m7.f10684k0.removeCallbacksAndMessages(null);
        m7.f10685l0 = null;
        m7.f10669H0 = true;
    }

    @Override // e1.AbstractC0936a
    public final void q() {
        this.f10706e0.release();
    }

    @Override // e1.AbstractC0936a
    public final synchronized void t(H0.C c8) {
        this.f10714m0 = c8;
    }

    public final void u() {
        H0.V y2 = new Y(this.f10710i0, this.f10711j0, this.f10712k0, h());
        if (this.f10709h0) {
            y2 = new a1.s(y2, 1);
        }
        n(y2);
    }

    public final void v(long j, boolean z7, boolean z8) {
        if (j == -9223372036854775807L) {
            j = this.f10710i0;
        }
        if (!this.f10709h0 && this.f10710i0 == j && this.f10711j0 == z7 && this.f10712k0 == z8) {
            return;
        }
        this.f10710i0 = j;
        this.f10711j0 = z7;
        this.f10712k0 = z8;
        this.f10709h0 = false;
        u();
    }

    @Override // e1.AbstractC0936a
    public final void k() {
    }
}
