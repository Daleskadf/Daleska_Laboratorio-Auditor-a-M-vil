package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* renamed from: androidx.datastore.preferences.protobuf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531h extends H3.d {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f7822c;

    /* renamed from: d  reason: collision with root package name */
    public int f7823d;

    /* renamed from: e  reason: collision with root package name */
    public int f7824e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7825g;

    /* renamed from: h  reason: collision with root package name */
    public int f7826h;

    /* renamed from: i  reason: collision with root package name */
    public int f7827i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0531h(byte[] bArr, int i7, int i8, boolean z7) {
        this.f7822c = bArr;
        this.f7823d = i8 + i7;
        this.f = i7;
        this.f7825g = i7;
    }

    @Override // H3.d
    public final String A() {
        int J5 = J();
        if (J5 > 0) {
            int i7 = this.f7823d;
            int i8 = this.f;
            if (J5 <= i7 - i8) {
                String str = new String(this.f7822c, i8, J5, A.f7747a);
                this.f += J5;
                return str;
            }
        }
        if (J5 == 0) {
            return StringUtils.EMPTY;
        }
        if (J5 < 0) {
            throw C.d();
        }
        throw C.e();
    }

    @Override // H3.d
    public final String B() {
        int J5 = J();
        if (J5 > 0) {
            int i7 = this.f7823d;
            int i8 = this.f;
            if (J5 <= i7 - i8) {
                String h8 = q0.f7865a.h(this.f7822c, i8, J5);
                this.f += J5;
                return h8;
            }
        }
        if (J5 == 0) {
            return StringUtils.EMPTY;
        }
        if (J5 <= 0) {
            throw C.d();
        }
        throw C.e();
    }

    @Override // H3.d
    public final int C() {
        if (g()) {
            this.f7826h = 0;
            return 0;
        }
        int J5 = J();
        this.f7826h = J5;
        if ((J5 >>> 3) != 0) {
            return J5;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // H3.d
    public final int D() {
        return J();
    }

    @Override // H3.d
    public final long E() {
        return K();
    }

    @Override // H3.d
    public final boolean F(int i7) {
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
                            N(4);
                            return true;
                        }
                        throw C.b();
                    }
                    G();
                    b(((i7 >>> 3) << 3) | 4);
                    return true;
                }
                N(J());
                return true;
            }
            N(8);
            return true;
        }
        int i10 = this.f7823d - this.f;
        byte[] bArr = this.f7822c;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f;
                this.f = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw C.c();
        }
        while (i9 < 10) {
            int i12 = this.f;
            if (i12 != this.f7823d) {
                this.f = i12 + 1;
                if (bArr[i12] < 0) {
                    i9++;
                }
            } else {
                throw C.e();
            }
        }
        throw C.c();
        return true;
    }

    public final int H() {
        int i7 = this.f;
        if (this.f7823d - i7 >= 4) {
            this.f = i7 + 4;
            byte[] bArr = this.f7822c;
            return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
        }
        throw C.e();
    }

    public final long I() {
        int i7 = this.f;
        if (this.f7823d - i7 >= 8) {
            this.f = i7 + 8;
            byte[] bArr = this.f7822c;
            return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
        }
        throw C.e();
    }

    public final int J() {
        int i7;
        int i8 = this.f;
        int i9 = this.f7823d;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f7822c;
            byte b5 = bArr[i8];
            if (b5 >= 0) {
                this.f = i10;
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
                this.f = i11;
                return i7;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j8;
        long j9;
        long j10;
        int i7 = this.f;
        int i8 = this.f7823d;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f7822c;
            byte b5 = bArr[i7];
            if (b5 >= 0) {
                this.f = i9;
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
                this.f = i10;
                return j;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.f;
            if (i8 != this.f7823d) {
                this.f = i8 + 1;
                byte b5 = this.f7822c[i8];
                j |= (b5 & Byte.MAX_VALUE) << i7;
                if ((b5 & 128) == 0) {
                    return j;
                }
            } else {
                throw C.e();
            }
        }
        throw C.c();
    }

    public final void M() {
        int i7 = this.f7823d + this.f7824e;
        this.f7823d = i7;
        int i8 = i7 - this.f7825g;
        int i9 = this.f7827i;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f7824e = i10;
            this.f7823d = i7 - i10;
            return;
        }
        this.f7824e = 0;
    }

    public final void N(int i7) {
        if (i7 >= 0) {
            int i8 = this.f7823d;
            int i9 = this.f;
            if (i7 <= i8 - i9) {
                this.f = i9 + i7;
                return;
            }
        }
        if (i7 < 0) {
            throw C.d();
        }
        throw C.e();
    }

    @Override // H3.d
    public final void b(int i7) {
        if (this.f7826h == i7) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // H3.d
    public final int f() {
        return this.f - this.f7825g;
    }

    @Override // H3.d
    public final boolean g() {
        if (this.f == this.f7823d) {
            return true;
        }
        return false;
    }

    @Override // H3.d
    public final void j(int i7) {
        this.f7827i = i7;
        M();
    }

    @Override // H3.d
    public final int l(int i7) {
        if (i7 >= 0) {
            int f = f() + i7;
            if (f >= 0) {
                int i8 = this.f7827i;
                if (f <= i8) {
                    this.f7827i = f;
                    M();
                    return i8;
                }
                throw C.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw C.d();
    }

    @Override // H3.d
    public final boolean m() {
        if (K() != 0) {
            return true;
        }
        return false;
    }

    @Override // H3.d
    public final C0530g n() {
        byte[] bArr;
        int J5 = J();
        byte[] bArr2 = this.f7822c;
        if (J5 > 0) {
            int i7 = this.f7823d;
            int i8 = this.f;
            if (J5 <= i7 - i8) {
                C0530g h8 = C0530g.h(bArr2, i8, J5);
                this.f += J5;
                return h8;
            }
        }
        if (J5 == 0) {
            return C0530g.f7818c;
        }
        if (J5 > 0) {
            int i9 = this.f7823d;
            int i10 = this.f;
            if (J5 <= i9 - i10) {
                int i11 = J5 + i10;
                this.f = i11;
                bArr = Arrays.copyOfRange(bArr2, i10, i11);
                C0530g c0530g = C0530g.f7818c;
                return new C0530g(bArr);
            }
        }
        if (J5 <= 0) {
            if (J5 == 0) {
                bArr = A.f7748b;
                C0530g c0530g2 = C0530g.f7818c;
                return new C0530g(bArr);
            }
            throw C.d();
        }
        throw C.e();
    }

    @Override // H3.d
    public final double p() {
        return Double.longBitsToDouble(I());
    }

    @Override // H3.d
    public final int q() {
        return J();
    }

    @Override // H3.d
    public final int r() {
        return H();
    }

    @Override // H3.d
    public final long s() {
        return I();
    }

    @Override // H3.d
    public final float t() {
        return Float.intBitsToFloat(H());
    }

    @Override // H3.d
    public final int u() {
        return J();
    }

    @Override // H3.d
    public final long v() {
        return K();
    }

    @Override // H3.d
    public final int w() {
        return H();
    }

    @Override // H3.d
    public final long x() {
        return I();
    }

    @Override // H3.d
    public final int y() {
        int J5 = J();
        return (-(J5 & 1)) ^ (J5 >>> 1);
    }

    @Override // H3.d
    public final long z() {
        long K7 = K();
        return (-(K7 & 1)) ^ (K7 >>> 1);
    }
}
