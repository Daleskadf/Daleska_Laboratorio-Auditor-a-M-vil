package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* renamed from: androidx.lifecycle.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552d {

    /* renamed from: c  reason: collision with root package name */
    public static final C0552d f7932c = new C0552d();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7933a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7934b = new HashMap();

    public static void b(HashMap hashMap, C0551c c0551c, EnumC0562n enumC0562n, Class cls) {
        EnumC0562n enumC0562n2 = (EnumC0562n) hashMap.get(c0551c);
        if (enumC0562n2 != null && enumC0562n != enumC0562n2) {
            Method method = c0551c.f7931b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0562n2 + ", new value " + enumC0562n);
        } else if (enumC0562n2 == null) {
            hashMap.put(c0551c, enumC0562n);
        }
    }

    public final C0550b a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f7933a;
        if (superclass != null) {
            C0550b c0550b = (C0550b) hashMap2.get(superclass);
            if (c0550b == null) {
                c0550b = a(superclass, null);
            }
            hashMap.putAll(c0550b.f7929b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0550b c0550b2 = (C0550b) hashMap2.get(cls2);
            if (c0550b2 == null) {
                c0550b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0550b2.f7929b.entrySet()) {
                b(hashMap, (C0551c) entry.getKey(), (EnumC0562n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            E e8 = (E) method.getAnnotation(E.class);
            if (e8 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC0568u.class.isAssignableFrom(parameterTypes[0])) {
                        i7 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i7 = 0;
                }
                EnumC0562n value = e8.value();
                if (parameterTypes.length > 1) {
                    if (EnumC0562n.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC0562n.ON_ANY) {
                            i7 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0551c(i7, method), value, cls);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0550b c0550b3 = new C0550b(hashMap);
        hashMap2.put(cls, c0550b3);
        this.f7934b.put(cls, Boolean.valueOf(z7));
        return c0550b3;
    }
}
