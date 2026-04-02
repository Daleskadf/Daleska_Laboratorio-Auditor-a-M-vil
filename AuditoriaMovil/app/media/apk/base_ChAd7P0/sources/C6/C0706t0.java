package c6;

import D.AbstractC0055e;
import a6.C0490t;
import a6.C0492v;
import a6.InterfaceC0484m;
import g6.C1012a;
/* renamed from: c6.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706t0 implements InterfaceC0711v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0711v f8989a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0709u0 f8990b;

    public C0706t0(C0709u0 c0709u0, InterfaceC0711v interfaceC0711v) {
        this.f8990b = c0709u0;
        this.f8989a = interfaceC0711v;
    }

    @Override // c6.p2
    public final void a(InterfaceC0484m interfaceC0484m) {
        this.f8989a.a(interfaceC0484m);
    }

    @Override // c6.p2
    public final boolean b() {
        return this.f8989a.b();
    }

    @Override // c6.InterfaceC0711v
    public final void c(int i7) {
        this.f8989a.c(i7);
    }

    @Override // c6.InterfaceC0711v
    public final void d(C0692o0 c0692o0) {
        this.f8989a.d(c0692o0);
    }

    @Override // c6.p2
    public final void e(int i7) {
        this.f8989a.e(i7);
    }

    @Override // c6.InterfaceC0711v
    public final void f(int i7) {
        this.f8989a.f(i7);
    }

    @Override // c6.p2
    public final void flush() {
        this.f8989a.flush();
    }

    @Override // c6.p2
    public final void g(C1012a c1012a) {
        this.f8989a.g(c1012a);
    }

    @Override // c6.InterfaceC0711v
    public final void h(C0490t c0490t) {
        this.f8989a.h(c0490t);
    }

    @Override // c6.InterfaceC0711v
    public final void i(a6.o0 o0Var) {
        this.f8989a.i(o0Var);
    }

    @Override // c6.InterfaceC0711v
    public final void j(C0492v c0492v) {
        this.f8989a.j(c0492v);
    }

    @Override // c6.InterfaceC0711v
    public final void k(InterfaceC0717x interfaceC0717x) {
        E.e eVar = this.f8990b.f9010b;
        ((I0) eVar.f921c).f();
        ((q2) eVar.f920b).c();
        this.f8989a.k(new s2(2, this, interfaceC0717x));
    }

    @Override // c6.p2
    public final void l() {
        this.f8989a.l();
    }

    @Override // c6.InterfaceC0711v
    public final void m() {
        this.f8989a.m();
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f8989a, "delegate");
        return C7.toString();
    }
}
