package c4;

import X5.L;
import w4.InterfaceC1955a;
import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class p implements InterfaceC1956b {

    /* renamed from: c  reason: collision with root package name */
    public static final L f8408c = new L(22);

    /* renamed from: d  reason: collision with root package name */
    public static final C0637f f8409d = new C0637f(1);

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC1955a f8410a;

    /* renamed from: b  reason: collision with root package name */
    public volatile InterfaceC1956b f8411b;

    public p(L l8, InterfaceC1956b interfaceC1956b) {
        this.f8410a = l8;
        this.f8411b = interfaceC1956b;
    }

    public final void a(InterfaceC1955a interfaceC1955a) {
        InterfaceC1956b interfaceC1956b;
        InterfaceC1956b interfaceC1956b2;
        InterfaceC1956b interfaceC1956b3 = this.f8411b;
        C0637f c0637f = f8409d;
        if (interfaceC1956b3 != c0637f) {
            interfaceC1955a.f(interfaceC1956b3);
            return;
        }
        synchronized (this) {
            interfaceC1956b = this.f8411b;
            if (interfaceC1956b != c0637f) {
                interfaceC1956b2 = interfaceC1956b;
            } else {
                this.f8410a = new A4.d(12, this.f8410a, interfaceC1955a);
                interfaceC1956b2 = null;
            }
        }
        if (interfaceC1956b2 != null) {
            interfaceC1955a.f(interfaceC1956b);
        }
    }

    @Override // w4.InterfaceC1956b
    public final Object get() {
        return this.f8411b.get();
    }
}
