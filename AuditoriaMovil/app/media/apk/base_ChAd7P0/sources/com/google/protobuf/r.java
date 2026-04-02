package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public final class r extends AbstractC0865t {
    public final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10115g;

    /* renamed from: h  reason: collision with root package name */
    public int f10116h;

    public r(byte[] bArr, int i7, int i8) {
        if (bArr != null) {
            int i9 = i7 + i8;
            if ((i7 | i8 | (bArr.length - i9)) >= 0) {
                this.f = bArr;
                this.f10116h = i7;
                this.f10115g = i9;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void A0(int i7, int i8) {
        K0(i7, 5);
        B0(i8);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void B0(int i7) {
        try {
            byte[] bArr = this.f;
            int i8 = this.f10116h;
            int i9 = i8 + 1;
            this.f10116h = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.f10116h = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.f10116h = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f10116h = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10116h), Integer.valueOf(this.f10115g), 1), e7, 7);
        }
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void C0(int i7, long j) {
        K0(i7, 1);
        D0(j);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void D0(long j) {
        try {
            byte[] bArr = this.f;
            int i7 = this.f10116h;
            int i8 = i7 + 1;
            this.f10116h = i8;
            bArr[i7] = (byte) (((int) j) & 255);
            int i9 = i7 + 2;
            this.f10116h = i9;
            bArr[i8] = (byte) (((int) (j >> 8)) & 255);
            int i10 = i7 + 3;
            this.f10116h = i10;
            bArr[i9] = (byte) (((int) (j >> 16)) & 255);
            int i11 = i7 + 4;
            this.f10116h = i11;
            bArr[i10] = (byte) (((int) (j >> 24)) & 255);
            int i12 = i7 + 5;
            this.f10116h = i12;
            bArr[i11] = (byte) (((int) (j >> 32)) & 255);
            int i13 = i7 + 6;
            this.f10116h = i13;
            bArr[i12] = (byte) (((int) (j >> 40)) & 255);
            int i14 = i7 + 7;
            this.f10116h = i14;
            bArr[i13] = (byte) (((int) (j >> 48)) & 255);
            this.f10116h = i7 + 8;
            bArr[i14] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10116h), Integer.valueOf(this.f10115g), 1), e7, 7);
        }
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void E0(int i7, int i8) {
        K0(i7, 0);
        F0(i8);
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
        int i7 = this.f10116h;
        try {
            int r02 = AbstractC0865t.r0(str.length() * 3);
            int r03 = AbstractC0865t.r0(str.length());
            byte[] bArr = this.f;
            if (r03 == r02) {
                int i8 = i7 + r03;
                this.f10116h = i8;
                int P7 = b1.f10057a.P(str, bArr, i8, P0());
                this.f10116h = i7;
                M0((P7 - i7) - r03);
                this.f10116h = P7;
            } else {
                M0(b1.c(str));
                this.f10116h = b1.f10057a.P(str, bArr, this.f10116h, P0());
            }
        } catch (a1 e7) {
            this.f10116h = i7;
            u0(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new R0.a(e8);
        }
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void K0(int i7, int i8) {
        M0((i7 << 3) | i8);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void L0(int i7, int i8) {
        K0(i7, 0);
        M0(i8);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void M0(int i7) {
        while (true) {
            int i8 = i7 & (-128);
            byte[] bArr = this.f;
            if (i8 == 0) {
                int i9 = this.f10116h;
                this.f10116h = i9 + 1;
                bArr[i9] = (byte) i7;
                return;
            }
            try {
                int i10 = this.f10116h;
                this.f10116h = i10 + 1;
                bArr[i10] = (byte) ((i7 & 127) | RecognitionOptions.ITF);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10116h), Integer.valueOf(this.f10115g), 1), e7, 7);
            }
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10116h), Integer.valueOf(this.f10115g), 1), e7, 7);
        }
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void N0(int i7, long j) {
        K0(i7, 0);
        O0(j);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void O0(long j) {
        boolean z7 = AbstractC0865t.f10137e;
        byte[] bArr = this.f;
        if (z7 && P0() >= 10) {
            while ((j & (-128)) != 0) {
                int i7 = this.f10116h;
                this.f10116h = i7 + 1;
                Y0.l(bArr, i7, (byte) ((((int) j) & 127) | RecognitionOptions.ITF));
                j >>>= 7;
            }
            int i8 = this.f10116h;
            this.f10116h = 1 + i8;
            Y0.l(bArr, i8, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i9 = this.f10116h;
                this.f10116h = i9 + 1;
                bArr[i9] = (byte) ((((int) j) & 127) | RecognitionOptions.ITF);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10116h), Integer.valueOf(this.f10115g), 1), e7, 7);
            }
        }
        int i10 = this.f10116h;
        this.f10116h = i10 + 1;
        bArr[i10] = (byte) j;
    }

    public final int P0() {
        return this.f10115g - this.f10116h;
    }

    public final void Q0(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.f, this.f10116h, i8);
            this.f10116h += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10116h), Integer.valueOf(this.f10115g), Integer.valueOf(i8)), e7, 7);
        }
    }

    @Override // com.google.protobuf.J0
    public final void W(byte[] bArr, int i7, int i8) {
        Q0(bArr, i7, i8);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void v0(byte b5) {
        try {
            byte[] bArr = this.f;
            int i7 = this.f10116h;
            this.f10116h = i7 + 1;
            bArr[i7] = b5;
        } catch (IndexOutOfBoundsException e7) {
            throw new R0.a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f10116h), Integer.valueOf(this.f10115g), 1), e7, 7);
        }
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void w0(int i7, boolean z7) {
        K0(i7, 0);
        v0(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC0865t
    public final void x0(byte[] bArr, int i7) {
        M0(i7);
        Q0(bArr, 0, i7);
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
