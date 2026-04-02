package a6;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: a6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0478g {

    /* renamed from: a  reason: collision with root package name */
    public static final C0472a f7144a = new C0472a("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* renamed from: b  reason: collision with root package name */
    public static final C0472a f7145b = new C0472a("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* renamed from: c  reason: collision with root package name */
    public static final C0472a f7146c = new C0472a("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    public static List k(Class cls, List list, ClassLoader classLoader, m0 m0Var) {
        ?? r7;
        try {
            Class.forName("android.app.Application", false, classLoader);
            r7 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object obj = null;
                try {
                    obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    r7.add(obj);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                r7 = ServiceLoader.load(cls);
            } else {
                r7 = load;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : r7) {
            if (m0Var.e(obj2)) {
                arrayList.add(obj2);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new Q.a(m0Var, 1)));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public abstract AbstractC0471A g(L l8);

    public abstract AbstractC0478g h();

    public abstract ScheduledExecutorService i();

    public abstract u0 j();

    public abstract void l(EnumC0477f enumC0477f, String str);

    public abstract void m(EnumC0477f enumC0477f, String str, Object... objArr);

    public abstract AbstractC0479h n(Q0.A a7, C0476e c0476e);

    public abstract void o(o0 o0Var);

    public abstract void p(i0 i0Var);

    public abstract void q();

    public abstract void r(EnumC0486o enumC0486o, O o7);
}
