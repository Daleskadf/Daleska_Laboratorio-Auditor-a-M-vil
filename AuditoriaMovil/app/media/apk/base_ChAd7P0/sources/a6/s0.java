package a6;
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f7199a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7200b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7201c;

    public s0(Runnable runnable) {
        this.f7199a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f7200b) {
            this.f7201c = true;
            this.f7199a.run();
        }
    }
}
