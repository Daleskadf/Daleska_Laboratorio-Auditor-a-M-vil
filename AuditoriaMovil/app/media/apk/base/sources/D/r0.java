package D;
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f768a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0 f769b;

    public /* synthetic */ r0(v0 v0Var, int i7) {
        this.f768a = i7;
        this.f769b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f768a) {
            case 0:
                this.f769b.f786e.cancel(true);
                return;
            default:
                this.f769b.b();
                return;
        }
    }
}
