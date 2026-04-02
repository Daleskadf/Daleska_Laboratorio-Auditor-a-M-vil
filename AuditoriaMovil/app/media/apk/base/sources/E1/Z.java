package e1;
/* loaded from: classes.dex */
public final class Z implements U {

    /* renamed from: a  reason: collision with root package name */
    public final U f10768a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10769b;

    public Z(U u7, long j) {
        this.f10768a = u7;
        this.f10769b = j;
    }

    @Override // e1.U
    public final void a() {
        this.f10768a.a();
    }

    @Override // e1.U
    public final boolean b() {
        return this.f10768a.b();
    }

    @Override // e1.U
    public final int g(M0.x xVar, N0.f fVar, int i7) {
        int g3 = this.f10768a.g(xVar, fVar, i7);
        if (g3 == -4) {
            fVar.f3345X += this.f10769b;
        }
        return g3;
    }

    @Override // e1.U
    public final int h(long j) {
        return this.f10768a.h(j - this.f10769b);
    }
}
