package c6;

import D.AbstractC0055e;
import a6.AbstractC0471A;
import a6.AbstractC0479h;
import a6.C0476e;
import a6.C0485n;
import a6.C0489s;
import a6.C0492v;
import j6.AbstractC1371b;
import j6.C1370a;
import j6.C1372c;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: c6.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708u extends AbstractC0479h {

    /* renamed from: q  reason: collision with root package name */
    public static final Logger f8993q = Logger.getLogger(C0708u.class.getName());

    /* renamed from: r  reason: collision with root package name */
    public static final double f8994r;

    /* renamed from: a  reason: collision with root package name */
    public final Q0.A f8995a;

    /* renamed from: b  reason: collision with root package name */
    public final C1372c f8996b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f8997c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8998d;

    /* renamed from: e  reason: collision with root package name */
    public final E.e f8999e;
    public final C0489s f;

    /* renamed from: g  reason: collision with root package name */
    public volatile ScheduledFuture f9000g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9001h;

    /* renamed from: i  reason: collision with root package name */
    public C0476e f9002i;
    public InterfaceC0711v j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f9003k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9004l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9005m;

    /* renamed from: n  reason: collision with root package name */
    public final C0644E f9006n;

    /* renamed from: o  reason: collision with root package name */
    public final ScheduledExecutorService f9007o;

    /* renamed from: p  reason: collision with root package name */
    public C0492v f9008p = C0492v.f7218d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f8994r = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public C0708u(Q0.A a7, Executor executor, C0476e c0476e, C0644E c0644e, ScheduledExecutorService scheduledExecutorService, E.e eVar) {
        C0485n c0485n = C0485n.f7170b;
        this.f8995a = a7;
        Object obj = a7.f4138d;
        System.identityHashCode(this);
        AbstractC1371b.f13458a.getClass();
        this.f8996b = C1370a.f13456a;
        boolean z7 = false;
        if (executor == E3.a.INSTANCE) {
            this.f8997c = new Object();
            this.f8998d = true;
        } else {
            this.f8997c = new h2(executor);
            this.f8998d = false;
        }
        this.f8999e = eVar;
        this.f = C0489s.b();
        a6.f0 f0Var = a6.f0.UNARY;
        a6.f0 f0Var2 = (a6.f0) a7.f4137c;
        this.f9001h = (f0Var2 == f0Var || f0Var2 == a6.f0.SERVER_STREAMING) ? true : z7;
        this.f9002i = c0476e;
        this.f9006n = c0644e;
        this.f9007o = scheduledExecutorService;
    }

    @Override // a6.AbstractC0479h
    public final void a(String str, Throwable th) {
        AbstractC1371b.c();
        try {
            AbstractC1371b.a();
            f(str, th);
            AbstractC1371b.f13458a.getClass();
        } catch (Throwable th2) {
            try {
                AbstractC1371b.f13458a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // a6.AbstractC0479h
    public final void b() {
        boolean z7;
        AbstractC1371b.c();
        try {
            AbstractC1371b.a();
            if (this.j != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            G.i.o("Not started", z7);
            G.i.o("call was cancelled", !this.f9004l);
            G.i.o("call already half-closed", !this.f9005m);
            this.f9005m = true;
            this.j.m();
            AbstractC1371b.f13458a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1371b.f13458a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // a6.AbstractC0479h
    public final void c(int i7) {
        boolean z7;
        AbstractC1371b.c();
        try {
            AbstractC1371b.a();
            boolean z8 = false;
            if (this.j != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            G.i.o("Not started", z7);
            if (i7 >= 0) {
                z8 = true;
            }
            G.i.f("Number requested must be non-negative", z8);
            this.j.e(i7);
            AbstractC1371b.f13458a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1371b.f13458a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // a6.AbstractC0479h
    public final void d(com.google.protobuf.J j) {
        AbstractC1371b.c();
        try {
            AbstractC1371b.a();
            h(j);
            AbstractC1371b.f13458a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1371b.f13458a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // a6.AbstractC0479h
    public final void e(AbstractC0471A abstractC0471A, a6.e0 e0Var) {
        AbstractC1371b.c();
        try {
            AbstractC1371b.a();
            i(abstractC0471A, e0Var);
            AbstractC1371b.f13458a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1371b.f13458a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, Throwable th) {
        a6.o0 g3;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f8993q.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f9004l) {
            return;
        }
        this.f9004l = true;
        try {
            if (this.j != null) {
                a6.o0 o0Var = a6.o0.f;
                if (str != null) {
                    g3 = o0Var.g(str);
                } else {
                    g3 = o0Var.g("Call cancelled without message");
                }
                if (th != null) {
                    g3 = g3.f(th);
                }
                this.j.i(g3);
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    public final void g() {
        this.f.getClass();
        ScheduledFuture scheduledFuture = this.f9000g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void h(com.google.protobuf.J j) {
        boolean z7;
        if (this.j != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("Not started", z7);
        G.i.o("call was cancelled", !this.f9004l);
        G.i.o("call was half-closed", !this.f9005m);
        try {
            InterfaceC0711v interfaceC0711v = this.j;
            if (interfaceC0711v instanceof N0) {
                ((N0) interfaceC0711v).w(j);
            } else {
                interfaceC0711v.g(this.f8995a.g(j));
            }
            if (!this.f9001h) {
                this.j.flush();
            }
        } catch (Error e7) {
            this.j.i(a6.o0.f.g("Client sendMessage() failed with Error"));
            throw e7;
        } catch (RuntimeException e8) {
            this.j.i(a6.o0.f.f(e8).g("Failed to stream message"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if ((r11.f7206b - r9.f7206b) < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(a6.AbstractC0471A r16, a6.e0 r17) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C0708u.i(a6.A, a6.e0):void");
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f8995a, "method");
        return C7.toString();
    }
}
