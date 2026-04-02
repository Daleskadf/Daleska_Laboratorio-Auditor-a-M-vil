package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class X0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f10038a;

    public X0(Unsafe unsafe) {
        this.f10038a = unsafe;
    }

    public final int a(Class cls) {
        return this.f10038a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f10038a.arrayIndexScale(cls);
    }

    public abstract void c(long j, byte[] bArr, long j8, long j9);

    public abstract boolean d(Object obj, long j);

    public abstract byte e(long j);

    public abstract byte f(Object obj, long j);

    public abstract double g(Object obj, long j);

    public abstract float h(Object obj, long j);

    public final int i(Object obj, long j) {
        return this.f10038a.getInt(obj, j);
    }

    public final long j(Object obj, long j) {
        return this.f10038a.getLong(obj, j);
    }

    public final Object k(Object obj, long j) {
        return this.f10038a.getObject(obj, j);
    }

    public final long l(Field field) {
        return this.f10038a.objectFieldOffset(field);
    }

    public abstract void m(Object obj, long j, boolean z7);

    public abstract void n(Object obj, long j, byte b5);

    public abstract void o(Object obj, long j, double d7);

    public abstract void p(Object obj, long j, float f);

    public final void q(long j, Object obj, int i7) {
        this.f10038a.putInt(obj, j, i7);
    }

    public final void r(Object obj, long j, long j8) {
        this.f10038a.putLong(obj, j, j8);
    }

    public final void s(Object obj, long j, Object obj2) {
        this.f10038a.putObject(obj, j, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.f10038a;
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
            Y0.a(th);
            return false;
        }
    }

    public abstract boolean u();
}
