package M6;

import B5.L;
import D.AbstractC0059i;
import F6.H;
import K6.s;
import K6.w;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class d implements Executor, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3279Y = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack");

    /* renamed from: Z  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3280Z = AtomicLongFieldUpdater.newUpdater(d.class, "controlState");

    /* renamed from: e0  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3281e0 = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated");

    /* renamed from: f0  reason: collision with root package name */
    public static final w f3282f0 = new w("NOT_IN_STACK", 0);

    /* renamed from: X  reason: collision with root package name */
    public final s f3283X;
    private volatile int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f3284a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3285b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3286c;
    private volatile long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f3287d;

    /* renamed from: e  reason: collision with root package name */
    public final g f3288e;
    public final g f;
    private volatile long parkedWorkersStack;

    /* JADX WARN: Type inference failed for: r4v10, types: [M6.g, K6.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [M6.g, K6.l] */
    public d(int i7, int i8, long j, String str) {
        this.f3284a = i7;
        this.f3285b = i8;
        this.f3286c = j;
        this.f3287d = str;
        if (i7 >= 1) {
            if (i8 >= i7) {
                if (i8 <= 2097150) {
                    if (j > 0) {
                        this.f3288e = new K6.l();
                        this.f = new K6.l();
                        this.f3283X = new s((i7 + 1) * 2);
                        this.controlState = i7 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Max pool size ", i8, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(AbstractC0059i.x("Max pool size ", i8, i7, " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Core pool size ", i7, " should be at least 1").toString());
    }

    public final int a() {
        boolean z7;
        synchronized (this.f3283X) {
            try {
                if (f3281e0.get(this) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3280Z;
                long j = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j & 2097151);
                int i8 = i7 - ((int) ((j & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f3284a) {
                    return 0;
                }
                if (i7 >= this.f3285b) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 > 0 && this.f3283X.b(i9) == null) {
                    b bVar = new b(this, i9);
                    this.f3283X.c(i9, bVar);
                    if (i9 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i10 = i8 + 1;
                        bVar.start();
                        return i10;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, L l8, boolean z7) {
        j kVar;
        boolean z8;
        long j;
        b bVar;
        boolean a7;
        c cVar;
        l.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof j) {
            kVar = (j) runnable;
            kVar.f3294a = nanoTime;
            kVar.f3295b = l8;
        } else {
            kVar = new k(runnable, nanoTime, l8);
        }
        boolean z9 = false;
        if (kVar.f3295b.f327a == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3280Z;
        if (z8) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof b) {
            bVar = (b) currentThread;
        } else {
            bVar = null;
        }
        if (bVar == null || !kotlin.jvm.internal.j.a(bVar.f3273Y, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f3276c) != c.TERMINATED && (kVar.f3295b.f327a != 0 || cVar != c.BLOCKING)) {
            bVar.f3272X = true;
            n nVar = bVar.f3274a;
            if (z7) {
                kVar = nVar.a(kVar);
            } else {
                nVar.getClass();
                j jVar = (j) n.f3305b.getAndSet(nVar, kVar);
                if (jVar == null) {
                    kVar = null;
                } else {
                    kVar = nVar.a(jVar);
                }
            }
        }
        if (kVar != null) {
            if (kVar.f3295b.f327a == 1) {
                a7 = this.f.a(kVar);
            } else {
                a7 = this.f3288e.a(kVar);
            }
            if (!a7) {
                throw new RejectedExecutionException(AbstractC0059i.D(new StringBuilder(), this.f3287d, " was terminated"));
            }
        }
        if (z7 && bVar != null) {
            z9 = true;
        }
        if (z8) {
            if (!z9 && !g() && !d(j)) {
                g();
            }
        } else if (!z9 && !g() && !d(atomicLongFieldUpdater.get(this))) {
            g();
        }
    }

    public final void c(b bVar, int i7, int i8) {
        while (true) {
            long j = f3279Y.get(this);
            int i9 = (int) (2097151 & j);
            long j8 = (2097152 + j) & (-2097152);
            if (i9 == i7) {
                if (i8 == 0) {
                    Object c8 = bVar.c();
                    while (true) {
                        if (c8 == f3282f0) {
                            i9 = -1;
                            break;
                        } else if (c8 == null) {
                            i9 = 0;
                            break;
                        } else {
                            b bVar2 = (b) c8;
                            int b5 = bVar2.b();
                            if (b5 != 0) {
                                i9 = b5;
                                break;
                            }
                            c8 = bVar2.c();
                        }
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f3279Y.compareAndSet(this, j, i9 | j8)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r1 == null) goto L46;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = M6.d.f3281e0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb0
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof M6.b
            r3 = 0
            if (r1 == 0) goto L18
            M6.b r0 = (M6.b) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            M6.d r1 = r0.f3273Y
            boolean r1 = kotlin.jvm.internal.j.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            K6.s r1 = r8.f3283X
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = M6.d.f3280Z     // Catch: java.lang.Throwable -> Lc2
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc2
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            K6.s r5 = r8.f3283X
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.j.b(r5)
            M6.b r5 = (M6.b) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            M6.n r5 = r5.f3274a
            M6.g r6 = r8.f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = M6.n.f3305b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            M6.j r7 = (M6.j) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            M6.j r7 = r5.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            M6.g r1 = r8.f
            r1.b()
            M6.g r1 = r8.f3288e
            r1.b()
        L81:
            if (r0 == 0) goto L89
            M6.j r1 = r0.a(r2)
            if (r1 != 0) goto Lb1
        L89:
            M6.g r1 = r8.f3288e
            java.lang.Object r1 = r1.d()
            M6.j r1 = (M6.j) r1
            if (r1 != 0) goto Lb1
            M6.g r1 = r8.f
            java.lang.Object r1 = r1.d()
            M6.j r1 = (M6.j) r1
            if (r1 != 0) goto Lb1
            if (r0 == 0) goto La4
            M6.c r1 = M6.c.TERMINATED
            r0.h(r1)
        La4:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = M6.d.f3279Y
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = M6.d.f3280Z
            r0.set(r8, r1)
        Lb0:
            return
        Lb1:
            r1.run()     // Catch: java.lang.Throwable -> Lb5
            goto L81
        Lb5:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.d.close():void");
    }

    public final boolean d(long j) {
        int i7 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = this.f3284a;
        if (i7 < i8) {
            int a7 = a();
            if (a7 == 1 && i8 > 1) {
                a();
            }
            if (a7 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, l.f3302g, false);
    }

    public final boolean g() {
        w wVar;
        int i7;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3279Y;
            long j = atomicLongFieldUpdater.get(this);
            b bVar = (b) this.f3283X.b((int) (2097151 & j));
            if (bVar == null) {
                bVar = null;
            } else {
                long j8 = (2097152 + j) & (-2097152);
                Object c8 = bVar.c();
                while (true) {
                    wVar = f3282f0;
                    if (c8 == wVar) {
                        i7 = -1;
                        break;
                    } else if (c8 == null) {
                        i7 = 0;
                        break;
                    } else {
                        b bVar2 = (b) c8;
                        i7 = bVar2.b();
                        if (i7 != 0) {
                            break;
                        }
                        c8 = bVar2.c();
                    }
                }
                if (i7 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j8 | i7)) {
                    bVar.g(wVar);
                }
            }
            if (bVar == null) {
                return false;
            }
            if (b.f3271Z.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i7;
        ArrayList arrayList = new ArrayList();
        s sVar = this.f3283X;
        int a7 = sVar.a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < a7; i13++) {
            b bVar = (b) sVar.b(i13);
            if (bVar != null) {
                n nVar = bVar.f3274a;
                nVar.getClass();
                if (n.f3305b.get(nVar) != null) {
                    i7 = (n.f3306c.get(nVar) - n.f3307d.get(nVar)) + 1;
                } else {
                    i7 = n.f3306c.get(nVar) - n.f3307d.get(nVar);
                }
                int i14 = a.f3270a[bVar.f3276c.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                if (i14 == 5) {
                                    i12++;
                                }
                            } else {
                                i11++;
                                if (i7 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i7);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i8++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i7);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        i9++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i10++;
                }
            }
        }
        long j = f3280Z.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3287d);
        sb4.append('@');
        sb4.append(H.j(this));
        sb4.append("[Pool Size {core = ");
        int i15 = this.f3284a;
        sb4.append(i15);
        sb4.append(", max = ");
        sb4.append(this.f3285b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i8);
        sb4.append(", blocking = ");
        sb4.append(i9);
        sb4.append(", parked = ");
        sb4.append(i10);
        sb4.append(", dormant = ");
        sb4.append(i11);
        sb4.append(", terminated = ");
        sb4.append(i12);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f3288e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i15 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
