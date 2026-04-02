package L0;

import D.AbstractC0059i;
import H0.C0130j;
import K0.p;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f2861a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f2862b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2863c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f2864d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i7, int i8, boolean[] zArr) {
        boolean z7;
        boolean z8;
        boolean z9;
        int i9 = i8 - i7;
        boolean z10 = false;
        if (i9 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            a(zArr);
            return i7 - 3;
        } else if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            a(zArr);
            return i7 - 2;
        } else if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            a(zArr);
            return i7 - 1;
        } else {
            int i10 = i8 - 1;
            int i11 = i7 + 2;
            while (i11 < i10) {
                byte b5 = bArr[i11];
                if ((b5 & 254) == 0) {
                    int i12 = i11 - 2;
                    if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b5 == 1) {
                        a(zArr);
                        return i12;
                    }
                    i11 -= 2;
                }
                i11 += 3;
            }
            if (i9 <= 2 ? !(i9 != 2 ? !zArr[1] || bArr[i10] != 1 : !zArr[2] || bArr[i8 - 2] != 0 || bArr[i10] != 1) : !(bArr[i8 - 3] != 0 || bArr[i8 - 2] != 0 || bArr[i10] != 1)) {
                z8 = true;
            } else {
                z8 = false;
            }
            zArr[0] = z8;
            if (i9 <= 1 ? !(!zArr[2] || bArr[i10] != 0) : !(bArr[i8 - 2] != 0 || bArr[i10] != 0)) {
                z9 = true;
            } else {
                z9 = false;
            }
            zArr[1] = z9;
            if (bArr[i10] == 0) {
                z10 = true;
            }
            zArr[2] = z10;
            return i8;
        }
    }

    public static d c(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        p pVar = new p(bArr, i7 + 2, i8);
        int i24 = 4;
        pVar.t(4);
        int i25 = pVar.i(3);
        pVar.s();
        int i26 = pVar.i(2);
        boolean h8 = pVar.h();
        int i27 = pVar.i(5);
        int i28 = 0;
        for (int i29 = 0; i29 < 32; i29++) {
            if (pVar.h()) {
                i28 |= 1 << i29;
            }
        }
        int[] iArr2 = new int[6];
        for (int i30 = 0; i30 < 6; i30++) {
            iArr2[i30] = pVar.i(8);
        }
        int i31 = pVar.i(8);
        int i32 = 0;
        for (int i33 = 0; i33 < i25; i33++) {
            if (pVar.h()) {
                i32 += 89;
            }
            if (pVar.h()) {
                i32 += 8;
            }
        }
        pVar.t(i32);
        if (i25 > 0) {
            pVar.t((8 - i25) * 2);
        }
        pVar.m();
        int m7 = pVar.m();
        if (m7 == 3) {
            pVar.s();
        }
        int m8 = pVar.m();
        int m9 = pVar.m();
        if (pVar.h()) {
            int m10 = pVar.m();
            int m11 = pVar.m();
            int m12 = pVar.m();
            int m13 = pVar.m();
            if (m7 != 1 && m7 != 2) {
                i22 = 1;
            } else {
                i22 = 2;
            }
            if (m7 == 1) {
                i23 = 2;
            } else {
                i23 = 1;
            }
            m8 -= (m10 + m11) * i22;
            m9 -= (m12 + m13) * i23;
        }
        int i34 = m9;
        int i35 = m8;
        int m14 = pVar.m();
        int m15 = pVar.m();
        int m16 = pVar.m();
        if (pVar.h()) {
            i9 = 0;
        } else {
            i9 = i25;
        }
        int i36 = -1;
        int i37 = -1;
        for (int i38 = i9; i38 <= i25; i38++) {
            pVar.m();
            i37 = Math.max(pVar.m(), i37);
            pVar.m();
        }
        pVar.m();
        pVar.m();
        pVar.m();
        pVar.m();
        pVar.m();
        pVar.m();
        if (pVar.h() && pVar.h()) {
            int i39 = 0;
            while (i39 < i24) {
                int i40 = 0;
                while (i40 < 6) {
                    if (!pVar.h()) {
                        pVar.m();
                    } else {
                        int min = Math.min(64, 1 << ((i39 << 1) + i24));
                        if (i39 > 1) {
                            pVar.n();
                        }
                        for (int i41 = 0; i41 < min; i41++) {
                            pVar.n();
                        }
                    }
                    if (i39 == 3) {
                        i21 = 3;
                    } else {
                        i21 = 1;
                    }
                    i40 += i21;
                    i24 = 4;
                }
                i39++;
                i24 = 4;
            }
        }
        pVar.t(2);
        if (pVar.h()) {
            pVar.t(8);
            pVar.m();
            pVar.m();
            pVar.s();
        }
        int m17 = pVar.m();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i42 = 0;
        int i43 = -1;
        int i44 = -1;
        while (i42 < m17) {
            if (i42 != 0 && pVar.h()) {
                i13 = m17;
                int i45 = i43 + i44;
                int m18 = (1 - ((pVar.h() ? 1 : 0) * 2)) * (pVar.m() + 1);
                i17 = i37;
                int i46 = i45 + 1;
                i16 = i31;
                boolean[] zArr = new boolean[i46];
                iArr = iArr2;
                for (int i47 = 0; i47 <= i45; i47++) {
                    if (!pVar.h()) {
                        zArr[i47] = pVar.h();
                    } else {
                        zArr[i47] = true;
                    }
                }
                int[] iArr5 = new int[i46];
                int[] iArr6 = new int[i46];
                int i48 = 0;
                for (int i49 = i44 - 1; i49 >= 0; i49--) {
                    int i50 = iArr4[i49] + m18;
                    if (i50 < 0 && zArr[i43 + i49]) {
                        iArr5[i48] = i50;
                        i48++;
                    }
                }
                if (m18 < 0 && zArr[i45]) {
                    iArr5[i48] = m18;
                    i48++;
                }
                i15 = i28;
                int i51 = i48;
                i14 = i27;
                for (int i52 = 0; i52 < i43; i52++) {
                    int i53 = iArr3[i52] + m18;
                    if (i53 < 0 && zArr[i52]) {
                        iArr5[i51] = i53;
                        i51++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i51);
                int i54 = 0;
                for (int i55 = i43 - 1; i55 >= 0; i55--) {
                    int i56 = iArr3[i55] + m18;
                    if (i56 > 0 && zArr[i55]) {
                        iArr6[i54] = i56;
                        i54++;
                    }
                }
                if (m18 > 0 && zArr[i45]) {
                    iArr6[i54] = m18;
                    i54++;
                }
                i18 = i54;
                for (int i57 = 0; i57 < i44; i57++) {
                    int i58 = iArr4[i57] + m18;
                    if (i58 > 0 && zArr[i43 + i57]) {
                        iArr6[i18] = i58;
                        i18++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i18);
                iArr3 = copyOf;
                i43 = i51;
            } else {
                i13 = m17;
                i14 = i27;
                i15 = i28;
                iArr = iArr2;
                i16 = i31;
                i17 = i37;
                int m19 = pVar.m();
                int m20 = pVar.m();
                iArr3 = new int[m19];
                for (int i59 = 0; i59 < m19; i59++) {
                    if (i59 > 0) {
                        i20 = iArr3[i59 - 1];
                    } else {
                        i20 = 0;
                    }
                    iArr3[i59] = i20 - (pVar.m() + 1);
                    pVar.s();
                }
                iArr4 = new int[m20];
                for (int i60 = 0; i60 < m20; i60++) {
                    if (i60 > 0) {
                        i19 = iArr4[i60 - 1];
                    } else {
                        i19 = 0;
                    }
                    iArr4[i60] = pVar.m() + 1 + i19;
                    pVar.s();
                }
                i43 = m19;
                i18 = m20;
            }
            i42++;
            i44 = i18;
            m17 = i13;
            i37 = i17;
            i31 = i16;
            iArr2 = iArr;
            i28 = i15;
            i27 = i14;
        }
        int i61 = i27;
        int i62 = i28;
        int[] iArr7 = iArr2;
        int i63 = i31;
        int i64 = i37;
        if (pVar.h()) {
            int m21 = pVar.m();
            for (int i65 = 0; i65 < m21; i65++) {
                pVar.t(m16 + 5);
            }
        }
        int i66 = 2;
        pVar.t(2);
        float f = 1.0f;
        if (pVar.h()) {
            if (pVar.h()) {
                int i67 = pVar.i(8);
                if (i67 == 255) {
                    int i68 = pVar.i(16);
                    int i69 = pVar.i(16);
                    if (i68 != 0 && i69 != 0) {
                        f = i68 / i69;
                    }
                } else if (i67 < 17) {
                    f = f2862b[i67];
                } else {
                    AbstractC0059i.J("Unexpected aspect_ratio_idc value: ", i67, "NalUnitUtil");
                }
            }
            if (pVar.h()) {
                pVar.s();
            }
            if (pVar.h()) {
                pVar.t(3);
                if (pVar.h()) {
                    i66 = 1;
                }
                if (pVar.h()) {
                    int i70 = pVar.i(8);
                    int i71 = pVar.i(8);
                    pVar.t(8);
                    i36 = C0130j.f(i70);
                    i11 = C0130j.g(i71);
                } else {
                    i11 = -1;
                }
            } else {
                i66 = -1;
                i11 = -1;
            }
            if (pVar.h()) {
                pVar.m();
                pVar.m();
            }
            pVar.s();
            if (pVar.h()) {
                i34 *= 2;
            }
            i12 = i66;
            i10 = i34;
        } else {
            i10 = i34;
            i11 = -1;
            i12 = -1;
        }
        return new d(i26, h8, i61, i62, m14, m15, iArr7, i63, i35, i10, f, i64, i36, i12, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static L0.f d(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.g.d(byte[], int, int):L0.f");
    }

    public static void e(p pVar) {
        int m7 = pVar.m() + 1;
        pVar.t(8);
        for (int i7 = 0; i7 < m7; i7++) {
            pVar.m();
            pVar.m();
            pVar.s();
        }
        pVar.t(20);
    }

    public static int f(byte[] bArr, int i7) {
        int i8;
        synchronized (f2863c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    if (i9 < i7 - 2) {
                        try {
                            if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                                break;
                            }
                            i9++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        i9 = i7;
                        break;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = f2864d;
                    if (iArr.length <= i10) {
                        f2864d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f2864d[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f2864d[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }
}
