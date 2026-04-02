package K6;

import F6.x0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f2797a;

    static {
        String str;
        int i7 = x.f2808a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new G6.a()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            List H7 = D6.f.H(new D6.a(new D6.c(it, 2)));
            Iterator it2 = H7.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int b5 = ((G6.a) obj).b();
                    do {
                        Object next = it2.next();
                        int b7 = ((G6.a) next).b();
                        if (b5 < b7) {
                            obj = next;
                            b5 = b7;
                        }
                    } while (it2.hasNext());
                }
            }
            G6.a aVar = (G6.a) obj;
            if (aVar != null) {
                try {
                    x0 a7 = aVar.a(H7);
                    if (a7 != null) {
                        f2797a = a7;
                        return;
                    }
                } catch (Throwable th) {
                    aVar.c();
                    throw th;
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
