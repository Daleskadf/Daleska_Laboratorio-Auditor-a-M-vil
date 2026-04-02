package F3;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1162a = new byte[0];

    public static j a(String str) {
        Map unmodifiableMap;
        AtomicReference atomicReference = s.f1190a;
        synchronized (s.class) {
            unmodifiableMap = DesugarCollections.unmodifiableMap(s.f1193d);
        }
        j jVar = (j) unmodifiableMap.get(str);
        if (jVar != null) {
            return jVar;
        }
        throw new GeneralSecurityException(io.flutter.plugins.pathprovider.b.h("cannot find key template: ", str));
    }
}
