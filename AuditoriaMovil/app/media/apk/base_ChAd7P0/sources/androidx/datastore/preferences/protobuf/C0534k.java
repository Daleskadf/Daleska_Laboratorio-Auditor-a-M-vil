package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: androidx.datastore.preferences.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534k extends G.i {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f7840g = Logger.getLogger(C0534k.class.getName());

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f7841h = n0.f7855e;

    /* renamed from: b  reason: collision with root package name */
    public I f7842b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f7843c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7844d;

    /* renamed from: e  reason: collision with root package name */
    public int f7845e;
    public final OutputStream f;

    public C0534k(OutputStream outputStream, int i7) {
        if (i7 >= 0) {
            int max = Math.max(i7, 20);
            this.f7843c = new byte[max];
            this.f7844d = max;
            if (outputStream != null) {
                this.f = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int Q(int i7) {
        return g0(i7) + 1;
    }

    public static int R(int i7, C0530g c0530g) {
        int g02 = g0(i7);
        int size = c0530g.size();
        return i0(size) + size + g02;
    }

    public static int S(int i7) {
        return g0(i7) + 8;
    }

    public static int T(int i7, int i8) {
        return k0(i8) + g0(i7);
    }

    public static int U(int i7) {
        return g0(i7) + 4;
    }

    public static int V(int i7) {
        return g0(i7) + 8;
    }

    public static int W(int i7) {
        return g0(i7) + 4;
    }

    public static int X(int i7, AbstractC0524a abstractC0524a, b0 b0Var) {
        return abstractC0524a.a(b0Var) + (g0(i7) * 2);
    }

    public static int Y(int i7, int i8) {
        return k0(i8) + g0(i7);
    }

    public static int Z(int i7, long j) {
        return k0(j) + g0(i7);
    }

    public static int a0(int i7) {
        return g0(i7) + 4;
    }

    public static int b0(int i7) {
        return g0(i7) + 8;
    }

    public static int c0(int i7, int i8) {
        return i0((i8 >> 31) ^ (i8 << 1)) + g0(i7);
    }

    public static int d0(int i7, long j) {
        return k0((j >> 63) ^ (j << 1)) + g0(i7);
    }

    public static int e0(int i7, String str) {
        return f0(str) + g0(i7);
    }

    public static int f0(String str) {
        int length;
        try {
            length = q0.a(str);
        } catch (p0 unused) {
            length = str.getBytes(A.f7747a).length;
        }
        return i0(length) + length;
    }

    public static int g0(int i7) {
        return i0(i7 << 3);
    }

    public static int h0(int i7, int i8) {
        return i0(i8) + g0(i7);
    }

    public static int i0(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int j0(int i7, long j) {
        return k0(j) + g0(i7);
    }

    public static int k0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A0(int i7, int i8) {
        C0((i7 << 3) | i8);
    }

    public final void B0(int i7, int i8) {
        m0(20);
        N(i7, 0);
        O(i8);
    }

    public final void C0(int i7) {
        m0(5);
        O(i7);
    }

    public final void D0(int i7, long j) {
        m0(20);
        N(i7, 0);
        P(j);
    }

    public final void E0(long j) {
        m0(10);
        P(j);
    }

    @Override // G.i
    public final void K(byte[] bArr, int i7, int i8) {
        o0(bArr, i7, i8);
    }

    public final void L(int i7) {
        int i8 = this.f7845e;
        int i9 = i8 + 1;
        this.f7845e = i9;
        byte[] bArr = this.f7843c;
        bArr[i8] = (byte) (i7 & 255);
        int i10 = i8 + 2;
        this.f7845e = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        int i11 = i8 + 3;
        this.f7845e = i11;
        bArr[i10] = (byte) ((i7 >> 16) & 255);
        this.f7845e = i8 + 4;
        bArr[i11] = (byte) ((i7 >> 24) & 255);
    }

    public final void M(long j) {
        int i7 = this.f7845e;
        int i8 = i7 + 1;
        this.f7845e = i8;
        byte[] bArr = this.f7843c;
        bArr[i7] = (byte) (j & 255);
        int i9 = i7 + 2;
        this.f7845e = i9;
        bArr[i8] = (byte) ((j >> 8) & 255);
        int i10 = i7 + 3;
        this.f7845e = i10;
        bArr[i9] = (byte) ((j >> 16) & 255);
        int i11 = i7 + 4;
        this.f7845e = i11;
        bArr[i10] = (byte) (255 & (j >> 24));
        int i12 = i7 + 5;
        this.f7845e = i12;
        bArr[i11] = (byte) (((int) (j >> 32)) & 255);
        int i13 = i7 + 6;
        this.f7845e = i13;
        bArr[i12] = (byte) (((int) (j >> 40)) & 255);
        int i14 = i7 + 7;
        this.f7845e = i14;
        bArr[i13] = (byte) (((int) (j >> 48)) & 255);
        this.f7845e = i7 + 8;
        bArr[i14] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void N(int i7, int i8) {
        O((i7 << 3) | i8);
    }

    public final void O(int i7) {
        boolean z7 = f7841h;
        byte[] bArr = this.f7843c;
        if (z7) {
            while ((i7 & (-128)) != 0) {
                int i8 = this.f7845e;
                this.f7845e = i8 + 1;
                n0.j(bArr, i8, (byte) ((i7 | RecognitionOptions.ITF) & 255));
                i7 >>>= 7;
            }
            int i9 = this.f7845e;
            this.f7845e = i9 + 1;
            n0.j(bArr, i9, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i10 = this.f7845e;
            this.f7845e = i10 + 1;
            bArr[i10] = (byte) ((i7 | RecognitionOptions.ITF) & 255);
            i7 >>>= 7;
        }
        int i11 = this.f7845e;
        this.f7845e = i11 + 1;
        bArr[i11] = (byte) i7;
    }

    public final void P(long j) {
        boolean z7 = f7841h;
        byte[] bArr = this.f7843c;
        if (z7) {
            while ((j & (-128)) != 0) {
                int i7 = this.f7845e;
                this.f7845e = i7 + 1;
                n0.j(bArr, i7, (byte) ((((int) j) | RecognitionOptions.ITF) & 255));
                j >>>= 7;
            }
            int i8 = this.f7845e;
            this.f7845e = i8 + 1;
            n0.j(bArr, i8, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i9 = this.f7845e;
            this.f7845e = i9 + 1;
            bArr[i9] = (byte) ((((int) j) | RecognitionOptions.ITF) & 255);
            j >>>= 7;
        }
        int i10 = this.f7845e;
        this.f7845e = i10 + 1;
        bArr[i10] = (byte) j;
    }

    public final void l0() {
        this.f.write(this.f7843c, 0, this.f7845e);
        this.f7845e = 0;
    }

    public final void m0(int i7) {
        if (this.f7844d - this.f7845e < i7) {
            l0();
        }
    }

    public final void n0(byte b5) {
        if (this.f7845e == this.f7844d) {
            l0();
        }
        int i7 = this.f7845e;
        this.f7845e = i7 + 1;
        this.f7843c[i7] = b5;
    }

    public final void o0(byte[] bArr, int i7, int i8) {
        int i9 = this.f7845e;
        int i10 = this.f7844d;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f7843c;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f7845e += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i11);
        int i12 = i7 + i11;
        int i13 = i8 - i11;
        this.f7845e = i10;
        l0();
        if (i13 <= i10) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f7845e = i13;
            return;
        }
        this.f.write(bArr, i12, i13);
    }

    public final void p0(int i7, boolean z7) {
        m0(11);
        N(i7, 0);
        byte b5 = z7 ? (byte) 1 : (byte) 0;
        int i8 = this.f7845e;
        this.f7845e = i8 + 1;
        this.f7843c[i8] = b5;
    }

    public final void q0(int i7, C0530g c0530g) {
        A0(i7, 2);
        r0(c0530g);
    }

    public final void r0(C0530g c0530g) {
        C0(c0530g.size());
        K(c0530g.f7821b, c0530g.k(), c0530g.size());
    }

    public final void s0(int i7, int i8) {
        m0(14);
        N(i7, 5);
        L(i8);
    }

    public final void t0(int i7) {
        m0(4);
        L(i7);
    }

    public final void u0(int i7, long j) {
        m0(18);
        N(i7, 1);
        M(j);
    }

    public final void v0(long j) {
        m0(8);
        M(j);
    }

    public final void w0(int i7, int i8) {
        m0(20);
        N(i7, 0);
        if (i8 >= 0) {
            O(i8);
        } else {
            P(i8);
        }
    }

    public final void x0(int i7) {
        if (i7 >= 0) {
            C0(i7);
        } else {
            E0(i7);
        }
    }

    public final void y0(int i7, String str) {
        A0(i7, 2);
        z0(str);
    }

    public final void z0(String str) {
        try {
            int length = str.length() * 3;
            int i02 = i0(length);
            int i7 = i02 + length;
            int i8 = this.f7844d;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int k2 = q0.f7865a.k(str, bArr, 0, length);
                C0(k2);
                o0(bArr, 0, k2);
                return;
            }
            if (i7 > i8 - this.f7845e) {
                l0();
            }
            int i03 = i0(str.length());
            int i9 = this.f7845e;
            byte[] bArr2 = this.f7843c;
            try {
                try {
                    if (i03 == i02) {
                        int i10 = i9 + i03;
                        this.f7845e = i10;
                        int k8 = q0.f7865a.k(str, bArr2, i10, i8 - i10);
                        this.f7845e = i9;
                        O((k8 - i9) - i03);
                        this.f7845e = k8;
                    } else {
                        int a7 = q0.a(str);
                        O(a7);
                        this.f7845e = q0.f7865a.k(str, bArr2, this.f7845e, a7);
                    }
                } catch (p0 e7) {
                    this.f7845e = i9;
                    throw e7;
                }
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new R0.a(e8);
            }
        } catch (p0 e9) {
            f7840g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e9);
            byte[] bytes = str.getBytes(A.f7747a);
            try {
                C0(bytes.length);
                K(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e10) {
                throw new R0.a(e10);
            }
        }
    }
}
