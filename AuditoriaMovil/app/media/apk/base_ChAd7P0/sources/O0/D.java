package O0;

import H0.C0137q;
/* loaded from: classes.dex */
public final /* synthetic */ class D implements K0.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3480a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H0.e0 f3481b;

    public /* synthetic */ D(H0.e0 e0Var) {
        this.f3481b = e0Var;
    }

    @Override // K0.h
    public final void invoke(Object obj) {
        switch (this.f3480a) {
            case 0:
                ((H0.N) obj).s(this.f3481b);
                return;
            default:
                P0.i iVar = (P0.i) obj;
                A3.N n7 = iVar.f3938o;
                H0.e0 e0Var = this.f3481b;
                if (n7 != null) {
                    H0.r rVar = (H0.r) n7.f105c;
                    if (rVar.f1893t == -1) {
                        C0137q a7 = rVar.a();
                        a7.f1856r = e0Var.f1793a;
                        a7.f1857s = e0Var.f1794b;
                        iVar.f3938o = new A3.N(new H0.r(a7), n7.f104b, (String) n7.f106d, 2);
                    }
                }
                int i7 = e0Var.f1793a;
                return;
        }
    }

    public /* synthetic */ D(P0.a aVar, H0.e0 e0Var) {
        this.f3481b = e0Var;
    }
}
