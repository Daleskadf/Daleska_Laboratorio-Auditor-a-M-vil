package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
/* renamed from: androidx.lifecycle.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0571x {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f7952a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f7953b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0567t interfaceC0567t) {
        try {
            kotlin.jvm.internal.j.d(constructor.newInstance(interfaceC0567t), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z7;
        boolean z8;
        boolean z9;
        String fullPackage;
        int i7 = 1;
        HashMap hashMap = f7952a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String name = cls.getCanonicalName();
                if (r42 != null) {
                    fullPackage = r42.getName();
                } else {
                    fullPackage = StringUtils.EMPTY;
                }
                kotlin.jvm.internal.j.d(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    kotlin.jvm.internal.j.d(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    kotlin.jvm.internal.j.d(name, "this as java.lang.String).substring(startIndex)");
                }
                kotlin.jvm.internal.j.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = E6.m.Z(name, ".", "_").concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    concat = fullPackage + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException(e7);
            }
            HashMap hashMap2 = f7953b;
            if (constructor != null) {
                hashMap2.put(cls, G.i.A(constructor));
            } else {
                C0552d c0552d = C0552d.f7932c;
                HashMap hashMap3 = c0552d.f7934b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z7 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                if (((E) declaredMethods[i8].getAnnotation(E.class)) != null) {
                                    c0552d.a(cls, declaredMethods);
                                    z7 = true;
                                    break;
                                }
                                i8++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z7 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e8) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
                    }
                }
                if (!z7) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0567t.class.isAssignableFrom(superclass)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        kotlin.jvm.internal.j.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.j.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    kotlin.jvm.internal.j.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            Class<?> intrface = interfaces[i9];
                            if (intrface != null && InterfaceC0567t.class.isAssignableFrom(intrface)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                kotlin.jvm.internal.j.d(intrface, "intrface");
                                if (b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                kotlin.jvm.internal.j.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i9++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i7 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i7));
        return i7;
    }
}
