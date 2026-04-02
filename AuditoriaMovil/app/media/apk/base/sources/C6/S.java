package c6;

import a6.C0490t;
import a6.C0492v;
import a6.InterfaceC0484m;
import g6.C1012a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class S implements InterfaceC0711v {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f8572a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0717x f8573b;

    /* renamed from: c  reason: collision with root package name */
    public InterfaceC0711v f8574c;

    /* renamed from: d  reason: collision with root package name */
    public a6.o0 f8575d;
    public Q f;

    /* renamed from: g  reason: collision with root package name */
    public long f8577g;

    /* renamed from: h  reason: collision with root package name */
    public long f8578h;

    /* renamed from: e  reason: collision with root package name */
    public List f8576e = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f8579i = new ArrayList();

    @Override // c6.p2
    public final void a(InterfaceC0484m interfaceC0484m) {
        boolean z7;
        if (this.f8573b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called before start", z7);
        this.f8579i.add(new RunnableC0646G(6, this, interfaceC0484m));
    }

    @Override // c6.p2
    public final boolean b() {
        if (this.f8572a) {
            return this.f8574c.b();
        }
        return false;
    }

    @Override // c6.InterfaceC0711v
    public final void c(int i7) {
        boolean z7;
        if (this.f8573b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called before start", z7);
        this.f8579i.add(new O(this, i7, 2));
    }

    @Override // c6.InterfaceC0711v
    public void d(C0692o0 c0692o0) {
        synchronized (this) {
            try {
                if (this.f8573b == null) {
                    return;
                }
                if (this.f8574c != null) {
                    c0692o0.f(Long.valueOf(this.f8578h - this.f8577g), "buffered_nanos");
                    this.f8574c.d(c0692o0);
                } else {
                    c0692o0.f(Long.valueOf(System.nanoTime() - this.f8577g), "buffered_nanos");
                    c0692o0.f8937b.add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c6.p2
    public final void e(int i7) {
        boolean z7;
        if (this.f8573b != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called after start", z7);
        if (this.f8572a) {
            this.f8574c.e(i7);
        } else {
            n(new O(this, i7, 0));
        }
    }

    @Override // c6.InterfaceC0711v
    public final void f(int i7) {
        boolean z7;
        if (this.f8573b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called before start", z7);
        this.f8579i.add(new O(this, i7, 1));
    }

    @Override // c6.p2
    public final void flush() {
        boolean z7;
        if (this.f8573b != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called after start", z7);
        if (this.f8572a) {
            this.f8574c.flush();
        } else {
            n(new P(this, 2));
        }
    }

    @Override // c6.p2
    public final void g(C1012a c1012a) {
        boolean z7;
        if (this.f8573b != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called after start", z7);
        if (this.f8572a) {
            this.f8574c.g(c1012a);
        } else {
            n(new RunnableC0646G(9, this, c1012a));
        }
    }

    @Override // c6.InterfaceC0711v
    public final void h(C0490t c0490t) {
        boolean z7;
        if (this.f8573b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called before start", z7);
        this.f8579i.add(new RunnableC0646G(8, this, c0490t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [a6.e0, java.lang.Object] */
    @Override // c6.InterfaceC0711v
    public void i(a6.o0 o0Var) {
        boolean z7;
        boolean z8 = false;
        boolean z9 = true;
        if (this.f8573b != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called after start", z7);
        G.i.j(o0Var, "reason");
        synchronized (this) {
            try {
                InterfaceC0711v interfaceC0711v = this.f8574c;
                if (interfaceC0711v == null) {
                    C0696p1 c0696p1 = C0696p1.f8954a;
                    if (interfaceC0711v != null) {
                        z9 = false;
                    }
                    G.i.n(interfaceC0711v, "realStream already set to %s", z9);
                    this.f8574c = c0696p1;
                    this.f8578h = System.nanoTime();
                    this.f8575d = o0Var;
                } else {
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            n(new RunnableC0646G(10, this, o0Var));
            return;
        }
        o();
        q(o0Var);
        this.f8573b.O(o0Var, EnumC0714w.PROCESSED, new Object());
    }

    @Override // c6.InterfaceC0711v
    public final void j(C0492v c0492v) {
        boolean z7;
        if (this.f8573b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called before start", z7);
        G.i.j(c0492v, "decompressorRegistry");
        this.f8579i.add(new RunnableC0646G(7, this, c0492v));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a6.e0, java.lang.Object] */
    @Override // c6.InterfaceC0711v
    public final void k(InterfaceC0717x interfaceC0717x) {
        boolean z7;
        a6.o0 o0Var;
        boolean z8;
        Q q2;
        G.i.j(interfaceC0717x, "listener");
        if (this.f8573b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("already started", z7);
        synchronized (this) {
            try {
                o0Var = this.f8575d;
                z8 = this.f8572a;
                q2 = interfaceC0717x;
                if (!z8) {
                    Q q7 = new Q(interfaceC0717x);
                    this.f = q7;
                    q2 = q7;
                }
                this.f8573b = q2;
                this.f8577g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o0Var != null) {
            q2.O(o0Var, EnumC0714w.PROCESSED, new Object());
        } else if (z8) {
            p(q2);
        }
    }

    @Override // c6.p2
    public final void l() {
        boolean z7;
        if (this.f8573b == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called before start", z7);
        this.f8579i.add(new P(this, 0));
    }

    @Override // c6.InterfaceC0711v
    public final void m() {
        boolean z7;
        if (this.f8573b != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called after start", z7);
        n(new P(this, 3));
    }

    public final void n(Runnable runnable) {
        boolean z7;
        if (this.f8573b != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("May only be called after start", z7);
        synchronized (this) {
            try {
                if (!this.f8572a) {
                    this.f8576e.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f8576e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f8576e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f8572a = r0     // Catch: java.lang.Throwable -> L1d
            c6.Q r0 = r3.f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.c()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.f8576e     // Catch: java.lang.Throwable -> L1d
            r3.f8576e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.S.o():void");
    }

    public final void p(InterfaceC0717x interfaceC0717x) {
        Iterator it = this.f8579i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f8579i = null;
        this.f8574c.k(interfaceC0717x);
    }

    public final P r(InterfaceC0711v interfaceC0711v) {
        boolean z7;
        synchronized (this) {
            try {
                if (this.f8574c != null) {
                    return null;
                }
                G.i.j(interfaceC0711v, "stream");
                InterfaceC0711v interfaceC0711v2 = this.f8574c;
                if (interfaceC0711v2 == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                G.i.n(interfaceC0711v2, "realStream already set to %s", z7);
                this.f8574c = interfaceC0711v;
                this.f8578h = System.nanoTime();
                InterfaceC0717x interfaceC0717x = this.f8573b;
                if (interfaceC0717x == null) {
                    this.f8576e = null;
                    this.f8572a = true;
                }
                if (interfaceC0717x == null) {
                    return null;
                }
                p(interfaceC0717x);
                return new P(this, 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(a6.o0 o0Var) {
    }
}
