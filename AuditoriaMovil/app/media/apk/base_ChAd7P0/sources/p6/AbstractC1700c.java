package p6;

import F6.B;
import F6.C0100m;
import K6.AbstractC0208a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
/* renamed from: p6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1700c extends AbstractC1698a {
    private final n6.i _context;
    private transient n6.d intercepted;

    public AbstractC1700c(n6.d dVar, n6.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // n6.d
    public n6.i getContext() {
        n6.i iVar = this._context;
        j.b(iVar);
        return iVar;
    }

    public final n6.d intercepted() {
        n6.d dVar;
        n6.d dVar2 = this.intercepted;
        n6.d dVar3 = dVar2;
        if (dVar2 == null) {
            n6.f fVar = (n6.f) getContext().get(n6.e.f14393a);
            if (fVar != null) {
                dVar = new K6.h((B) fVar, this);
            } else {
                dVar = this;
            }
            this.intercepted = dVar;
            dVar3 = dVar;
        }
        return dVar3;
    }

    @Override // p6.AbstractC1698a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0100m c0100m;
        n6.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            n6.g gVar = getContext().get(n6.e.f14393a);
            j.b(gVar);
            n6.f fVar = (n6.f) gVar;
            K6.h hVar = (K6.h) dVar;
            do {
                atomicReferenceFieldUpdater = K6.h.f2777Y;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0208a.f2768d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof C0100m) {
                c0100m = (C0100m) obj;
            } else {
                c0100m = null;
            }
            if (c0100m != null) {
                c0100m.o();
            }
        }
        this.intercepted = C1699b.f15313a;
    }

    public AbstractC1700c(n6.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
