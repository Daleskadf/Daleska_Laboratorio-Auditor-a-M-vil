package K6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2789a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2789a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a7 = nVar.a(runnable);
            if (a7 == 0) {
                return true;
            }
            if (a7 != 1) {
                if (a7 == 2) {
                    return false;
                }
            } else {
                n c8 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c8) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2789a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c8 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c8) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f2789a.get(this);
        nVar.getClass();
        long j = n.f.get(nVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2789a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d7 = nVar.d();
            if (d7 != n.f2792g) {
                return d7;
            }
            n c8 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c8) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
