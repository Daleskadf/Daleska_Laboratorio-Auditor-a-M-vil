package com.google.protobuf;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.protobuf.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854n extends J6.b {

    /* renamed from: X  reason: collision with root package name */
    public int f10088X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f10089Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f10090Z;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f10091d;

    /* renamed from: e  reason: collision with root package name */
    public int f10092e;

    /* renamed from: e0  reason: collision with root package name */
    public int f10093e0 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public int f;

    public C0854n(byte[] bArr, int i7, int i8, boolean z7) {
        this.f10091d = bArr;
        this.f10092e = i8 + i7;
        this.f10088X = i7;
        this.f10089Y = i7;
    }

    @Override // J6.b
    public final int A() {
        if (g()) {
            this.f10090Z = 0;
            return 0;
        }
        int H7 = H();
        this.f10090Z = H7;
        if ((H7 >>> 3) != 0) {
            return H7;
        }
        throw X.b();
    }

    @Override // J6.b
    public final int B() {
        return H();
    }

    @Override // J6.b
    public final long C() {
        return I();
    }

    @Override // J6.b
    public final boolean D(int i7) {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            return false;
                        }
                        if (i8 == 5) {
                            L(4);
                            return true;
                        }
                        throw X.d();
                    }
                    E();
                    b(((i7 >>> 3) << 3) | 4);
                    return true;
                }
                L(H());
                return true;
            }
            L(8);
            return true;
        }
        int i10 = this.f10092e - this.f10088X;
        byte[] bArr = this.f10091d;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f10088X;
                this.f10088X = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw X.e();
        }
        while (i9 < 10) {
            int i12 = this.f10088X;
            if (i12 != this.f10092e) {
                this.f10088X = i12 + 1;
                if (bArr[i12] < 0) {
                    i9++;
                }
            } else {
                throw X.h();
            }
        }
        throw X.e();
        return true;
    }

    public final int F() {
        int i7 = this.f10088X;
        if (this.f10092e - i7 >= 4) {
            this.f10088X = i7 + 4;
            byte[] bArr = this.f10091d;
            return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
        }
        throw X.h();
    }

    public final long G() {
        int i7 = this.f10088X;
        if (this.f10092e - i7 >= 8) {
            this.f10088X = i7 + 8;
            byte[] bArr = this.f10091d;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }
        throw X.h();
    }

    public final int H() {
        int i7;
        int i8 = this.f10088X;
        int i9 = this.f10092e;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f10091d;
            byte b5 = bArr[i8];
            if (b5 >= 0) {
                this.f10088X = i10;
                return b5;
            } else if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b5;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b7 = bArr[i15];
                            int i17 = (i16 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f10088X = i11;
                return i7;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j8;
        long j9;
        long j10;
        int i7 = this.f10088X;
        int i8 = this.f10092e;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f10091d;
            byte b5 = bArr[i7];
            if (b5 >= 0) {
                this.f10088X = i9;
                return b5;
            } else if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b5;
                if (i11 < 0) {
                    j = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j10 = (-2080896) ^ i15;
                        } else {
                            long j11 = i15;
                            i10 = i7 + 5;
                            long j12 = j11 ^ (bArr[i14] << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                i14 = i7 + 6;
                                long j13 = j12 ^ (bArr[i10] << 35);
                                if (j13 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j12 = j13 ^ (bArr[i14] << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i14 = i7 + 8;
                                        j13 = j12 ^ (bArr[i10] << 49);
                                        if (j13 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j14 = (j13 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i16 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j = j14;
                                        }
                                    }
                                }
                                j10 = j8 ^ j13;
                            }
                            j = j9 ^ j12;
                        }
                        i10 = i14;
                        j = j10;
                    }
                }
                this.f10088X = i10;
                return j;
            }
        }
        return J();
    }

    public final long J() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.f10088X;
            if (i8 != this.f10092e) {
                this.f10088X = i8 + 1;
                byte b5 = this.f10091d[i8];
                j |= (b5 & Byte.MAX_VALUE) << i7;
                if ((b5 & 128) == 0) {
                    return j;
                }
            } else {
                throw X.h();
            }
        }
        throw X.e();
    }

    public final void K() {
        int i7 = this.f10092e + this.f;
        this.f10092e = i7;
        int i8 = i7 - this.f10089Y;
        int i9 = this.f10093e0;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f = i10;
            this.f10092e = i7 - i10;
            return;
        }
        this.f = 0;
    }

    public final void L(int i7) {
        if (i7 >= 0) {
            int i8 = this.f10092e;
            int i9 = this.f10088X;
            if (i7 <= i8 - i9) {
                this.f10088X = i9 + i7;
                return;
            }
        }
        if (i7 < 0) {
            throw X.f();
        }
        throw X.h();
    }

    @Override // J6.b
    public final void b(int i7) {
        if (this.f10090Z == i7) {
            return;
        }
        throw X.a();
    }

    @Override // J6.b
    public final int f() {
        return this.f10088X - this.f10089Y;
    }

    @Override // J6.b
    public final boolean g() {
        if (this.f10088X == this.f10092e) {
            return true;
        }
        return false;
    }

    @Override // J6.b
    public final void i(int i7) {
        this.f10093e0 = i7;
        K();
    }

    @Override // J6.b
    public final int j(int i7) {
        if (i7 >= 0) {
            int f = f() + i7;
            if (f >= 0) {
                int i8 = this.f10093e0;
                if (f <= i8) {
                    this.f10093e0 = f;
                    K();
                    return i8;
                }
                throw X.h();
            }
            throw X.g();
        }
        throw X.f();
    }

    @Override // J6.b
    public final boolean k() {
        if (I() != 0) {
            return true;
        }
        return false;
    }

    @Override // J6.b
    public final C0850l l() {
        byte[] bArr;
        int H7 = H();
        byte[] bArr2 = this.f10091d;
        if (H7 > 0) {
            int i7 = this.f10092e;
            int i8 = this.f10088X;
            if (H7 <= i7 - i8) {
                C0850l l8 = AbstractC0852m.l(bArr2, i8, H7);
                this.f10088X += H7;
                return l8;
            }
        }
        if (H7 == 0) {
            return AbstractC0852m.f10085b;
        }
        if (H7 > 0) {
            int i9 = this.f10092e;
            int i10 = this.f10088X;
            if (H7 <= i9 - i10) {
                int i11 = H7 + i10;
                this.f10088X = i11;
                bArr = Arrays.copyOfRange(bArr2, i10, i11);
                C0850l c0850l = AbstractC0852m.f10085b;
                return new C0850l(bArr);
            }
        }
        if (H7 <= 0) {
            if (H7 == 0) {
                bArr = V.f10034b;
                C0850l c0850l2 = AbstractC0852m.f10085b;
                return new C0850l(bArr);
            }
            throw X.f();
        }
        throw X.h();
    }

    @Override // J6.b
    public final double m() {
        return Double.longBitsToDouble(G());
    }

    @Override // J6.b
    public final int n() {
        return H();
    }

    @Override // J6.b
    public final int o() {
        return F();
    }

    @Override // J6.b
    public final long p() {
        return G();
    }

    @Override // J6.b
    public final float q() {
        return Float.intBitsToFloat(F());
    }

    @Override // J6.b
    public final int s() {
        return H();
    }

    @Override // J6.b
    public final long t() {
        return I();
    }

    @Override // J6.b
    public final int u() {
        return F();
    }

    @Override // J6.b
    public final long v() {
        return G();
    }

    @Override // J6.b
    public final int w() {
        return J6.b.c(H());
    }

    @Override // J6.b
    public final long x() {
        return J6.b.d(I());
    }

    @Override // J6.b
    public final String y() {
        int H7 = H();
        if (H7 > 0) {
            int i7 = this.f10092e;
            int i8 = this.f10088X;
            if (H7 <= i7 - i8) {
                String str = new String(this.f10091d, i8, H7, V.f10033a);
                this.f10088X += H7;
                return str;
            }
        }
        if (H7 == 0) {
            return StringUtils.EMPTY;
        }
        if (H7 < 0) {
            throw X.f();
        }
        throw X.h();
    }

    @Override // J6.b
    public final String z() {
        int H7 = H();
        if (H7 > 0) {
            int i7 = this.f10092e;
            int i8 = this.f10088X;
            if (H7 <= i7 - i8) {
                String H8 = b1.f10057a.H(this.f10091d, i8, H7);
                this.f10088X += H7;
                return H8;
            }
        }
        if (H7 == 0) {
            return StringUtils.EMPTY;
        }
        if (H7 <= 0) {
            throw X.f();
        }
        throw X.h();
    }
}
