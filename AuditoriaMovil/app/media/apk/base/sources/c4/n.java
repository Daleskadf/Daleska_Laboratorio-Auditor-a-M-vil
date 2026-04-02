package c4;

import w4.InterfaceC1956b;
/* loaded from: classes.dex */
public final class n implements InterfaceC1956b {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8403c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f8404a = f8403c;

    /* renamed from: b  reason: collision with root package name */
    public volatile InterfaceC1956b f8405b;

    public n(InterfaceC1956b interfaceC1956b) {
        this.f8405b = interfaceC1956b;
    }

    @Override // w4.InterfaceC1956b
    public final Object get() {
        Object obj = this.f8404a;
        Object obj2 = f8403c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f8404a;
                    if (obj == obj2) {
                        obj = this.f8405b.get();
                        this.f8404a = obj;
                        this.f8405b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
