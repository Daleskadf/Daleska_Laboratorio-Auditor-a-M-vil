package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class l0 extends m0 {
    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean c(Object obj, long j) {
        return this.f7850a.getBoolean(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final double d(Object obj, long j) {
        return this.f7850a.getDouble(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final float e(Object obj, long j) {
        return this.f7850a.getFloat(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void j(Object obj, long j, boolean z7) {
        this.f7850a.putBoolean(obj, j, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void k(Object obj, long j, byte b5) {
        this.f7850a.putByte(obj, j, b5);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void l(Object obj, long j, double d7) {
        this.f7850a.putDouble(obj, j, d7);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void m(Object obj, long j, float f) {
        this.f7850a.putFloat(obj, j, f);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f7850a.getClass();
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
            n0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean r() {
        Unsafe unsafe = this.f7850a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (n0.g() != null) {
                    try {
                        Class<?> cls3 = this.f7850a.getClass();
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
                        n0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                n0.a(th2);
            }
        }
        return false;
    }
}
