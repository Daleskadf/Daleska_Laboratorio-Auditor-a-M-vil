package n4;

import H4.p1;
/* renamed from: n4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515a extends C1529o {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1515a(q4.k kVar, EnumC1528n enumC1528n, p1 p1Var, int i7) {
        super(kVar, enumC1528n, p1Var);
        this.f14329d = i7;
    }

    @Override // n4.C1529o, n4.AbstractC1530p
    public final boolean d(q4.n nVar) {
        p1 f;
        switch (this.f14329d) {
            case 0:
                p1 f4 = nVar.f15366e.f(this.f14351c);
                if (!q4.s.f(f4)) {
                    return false;
                }
                for (p1 p1Var : f4.G().a()) {
                    if (q4.s.d(this.f14350b.G(), p1Var)) {
                        return true;
                    }
                }
                return false;
            case 1:
                p1 f8 = nVar.f15366e.f(this.f14351c);
                if (q4.s.f(f8) && q4.s.d(f8.G(), this.f14350b)) {
                    return true;
                }
                return false;
            default:
                p1 p1Var2 = this.f14350b;
                if (q4.s.d(p1Var2.G(), q4.s.f15374b) || (f = nVar.f15366e.f(this.f14351c)) == null || f.S() || q4.s.d(p1Var2.G(), f)) {
                    return false;
                }
                return true;
        }
    }
}
