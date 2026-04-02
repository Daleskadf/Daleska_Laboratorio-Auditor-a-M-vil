package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class W0 extends X0 {
    @Override // com.google.protobuf.X0
    public final void c(long j, byte[] bArr, long j8, long j9) {
        this.f10038a.copyMemory((Object) null, j, bArr, Y0.f + j8, j9);
    }

    @Override // com.google.protobuf.X0
    public final boolean d(Object obj, long j) {
        return this.f10038a.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.X0
    public final byte e(long j) {
        return this.f10038a.getByte(j);
    }

    @Override // com.google.protobuf.X0
    public final byte f(Object obj, long j) {
        return this.f10038a.getByte(obj, j);
    }

    @Override // com.google.protobuf.X0
    public final double g(Object obj, long j) {
        return this.f10038a.getDouble(obj, j);
    }

    @Override // com.google.protobuf.X0
    public final float h(Object obj, long j) {
        return this.f10038a.getFloat(obj, j);
    }

    @Override // com.google.protobuf.X0
    public final void m(Object obj, long j, boolean z7) {
        this.f10038a.putBoolean(obj, j, z7);
    }

    @Override // com.google.protobuf.X0
    public final void n(Object obj, long j, byte b5) {
        this.f10038a.putByte(obj, j, b5);
    }

    @Override // com.google.protobuf.X0
    public final void o(Object obj, long j, double d7) {
        this.f10038a.putDouble(obj, j, d7);
    }

    @Override // com.google.protobuf.X0
    public final void p(Object obj, long j, float f) {
        this.f10038a.putFloat(obj, j, f);
    }

    @Override // com.google.protobuf.X0
    public final boolean t() {
        if (!super.t()) {
            return false;
        }
        try {
            Class<?> cls = this.f10038a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Y0.a(th);
            return false;
        }
    }

    @Override // com.google.protobuf.X0
    public final boolean u() {
        Unsafe unsafe = this.f10038a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (Y0.e() != null) {
                    try {
                        Class<?> cls3 = this.f10038a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        Y0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                Y0.a(th2);
            }
        }
        return false;
    }
}
