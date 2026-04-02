package t4;
/* renamed from: t4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1821a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15778a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC1823c f15779b;

    public /* synthetic */ RunnableC1821a(AbstractC1823c abstractC1823c, int i7) {
        this.f15778a = i7;
        this.f15779b = abstractC1823c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        AbstractC1823c abstractC1823c = this.f15779b;
        switch (this.f15778a) {
            case 0:
                u uVar = abstractC1823c.f15795i;
                if (uVar == u.Backoff) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("State should still be backoff but was %s", z7, uVar);
                abstractC1823c.f15795i = u.Initial;
                abstractC1823c.g();
                m5.d.i("Stream should have started", abstractC1823c.d(), new Object[0]);
                return;
            default:
                if (abstractC1823c.c()) {
                    abstractC1823c.f15795i = u.Healthy;
                    return;
                }
                return;
        }
    }
}
