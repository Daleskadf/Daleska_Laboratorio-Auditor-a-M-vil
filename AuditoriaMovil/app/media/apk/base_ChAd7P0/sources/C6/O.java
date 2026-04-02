package c6;
/* loaded from: classes.dex */
public final class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8547a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8548b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ S f8549c;

    public /* synthetic */ O(S s7, int i7, int i8) {
        this.f8547a = i8;
        this.f8549c = s7;
        this.f8548b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8547a) {
            case 0:
                this.f8549c.f8574c.e(this.f8548b);
                return;
            case 1:
                this.f8549c.f8574c.f(this.f8548b);
                return;
            default:
                this.f8549c.f8574c.c(this.f8548b);
                return;
        }
    }
}
