package A3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class l0 extends d0 implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f171a = new d0();

    @Override // A3.d0
    public final d0 a() {
        return c0.f132a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
