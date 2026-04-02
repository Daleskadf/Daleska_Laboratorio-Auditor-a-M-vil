package ca;
/* loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [ca.f1, java.lang.Object, ca.a] */
    public static final f1 a(c0 c0Var, k9.f fVar, e0 e0Var, s9.p pVar) {
        o1 o1Var;
        k9.f d10 = x.d(c0Var, fVar);
        if (e0Var.c()) {
            o1Var = new o1(d10, pVar);
        } else {
            o1Var = new u1(d10, true);
        }
        o1Var.v0(e0Var, o1Var, pVar);
        return o1Var;
    }

    public static /* synthetic */ f1 b(c0 c0Var, k9.f fVar, e0 e0Var, s9.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = k9.g.f15708a;
        }
        if ((i10 & 2) != 0) {
            e0Var = e0.DEFAULT;
        }
        return f.a(c0Var, fVar, e0Var, pVar);
    }
}
