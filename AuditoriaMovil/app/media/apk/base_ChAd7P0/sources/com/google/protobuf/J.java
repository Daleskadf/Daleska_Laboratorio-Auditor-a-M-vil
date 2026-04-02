package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class J extends AbstractC0828a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, J> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected P0 unknownFields;

    public J() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = P0.f;
    }

    public static void f(J j) {
        if (m(j, true)) {
            return;
        }
        throw new IOException(new O0().getMessage());
    }

    public static J k(Class cls) {
        J j = defaultInstanceMap.get(cls);
        if (j == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                j = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (j == null) {
            j = (J) ((J) Y0.b(cls)).j(I.GET_DEFAULT_INSTANCE);
            if (j != null) {
                defaultInstanceMap.put(cls, j);
            } else {
                throw new IllegalStateException();
            }
        }
        return j;
    }

    public static Object l(Method method, AbstractC0828a abstractC0828a, Object... objArr) {
        try {
            return method.invoke(abstractC0828a, objArr);
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

    public static final boolean m(J j, boolean z7) {
        byte byteValue = ((Byte) j.j(I.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C0878z0 c0878z0 = C0878z0.f10148c;
        c0878z0.getClass();
        boolean c8 = c0878z0.a(j.getClass()).c(j);
        if (z7) {
            j.j(I.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c8;
    }

    public static U p(U u7) {
        int i7;
        int size = u7.size();
        if (size == 0) {
            i7 = 10;
        } else {
            i7 = size * 2;
        }
        return u7.a(i7);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.google.protobuf.f] */
    public static J r(J j, byte[] bArr) {
        int length = bArr.length;
        C0871w a7 = C0871w.a();
        J q2 = j.q();
        try {
            C0878z0 c0878z0 = C0878z0.f10148c;
            c0878z0.getClass();
            E0 a8 = c0878z0.a(q2.getClass());
            ?? obj = new Object();
            a7.getClass();
            a8.h(q2, bArr, 0, length, obj);
            a8.b(q2);
            f(q2);
            return q2;
        } catch (O0 e7) {
            throw new IOException(e7.getMessage());
        } catch (X e8) {
            if (e8.f10037a) {
                throw new IOException(e8.getMessage(), e8);
            }
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof X) {
                throw ((X) e9.getCause());
            }
            throw new IOException(e9.getMessage(), e9);
        } catch (IndexOutOfBoundsException unused) {
            throw X.h();
        }
    }

    public static J s(J j, J6.b bVar, C0871w c0871w) {
        J q2 = j.q();
        try {
            C0878z0 c0878z0 = C0878z0.f10148c;
            c0878z0.getClass();
            E0 a7 = c0878z0.a(q2.getClass());
            K0.l lVar = (K0.l) bVar.f2427c;
            if (lVar == null) {
                lVar = new K0.l(bVar);
            }
            a7.f(q2, lVar, c0871w);
            a7.b(q2);
            return q2;
        } catch (O0 e7) {
            throw new IOException(e7.getMessage());
        } catch (X e8) {
            if (e8.f10037a) {
                throw new IOException(e8.getMessage(), e8);
            }
            throw e8;
        } catch (IOException e9) {
            if (e9.getCause() instanceof X) {
                throw ((X) e9.getCause());
            }
            throw new IOException(e9.getMessage(), e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof X) {
                throw ((X) e10.getCause());
            }
            throw e10;
        }
    }

    public static void t(Class cls, J j) {
        j.o();
        defaultInstanceMap.put(cls, j);
    }

    @Override // com.google.protobuf.AbstractC0828a
    public final int c(E0 e02) {
        int d7;
        int d8;
        if (n()) {
            if (e02 == null) {
                C0878z0 c0878z0 = C0878z0.f10148c;
                c0878z0.getClass();
                d8 = c0878z0.a(getClass()).d(this);
            } else {
                d8 = e02.d(this);
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
        if (e02 == null) {
            C0878z0 c0878z02 = C0878z0.f10148c;
            c0878z02.getClass();
            d7 = c0878z02.a(getClass()).d(this);
        } else {
            d7 = e02.d(this);
        }
        u(d7);
        return d7;
    }

    @Override // com.google.protobuf.AbstractC0828a
    public final void e(AbstractC0865t abstractC0865t) {
        C0878z0 c0878z0 = C0878z0.f10148c;
        c0878z0.getClass();
        E0 a7 = c0878z0.a(getClass());
        C0845i0 c0845i0 = abstractC0865t.f10138c;
        if (c0845i0 == null) {
            c0845i0 = new C0845i0(abstractC0865t);
        }
        a7.e(this, c0845i0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0878z0 c0878z0 = C0878z0.f10148c;
        c0878z0.getClass();
        return c0878z0.a(getClass()).g(this, (J) obj);
    }

    public final void g() {
        this.memoizedHashCode = 0;
    }

    public final void h() {
        u(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final int hashCode() {
        if (n()) {
            C0878z0 c0878z0 = C0878z0.f10148c;
            c0878z0.getClass();
            return c0878z0.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            C0878z0 c0878z02 = C0878z0.f10148c;
            c0878z02.getClass();
            this.memoizedHashCode = c0878z02.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final G i() {
        return (G) j(I.NEW_BUILDER);
    }

    public abstract Object j(I i7);

    public final boolean n() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void o() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final J q() {
        return (J) j(I.NEW_MUTABLE_INSTANCE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC0859p0.f10112a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC0859p0.c(this, sb, 0);
        return sb.toString();
    }

    public final void u(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(i7, "serialized size must be non-negative, was "));
    }
}
