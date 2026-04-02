package f1;

import H0.r;
import M0.B;
import a6.t0;
/* loaded from: classes.dex */
public final class k extends AbstractC0983e {

    /* renamed from: e0  reason: collision with root package name */
    public final C0982d f11040e0;

    /* renamed from: f0  reason: collision with root package name */
    public t0 f11041f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f11042g0;

    /* renamed from: h0  reason: collision with root package name */
    public volatile boolean f11043h0;

    public k(M0.h hVar, M0.l lVar, r rVar, int i7, Object obj, C0982d c0982d) {
        super(hVar, lVar, 2, rVar, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f11040e0 = c0982d;
    }

    @Override // i1.k
    public final void b() {
        boolean z7;
        if (this.f11042g0 == 0) {
            this.f11040e0.a(this.f11041f0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            M0.l a7 = this.f11004b.a(this.f11042g0);
            B b5 = this.f11002Z;
            m1.l lVar = new m1.l(b5, a7.f3176e, b5.e(a7));
            while (!this.f11043h0) {
                int i7 = this.f11040e0.f10995a.i(lVar, C0982d.f10991f0);
                boolean z8 = false;
                if (i7 != 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.j(z7);
                if (i7 == 0) {
                    z8 = true;
                    continue;
                }
                if (!z8) {
                    break;
                }
            }
            this.f11042g0 = lVar.f13974d - this.f11004b.f3176e;
        } finally {
            m5.d.a(this.f11002Z);
        }
    }

    @Override // i1.k
    public final void k() {
        this.f11043h0 = true;
    }
}
