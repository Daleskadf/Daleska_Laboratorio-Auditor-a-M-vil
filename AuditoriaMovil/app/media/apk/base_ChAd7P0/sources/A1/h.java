package A1;

import A3.H;
import A3.K;
import A3.e0;
import H0.I;
import K0.p;
import K0.q;
import K0.x;
import a.AbstractC0412a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import r3.AbstractC1740d;
import v1.C1881a;
/* loaded from: classes.dex */
public final class h extends AbstractC0412a {

    /* renamed from: b  reason: collision with root package name */
    public static final A.i f60b = new A.i(1);

    /* renamed from: a  reason: collision with root package name */
    public final A.i f61a;

    public h(A.i iVar) {
        this.f61a = iVar;
    }

    public static String A0(int i7, int i8, int i9, int i10, int i11) {
        if (i7 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static int B0(byte[] bArr, int i7, int i8) {
        int C02 = C0(bArr, i7);
        if (i8 != 0 && i8 != 3) {
            while (C02 < bArr.length - 1) {
                if ((C02 - i7) % 2 == 0 && bArr[C02 + 1] == 0) {
                    return C02;
                }
                C02 = C0(bArr, C02 + 1);
            }
            return bArr.length;
        }
        return C02;
    }

    public static int C0(byte[] bArr, int i7) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    public static int D0(int i7, q qVar) {
        byte[] bArr = qVar.f2513a;
        int i8 = qVar.f2514b;
        int i9 = i8;
        while (true) {
            int i10 = i9 + 1;
            if (i10 < i8 + i7) {
                if ((bArr[i9] & ForkServer.ERROR) == 255 && bArr[i10] == 0) {
                    System.arraycopy(bArr, i9 + 2, bArr, i10, (i7 - (i9 - i8)) - 2);
                    i7--;
                }
                i9 = i10;
            } else {
                return i7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
        if ((r10 & com.google.android.libraries.barhopper.RecognitionOptions.ITF) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean E0(K0.q r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f2514b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.h()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.G(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.G(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.G(r2)
            return r4
        Lb0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.h.E0(K0.q, int, int, boolean):boolean");
    }

    public static a k0(q qVar, int i7, int i8) {
        int C02;
        String str;
        byte[] copyOfRange;
        int u7 = qVar.u();
        Charset z02 = z0(u7);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        qVar.f(bArr, 0, i9);
        if (i8 == 2) {
            str = "image/" + AbstractC1740d.A(new String(bArr, 0, 3, z3.h.f16885b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            C02 = 2;
        } else {
            C02 = C0(bArr, 0);
            String A7 = AbstractC1740d.A(new String(bArr, 0, C02, z3.h.f16885b));
            if (A7.indexOf(47) == -1) {
                str = "image/".concat(A7);
            } else {
                str = A7;
            }
        }
        int i10 = bArr[C02 + 1] & ForkServer.ERROR;
        int i11 = C02 + 2;
        int B02 = B0(bArr, i11, u7);
        String str2 = new String(bArr, i11, B02 - i11, z02);
        int y02 = y0(u7) + B02;
        if (i9 <= y02) {
            copyOfRange = x.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, y02, i9);
        }
        return new a(i10, str, str2, copyOfRange);
    }

    public static c l0(q qVar, int i7, int i8, boolean z7, int i9, A.i iVar) {
        long j;
        long j8;
        int i10 = qVar.f2514b;
        int C02 = C0(qVar.f2513a, i10);
        String str = new String(qVar.f2513a, i10, C02 - i10, z3.h.f16885b);
        qVar.G(C02 + 1);
        int h8 = qVar.h();
        int h9 = qVar.h();
        long w2 = qVar.w();
        if (w2 == 4294967295L) {
            j = -1;
        } else {
            j = w2;
        }
        long w7 = qVar.w();
        if (w7 == 4294967295L) {
            j8 = -1;
        } else {
            j8 = w7;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = i10 + i7;
        while (qVar.f2514b < i11) {
            i o02 = o0(i8, qVar, z7, i9, iVar);
            if (o02 != null) {
                arrayList.add(o02);
            }
        }
        return new c(str, h8, h9, j, j8, (i[]) arrayList.toArray(new i[0]));
    }

    public static d m0(q qVar, int i7, int i8, boolean z7, int i9, A.i iVar) {
        boolean z8;
        boolean z9;
        int i10 = qVar.f2514b;
        int C02 = C0(qVar.f2513a, i10);
        String str = new String(qVar.f2513a, i10, C02 - i10, z3.h.f16885b);
        qVar.G(C02 + 1);
        int u7 = qVar.u();
        if ((u7 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((u7 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int u8 = qVar.u();
        String[] strArr = new String[u8];
        for (int i11 = 0; i11 < u8; i11++) {
            int i12 = qVar.f2514b;
            int C03 = C0(qVar.f2513a, i12);
            strArr[i11] = new String(qVar.f2513a, i12, C03 - i12, z3.h.f16885b);
            qVar.G(C03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = i10 + i7;
        while (qVar.f2514b < i13) {
            i o02 = o0(i8, qVar, z7, i9, iVar);
            if (o02 != null) {
                arrayList.add(o02);
            }
        }
        return new d(str, z8, z9, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e n0(int i7, q qVar) {
        if (i7 < 4) {
            return null;
        }
        int u7 = qVar.u();
        Charset z02 = z0(u7);
        byte[] bArr = new byte[3];
        qVar.f(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        qVar.f(bArr2, 0, i8);
        int B02 = B0(bArr2, 0, u7);
        String str2 = new String(bArr2, 0, B02, z02);
        int y02 = y0(u7) + B02;
        return new e(str, str2, s0(bArr2, y02, B0(bArr2, y02, u7), z02));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0199, code lost:
        if (r12 == 67) goto L115;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A1.i o0(int r18, K0.q r19, boolean r20, int r21, A.i r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.h.o0(int, K0.q, boolean, int, A.i):A1.i");
    }

    public static f p0(int i7, q qVar) {
        byte[] copyOfRange;
        int u7 = qVar.u();
        Charset z02 = z0(u7);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        qVar.f(bArr, 0, i8);
        int C02 = C0(bArr, 0);
        String l8 = I.l(new String(bArr, 0, C02, z3.h.f16885b));
        int i9 = C02 + 1;
        int B02 = B0(bArr, i9, u7);
        String s02 = s0(bArr, i9, B02, z02);
        int y02 = y0(u7) + B02;
        int B03 = B0(bArr, y02, u7);
        String s03 = s0(bArr, y02, B03, z02);
        int y03 = y0(u7) + B03;
        if (i8 <= y03) {
            copyOfRange = x.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, y03, i8);
        }
        return new f(l8, s02, s03, copyOfRange);
    }

    public static l q0(int i7, q qVar) {
        int A7 = qVar.A();
        int x7 = qVar.x();
        int x8 = qVar.x();
        int u7 = qVar.u();
        int u8 = qVar.u();
        p pVar = new p();
        pVar.o(qVar);
        int i8 = ((i7 - 10) * 8) / (u7 + u8);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = pVar.i(u7);
            int i11 = pVar.i(u8);
            iArr[i9] = i10;
            iArr2[i9] = i11;
        }
        return new l(A7, x7, x8, iArr, iArr2);
    }

    public static m r0(int i7, q qVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i7];
        qVar.f(bArr, 0, i7);
        int C02 = C0(bArr, 0);
        String str = new String(bArr, 0, C02, z3.h.f16885b);
        int i8 = C02 + 1;
        if (i7 <= i8) {
            copyOfRange = x.f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i8, i7);
        }
        return new m(str, copyOfRange);
    }

    public static String s0(byte[] bArr, int i7, int i8, Charset charset) {
        if (i8 > i7 && i8 <= bArr.length) {
            return new String(bArr, i7, i8 - i7, charset);
        }
        return StringUtils.EMPTY;
    }

    public static n t0(int i7, q qVar, String str) {
        if (i7 < 1) {
            return null;
        }
        int u7 = qVar.u();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        qVar.f(bArr, 0, i8);
        return new n(str, null, u0(bArr, u7, 0));
    }

    public static e0 u0(byte[] bArr, int i7, int i8) {
        if (i8 >= bArr.length) {
            return K.u(StringUtils.EMPTY);
        }
        H o7 = K.o();
        int B02 = B0(bArr, i8, i7);
        while (i8 < B02) {
            o7.a(new String(bArr, i8, B02 - i8, z0(i7)));
            i8 = y0(i7) + B02;
            B02 = B0(bArr, i8, i7);
        }
        e0 g3 = o7.g();
        if (g3.isEmpty()) {
            return K.u(StringUtils.EMPTY);
        }
        return g3;
    }

    public static n v0(int i7, q qVar) {
        if (i7 < 1) {
            return null;
        }
        int u7 = qVar.u();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        qVar.f(bArr, 0, i8);
        int B02 = B0(bArr, 0, u7);
        return new n("TXXX", new String(bArr, 0, B02, z0(u7)), u0(bArr, u7, y0(u7) + B02));
    }

    public static o w0(int i7, q qVar, String str) {
        byte[] bArr = new byte[i7];
        qVar.f(bArr, 0, i7);
        return new o(str, null, new String(bArr, 0, C0(bArr, 0), z3.h.f16885b));
    }

    public static o x0(int i7, q qVar) {
        if (i7 < 1) {
            return null;
        }
        int u7 = qVar.u();
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        qVar.f(bArr, 0, i8);
        int B02 = B0(bArr, 0, u7);
        String str = new String(bArr, 0, B02, z0(u7));
        int y02 = y0(u7) + B02;
        return new o("WXXX", str, s0(bArr, y02, C0(bArr, y02), z3.h.f16885b));
    }

    public static int y0(int i7) {
        if (i7 != 0 && i7 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset z0(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return z3.h.f16885b;
                }
                return z3.h.f16886c;
            }
            return z3.h.f16887d;
        }
        return z3.h.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H0.H j0(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.h.j0(byte[], int):H0.H");
    }

    @Override // a.AbstractC0412a
    public final H0.H m(C1881a c1881a, ByteBuffer byteBuffer) {
        return j0(byteBuffer.array(), byteBuffer.limit());
    }
}
