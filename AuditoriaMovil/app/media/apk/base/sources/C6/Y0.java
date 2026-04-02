package c6;

import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0473b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class Y0 extends AbstractC0471A {

    /* renamed from: a  reason: collision with root package name */
    public final a6.L f8649a;

    /* renamed from: b  reason: collision with root package name */
    public final a6.H f8650b;

    /* renamed from: c  reason: collision with root package name */
    public final C0685m f8651c;

    /* renamed from: d  reason: collision with root package name */
    public final C0694p f8652d;

    /* renamed from: e  reason: collision with root package name */
    public List f8653e;
    public C0721y0 f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8654g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8655h;

    /* renamed from: i  reason: collision with root package name */
    public a6.t0 f8656i;
    public final /* synthetic */ Z0 j;

    public Y0(Z0 z02, a6.L l8) {
        this.j = z02;
        List list = l8.f7088b;
        this.f8653e = list;
        z02.getClass();
        this.f8649a = l8;
        a6.H h8 = new a6.H("Subchannel", z02.f8721w.f8606e, a6.H.f7079d.incrementAndGet());
        this.f8650b = h8;
        q2 q2Var = z02.f8713o;
        long c8 = q2Var.c();
        C0694p c0694p = new C0694p(h8, c8, "Subchannel for " + list);
        this.f8652d = c0694p;
        this.f8651c = new C0685m(c0694p, q2Var);
    }

    @Override // a6.AbstractC0471A
    public final List b() {
        this.j.f8714p.e();
        G.i.o("not started", this.f8654g);
        return this.f8653e;
    }

    @Override // a6.AbstractC0471A
    public final C0473b c() {
        return this.f8649a.f7089c;
    }

    @Override // a6.AbstractC0471A
    public final AbstractC0478g d() {
        return this.f8651c;
    }

    @Override // a6.AbstractC0471A
    public final Object e() {
        G.i.o("Subchannel is not started", this.f8654g);
        return this.f;
    }

    @Override // a6.AbstractC0471A
    public final void l() {
        this.j.f8714p.e();
        G.i.o("not started", this.f8654g);
        C0721y0 c0721y0 = this.f;
        if (c0721y0.f9054v == null) {
            c0721y0.f9043k.execute(new RunnableC0698q0(c0721y0, 1));
        }
    }

    @Override // a6.AbstractC0471A
    public final void m() {
        a6.t0 t0Var;
        Z0 z02 = this.j;
        z02.f8714p.e();
        if (this.f == null) {
            this.f8655h = true;
            return;
        }
        if (this.f8655h) {
            if (z02.f8684L && (t0Var = this.f8656i) != null) {
                t0Var.o();
                this.f8656i = null;
            } else {
                return;
            }
        } else {
            this.f8655h = true;
        }
        if (!z02.f8684L) {
            this.f8656i = z02.f8714p.d(new H0(new G.c(this, 15)), 5L, TimeUnit.SECONDS, z02.f8708i.f8874a.f10388d);
            return;
        }
        C0721y0 c0721y0 = this.f;
        a6.o0 o0Var = Z0.f8668j0;
        c0721y0.getClass();
        c0721y0.f9043k.execute(new RunnableC0700r0(c0721y0, o0Var, 0));
    }

    @Override // a6.AbstractC0471A
    public final void o(a6.P p7) {
        Z0 z02 = this.j;
        z02.f8714p.e();
        G.i.o("already started", !this.f8654g);
        G.i.o("already shutdown", !this.f8655h);
        G.i.o("Channel is being terminated", !z02.f8684L);
        this.f8654g = true;
        List list = this.f8649a.f7088b;
        String str = z02.f8721w.f8606e;
        C0679k c0679k = z02.f8708i;
        ScheduledExecutorService scheduledExecutorService = c0679k.f8874a.f10388d;
        s2 s2Var = new s2(3, this, p7);
        z02.f8687O.getClass();
        E.e eVar = new E.e(15);
        ArrayList arrayList = z02.f8722x;
        C0721y0 c0721y0 = new C0721y0(list, str, z02.f8720v, c0679k, scheduledExecutorService, z02.f8717s, z02.f8714p, s2Var, z02.f8691S, eVar, this.f8652d, this.f8650b, this.f8651c, arrayList);
        a6.C c8 = a6.C.CT_INFO;
        long c9 = z02.f8713o.c();
        G.i.j(c8, "severity");
        z02.f8689Q.b(new a6.D("Child Subchannel started", c8, c9, c0721y0));
        this.f = c0721y0;
        a6.G g3 = (a6.G) z02.f8691S.f7076b.put(Long.valueOf(c0721y0.c().f7082c), c0721y0);
        z02.f8676D.add(c0721y0);
    }

    @Override // a6.AbstractC0471A
    public final void p(List list) {
        this.j.f8714p.e();
        this.f8653e = list;
        C0721y0 c0721y0 = this.f;
        c0721y0.getClass();
        for (Object obj : list) {
            G.i.j(obj, "newAddressGroups contains null entry");
        }
        G.i.f("newAddressGroups is empty", !list.isEmpty());
        c0721y0.f9043k.execute(new RunnableC0646G(14, c0721y0, DesugarCollections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.f8650b.toString();
    }
}
