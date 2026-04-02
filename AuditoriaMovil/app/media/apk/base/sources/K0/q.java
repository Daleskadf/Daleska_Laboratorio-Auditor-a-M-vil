package K0;

import A3.P;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f2511d = {'\r', '\n'};

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f2512e = {'\n'};
    public static final P f = P.o(5, z3.h.f16884a, z3.h.f16886c, z3.h.f, z3.h.f16887d, z3.h.f16888e);

    /* renamed from: a  reason: collision with root package name */
    public byte[] f2513a;

    /* renamed from: b  reason: collision with root package name */
    public int f2514b;

    /* renamed from: c  reason: collision with root package name */
    public int f2515c;

    public q() {
        this.f2513a = x.f;
    }

    public final int A() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        this.f2514b = i7 + 2;
        return (bArr[i8] & ForkServer.ERROR) | ((bArr[i7] & ForkServer.ERROR) << 8);
    }

    public final long B() {
        int i7;
        int i8;
        byte b5;
        int i9;
        long j = this.f2513a[this.f2514b];
        int i10 = 7;
        while (true) {
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j) != 0) {
                i10--;
            } else if (i10 < 6) {
                j &= i9 - 1;
                i8 = 7 - i10;
            } else if (i10 == 7) {
                i8 = 1;
            }
        }
        i8 = 0;
        if (i8 != 0) {
            for (i7 = 1; i7 < i8; i7++) {
                if ((this.f2513a[this.f2514b + i7] & 192) == 128) {
                    j = (j << 6) | (b5 & 63);
                } else {
                    throw new NumberFormatException(io.flutter.plugins.pathprovider.b.g("Invalid UTF-8 sequence continuation byte: ", j));
                }
            }
            this.f2514b += i8;
            return j;
        }
        throw new NumberFormatException(io.flutter.plugins.pathprovider.b.g("Invalid UTF-8 sequence first byte: ", j));
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f2513a;
            int i7 = this.f2514b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f2514b = i7 + 3;
                return z3.h.f16886c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f2513a;
            int i8 = this.f2514b;
            byte b5 = bArr2[i8];
            if (b5 == -2 && bArr2[i8 + 1] == -1) {
                this.f2514b = i8 + 2;
                return z3.h.f16887d;
            } else if (b5 == -1 && bArr2[i8 + 1] == -2) {
                this.f2514b = i8 + 2;
                return z3.h.f16888e;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void D(int i7) {
        byte[] bArr = this.f2513a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        E(bArr, i7);
    }

    public final void E(byte[] bArr, int i7) {
        this.f2513a = bArr;
        this.f2515c = i7;
        this.f2514b = 0;
    }

    public final void F(int i7) {
        boolean z7;
        if (i7 >= 0 && i7 <= this.f2513a.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        a.e(z7);
        this.f2515c = i7;
    }

    public final void G(int i7) {
        boolean z7;
        if (i7 >= 0 && i7 <= this.f2515c) {
            z7 = true;
        } else {
            z7 = false;
        }
        a.e(z7);
        this.f2514b = i7;
    }

    public final void H(int i7) {
        G(this.f2514b + i7);
    }

    public final int a() {
        return this.f2515c - this.f2514b;
    }

    public final void b(int i7) {
        byte[] bArr = this.f2513a;
        if (i7 > bArr.length) {
            this.f2513a = Arrays.copyOf(bArr, i7);
        }
    }

    public final char c(Charset charset) {
        boolean contains = f.contains(charset);
        a.d("Unsupported charset: " + charset, contains);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        boolean z7;
        byte b5;
        int i7;
        byte b7;
        byte b8;
        boolean z8 = false;
        if ((charset.equals(z3.h.f16886c) || charset.equals(z3.h.f16884a)) && a() >= 1) {
            long j = this.f2513a[this.f2514b] & ForkServer.ERROR;
            char c8 = (char) j;
            if (c8 == j) {
                z7 = true;
            } else {
                z7 = false;
            }
            G.i.h(z7, "Out of range: %s", j);
            b5 = (byte) c8;
            i7 = 1;
        } else {
            i7 = 2;
            if ((charset.equals(z3.h.f) || charset.equals(z3.h.f16887d)) && a() >= 2) {
                byte[] bArr = this.f2513a;
                int i8 = this.f2514b;
                b7 = bArr[i8];
                b8 = bArr[i8 + 1];
            } else if (!charset.equals(z3.h.f16888e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f2513a;
                int i9 = this.f2514b;
                b7 = bArr2[i9 + 1];
                b8 = bArr2[i9];
            }
            b5 = (byte) ((char) ((b8 & ForkServer.ERROR) | (b7 << 8)));
        }
        long j8 = b5;
        char c9 = (char) j8;
        if (c9 == j8) {
            z8 = true;
        }
        G.i.h(z8, "Out of range: %s", j8);
        return (c9 << 16) + i7;
    }

    public final int e() {
        return this.f2513a[this.f2514b] & ForkServer.ERROR;
    }

    public final void f(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f2513a, this.f2514b, bArr, i7, i8);
        this.f2514b += i8;
    }

    public final char g(Charset charset, char[] cArr) {
        int d7 = d(charset);
        if (d7 != 0) {
            char c8 = (char) (d7 >> 16);
            for (char c9 : cArr) {
                if (c9 == c8) {
                    this.f2514b += d7 & 65535;
                    return c8;
                }
            }
        }
        return (char) 0;
    }

    public final int h() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        int i9 = i7 + 2;
        this.f2514b = i9;
        int i10 = ((bArr[i8] & ForkServer.ERROR) << 16) | ((bArr[i7] & ForkServer.ERROR) << 24);
        int i11 = i7 + 3;
        this.f2514b = i11;
        this.f2514b = i7 + 4;
        return (bArr[i11] & ForkServer.ERROR) | i10 | ((bArr[i9] & ForkServer.ERROR) << 8);
    }

    public final String i(Charset charset) {
        int i7;
        boolean contains = f.contains(charset);
        a.d("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = z3.h.f16884a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (!charset.equals(z3.h.f16886c) && !charset.equals(charset2)) {
            if (!charset.equals(z3.h.f) && !charset.equals(z3.h.f16888e) && !charset.equals(z3.h.f16887d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i7 = 2;
        } else {
            i7 = 1;
        }
        int i8 = this.f2514b;
        while (true) {
            int i9 = this.f2515c;
            if (i8 < i9 - (i7 - 1)) {
                if ((charset.equals(z3.h.f16886c) || charset.equals(z3.h.f16884a)) && x.K(this.f2513a[i8])) {
                    break;
                }
                if (charset.equals(z3.h.f) || charset.equals(z3.h.f16887d)) {
                    byte[] bArr = this.f2513a;
                    if (bArr[i8] == 0 && x.K(bArr[i8 + 1])) {
                        break;
                    }
                }
                if (charset.equals(z3.h.f16888e)) {
                    byte[] bArr2 = this.f2513a;
                    if (bArr2[i8 + 1] == 0 && x.K(bArr2[i8])) {
                        break;
                    }
                }
                i8 += i7;
            } else {
                i8 = i9;
                break;
            }
        }
        String s7 = s(i8 - this.f2514b, charset);
        if (this.f2514b == this.f2515c) {
            return s7;
        }
        if (g(charset, f2511d) == '\r') {
            g(charset, f2512e);
        }
        return s7;
    }

    public final int j() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        int i9 = bArr[i7] & ForkServer.ERROR;
        int i10 = i7 + 2;
        this.f2514b = i10;
        int i11 = ((bArr[i8] & ForkServer.ERROR) << 8) | i9;
        int i12 = i7 + 3;
        this.f2514b = i12;
        this.f2514b = i7 + 4;
        return ((bArr[i12] & ForkServer.ERROR) << 24) | i11 | ((bArr[i10] & ForkServer.ERROR) << 16);
    }

    public final long k() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        int i9 = i7 + 2;
        this.f2514b = i9;
        long j = (bArr[i7] & 255) | ((bArr[i8] & 255) << 8);
        int i10 = i7 + 3;
        this.f2514b = i10;
        int i11 = i7 + 4;
        this.f2514b = i11;
        long j8 = j | ((bArr[i9] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i7 + 5;
        this.f2514b = i12;
        int i13 = i7 + 6;
        this.f2514b = i13;
        long j9 = j8 | ((bArr[i11] & 255) << 32) | ((bArr[i12] & 255) << 40);
        int i14 = i7 + 7;
        this.f2514b = i14;
        this.f2514b = i7 + 8;
        return ((bArr[i14] & 255) << 56) | j9 | ((bArr[i13] & 255) << 48);
    }

    public final long l() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        int i9 = i7 + 2;
        this.f2514b = i9;
        int i10 = i7 + 3;
        this.f2514b = i10;
        this.f2514b = i7 + 4;
        return ((bArr[i10] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i8] & 255) << 8) | ((bArr[i9] & 255) << 16);
    }

    public final int m() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(j, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        int i9 = bArr[i7] & ForkServer.ERROR;
        this.f2514b = i7 + 2;
        return ((bArr[i8] & ForkServer.ERROR) << 8) | i9;
    }

    public final long o() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        int i9 = i7 + 2;
        this.f2514b = i9;
        int i10 = i7 + 3;
        this.f2514b = i10;
        long j = ((bArr[i7] & 255) << 56) | ((bArr[i8] & 255) << 48) | ((bArr[i9] & 255) << 40);
        int i11 = i7 + 4;
        this.f2514b = i11;
        int i12 = i7 + 5;
        this.f2514b = i12;
        long j8 = j | ((bArr[i10] & 255) << 32) | ((bArr[i11] & 255) << 24);
        int i13 = i7 + 6;
        this.f2514b = i13;
        int i14 = i7 + 7;
        this.f2514b = i14;
        this.f2514b = i7 + 8;
        return (bArr[i14] & 255) | j8 | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8);
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f2514b;
        while (i7 < this.f2515c && this.f2513a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.f2513a;
        int i8 = this.f2514b;
        int i9 = x.f2529a;
        String str = new String(bArr, i8, i7 - i8, z3.h.f16886c);
        this.f2514b = i7;
        if (i7 < this.f2515c) {
            this.f2514b = i7 + 1;
        }
        return str;
    }

    public final String q(int i7) {
        int i8;
        if (i7 == 0) {
            return StringUtils.EMPTY;
        }
        int i9 = this.f2514b;
        int i10 = (i9 + i7) - 1;
        if (i10 < this.f2515c && this.f2513a[i10] == 0) {
            i8 = i7 - 1;
        } else {
            i8 = i7;
        }
        byte[] bArr = this.f2513a;
        int i11 = x.f2529a;
        String str = new String(bArr, i9, i8, z3.h.f16886c);
        this.f2514b += i7;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        this.f2514b = i7 + 2;
        return (short) ((bArr[i8] & ForkServer.ERROR) | ((bArr[i7] & ForkServer.ERROR) << 8));
    }

    public final String s(int i7, Charset charset) {
        String str = new String(this.f2513a, this.f2514b, i7, charset);
        this.f2514b += i7;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        this.f2514b = i7 + 1;
        return bArr[i7] & ForkServer.ERROR;
    }

    public final int v() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        this.f2514b = i7 + 2;
        int i9 = (bArr[i8] & ForkServer.ERROR) | ((bArr[i7] & ForkServer.ERROR) << 8);
        this.f2514b = i7 + 4;
        return i9;
    }

    public final long w() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        int i9 = i7 + 2;
        this.f2514b = i9;
        int i10 = i7 + 3;
        this.f2514b = i10;
        this.f2514b = i7 + 4;
        return (bArr[i10] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i8] & 255) << 16) | ((bArr[i9] & 255) << 8);
    }

    public final int x() {
        byte[] bArr = this.f2513a;
        int i7 = this.f2514b;
        int i8 = i7 + 1;
        this.f2514b = i8;
        int i9 = i7 + 2;
        this.f2514b = i9;
        int i10 = (bArr[i8] & ForkServer.ERROR) << 8;
        this.f2514b = i7 + 3;
        return (bArr[i9] & ForkServer.ERROR) | i10 | ((bArr[i7] & ForkServer.ERROR) << 16);
    }

    public final int y() {
        int h8 = h();
        if (h8 >= 0) {
            return h8;
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.e(h8, "Top bit not zero: "));
    }

    public final long z() {
        long o7 = o();
        if (o7 >= 0) {
            return o7;
        }
        throw new IllegalStateException(io.flutter.plugins.pathprovider.b.g("Top bit not zero: ", o7));
    }

    public q(int i7) {
        this.f2513a = new byte[i7];
        this.f2515c = i7;
    }

    public q(byte[] bArr) {
        this.f2513a = bArr;
        this.f2515c = bArr.length;
    }

    public q(byte[] bArr, int i7) {
        this.f2513a = bArr;
        this.f2515c = i7;
    }
}
