package F6;

import K6.AbstractC0208a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class N extends K6.t {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1235e = AtomicIntegerFieldUpdater.newUpdater(N.class, "_decision");
    private volatile int _decision;

    @Override // K6.t, F6.u0
    public final void h(Object obj) {
        i(obj);
    }

    @Override // K6.t, F6.u0
    public final void i(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1235e;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    AbstractC0208a.h(AbstractC1740d.q(this.f2802d), H.s(obj), null);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
