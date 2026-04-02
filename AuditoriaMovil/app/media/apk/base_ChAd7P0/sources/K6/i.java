package K6;

import F6.B;
import F6.C0100m;
import F6.H0;
import F6.J;
import F6.M;
import F6.S;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class i extends B implements M {

    /* renamed from: Y  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2781Y = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: X  reason: collision with root package name */
    public final Object f2782X;

    /* renamed from: c  reason: collision with root package name */
    public final M6.m f2783c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2784d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ M f2785e;
    public final l f;
    private volatile int runningWorkers;

    public i(M6.m mVar, int i7) {
        M m7;
        this.f2783c = mVar;
        this.f2784d = i7;
        if (mVar instanceof M) {
            m7 = (M) mVar;
        } else {
            m7 = null;
        }
        this.f2785e = m7 == null ? J.f1232a : m7;
        this.f = new l();
        this.f2782X = new Object();
    }

    @Override // F6.M
    public final S a(long j, H0 h02, n6.i iVar) {
        return this.f2785e.a(j, h02, iVar);
    }

    @Override // F6.M
    public final void b(long j, C0100m c0100m) {
        this.f2785e.b(j, c0100m);
    }

    @Override // F6.B
    public final void c(n6.i iVar, Runnable runnable) {
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2781Y;
        if (atomicIntegerFieldUpdater.get(this) < this.f2784d) {
            synchronized (this.f2782X) {
                if (atomicIntegerFieldUpdater.get(this) < this.f2784d) {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    Runnable g3 = g();
                    if (g3 != null) {
                        this.f2783c.c(this, new H.h(this, g3, 6, false));
                    }
                }
            }
        }
    }

    public final Runnable g() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable == null) {
                synchronized (this.f2782X) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2781Y;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}
