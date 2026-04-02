package K3;

import D.AbstractC0059i;
import F3.s;
import G3.C0119g;
import G3.i;
import M3.j;
import M3.l;
import R3.W;
import R3.Z0;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class e {
    static {
        C0119g[] c0119gArr = {new C0119g(F3.d.class, 9)};
        HashMap hashMap = new HashMap();
        for (C0119g c0119g : c0119gArr) {
            boolean containsKey = hashMap.containsKey(c0119g.f1529a);
            Class cls = c0119g.f1529a;
            if (!containsKey) {
                hashMap.put(cls, c0119g);
            } else {
                throw new IllegalArgumentException(AbstractC0059i.w(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        if (c0119gArr.length > 0) {
            Class cls2 = c0119gArr[0].f1529a;
        }
        DesugarCollections.unmodifiableMap(hashMap);
        int i7 = Z0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void a() {
        s.h(g.f2642b);
        if (J3.d.f2423b.get()) {
            return;
        }
        s.f(new i(W.class, new C0119g[]{new C0119g(F3.d.class, 9)}, 8), true);
        l lVar = d.f2633a;
        j jVar = j.f3240b;
        jVar.e(d.f2633a);
        jVar.d(d.f2634b);
        jVar.c(d.f2635c);
        jVar.b(d.f2636d);
    }
}
