package K6;

import F6.A0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public abstract class u extends d implements A0 {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2803d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f2804c;
    private volatile int cleanedAndPointers;

    public u(long j, u uVar, int i7) {
        super(uVar);
        this.f2804c = j;
        this.cleanedAndPointers = i7 << 16;
    }

    @Override // K6.d
    public final boolean c() {
        if (f2803d.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f2803d.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i7, n6.i iVar);

    public final void h() {
        if (f2803d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f2803d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
