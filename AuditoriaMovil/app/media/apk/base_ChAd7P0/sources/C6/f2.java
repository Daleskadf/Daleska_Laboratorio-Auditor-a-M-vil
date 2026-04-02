package c6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class f2 extends k2 {

    /* renamed from: c  reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f8828c;

    public f2(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f8828c = atomicIntegerFieldUpdater;
    }

    @Override // c6.k2
    public final boolean r(h2 h2Var) {
        return this.f8828c.compareAndSet(h2Var, 0, -1);
    }

    @Override // c6.k2
    public final void s(h2 h2Var) {
        this.f8828c.set(h2Var, 0);
    }
}
