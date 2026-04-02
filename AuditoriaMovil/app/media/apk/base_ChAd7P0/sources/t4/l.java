package t4;

import A3.N;
import a6.AbstractC0471A;
import a6.AbstractC0479h;
import a6.e0;
import a6.o0;
import com.google.protobuf.AbstractC0828a;
/* loaded from: classes.dex */
public final class l extends AbstractC0471A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N f15816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0479h[] f15817b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f15818c;

    public l(p pVar, N n7, AbstractC0479h[] abstractC0479hArr) {
        this.f15818c = pVar;
        this.f15816a = n7;
        this.f15817b = abstractC0479hArr;
    }

    @Override // a6.AbstractC0471A
    public final void g(o0 o0Var, e0 e0Var) {
        try {
            N n7 = this.f15816a;
            ((J2.e) n7.f105c).E(new RunnableC1822b(1, n7, o0Var));
        } catch (Throwable th) {
            this.f15818c.f15828a.c(th);
        }
    }

    @Override // a6.AbstractC0471A
    public final void h(e0 e0Var) {
        try {
            N n7 = this.f15816a;
            ((J2.e) n7.f105c).E(new RunnableC1822b(0, n7, e0Var));
        } catch (Throwable th) {
            this.f15818c.f15828a.c(th);
        }
    }

    @Override // a6.AbstractC0471A
    public final void i(AbstractC0828a abstractC0828a) {
        try {
            N n7 = this.f15816a;
            int i7 = n7.f104b + 1;
            ((J2.e) n7.f105c).E(new K0.g(n7, i7, 4, abstractC0828a));
            n7.f104b = i7;
            this.f15817b[0].c(1);
        } catch (Throwable th) {
            this.f15818c.f15828a.c(th);
        }
    }

    @Override // a6.AbstractC0471A
    public final void j() {
    }
}
