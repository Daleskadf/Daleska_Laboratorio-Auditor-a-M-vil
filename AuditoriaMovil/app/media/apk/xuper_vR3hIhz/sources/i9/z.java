package i9;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class z extends y {
    public static final Map d() {
        u uVar = u.f14402a;
        t9.i.e(uVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return uVar;
    }

    public static final Map e(Map map) {
        t9.i.g(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                return y.c(map);
            }
            return map;
        }
        return d();
    }

    public static final void f(Map map, Iterable iterable) {
        t9.i.g(map, "<this>");
        t9.i.g(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h9.k kVar = (h9.k) it.next();
            map.put(kVar.a(), kVar.b());
        }
    }

    public static final Map g(Iterable iterable) {
        Object next;
        t9.i.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return h(iterable, new LinkedHashMap(y.a(collection.size())));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return y.b((h9.k) next);
            }
            return d();
        }
        return e(h(iterable, new LinkedHashMap()));
    }

    public static final Map h(Iterable iterable, Map map) {
        t9.i.g(iterable, "<this>");
        t9.i.g(map, FirebaseAnalytics.Param.DESTINATION);
        f(map, iterable);
        return map;
    }
}
