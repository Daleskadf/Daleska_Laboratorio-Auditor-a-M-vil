package q4;
/* renamed from: q4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1711d implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final k f15349a;

    /* renamed from: b  reason: collision with root package name */
    public final j f15350b;

    public C1711d(k kVar, j jVar) {
        if (kVar != null) {
            this.f15349a = kVar;
            if (jVar != null) {
                this.f15350b = jVar;
                return;
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null fieldPath");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1711d c1711d = (C1711d) obj;
        int compareTo = this.f15349a.compareTo(c1711d.f15349a);
        if (compareTo == 0) {
            return this.f15350b.compareTo(c1711d.f15350b);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1711d)) {
            return false;
        }
        C1711d c1711d = (C1711d) obj;
        if (this.f15349a.equals(c1711d.f15349a) && this.f15350b.equals(c1711d.f15350b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15349a.hashCode() ^ 1000003) * 1000003) ^ this.f15350b.hashCode();
    }

    public final String toString() {
        return "Segment{fieldPath=" + this.f15349a + ", kind=" + this.f15350b + "}";
    }
}
