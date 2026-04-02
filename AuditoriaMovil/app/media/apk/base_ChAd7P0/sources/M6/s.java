package m6;

import H4.W;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class s extends W {
    public static HashMap N(l6.d... dVarArr) {
        HashMap hashMap = new HashMap(O(dVarArr.length));
        S(hashMap, dVarArr);
        return hashMap;
    }

    public static int O(int i7) {
        if (i7 >= 0) {
            if (i7 < 3) {
                return i7 + 1;
            }
            if (i7 < 1073741824) {
                return (int) ((i7 / 0.75f) + 1.0f);
            }
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return i7;
    }

    public static Map P(l6.d pair) {
        kotlin.jvm.internal.j.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f13865a, pair.f13866b);
        kotlin.jvm.internal.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map Q(l6.d... dVarArr) {
        if (dVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(O(dVarArr.length));
            S(linkedHashMap, dVarArr);
            return linkedHashMap;
        }
        return q.f14075a;
    }

    public static LinkedHashMap R(l6.d... dVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(O(dVarArr.length));
        S(linkedHashMap, dVarArr);
        return linkedHashMap;
    }

    public static final void S(HashMap hashMap, l6.d[] dVarArr) {
        for (l6.d dVar : dVarArr) {
            hashMap.put(dVar.f13865a, dVar.f13866b);
        }
    }

    public static Map T(ArrayList arrayList) {
        q qVar = q.f14075a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(O(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l6.d dVar = (l6.d) it.next();
                    linkedHashMap.put(dVar.f13865a, dVar.f13866b);
                }
                return linkedHashMap;
            }
            return P((l6.d) arrayList.get(0));
        }
        return qVar;
    }
}
