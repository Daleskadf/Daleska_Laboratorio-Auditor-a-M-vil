package N4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.slf4j.helpers.i;
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: X  reason: collision with root package name */
    public final Method f3445X;

    /* renamed from: d  reason: collision with root package name */
    public final Method f3446d = Class.class.getMethod("isRecord", null);

    /* renamed from: e  reason: collision with root package name */
    public final Method f3447e = Class.class.getMethod("getRecordComponents", null);
    public final Method f;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f = cls.getMethod("getName", null);
        this.f3445X = cls.getMethod("getType", null);
    }

    @Override // org.slf4j.helpers.i
    public final boolean F(Class cls) {
        try {
            return ((Boolean) this.f3446d.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // org.slf4j.helpers.i
    public final Method w(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // org.slf4j.helpers.i
    public final Constructor x(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3447e.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                clsArr[i7] = (Class) this.f3445X.invoke(objArr[i7], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // org.slf4j.helpers.i
    public final String[] z(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3447e.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                strArr[i7] = (String) this.f.invoke(objArr[i7], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }
}
