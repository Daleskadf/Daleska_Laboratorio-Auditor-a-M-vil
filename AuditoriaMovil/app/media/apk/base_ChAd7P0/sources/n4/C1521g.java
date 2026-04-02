package n4;
/* renamed from: n4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1521g {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1520f f14338a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.n f14339b;

    public C1521g(EnumC1520f enumC1520f, q4.n nVar) {
        this.f14338a = enumC1520f;
        this.f14339b = nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1521g)) {
            return false;
        }
        C1521g c1521g = (C1521g) obj;
        if (!this.f14338a.equals(c1521g.f14338a) || !this.f14339b.equals(c1521g.f14339b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        q4.n nVar = this.f14339b;
        int hashCode = nVar.f15362a.f15357a.hashCode();
        return nVar.f15366e.hashCode() + ((hashCode + ((this.f14338a.hashCode() + 1891) * 31)) * 31);
    }

    public final String toString() {
        return "DocumentViewChange(" + this.f14339b + "," + this.f14338a + ")";
    }
}
