package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static Map f2580a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map f2581b = new HashMap();

    public static c a(Constructor constructor, Object obj) {
        try {
            androidx.appcompat.app.m.a(constructor.newInstance(obj));
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Constructor b(Class cls) {
        String str;
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r02 != null) {
                str = r02.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String c10 = c(canonicalName);
            if (!str.isEmpty()) {
                c10 = str + "." + c10;
            }
            Constructor declaredConstructor = Class.forName(c10).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int d(Class cls) {
        Integer num = (Integer) f2580a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        f2580a.put(cls, Integer.valueOf(g10));
        return g10;
    }

    public static boolean e(Class cls) {
        if (cls != null && f.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public static e f(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) == 2) {
            List list = (List) f2581b.get(cls);
            if (list.size() == 1) {
                a((Constructor) list.get(0), obj);
                return new SingleGeneratedAdapterObserver(null);
            }
            c[] cVarArr = new c[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                a((Constructor) list.get(i10), obj);
                cVarArr[i10] = null;
            }
            return new CompositeGeneratedAdaptersObserver(cVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    public static int g(Class cls) {
        ArrayList arrayList;
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b10 = b(cls);
        if (b10 != null) {
            f2581b.put(cls, Collections.singletonList(b10));
            return 2;
        } else if (b.f2553c.d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f2581b.get(superclass));
            } else {
                arrayList = null;
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (e(cls2)) {
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f2581b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2581b.put(cls, arrayList);
            return 2;
        }
    }
}
