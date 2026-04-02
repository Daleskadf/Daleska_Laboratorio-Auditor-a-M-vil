package G1;

import H0.I;
import android.util.Pair;
import com.google.android.libraries.barhopper.RecognitionOptions;
import m1.AbstractC1428b;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1380a;

    static {
        int i7 = K0.x.f2529a;
        f1380a = "OpusHead".getBytes(z3.h.f16886c);
    }

    public static e a(int i7, K0.q qVar) {
        long j;
        long j8;
        qVar.G(i7 + 12);
        qVar.H(1);
        b(qVar);
        qVar.H(2);
        int u7 = qVar.u();
        if ((u7 & RecognitionOptions.ITF) != 0) {
            qVar.H(2);
        }
        if ((u7 & 64) != 0) {
            qVar.H(qVar.u());
        }
        if ((u7 & 32) != 0) {
            qVar.H(2);
        }
        qVar.H(1);
        b(qVar);
        String d7 = I.d(qVar.u());
        if (!"audio/mpeg".equals(d7) && !"audio/vnd.dts".equals(d7) && !"audio/vnd.dts.hd".equals(d7)) {
            qVar.H(4);
            long w2 = qVar.w();
            long w7 = qVar.w();
            qVar.H(1);
            int b5 = b(qVar);
            byte[] bArr = new byte[b5];
            qVar.f(bArr, 0, b5);
            if (w7 > 0) {
                j = w7;
            } else {
                j = -1;
            }
            if (w2 > 0) {
                j8 = w2;
            } else {
                j8 = -1;
            }
            return new e(d7, bArr, j, j8);
        }
        return new e(d7, null, -1L, -1L);
    }

    public static int b(K0.q qVar) {
        int u7 = qVar.u();
        int i7 = u7 & 127;
        while ((u7 & RecognitionOptions.ITF) == 128) {
            u7 = qVar.u();
            i7 = (i7 << 7) | (u7 & 127);
        }
        return i7;
    }

    public static L0.c c(K0.q qVar) {
        long o7;
        long o8;
        qVar.G(8);
        if (c.d(qVar.h()) == 0) {
            o7 = qVar.w();
            o8 = qVar.w();
        } else {
            o7 = qVar.o();
            o8 = qVar.o();
        }
        return new L0.c(o7, o8, qVar.w());
    }

    public static Pair d(K0.q qVar, int i7, int i8) {
        boolean z7;
        boolean z8;
        boolean z9;
        Integer num;
        v vVar;
        Pair create;
        int i9;
        int i10;
        boolean z10;
        byte[] bArr;
        int i11 = qVar.f2514b;
        while (i11 - i7 < i8) {
            qVar.G(i11);
            int h8 = qVar.h();
            boolean z11 = false;
            if (h8 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC1428b.e("childAtomSize must be positive", z7);
            if (qVar.h() == 1936289382) {
                int i12 = i11 + 8;
                int i13 = 0;
                int i14 = -1;
                String str = null;
                Integer num2 = null;
                while (i12 - i11 < h8) {
                    qVar.G(i12);
                    int h9 = qVar.h();
                    int h10 = qVar.h();
                    if (h10 == 1718775137) {
                        num2 = Integer.valueOf(qVar.h());
                    } else if (h10 == 1935894637) {
                        qVar.H(4);
                        str = qVar.s(4, z3.h.f16886c);
                    } else if (h10 == 1935894633) {
                        i14 = i12;
                        i13 = h9;
                    }
                    i12 += h9;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    AbstractC1428b.e("frma atom is mandatory", z8);
                    if (i14 != -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AbstractC1428b.e("schi atom is mandatory", z9);
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 < i13) {
                            qVar.G(i15);
                            int h11 = qVar.h();
                            if (qVar.h() == 1952804451) {
                                int d7 = c.d(qVar.h());
                                qVar.H(1);
                                if (d7 == 0) {
                                    qVar.H(1);
                                    i9 = 0;
                                    i10 = 0;
                                } else {
                                    int u7 = qVar.u();
                                    i9 = u7 & 15;
                                    i10 = (u7 & 240) >> 4;
                                }
                                if (qVar.u() == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int u8 = qVar.u();
                                byte[] bArr2 = new byte[16];
                                qVar.f(bArr2, 0, 16);
                                if (z10 && u8 == 0) {
                                    int u9 = qVar.u();
                                    byte[] bArr3 = new byte[u9];
                                    qVar.f(bArr3, 0, u9);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                vVar = new v(z10, str, u8, bArr2, i10, i9, bArr);
                            } else {
                                i15 += h11;
                            }
                        } else {
                            num = num2;
                            vVar = null;
                            break;
                        }
                    }
                    if (vVar != null) {
                        z11 = true;
                    }
                    AbstractC1428b.e("tenc atom is mandatory", z11);
                    int i16 = K0.x.f2529a;
                    create = Pair.create(num, vVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i11 += h8;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:513:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0d0e  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0d10  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static G1.g e(K0.q r62, int r63, int r64, java.lang.String r65, H0.C0135o r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 4048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.j.e(K0.q, int, int, java.lang.String, H0.o, boolean):G1.g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (r6 == 0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
        r6 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x054f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(G1.a r45, m1.v r46, long r47, H0.C0135o r49, boolean r50, boolean r51, z3.i r52) {
        /*
            Method dump skipped, instructions count: 2229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.j.f(G1.a, m1.v, long, H0.o, boolean, boolean, z3.i):java.util.ArrayList");
    }
}
