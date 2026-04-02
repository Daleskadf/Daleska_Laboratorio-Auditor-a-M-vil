package N3;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.List;
/* loaded from: classes.dex */
public final class j implements F3.r {

    /* renamed from: a  reason: collision with root package name */
    public static final j f3425a = new Object();

    @Override // F3.r
    public final Class a() {
        return h.class;
    }

    @Override // F3.r
    public final Object b(V2.k kVar) {
        if (((F3.p) kVar.f5966c) != null) {
            for (List<F3.p> list : ((ConcurrentHashMap) kVar.f5965b).values()) {
                for (F3.p pVar : list) {
                    h hVar = (h) pVar.f1182a;
                }
            }
            return new Object();
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }

    @Override // F3.r
    public final Class c() {
        return h.class;
    }
}
