package k1;

import B5.Q;
import H0.e0;
import g1.C1006c;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final C1006c f13680a;

    /* renamed from: b  reason: collision with root package name */
    public final n f13681b;

    /* renamed from: c  reason: collision with root package name */
    public final Q f13682c = new Q();

    /* renamed from: d  reason: collision with root package name */
    public final G1.g f13683d = new G1.g();

    /* renamed from: e  reason: collision with root package name */
    public final G1.g f13684e = new G1.g();
    public final K0.l f;

    /* renamed from: g  reason: collision with root package name */
    public e0 f13685g;

    /* renamed from: h  reason: collision with root package name */
    public e0 f13686h;

    /* renamed from: i  reason: collision with root package name */
    public long f13687i;
    public long j;

    public r(C1006c c1006c, n nVar) {
        this.f13680a = c1006c;
        this.f13681b = nVar;
        K0.l lVar = new K0.l(0);
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        lVar.f2494b = 0;
        lVar.f2495c = 0;
        lVar.f2497e = new long[highestOneBit];
        lVar.f2496d = highestOneBit - 1;
        this.f = lVar;
        this.f13686h = e0.f1792e;
        this.j = -9223372036854775807L;
    }

    public final void a() {
        boolean z7;
        K0.l lVar = this.f;
        boolean z8 = false;
        lVar.f2494b = 0;
        lVar.f2495c = 0;
        this.j = -9223372036854775807L;
        G1.g gVar = this.f13684e;
        if (gVar.k() > 0) {
            if (gVar.k() > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.e(z7);
            while (gVar.k() > 1) {
                gVar.h();
            }
            Object h8 = gVar.h();
            h8.getClass();
            gVar.a((Long) h8, 0L);
        }
        e0 e0Var = this.f13685g;
        G1.g gVar2 = this.f13683d;
        if (e0Var == null) {
            if (gVar2.k() > 0) {
                if (gVar2.k() > 0) {
                    z8 = true;
                }
                K0.a.e(z8);
                while (gVar2.k() > 1) {
                    gVar2.h();
                }
                Object h9 = gVar2.h();
                h9.getClass();
                this.f13685g = (e0) h9;
                return;
            }
            return;
        }
        gVar2.c();
    }
}
