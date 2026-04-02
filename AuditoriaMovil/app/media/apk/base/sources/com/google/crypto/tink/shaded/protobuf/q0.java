package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class q0 extends r0 {
    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final boolean c(Object obj, long j) {
        return this.f9688a.getBoolean(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final byte d(Object obj, long j) {
        return this.f9688a.getByte(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final double e(Object obj, long j) {
        return this.f9688a.getDouble(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final float f(Object obj, long j) {
        return this.f9688a.getFloat(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void k(Object obj, long j, boolean z7) {
        this.f9688a.putBoolean(obj, j, z7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void l(Object obj, long j, byte b5) {
        this.f9688a.putByte(obj, j, b5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void m(Object obj, long j, double d7) {
        this.f9688a.putDouble(obj, j, d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void n(Object obj, long j, float f) {
        this.f9688a.putFloat(obj, j, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f9688a.getClass();
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
            s0.a(th);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final boolean s() {
        Unsafe unsafe = this.f9688a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (s0.e() != null) {
                    try {
                        Class<?> cls3 = this.f9688a.getClass();
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
                        s0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                s0.a(th2);
            }
        }
        return false;
    }
}
