package c6;

import a6.AbstractC0482k;
import a6.C0483l;
import a6.C0491u;
import a6.C0492v;
import a6.InterfaceC0484m;
/* renamed from: c6.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0652b {

    /* renamed from: a  reason: collision with root package name */
    public C0684l1 f8771a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8772b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final s2 f8773c;

    /* renamed from: d  reason: collision with root package name */
    public final C0684l1 f8774d;

    /* renamed from: e  reason: collision with root package name */
    public int f8775e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8776g;

    /* renamed from: h  reason: collision with root package name */
    public final o2 f8777h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8778i;
    public InterfaceC0717x j;

    /* renamed from: k  reason: collision with root package name */
    public C0492v f8779k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8780l;

    /* renamed from: m  reason: collision with root package name */
    public RunnableC0649a f8781m;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f8782n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8783o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8784p;

    public AbstractC0652b(int i7, o2 o2Var, s2 s2Var) {
        G.i.j(s2Var, "transportTracer");
        this.f8773c = s2Var;
        C0684l1 c0684l1 = new C0684l1(this, i7, o2Var, s2Var);
        this.f8774d = c0684l1;
        this.f8771a = c0684l1;
        this.f8779k = C0492v.f7218d;
        this.f8780l = false;
        this.f8777h = o2Var;
    }

    public abstract void a(int i7);

    public final void b(a6.o0 o0Var, EnumC0714w enumC0714w, a6.e0 e0Var) {
        if (!this.f8778i) {
            this.f8778i = true;
            o2 o2Var = this.f8777h;
            if (o2Var.f8948b.compareAndSet(false, true)) {
                for (AbstractC0482k abstractC0482k : o2Var.f8947a) {
                    abstractC0482k.m(o0Var);
                }
            }
            if (this.f8773c != null) {
                o0Var.e();
            }
            this.j.O(o0Var, enumC0714w, e0Var);
        }
    }

    public abstract void c(boolean z7);

    public final void d(a6.e0 e0Var) {
        InterfaceC0484m interfaceC0484m;
        G.i.o("Received headers on closed stream", !this.f8783o);
        for (AbstractC0482k abstractC0482k : this.f8777h.f8947a) {
            abstractC0482k.b();
        }
        String str = (String) e0Var.c(AbstractC0671h0.f);
        C0483l c0483l = C0483l.f7167b;
        String str2 = (String) e0Var.c(AbstractC0671h0.f8832d);
        if (str2 != null) {
            C0491u c0491u = (C0491u) this.f8779k.f7219a.get(str2);
            if (c0491u != null) {
                interfaceC0484m = c0491u.f7211a;
            } else {
                interfaceC0484m = null;
            }
            if (interfaceC0484m == null) {
                ((d6.l) this).n(new a6.q0(a6.o0.f7179m.g("Can't find decompressor for ".concat(str2))));
                return;
            } else if (interfaceC0484m != c0483l) {
                C0684l1 c0684l1 = this.f8771a;
                c0684l1.getClass();
                G.i.o("Already set full stream decompressor", true);
                c0684l1.f8894e = interfaceC0484m;
            }
        }
        this.j.Q(e0Var);
    }

    public final boolean e() {
        boolean z7;
        synchronized (this.f8772b) {
            try {
                if (this.f && this.f8775e < 32768 && !this.f8776g) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } finally {
            }
        }
        return z7;
    }

    public final void f() {
        boolean e7;
        synchronized (this.f8772b) {
            e7 = e();
        }
        if (e7) {
            this.j.n();
        }
    }

    public final void g(a6.o0 o0Var, EnumC0714w enumC0714w, boolean z7, a6.e0 e0Var) {
        boolean z8;
        G.i.j(o0Var, "status");
        if (this.f8783o && !z7) {
            return;
        }
        this.f8783o = true;
        this.f8784p = o0Var.e();
        synchronized (this.f8772b) {
            this.f8776g = true;
        }
        if (this.f8780l) {
            this.f8781m = null;
            b(o0Var, enumC0714w, e0Var);
            return;
        }
        this.f8781m = new RunnableC0649a(this, o0Var, enumC0714w, e0Var, 0);
        if (z7) {
            this.f8771a.close();
            return;
        }
        C0684l1 c0684l1 = this.f8771a;
        if (!c0684l1.b()) {
            if (c0684l1.f8897g0.f8427c == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                c0684l1.close();
            } else {
                c0684l1.f8902l0 = true;
            }
        }
    }

    public final void h(a6.o0 o0Var, boolean z7, a6.e0 e0Var) {
        g(o0Var, EnumC0714w.PROCESSED, z7, e0Var);
    }
}
