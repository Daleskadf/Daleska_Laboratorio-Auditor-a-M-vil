package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.OutputStream;
/* renamed from: com.google.protobuf.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863s extends AbstractC0865t {
    public final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10130g;

    /* renamed from: h  reason: collision with root package name */
    public int f10131h;

    /* renamed from: i  reason: collision with root package name */
    public final OutputStream f10132i;

    public C0863s(OutputStream outputStream, int i7) {
        if (i7 >= 0) {
            int max = Math.max(i7, 20);
            this.f = new byte[max];
            this.f10130g = max;
            if (outputStream != null) {
                this.f10132i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void A0(int i7, int i8) {
        V0(14);
        R0(i7, 5);
        P0(i8);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void B0(int i7) {
        V0(4);
        P0(i7);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void C0(int i7, long j) {
        V0(18);
        R0(i7, 1);
        Q0(j);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void D0(long j) {
        V0(8);
        Q0(j);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void E0(int i7, int i8) {
        V0(20);
        R0(i7, 0);
        if (i8 >= 0) {
            S0(i8);
        } else {
            T0(i8);
        }
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void F0(int i7) {
        if (i7 >= 0) {
            M0(i7);
        } else {
            O0(i7);
        }
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void G0(int i7, AbstractC0828a abstractC0828a, E0 e02) {
        K0(i7, 2);
        M0(abstractC0828a.c(e02));
        e02.e(abstractC0828a, this.f10138c);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void H0(AbstractC0828a abstractC0828a) {
        M0(((J) abstractC0828a).c(null));
        abstractC0828a.e(this);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void I0(int i7, String str) {
        K0(i7, 2);
        J0(str);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void J0(String str) {
        try {
            int length = str.length() * 3;
            int r02 = AbstractC0865t.r0(length);
            int i7 = r02 + length;
            int i8 = this.f10130g;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int P7 = b1.f10057a.P(str, bArr, 0, length);
                M0(P7);
                W0(bArr, 0, P7);
                return;
            }
            if (i7 > i8 - this.f10131h) {
                U0();
            }
            int r03 = AbstractC0865t.r0(str.length());
            int i9 = this.f10131h;
            byte[] bArr2 = this.f;
            try {
                if (r03 == r02) {
                    int i10 = i9 + r03;
                    this.f10131h = i10;
                    int P8 = b1.f10057a.P(str, bArr2, i10, i8 - i10);
                    this.f10131h = i9;
                    S0((P8 - i9) - r03);
                    this.f10131h = P8;
                } else {
                    int c8 = b1.c(str);
                    S0(c8);
                    this.f10131h = b1.f10057a.P(str, bArr2, this.f10131h, c8);
                }
            } catch (a1 e7) {
                this.f10131h = i9;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new R0.a(e8);
            }
        } catch (a1 e9) {
            u0(str, e9);
        }
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void K0(int i7, int i8) {
        M0((i7 << 3) | i8);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void L0(int i7, int i8) {
        V0(20);
        R0(i7, 0);
        S0(i8);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void M0(int i7) {
        V0(5);
        S0(i7);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void N0(int i7, long j) {
        V0(20);
        R0(i7, 0);
        T0(j);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void O0(long j) {
        V0(10);
        T0(j);
    }

    public final void P0(int i7) {
        int i8 = this.f10131h;
        int i9 = i8 + 1;
        this.f10131h = i9;
        byte[] bArr = this.f;
        bArr[i8] = (byte) (i7 & 255);
        int i10 = i8 + 2;
        this.f10131h = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        int i11 = i8 + 3;
        this.f10131h = i11;
        bArr[i10] = (byte) ((i7 >> 16) & 255);
        this.f10131h = i8 + 4;
        bArr[i11] = (byte) ((i7 >> 24) & 255);
    }

    public final void Q0(long j) {
        int i7 = this.f10131h;
        int i8 = i7 + 1;
        this.f10131h = i8;
        byte[] bArr = this.f;
        bArr[i7] = (byte) (j & 255);
        int i9 = i7 + 2;
        this.f10131h = i9;
        bArr[i8] = (byte) ((j >> 8) & 255);
        int i10 = i7 + 3;
        this.f10131h = i10;
        bArr[i9] = (byte) ((j >> 16) & 255);
        int i11 = i7 + 4;
        this.f10131h = i11;
        bArr[i10] = (byte) (255 & (j >> 24));
        int i12 = i7 + 5;
        this.f10131h = i12;
        bArr[i11] = (byte) (((int) (j >> 32)) & 255);
        int i13 = i7 + 6;
        this.f10131h = i13;
        bArr[i12] = (byte) (((int) (j >> 40)) & 255);
        int i14 = i7 + 7;
        this.f10131h = i14;
        bArr[i13] = (byte) (((int) (j >> 48)) & 255);
        this.f10131h = i7 + 8;
        bArr[i14] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void R0(int i7, int i8) {
        S0((i7 << 3) | i8);
    }

    public final void S0(int i7) {
        boolean z7 = AbstractC0865t.f10137e;
        byte[] bArr = this.f;
        if (z7) {
            while ((i7 & (-128)) != 0) {
                int i8 = this.f10131h;
                this.f10131h = i8 + 1;
                Y0.l(bArr, i8, (byte) ((i7 & 127) | RecognitionOptions.ITF));
                i7 >>>= 7;
            }
            int i9 = this.f10131h;
            this.f10131h = i9 + 1;
            Y0.l(bArr, i9, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i10 = this.f10131h;
            this.f10131h = i10 + 1;
            bArr[i10] = (byte) ((i7 & 127) | RecognitionOptions.ITF);
            i7 >>>= 7;
        }
        int i11 = this.f10131h;
        this.f10131h = i11 + 1;
        bArr[i11] = (byte) i7;
    }

    public final void T0(long j) {
        boolean z7 = AbstractC0865t.f10137e;
        byte[] bArr = this.f;
        if (z7) {
            while ((j & (-128)) != 0) {
                int i7 = this.f10131h;
                this.f10131h = i7 + 1;
                Y0.l(bArr, i7, (byte) ((((int) j) & 127) | RecognitionOptions.ITF));
                j >>>= 7;
            }
            int i8 = this.f10131h;
            this.f10131h = i8 + 1;
            Y0.l(bArr, i8, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i9 = this.f10131h;
            this.f10131h = i9 + 1;
            bArr[i9] = (byte) ((((int) j) & 127) | RecognitionOptions.ITF);
            j >>>= 7;
        }
        int i10 = this.f10131h;
        this.f10131h = i10 + 1;
        bArr[i10] = (byte) j;
    }

    public final void U0() {
        this.f10132i.write(this.f, 0, this.f10131h);
        this.f10131h = 0;
    }

    public final void V0(int i7) {
        if (this.f10130g - this.f10131h < i7) {
            U0();
        }
    }

    @Override // com.google.protobuf.J0
    public final void W(byte[] bArr, int i7, int i8) {
        W0(bArr, i7, i8);
    }

    public final void W0(byte[] bArr, int i7, int i8) {
        int i9 = this.f10131h;
        int i10 = this.f10130g;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f10131h += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i11);
        int i12 = i7 + i11;
        int i13 = i8 - i11;
        this.f10131h = i10;
        U0();
        if (i13 <= i10) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f10131h = i13;
            return;
        }
        this.f10132i.write(bArr, i12, i13);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void v0(byte b5) {
        if (this.f10131h == this.f10130g) {
            U0();
        }
        int i7 = this.f10131h;
        this.f10131h = i7 + 1;
        this.f[i7] = b5;
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void w0(int i7, boolean z7) {
        V0(11);
        R0(i7, 0);
        byte b5 = z7 ? (byte) 1 : (byte) 0;
        int i8 = this.f10131h;
        this.f10131h = i8 + 1;
        this.f[i8] = b5;
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void x0(byte[] bArr, int i7) {
        M0(i7);
        W0(bArr, 0, i7);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void y0(int i7, AbstractC0852m abstractC0852m) {
        K0(i7, 2);
        z0(abstractC0852m);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void z0(AbstractC0852m abstractC0852m) {
        M0(abstractC0852m.size());
        abstractC0852m.x(this);
    }
}
