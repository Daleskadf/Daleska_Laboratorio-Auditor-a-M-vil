package M6;

import K6.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.r;
/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: Z  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3271Z = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

    /* renamed from: X  reason: collision with root package name */
    public boolean f3272X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ d f3273Y;

    /* renamed from: a  reason: collision with root package name */
    public final n f3274a;

    /* renamed from: b  reason: collision with root package name */
    public final r f3275b;

    /* renamed from: c  reason: collision with root package name */
    public c f3276c;

    /* renamed from: d  reason: collision with root package name */
    public long f3277d;

    /* renamed from: e  reason: collision with root package name */
    public long f3278e;
    public int f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.r, java.lang.Object] */
    public b(d dVar, int i7) {
        this.f3273Y = dVar;
        setDaemon(true);
        this.f3274a = new n();
        this.f3275b = new Object();
        this.f3276c = c.DORMANT;
        this.nextParkedWorker = d.f3282f0;
        z6.d.f16905a.getClass();
        this.f = z6.d.f16906b.a().nextInt();
        f(i7);
    }

    public final j a(boolean z7) {
        j e7;
        j e8;
        d dVar;
        long j;
        c cVar = this.f3276c;
        c cVar2 = c.CPU_ACQUIRED;
        j jVar = null;
        n nVar = this.f3274a;
        boolean z8 = true;
        d dVar2 = this.f3273Y;
        if (cVar != cVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d.f3280Z;
            do {
                dVar = this.f3273Y;
                j = atomicLongFieldUpdater.get(dVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    nVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f3305b;
                        j jVar2 = (j) atomicReferenceFieldUpdater.get(nVar);
                        if (jVar2 != null && jVar2.f3295b.f327a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(nVar, jVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(nVar) != jVar2) {
                                    break;
                                }
                            }
                            jVar = jVar2;
                            break loop1;
                        }
                    }
                    int i7 = n.f3307d.get(nVar);
                    int i8 = n.f3306c.get(nVar);
                    while (true) {
                        if (i7 != i8 && n.f3308e.get(nVar) != 0) {
                            i8--;
                            j c8 = nVar.c(i8, true);
                            if (c8 != null) {
                                jVar = c8;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (jVar == null) {
                        j jVar3 = (j) dVar2.f.d();
                        if (jVar3 == null) {
                            return i(1);
                        }
                        return jVar3;
                    }
                    return jVar;
                }
            } while (!d.f3280Z.compareAndSet(dVar, j, j - 4398046511104L));
            this.f3276c = c.CPU_ACQUIRED;
        }
        if (z7) {
            if (d(dVar2.f3284a * 2) != 0) {
                z8 = false;
            }
            if (!z8 || (e8 = e()) == null) {
                nVar.getClass();
                j jVar4 = (j) n.f3305b.getAndSet(nVar, null);
                if (jVar4 == null) {
                    jVar4 = nVar.b();
                }
                if (jVar4 == null) {
                    if (!z8 && (e7 = e()) != null) {
                        return e7;
                    }
                } else {
                    return jVar4;
                }
            } else {
                return e8;
            }
        } else {
            j e9 = e();
            if (e9 != null) {
                return e9;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i8 = this.f;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f = i11;
        int i12 = i7 - 1;
        if ((i12 & i7) == 0) {
            return i11 & i12;
        }
        return (i11 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i7;
    }

    public final j e() {
        int d7 = d(2);
        d dVar = this.f3273Y;
        if (d7 == 0) {
            j jVar = (j) dVar.f3288e.d();
            if (jVar != null) {
                return jVar;
            }
            return (j) dVar.f.d();
        }
        j jVar2 = (j) dVar.f.d();
        if (jVar2 != null) {
            return jVar2;
        }
        return (j) dVar.f3288e.d();
    }

    public final void f(int i7) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3273Y.f3287d);
        sb.append("-worker-");
        if (i7 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i7);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(c cVar) {
        boolean z7;
        c cVar2 = this.f3276c;
        if (cVar2 == c.CPU_ACQUIRED) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            d.f3280Z.addAndGet(this.f3273Y, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.f3276c = cVar;
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M6.j i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.b.i(int):M6.j");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z8;
        boolean z9;
        boolean z10 = false;
        loop0: while (true) {
            boolean z11 = z10;
            while (true) {
                d dVar = this.f3273Y;
                dVar.getClass();
                if (d.f3281e0.get(dVar) == 0) {
                    c cVar = this.f3276c;
                    c cVar2 = c.TERMINATED;
                    if (cVar == cVar2) {
                        break loop0;
                    }
                    j a7 = a(this.f3272X);
                    long j = -2097152;
                    if (a7 != null) {
                        this.f3278e = 0L;
                        int i7 = a7.f3295b.f327a;
                        this.f3277d = 0L;
                        if (this.f3276c == c.PARKING) {
                            this.f3276c = c.BLOCKING;
                        }
                        d dVar2 = this.f3273Y;
                        if (i7 != 0 && h(c.BLOCKING) && !dVar2.g() && !dVar2.d(d.f3280Z.get(dVar2))) {
                            dVar2.g();
                        }
                        dVar2.getClass();
                        try {
                            a7.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i7 != 0) {
                            d.f3280Z.addAndGet(dVar2, -2097152L);
                            if (this.f3276c != cVar2) {
                                this.f3276c = c.DORMANT;
                            }
                        }
                    } else {
                        this.f3272X = z10;
                        if (this.f3278e != 0) {
                            if (!z11) {
                                z11 = true;
                            } else {
                                h(c.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f3278e);
                                this.f3278e = 0L;
                                break;
                            }
                        } else {
                            Object obj = this.nextParkedWorker;
                            w wVar = d.f3282f0;
                            if (obj != wVar) {
                                z7 = true;
                            } else {
                                z7 = z10;
                            }
                            if (!z7) {
                                d dVar3 = this.f3273Y;
                                dVar3.getClass();
                                if (this.nextParkedWorker == wVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater = d.f3279Y;
                                        long j8 = atomicLongFieldUpdater.get(dVar3);
                                        int i8 = this.indexInArray;
                                        this.nextParkedWorker = dVar3.f3283X.b((int) (j8 & 2097151));
                                        if (atomicLongFieldUpdater.compareAndSet(dVar3, j8, ((2097152 + j8) & j) | i8)) {
                                            break;
                                        }
                                        j = -2097152;
                                    }
                                }
                            } else {
                                f3271Z.set(this, -1);
                                while (this.nextParkedWorker != d.f3282f0) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f3271Z;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    d dVar4 = this.f3273Y;
                                    dVar4.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = d.f3281e0;
                                    if (atomicIntegerFieldUpdater3.get(dVar4) != 0) {
                                        break;
                                    }
                                    c cVar3 = this.f3276c;
                                    c cVar4 = c.TERMINATED;
                                    if (cVar3 == cVar4) {
                                        break;
                                    }
                                    h(c.PARKING);
                                    Thread.interrupted();
                                    if (this.f3277d == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f3277d = System.nanoTime() + this.f3273Y.f3286c;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f3273Y.f3286c);
                                    if (System.nanoTime() - this.f3277d >= 0) {
                                        this.f3277d = 0L;
                                        d dVar5 = this.f3273Y;
                                        synchronized (dVar5.f3283X) {
                                            try {
                                                if (atomicIntegerFieldUpdater3.get(dVar5) != 0) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (!z9) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = d.f3280Z;
                                                    if (((int) (atomicLongFieldUpdater2.get(dVar5) & 2097151)) > dVar5.f3284a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i9 = this.indexInArray;
                                                            z8 = false;
                                                            f(0);
                                                            dVar5.c(this, i9, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(dVar5) & 2097151);
                                                            if (andDecrement != i9) {
                                                                Object b5 = dVar5.f3283X.b(andDecrement);
                                                                kotlin.jvm.internal.j.b(b5);
                                                                b bVar = (b) b5;
                                                                dVar5.f3283X.c(i9, bVar);
                                                                bVar.f(i9);
                                                                dVar5.c(bVar, andDecrement, i9);
                                                            }
                                                            dVar5.f3283X.c(andDecrement, null);
                                                            this.f3276c = cVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        z10 = z8;
                                    }
                                    z8 = false;
                                    z10 = z8;
                                }
                            }
                            z10 = z10;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(c.TERMINATED);
    }
}
