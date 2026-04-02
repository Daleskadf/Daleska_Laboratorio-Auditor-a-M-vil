package c6;
/* loaded from: classes.dex */
public final class U implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f8589a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RunnableC0646G f8590b;

    public U(RunnableC0646G runnableC0646G, boolean z7) {
        this.f8590b = runnableC0646G;
        this.f8589a = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7 = this.f8589a;
        RunnableC0646G runnableC0646G = this.f8590b;
        if (z7) {
            W w2 = (W) runnableC0646G.f8453b;
            w2.f8630l = true;
            if (w2.f8628i > 0) {
                T1 t1 = w2.f8629k;
                t1.f8587b = false;
                t1.b();
            }
        }
        ((W) runnableC0646G.f8453b).f8635q = false;
    }
}
