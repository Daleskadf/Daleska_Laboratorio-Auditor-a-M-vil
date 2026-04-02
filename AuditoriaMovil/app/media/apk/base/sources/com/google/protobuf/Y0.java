package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class Y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f10047a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f10048b;

    /* renamed from: c  reason: collision with root package name */
    public static final X0 f10049c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f10050d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10051e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f10052g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f10053h;

    static {
        boolean u7;
        boolean t7;
        long j;
        Unsafe j8 = j();
        f10047a = j8;
        f10048b = AbstractC0832c.f10058a;
        boolean f4 = f(Long.TYPE);
        boolean f8 = f(Integer.TYPE);
        X0 x02 = null;
        if (j8 != null) {
            if (AbstractC0832c.a()) {
                if (f4) {
                    x02 = new V0(j8, 1);
                } else if (f8) {
                    x02 = new V0(j8, 0);
                }
            } else {
                x02 = new X0(j8);
            }
        }
        f10049c = x02;
        boolean z7 = false;
        if (x02 == null) {
            u7 = false;
        } else {
            u7 = x02.u();
        }
        f10050d = u7;
        if (x02 == null) {
            t7 = false;
        } else {
            t7 = x02.t();
        }
        f10051e = t7;
        f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e7 = e();
        if (e7 != null && x02 != null) {
            j = x02.l(e7);
        } else {
            j = -1;
        }
        f10052g = j;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z7 = true;
        }
        f10053h = z7;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(Y0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f10047a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int c(Class cls) {
        if (f10051e) {
            return f10049c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f10051e) {
            f10049c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC0832c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!AbstractC0832c.a()) {
            return false;
        }
        try {
            Class cls2 = f10048b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(long j, byte[] bArr) {
        return f10049c.f(bArr, f + j);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((f10049c.i(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j) {
        return (byte) ((f10049c.i(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new U0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j, boolean z7) {
        f10049c.m(obj, j, z7);
    }

    public static void l(byte[] bArr, long j, byte b5) {
        f10049c.n(bArr, f + j, b5);
    }

    public static void m(Object obj, long j, byte b5) {
        long j8 = (-4) & j;
        int i7 = f10049c.i(obj, j8);
        int i8 = ((~((int) j)) & 3) << 3;
        q(j8, obj, ((255 & b5) << i8) | (i7 & (~(255 << i8))));
    }

    public static void n(Object obj, long j, byte b5) {
        long j8 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        q(j8, obj, ((255 & b5) << i7) | (f10049c.i(obj, j8) & (~(255 << i7))));
    }

    public static void o(Object obj, long j, double d7) {
        f10049c.o(obj, j, d7);
    }

    public static void p(Object obj, long j, float f4) {
        f10049c.p(obj, j, f4);
    }

    public static void q(long j, Object obj, int i7) {
        f10049c.q(j, obj, i7);
    }

    public static void r(Object obj, long j, long j8) {
        f10049c.r(obj, j, j8);
    }

    public static void s(Object obj, long j, Object obj2) {
        f10049c.s(obj, j, obj2);
    }
}
