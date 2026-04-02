package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f7851a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f7852b;

    /* renamed from: c  reason: collision with root package name */
    public static final m0 f7853c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f7854d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f7855e;
    public static final long f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7856g;

    static {
        boolean r7;
        boolean q2;
        Unsafe i7 = i();
        f7851a = i7;
        f7852b = AbstractC0526c.f7794a;
        boolean h8 = h(Long.TYPE);
        boolean h9 = h(Integer.TYPE);
        m0 m0Var = null;
        if (i7 != null) {
            if (AbstractC0526c.a()) {
                if (h8) {
                    m0Var = new k0(i7, 1);
                } else if (h9) {
                    m0Var = new k0(i7, 0);
                }
            } else {
                m0Var = new m0(i7);
            }
        }
        f7853c = m0Var;
        boolean z7 = false;
        if (m0Var == null) {
            r7 = false;
        } else {
            r7 = m0Var.r();
        }
        f7854d = r7;
        if (m0Var == null) {
            q2 = false;
        } else {
            q2 = m0Var.q();
        }
        f7855e = q2;
        f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g3 = g();
        if (g3 != null && m0Var != null) {
            m0Var.i(g3);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z7 = true;
        }
        f7856g = z7;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(n0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(Object obj, long j) {
        if (((byte) ((f7853c.f(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(Object obj, long j) {
        if (((byte) ((f7853c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static Object d(Class cls) {
        try {
            return f7851a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int e(Class cls) {
        if (f7855e) {
            return f7853c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f7855e) {
            f7853c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0526c.a()) {
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
    public static boolean h(Class cls) {
        if (!AbstractC0526c.a()) {
            return false;
        }
        try {
            Class cls2 = f7852b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b5) {
        f7853c.k(bArr, f + j, b5);
    }

    public static void k(Object obj, long j, byte b5) {
        long j8 = (-4) & j;
        int f4 = f7853c.f(obj, j8);
        int i7 = ((~((int) j)) & 3) << 3;
        m(j8, obj, ((255 & b5) << i7) | (f4 & (~(255 << i7))));
    }

    public static void l(Object obj, long j, byte b5) {
        long j8 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        m(j8, obj, ((255 & b5) << i7) | (f7853c.f(obj, j8) & (~(255 << i7))));
    }

    public static void m(long j, Object obj, int i7) {
        f7853c.n(j, obj, i7);
    }

    public static void n(Object obj, long j, long j8) {
        f7853c.o(obj, j, j8);
    }

    public static void o(Object obj, long j, Object obj2) {
        f7853c.p(obj, j, obj2);
    }
}
