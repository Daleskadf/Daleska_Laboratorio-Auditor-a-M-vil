package c6;

import D.C0054d;
import a6.AbstractC0482k;
import a6.C0474c;
import a6.C0476e;
import a6.C0483l;
import a6.C0489s;
import a6.C0490t;
import a6.C0492v;
import a6.InterfaceC0484m;
import b3.C0585f;
import g6.C1012a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class N0 implements InterfaceC0711v {

    /* renamed from: E  reason: collision with root package name */
    public static final a6.Z f8514E;

    /* renamed from: F  reason: collision with root package name */
    public static final a6.Z f8515F;

    /* renamed from: G  reason: collision with root package name */
    public static final a6.o0 f8516G;

    /* renamed from: H  reason: collision with root package name */
    public static final Random f8517H;

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Q0.A f8518A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ C0476e f8519B;

    /* renamed from: C  reason: collision with root package name */
    public final /* synthetic */ C0489s f8520C;

    /* renamed from: D  reason: collision with root package name */
    public final /* synthetic */ C0644E f8521D;

    /* renamed from: a  reason: collision with root package name */
    public final Q0.A f8522a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f8523b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.u0 f8524c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f8525d;

    /* renamed from: e  reason: collision with root package name */
    public final a6.e0 f8526e;
    public final a2 f;

    /* renamed from: g  reason: collision with root package name */
    public final C0680k0 f8527g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8528h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f8529i;
    public final C0585f j;

    /* renamed from: k  reason: collision with root package name */
    public final long f8530k;

    /* renamed from: l  reason: collision with root package name */
    public final long f8531l;

    /* renamed from: m  reason: collision with root package name */
    public final Z1 f8532m;

    /* renamed from: n  reason: collision with root package name */
    public final C0692o0 f8533n;

    /* renamed from: o  reason: collision with root package name */
    public volatile V1 f8534o;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicBoolean f8535p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicInteger f8536q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicInteger f8537r;

    /* renamed from: s  reason: collision with root package name */
    public R1.j f8538s;

    /* renamed from: t  reason: collision with root package name */
    public long f8539t;

    /* renamed from: u  reason: collision with root package name */
    public InterfaceC0717x f8540u;

    /* renamed from: v  reason: collision with root package name */
    public C0054d f8541v;

    /* renamed from: w  reason: collision with root package name */
    public C0054d f8542w;

    /* renamed from: x  reason: collision with root package name */
    public long f8543x;

    /* renamed from: y  reason: collision with root package name */
    public a6.o0 f8544y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8545z;

    static {
        C0483l c0483l = a6.e0.f7140d;
        BitSet bitSet = a6.b0.f7117d;
        f8514E = new a6.Z("grpc-previous-rpc-attempts", c0483l);
        f8515F = new a6.Z("grpc-retry-pushback-ms", c0483l);
        f8516G = a6.o0.f.g("Stream thrown away because RetriableStream committed");
        f8517H = new Random();
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public N0(C0644E c0644e, Q0.A a7, a6.e0 e0Var, C0476e c0476e, a2 a2Var, C0680k0 c0680k0, C0489s c0489s) {
        boolean z7;
        this.f8521D = c0644e;
        this.f8518A = a7;
        this.f8519B = c0476e;
        this.f8520C = c0489s;
        Z0 z02 = (Z0) c0644e.f8442b;
        C0585f c0585f = z02.f8697Y;
        long j = z02.f8698Z;
        long j8 = z02.f8699a0;
        Executor executor = c0476e.f7133b;
        executor = executor == null ? z02.f8709k : executor;
        ScheduledExecutorService scheduledExecutorService = z02.f8708i.f8874a.f10388d;
        Z1 z12 = (Z1) c0644e.f8441a;
        this.f8524c = new a6.u0(new Object());
        this.f8529i = new Object();
        this.f8533n = new C0692o0(0);
        this.f8534o = new V1(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.f8535p = new AtomicBoolean();
        this.f8536q = new AtomicInteger();
        this.f8537r = new AtomicInteger();
        this.f8522a = a7;
        this.j = c0585f;
        this.f8530k = j;
        this.f8531l = j8;
        this.f8523b = executor;
        this.f8525d = scheduledExecutorService;
        this.f8526e = e0Var;
        this.f = a2Var;
        if (a2Var != null) {
            this.f8543x = a2Var.f8767b;
        }
        this.f8527g = c0680k0;
        if (a2Var != null && c0680k0 != null) {
            z7 = false;
        } else {
            z7 = true;
        }
        G.i.f("Should not provide both retryPolicy and hedgingPolicy", z7);
        this.f8528h = c0680k0 != null;
        this.f8532m = z12;
    }

    public static void n(N0 n02, Integer num) {
        n02.getClass();
        if (num != null) {
            if (num.intValue() < 0) {
                n02.s();
                return;
            }
            synchronized (n02.f8529i) {
                try {
                    C0054d c0054d = n02.f8542w;
                    if (c0054d != null) {
                        c0054d.f688a = true;
                        ScheduledFuture scheduledFuture = (ScheduledFuture) c0054d.f689b;
                        C0054d c0054d2 = new C0054d(n02.f8529i);
                        n02.f8542w = c0054d2;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        c0054d2.q(n02.f8525d.schedule(new RunnableC0646G(21, n02, c0054d2), num.intValue(), TimeUnit.MILLISECONDS));
                    }
                } finally {
                }
            }
        }
    }

    @Override // c6.p2
    public final void a(InterfaceC0484m interfaceC0484m) {
        q(new M1(interfaceC0484m, 0));
    }

    @Override // c6.p2
    public final boolean b() {
        for (Y1 y12 : this.f8534o.f8610c) {
            if (y12.f8657a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // c6.InterfaceC0711v
    public final void c(int i7) {
        q(new O1(i7, 1));
    }

    @Override // c6.InterfaceC0711v
    public final void d(C0692o0 c0692o0) {
        V1 v12;
        synchronized (this.f8529i) {
            c0692o0.f(this.f8533n, "closed");
            v12 = this.f8534o;
        }
        if (v12.f != null) {
            C0692o0 c0692o02 = new C0692o0(0);
            v12.f.f8657a.d(c0692o02);
            c0692o0.f(c0692o02, "committed");
            return;
        }
        C0692o0 c0692o03 = new C0692o0(0);
        for (Y1 y12 : v12.f8610c) {
            C0692o0 c0692o04 = new C0692o0(0);
            y12.f8657a.d(c0692o04);
            c0692o03.f8937b.add(String.valueOf(c0692o04));
        }
        c0692o0.f(c0692o03, "open");
    }

    @Override // c6.p2
    public final void e(int i7) {
        V1 v12 = this.f8534o;
        if (v12.f8608a) {
            v12.f.f8657a.e(i7);
        } else {
            q(new O1(i7, 2));
        }
    }

    @Override // c6.InterfaceC0711v
    public final void f(int i7) {
        q(new O1(i7, 0));
    }

    @Override // c6.p2
    public final void flush() {
        V1 v12 = this.f8534o;
        if (v12.f8608a) {
            v12.f.f8657a.flush();
        } else {
            q(new N1(0));
        }
    }

    @Override // c6.p2
    public final void g(C1012a c1012a) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // c6.InterfaceC0711v
    public final void h(C0490t c0490t) {
        q(new M1(c0490t, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [c6.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [a6.e0, java.lang.Object] */
    @Override // c6.InterfaceC0711v
    public final void i(a6.o0 o0Var) {
        Y1 y12;
        Y1 y13 = new Y1(0);
        y13.f8657a = new Object();
        L1 o7 = o(y13);
        if (o7 != null) {
            synchronized (this.f8529i) {
                this.f8534o = this.f8534o.e(y13);
            }
            o7.run();
            v(o0Var, EnumC0714w.PROCESSED, new Object());
            return;
        }
        synchronized (this.f8529i) {
            try {
                if (this.f8534o.f8610c.contains(this.f8534o.f)) {
                    y12 = this.f8534o.f;
                } else {
                    this.f8544y = o0Var;
                    y12 = null;
                }
                V1 v12 = this.f8534o;
                this.f8534o = new V1(v12.f8609b, v12.f8610c, v12.f8611d, v12.f, true, v12.f8608a, v12.f8614h, v12.f8612e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (y12 != null) {
            y12.f8657a.i(o0Var);
        }
    }

    @Override // c6.InterfaceC0711v
    public final void j(C0492v c0492v) {
        q(new M1(c0492v, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r7 != false) goto L27;
     */
    @Override // c6.InterfaceC0711v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(c6.InterfaceC0717x r7) {
        /*
            r6 = this;
            r6.f8540u = r7
            a6.o0 r7 = r6.u()
            if (r7 == 0) goto Lc
            r6.i(r7)
            return
        Lc:
            java.lang.Object r7 = r6.f8529i
            monitor-enter(r7)
            c6.V1 r0 = r6.f8534o     // Catch: java.lang.Throwable -> L79
            java.util.List r0 = r0.f8609b     // Catch: java.lang.Throwable -> L79
            c6.U1 r1 = new c6.U1     // Catch: java.lang.Throwable -> L79
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L79
            r0.add(r1)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L79
            r7 = 0
            c6.Y1 r0 = r6.p(r7, r7)
            if (r0 != 0) goto L24
            return
        L24:
            boolean r1 = r6.f8528h
            if (r1 == 0) goto L75
            java.lang.Object r1 = r6.f8529i
            monitor-enter(r1)
            c6.V1 r2 = r6.f8534o     // Catch: java.lang.Throwable -> L56
            c6.V1 r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L56
            r6.f8534o = r2     // Catch: java.lang.Throwable -> L56
            c6.V1 r2 = r6.f8534o     // Catch: java.lang.Throwable -> L56
            boolean r2 = r6.t(r2)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            c6.Z1 r2 = r6.f8532m     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L4c
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f8728d     // Catch: java.lang.Throwable -> L56
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L56
            int r2 = r2.f8726b     // Catch: java.lang.Throwable -> L56
            if (r3 <= r2) goto L4a
            r7 = 1
        L4a:
            if (r7 == 0) goto L58
        L4c:
            D.d r7 = new D.d     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r6.f8529i     // Catch: java.lang.Throwable -> L56
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L56
            r6.f8542w = r7     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r7 = move-exception
            goto L73
        L58:
            r7 = 0
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L75
            java.util.concurrent.ScheduledExecutorService r1 = r6.f8525d
            c6.G r2 = new c6.G
            r3 = 21
            r2.<init>(r3, r6, r7)
            c6.k0 r3 = r6.f8527g
            long r3 = r3.f8877b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)
            r7.q(r1)
            goto L75
        L73:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r7
        L75:
            r6.r(r0)
            return
        L79:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L79
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.N0.k(c6.x):void");
    }

    @Override // c6.p2
    public final void l() {
        q(new N1(2));
    }

    @Override // c6.InterfaceC0711v
    public final void m() {
        q(new N1(1));
    }

    public final L1 o(Y1 y12) {
        boolean z7;
        Collection emptyList;
        boolean z8;
        List list;
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        synchronized (this.f8529i) {
            try {
                if (this.f8534o.f != null) {
                    return null;
                }
                Collection collection = this.f8534o.f8610c;
                V1 v12 = this.f8534o;
                if (v12.f == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                G.i.o("Already committed", z7);
                if (v12.f8610c.contains(y12)) {
                    list = null;
                    emptyList = Collections.singleton(y12);
                    z8 = true;
                } else {
                    emptyList = Collections.emptyList();
                    z8 = false;
                    list = v12.f8609b;
                }
                this.f8534o = new V1(list, emptyList, v12.f8611d, y12, v12.f8613g, z8, v12.f8614h, v12.f8612e);
                ((AtomicLong) this.j.f8171b).addAndGet(-this.f8539t);
                C0054d c0054d = this.f8541v;
                if (c0054d != null) {
                    c0054d.f688a = true;
                    this.f8541v = null;
                    scheduledFuture = (ScheduledFuture) c0054d.f689b;
                } else {
                    scheduledFuture = null;
                }
                C0054d c0054d2 = this.f8542w;
                if (c0054d2 != null) {
                    c0054d2.f688a = true;
                    scheduledFuture2 = (ScheduledFuture) c0054d2.f689b;
                    this.f8542w = null;
                } else {
                    scheduledFuture2 = null;
                }
                return new L1(this, collection, y12, scheduledFuture, scheduledFuture2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [a6.e0, java.lang.Object] */
    public final Y1 p(int i7, boolean z7) {
        AtomicInteger atomicInteger;
        int i8;
        do {
            atomicInteger = this.f8537r;
            i8 = atomicInteger.get();
            if (i8 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i8, i8 + 1));
        Y1 y12 = new Y1(i7);
        Q1 q1 = new Q1(new S1(this, y12));
        ?? obj = new Object();
        obj.d(this.f8526e);
        if (i7 > 0) {
            obj.f(f8514E, String.valueOf(i7));
        }
        C0476e c0476e = this.f8519B;
        c0476e.getClass();
        List list = c0476e.f7136e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(q1);
        C0474c b5 = C0476e.b(c0476e);
        b5.f7125e = DesugarCollections.unmodifiableList(arrayList);
        C0476e c0476e2 = new C0476e(b5);
        AbstractC0482k[] c8 = AbstractC0671h0.c(c0476e2, obj, i7, z7);
        Q0.A a7 = this.f8518A;
        InterfaceC0720y a8 = this.f8521D.a(new D1(a7, obj, c0476e2));
        C0489s c0489s = this.f8520C;
        C0489s a9 = c0489s.a();
        try {
            InterfaceC0711v b7 = a8.b(a7, obj, c0476e2, c8);
            c0489s.c(a9);
            y12.f8657a = b7;
            return y12;
        } catch (Throwable th) {
            c0489s.c(a9);
            throw th;
        }
    }

    public final void q(R1 r12) {
        Collection<Y1> collection;
        synchronized (this.f8529i) {
            try {
                if (!this.f8534o.f8608a) {
                    this.f8534o.f8609b.add(r12);
                }
                collection = this.f8534o.f8610c;
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Y1 y12 : collection) {
            r12.a(y12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
        r8.f8524c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
        if (r2 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
        r9.f8657a.k(new c6.s2(4, r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
        r0 = r9.f8657a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
        if (r8.f8534o.f != r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
        r9 = r8.f8544y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
        r9 = c6.N0.f8516G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
        r0.i(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
        if (r0.hasNext() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
        r4 = (c6.R1) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
        if ((r4 instanceof c6.U1) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
        r4 = r8.f8534o;
        r5 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
        if (r5 == r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
        if (r4.f8613g == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(c6.Y1 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f8529i
            monitor-enter(r4)
            c6.V1 r5 = r8.f8534o     // Catch: java.lang.Throwable -> L11
            c6.Y1 r6 = r5.f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L11:
            r9 = move-exception
            goto Lb3
        L14:
            boolean r6 = r5.f8613g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L1a:
            java.util.List r6 = r5.f8609b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5e
            c6.V1 r0 = r5.e(r9)     // Catch: java.lang.Throwable -> L11
            r8.f8534o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.b()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            G.c r1 = new G.c     // Catch: java.lang.Throwable -> L11
            r0 = 18
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L38:
            if (r1 == 0) goto L40
            a6.u0 r9 = r8.f8524c
            r9.execute(r1)
            return
        L40:
            if (r2 != 0) goto L4d
            c6.v r0 = r9.f8657a
            c6.s2 r1 = new c6.s2
            r2 = 4
            r1.<init>(r2, r8, r9)
            r0.k(r1)
        L4d:
            c6.v r0 = r9.f8657a
            c6.V1 r1 = r8.f8534o
            c6.Y1 r1 = r1.f
            if (r1 != r9) goto L58
            a6.o0 r9 = r8.f8544y
            goto L5a
        L58:
            a6.o0 r9 = c6.N0.f8516G
        L5a:
            r0.i(r9)
            return
        L5e:
            boolean r6 = r9.f8658b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L64
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L64:
            int r6 = r0 + 128
            java.util.List r7 = r5.f8609b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f8609b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L8a
        L7e:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f8609b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L8a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lb0
            java.lang.Object r4 = r0.next()
            c6.R1 r4 = (c6.R1) r4
            r4.a(r9)
            boolean r4 = r4 instanceof c6.U1
            if (r4 == 0) goto La3
            r2 = 1
        La3:
            c6.V1 r4 = r8.f8534o
            c6.Y1 r5 = r4.f
            if (r5 == 0) goto Lac
            if (r5 == r9) goto Lac
            goto Lb0
        Lac:
            boolean r4 = r4.f8613g
            if (r4 == 0) goto L8f
        Lb0:
            r0 = r6
            goto L4
        Lb3:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.N0.r(c6.Y1):void");
    }

    public final void s() {
        ScheduledFuture scheduledFuture;
        synchronized (this.f8529i) {
            try {
                C0054d c0054d = this.f8542w;
                scheduledFuture = null;
                if (c0054d != null) {
                    c0054d.f688a = true;
                    this.f8542w = null;
                    scheduledFuture = (ScheduledFuture) c0054d.f689b;
                }
                V1 v12 = this.f8534o;
                if (!v12.f8614h) {
                    v12 = new V1(v12.f8609b, v12.f8610c, v12.f8611d, v12.f, v12.f8613g, v12.f8608a, true, v12.f8612e);
                }
                this.f8534o = v12;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final boolean t(V1 v12) {
        if (v12.f == null) {
            if (v12.f8612e < this.f8527g.f8876a && !v12.f8614h) {
                return true;
            }
        }
        return false;
    }

    public final a6.o0 u() {
        E.e eVar = ((Z0) this.f8521D.f8442b).f8681I;
        synchronized (eVar.f920b) {
            try {
                a6.o0 o0Var = (a6.o0) eVar.f922d;
                if (o0Var == null) {
                    ((HashSet) eVar.f921c).add(this);
                    return null;
                }
                return o0Var;
            } finally {
            }
        }
    }

    public final void v(a6.o0 o0Var, EnumC0714w enumC0714w, a6.e0 e0Var) {
        this.f8538s = new R1.j(o0Var, enumC0714w, e0Var, 13);
        if (this.f8537r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f8524c.execute(new RunnableC0649a(this, o0Var, enumC0714w, e0Var, 2));
        }
    }

    public final void w(com.google.protobuf.J j) {
        V1 v12 = this.f8534o;
        if (v12.f8608a) {
            v12.f.f8657a.g(this.f8522a.g(j));
        } else {
            q(new P1(this, j));
        }
    }
}
