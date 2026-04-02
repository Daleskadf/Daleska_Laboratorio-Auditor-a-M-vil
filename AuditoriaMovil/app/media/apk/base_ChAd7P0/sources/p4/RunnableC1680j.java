package p4;
/* renamed from: p4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1680j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15258a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1683m f15259b;

    public /* synthetic */ RunnableC1680j(C1683m c1683m, int i7) {
        this.f15258a = i7;
        this.f15259b = c1683m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15258a) {
            case 0:
                this.f15259b.f15267b.start();
                return;
            case 1:
                this.f15259b.f15268c.start();
                return;
            default:
                this.f15259b.f15267b.g();
                return;
        }
    }
}
