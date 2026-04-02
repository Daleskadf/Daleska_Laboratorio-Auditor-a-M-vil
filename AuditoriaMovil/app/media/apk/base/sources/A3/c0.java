package A3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class c0 extends d0 implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f132a = new d0();

    @Override // A3.d0
    public final d0 a() {
        return l0.f171a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
