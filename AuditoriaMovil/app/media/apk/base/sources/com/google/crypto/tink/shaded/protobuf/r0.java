package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f9688a;

    public r0(Unsafe unsafe) {
        this.f9688a = unsafe;
    }

    public final int a(Class cls) {
        return this.f9688a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f9688a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j);

    public abstract byte d(Object obj, long j);

    public abstract double e(Object obj, long j);

    public abstract float f(Object obj, long j);

    public final int g(Object obj, long j) {
        return this.f9688a.getInt(obj, j);
    }

    public final long h(Object obj, long j) {
        return this.f9688a.getLong(obj, j);
    }

    public final Object i(Object obj, long j) {
        return this.f9688a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.f9688a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j, boolean z7);

    public abstract void l(Object obj, long j, byte b5);

    public abstract void m(Object obj, long j, double d7);

    public abstract void n(Object obj, long j, float f);

    public final void o(long j, Object obj, int i7) {
        this.f9688a.putInt(obj, j, i7);
    }

    public final void p(Object obj, long j, long j8) {
        this.f9688a.putLong(obj, j, j8);
    }

    public final void q(Object obj, long j, Object obj2) {
        this.f9688a.putObject(obj, j, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f9688a;
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
            s0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
