package q4;

import D.AbstractC0059i;
/* renamed from: q4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1709b implements Comparable {

    /* renamed from: d  reason: collision with root package name */
    public static final C1709b f15342d = new C1709b(q.f15370b, h.b(), -1);

    /* renamed from: e  reason: collision with root package name */
    public static final K1.d f15343e = new K1.d(27);

    /* renamed from: a  reason: collision with root package name */
    public final q f15344a;

    /* renamed from: b  reason: collision with root package name */
    public final h f15345b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15346c;

    public C1709b(q qVar, h hVar, int i7) {
        if (qVar != null) {
            this.f15344a = qVar;
            if (hVar != null) {
                this.f15345b = hVar;
                this.f15346c = i7;
                return;
            }
            throw new NullPointerException("Null documentKey");
        }
        throw new NullPointerException("Null readTime");
    }

    public static C1709b b(n nVar) {
        return new C1709b(nVar.f15365d, nVar.f15362a, -1);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(C1709b c1709b) {
        int compareTo = this.f15344a.compareTo(c1709b.f15344a);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.f15345b.compareTo(c1709b.f15345b);
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return Integer.compare(this.f15346c, c1709b.f15346c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1709b)) {
            return false;
        }
        C1709b c1709b = (C1709b) obj;
        if (this.f15344a.equals(c1709b.f15344a) && this.f15345b.equals(c1709b.f15345b) && this.f15346c == c1709b.f15346c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15344a.f15371a.hashCode() ^ 1000003) * 1000003) ^ this.f15345b.f15357a.hashCode()) * 1000003) ^ this.f15346c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexOffset{readTime=");
        sb.append(this.f15344a);
        sb.append(", documentKey=");
        sb.append(this.f15345b);
        sb.append(", largestBatchId=");
        return AbstractC0059i.B(sb, this.f15346c, "}");
    }
}
