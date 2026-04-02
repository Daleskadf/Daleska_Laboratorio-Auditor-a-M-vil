package q4;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class q implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final q f15370b = new q(new U3.p(0, 0));

    /* renamed from: a  reason: collision with root package name */
    public final U3.p f15371a;

    public q(U3.p pVar) {
        this.f15371a = pVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(q qVar) {
        return this.f15371a.compareTo(qVar.f15371a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q) && compareTo((q) obj) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15371a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotVersion(seconds=");
        U3.p pVar = this.f15371a;
        sb.append(pVar.f5765a);
        sb.append(", nanos=");
        return AbstractC0059i.B(sb, pVar.f5766b, ")");
    }
}
