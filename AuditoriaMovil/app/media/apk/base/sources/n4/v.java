package n4;

import H4.p1;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class v extends C1529o {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14370d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f14371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q4.k kVar, EnumC1528n enumC1528n, p1 p1Var) {
        super(kVar, enumC1528n, p1Var);
        this.f14370d = 2;
        m5.d.i("KeyFieldFilter expects a ReferenceValue", q4.s.i(p1Var), new Object[0]);
        this.f14371e = q4.h.c(p1Var.O());
    }

    public static ArrayList h(EnumC1528n enumC1528n, p1 p1Var) {
        boolean z7;
        if (enumC1528n != EnumC1528n.IN && enumC1528n != EnumC1528n.NOT_IN) {
            z7 = false;
        } else {
            z7 = true;
        }
        m5.d.i("extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", z7, new Object[0]);
        m5.d.i("KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", q4.s.f(p1Var), new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (p1 p1Var2 : p1Var.G().a()) {
            m5.d.i("Comparing on key with " + enumC1528n.toString() + ", but an array value was not a ReferenceValue", q4.s.i(p1Var2), new Object[0]);
            arrayList.add(q4.h.c(p1Var2.O()));
        }
        return arrayList;
    }

    @Override // n4.C1529o, n4.AbstractC1530p
    public final boolean d(q4.n nVar) {
        switch (this.f14370d) {
            case 0:
                return ((ArrayList) this.f14371e).contains(nVar.f15362a);
            case 1:
                return !((ArrayList) this.f14371e).contains(nVar.f15362a);
            default:
                return g(nVar.f15362a.compareTo((q4.h) this.f14371e));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(q4.k r1, H4.p1 r2, int r3) {
        /*
            r0 = this;
            r0.f14370d = r3
            switch(r3) {
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            n4.n r3 = n4.EnumC1528n.IN
            r0.<init>(r1, r3, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f14371e = r1
            java.util.ArrayList r2 = h(r3, r2)
            r1.addAll(r2)
            return
        L19:
            n4.n r3 = n4.EnumC1528n.NOT_IN
            r0.<init>(r1, r3, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f14371e = r1
            java.util.ArrayList r2 = h(r3, r2)
            r1.addAll(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.v.<init>(q4.k, H4.p1, int):void");
    }
}
