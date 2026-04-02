package M2;

import A2.d;
import android.util.SparseArray;
import io.flutter.plugins.pathprovider.b;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f3222a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f3223b;

    static {
        HashMap hashMap = new HashMap();
        f3223b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        hashMap.put(d.VERY_LOW, 1);
        hashMap.put(d.HIGHEST, 2);
        for (d dVar : hashMap.keySet()) {
            f3222a.append(((Integer) f3223b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f3223b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f3222a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(b.e(i7, "Unknown Priority for value "));
    }
}
