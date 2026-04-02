package c6;

import a6.AbstractC0471A;
import a6.AbstractC0479h;
import a6.AbstractC0496z;
import a6.C0474c;
import a6.C0476e;
import a6.C0489s;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class O0 extends AbstractC0496z {

    /* renamed from: a  reason: collision with root package name */
    public final a6.F f8550a;

    /* renamed from: b  reason: collision with root package name */
    public final S0 f8551b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f8552c;

    /* renamed from: d  reason: collision with root package name */
    public final Q0.A f8553d;

    /* renamed from: e  reason: collision with root package name */
    public final C0489s f8554e;
    public C0476e f;

    /* renamed from: g  reason: collision with root package name */
    public AbstractC0479h f8555g;

    public O0(a6.F f, S0 s02, Executor executor, Q0.A a7, C0476e c0476e) {
        this.f8550a = f;
        this.f8551b = s02;
        this.f8553d = a7;
        Executor executor2 = c0476e.f7133b;
        executor = executor2 != null ? executor2 : executor;
        this.f8552c = executor;
        C0474c b5 = C0476e.b(c0476e);
        b5.f7122b = executor;
        this.f = new C0476e(b5);
        this.f8554e = C0489s.b();
    }

    @Override // a6.AbstractC0496z, a6.AbstractC0479h
    public final void a(String str, Throwable th) {
        AbstractC0479h abstractC0479h = this.f8555g;
        if (abstractC0479h != null) {
            abstractC0479h.a(str, th);
        }
    }

    @Override // a6.AbstractC0496z, a6.AbstractC0479h
    public final void e(AbstractC0471A abstractC0471A, a6.e0 e0Var) {
        C0476e c0476e = this.f;
        Q0.A a7 = this.f8553d;
        G.i.j(a7, "method");
        G.i.j(c0476e, "callOptions");
        M0.x a8 = this.f8550a.a();
        a6.o0 o0Var = (a6.o0) a8.f3210b;
        if (!o0Var.e()) {
            this.f8552c.execute(new J(this, abstractC0471A, AbstractC0671h0.h(o0Var)));
            this.f8555g = Z0.f8672n0;
            return;
        }
        C0666f1 c0666f1 = (C0666f1) a8.f3211c;
        c0666f1.getClass();
        C0660d1 c0660d1 = (C0660d1) c0666f1.f8824b.get((String) a7.f4138d);
        if (c0660d1 == null) {
            c0660d1 = (C0660d1) c0666f1.f8825c.get((String) a7.f4139e);
        }
        if (c0660d1 == null) {
            c0660d1 = c0666f1.f8823a;
        }
        if (c0660d1 != null) {
            this.f = this.f.c(C0660d1.f8804g, c0660d1);
        }
        AbstractC0479h n7 = this.f8551b.n(a7, this.f);
        this.f8555g = n7;
        n7.e(abstractC0471A, e0Var);
    }

    @Override // a6.AbstractC0496z
    public final AbstractC0479h f() {
        return this.f8555g;
    }
}
