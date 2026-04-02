package D;
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f760a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A4.d f761b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0064n f762c;

    public /* synthetic */ p0(A4.d dVar, C0064n c0064n, int i7) {
        this.f760a = i7;
        this.f761b = dVar;
        this.f762c = c0064n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f760a) {
            case 0:
                this.f761b.g(this.f762c);
                return;
            default:
                this.f761b.g(this.f762c);
                return;
        }
    }
}
