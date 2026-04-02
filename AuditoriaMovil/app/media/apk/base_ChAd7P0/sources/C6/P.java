package c6;
/* loaded from: classes.dex */
public final class P implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8558a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ S f8559b;

    public /* synthetic */ P(S s7, int i7) {
        this.f8558a = i7;
        this.f8559b = s7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8558a) {
            case 0:
                this.f8559b.f8574c.l();
                return;
            case 1:
                this.f8559b.o();
                return;
            case 2:
                this.f8559b.f8574c.flush();
                return;
            default:
                this.f8559b.f8574c.m();
                return;
        }
    }
}
