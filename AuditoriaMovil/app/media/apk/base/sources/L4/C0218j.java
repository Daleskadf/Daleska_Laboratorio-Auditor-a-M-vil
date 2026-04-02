package L4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: L4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218j extends I4.G {

    /* renamed from: d  reason: collision with root package name */
    public static final C0217i f2957d = new C0217i();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2958a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2959b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f2960c = new HashMap();

    public C0218j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i7 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i7] = field;
                    i7++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i7);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String name = r42.name();
                String str = r42.toString();
                J4.b bVar = (J4.b) field2.getAnnotation(J4.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        this.f2958a.put(str2, r42);
                    }
                }
                this.f2958a.put(name, r42);
                this.f2959b.put(str, r42);
                this.f2960c.put(r42, name);
            }
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        String B7 = aVar.B();
        Enum r02 = (Enum) this.f2958a.get(B7);
        if (r02 == null) {
            return (Enum) this.f2959b.get(B7);
        }
        return r02;
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String str;
        Enum r32 = (Enum) obj;
        if (r32 == null) {
            str = null;
        } else {
            str = (String) this.f2960c.get(r32);
        }
        cVar.x(str);
    }
}
