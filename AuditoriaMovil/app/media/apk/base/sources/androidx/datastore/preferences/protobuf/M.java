package androidx.datastore.preferences.protobuf;

import java.util.Map;
/* loaded from: classes.dex */
public final class M {
    public static int a(int i7, Object obj, Object obj2) {
        L l8 = (L) obj;
        K k2 = (K) obj2;
        int i8 = 0;
        if (!l8.isEmpty()) {
            for (Map.Entry entry : l8.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                k2.getClass();
                int g02 = C0534k.g0(i7);
                int a7 = K.a(k2.f7759a, key, value);
                i8 += C0534k.i0(a7) + a7 + g02;
            }
        }
        return i8;
    }

    public static L b(Object obj, Object obj2) {
        L l8 = (L) obj;
        L l9 = (L) obj2;
        if (!l9.isEmpty()) {
            if (!l8.f7761a) {
                l8 = l8.b();
            }
            l8.a();
            if (!l9.isEmpty()) {
                l8.putAll(l9);
            }
        }
        return l8;
    }

    public static void c(Object obj) {
        ((L) obj).f7761a = false;
    }
}
