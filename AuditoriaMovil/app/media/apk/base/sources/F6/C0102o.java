package F6;

import K6.AbstractC0208a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: F6.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102o extends AbstractC0095j0 {

    /* renamed from: e  reason: collision with root package name */
    public final C0100m f1291e;

    public C0102o(C0100m c0100m) {
        this.f1291e = c0100m;
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return l6.j.f13876a;
    }

    @Override // F6.AbstractC0099l0
    public final void j(Throwable th) {
        u0 i7 = i();
        C0100m c0100m = this.f1291e;
        Throwable q2 = c0100m.q(i7);
        if (c0100m.w()) {
            n6.d dVar = c0100m.f1284d;
            kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            K6.h hVar = (K6.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K6.h.f2777Y;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                K6.w wVar = AbstractC0208a.f2768d;
                if (kotlin.jvm.internal.j.a(obj, wVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, wVar, q2)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != wVar) {
                            break;
                        }
                    }
                    return;
                } else if (!(obj instanceof Throwable)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    return;
                }
            }
        }
        c0100m.n(q2);
        if (!c0100m.w()) {
            c0100m.o();
        }
    }
}
