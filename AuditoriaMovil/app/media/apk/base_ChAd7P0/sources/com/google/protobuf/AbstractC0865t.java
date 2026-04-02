package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.protobuf.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0865t extends J0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f10136d = Logger.getLogger(AbstractC0865t.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10137e = Y0.f10051e;

    /* renamed from: c  reason: collision with root package name */
    public C0845i0 f10138c;

    public static int X(int i7) {
        return p0(i7) + 1;
    }

    public static int Y(int i7, AbstractC0852m abstractC0852m) {
        return Z(abstractC0852m) + p0(i7);
    }

    public static int Z(AbstractC0852m abstractC0852m) {
        int size = abstractC0852m.size();
        return r0(size) + size;
    }

    public static int a0(int i7) {
        return p0(i7) + 8;
    }

    public static int b0(int i7, int i8) {
        return h0(i8) + p0(i7);
    }

    public static int c0(int i7) {
        return p0(i7) + 4;
    }

    public static int d0(int i7) {
        return p0(i7) + 8;
    }

    public static int e0(int i7) {
        return p0(i7) + 4;
    }

    public static int f0(int i7, AbstractC0828a abstractC0828a, E0 e02) {
        return abstractC0828a.c(e02) + (p0(i7) * 2);
    }

    public static int g0(int i7, int i8) {
        return h0(i8) + p0(i7);
    }

    public static int h0(int i7) {
        if (i7 >= 0) {
            return r0(i7);
        }
        return 10;
    }

    public static int i0(int i7, long j) {
        return t0(j) + p0(i7);
    }

    public static int j0(int i7) {
        return p0(i7) + 4;
    }

    public static int k0(int i7) {
        return p0(i7) + 8;
    }

    public static int l0(int i7, int i8) {
        return r0((i8 >> 31) ^ (i8 << 1)) + p0(i7);
    }

    public static int m0(int i7, long j) {
        return t0((j >> 63) ^ (j << 1)) + p0(i7);
    }

    public static int n0(int i7, String str) {
        return o0(str) + p0(i7);
    }

    public static int o0(String str) {
        int length;
        try {
            length = b1.c(str);
        } catch (a1 unused) {
            length = str.getBytes(V.f10033a).length;
        }
        return r0(length) + length;
    }

    public static int p0(int i7) {
        return r0(i7 << 3);
    }

    public static int q0(int i7, int i8) {
        return r0(i8) + p0(i7);
    }

    public static int r0(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int s0(int i7, long j) {
        return t0(j) + p0(i7);
    }

    public static int t0(long j) {
        int i7;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j) != 0) {
            i7 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public abstract void A0(int i7, int i8);

    public abstract void B0(int i7);

    public abstract void C0(int i7, long j);

    public abstract void D0(long j);

    public abstract void E0(int i7, int i8);

    public abstract void F0(int i7);

    public abstract void G0(int i7, AbstractC0828a abstractC0828a, E0 e02);

    public abstract void H0(AbstractC0828a abstractC0828a);

    public abstract void I0(int i7, String str);

    public abstract void J0(String str);

    public abstract void K0(int i7, int i8);

    public abstract void L0(int i7, int i8);

    public abstract void M0(int i7);

    public abstract void N0(int i7, long j);

    public abstract void O0(long j);

    public final void u0(String str, a1 a1Var) {
        f10136d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) a1Var);
        byte[] bytes = str.getBytes(V.f10033a);
        try {
            M0(bytes.length);
            W(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(e7);
        }
    }

    public abstract void v0(byte b5);

    public abstract void w0(int i7, boolean z7);

    public abstract void x0(byte[] bArr, int i7);

    public abstract void y0(int i7, AbstractC0852m abstractC0852m);

    public abstract void z0(AbstractC0852m abstractC0852m);
}
