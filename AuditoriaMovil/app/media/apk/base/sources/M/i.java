package M;
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3089a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f3090b;

    public /* synthetic */ i(l lVar, int i7) {
        this.f3089a = i7;
        this.f3090b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3089a) {
            case 0:
                this.f3090b.a();
                return;
            case 1:
                this.f3090b.b();
                return;
            default:
                l lVar = this.f3090b;
                n nVar = lVar.f3102r;
                if (nVar != null) {
                    nVar.c();
                }
                if (lVar.f3101q == null) {
                    U.i iVar = lVar.f3100p;
                    iVar.f5532d = true;
                    U.l lVar2 = iVar.f5530b;
                    if (lVar2 != null && lVar2.f5535b.cancel(true)) {
                        iVar.f5529a = null;
                        iVar.f5530b = null;
                        iVar.f5531c = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
