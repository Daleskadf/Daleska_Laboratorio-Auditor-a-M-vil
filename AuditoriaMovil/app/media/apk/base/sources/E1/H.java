package e1;
/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ M f10641b;

    public /* synthetic */ H(M m7, int i7) {
        this.f10640a = i7;
        this.f10641b = m7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10640a) {
            case 0:
                this.f10641b.f10663B0 = true;
                return;
            case 1:
                this.f10641b.v();
                return;
            default:
                M m7 = this.f10641b;
                if (!m7.f10669H0) {
                    InterfaceC0957w interfaceC0957w = m7.f10685l0;
                    interfaceC0957w.getClass();
                    interfaceC0957w.B(m7);
                    return;
                }
                return;
        }
    }
}
