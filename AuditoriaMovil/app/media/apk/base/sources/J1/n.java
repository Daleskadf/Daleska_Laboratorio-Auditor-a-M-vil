package J1;

import K0.q;
import e1.C0960z;
import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements K0.c, K0.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f2383b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2384c;

    public /* synthetic */ n(o oVar, long j, int i7) {
        this.f2384c = oVar;
        this.f2383b = j;
        this.f2382a = i7;
    }

    @Override // K0.c
    public void accept(Object obj) {
        boolean z7;
        a aVar = (a) obj;
        o oVar = (o) this.f2384c;
        K0.a.k(oVar.f2391h);
        byte[] q2 = e5.b.q(aVar.f2354a, aVar.f2356c);
        q qVar = oVar.f2387c;
        qVar.getClass();
        qVar.E(q2, q2.length);
        oVar.f2385a.d(q2.length, qVar);
        long j = aVar.f2355b;
        int i7 = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        long j8 = this.f2383b;
        if (i7 == 0) {
            if (oVar.f2391h.f1891r == Long.MAX_VALUE) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.j(z7);
        } else {
            long j9 = oVar.f2391h.f1891r;
            if (j9 == Long.MAX_VALUE) {
                j8 += j;
            } else {
                j8 = j + j9;
            }
        }
        long j10 = j8;
        oVar.f2385a.e(j10, this.f2382a, q2.length, 0, null);
    }

    @Override // K0.h
    public void invoke(Object obj) {
        long longValue;
        P0.i iVar = (P0.i) obj;
        iVar.getClass();
        P0.a aVar = (P0.a) this.f2384c;
        C0960z c0960z = aVar.f3896d;
        if (c0960z != null) {
            String d7 = iVar.f3927b.d(aVar.f3894b, c0960z);
            HashMap hashMap = iVar.f3932h;
            Long l8 = (Long) hashMap.get(d7);
            HashMap hashMap2 = iVar.f3931g;
            Long l9 = (Long) hashMap2.get(d7);
            long j = 0;
            if (l8 == null) {
                longValue = 0;
            } else {
                longValue = l8.longValue();
            }
            hashMap.put(d7, Long.valueOf(longValue + this.f2383b));
            if (l9 != null) {
                j = l9.longValue();
            }
            hashMap2.put(d7, Long.valueOf(j + this.f2382a));
        }
    }

    public /* synthetic */ n(P0.a aVar, int i7, long j, long j8) {
        this.f2384c = aVar;
        this.f2382a = i7;
        this.f2383b = j;
    }
}
