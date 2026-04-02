package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m6.AbstractC1448i;
import m6.AbstractC1449j;
import w6.InterfaceC1959a;
import w6.InterfaceC1960b;
import w6.InterfaceC1961c;
import w6.InterfaceC1962d;
import w6.InterfaceC1963e;
import w6.InterfaceC1964f;
import w6.InterfaceC1965g;
import w6.InterfaceC1966h;
import w6.v;
import x5.C2012n;
/* loaded from: classes.dex */
public final class e implements C6.c, d {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f13786b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f13787c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f13788d;

    /* renamed from: a  reason: collision with root package name */
    public final Class f13789a;

    static {
        int i7 = 0;
        List L6 = AbstractC1448i.L(InterfaceC1959a.class, w6.l.class, w6.p.class, w6.q.class, C2012n.class, w6.r.class, w6.s.class, w6.t.class, w6.u.class, v.class, InterfaceC1960b.class, InterfaceC1961c.class, InterfaceC1962d.class, InterfaceC1963e.class, InterfaceC1964f.class, InterfaceC1965g.class, InterfaceC1966h.class, w6.i.class, w6.j.class, w6.k.class, w6.m.class, w6.n.class, w6.o.class);
        ArrayList arrayList = new ArrayList(AbstractC1449j.M(L6));
        for (Object obj : L6) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                arrayList.add(new l6.d((Class) obj, Integer.valueOf(i7)));
                i7 = i8;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f13786b = m6.s.T(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        j.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            j.b(str);
            sb.append(E6.m.h0(str, '.', str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f13786b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f13787c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(m6.s.O(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, E6.m.h0(str2, '.', str2));
        }
        f13788d = linkedHashMap;
    }

    public e(Class jClass) {
        j.e(jClass, "jClass");
        this.f13789a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f13789a;
    }

    public final String b() {
        String str;
        Class jClass = this.f13789a;
        j.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean isArray = jClass.isArray();
        HashMap hashMap = f13787c;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = (String) hashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getCanonicalName();
        }
        return str3;
    }

    public final String c() {
        String str;
        Class jClass = this.f13789a;
        j.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return E6.m.g0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return E6.m.g0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            int S7 = E6.m.S(simpleName, '$', false, 6);
            if (S7 == -1) {
                return simpleName;
            }
            String substring = simpleName.substring(S7 + 1, simpleName.length());
            j.d(substring, "substring(...)");
            return substring;
        }
        boolean isArray = jClass.isArray();
        LinkedHashMap linkedHashMap = f13788d;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getSimpleName();
        }
        return str3;
    }

    public final boolean d(Object obj) {
        Class jClass = this.f13789a;
        j.e(jClass, "jClass");
        Map map = f13786b;
        j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return u.c(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = f7.a.S(s.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && f7.a.S(this).equals(f7.a.S((C6.c) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return f7.a.S(this).hashCode();
    }

    public final String toString() {
        return this.f13789a.toString() + " (Kotlin reflection is not available)";
    }
}
