package z8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes3.dex */
public final class v1 implements d1 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f20959b = Logger.getLogger(v1.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor f20960c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f20961d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f20962e;

    /* renamed from: f  reason: collision with root package name */
    public static final RuntimeException f20963f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f20964g;

    /* renamed from: a  reason: collision with root package name */
    public final Object f20965a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", new Class[0]);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            constructor = constructors[i10];
                            if (constructor.getParameterTypes().length == 0) {
                                break;
                            }
                            i10++;
                        } else {
                            constructor = null;
                            break;
                        }
                    }
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    f20959b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    constructor = null;
                    if (th != null) {
                    }
                    f20960c = null;
                    f20961d = null;
                    f20962e = null;
                    f20963f = new RuntimeException(th);
                    f20964g = new Object[]{1L};
                }
            } catch (Throwable th2) {
                th = th2;
                method2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
            method2 = null;
        }
        if (th != null && constructor != null) {
            f20960c = constructor;
            f20961d = method;
            f20962e = method2;
            f20963f = null;
        } else {
            f20960c = null;
            f20961d = null;
            f20962e = null;
            f20963f = new RuntimeException(th);
        }
        f20964g = new Object[]{1L};
    }

    public v1() {
        RuntimeException runtimeException = f20963f;
        if (runtimeException == null) {
            try {
                this.f20965a = f20960c.newInstance(new Object[0]);
                return;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        throw runtimeException;
    }

    public static boolean a() {
        if (f20963f == null) {
            return true;
        }
        return false;
    }

    @Override // z8.d1
    public void add(long j10) {
        Object[] objArr;
        try {
            Method method = f20961d;
            Object obj = this.f20965a;
            if (j10 == 1) {
                objArr = f20964g;
            } else {
                objArr = new Object[]{Long.valueOf(j10)};
            }
            method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
