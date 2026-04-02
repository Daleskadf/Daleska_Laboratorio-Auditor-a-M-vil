package L4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class D extends A {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f2917e;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f2918b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f2919c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f2920d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f2917e = hashMap;
    }

    public D(Class cls, C c8, boolean z7) {
        super(c8);
        this.f2920d = new HashMap();
        org.slf4j.helpers.i iVar = N4.c.f3448a;
        Constructor x7 = iVar.x(cls);
        this.f2918b = x7;
        if (z7) {
            E.a(null, x7);
        } else {
            N4.c.f(x7);
        }
        String[] z8 = iVar.z(cls);
        for (int i7 = 0; i7 < z8.length; i7++) {
            this.f2920d.put(z8[i7], Integer.valueOf(i7));
        }
        Class<?>[] parameterTypes = this.f2918b.getParameterTypes();
        this.f2919c = new Object[parameterTypes.length];
        for (int i8 = 0; i8 < parameterTypes.length; i8++) {
            this.f2919c[i8] = f2917e.get(parameterTypes[i8]);
        }
    }

    @Override // L4.A
    public final Object d() {
        return (Object[]) this.f2919c.clone();
    }

    @Override // L4.A
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f2918b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e7) {
            org.slf4j.helpers.i iVar = N4.c.f3448a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalArgumentException e8) {
            e = e8;
            throw new RuntimeException("Failed to invoke constructor '" + N4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e9) {
            e = e9;
            throw new RuntimeException("Failed to invoke constructor '" + N4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + N4.c.b(constructor) + "' with args " + Arrays.toString(objArr), e10.getCause());
        }
    }

    @Override // L4.A
    public final void f(Object obj, Q4.a aVar, C0233z c0233z) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f2920d;
        String str = c0233z.f3020c;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object b5 = c0233z.f3023g.b(aVar);
            if (b5 == null && c0233z.f3024h) {
                StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                m7.append(aVar.n());
                throw new RuntimeException(m7.toString());
            }
            objArr[intValue] = b5;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + N4.c.b(this.f2918b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
