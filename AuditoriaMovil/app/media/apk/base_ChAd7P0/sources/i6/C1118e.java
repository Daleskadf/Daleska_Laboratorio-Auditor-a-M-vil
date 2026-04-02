package i6;

import D.AbstractC0055e;
import a6.EnumC0486o;
import a6.N;
import a6.O;
import a6.Q;
import a6.S;
import a6.o0;
import c6.C0664f;
/* renamed from: i6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118e extends Q {

    /* renamed from: o  reason: collision with root package name */
    public static final C0664f f11507o = new C0664f(1);
    public final C1116c f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC1114a f11508g;

    /* renamed from: h  reason: collision with root package name */
    public S f11509h;

    /* renamed from: i  reason: collision with root package name */
    public Q f11510i;
    public S j;

    /* renamed from: k  reason: collision with root package name */
    public Q f11511k;

    /* renamed from: l  reason: collision with root package name */
    public EnumC0486o f11512l;

    /* renamed from: m  reason: collision with root package name */
    public O f11513m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11514n;

    public C1118e(AbstractC1114a abstractC1114a) {
        C1116c c1116c = new C1116c(this);
        this.f = c1116c;
        this.f11510i = c1116c;
        this.f11511k = c1116c;
        this.f11508g = abstractC1114a;
    }

    @Override // a6.Q
    public final boolean b() {
        return g().b();
    }

    @Override // a6.Q
    public final void c(o0 o0Var) {
        g().c(o0Var);
    }

    @Override // a6.Q
    public final void d(N n7) {
        g().d(n7);
    }

    @Override // a6.Q
    public final void e() {
        g().e();
    }

    @Override // a6.Q
    public final void f() {
        this.f11511k.f();
        this.f11510i.f();
    }

    public final Q g() {
        Q q2 = this.f11511k;
        if (q2 == this.f) {
            return this.f11510i;
        }
        return q2;
    }

    public final void h() {
        this.f11508g.r(this.f11512l, this.f11513m);
        this.f11510i.f();
        this.f11510i = this.f11511k;
        this.f11509h = this.j;
        this.f11511k = this.f;
        this.j = null;
    }

    public final void i(S s7) {
        G.i.j(s7, "newBalancerFactory");
        if (s7.equals(this.j)) {
            return;
        }
        this.f11511k.f();
        this.f11511k = this.f;
        this.j = null;
        this.f11512l = EnumC0486o.CONNECTING;
        this.f11513m = f11507o;
        if (s7.equals(this.f11509h)) {
            return;
        }
        C1117d c1117d = new C1117d(this);
        Q d7 = s7.d(c1117d);
        c1117d.f11506e = d7;
        this.f11511k = d7;
        this.j = s7;
        if (!this.f11514n) {
            h();
        }
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(g(), "delegate");
        return C7.toString();
    }
}
