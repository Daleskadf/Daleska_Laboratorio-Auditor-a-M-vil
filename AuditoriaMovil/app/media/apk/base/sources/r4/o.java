package r4;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class o extends h {

    /* renamed from: d  reason: collision with root package name */
    public final q4.o f15512d;

    public o(q4.h hVar, q4.o oVar, m mVar, List list) {
        super(hVar, mVar, list);
        this.f15512d = oVar;
    }

    @Override // r4.h
    public final f a(q4.n nVar, f fVar, U3.p pVar) {
        j(nVar);
        if (!this.f15497b.b(nVar)) {
            return fVar;
        }
        HashMap h8 = h(pVar, nVar);
        q4.o oVar = new q4.o(this.f15512d.b());
        oVar.h(h8);
        nVar.a(nVar.f15364c, oVar);
        nVar.f = q4.l.HAS_LOCAL_MUTATIONS;
        nVar.f15364c = q4.q.f15370b;
        return null;
    }

    @Override // r4.h
    public final void b(q4.n nVar, j jVar) {
        j(nVar);
        q4.o oVar = new q4.o(this.f15512d.b());
        oVar.h(i(nVar, jVar.f15504b));
        nVar.a(jVar.f15503a, oVar);
        nVar.f = q4.l.HAS_COMMITTED_MUTATIONS;
    }

    @Override // r4.h
    public final f d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (e(oVar) && this.f15512d.equals(oVar.f15512d) && this.f15498c.equals(oVar.f15498c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15512d.hashCode() + (f() * 31);
    }

    public final String toString() {
        return "SetMutation{" + g() + ", value=" + this.f15512d + "}";
    }
}
