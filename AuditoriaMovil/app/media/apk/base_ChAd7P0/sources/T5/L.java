package T5;

import F6.C0097k0;
import android.content.Context;
import android.util.Base64;
import f5.C0993a;
import g1.C1006c;
import h3.AbstractC1079a;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p0.C1636d;
import r0.C1725e;
import s0.C1750a;
import s0.C1751b;
/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C6.g[] f5420a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1751b f5421b;

    static {
        kotlin.jvm.internal.m mVar = new kotlin.jvm.internal.m(L.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        kotlin.jvm.internal.s.f13797a.getClass();
        f5420a = new C6.g[]{mVar};
        C1750a c1750a = C1750a.f15542a;
        M6.e eVar = F6.P.f1238b;
        C0097k0 c0097k0 = new C0097k0(null);
        eVar.getClass();
        f5421b = new C1751b(c1750a, F6.H.b(AbstractC1079a.q(eVar, c0097k0)));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [v4.d, java.lang.Object] */
    public static final C1006c a(Context thisRef) {
        C1006c c1006c;
        C1751b c1751b = f5421b;
        C6.g property = f5420a[0];
        c1751b.getClass();
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        C1006c c1006c2 = c1751b.f15546d;
        if (c1006c2 == null) {
            synchronized (c1751b.f15545c) {
                try {
                    if (c1751b.f15546d == null) {
                        Context applicationContext = thisRef.getApplicationContext();
                        w6.l lVar = c1751b.f15543a;
                        kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                        List migrations = (List) lVar.invoke(applicationContext);
                        F6.D d7 = c1751b.f15544b;
                        l2.i iVar = new l2.i(1, applicationContext, c1751b);
                        kotlin.jvm.internal.j.e(migrations, "migrations");
                        c1751b.f15546d = new C1006c(new C1006c(new p0.N(new C1725e(Q6.j.f4473a, new R6.d(iVar, 4)), G.i.A(new C1636d(migrations, null)), new Object(), d7)));
                    }
                    c1006c = c1751b.f15546d;
                    kotlin.jvm.internal.j.b(c1006c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c1006c;
        }
        return c1006c2;
    }

    public static final boolean b(String key, Object obj, Set set) {
        kotlin.jvm.internal.j.e(key, "key");
        if (set == null) {
            if (!(obj instanceof Boolean) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Double)) {
                return false;
            }
            return true;
        }
        return set.contains(key);
    }

    public static final Object c(Object obj, C0993a c0993a) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (E6.m.e0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                if (!E6.m.e0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                    String listString = str.substring(40);
                    kotlin.jvm.internal.j.d(listString, "substring(...)");
                    c0993a.getClass();
                    kotlin.jvm.internal.j.e(listString, "listString");
                    Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
                    kotlin.jvm.internal.j.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) readObject) {
                        if (obj2 instanceof String) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
                return obj;
            } else if (E6.m.e0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                String substring = str.substring(40);
                kotlin.jvm.internal.j.d(substring, "substring(...)");
                return Double.valueOf(Double.parseDouble(substring));
            } else {
                return obj;
            }
        }
        return obj;
    }
}
