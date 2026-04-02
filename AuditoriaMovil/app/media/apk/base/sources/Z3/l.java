package z3;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public final class l implements k, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final List f16889a;

    public l(List list) {
        this.f16889a = list;
    }

    @Override // z3.k
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f16889a;
            if (i7 < list.size()) {
                if (!((k) list.get(i7)).apply(obj)) {
                    return false;
                }
                i7++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f16889a.equals(((l) obj).f16889a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16889a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z7 = true;
        for (Object obj : this.f16889a) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
