package F6;

import K6.AbstractC0208a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class p0 extends K6.b {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0099l0 f1296b;

    /* renamed from: c  reason: collision with root package name */
    public y0 f1297c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u0 f1298d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0085e0 f1299e;

    public p0(AbstractC0099l0 abstractC0099l0, u0 u0Var, InterfaceC0085e0 interfaceC0085e0) {
        this.f1298d = u0Var;
        this.f1299e = interfaceC0085e0;
        this.f1296b = abstractC0099l0;
    }

    @Override // K6.b
    public final void b(Object obj, Object obj2) {
        boolean z7;
        InterfaceC0085e0 interfaceC0085e0;
        K6.k kVar = (K6.k) obj;
        if (obj2 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0099l0 abstractC0099l0 = this.f1296b;
        if (z7) {
            interfaceC0085e0 = abstractC0099l0;
        } else {
            interfaceC0085e0 = this.f1297c;
        }
        if (interfaceC0085e0 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K6.k.f2786a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, interfaceC0085e0)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z7) {
                y0 y0Var = this.f1297c;
                kotlin.jvm.internal.j.b(y0Var);
                abstractC0099l0.e(y0Var);
            }
        }
    }

    @Override // K6.b
    public final K6.w c(Object obj) {
        K6.k kVar = (K6.k) obj;
        if (this.f1298d.x() == this.f1299e) {
            return null;
        }
        return AbstractC0208a.f2769e;
    }
}
