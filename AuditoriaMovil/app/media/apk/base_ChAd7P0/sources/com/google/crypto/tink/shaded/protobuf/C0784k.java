package com.google.crypto.tink.shaded.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import h3.AbstractC1079a;
import java.util.logging.Logger;
/* renamed from: com.google.crypto.tink.shaded.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784k extends AbstractC1079a {

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f9672h = Logger.getLogger(C0784k.class.getName());

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f9673i = s0.f9693e;

    /* renamed from: d  reason: collision with root package name */
    public O f9674d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f9675e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public int f9676g;

    public C0784k(byte[] bArr, int i7) {
        if (((bArr.length - i7) | i7) >= 0) {
            this.f9675e = bArr;
            this.f9676g = 0;
            this.f = i7;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i7)));
    }

    public static int A(int i7) {
        return S(i7) + 1;
    }

    public static int B(int i7, AbstractC0781h abstractC0781h) {
        return C(abstractC0781h) + S(i7);
    }

    public static int C(AbstractC0781h abstractC0781h) {
        int size = abstractC0781h.size();
        return U(size) + size;
    }

    public static int D(int i7) {
        return S(i7) + 8;
    }

    public static int E(int i7, int i8) {
        return K(i8) + S(i7);
    }

    public static int F(int i7) {
        return S(i7) + 4;
    }

    public static int G(int i7) {
        return S(i7) + 8;
    }

    public static int H(int i7) {
        return S(i7) + 4;
    }

    public static int I(int i7, AbstractC0774a abstractC0774a, g0 g0Var) {
        return abstractC0774a.b(g0Var) + (S(i7) * 2);
    }

    public static int J(int i7, int i8) {
        return K(i8) + S(i7);
    }

    public static int K(int i7) {
        if (i7 >= 0) {
            return U(i7);
        }
        return 10;
    }

    public static int L(int i7, long j) {
        return W(j) + S(i7);
    }

    public static int M(int i7) {
        return S(i7) + 4;
    }

    public static int N(int i7) {
        return S(i7) + 8;
    }

    public static int O(int i7, int i8) {
        return U((i8 >> 31) ^ (i8 << 1)) + S(i7);
    }

    public static int P(int i7, long j) {
        return W((j >> 63) ^ (j << 1)) + S(i7);
    }

    public static int Q(int i7, String str) {
        return R(str) + S(i7);
    }

    public static int R(String str) {
        int length;
        try {
            length = v0.b(str);
        } catch (u0 unused) {
            length = str.getBytes(D.f9598a).length;
        }
        return U(length) + length;
    }

    public static int S(int i7) {
        return U(i7 << 3);
    }

    public static int T(int i7, int i8) {
        return U(i8) + S(i7);
    }

    public static int U(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        if ((i7 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int V(int i7, long j) {
        return W(j) + S(i7);
    }

    public static int W(long j) {
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
        if ((j & (-16384)) != 0) {
            return i7 + 1;
        }
        return i7;
    }

    public final void X(byte b5) {
        try {
            byte[] bArr = this.f9675e;
            int i7 = this.f9676g;
            this.f9676g = i7 + 1;
            bArr[i7] = b5;
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9676g), Integer.valueOf(this.f), 1), e7, 6);
        }
    }

    public final void Y(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.f9675e, this.f9676g, i8);
            this.f9676g += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9676g), Integer.valueOf(this.f), Integer.valueOf(i8)), e7, 6);
        }
    }

    public final void Z(int i7, int i8) {
        e0(i7, 5);
        a0(i8);
    }

    public final void a0(int i7) {
        try {
            byte[] bArr = this.f9675e;
            int i8 = this.f9676g;
            int i9 = i8 + 1;
            this.f9676g = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.f9676g = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.f9676g = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f9676g = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9676g), Integer.valueOf(this.f), 1), e7, 6);
        }
    }

    public final void b0(int i7, long j) {
        e0(i7, 1);
        c0(j);
    }

    public final void c0(long j) {
        try {
            byte[] bArr = this.f9675e;
            int i7 = this.f9676g;
            int i8 = i7 + 1;
            this.f9676g = i8;
            bArr[i7] = (byte) (((int) j) & 255);
            int i9 = i7 + 2;
            this.f9676g = i9;
            bArr[i8] = (byte) (((int) (j >> 8)) & 255);
            int i10 = i7 + 3;
            this.f9676g = i10;
            bArr[i9] = (byte) (((int) (j >> 16)) & 255);
            int i11 = i7 + 4;
            this.f9676g = i11;
            bArr[i10] = (byte) (((int) (j >> 24)) & 255);
            int i12 = i7 + 5;
            this.f9676g = i12;
            bArr[i11] = (byte) (((int) (j >> 32)) & 255);
            int i13 = i7 + 6;
            this.f9676g = i13;
            bArr[i12] = (byte) (((int) (j >> 40)) & 255);
            int i14 = i7 + 7;
            this.f9676g = i14;
            bArr[i13] = (byte) (((int) (j >> 48)) & 255);
            this.f9676g = i7 + 8;
            bArr[i14] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9676g), Integer.valueOf(this.f), 1), e7, 6);
        }
    }

    public final void d0(int i7) {
        if (i7 >= 0) {
            f0(i7);
        } else {
            h0(i7);
        }
    }

    public final void e0(int i7, int i8) {
        f0((i7 << 3) | i8);
    }

    public final void f0(int i7) {
        while (true) {
            int i8 = i7 & (-128);
            byte[] bArr = this.f9675e;
            if (i8 == 0) {
                int i9 = this.f9676g;
                this.f9676g = i9 + 1;
                bArr[i9] = (byte) i7;
                return;
            }
            try {
                int i10 = this.f9676g;
                this.f9676g = i10 + 1;
                bArr[i10] = (byte) ((i7 & 127) | RecognitionOptions.ITF);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9676g), Integer.valueOf(this.f), 1), e7, 6);
            }
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9676g), Integer.valueOf(this.f), 1), e7, 6);
        }
    }

    public final void g0(int i7, long j) {
        e0(i7, 0);
        h0(j);
    }

    public final void h0(long j) {
        byte[] bArr = this.f9675e;
        boolean z7 = f9673i;
        int i7 = this.f;
        if (z7 && i7 - this.f9676g >= 10) {
            while ((j & (-128)) != 0) {
                int i8 = this.f9676g;
                this.f9676g = i8 + 1;
                s0.o(bArr, i8, (byte) ((((int) j) & 127) | RecognitionOptions.ITF));
                j >>>= 7;
            }
            int i9 = this.f9676g;
            this.f9676g = 1 + i9;
            s0.o(bArr, i9, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i10 = this.f9676g;
                this.f9676g = i10 + 1;
                bArr[i10] = (byte) ((((int) j) & 127) | RecognitionOptions.ITF);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f9676g), Integer.valueOf(i7), 1), e7, 6);
            }
        }
        int i11 = this.f9676g;
        this.f9676g = i11 + 1;
        bArr[i11] = (byte) j;
    }
}
