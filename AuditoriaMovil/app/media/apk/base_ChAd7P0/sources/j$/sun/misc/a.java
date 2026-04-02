package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f12570b;

    /* renamed from: a  reason: collision with root package name */
    private final Unsafe f12571a;

    static {
        Field i7 = i();
        i7.setAccessible(true);
        try {
            f12570b = new a((Unsafe) i7.get(null));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("Couldn't get the Unsafe", e7);
        }
    }

    a(Unsafe unsafe) {
        this.f12571a = unsafe;
    }

    private static Field i() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e7) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e7);
        }
    }

    public static a h() {
        return f12570b;
    }

    public final int f(Object obj, long j) {
        int intVolatile;
        do {
            intVolatile = this.f12571a.getIntVolatile(obj, j);
        } while (!this.f12571a.compareAndSwapInt(obj, j, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final long k(Field field) {
        return this.f12571a.objectFieldOffset(field);
    }

    public final long j(Class cls, String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e7) {
            throw new AssertionError("Cannot find field:", e7);
        }
    }

    public final int a(Class cls) {
        return this.f12571a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f12571a.arrayIndexScale(cls);
    }

    public final Object g(Object obj, long j) {
        return this.f12571a.getObjectVolatile(obj, j);
    }

    public final void l(Object obj, long j, Object obj2) {
        this.f12571a.putObjectVolatile(obj, j, obj2);
    }

    public final boolean c(Object obj, long j, int i7, int i8) {
        return this.f12571a.compareAndSwapInt(obj, j, i7, i8);
    }

    public final boolean d(Object obj, long j, long j8, long j9) {
        return this.f12571a.compareAndSwapLong(obj, j, j8, j9);
    }

    public final boolean e(Object obj, long j, Object obj2) {
        return j$.com.android.tools.r8.a.i(this.f12571a, obj, j, obj2);
    }
}
