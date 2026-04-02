package c6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class I1 implements I0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f8474b = Logger.getLogger(I1.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor f8475c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f8476d;

    /* renamed from: e  reason: collision with root package name */
    public static final RuntimeException f8477e;
    public static final Object[] f;

    /* renamed from: a  reason: collision with root package name */
    public final Object f8478a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        constructor = constructors[i7];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        }
                        i7++;
                    } else {
                        constructor = null;
                        break;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                f8474b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
                if (th != null) {
                }
                f8475c = null;
                f8476d = null;
                f8477e = new RuntimeException(th);
                f = new Object[]{1L};
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th != null && constructor != null) {
            f8475c = constructor;
            f8476d = method;
            f8477e = null;
        } else {
            f8475c = null;
            f8476d = null;
            f8477e = new RuntimeException(th);
        }
        f = new Object[]{1L};
    }

    public I1() {
        RuntimeException runtimeException = f8477e;
        if (runtimeException == null) {
            try {
                this.f8478a = f8475c.newInstance(null);
                return;
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InstantiationException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        }
        throw runtimeException;
    }

    @Override // c6.I0
    public final void f() {
        try {
            f8476d.invoke(this.f8478a, f);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}
