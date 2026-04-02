package F6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: F6.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0097k0 extends u0 {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097k0(InterfaceC0091h0 interfaceC0091h0) {
        super(true);
        C0104q c0104q;
        C0104q c0104q2;
        boolean z7 = true;
        A(interfaceC0091h0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u0.f1314b;
        InterfaceC0103p interfaceC0103p = (InterfaceC0103p) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0103p instanceof C0104q) {
            c0104q = (C0104q) interfaceC0103p;
        } else {
            c0104q = null;
        }
        if (c0104q != null) {
            u0 i7 = c0104q.i();
            while (!i7.u()) {
                InterfaceC0103p interfaceC0103p2 = (InterfaceC0103p) atomicReferenceFieldUpdater.get(i7);
                if (interfaceC0103p2 instanceof C0104q) {
                    c0104q2 = (C0104q) interfaceC0103p2;
                } else {
                    c0104q2 = null;
                }
                if (c0104q2 != null) {
                    i7 = c0104q2.i();
                }
            }
            this.f1280c = z7;
        }
        z7 = false;
        this.f1280c = z7;
    }

    @Override // F6.u0
    public final boolean u() {
        return this.f1280c;
    }

    @Override // F6.u0
    public final boolean v() {
        return true;
    }
}
