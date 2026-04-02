package F6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: F6.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0099l0 extends K6.k implements S, InterfaceC0085e0, w6.l {

    /* renamed from: d  reason: collision with root package name */
    public u0 f1281d;

    @Override // F6.S
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        u0 i7 = i();
        while (true) {
            Object x7 = i7.x();
            if (x7 instanceof AbstractC0099l0) {
                if (x7 == this) {
                    U u7 = H.j;
                    do {
                        atomicReferenceFieldUpdater2 = u0.f1313a;
                        if (atomicReferenceFieldUpdater2.compareAndSet(i7, x7, u7)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(i7) == x7);
                } else {
                    return;
                }
            } else if (!(x7 instanceof InterfaceC0085e0) || ((InterfaceC0085e0) x7).c() == null) {
                return;
            } else {
                while (true) {
                    Object f = f();
                    if (f instanceof K6.r) {
                        K6.k kVar = ((K6.r) f).f2801a;
                        return;
                    } else if (f == this) {
                        K6.k kVar2 = (K6.k) f;
                        return;
                    } else {
                        kotlin.jvm.internal.j.c(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        K6.k kVar3 = (K6.k) f;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = K6.k.f2788c;
                        K6.r rVar = (K6.r) atomicReferenceFieldUpdater3.get(kVar3);
                        if (rVar == null) {
                            rVar = new K6.r(kVar3);
                            atomicReferenceFieldUpdater3.lazySet(kVar3, rVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = K6.k.f2786a;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, f, rVar)) {
                                kVar3.d();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == f);
                    }
                }
            }
        }
    }

    @Override // F6.InterfaceC0085e0
    public final y0 c() {
        return null;
    }

    public InterfaceC0091h0 getParent() {
        return i();
    }

    public final u0 i() {
        u0 u0Var = this.f1281d;
        if (u0Var != null) {
            return u0Var;
        }
        kotlin.jvm.internal.j.g("job");
        throw null;
    }

    @Override // F6.InterfaceC0085e0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    @Override // K6.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + H.j(this) + "[job@" + H.j(i()) + ']';
    }
}
