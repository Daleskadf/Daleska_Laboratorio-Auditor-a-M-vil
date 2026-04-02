package N3;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class s implements F3.r {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f3442a = Logger.getLogger(s.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3443b = {0};

    /* renamed from: c  reason: collision with root package name */
    public static final s f3444c = new Object();

    @Override // F3.r
    public final Class a() {
        return F3.n.class;
    }

    @Override // F3.r
    public final Object b(V2.k kVar) {
        byte[] copyOf;
        for (List<F3.p> list : ((ConcurrentHashMap) kVar.f5965b).values()) {
            for (F3.p pVar : list) {
                F3.c cVar = pVar.f1188h;
                if (cVar instanceof q) {
                    q qVar = (q) cVar;
                    byte[] bArr = pVar.f1184c;
                    if (bArr == null) {
                        copyOf = null;
                    } else {
                        copyOf = Arrays.copyOf(bArr, bArr.length);
                    }
                    T3.a a7 = T3.a.a(copyOf);
                    if (!a7.equals(qVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + qVar.c() + " has wrong output prefix (" + qVar.b() + ") instead of (" + a7 + ")");
                    }
                }
            }
        }
        return new r(kVar);
    }

    @Override // F3.r
    public final Class c() {
        return F3.n.class;
    }
}
