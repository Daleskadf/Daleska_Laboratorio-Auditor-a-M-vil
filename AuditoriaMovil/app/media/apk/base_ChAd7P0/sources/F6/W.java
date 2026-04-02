package F6;
/* loaded from: classes.dex */
public final class W extends X {

    /* renamed from: c  reason: collision with root package name */
    public final H0 f1244c;

    public W(long j, H0 h02) {
        super(j);
        this.f1244c = h02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1244c.run();
    }

    @Override // F6.X
    public final String toString() {
        return super.toString() + this.f1244c;
    }
}
