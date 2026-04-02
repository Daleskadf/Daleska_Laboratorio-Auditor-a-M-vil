package c6;
/* loaded from: classes.dex */
public final class O1 implements R1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8556a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8557b;

    public /* synthetic */ O1(int i7, int i8) {
        this.f8556a = i8;
        this.f8557b = i7;
    }

    @Override // c6.R1
    public final void a(Y1 y12) {
        switch (this.f8556a) {
            case 0:
                y12.f8657a.f(this.f8557b);
                return;
            case 1:
                y12.f8657a.c(this.f8557b);
                return;
            default:
                y12.f8657a.e(this.f8557b);
                return;
        }
    }
}
