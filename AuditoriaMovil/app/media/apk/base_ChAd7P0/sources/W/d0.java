package w;
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements U.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Q0.A f16195b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I.b f16196c;

    public /* synthetic */ d0(Q0.A a7, I.b bVar, int i7) {
        this.f16194a = i7;
        this.f16195b = a7;
        this.f16196c = bVar;
    }

    @Override // U.j
    public final Object i(final U.i iVar) {
        switch (this.f16194a) {
            case 0:
                final Q0.A a7 = this.f16195b;
                a7.getClass();
                final I.b bVar = this.f16196c;
                ((G.k) a7.f4138d).execute(new Runnable() { // from class: w.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r4) {
                            case 0:
                                a7.h(iVar, bVar);
                                return;
                            default:
                                a7.h(iVar, bVar);
                                return;
                        }
                    }
                });
                return "setZoomRatio";
            default:
                final Q0.A a8 = this.f16195b;
                a8.getClass();
                final I.b bVar2 = this.f16196c;
                ((G.k) a8.f4138d).execute(new Runnable() { // from class: w.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r4) {
                            case 0:
                                a8.h(iVar, bVar2);
                                return;
                            default:
                                a8.h(iVar, bVar2);
                                return;
                        }
                    }
                });
                return "setLinearZoom";
        }
    }
}
