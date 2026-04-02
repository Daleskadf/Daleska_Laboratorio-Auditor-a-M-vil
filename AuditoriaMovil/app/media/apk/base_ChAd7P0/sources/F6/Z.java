package F6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m6.C1445f;
/* loaded from: classes.dex */
public abstract class Z extends AbstractC0077a0 implements M {

    /* renamed from: X  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1248X = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_queue");

    /* renamed from: Y  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1249Y = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_delayed");

    /* renamed from: Z  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1250Z = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public S a(long j, H0 h02, n6.i iVar) {
        return J.f1232a.a(j, h02, iVar);
    }

    @Override // F6.M
    public final void b(long j, C0100m c0100m) {
        long j8 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j8 = Long.MAX_VALUE;
            } else {
                j8 = 1000000 * j;
            }
        }
        if (j8 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            V v6 = new V(this, j8 + nanoTime, c0100m);
            t(nanoTime, v6);
            c0100m.u(new C0094j(v6, 1));
        }
    }

    @Override // F6.B
    public final void c(n6.i iVar, Runnable runnable) {
        q(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008a A[EDGE_INSN: B:100:0x008a->B:56:0x008a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0090  */
    @Override // F6.AbstractC0077a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.Z.n():long");
    }

    public void q(Runnable runnable) {
        if (r(runnable)) {
            Thread j = j();
            if (Thread.currentThread() != j) {
                LockSupport.unpark(j);
                return;
            }
            return;
        }
        I.f1229e0.q(runnable);
    }

    public final boolean r(Runnable runnable) {
        boolean z7;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1248X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1250Z.get(this) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            } else if (obj instanceof K6.n) {
                K6.n nVar = (K6.n) obj;
                int a7 = nVar.a(runnable);
                if (a7 == 0) {
                    return true;
                }
                if (a7 != 1) {
                    if (a7 == 2) {
                        return false;
                    }
                } else {
                    K6.n c8 = nVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c8) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else if (obj == H.f1222c) {
                return false;
            } else {
                K6.n nVar2 = new K6.n(8, true);
                nVar2.a((Runnable) obj);
                nVar2.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
        }
    }

    public final boolean s() {
        boolean z7;
        C1445f c1445f = this.f1254e;
        if (c1445f != null) {
            z7 = c1445f.isEmpty();
        } else {
            z7 = true;
        }
        if (!z7) {
            return false;
        }
        Y y2 = (Y) f1249Y.get(this);
        if (y2 != null && K6.z.f2813b.get(y2) != 0) {
            return false;
        }
        Object obj = f1248X.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof K6.n) {
            long j = K6.n.f.get((K6.n) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == H.f1222c) {
            return true;
        }
        return false;
    }

    @Override // F6.AbstractC0077a0
    public void shutdown() {
        X x7;
        F0.f1218a.set(null);
        f1250Z.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1248X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            K6.w wVar = H.f1222c;
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, wVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof K6.n) {
                ((K6.n) obj).b();
                break;
            } else if (obj != wVar) {
                K6.n nVar = new K6.n(8, true);
                nVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            } else {
                break;
            }
        }
        do {
        } while (n() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            Y y2 = (Y) f1249Y.get(this);
            if (y2 != null) {
                synchronized (y2) {
                    if (K6.z.f2813b.get(y2) > 0) {
                        x7 = y2.d(0);
                    } else {
                        x7 = null;
                    }
                }
                if (x7 != null) {
                    p(nanoTime, x7);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, F6.Y] */
    public final void t(long j, X x7) {
        boolean z7;
        int d7;
        Thread j8;
        if (f1250Z.get(this) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        X x8 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1249Y;
        if (z7) {
            d7 = 1;
        } else {
            Y y2 = (Y) atomicReferenceFieldUpdater.get(this);
            if (y2 == null) {
                ?? obj = new Object();
                obj.f1247c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj2);
                y2 = (Y) obj2;
            }
            d7 = x7.d(j, y2, this);
        }
        if (d7 != 0) {
            if (d7 != 1) {
                if (d7 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
            p(j, x7);
            return;
        }
        Y y3 = (Y) atomicReferenceFieldUpdater.get(this);
        if (y3 != null) {
            x8 = y3.b();
        }
        if (x8 == x7 && Thread.currentThread() != (j8 = j())) {
            LockSupport.unpark(j8);
        }
    }
}
