package c6;
/* loaded from: classes.dex */
public final class X1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8642a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s2 f8643b;

    public /* synthetic */ X1(s2 s2Var, int i7) {
        this.f8642a = i7;
        this.f8643b = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8642a) {
            case 0:
                N0 n02 = (N0) this.f8643b.f8985c;
                n02.f8545z = true;
                InterfaceC0717x interfaceC0717x = n02.f8540u;
                R1.j jVar = n02.f8538s;
                interfaceC0717x.O((a6.o0) jVar.f4682b, (EnumC0714w) jVar.f4683c, (a6.e0) jVar.f4684d);
                return;
            default:
                N0 n03 = (N0) this.f8643b.f8985c;
                if (!n03.f8545z) {
                    n03.f8540u.n();
                    return;
                }
                return;
        }
    }
}
