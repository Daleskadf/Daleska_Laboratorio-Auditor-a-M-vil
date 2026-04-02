package F6;
/* loaded from: classes.dex */
public final class V extends X {

    /* renamed from: c  reason: collision with root package name */
    public final C0100m f1242c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Z f1243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Z z7, long j, C0100m c0100m) {
        super(j);
        this.f1243d = z7;
        this.f1242c = c0100m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1242c.B(this.f1243d);
    }

    @Override // F6.X
    public final String toString() {
        return super.toString() + this.f1242c;
    }
}
