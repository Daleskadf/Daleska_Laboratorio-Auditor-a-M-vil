package N;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final O.b f3310a;

    /* renamed from: b  reason: collision with root package name */
    public final O.b f3311b;

    public a(O.b bVar, O.b bVar2) {
        this.f3310a = bVar;
        this.f3311b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3310a.equals(aVar.f3310a) && this.f3311b.equals(aVar.f3311b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3310a.hashCode() ^ 1000003) * 1000003) ^ this.f3311b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f3310a + ", secondaryOutConfig=" + this.f3311b + "}";
    }
}
