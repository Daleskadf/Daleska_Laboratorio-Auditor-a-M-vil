package K6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2772a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2773b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f2773b.lazySet(this, null);
    }

    public final d b() {
        Object obj = f2772a.get(this);
        if (obj == AbstractC0208a.f2766b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVar;
        d b5;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2773b;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.c()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d b7 = b();
            kotlin.jvm.internal.j.b(b7);
            while (b7.c() && (b5 = b7.b()) != null) {
                b7 = b5;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b7);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b7, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(b7) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                f2772a.set(dVar2, b7);
            }
            if (!b7.c() || b7.b() == null) {
                if (dVar2 == null || !dVar2.c()) {
                    return;
                }
            }
        }
    }
}
