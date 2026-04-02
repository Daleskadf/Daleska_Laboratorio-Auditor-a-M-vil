package q4;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final String f15352a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15353b;

    public f(String str, String str2) {
        this.f15352a = str;
        this.f15353b = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        int compareTo = this.f15352a.compareTo(fVar.f15352a);
        if (compareTo == 0) {
            return this.f15353b.compareTo(fVar.f15353b);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f15352a.equals(fVar.f15352a) && this.f15353b.equals(fVar.f15353b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15353b.hashCode() + (this.f15352a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseId(");
        sb.append(this.f15352a);
        sb.append(", ");
        return AbstractC0059i.D(sb, this.f15353b, ")");
    }
}
