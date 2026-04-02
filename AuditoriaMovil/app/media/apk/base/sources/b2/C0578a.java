package b2;

import F.f;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.example.appecoactivate.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* renamed from: b2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile C0578a f8160d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f8161e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f8164c;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f8163b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8162a = new HashMap();

    public C0578a(Context context) {
        this.f8164c = context.getApplicationContext();
    }

    public static C0578a c(Context context) {
        if (f8160d == null) {
            synchronized (f8161e) {
                try {
                    if (f8160d == null) {
                        f8160d = new C0578a(context);
                    }
                } finally {
                }
            }
        }
        return f8160d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f8164c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f8163b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0579b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (f.w()) {
            try {
                Trace.beginSection(f.D(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f8162a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                InterfaceC0579b interfaceC0579b = (InterfaceC0579b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a7 = interfaceC0579b.a();
                if (!a7.isEmpty()) {
                    for (Class cls2 : a7) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0579b.b(this.f8164c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
