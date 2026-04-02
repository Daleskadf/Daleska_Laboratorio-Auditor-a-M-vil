package K6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class b extends q {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2770a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0208a.f2765a;

    @Override // K6.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2770a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        w wVar = AbstractC0208a.f2765a;
        if (obj2 == wVar) {
            w c8 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == wVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, wVar, c8)) {
                        obj2 = c8;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != wVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract w c(Object obj);
}
