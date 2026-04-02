package f1;

import H0.I;
import H0.r;
import K0.q;
import M0.B;
import a6.t0;
import e1.T;
import m1.G;
/* loaded from: classes.dex */
public final class j extends AbstractC0979a {

    /* renamed from: j0  reason: collision with root package name */
    public final int f11034j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f11035k0;

    /* renamed from: l0  reason: collision with root package name */
    public final InterfaceC0984f f11036l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f11037m0;

    /* renamed from: n0  reason: collision with root package name */
    public volatile boolean f11038n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f11039o0;

    public j(M0.h hVar, M0.l lVar, r rVar, int i7, Object obj, long j, long j8, long j9, long j10, long j11, int i8, long j12, InterfaceC0984f interfaceC0984f) {
        super(hVar, lVar, rVar, i7, obj, j, j8, j9, j10, j11);
        this.f11034j0 = i8;
        this.f11035k0 = j12;
        this.f11036l0 = interfaceC0984f;
    }

    @Override // f1.l
    public final long a() {
        return this.f11044e0 + this.f11034j0;
    }

    @Override // i1.k
    public final void b() {
        boolean z7;
        boolean z8;
        T[] tArr;
        long j;
        long j8;
        t0 t0Var = this.f10980h0;
        K0.a.k(t0Var);
        if (this.f11037m0 == 0) {
            long j9 = this.f11035k0;
            for (T t7 : (T[]) t0Var.f7210c) {
                if (t7.f10728F != j9) {
                    t7.f10728F = j9;
                    t7.f10753z = true;
                }
            }
            InterfaceC0984f interfaceC0984f = this.f11036l0;
            long j10 = this.f10978f0;
            if (j10 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j10 - this.f11035k0;
            }
            long j11 = this.f10979g0;
            if (j11 == -9223372036854775807L) {
                j8 = -9223372036854775807L;
            } else {
                j8 = j11 - this.f11035k0;
            }
            ((C0982d) interfaceC0984f).a(t0Var, j, j8);
        }
        try {
            M0.l a7 = this.f11004b.a(this.f11037m0);
            B b5 = this.f11002Z;
            m1.l lVar = new m1.l(b5, a7.f3176e, b5.e(a7));
            while (!this.f11038n0) {
                int i7 = ((C0982d) this.f11036l0).f10995a.i(lVar, C0982d.f10991f0);
                if (i7 != 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.j(z7);
                if (i7 == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    break;
                }
            }
            r rVar = this.f11006d;
            if (I.i(rVar.f1885l)) {
                int i8 = rVar.f1872H;
                int i9 = rVar.f1873I;
                if ((i8 > 1 || i9 > 1) && i8 != -1 && i9 != -1) {
                    G W7 = t0Var.W(4);
                    int i10 = i8 * i9;
                    long j12 = (this.f11001Y - this.f11000X) / i10;
                    for (int i11 = 1; i11 < i10; i11++) {
                        W7.d(0, new q());
                        W7.e(i11 * j12, 0, 0, 0, null);
                    }
                }
            }
            this.f11037m0 = lVar.f13974d - this.f11004b.f3176e;
            m5.d.a(this.f11002Z);
            this.f11039o0 = !this.f11038n0;
        } catch (Throwable th) {
            m5.d.a(this.f11002Z);
            throw th;
        }
    }

    @Override // f1.l
    public final boolean c() {
        return this.f11039o0;
    }

    @Override // i1.k
    public final void k() {
        this.f11038n0 = true;
    }
}
