package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* renamed from: androidx.datastore.preferences.protobuf.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0547y extends AbstractC0524a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0547y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected h0 unknownFields;

    public AbstractC0547y() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = h0.f;
    }

    public static AbstractC0547y f(Class cls) {
        AbstractC0547y abstractC0547y = defaultInstanceMap.get(cls);
        if (abstractC0547y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0547y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0547y == null) {
            abstractC0547y = (AbstractC0547y) ((AbstractC0547y) n0.d(cls)).e(EnumC0546x.GET_DEFAULT_INSTANCE);
            if (abstractC0547y != null) {
                defaultInstanceMap.put(cls, abstractC0547y);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC0547y;
    }

    public static Object g(Method method, AbstractC0524a abstractC0524a, Object... objArr) {
        try {
            return method.invoke(abstractC0524a, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean h(AbstractC0547y abstractC0547y, boolean z7) {
        byte byteValue = ((Byte) abstractC0547y.e(EnumC0546x.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        X x7 = X.f7783c;
        x7.getClass();
        boolean c8 = x7.a(abstractC0547y.getClass()).c(abstractC0547y);
        if (z7) {
            abstractC0547y.e(EnumC0546x.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c8;
    }

    public static void l(Class cls, AbstractC0547y abstractC0547y) {
        abstractC0547y.j();
        defaultInstanceMap.put(cls, abstractC0547y);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0524a
    public final int a(b0 b0Var) {
        int h8;
        int h9;
        if (i()) {
            if (b0Var == null) {
                X x7 = X.f7783c;
                x7.getClass();
                h9 = x7.a(getClass()).h(this);
            } else {
                h9 = b0Var.h(this);
            }
            if (h9 >= 0) {
                return h9;
            }
            throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(h9, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (b0Var == null) {
            X x8 = X.f7783c;
            x8.getClass();
            h8 = x8.a(getClass()).h(this);
        } else {
            h8 = b0Var.h(this);
        }
        m(h8);
        return h8;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0524a
    public final void b(C0534k c0534k) {
        X x7 = X.f7783c;
        x7.getClass();
        b0 a7 = x7.a(getClass());
        I i7 = c0534k.f7842b;
        if (i7 == null) {
            i7 = new I(c0534k);
        }
        a7.d(this, i7);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public abstract Object e(EnumC0546x enumC0546x);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        X x7 = X.f7783c;
        x7.getClass();
        return x7.a(getClass()).g(this, (AbstractC0547y) obj);
    }

    public final int hashCode() {
        if (i()) {
            X x7 = X.f7783c;
            x7.getClass();
            return x7.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            X x8 = X.f7783c;
            x8.getClass();
            this.memoizedHashCode = x8.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final AbstractC0547y k() {
        return (AbstractC0547y) e(EnumC0546x.NEW_MUTABLE_INSTANCE);
    }

    public final void m(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "serialized size must be non-negative, was "));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = P.f7764a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        P.c(this, sb, 0);
        return sb.toString();
    }
}
