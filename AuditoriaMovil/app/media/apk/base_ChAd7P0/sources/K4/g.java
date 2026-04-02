package K4;

import I4.G;
/* loaded from: classes.dex */
public final class g extends G {

    /* renamed from: a  reason: collision with root package name */
    public volatile G f2654a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2655b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2656c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ I4.n f2657d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ P4.a f2658e;
    public final /* synthetic */ h f;

    public g(h hVar, boolean z7, boolean z8, I4.n nVar, P4.a aVar) {
        this.f = hVar;
        this.f2655b = z7;
        this.f2656c = z8;
        this.f2657d = nVar;
        this.f2658e = aVar;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (this.f2655b) {
            aVar.K();
            return null;
        }
        G g3 = this.f2654a;
        if (g3 == null) {
            g3 = this.f2657d.d(this.f, this.f2658e);
            this.f2654a = g3;
        }
        return g3.b(aVar);
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        if (this.f2656c) {
            cVar.o();
            return;
        }
        G g3 = this.f2654a;
        if (g3 == null) {
            g3 = this.f2657d.d(this.f, this.f2658e);
            this.f2654a = g3;
        }
        g3.c(cVar, obj);
    }
}
