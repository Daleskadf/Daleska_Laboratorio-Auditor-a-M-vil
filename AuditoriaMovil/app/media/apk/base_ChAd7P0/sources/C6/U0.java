package c6;

import D.AbstractC0055e;
import a6.AbstractC0471A;
import a6.AbstractC0479h;
import a6.AbstractC0482k;
import a6.C0475d;
import a6.C0476e;
import a6.C0489s;
import a6.C0490t;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class U0 extends AbstractC0479h {

    /* renamed from: o  reason: collision with root package name */
    public static final C0648I f8591o;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledFuture f8592a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f8593b;

    /* renamed from: c  reason: collision with root package name */
    public final C0489s f8594c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f8595d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC0471A f8596e;
    public AbstractC0479h f;

    /* renamed from: g  reason: collision with root package name */
    public a6.o0 f8597g;

    /* renamed from: h  reason: collision with root package name */
    public List f8598h;

    /* renamed from: i  reason: collision with root package name */
    public K f8599i;
    public final C0489s j;

    /* renamed from: k  reason: collision with root package name */
    public final Q0.A f8600k;

    /* renamed from: l  reason: collision with root package name */
    public final C0476e f8601l;

    /* renamed from: m  reason: collision with root package name */
    public final long f8602m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ V0 f8603n;

    static {
        Logger.getLogger(U0.class.getName());
        f8591o = new C0648I(0);
    }

    public U0(V0 v02, C0489s c0489s, Q0.A a7, C0476e c0476e) {
        ScheduledFuture<?> schedule;
        this.f8603n = v02;
        Z0 z02 = v02.f8607g;
        Logger logger = Z0.f8665g0;
        z02.getClass();
        Executor executor = c0476e.f7133b;
        executor = executor == null ? z02.f8709k : executor;
        Z0 z03 = v02.f8607g;
        X0 x02 = z03.j;
        this.f8598h = new ArrayList();
        G.i.j(executor, "callExecutor");
        this.f8593b = executor;
        G.i.j(x02, "scheduler");
        C0489s b5 = C0489s.b();
        this.f8594c = b5;
        b5.getClass();
        C0490t c0490t = c0476e.f7132a;
        if (c0490t == null) {
            schedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long b7 = c0490t.b(timeUnit);
            long abs = Math.abs(b7);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = abs / timeUnit2.toNanos(1L);
            long abs2 = Math.abs(b7) % timeUnit2.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (b7 < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            schedule = x02.f8641a.schedule(new RunnableC0646G(0, this, sb), b7, timeUnit);
        }
        this.f8592a = schedule;
        this.j = c0489s;
        this.f8600k = a7;
        this.f8601l = c0476e;
        z03.f8700c0.getClass();
        this.f8602m = System.nanoTime();
    }

    @Override // a6.AbstractC0479h
    public final void a(String str, Throwable th) {
        a6.o0 g3;
        a6.o0 o0Var = a6.o0.f;
        if (str != null) {
            g3 = o0Var.g(str);
        } else {
            g3 = o0Var.g("Call cancelled without message");
        }
        if (th != null) {
            g3 = g3.f(th);
        }
        f(g3, false);
    }

    @Override // a6.AbstractC0479h
    public final void b() {
        g(new RunnableC0647H(this, 0));
    }

    @Override // a6.AbstractC0479h
    public final void c(int i7) {
        if (this.f8595d) {
            this.f.c(i7);
        } else {
            g(new S4.c(this, i7, 2));
        }
    }

    @Override // a6.AbstractC0479h
    public final void d(com.google.protobuf.J j) {
        if (this.f8595d) {
            this.f.d(j);
        } else {
            g(new RunnableC0646G(2, this, j));
        }
    }

    @Override // a6.AbstractC0479h
    public final void e(AbstractC0471A abstractC0471A, a6.e0 e0Var) {
        boolean z7;
        a6.o0 o0Var;
        boolean z8;
        if (this.f8596e == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("already started", z7);
        synchronized (this) {
            try {
                this.f8596e = abstractC0471A;
                o0Var = this.f8597g;
                z8 = this.f8595d;
                if (!z8) {
                    K k2 = new K(abstractC0471A);
                    this.f8599i = k2;
                    abstractC0471A = k2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o0Var != null) {
            this.f8593b.execute(new J(this, abstractC0471A, o0Var));
        } else if (z8) {
            this.f.e(abstractC0471A, e0Var);
        } else {
            g(new H2.a(this, abstractC0471A, e0Var, 2));
        }
    }

    public final void f(a6.o0 o0Var, boolean z7) {
        AbstractC0471A abstractC0471A;
        synchronized (this) {
            try {
                AbstractC0479h abstractC0479h = this.f;
                boolean z8 = true;
                if (abstractC0479h == null) {
                    C0648I c0648i = f8591o;
                    if (abstractC0479h != null) {
                        z8 = false;
                    }
                    G.i.n(abstractC0479h, "realCall already set to %s", z8);
                    ScheduledFuture scheduledFuture = this.f8592a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f = c0648i;
                    abstractC0471A = this.f8596e;
                    this.f8597g = o0Var;
                    z8 = false;
                } else if (z7) {
                    return;
                } else {
                    abstractC0471A = null;
                }
                if (z8) {
                    g(new RunnableC0646G(1, this, o0Var));
                } else {
                    if (abstractC0471A != null) {
                        this.f8593b.execute(new J(this, abstractC0471A, o0Var));
                    }
                    h();
                }
                this.f8603n.f8607g.f8714p.execute(new RunnableC0647H(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.f8595d) {
                    this.f8598h.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f8598h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f8598h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f8595d = r0     // Catch: java.lang.Throwable -> L24
            c6.K r0 = r3.f8599i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f8593b
            c6.s r2 = new c6.s
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f8598h     // Catch: java.lang.Throwable -> L24
            r3.f8598h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.U0.h():void");
    }

    public final void i() {
        boolean z7;
        C0702s c0702s;
        C0489s a7 = this.j.a();
        try {
            C0476e c0476e = this.f8601l;
            C0475d c0475d = AbstractC0482k.f7161a;
            this.f8603n.f8607g.f8700c0.getClass();
            AbstractC0479h s7 = this.f8603n.s(this.f8600k, c0476e.c(c0475d, Long.valueOf(System.nanoTime() - this.f8602m)));
            synchronized (this) {
                try {
                    AbstractC0479h abstractC0479h = this.f;
                    if (abstractC0479h != null) {
                        c0702s = null;
                    } else {
                        if (abstractC0479h == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        G.i.n(abstractC0479h, "realCall already set to %s", z7);
                        ScheduledFuture scheduledFuture = this.f8592a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f = s7;
                        c0702s = new C0702s(this, this.f8594c);
                    }
                } finally {
                }
            }
            if (c0702s == null) {
                this.f8603n.f8607g.f8714p.execute(new RunnableC0647H(this, 1));
                return;
            }
            Z0 z02 = this.f8603n.f8607g;
            C0476e c0476e2 = this.f8601l;
            z02.getClass();
            Executor executor = c0476e2.f7133b;
            if (executor == null) {
                executor = z02.f8709k;
            }
            executor.execute(new RunnableC0646G(19, this, c0702s));
        } finally {
            this.j.c(a7);
        }
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f, "realCall");
        return C7.toString();
    }
}
