package F3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList f1176a = new CopyOnWriteArrayList();

    public static L3.c a(String str) {
        boolean startsWith;
        Iterator it = f1176a.iterator();
        while (it.hasNext()) {
            L3.c cVar = (L3.c) it.next();
            synchronized (cVar) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(io.flutter.plugins.pathprovider.b.h("No KMS client does support: ", str));
    }
}
