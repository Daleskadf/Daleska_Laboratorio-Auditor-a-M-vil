package r4;
/* loaded from: classes.dex */
public final class q extends h {
    @Override // r4.h
    public final f a(q4.n nVar, f fVar, U3.p pVar) {
        m5.d.g("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // r4.h
    public final void b(q4.n nVar, j jVar) {
        m5.d.g("VerifyMutation should only be used in Transactions.", new Object[0]);
        throw null;
    }

    @Override // r4.h
    public final f d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return e((q) obj);
        }
        return false;
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "VerifyMutation{" + g() + "}";
    }
}
