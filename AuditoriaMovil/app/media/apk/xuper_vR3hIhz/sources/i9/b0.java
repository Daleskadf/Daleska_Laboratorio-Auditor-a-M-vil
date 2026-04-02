package i9;

import java.util.Set;
/* loaded from: classes3.dex */
public abstract class b0 extends a0 {
    public static final Set b() {
        return v.f14403a;
    }

    public static final Set c(Set set) {
        t9.i.g(set, "<this>");
        int size = set.size();
        if (size != 0) {
            if (size == 1) {
                return a0.a(set.iterator().next());
            }
            return set;
        }
        return b();
    }
}
