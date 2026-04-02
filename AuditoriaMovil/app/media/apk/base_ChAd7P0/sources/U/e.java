package U;

import H4.W;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class e extends W {

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5516g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5517h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5518i;
    public final AtomicReferenceFieldUpdater j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5519k;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5516g = atomicReferenceFieldUpdater;
        this.f5517h = atomicReferenceFieldUpdater2;
        this.f5518i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.f5519k = atomicReferenceFieldUpdater5;
    }

    @Override // H4.W
    public final void C(g gVar, g gVar2) {
        this.f5517h.lazySet(gVar, gVar2);
    }

    @Override // H4.W
    public final void D(g gVar, Thread thread) {
        this.f5516g.lazySet(gVar, thread);
    }

    @Override // H4.W
    public final boolean c(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // H4.W
    public final boolean d(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5519k;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // H4.W
    public final boolean e(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5518i;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
