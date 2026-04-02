package H6;

import F6.AbstractC0076a;
import F6.C0093i0;
import F6.C0108v;
import F6.H;
import F6.o0;
import F6.u0;
import K6.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class o extends AbstractC0076a implements p, g {

    /* renamed from: d  reason: collision with root package name */
    public final c f2075d;

    public o(n6.i iVar, c cVar) {
        super(iVar, true);
        this.f2075d = cVar;
    }

    @Override // F6.AbstractC0076a
    public final void O(boolean z7, Throwable th) {
        if (!this.f2075d.g(false, th) && !z7) {
            H.l(this.f1251c, th);
        }
    }

    @Override // F6.AbstractC0076a
    public final void P(Object obj) {
        l6.j jVar = (l6.j) obj;
        this.f2075d.g(false, null);
    }

    public final void R(E6.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar = this.f2075d;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = c.f2044f0;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, lVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cVar);
            w wVar = e.f2062q;
            if (obj == wVar) {
                w wVar2 = e.f2063r;
                while (!atomicReferenceFieldUpdater.compareAndSet(cVar, wVar, wVar2)) {
                    if (atomicReferenceFieldUpdater.get(cVar) != wVar) {
                        break;
                    }
                }
                lVar.invoke(cVar.l());
                return;
            } else if (obj == e.f2063r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        }
    }

    @Override // H6.r
    public final Object c(Object obj, n6.d dVar) {
        return this.f2075d.c(obj, dVar);
    }

    @Override // F6.u0, F6.InterfaceC0091h0
    public final void cancel(CancellationException cancellationException) {
        Object x7 = x();
        if (!(x7 instanceof C0108v)) {
            if (!(x7 instanceof o0) || !((o0) x7).d()) {
                if (cancellationException == null) {
                    cancellationException = new C0093i0(n(), null, this);
                }
                l(cancellationException);
            }
        }
    }

    @Override // H6.r
    public final Object e(Object obj) {
        return this.f2075d.e(obj);
    }

    @Override // F6.u0
    public final void l(CancellationException cancellationException) {
        CancellationException M7 = u0.M(this, cancellationException);
        this.f2075d.g(true, M7);
        k(M7);
    }
}
