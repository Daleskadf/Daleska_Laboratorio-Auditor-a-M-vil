package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.protobuf.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856o extends J6.b {

    /* renamed from: X  reason: collision with root package name */
    public int f10096X;

    /* renamed from: Z  reason: collision with root package name */
    public int f10098Z;

    /* renamed from: d  reason: collision with root package name */
    public final Iterator f10099d;

    /* renamed from: e  reason: collision with root package name */
    public ByteBuffer f10100e;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public long f10102f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f10103g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f10104h0;

    /* renamed from: Y  reason: collision with root package name */
    public int f10097Y = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: e0  reason: collision with root package name */
    public int f10101e0 = 0;

    public C0856o(int i7, ArrayList arrayList) {
        this.f = i7;
        this.f10099d = arrayList.iterator();
        if (i7 == 0) {
            this.f10100e = V.f10035c;
            this.f10102f0 = 0L;
            this.f10103g0 = 0L;
            this.f10104h0 = 0L;
            return;
        }
        P();
    }

    @Override // J6.b
    public final int A() {
        if (g()) {
            this.f10098Z = 0;
            return 0;
        }
        int K7 = K();
        this.f10098Z = K7;
        if ((K7 >>> 3) != 0) {
            return K7;
        }
        throw X.b();
    }

    @Override // J6.b
    public final int B() {
        return K();
    }

    @Override // J6.b
    public final long C() {
        return L();
    }

    @Override // J6.b
    public final boolean D(int i7) {
        int i8 = i7 & 7;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            return false;
                        }
                        if (i8 == 5) {
                            O(4);
                            return true;
                        }
                        throw X.d();
                    }
                    E();
                    b(((i7 >>> 3) << 3) | 4);
                    return true;
                }
                O(K());
                return true;
            }
            O(8);
            return true;
        }
        for (int i9 = 0; i9 < 10; i9++) {
            if (G() >= 0) {
                return true;
            }
        }
        throw X.e();
    }

    public final long F() {
        return this.f10104h0 - this.f10102f0;
    }

    public final byte G() {
        if (F() == 0) {
            if (this.f10099d.hasNext()) {
                P();
            } else {
                throw X.h();
            }
        }
        long j = this.f10102f0;
        this.f10102f0 = 1 + j;
        return Y0.f10049c.e(j);
    }

    public final void H(byte[] bArr, int i7) {
        if (i7 >= 0 && i7 <= N()) {
            int i8 = i7;
            while (i8 > 0) {
                if (F() == 0) {
                    if (this.f10099d.hasNext()) {
                        P();
                    } else {
                        throw X.h();
                    }
                }
                int min = Math.min(i8, (int) F());
                long j = min;
                Y0.f10049c.c(this.f10102f0, bArr, i7 - i8, j);
                i8 -= min;
                this.f10102f0 += j;
            }
        } else if (i7 <= 0) {
            if (i7 == 0) {
                return;
            }
            throw X.f();
        } else {
            throw X.h();
        }
    }

    public final int I() {
        if (F() >= 4) {
            long j = this.f10102f0;
            this.f10102f0 = 4 + j;
            X0 x02 = Y0.f10049c;
            return ((x02.e(j + 3) & ForkServer.ERROR) << 24) | (x02.e(j) & ForkServer.ERROR) | ((x02.e(1 + j) & ForkServer.ERROR) << 8) | ((x02.e(2 + j) & ForkServer.ERROR) << 16);
        }
        return (G() & ForkServer.ERROR) | ((G() & ForkServer.ERROR) << 8) | ((G() & ForkServer.ERROR) << 16) | ((G() & ForkServer.ERROR) << 24);
    }

    public final long J() {
        long G2;
        byte G7;
        if (F() >= 8) {
            long j = this.f10102f0;
            this.f10102f0 = 8 + j;
            X0 x02 = Y0.f10049c;
            G2 = (x02.e(j) & 255) | ((x02.e(j + 1) & 255) << 8) | ((x02.e(2 + j) & 255) << 16) | ((x02.e(3 + j) & 255) << 24) | ((x02.e(4 + j) & 255) << 32) | ((x02.e(5 + j) & 255) << 40) | ((x02.e(6 + j) & 255) << 48);
            G7 = x02.e(j + 7);
        } else {
            G2 = (G() & 255) | ((G() & 255) << 8) | ((G() & 255) << 16) | ((G() & 255) << 24) | ((G() & 255) << 32) | ((G() & 255) << 40) | ((G() & 255) << 48);
            G7 = G();
        }
        return ((G7 & 255) << 56) | G2;
    }

    public final int K() {
        int i7;
        long j = this.f10102f0;
        if (this.f10104h0 != j) {
            long j8 = j + 1;
            X0 x02 = Y0.f10049c;
            byte e7 = x02.e(j);
            if (e7 >= 0) {
                this.f10102f0++;
                return e7;
            } else if (this.f10104h0 - this.f10102f0 >= 10) {
                long j9 = 2 + j;
                int e8 = (x02.e(j8) << 7) ^ e7;
                if (e8 < 0) {
                    i7 = e8 ^ (-128);
                } else {
                    long j10 = 3 + j;
                    int e9 = (x02.e(j9) << 14) ^ e8;
                    if (e9 >= 0) {
                        i7 = e9 ^ 16256;
                    } else {
                        long j11 = 4 + j;
                        int e10 = e9 ^ (x02.e(j10) << 21);
                        if (e10 < 0) {
                            i7 = (-2080896) ^ e10;
                        } else {
                            j10 = 5 + j;
                            byte e11 = x02.e(j11);
                            int i8 = (e10 ^ (e11 << 28)) ^ 266354560;
                            if (e11 < 0) {
                                j11 = 6 + j;
                                if (x02.e(j10) < 0) {
                                    j10 = 7 + j;
                                    if (x02.e(j11) < 0) {
                                        j11 = 8 + j;
                                        if (x02.e(j10) < 0) {
                                            j10 = 9 + j;
                                            if (x02.e(j11) < 0) {
                                                long j12 = j + 10;
                                                if (x02.e(j10) >= 0) {
                                                    i7 = i8;
                                                    j9 = j12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i8;
                            }
                            i7 = i8;
                        }
                        j9 = j11;
                    }
                    j9 = j10;
                }
                this.f10102f0 = j9;
                return i7;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j8;
        long j9;
        long j10 = this.f10102f0;
        if (this.f10104h0 != j10) {
            long j11 = j10 + 1;
            X0 x02 = Y0.f10049c;
            byte e7 = x02.e(j10);
            if (e7 >= 0) {
                this.f10102f0++;
                return e7;
            } else if (this.f10104h0 - this.f10102f0 >= 10) {
                long j12 = 2 + j10;
                int e8 = (x02.e(j11) << 7) ^ e7;
                if (e8 < 0) {
                    j = e8 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int e9 = (x02.e(j12) << 14) ^ e8;
                    if (e9 >= 0) {
                        j = e9 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int e10 = e9 ^ (x02.e(j13) << 21);
                        if (e10 < 0) {
                            j = (-2080896) ^ e10;
                            j12 = j14;
                        } else {
                            long j15 = 5 + j10;
                            long e11 = (x02.e(j14) << 28) ^ e10;
                            if (e11 >= 0) {
                                j9 = 266354560;
                            } else {
                                j13 = 6 + j10;
                                long e12 = e11 ^ (x02.e(j15) << 35);
                                if (e12 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    j15 = 7 + j10;
                                    e11 = e12 ^ (x02.e(j13) << 42);
                                    if (e11 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        j13 = 8 + j10;
                                        e12 = e11 ^ (x02.e(j15) << 49);
                                        if (e12 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            j15 = 9 + j10;
                                            long e13 = (e12 ^ (x02.e(j13) << 56)) ^ 71499008037633920L;
                                            if (e13 < 0) {
                                                long j16 = j10 + 10;
                                                if (x02.e(j15) >= 0) {
                                                    j = e13;
                                                    j12 = j16;
                                                }
                                            } else {
                                                j = e13;
                                                j12 = j15;
                                            }
                                        }
                                    }
                                }
                                j = j8 ^ e12;
                            }
                            j = j9 ^ e11;
                            j12 = j15;
                        }
                    }
                    j12 = j13;
                }
                this.f10102f0 = j12;
                return j;
            }
        }
        return M();
    }

    public final long M() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte G2 = G();
            j |= (G2 & Byte.MAX_VALUE) << i7;
            if ((G2 & 128) == 0) {
                return j;
            }
        }
        throw X.e();
    }

    public final int N() {
        return (int) (((this.f - this.f10101e0) - this.f10102f0) + this.f10103g0);
    }

    public final void O(int i7) {
        if (i7 >= 0 && i7 <= ((this.f - this.f10101e0) - this.f10102f0) + this.f10103g0) {
            while (i7 > 0) {
                if (F() == 0) {
                    if (this.f10099d.hasNext()) {
                        P();
                    } else {
                        throw X.h();
                    }
                }
                int min = Math.min(i7, (int) F());
                i7 -= min;
                this.f10102f0 += min;
            }
        } else if (i7 < 0) {
            throw X.f();
        } else {
            throw X.h();
        }
    }

    public final void P() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f10099d.next();
        this.f10100e = byteBuffer;
        this.f10101e0 += (int) (this.f10102f0 - this.f10103g0);
        long position = byteBuffer.position();
        this.f10102f0 = position;
        this.f10103g0 = position;
        this.f10104h0 = this.f10100e.limit();
        long j = Y0.f10049c.j(this.f10100e, Y0.f10052g);
        this.f10102f0 += j;
        this.f10103g0 += j;
        this.f10104h0 += j;
    }

    @Override // J6.b
    public final void b(int i7) {
        if (this.f10098Z == i7) {
            return;
        }
        throw X.a();
    }

    @Override // J6.b
    public final int f() {
        return (int) ((this.f10101e0 + this.f10102f0) - this.f10103g0);
    }

    @Override // J6.b
    public final boolean g() {
        if ((this.f10101e0 + this.f10102f0) - this.f10103g0 == this.f) {
            return true;
        }
        return false;
    }

    @Override // J6.b
    public final void i(int i7) {
        this.f10097Y = i7;
        int i8 = this.f + this.f10096X;
        this.f = i8;
        if (i8 > i7) {
            int i9 = i8 - i7;
            this.f10096X = i9;
            this.f = i8 - i9;
            return;
        }
        this.f10096X = 0;
    }

    @Override // J6.b
    public final int j(int i7) {
        if (i7 >= 0) {
            int f = f() + i7;
            int i8 = this.f10097Y;
            if (f <= i8) {
                this.f10097Y = f;
                int i9 = this.f + this.f10096X;
                this.f = i9;
                if (i9 > f) {
                    int i10 = i9 - f;
                    this.f10096X = i10;
                    this.f = i9 - i10;
                } else {
                    this.f10096X = 0;
                }
                return i8;
            }
            throw X.h();
        }
        throw X.f();
    }

    @Override // J6.b
    public final boolean k() {
        if (L() != 0) {
            return true;
        }
        return false;
    }

    @Override // J6.b
    public final C0850l l() {
        int K7 = K();
        if (K7 > 0) {
            long j = K7;
            long j8 = this.f10104h0;
            long j9 = this.f10102f0;
            if (j <= j8 - j9) {
                byte[] bArr = new byte[K7];
                Y0.f10049c.c(j9, bArr, 0L, j);
                this.f10102f0 += j;
                C0850l c0850l = AbstractC0852m.f10085b;
                return new C0850l(bArr);
            }
        }
        if (K7 > 0 && K7 <= N()) {
            byte[] bArr2 = new byte[K7];
            H(bArr2, K7);
            C0850l c0850l2 = AbstractC0852m.f10085b;
            return new C0850l(bArr2);
        } else if (K7 == 0) {
            return AbstractC0852m.f10085b;
        } else {
            if (K7 < 0) {
                throw X.f();
            }
            throw X.h();
        }
    }

    @Override // J6.b
    public final double m() {
        return Double.longBitsToDouble(J());
    }

    @Override // J6.b
    public final int n() {
        return K();
    }

    @Override // J6.b
    public final int o() {
        return I();
    }

    @Override // J6.b
    public final long p() {
        return J();
    }

    @Override // J6.b
    public final float q() {
        return Float.intBitsToFloat(I());
    }

    @Override // J6.b
    public final int s() {
        return K();
    }

    @Override // J6.b
    public final long t() {
        return L();
    }

    @Override // J6.b
    public final int u() {
        return I();
    }

    @Override // J6.b
    public final long v() {
        return J();
    }

    @Override // J6.b
    public final int w() {
        return J6.b.c(K());
    }

    @Override // J6.b
    public final long x() {
        return J6.b.d(L());
    }

    @Override // J6.b
    public final String y() {
        int K7 = K();
        if (K7 > 0) {
            long j = K7;
            long j8 = this.f10104h0;
            long j9 = this.f10102f0;
            if (j <= j8 - j9) {
                byte[] bArr = new byte[K7];
                Y0.f10049c.c(j9, bArr, 0L, j);
                String str = new String(bArr, V.f10033a);
                this.f10102f0 += j;
                return str;
            }
        }
        if (K7 > 0 && K7 <= N()) {
            byte[] bArr2 = new byte[K7];
            H(bArr2, K7);
            return new String(bArr2, V.f10033a);
        } else if (K7 == 0) {
            return StringUtils.EMPTY;
        } else {
            if (K7 < 0) {
                throw X.f();
            }
            throw X.h();
        }
    }

    @Override // J6.b
    public final String z() {
        int K7 = K();
        if (K7 > 0) {
            long j = K7;
            long j8 = this.f10104h0;
            long j9 = this.f10102f0;
            if (j <= j8 - j9) {
                String b5 = b1.b((int) (j9 - this.f10103g0), this.f10100e, K7);
                this.f10102f0 += j;
                return b5;
            }
        }
        if (K7 >= 0 && K7 <= N()) {
            byte[] bArr = new byte[K7];
            H(bArr, K7);
            return b1.f10057a.H(bArr, 0, K7);
        } else if (K7 == 0) {
            return StringUtils.EMPTY;
        } else {
            if (K7 <= 0) {
                throw X.f();
            }
            throw X.h();
        }
    }
}
