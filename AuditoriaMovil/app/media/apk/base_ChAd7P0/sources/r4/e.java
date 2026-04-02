package r4;
/* loaded from: classes.dex */
public final class e extends h {
    @Override // r4.h
    public final f a(q4.n nVar, f fVar, U3.p pVar) {
        j(nVar);
        if (this.f15497b.b(nVar)) {
            nVar.b(nVar.f15364c);
            nVar.f = q4.l.HAS_LOCAL_MUTATIONS;
            nVar.f15364c = q4.q.f15370b;
            return null;
        }
        return fVar;
    }

    @Override // r4.h
    public final void b(q4.n nVar, j jVar) {
        j(nVar);
        m5.d.i("Transform results received by DeleteMutation.", jVar.f15504b.isEmpty(), new Object[0]);
        nVar.b(jVar.f15503a);
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
        if (obj != null && e.class == obj.getClass()) {
            return e((e) obj);
        }
        return false;
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "DeleteMutation{" + g() + "}";
    }
}
