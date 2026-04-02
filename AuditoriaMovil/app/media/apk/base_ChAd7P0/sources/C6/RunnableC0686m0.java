package c6;
/* renamed from: c6.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0686m0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8909a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ E0 f8910b;

    public RunnableC0686m0(E0 e02, long j) {
        this.f8910b = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8909a) {
            case 0:
                this.f8910b.getClass();
                return;
            default:
                ((d6.p) this.f8910b.f8443a.f28b).d(a6.o0.f7180n.g("Keepalive failed. The connection is likely gone"));
                return;
        }
    }

    public RunnableC0686m0(E0 e02, a6.p0 p0Var) {
        this.f8910b = e02;
    }
}
