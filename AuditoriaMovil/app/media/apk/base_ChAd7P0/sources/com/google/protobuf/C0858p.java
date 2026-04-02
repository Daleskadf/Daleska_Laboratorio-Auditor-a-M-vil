package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.protobuf.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858p extends J6.b {

    /* renamed from: X  reason: collision with root package name */
    public int f10105X;

    /* renamed from: Y  reason: collision with root package name */
    public int f10106Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f10107Z;

    /* renamed from: d  reason: collision with root package name */
    public final InputStream f10108d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f10109e;

    /* renamed from: e0  reason: collision with root package name */
    public int f10110e0;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public int f10111f0 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0858p(InputStream inputStream) {
        Charset charset = V.f10033a;
        this.f10108d = inputStream;
        this.f10109e = new byte[RecognitionOptions.AZTEC];
        this.f = 0;
        this.f10106Y = 0;
        this.f10110e0 = 0;
    }

    @Override // J6.b
    public final int A() {
        if (g()) {
            this.f10107Z = 0;
            return 0;
        }
        int K7 = K();
        this.f10107Z = K7;
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
        int i9 = 0;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            return false;
                        }
                        if (i8 == 5) {
                            P(4);
                            return true;
                        }
                        throw X.d();
                    }
                    E();
                    b(((i7 >>> 3) << 3) | 4);
                    return true;
                }
                P(K());
                return true;
            }
            P(8);
            return true;
        }
        int i10 = this.f - this.f10106Y;
        byte[] bArr = this.f10109e;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f10106Y;
                this.f10106Y = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw X.e();
        }
        while (i9 < 10) {
            if (this.f10106Y == this.f) {
                O(1);
            }
            int i12 = this.f10106Y;
            this.f10106Y = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw X.e();
        return true;
    }

    public final byte[] F(int i7) {
        byte[] G2 = G(i7);
        if (G2 != null) {
            return G2;
        }
        int i8 = this.f10106Y;
        int i9 = this.f;
        int i10 = i9 - i8;
        this.f10110e0 += i9;
        this.f10106Y = 0;
        this.f = 0;
        ArrayList H7 = H(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f10109e, i8, bArr, 0, i10);
        Iterator it = H7.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i7) {
        if (i7 == 0) {
            return V.f10034b;
        }
        if (i7 >= 0) {
            int i8 = this.f10110e0;
            int i9 = this.f10106Y;
            int i10 = i8 + i9 + i7;
            if (i10 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER <= 0) {
                int i11 = this.f10111f0;
                if (i10 <= i11) {
                    int i12 = this.f - i9;
                    int i13 = i7 - i12;
                    InputStream inputStream = this.f10108d;
                    if (i13 >= 4096) {
                        try {
                            if (i13 > inputStream.available()) {
                                return null;
                            }
                        } catch (X e7) {
                            e7.f10037a = true;
                            throw e7;
                        }
                    }
                    byte[] bArr = new byte[i7];
                    System.arraycopy(this.f10109e, this.f10106Y, bArr, 0, i12);
                    this.f10110e0 += this.f;
                    this.f10106Y = 0;
                    this.f = 0;
                    while (i12 < i7) {
                        try {
                            int read = inputStream.read(bArr, i12, i7 - i12);
                            if (read != -1) {
                                this.f10110e0 += read;
                                i12 += read;
                            } else {
                                throw X.h();
                            }
                        } catch (X e8) {
                            e8.f10037a = true;
                            throw e8;
                        }
                    }
                    return bArr;
                }
                P((i11 - i8) - i9);
                throw X.h();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw X.f();
    }

    public final ArrayList H(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, (int) RecognitionOptions.AZTEC);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f10108d.read(bArr, i8, min - i8);
                if (read != -1) {
                    this.f10110e0 += read;
                    i8 += read;
                } else {
                    throw X.h();
                }
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() {
        int i7 = this.f10106Y;
        if (this.f - i7 < 4) {
            O(4);
            i7 = this.f10106Y;
        }
        this.f10106Y = i7 + 4;
        byte[] bArr = this.f10109e;
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
    }

    public final long J() {
        int i7 = this.f10106Y;
        if (this.f - i7 < 8) {
            O(8);
            i7 = this.f10106Y;
        }
        this.f10106Y = i7 + 8;
        byte[] bArr = this.f10109e;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int K() {
        int i7;
        int i8 = this.f10106Y;
        int i9 = this.f;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f10109e;
            byte b5 = bArr[i8];
            if (b5 >= 0) {
                this.f10106Y = i10;
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
                this.f10106Y = i11;
                return i7;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j8;
        long j9;
        long j10;
        int i7 = this.f10106Y;
        int i8 = this.f;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f10109e;
            byte b5 = bArr[i7];
            if (b5 >= 0) {
                this.f10106Y = i9;
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
                this.f10106Y = i10;
                return j;
            }
        }
        return M();
    }

    public final long M() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f10106Y == this.f) {
                O(1);
            }
            int i8 = this.f10106Y;
            this.f10106Y = i8 + 1;
            byte b5 = this.f10109e[i8];
            j |= (b5 & Byte.MAX_VALUE) << i7;
            if ((b5 & 128) == 0) {
                return j;
            }
        }
        throw X.e();
    }

    public final void N() {
        int i7 = this.f + this.f10105X;
        this.f = i7;
        int i8 = this.f10110e0 + i7;
        int i9 = this.f10111f0;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f10105X = i10;
            this.f = i7 - i10;
            return;
        }
        this.f10105X = 0;
    }

    public final void O(int i7) {
        if (!Q(i7)) {
            if (i7 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f10110e0) - this.f10106Y) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw X.h();
        }
    }

    public final void P(int i7) {
        int i8 = this.f;
        int i9 = this.f10106Y;
        if (i7 <= i8 - i9 && i7 >= 0) {
            this.f10106Y = i9 + i7;
            return;
        }
        InputStream inputStream = this.f10108d;
        if (i7 >= 0) {
            int i10 = this.f10110e0;
            int i11 = i10 + i9;
            int i12 = i11 + i7;
            int i13 = this.f10111f0;
            if (i12 <= i13) {
                this.f10110e0 = i11;
                int i14 = i8 - i9;
                this.f = 0;
                this.f10106Y = 0;
                while (i14 < i7) {
                    long j = i7 - i14;
                    try {
                        try {
                            long skip = inputStream.skip(j);
                            int i15 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i15 >= 0 && skip <= j) {
                                if (i15 == 0) {
                                    break;
                                }
                                i14 += (int) skip;
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (X e7) {
                            e7.f10037a = true;
                            throw e7;
                        }
                    } catch (Throwable th) {
                        this.f10110e0 += i14;
                        N();
                        throw th;
                    }
                }
                this.f10110e0 += i14;
                N();
                if (i14 < i7) {
                    int i16 = this.f;
                    int i17 = i16 - this.f10106Y;
                    this.f10106Y = i16;
                    O(1);
                    while (true) {
                        int i18 = i7 - i17;
                        int i19 = this.f;
                        if (i18 > i19) {
                            i17 += i19;
                            this.f10106Y = i19;
                            O(1);
                        } else {
                            this.f10106Y = i18;
                            return;
                        }
                    }
                }
            } else {
                P((i13 - i10) - i9);
                throw X.h();
            }
        } else {
            throw X.f();
        }
    }

    public final boolean Q(int i7) {
        InputStream inputStream;
        int i8 = this.f10106Y;
        int i9 = i8 + i7;
        int i10 = this.f;
        if (i9 > i10) {
            int i11 = this.f10110e0;
            if (i7 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i11) - i8 || i11 + i8 + i7 > this.f10111f0) {
                return false;
            }
            byte[] bArr = this.f10109e;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f10110e0 += i8;
                this.f -= i8;
                this.f10106Y = 0;
            }
            int i12 = this.f;
            int min = Math.min(bArr.length - i12, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f10110e0) - i12);
            try {
                int read = this.f10108d.read(bArr, i12, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f += read;
                    N();
                    if (this.f >= i7) {
                        return true;
                    }
                    return Q(i7);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (X e7) {
                e7.f10037a = true;
                throw e7;
            }
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.f("refillBuffer() called when ", i7, " bytes were already available in buffer"));
    }

    @Override // J6.b
    public final void b(int i7) {
        if (this.f10107Z == i7) {
            return;
        }
        throw X.a();
    }

    @Override // J6.b
    public final int f() {
        return this.f10110e0 + this.f10106Y;
    }

    @Override // J6.b
    public final boolean g() {
        if (this.f10106Y == this.f && !Q(1)) {
            return true;
        }
        return false;
    }

    @Override // J6.b
    public final void i(int i7) {
        this.f10111f0 = i7;
        N();
    }

    @Override // J6.b
    public final int j(int i7) {
        if (i7 >= 0) {
            int i8 = this.f10110e0 + this.f10106Y + i7;
            int i9 = this.f10111f0;
            if (i8 <= i9) {
                this.f10111f0 = i8;
                N();
                return i9;
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
        int i7 = this.f;
        int i8 = this.f10106Y;
        int i9 = i7 - i8;
        byte[] bArr = this.f10109e;
        if (K7 <= i9 && K7 > 0) {
            C0850l l8 = AbstractC0852m.l(bArr, i8, K7);
            this.f10106Y += K7;
            return l8;
        } else if (K7 == 0) {
            return AbstractC0852m.f10085b;
        } else {
            if (K7 >= 0) {
                byte[] G2 = G(K7);
                if (G2 != null) {
                    return AbstractC0852m.l(G2, 0, G2.length);
                }
                int i10 = this.f10106Y;
                int i11 = this.f;
                int i12 = i11 - i10;
                this.f10110e0 += i11;
                this.f10106Y = 0;
                this.f = 0;
                ArrayList H7 = H(K7 - i12);
                byte[] bArr2 = new byte[K7];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                Iterator it = H7.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
                    i12 += bArr3.length;
                }
                C0850l c0850l = AbstractC0852m.f10085b;
                return new C0850l(bArr2);
            }
            throw X.f();
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
        byte[] bArr = this.f10109e;
        if (K7 > 0) {
            int i7 = this.f;
            int i8 = this.f10106Y;
            if (K7 <= i7 - i8) {
                String str = new String(bArr, i8, K7, V.f10033a);
                this.f10106Y += K7;
                return str;
            }
        }
        if (K7 == 0) {
            return StringUtils.EMPTY;
        }
        if (K7 >= 0) {
            if (K7 <= this.f) {
                O(K7);
                String str2 = new String(bArr, this.f10106Y, K7, V.f10033a);
                this.f10106Y += K7;
                return str2;
            }
            return new String(F(K7), V.f10033a);
        }
        throw X.f();
    }

    @Override // J6.b
    public final String z() {
        int K7 = K();
        int i7 = this.f10106Y;
        int i8 = this.f;
        int i9 = i8 - i7;
        byte[] bArr = this.f10109e;
        if (K7 <= i9 && K7 > 0) {
            this.f10106Y = i7 + K7;
        } else if (K7 == 0) {
            return StringUtils.EMPTY;
        } else {
            if (K7 >= 0) {
                i7 = 0;
                if (K7 <= i8) {
                    O(K7);
                    this.f10106Y = K7;
                } else {
                    bArr = F(K7);
                }
            } else {
                throw X.f();
            }
        }
        return b1.f10057a.H(bArr, i7, K7);
    }
}
