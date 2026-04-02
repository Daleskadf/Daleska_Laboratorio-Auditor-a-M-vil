package c6;
/* loaded from: classes.dex */
public final class W1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Y1 f8638b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s2 f8639c;

    public /* synthetic */ W1(s2 s2Var, Y1 y12, int i7) {
        this.f8637a = i7;
        this.f8639c = s2Var;
        this.f8638b = y12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s2 s2Var = this.f8639c;
        switch (this.f8637a) {
            case 0:
                ((N0) s2Var.f8985c).f8523b.execute(new G.c(this, 19));
                return;
            default:
                a6.Z z7 = N0.f8514E;
                ((N0) s2Var.f8985c).r(this.f8638b);
                return;
        }
    }
}
