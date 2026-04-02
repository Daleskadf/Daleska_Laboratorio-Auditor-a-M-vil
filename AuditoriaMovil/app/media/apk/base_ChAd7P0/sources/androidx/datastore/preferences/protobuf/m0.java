package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f7850a;

    public m0(Unsafe unsafe) {
        this.f7850a = unsafe;
    }

    public final int a(Class cls) {
        return this.f7850a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f7850a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j);

    public abstract double d(Object obj, long j);

    public abstract float e(Object obj, long j);

    public final int f(Object obj, long j) {
        return this.f7850a.getInt(obj, j);
    }

    public final long g(Object obj, long j) {
        return this.f7850a.getLong(obj, j);
    }

    public final Object h(Object obj, long j) {
        return this.f7850a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f7850a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z7);

    public abstract void k(Object obj, long j, byte b5);

    public abstract void l(Object obj, long j, double d7);

    public abstract void m(Object obj, long j, float f);

    public final void n(long j, Object obj, int i7) {
        this.f7850a.putInt(obj, j, i7);
    }

    public final void o(Object obj, long j, long j8) {
        this.f7850a.putLong(obj, j, j8);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.f7850a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f7850a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            n0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
