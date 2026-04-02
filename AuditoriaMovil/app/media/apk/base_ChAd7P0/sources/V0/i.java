package V0;

import A3.AbstractC0021t;
import A3.K;
import A3.j0;
import H0.C0135o;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: d  reason: collision with root package name */
    public final int f5840d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5841e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5842g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5843h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5844i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final long f5845k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5846l;

    /* renamed from: m  reason: collision with root package name */
    public final long f5847m;

    /* renamed from: n  reason: collision with root package name */
    public final long f5848n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5849o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5850p;

    /* renamed from: q  reason: collision with root package name */
    public final C0135o f5851q;

    /* renamed from: r  reason: collision with root package name */
    public final K f5852r;

    /* renamed from: s  reason: collision with root package name */
    public final K f5853s;

    /* renamed from: t  reason: collision with root package name */
    public final j0 f5854t;

    /* renamed from: u  reason: collision with root package name */
    public final long f5855u;

    /* renamed from: v  reason: collision with root package name */
    public final h f5856v;

    public i(int i7, String str, List list, long j, boolean z7, long j8, boolean z8, int i8, long j9, int i9, long j10, long j11, boolean z9, boolean z10, boolean z11, C0135o c0135o, List list2, List list3, h hVar, Map map) {
        super(str, list, z9);
        this.f5840d = i7;
        this.f5843h = j8;
        this.f5842g = z7;
        this.f5844i = z8;
        this.j = i8;
        this.f5845k = j9;
        this.f5846l = i9;
        this.f5847m = j10;
        this.f5848n = j11;
        this.f5849o = z10;
        this.f5850p = z11;
        this.f5851q = c0135o;
        this.f5852r = K.p(list2);
        this.f5853s = K.p(list3);
        this.f5854t = j0.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) AbstractC0021t.l(list3);
            this.f5855u = dVar.f5832e + dVar.f5830c;
        } else if (!list2.isEmpty()) {
            f fVar = (f) AbstractC0021t.l(list2);
            this.f5855u = fVar.f5832e + fVar.f5830c;
        } else {
            this.f5855u = 0L;
        }
        long j12 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                j12 = Math.min(this.f5855u, j);
            } else {
                j12 = Math.max(0L, this.f5855u + j);
            }
        }
        this.f5841e = j12;
        this.f = j >= 0;
        this.f5856v = hVar;
    }

    @Override // Z0.a
    public final Object a(List list) {
        return this;
    }
}
