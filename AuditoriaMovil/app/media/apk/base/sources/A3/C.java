package A3;

import D.AbstractC0059i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class C extends d0 implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparator[] f84a;

    public C(C0020s c0020s, C0020s c0020s2) {
        this.f84a = new Comparator[]{c0020s, c0020s2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f84a;
            if (i7 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i7].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i7++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            return Arrays.equals(this.f84a, ((C) obj).f84a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f84a);
    }

    public final String toString() {
        return AbstractC0059i.D(new StringBuilder("Ordering.compound("), Arrays.toString(this.f84a), ")");
    }
}
