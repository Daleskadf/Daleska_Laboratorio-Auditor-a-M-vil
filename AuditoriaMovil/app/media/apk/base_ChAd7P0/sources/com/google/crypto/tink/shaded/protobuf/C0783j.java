package com.google.crypto.tink.shaded.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.crypto.tink.shaded.protobuf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783j extends H3.d {

    /* renamed from: c  reason: collision with root package name */
    public final ByteArrayInputStream f9661c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f9662d;

    /* renamed from: e  reason: collision with root package name */
    public int f9663e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f9664g;

    /* renamed from: h  reason: collision with root package name */
    public int f9665h;

    /* renamed from: i  reason: collision with root package name */
    public int f9666i;
    public int j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0783j(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = D.f9598a;
        this.f9661c = byteArrayInputStream;
        this.f9662d = new byte[RecognitionOptions.AZTEC];
        this.f9663e = 0;
        this.f9664g = 0;
        this.f9666i = 0;
    }

    @Override // H3.d
    public final String A() {
        int M7 = M();
        byte[] bArr = this.f9662d;
        if (M7 > 0) {
            int i7 = this.f9663e;
            int i8 = this.f9664g;
            if (M7 <= i7 - i8) {
                String str = new String(bArr, i8, M7, D.f9598a);
                this.f9664g += M7;
                return str;
            }
        }
        if (M7 == 0) {
            return StringUtils.EMPTY;
        }
        if (M7 <= this.f9663e) {
            Q(M7);
            String str2 = new String(bArr, this.f9664g, M7, D.f9598a);
            this.f9664g += M7;
            return str2;
        }
        return new String(H(M7), D.f9598a);
    }

    @Override // H3.d
    public final String B() {
        int M7 = M();
        int i7 = this.f9664g;
        int i8 = this.f9663e;
        int i9 = i8 - i7;
        byte[] bArr = this.f9662d;
        if (M7 <= i9 && M7 > 0) {
            this.f9664g = i7 + M7;
        } else if (M7 == 0) {
            return StringUtils.EMPTY;
        } else {
            i7 = 0;
            if (M7 <= i8) {
                Q(M7);
                this.f9664g = M7;
            } else {
                bArr = H(M7);
            }
        }
        return v0.f9700a.n(bArr, i7, M7);
    }

    @Override // H3.d
    public final int C() {
        if (g()) {
            this.f9665h = 0;
            return 0;
        }
        int M7 = M();
        this.f9665h = M7;
        if ((M7 >>> 3) != 0) {
            return M7;
        }
        throw F.a();
    }

    @Override // H3.d
    public final int D() {
        return M();
    }

    @Override // H3.d
    public final long E() {
        return N();
    }

    public final byte[] H(int i7) {
        byte[] I7 = I(i7);
        if (I7 != null) {
            return I7;
        }
        int i8 = this.f9664g;
        int i9 = this.f9663e;
        int i10 = i9 - i8;
        this.f9666i += i9;
        this.f9664g = 0;
        this.f9663e = 0;
        ArrayList J5 = J(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f9662d, i8, bArr, 0, i10);
        Iterator it = J5.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i7) {
        if (i7 == 0) {
            return D.f9599b;
        }
        if (i7 >= 0) {
            int i8 = this.f9666i;
            int i9 = this.f9664g;
            int i10 = i8 + i9 + i7;
            if (i10 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER <= 0) {
                int i11 = this.j;
                if (i10 <= i11) {
                    int i12 = this.f9663e - i9;
                    int i13 = i7 - i12;
                    ByteArrayInputStream byteArrayInputStream = this.f9661c;
                    if (i13 >= 4096) {
                        try {
                            if (i13 > byteArrayInputStream.available()) {
                                return null;
                            }
                        } catch (F e7) {
                            e7.f9600a = true;
                            throw e7;
                        }
                    }
                    byte[] bArr = new byte[i7];
                    System.arraycopy(this.f9662d, this.f9664g, bArr, 0, i12);
                    this.f9666i += this.f9663e;
                    this.f9664g = 0;
                    this.f9663e = 0;
                    while (i12 < i7) {
                        try {
                            int read = byteArrayInputStream.read(bArr, i12, i7 - i12);
                            if (read != -1) {
                                this.f9666i += read;
                                i12 += read;
                            } else {
                                throw F.g();
                            }
                        } catch (F e8) {
                            e8.f9600a = true;
                            throw e8;
                        }
                    }
                    return bArr;
                }
                R((i11 - i8) - i9);
                throw F.g();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw F.e();
    }

    public final ArrayList J(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, (int) RecognitionOptions.AZTEC);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f9661c.read(bArr, i8, min - i8);
                if (read != -1) {
                    this.f9666i += read;
                    i8 += read;
                } else {
                    throw F.g();
                }
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() {
        int i7 = this.f9664g;
        if (this.f9663e - i7 < 4) {
            Q(4);
            i7 = this.f9664g;
        }
        this.f9664g = i7 + 4;
        byte[] bArr = this.f9662d;
        return ((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16);
    }

    public final long L() {
        int i7 = this.f9664g;
        if (this.f9663e - i7 < 8) {
            Q(8);
            i7 = this.f9664g;
        }
        this.f9664g = i7 + 8;
        byte[] bArr = this.f9662d;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int M() {
        int i7;
        int i8 = this.f9664g;
        int i9 = this.f9663e;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f9662d;
            byte b5 = bArr[i8];
            if (b5 >= 0) {
                this.f9664g = i10;
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
                this.f9664g = i11;
                return i7;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j;
        long j8;
        long j9;
        long j10;
        int i7 = this.f9664g;
        int i8 = this.f9663e;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f9662d;
            byte b5 = bArr[i7];
            if (b5 >= 0) {
                this.f9664g = i9;
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
                this.f9664g = i10;
                return j;
            }
        }
        return O();
    }

    public final long O() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f9664g == this.f9663e) {
                Q(1);
            }
            int i8 = this.f9664g;
            this.f9664g = i8 + 1;
            byte b5 = this.f9662d[i8];
            j |= (b5 & Byte.MAX_VALUE) << i7;
            if ((b5 & 128) == 0) {
                return j;
            }
        }
        throw F.d();
    }

    public final void P() {
        int i7 = this.f9663e + this.f;
        this.f9663e = i7;
        int i8 = this.f9666i + i7;
        int i9 = this.j;
        if (i8 > i9) {
            int i10 = i8 - i9;
            this.f = i10;
            this.f9663e = i7 - i10;
            return;
        }
        this.f = 0;
    }

    public final void Q(int i7) {
        if (!S(i7)) {
            if (i7 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f9666i) - this.f9664g) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw F.g();
        }
    }

    public final void R(int i7) {
        int i8 = this.f9663e;
        int i9 = this.f9664g;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.f9664g = i9 + i7;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f9661c;
        if (i7 >= 0) {
            int i11 = this.f9666i;
            int i12 = i11 + i9;
            int i13 = i12 + i7;
            int i14 = this.j;
            if (i13 <= i14) {
                this.f9666i = i12;
                this.f9663e = 0;
                this.f9664g = 0;
                while (i10 < i7) {
                    long j = i7 - i10;
                    try {
                        try {
                            long skip = byteArrayInputStream.skip(j);
                            int i15 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i15 >= 0 && skip <= j) {
                                if (i15 == 0) {
                                    break;
                                }
                                i10 += (int) skip;
                            } else {
                                throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (F e7) {
                            e7.f9600a = true;
                            throw e7;
                        }
                    } catch (Throwable th) {
                        this.f9666i += i10;
                        P();
                        throw th;
                    }
                }
                this.f9666i += i10;
                P();
                if (i10 < i7) {
                    int i16 = this.f9663e;
                    int i17 = i16 - this.f9664g;
                    this.f9664g = i16;
                    Q(1);
                    while (true) {
                        int i18 = i7 - i17;
                        int i19 = this.f9663e;
                        if (i18 > i19) {
                            i17 += i19;
                            this.f9664g = i19;
                            Q(1);
                        } else {
                            this.f9664g = i18;
                            return;
                        }
                    }
                }
            } else {
                R((i14 - i11) - i9);
                throw F.g();
            }
        } else {
            throw F.e();
        }
    }

    public final boolean S(int i7) {
        ByteArrayInputStream byteArrayInputStream;
        int i8 = this.f9664g;
        int i9 = i8 + i7;
        int i10 = this.f9663e;
        if (i9 > i10) {
            int i11 = this.f9666i;
            if (i7 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i11) - i8 || i11 + i8 + i7 > this.j) {
                return false;
            }
            byte[] bArr = this.f9662d;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f9666i += i8;
                this.f9663e -= i8;
                this.f9664g = 0;
            }
            int i12 = this.f9663e;
            int min = Math.min(bArr.length - i12, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f9666i) - i12);
            try {
                int read = this.f9661c.read(bArr, i12, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f9663e += read;
                    P();
                    if (this.f9663e >= i7) {
                        return true;
                    }
                    return S(i7);
                }
                throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (F e7) {
                e7.f9600a = true;
                throw e7;
            }
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.f("refillBuffer() called when ", i7, " bytes were already available in buffer"));
    }

    @Override // H3.d
    public final void b(int i7) {
        if (this.f9665h == i7) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // H3.d
    public final int f() {
        return this.f9666i + this.f9664g;
    }

    @Override // H3.d
    public final boolean g() {
        if (this.f9664g == this.f9663e && !S(1)) {
            return true;
        }
        return false;
    }

    @Override // H3.d
    public final void j(int i7) {
        this.j = i7;
        P();
    }

    @Override // H3.d
    public final int l(int i7) {
        if (i7 >= 0) {
            int i8 = this.f9666i + this.f9664g + i7;
            int i9 = this.j;
            if (i8 <= i9) {
                this.j = i8;
                P();
                return i9;
            }
            throw F.g();
        }
        throw F.e();
    }

    @Override // H3.d
    public final boolean m() {
        if (N() != 0) {
            return true;
        }
        return false;
    }

    @Override // H3.d
    public final C0780g o() {
        int M7 = M();
        int i7 = this.f9663e;
        int i8 = this.f9664g;
        int i9 = i7 - i8;
        byte[] bArr = this.f9662d;
        if (M7 <= i9 && M7 > 0) {
            C0780g h8 = AbstractC0781h.h(bArr, i8, M7);
            this.f9664g += M7;
            return h8;
        } else if (M7 == 0) {
            return AbstractC0781h.f9648b;
        } else {
            byte[] I7 = I(M7);
            if (I7 != null) {
                return AbstractC0781h.h(I7, 0, I7.length);
            }
            int i10 = this.f9664g;
            int i11 = this.f9663e;
            int i12 = i11 - i10;
            this.f9666i += i11;
            this.f9664g = 0;
            this.f9663e = 0;
            ArrayList J5 = J(M7 - i12);
            byte[] bArr2 = new byte[M7];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            Iterator it = J5.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
                i12 += bArr3.length;
            }
            C0780g c0780g = AbstractC0781h.f9648b;
            return new C0780g(bArr2);
        }
    }

    @Override // H3.d
    public final double p() {
        return Double.longBitsToDouble(L());
    }

    @Override // H3.d
    public final int q() {
        return M();
    }

    @Override // H3.d
    public final int r() {
        return K();
    }

    @Override // H3.d
    public final long s() {
        return L();
    }

    @Override // H3.d
    public final float t() {
        return Float.intBitsToFloat(K());
    }

    @Override // H3.d
    public final int u() {
        return M();
    }

    @Override // H3.d
    public final long v() {
        return N();
    }

    @Override // H3.d
    public final int w() {
        return K();
    }

    @Override // H3.d
    public final long x() {
        return L();
    }

    @Override // H3.d
    public final int y() {
        return H3.d.d(M());
    }

    @Override // H3.d
    public final long z() {
        return H3.d.e(N());
    }
}
