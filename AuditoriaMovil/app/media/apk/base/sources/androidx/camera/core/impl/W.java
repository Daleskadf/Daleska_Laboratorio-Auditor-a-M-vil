package androidx.camera.core.impl;

import android.util.ArrayMap;
import j$.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class W extends Z implements V {

    /* renamed from: d  reason: collision with root package name */
    public static final F f7588d = F.OPTIONAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.Z, androidx.camera.core.impl.W] */
    public static W b() {
        return new Z(new TreeMap(Z.f7594b));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.camera.core.impl.Z, androidx.camera.core.impl.W] */
    public static W c(G g3) {
        TreeMap treeMap = new TreeMap(Z.f7594b);
        for (C0501c c0501c : g3.H()) {
            Set<F> U7 = g3.U(c0501c);
            ArrayMap arrayMap = new ArrayMap();
            for (F f : U7) {
                arrayMap.put(f, g3.n(c0501c, f));
            }
            treeMap.put(c0501c, arrayMap);
        }
        return new Z(treeMap);
    }

    public final void i(C0501c c0501c, F f, Object obj) {
        F f4;
        TreeMap treeMap = this.f7596a;
        Map map = (Map) treeMap.get(c0501c);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c0501c, arrayMap);
            arrayMap.put(f, obj);
            return;
        }
        F f8 = (F) Collections.min(map.keySet());
        if (!Objects.equals(map.get(f8), obj) && f8 == (f4 = F.REQUIRED) && f == f4) {
            throw new IllegalArgumentException("Option values conflicts: " + c0501c.f7606a + ", existing value (" + f8 + ")=" + map.get(f8) + ", conflicting (" + f + ")=" + obj);
        }
        map.put(f, obj);
    }

    public final void j(C0501c c0501c, Object obj) {
        i(c0501c, f7588d, obj);
    }
}
