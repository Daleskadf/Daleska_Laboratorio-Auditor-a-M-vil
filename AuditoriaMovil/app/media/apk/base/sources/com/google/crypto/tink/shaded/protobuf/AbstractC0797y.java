package com.google.crypto.tink.shaded.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* renamed from: com.google.crypto.tink.shaded.protobuf.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0797y extends AbstractC0774a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0797y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j0 unknownFields;

    public AbstractC0797y() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j0.f;
    }

    public static void g(AbstractC0797y abstractC0797y) {
        if (o(abstractC0797y, true)) {
            return;
        }
        throw new IOException(new i0().getMessage());
    }

    public static AbstractC0797y l(Class cls) {
        AbstractC0797y abstractC0797y = defaultInstanceMap.get(cls);
        if (abstractC0797y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0797y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0797y == null) {
            abstractC0797y = ((AbstractC0797y) s0.b(cls)).a();
            if (abstractC0797y != null) {
                defaultInstanceMap.put(cls, abstractC0797y);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC0797y;
    }

    public static Object n(Method method, AbstractC0774a abstractC0774a, Object... objArr) {
        try {
            return method.invoke(abstractC0774a, objArr);
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

    public static final boolean o(AbstractC0797y abstractC0797y, boolean z7) {
        byte byteValue = ((Byte) abstractC0797y.k(EnumC0796x.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        d0 d0Var = d0.f9635c;
        d0Var.getClass();
        boolean c8 = d0Var.a(abstractC0797y.getClass()).c(abstractC0797y);
        if (z7) {
            abstractC0797y.k(EnumC0796x.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c8;
    }

    public static AbstractC0797y t(AbstractC0797y abstractC0797y, AbstractC0781h abstractC0781h, C0787n c0787n) {
        C0780g c0780g = (C0780g) abstractC0781h;
        C0782i h8 = H3.d.h(c0780g.f9647d, c0780g.l(), c0780g.size(), true);
        AbstractC0797y u7 = u(abstractC0797y, h8, c0787n);
        h8.b(0);
        g(u7);
        return u7;
    }

    public static AbstractC0797y u(AbstractC0797y abstractC0797y, H3.d dVar, C0787n c0787n) {
        AbstractC0797y s7 = abstractC0797y.s();
        try {
            d0 d0Var = d0.f9635c;
            d0Var.getClass();
            g0 a7 = d0Var.a(s7.getClass());
            K0.l lVar = (K0.l) dVar.f1982b;
            if (lVar == null) {
                lVar = new K0.l(dVar, (byte) 0);
            }
            a7.e(s7, lVar, c0787n);
            a7.b(s7);
            return s7;
        } catch (F e7) {
            if (e7.f9600a) {
                throw new IOException(e7.getMessage(), e7);
            }
            throw e7;
        } catch (i0 e8) {
            throw new IOException(e8.getMessage());
        } catch (IOException e9) {
            if (e9.getCause() instanceof F) {
                throw ((F) e9.getCause());
            }
            throw new IOException(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof F) {
                throw ((F) e10.getCause());
            }
            throw e10;
        }
    }

    public static void v(Class cls, AbstractC0797y abstractC0797y) {
        abstractC0797y.q();
        defaultInstanceMap.put(cls, abstractC0797y);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0774a
    public final int b(g0 g0Var) {
        int d7;
        int d8;
        if (p()) {
            if (g0Var == null) {
                d0 d0Var = d0.f9635c;
                d0Var.getClass();
                d8 = d0Var.a(getClass()).d(this);
            } else {
                d8 = g0Var.d(this);
            }
            if (d8 >= 0) {
                return d8;
            }
            throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(d8, "serialized size must be non-negative, was "));
        }
        int i7 = this.memoizedSerializedSize;
        if ((i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (g0Var == null) {
            d0 d0Var2 = d0.f9635c;
            d0Var2.getClass();
            d7 = d0Var2.a(getClass()).d(this);
        } else {
            d7 = g0Var.d(this);
        }
        w(d7);
        return d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d0 d0Var = d0.f9635c;
        d0Var.getClass();
        return d0Var.a(getClass()).g(this, (AbstractC0797y) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0774a
    public final void f(C0784k c0784k) {
        d0 d0Var = d0.f9635c;
        d0Var.getClass();
        g0 a7 = d0Var.a(getClass());
        O o7 = c0784k.f9674d;
        if (o7 == null) {
            o7 = new O(c0784k);
        }
        a7.h(this, o7);
    }

    public final void h() {
        this.memoizedHashCode = 0;
    }

    public final int hashCode() {
        if (p()) {
            d0 d0Var = d0.f9635c;
            d0Var.getClass();
            return d0Var.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            d0 d0Var2 = d0.f9635c;
            d0Var2.getClass();
            this.memoizedHashCode = d0Var2.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        w(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final AbstractC0794v j() {
        return (AbstractC0794v) k(EnumC0796x.NEW_BUILDER);
    }

    public abstract Object k(EnumC0796x enumC0796x);

    @Override // com.google.crypto.tink.shaded.protobuf.U
    /* renamed from: m */
    public final AbstractC0797y a() {
        return (AbstractC0797y) k(EnumC0796x.GET_DEFAULT_INSTANCE);
    }

    public final boolean p() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0774a
    /* renamed from: r */
    public final AbstractC0794v d() {
        return (AbstractC0794v) k(EnumC0796x.NEW_BUILDER);
    }

    public final AbstractC0797y s() {
        return (AbstractC0797y) k(EnumC0796x.NEW_MUTABLE_INSTANCE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = V.f9612a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        V.c(this, sb, 0);
        return sb.toString();
    }

    public final void w(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "serialized size must be non-negative, was "));
    }

    public final AbstractC0794v x() {
        AbstractC0794v abstractC0794v = (AbstractC0794v) k(EnumC0796x.NEW_BUILDER);
        if (!abstractC0794v.f9698a.equals(this)) {
            abstractC0794v.e();
            AbstractC0794v.f(abstractC0794v.f9699b, this);
        }
        return abstractC0794v;
    }
}
