package H6;

import F6.C0100m;
import F6.C0110x;
import F6.H;
import F6.InterfaceC0098l;
import F6.L0;
import K6.AbstractC0208a;
import K6.u;
import K6.w;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o6.EnumC1565a;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public class c implements g {
    private volatile Object _closeCause;

    /* renamed from: a  reason: collision with root package name */
    public final int f2045a;

    /* renamed from: b  reason: collision with root package name */
    public final w6.l f2046b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2040c = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2041d = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2042e = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");
    public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: X  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2037X = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* renamed from: Y  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2038Y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* renamed from: Z  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2039Z = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* renamed from: e0  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2043e0 = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* renamed from: f0  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2044f0 = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");

    public c(int i7, w6.l lVar) {
        long j;
        this.f2045a = i7;
        this.f2046b = lVar;
        if (i7 >= 0) {
            k kVar = e.f2048a;
            if (i7 != 0) {
                if (i7 != Integer.MAX_VALUE) {
                    j = i7;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd = j;
            this.completedExpandBuffersAndPauseFlag = f2042e.get(this);
            k kVar2 = new k(0L, null, this, 3);
            this.sendSegment = kVar2;
            this.receiveSegment = kVar2;
            if (t()) {
                kVar2 = e.f2048a;
                kotlin.jvm.internal.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = kVar2;
            this._closeCause = e.f2064s;
            return;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.f("Invalid channel capacity: ", i7, ", should be >=0").toString());
    }

    public static final k a(c cVar, long j, k kVar) {
        Object b5;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        long j9;
        cVar.getClass();
        k kVar2 = e.f2048a;
        d dVar = d.f2047a;
        loop0: while (true) {
            b5 = AbstractC0208a.b(kVar, j, dVar);
            if (!AbstractC0208a.e(b5)) {
                u c8 = AbstractC0208a.c(b5);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2037X;
                    u uVar = (u) atomicReferenceFieldUpdater.get(cVar);
                    if (uVar.f2804c >= c8.f2804c) {
                        break loop0;
                    } else if (!c8.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, uVar, c8)) {
                            if (atomicReferenceFieldUpdater.get(cVar) != uVar) {
                                if (c8.e()) {
                                    c8.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean e7 = AbstractC0208a.e(b5);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2041d;
        if (e7) {
            cVar.r();
            if (kVar.f2804c * e.f2049b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) AbstractC0208a.c(b5);
        long j10 = kVar3.f2804c;
        if (j10 > j) {
            long j11 = e.f2049b * j10;
            do {
                atomicLongFieldUpdater = f2040c;
                j8 = atomicLongFieldUpdater.get(cVar);
                j9 = 1152921504606846975L & j8;
                if (j9 >= j11) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j8, j9 + (((int) (j8 >> 60)) << 60)));
            if (j10 * e.f2049b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar3.a();
            return null;
        }
        return kVar3;
    }

    public static final void b(c cVar, Object obj, C0100m c0100m) {
        C0110x a7;
        w6.l lVar = cVar.f2046b;
        if (lVar != null && (a7 = AbstractC0208a.a(lVar, obj, null)) != null) {
            H.l(c0100m.f1285e, a7);
        }
        c0100m.resumeWith(org.slf4j.helpers.i.j(cVar.n()));
    }

    public static final int d(c cVar, k kVar, int i7, Object obj, long j, Object obj2, boolean z7) {
        cVar.getClass();
        kVar.m(i7, obj);
        if (z7) {
            return cVar.A(kVar, i7, obj, j, obj2, z7);
        }
        Object k2 = kVar.k(i7);
        if (k2 == null) {
            if (cVar.f(j)) {
                if (kVar.j(i7, null, e.f2051d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (kVar.j(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof L0) {
            kVar.m(i7, null);
            if (cVar.x(k2, obj)) {
                kVar.n(i7, e.f2055i);
                return 0;
            }
            w wVar = e.f2056k;
            if (kVar.f.getAndSet((i7 * 2) + 1, wVar) != wVar) {
                kVar.l(i7, true);
            }
            return 5;
        }
        return cVar.A(kVar, i7, obj, j, obj2, z7);
    }

    public static void p(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean y(Object obj) {
        if (obj instanceof InterfaceC0098l) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0098l) obj, l6.j.f13876a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final int A(k kVar, int i7, Object obj, long j, Object obj2, boolean z7) {
        while (true) {
            Object k2 = kVar.k(i7);
            if (k2 == null) {
                if (f(j) && !z7) {
                    if (kVar.j(i7, null, e.f2051d)) {
                        return 1;
                    }
                } else if (z7) {
                    if (kVar.j(i7, null, e.j)) {
                        kVar.h();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (kVar.j(i7, null, obj2)) {
                        return 2;
                    }
                }
            } else if (k2 == e.f2052e) {
                if (kVar.j(i7, k2, e.f2051d)) {
                    return 1;
                }
            } else {
                w wVar = e.f2056k;
                if (k2 == wVar) {
                    kVar.m(i7, null);
                    return 5;
                } else if (k2 == e.f2054h) {
                    kVar.m(i7, null);
                    return 5;
                } else if (k2 == e.f2057l) {
                    kVar.m(i7, null);
                    r();
                    return 4;
                } else {
                    kVar.m(i7, null);
                    if (k2 instanceof s) {
                        k2 = ((s) k2).f2076a;
                    }
                    if (x(k2, obj)) {
                        kVar.n(i7, e.f2055i);
                        return 0;
                    } else if (kVar.f.getAndSet((i7 * 2) + 1, wVar) == wVar) {
                        return 5;
                    } else {
                        kVar.l(i7, true);
                        return 5;
                    }
                }
            }
        }
    }

    public final void B(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        boolean z7;
        long j9;
        if (t()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f2042e;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i7 = e.f2050c;
        int i8 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
            if (i8 < i7) {
                long j10 = atomicLongFieldUpdater.get(this);
                if (j10 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j10 == atomicLongFieldUpdater.get(this)) {
                    return;
                }
                i8++;
            } else {
                do {
                    j8 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j8, 4611686018427387904L + (j8 & 4611686018427387903L)));
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(this);
                    long j12 = atomicLongFieldUpdater2.get(this);
                    long j13 = j12 & 4611686018427387903L;
                    if ((j12 & 4611686018427387904L) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (j11 == j13 && j11 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z7) {
                        atomicLongFieldUpdater2.compareAndSet(this, j12, j13 + 4611686018427387904L);
                    }
                }
                do {
                    j9 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j9, j9 & 4611686018427387903L));
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01bc, code lost:
        r1.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
        b(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0142, code lost:
        if (r23 >= r5.get(r26)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0144, code lost:
        r21.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
        b(r26, r27, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    @Override // H6.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.Object r27, n6.d r28) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.c.c(java.lang.Object, n6.d):java.lang.Object");
    }

    @Override // H6.q
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(true, cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return r1;
     */
    @Override // H6.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.c.e(java.lang.Object):java.lang.Object");
    }

    public final boolean f(long j) {
        if (j >= f2042e.get(this) && j >= f2041d.get(this) + this.f2045a) {
            return false;
        }
        return true;
    }

    public final boolean g(boolean z7, Throwable th) {
        boolean z8;
        long j;
        long j8;
        long j9;
        Object obj;
        w wVar;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2040c;
        if (z7) {
            do {
                j11 = atomicLongFieldUpdater.get(this);
                if (((int) (j11 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f2048a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j11, (1 << 60) + (j11 & 1152921504606846975L)));
        }
        w wVar2 = e.f2064s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2043e0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, wVar2, th)) {
                z8 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != wVar2) {
                z8 = false;
                break;
            }
        }
        if (z7) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, (3 << 60) + (j10 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j >> 60);
                if (i7 != 0) {
                    if (i7 != 1) {
                        break;
                    }
                    j8 = j & 1152921504606846975L;
                    j9 = 3;
                } else {
                    j8 = j & 1152921504606846975L;
                    j9 = 2;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, (j9 << 60) + j8));
        }
        r();
        if (z8) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2044f0;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    wVar = e.f2062q;
                } else {
                    wVar = e.f2063r;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, wVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                kotlin.jvm.internal.u.b(1, obj);
                ((w6.l) obj).invoke(l());
            }
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        r1 = (H6.k) ((K6.d) K6.d.f2773b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H6.k h(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.c.h(long):H6.k");
    }

    public final void i(long j) {
        C0110x a7;
        k kVar = (k) f2038Y.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2041d;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f2045a + j8, f2042e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, j8 + 1)) {
                long j9 = e.f2049b;
                long j10 = j8 / j9;
                int i7 = (int) (j8 % j9);
                if (kVar.f2804c != j10) {
                    k k2 = k(j10, kVar);
                    if (k2 == null) {
                        continue;
                    } else {
                        kVar = k2;
                    }
                }
                Object z7 = z(kVar, i7, j8, null);
                if (z7 == e.f2060o) {
                    if (j8 < o()) {
                        kVar.a();
                    }
                } else {
                    kVar.a();
                    w6.l lVar = this.f2046b;
                    if (lVar != null && (a7 = AbstractC0208a.a(lVar, z7, null)) != null) {
                        throw a7;
                    }
                }
            }
        }
    }

    public final void j() {
        Object b5;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2039Z;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f2042e.getAndIncrement(this);
            long j = andIncrement / e.f2049b;
            if (o() <= andIncrement) {
                if (kVar.f2804c < j && kVar.b() != null) {
                    u(j, kVar);
                }
                p(this);
                return;
            }
            if (kVar.f2804c != j) {
                d dVar = d.f2047a;
                while (true) {
                    b5 = AbstractC0208a.b(kVar, j, dVar);
                    if (!AbstractC0208a.e(b5)) {
                        u c8 = AbstractC0208a.c(b5);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f2804c >= c8.f2804c) {
                                break;
                            } else if (!c8.i()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c8)) {
                                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                        if (c8.e()) {
                                            c8.d();
                                        }
                                    }
                                }
                                if (uVar.e()) {
                                    uVar.d();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (AbstractC0208a.e(b5)) {
                    r();
                    u(j, kVar);
                    p(this);
                } else {
                    k kVar3 = (k) AbstractC0208a.c(b5);
                    long j8 = kVar3.f2804c;
                    if (j8 > j) {
                        long j9 = j8 * e.f2049b;
                        if (f2042e.compareAndSet(this, andIncrement + 1, j9)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
                            if ((atomicLongFieldUpdater.addAndGet(this, j9 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            p(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i7 = (int) (andIncrement % e.f2049b);
            Object k2 = kVar.k(i7);
            boolean z7 = k2 instanceof L0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2041d;
            if (!z7 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(i7, k2, e.f2053g)) {
                while (true) {
                    Object k8 = kVar.k(i7);
                    if (k8 instanceof L0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (kVar.j(i7, k8, new s((L0) k8))) {
                                break loop0;
                            }
                        } else if (kVar.j(i7, k8, e.f2053g)) {
                            if (y(k8)) {
                                kVar.n(i7, e.f2051d);
                                break;
                            } else {
                                kVar.n(i7, e.j);
                                kVar.h();
                            }
                        }
                    } else if (k8 != e.j) {
                        if (k8 == null) {
                            if (kVar.j(i7, k8, e.f2052e)) {
                                break loop0;
                            }
                        } else if (k8 == e.f2051d || k8 == e.f2054h || k8 == e.f2055i || k8 == e.f2056k || k8 == e.f2057l) {
                            break loop0;
                        } else if (k8 != e.f) {
                            throw new IllegalStateException(("Unexpected cell state: " + k8).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (y(k2)) {
                kVar.n(i7, e.f2051d);
                break;
            } else {
                kVar.n(i7, e.j);
                kVar.h();
                p(this);
            }
        }
        p(this);
    }

    public final k k(long j, k kVar) {
        Object b5;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        k kVar2 = e.f2048a;
        d dVar = d.f2047a;
        loop0: while (true) {
            b5 = AbstractC0208a.b(kVar, j, dVar);
            if (!AbstractC0208a.e(b5)) {
                u c8 = AbstractC0208a.c(b5);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2038Y;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f2804c >= c8.f2804c) {
                        break loop0;
                    } else if (!c8.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c8)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (c8.e()) {
                                    c8.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0208a.e(b5)) {
            r();
            if (kVar.f2804c * e.f2049b >= o()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) AbstractC0208a.c(b5);
        boolean t7 = t();
        long j9 = kVar3.f2804c;
        if (!t7 && j <= f2042e.get(this) / e.f2049b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2039Z;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f2804c >= j9 || !kVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (kVar3.e()) {
                            kVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j9 > j) {
            long j10 = e.f2049b * j9;
            do {
                atomicLongFieldUpdater = f2041d;
                j8 = atomicLongFieldUpdater.get(this);
                if (j8 >= j10) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j10));
            if (j9 * e.f2049b >= o()) {
                return null;
            }
            kVar3.a();
            return null;
        }
        return kVar3;
    }

    public final Throwable l() {
        return (Throwable) f2043e0.get(this);
    }

    public final Throwable m() {
        Throwable l8 = l();
        if (l8 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return l8;
    }

    public final Throwable n() {
        Throwable l8 = l();
        if (l8 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return l8;
    }

    public final long o() {
        return f2040c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
        r0 = (H6.k) ((K6.d) K6.d.f2773b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.c.q(long, boolean):boolean");
    }

    public final boolean r() {
        return q(f2040c.get(this), false);
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j = f2042e.get(this);
        if (j != 0 && j != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x019a, code lost:
        r3 = (H6.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a1, code lost:
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019a A[EDGE_INSN: B:97:0x019a->B:75:0x019a ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.c.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(long r5, H6.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f2804c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            K6.d r0 = r7.b()
            H6.k r0 = (H6.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            K6.d r5 = r7.b()
            H6.k r5 = (H6.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = H6.c.f2039Z
            java.lang.Object r6 = r5.get(r4)
            K6.u r6 = (K6.u) r6
            long r0 = r6.f2804c
            long r2 = r7.f2804c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.c.u(long, H6.k):void");
    }

    public final Object v(Object obj, n6.d dVar) {
        C0110x a7;
        C0100m c0100m = new C0100m(1, AbstractC1740d.q(dVar));
        c0100m.s();
        w6.l lVar = this.f2046b;
        if (lVar != null && (a7 = AbstractC0208a.a(lVar, obj, null)) != null) {
            j3.f.a(a7, n());
            c0100m.resumeWith(org.slf4j.helpers.i.j(a7));
        } else {
            c0100m.resumeWith(org.slf4j.helpers.i.j(n()));
        }
        Object r7 = c0100m.r();
        if (r7 == EnumC1565a.COROUTINE_SUSPENDED) {
            return r7;
        }
        return l6.j.f13876a;
    }

    public final void w(L0 l02, boolean z7) {
        Throwable n7;
        if (l02 instanceof InterfaceC0098l) {
            n6.d dVar = (n6.d) l02;
            if (z7) {
                n7 = m();
            } else {
                n7 = n();
            }
            dVar.resumeWith(org.slf4j.helpers.i.j(n7));
        } else if (l02 instanceof b) {
            b bVar = (b) l02;
            C0100m c0100m = bVar.f2035b;
            kotlin.jvm.internal.j.b(c0100m);
            bVar.f2035b = null;
            bVar.f2034a = e.f2057l;
            Throwable l8 = bVar.f2036c.l();
            if (l8 == null) {
                c0100m.resumeWith(Boolean.FALSE);
            } else {
                c0100m.resumeWith(org.slf4j.helpers.i.j(l8));
            }
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + l02).toString());
        }
    }

    public final boolean x(Object obj, Object obj2) {
        K6.p pVar = null;
        if (obj instanceof b) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            b bVar = (b) obj;
            C0100m c0100m = bVar.f2035b;
            kotlin.jvm.internal.j.b(c0100m);
            bVar.f2035b = null;
            bVar.f2034a = obj2;
            Boolean bool = Boolean.TRUE;
            w6.l lVar = bVar.f2036c.f2046b;
            if (lVar != null) {
                pVar = new K6.p(lVar, obj2, c0100m.f1285e);
            }
            return e.a(c0100m, bool, pVar);
        } else if (obj instanceof InterfaceC0098l) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0098l interfaceC0098l = (InterfaceC0098l) obj;
            w6.l lVar2 = this.f2046b;
            if (lVar2 != null) {
                pVar = new K6.p(lVar2, obj2, interfaceC0098l.getContext());
            }
            return e.a(interfaceC0098l, obj2, pVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final Object z(k kVar, int i7, long j, Object obj) {
        Object k2 = kVar.k(i7);
        AtomicReferenceArray atomicReferenceArray = kVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2040c;
        if (k2 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f2059n;
                }
                if (kVar.j(i7, k2, obj)) {
                    j();
                    return e.f2058m;
                }
            }
        } else if (k2 == e.f2051d && kVar.j(i7, k2, e.f2055i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            kVar.m(i7, null);
            return obj2;
        }
        while (true) {
            Object k8 = kVar.k(i7);
            if (k8 != null && k8 != e.f2052e) {
                if (k8 == e.f2051d) {
                    if (kVar.j(i7, k8, e.f2055i)) {
                        j();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        kVar.m(i7, null);
                        return obj3;
                    }
                } else {
                    w wVar = e.j;
                    if (k8 == wVar) {
                        return e.f2060o;
                    }
                    if (k8 == e.f2054h) {
                        return e.f2060o;
                    }
                    if (k8 == e.f2057l) {
                        j();
                        return e.f2060o;
                    } else if (k8 != e.f2053g && kVar.j(i7, k8, e.f)) {
                        boolean z7 = k8 instanceof s;
                        if (z7) {
                            k8 = ((s) k8).f2076a;
                        }
                        if (y(k8)) {
                            kVar.n(i7, e.f2055i);
                            j();
                            Object obj4 = atomicReferenceArray.get(i7 * 2);
                            kVar.m(i7, null);
                            return obj4;
                        }
                        kVar.n(i7, wVar);
                        kVar.h();
                        if (z7) {
                            j();
                        }
                        return e.f2060o;
                    }
                }
            } else if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kVar.j(i7, k8, e.f2054h)) {
                    j();
                    return e.f2060o;
                }
            } else if (obj == null) {
                return e.f2059n;
            } else {
                if (kVar.j(i7, k8, obj)) {
                    j();
                    return e.f2058m;
                }
            }
        }
    }
}
