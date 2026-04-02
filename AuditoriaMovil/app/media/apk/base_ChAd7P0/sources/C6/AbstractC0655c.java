package c6;

import a6.AbstractC0478g;
import a6.C0476e;
import a6.C0490t;
import a6.C0492v;
import j6.AbstractC1371b;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* renamed from: c6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0655c extends k2 implements InterfaceC0711v {

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f8792i = Logger.getLogger(AbstractC0655c.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public final s2 f8793c;

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0659d0 f8794d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8795e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public a6.e0 f8796g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f8797h;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, D5.b, c6.d0] */
    public AbstractC0655c(e5.b bVar, o2 o2Var, s2 s2Var, a6.e0 e0Var, C0476e c0476e, boolean z7) {
        G.i.j(e0Var, "headers");
        G.i.j(s2Var, "transportTracer");
        this.f8793c = s2Var;
        this.f8795e = !Boolean.TRUE.equals(c0476e.a(AbstractC0671h0.f8840n));
        this.f = z7;
        if (!z7) {
            this.f8794d = new C0690n1(this, bVar, o2Var);
            this.f8796g = e0Var;
            return;
        }
        ?? obj = new Object();
        obj.f871e = this;
        G.i.j(e0Var, "headers");
        obj.f868b = e0Var;
        obj.f869c = o2Var;
        this.f8794d = obj;
    }

    @Override // c6.p2
    public final boolean b() {
        if (((d6.m) this).f10429n.e() && !this.f8797h) {
            return true;
        }
        return false;
    }

    @Override // c6.InterfaceC0711v
    public final void c(int i7) {
        this.f8794d.c(i7);
    }

    @Override // c6.InterfaceC0711v
    public final void d(C0692o0 c0692o0) {
        c0692o0.f(((d6.m) this).f10431p.f7116a.get(AbstractC0478g.f7144a), "remote_addr");
    }

    @Override // c6.InterfaceC0711v
    public final void f(int i7) {
        ((d6.m) this).f10429n.f8771a.f8891b = i7;
    }

    @Override // c6.InterfaceC0711v
    public final void h(C0490t c0490t) {
        a6.e0 e0Var = this.f8796g;
        a6.Z z7 = AbstractC0671h0.f8831c;
        e0Var.a(z7);
        this.f8796g.f(z7, Long.valueOf(Math.max(0L, c0490t.b(TimeUnit.NANOSECONDS))));
    }

    @Override // c6.InterfaceC0711v
    public final void i(a6.o0 o0Var) {
        G.i.f("Should not cancel with OK status", !o0Var.e());
        this.f8797h = true;
        A.m mVar = ((d6.m) this).f10430o;
        mVar.getClass();
        AbstractC1371b.c();
        try {
            synchronized (((d6.m) mVar.f28b).f10429n.f10421w) {
                ((d6.m) mVar.f28b).f10429n.m(o0Var, true, null);
            }
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

    @Override // c6.InterfaceC0711v
    public final void j(C0492v c0492v) {
        boolean z7;
        d6.l lVar = ((d6.m) this).f10429n;
        if (lVar.j == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("Already called start", z7);
        G.i.j(c0492v, "decompressorRegistry");
        lVar.f8779k = c0492v;
    }

    @Override // c6.InterfaceC0711v
    public final void k(InterfaceC0717x interfaceC0717x) {
        boolean z7;
        d6.m mVar = (d6.m) this;
        d6.l lVar = mVar.f10429n;
        if (lVar.j == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        G.i.o("Already called setListener", z7);
        G.i.j(interfaceC0717x, "listener");
        lVar.j = interfaceC0717x;
        if (!this.f) {
            mVar.f10430o.n0(this.f8796g, null);
            this.f8796g = null;
        }
    }

    @Override // c6.InterfaceC0711v
    public final void m() {
        d6.m mVar = (d6.m) this;
        if (!mVar.f10429n.f8782n) {
            mVar.f10429n.f8782n = true;
            this.f8794d.close();
        }
    }

    public final void v(d6.x xVar, boolean z7, boolean z8, int i7) {
        boolean z9;
        Q6.e eVar;
        if (xVar == null && !z7) {
            z9 = false;
        } else {
            z9 = true;
        }
        G.i.f("null frame before EOS", z9);
        A.m mVar = ((d6.m) this).f10430o;
        mVar.getClass();
        AbstractC1371b.c();
        try {
            if (xVar == null) {
                eVar = d6.m.f10425r;
            } else {
                eVar = xVar.f10494a;
                int i8 = (int) eVar.f4462b;
                if (i8 > 0) {
                    d6.m.w((d6.m) mVar.f28b, i8);
                }
            }
            synchronized (((d6.m) mVar.f28b).f10429n.f10421w) {
                d6.l.l(((d6.m) mVar.f28b).f10429n, eVar, z7, z8);
                s2 s2Var = ((d6.m) mVar.f28b).f8793c;
                if (i7 == 0) {
                    s2Var.getClass();
                } else {
                    s2Var.getClass();
                    ((q2) s2Var.f8984b).c();
                }
            }
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
}
