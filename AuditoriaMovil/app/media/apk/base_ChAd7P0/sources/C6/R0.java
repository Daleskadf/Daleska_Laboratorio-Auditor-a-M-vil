package c6;

import a6.AbstractC0478g;
/* loaded from: classes.dex */
public final class R0 extends AbstractC0478g {

    /* renamed from: d  reason: collision with root package name */
    public final Q0 f8570d;

    /* renamed from: e  reason: collision with root package name */
    public final d2 f8571e;
    public final /* synthetic */ Z0 f;

    public R0(Z0 z02, Q0 q0, d2 d2Var) {
        this.f = z02;
        this.f8570d = q0;
        G.i.j(d2Var, "resolver");
        this.f8571e = d2Var;
    }

    @Override // a6.AbstractC0478g
    public final void o(a6.o0 o0Var) {
        G.i.f("the error status must not be OK", !o0Var.e());
        this.f.f8714p.execute(new RunnableC0646G(16, this, o0Var));
    }

    @Override // a6.AbstractC0478g
    public final void p(a6.i0 i0Var) {
        this.f.f8714p.execute(new RunnableC0646G(17, this, i0Var));
    }
}
