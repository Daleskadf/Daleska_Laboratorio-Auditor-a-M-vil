package i9;

import java.util.Collection;
/* loaded from: classes3.dex */
public abstract class o extends n {
    public static final boolean n(Collection collection, Iterable iterable) {
        t9.i.g(collection, "<this>");
        t9.i.g(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        for (Object obj : iterable) {
            if (collection.add(obj)) {
                z10 = true;
            }
        }
        return z10;
    }
}
