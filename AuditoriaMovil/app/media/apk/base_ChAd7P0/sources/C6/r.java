package c6;

import a6.AbstractC0471A;
import j6.AbstractC1371b;
import j6.C1370a;
import j6.C1372c;
/* loaded from: classes.dex */
public final class r extends AbstractRunnableC0645F {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a6.o0 f8964c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a6.e0 f8965d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ R1.j f8966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(R1.j jVar, a6.o0 o0Var, a6.e0 e0Var) {
        super(((C0708u) jVar.f4684d).f, 0);
        this.f8966e = jVar;
        this.f8964c = o0Var;
        this.f8965d = e0Var;
    }

    @Override // c6.AbstractRunnableC0645F
    public final void b() {
        AbstractC1371b.c();
        try {
            C1372c c1372c = ((C0708u) this.f8966e.f4684d).f8996b;
            AbstractC1371b.a();
            C1370a c1370a = AbstractC1371b.f13458a;
            c1370a.getClass();
            c();
            c1370a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1371b.f13458a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        a6.o0 o0Var = this.f8964c;
        a6.e0 e0Var = this.f8965d;
        a6.o0 o0Var2 = (a6.o0) this.f8966e.f4683c;
        a6.e0 e0Var2 = e0Var;
        if (o0Var2 != null) {
            o0Var = o0Var2;
            e0Var2 = new Object();
        }
        ((C0708u) this.f8966e.f4684d).f9003k = true;
        try {
            R1.j jVar = this.f8966e;
            ((C0708u) jVar.f4684d).getClass();
            ((AbstractC0471A) jVar.f4682b).g(o0Var, e0Var2);
            ((C0708u) this.f8966e.f4684d).g();
            E.e eVar = ((C0708u) this.f8966e.f4684d).f8999e;
            if (o0Var.e()) {
                ((I0) eVar.f922d).f();
            } else {
                ((I0) eVar.f923e).f();
            }
        } catch (Throwable th) {
            ((C0708u) this.f8966e.f4684d).g();
            E.e eVar2 = ((C0708u) this.f8966e.f4684d).f8999e;
            if (o0Var.e()) {
                ((I0) eVar2.f922d).f();
            } else {
                ((I0) eVar2.f923e).f();
            }
            throw th;
        }
    }
}
