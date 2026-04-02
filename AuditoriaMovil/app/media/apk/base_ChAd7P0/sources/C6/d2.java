package c6;

import D.AbstractC0055e;
import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0472a;
import c1.RunnableC0626c;
/* loaded from: classes.dex */
public final class d2 extends AbstractC0471A {

    /* renamed from: d  reason: collision with root package name */
    public static final C0472a f8810d = new C0472a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0471A f8811a;

    /* renamed from: b  reason: collision with root package name */
    public final C0673i f8812b;

    /* renamed from: c  reason: collision with root package name */
    public final a6.u0 f8813c;

    public d2(W w2, C0673i c0673i, a6.u0 u0Var) {
        this.f8811a = w2;
        this.f8812b = c0673i;
        this.f8813c = u0Var;
    }

    @Override // a6.AbstractC0471A
    public String f() {
        return this.f8811a.f();
    }

    @Override // a6.AbstractC0471A
    public final void k() {
        this.f8811a.k();
    }

    @Override // a6.AbstractC0471A
    public final void m() {
        this.f8811a.m();
        C0673i c0673i = this.f8812b;
        a6.u0 u0Var = c0673i.f8852b;
        u0Var.e();
        u0Var.execute(new RunnableC0626c(c0673i, 2));
    }

    @Override // a6.AbstractC0471A
    public final void n(AbstractC0478g abstractC0478g) {
        this.f8811a.n(new c2(this, abstractC0478g));
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f8811a, "delegate");
        return C7.toString();
    }
}
