package N3;

import D.AbstractC0059i;
import G3.C0119g;
import R3.C0286c;
import R3.Z0;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class p {
    static {
        C0119g[] c0119gArr = {new C0119g(F3.n.class, 11)};
        HashMap hashMap = new HashMap();
        C0119g c0119g = c0119gArr[0];
        boolean containsKey = hashMap.containsKey(c0119g.f1529a);
        Class cls = c0119g.f1529a;
        if (!containsKey) {
            hashMap.put(cls, c0119g);
            Class cls2 = c0119gArr[0].f1529a;
            DesugarCollections.unmodifiableMap(hashMap);
            int i7 = Z0.CONFIG_NAME_FIELD_NUMBER;
            try {
                a();
                return;
            } catch (GeneralSecurityException e7) {
                throw new ExceptionInInitializerError(e7);
            }
        }
        throw new IllegalArgumentException(AbstractC0059i.w(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }

    public static void a() {
        F3.s.h(s.f3444c);
        F3.s.h(j.f3425a);
        F3.s.f(new c(), true);
        M3.l lVar = o.f3435a;
        M3.j jVar = M3.j.f3240b;
        jVar.e(o.f3435a);
        jVar.d(o.f3436b);
        jVar.c(o.f3437c);
        jVar.b(o.f3438d);
        M3.i iVar = M3.i.f3238b;
        iVar.b(c.f);
        if (J3.d.f2423b.get()) {
            return;
        }
        F3.s.f(new c(C0286c.class, new C0119g[]{new C0119g(F3.n.class, 10)}), true);
        jVar.e(g.f3421a);
        jVar.d(g.f3422b);
        jVar.c(g.f3423c);
        jVar.b(g.f3424d);
        iVar.b(c.f3402e);
    }
}
