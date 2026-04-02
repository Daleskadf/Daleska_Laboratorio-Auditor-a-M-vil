package d4;

import c3.h;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f12530a = Object.class;

    /* renamed from: b  reason: collision with root package name */
    public static final Annotation[] f12531b = new Annotation[0];

    /* renamed from: c  reason: collision with root package name */
    public static final a[] f12532c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Iterator f12533d = Collections.emptyIterator();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Constructor f12534a;

        /* renamed from: b  reason: collision with root package name */
        public transient Annotation[] f12535b;

        /* renamed from: c  reason: collision with root package name */
        public transient Annotation[][] f12536c;

        /* renamed from: d  reason: collision with root package name */
        public int f12537d = -1;

        public a(Constructor constructor) {
            this.f12534a = constructor;
        }

        public Constructor a() {
            return this.f12534a;
        }

        public Annotation[] b() {
            Annotation[] annotationArr = this.f12535b;
            if (annotationArr == null) {
                Annotation[] declaredAnnotations = this.f12534a.getDeclaredAnnotations();
                this.f12535b = declaredAnnotations;
                return declaredAnnotations;
            }
            return annotationArr;
        }

        public Class c() {
            return this.f12534a.getDeclaringClass();
        }

        public int d() {
            int i10 = this.f12537d;
            if (i10 < 0) {
                int length = this.f12534a.getParameterTypes().length;
                this.f12537d = length;
                return length;
            }
            return i10;
        }

        public Annotation[][] e() {
            Annotation[][] annotationArr = this.f12536c;
            if (annotationArr == null) {
                Annotation[][] parameterAnnotations = this.f12534a.getParameterAnnotations();
                this.f12536c = parameterAnnotations;
                return parameterAnnotations;
            }
            return annotationArr;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f12538c = new b();

        /* renamed from: a  reason: collision with root package name */
        public final Field f12539a = d(EnumSet.class, "elementType", Class.class);

        /* renamed from: b  reason: collision with root package name */
        public final Field f12540b = d(EnumMap.class, "elementType", Class.class);

        public static Field d(Class cls, String str, Class cls2) {
            Field field;
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    field = declaredFields[i10];
                    if (str.equals(field.getName()) && field.getType() == cls2) {
                        break;
                    }
                    i10++;
                } else {
                    field = null;
                    break;
                }
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }

        public Class a(EnumMap enumMap) {
            Field field = this.f12540b;
            if (field != null) {
                return (Class) c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }

        public Class b(EnumSet enumSet) {
            Field field = this.f12539a;
            if (field != null) {
                return (Class) c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        public final Object c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }

    public static a[] A(Class cls) {
        if (!cls.isInterface() && !R(cls)) {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            a[] aVarArr = new a[length];
            for (int i10 = 0; i10 < length; i10++) {
                aVarArr[i10] = new a(declaredConstructors[i10]);
            }
            return aVarArr;
        }
        return f12532c;
    }

    public static Class B(Class cls) {
        if (R(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] C(Class cls) {
        return cls.getGenericInterfaces();
    }

    public static Type D(Class cls) {
        return cls.getGenericSuperclass();
    }

    public static Class E(Class cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (I(cls)) {
                    return null;
                }
                return B(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static Throwable F(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static String G(k3.j jVar) {
        if (jVar == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append('`');
        sb.append(jVar.c());
        sb.append('`');
        return sb.toString();
    }

    public static boolean H(Object obj, Class cls) {
        if (obj != null && obj.getClass() == cls) {
            return true;
        }
        return false;
    }

    public static boolean I(Class cls) {
        if (!R(cls) && cls.getEnclosingMethod() != null) {
            return true;
        }
        return false;
    }

    public static boolean J(Class cls) {
        if (cls != Void.class && cls != Void.TYPE && cls != l3.j.class) {
            return false;
        }
        return true;
    }

    public static boolean K(Class cls) {
        if ((cls.getModifiers() & 1536) == 0) {
            return true;
        }
        return false;
    }

    public static boolean L(Class cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean M(Class cls) {
        String name = cls.getName();
        if (!name.startsWith("java.") && !name.startsWith("javax.")) {
            return false;
        }
        return true;
    }

    public static boolean N(Class cls) {
        if (cls.getAnnotation(l3.a.class) != null) {
            return true;
        }
        return false;
    }

    public static boolean O(Object obj) {
        if (obj != null && !N(obj.getClass())) {
            return false;
        }
        return true;
    }

    public static String P(Class cls, boolean z10) {
        try {
            boolean isStatic = Modifier.isStatic(cls.getModifiers());
            if (!isStatic && I(cls)) {
                return "local/anonymous";
            }
            if (!z10 && !isStatic) {
                if (B(cls) != null) {
                    return "non-static member class";
                }
                return null;
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static boolean Q(Class cls) {
        if (!Modifier.isStatic(cls.getModifiers()) && B(cls) != null) {
            return true;
        }
        return false;
    }

    public static boolean R(Class cls) {
        if (cls != f12530a && !cls.isPrimitive()) {
            return false;
        }
        return true;
    }

    public static boolean S(Class cls) {
        String name = cls.getName();
        if (!name.startsWith("net.sf.cglib.proxy.") && !name.startsWith("org.hibernate.proxy.")) {
            return false;
        }
        return true;
    }

    public static boolean T(Class cls) {
        Class superclass = cls.getSuperclass();
        if (superclass != null && "java.lang.Record".equals(superclass.getName())) {
            return true;
        }
        return false;
    }

    public static String U(String str) {
        if (str == null) {
            return "[null]";
        }
        return d(str);
    }

    public static String V(k3.x xVar) {
        if (xVar == null) {
            return "[null]";
        }
        return d(xVar.c());
    }

    public static String W(r rVar) {
        if (rVar == null) {
            return "[null]";
        }
        return d(rVar.getName());
    }

    public static String X(Class cls) {
        String name;
        if (cls == null) {
            return "[null]";
        }
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            name = cls.getSimpleName();
        } else {
            name = cls.getName();
        }
        if (i10 > 0) {
            StringBuilder sb = new StringBuilder(name);
            do {
                sb.append("[]");
                i10--;
            } while (i10 > 0);
            name = sb.toString();
        }
        return e(name);
    }

    public static Object Y(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    public static String Z(String str) {
        return str == null ? "" : str;
    }

    public static void a(Class cls, Class cls2, Collection collection, boolean z10) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z10) {
                if (collection.contains(cls)) {
                    return;
                }
                collection.add(cls);
            }
            for (Class cls3 : c(cls)) {
                a(cls3, cls2, collection, true);
            }
            a(cls.getSuperclass(), cls2, collection, true);
        }
    }

    public static String a0(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Method[] b(Class cls, Throwable th) {
        throw new IllegalArgumentException(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), th.getClass().getName(), th.getMessage()), th);
    }

    public static Class b0(Class cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static Class[] c(Class cls) {
        return cls.getInterfaces();
    }

    public static String c0(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return String.format("\"%s\"", obj);
    }

    public static String d(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb.toString();
    }

    public static Class d0(k3.j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.q();
    }

    public static String e(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static void e0(Throwable th) {
        f0(th, th.getMessage());
    }

    public static String f(Class cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void f0(Throwable th, String str) {
        j0(th);
        h0(th);
        throw new IllegalArgumentException(str, th);
    }

    public static void g(Member member, boolean z10) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z10) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e10) {
                if (accessibleObject.isAccessible()) {
                    return;
                }
                Class<?> declaringClass = member.getDeclaringClass();
                throw new IllegalArgumentException("Cannot access " + member + " (from class " + declaringClass.getName() + "; failed to set access: " + e10.getMessage());
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static Object g0(k3.g gVar, IOException iOException) {
        if (iOException instanceof k3.l) {
            throw ((k3.l) iOException);
        }
        k3.l j10 = k3.l.j(gVar, iOException.getMessage());
        j10.initCause(iOException);
        throw j10;
    }

    public static String h(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return "[null]";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return X(cls);
    }

    public static Throwable h0(Throwable th) {
        if (!(th instanceof Error)) {
            return th;
        }
        throw ((Error) th);
    }

    public static Class i(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static Throwable i0(Throwable th) {
        if (!(th instanceof IOException)) {
            return th;
        }
        throw ((IOException) th);
    }

    public static void j(c3.h hVar, Closeable closeable, Exception exc) {
        if (hVar != null) {
            hVar.q(h.b.AUTO_CLOSE_JSON_CONTENT);
            try {
                hVar.close();
            } catch (Exception e10) {
                exc.addSuppressed(e10);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        i0(exc);
        j0(exc);
        throw new RuntimeException(exc);
    }

    public static Throwable j0(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return th;
        }
        throw ((RuntimeException) th);
    }

    public static void k(c3.h hVar, Exception exc) {
        hVar.q(h.b.AUTO_CLOSE_JSON_CONTENT);
        try {
            hVar.close();
        } catch (Exception e10) {
            exc.addSuppressed(e10);
        }
        i0(exc);
        j0(exc);
        throw new RuntimeException(exc);
    }

    public static Throwable k0(Throwable th) {
        return i0(F(th));
    }

    public static Object l(Class cls, boolean z10) {
        Constructor q10 = q(cls, z10);
        if (q10 != null) {
            try {
                return q10.newInstance(new Object[0]);
            } catch (Exception e10) {
                m0(e10, "Failed to instantiate class " + cls.getName() + ", problem: " + e10.getMessage());
                return null;
            }
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
    }

    public static void l0(Throwable th) {
        e0(F(th));
    }

    public static Object m(Class cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static void m0(Throwable th, String str) {
        f0(F(th), str);
    }

    public static Iterator n() {
        return f12533d;
    }

    public static void n0(Class cls, Object obj, String str) {
        if (obj.getClass() == cls) {
            return;
        }
        throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
    }

    public static String o(Throwable th) {
        if (th instanceof c3.l) {
            return ((c3.l) th).c();
        }
        return th.getMessage();
    }

    public static Class o0(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static Annotation[] p(Class cls) {
        if (R(cls)) {
            return f12531b;
        }
        return cls.getDeclaredAnnotations();
    }

    public static Constructor q(Class cls, boolean z10) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z10) {
                g(declaredConstructor, z10);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e10) {
            m0(e10, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e10.getMessage());
            return null;
        }
    }

    public static Class r(Class cls) {
        if (cls.getSuperclass() != Enum.class) {
            return cls.getSuperclass();
        }
        return cls;
    }

    public static Class s(Enum r02) {
        return r02.getDeclaringClass();
    }

    public static Class t(EnumMap enumMap) {
        if (!enumMap.isEmpty()) {
            return s((Enum) enumMap.keySet().iterator().next());
        }
        return b.f12538c.a(enumMap);
    }

    public static Class u(EnumSet enumSet) {
        if (!enumSet.isEmpty()) {
            return s((Enum) enumSet.iterator().next());
        }
        return b.f12538c.b(enumSet);
    }

    public static Enum v(Class cls, Class cls2) {
        Field[] declaredFields;
        Enum[] enumArr;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum r82 : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(r82.name())) {
                        return r82;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static List w(Class cls, Class cls2, boolean z10) {
        if (cls != null && cls != cls2 && cls != Object.class) {
            ArrayList arrayList = new ArrayList(8);
            a(cls, cls2, arrayList, z10);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static List x(Class cls, Class cls2, boolean z10) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z10) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static String y(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return "unknown";
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return X(cls);
    }

    public static Method[] z(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return b(cls, e10);
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Throwable th) {
                    return b(cls, th);
                }
            } catch (ClassNotFoundException e11) {
                e10.addSuppressed(e11);
                return b(cls, e10);
            }
        } catch (Throwable th2) {
            return b(cls, th2);
        }
    }
}
