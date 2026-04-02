package c6;
/* loaded from: classes.dex */
public final class L implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8489a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A.c f8490b;

    public /* synthetic */ L(A.c cVar, int i7) {
        this.f8489a = i7;
        this.f8490b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8489a) {
            case 0:
                this.f8490b.q(true);
                return;
            case 1:
                this.f8490b.q(false);
                return;
            default:
                Z0 z02 = (Z0) this.f8490b.f4b;
                G.i.o("Channel must have been shut down", z02.f8682J.get());
                z02.f8684L = true;
                z02.G(false);
                Z0.z(z02);
                Z0.A(z02);
                return;
        }
    }
}
