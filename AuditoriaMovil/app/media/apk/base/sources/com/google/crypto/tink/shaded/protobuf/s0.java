package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f9689a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f9690b;

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f9691c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f9692d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f9693e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f9694g;

    static {
        boolean s7;
        boolean r7;
        Unsafe m7 = m();
        f9689a = m7;
        f9690b = AbstractC0776c.f9633a;
        boolean f4 = f(Long.TYPE);
        boolean f8 = f(Integer.TYPE);
        r0 r0Var = null;
        if (m7 != null) {
            if (AbstractC0776c.a()) {
                if (f4) {
                    r0Var = new p0(m7, 1);
                } else if (f8) {
                    r0Var = new p0(m7, 0);
                }
            } else {
                r0Var = new r0(m7);
            }
        }
        f9691c = r0Var;
        boolean z7 = false;
        if (r0Var == null) {
            s7 = false;
        } else {
            s7 = r0Var.s();
        }
        f9692d = s7;
        if (r0Var == null) {
            r7 = false;
        } else {
            r7 = r0Var.r();
        }
        f9693e = r7;
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
        if (e7 != null && r0Var != null) {
            r0Var.j(e7);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z7 = true;
        }
        f9694g = z7;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(s0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f9689a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int c(Class cls) {
        if (f9693e) {
            return f9691c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f9693e) {
            f9691c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC0776c.a()) {
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
        if (!AbstractC0776c.a()) {
            return false;
        }
        try {
            Class cls2 = f9690b;
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
        return f9691c.d(bArr, f + j);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((f9691c.g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j) {
        return (byte) ((f9691c.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int j(AbstractC0797y abstractC0797y, long j) {
        return f9691c.g(abstractC0797y, j);
    }

    public static long k(AbstractC0797y abstractC0797y, long j) {
        return f9691c.h(abstractC0797y, j);
    }

    public static Object l(AbstractC0797y abstractC0797y, long j) {
        return f9691c.i(abstractC0797y, j);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j, boolean z7) {
        f9691c.k(obj, j, z7);
    }

    public static void o(byte[] bArr, long j, byte b5) {
        f9691c.l(bArr, f + j, b5);
    }

    public static void p(Object obj, long j, byte b5) {
        long j8 = (-4) & j;
        int g3 = f9691c.g(obj, j8);
        int i7 = ((~((int) j)) & 3) << 3;
        t(j8, obj, ((255 & b5) << i7) | (g3 & (~(255 << i7))));
    }

    public static void q(Object obj, long j, byte b5) {
        long j8 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        t(j8, obj, ((255 & b5) << i7) | (f9691c.g(obj, j8) & (~(255 << i7))));
    }

    public static void r(Object obj, long j, double d7) {
        f9691c.m(obj, j, d7);
    }

    public static void s(Object obj, long j, float f4) {
        f9691c.n(obj, j, f4);
    }

    public static void t(long j, Object obj, int i7) {
        f9691c.o(j, obj, i7);
    }

    public static void u(Object obj, long j, long j8) {
        f9691c.p(obj, j, j8);
    }

    public static void v(Object obj, long j, Object obj2) {
        f9691c.q(obj, j, obj2);
    }
}
