package m1;

import D.AbstractC0059i;
import H0.J;
import H4.e1;
import a6.t0;
import android.util.Base64;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.XMLReaderUtils;
import y1.C2033a;
import y1.C2034b;
/* renamed from: m1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1428b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f13905a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f13906b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f13907c = {1, 2, 3, 6};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f13908d = {48000, 44100, 32000};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f13909e = {24000, 22050, 16000};
    public static final int[] f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f13910g = {32, 40, 48, 56, 64, 80, 96, 112, RecognitionOptions.ITF, 160, 192, 224, RecognitionOptions.QR_CODE, 320, 384, 448, RecognitionOptions.UPC_A, 576, 640};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f13911h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f13912i = {2002, 2000, 1920, 1601, 1600, 1001, PipesIterator.DEFAULT_QUEUE_SIZE, 960, 800, 800, 480, 400, 400, RecognitionOptions.PDF417};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f13913k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f13914l = {64, 112, RecognitionOptions.ITF, 192, 224, RecognitionOptions.QR_CODE, 384, 448, RecognitionOptions.UPC_A, 640, 768, 896, RecognitionOptions.UPC_E, 1152, 1280, 1536, 1920, RecognitionOptions.PDF417, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecognitionOptions.AZTEC, 6144, 7680};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f13915m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f13916n = {5, 8, 10, 12};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f13917o = {6, 9, 12, 15};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f13918p = {2, 4, 6, 8};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f13919q = {9, 11, 13, 16};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f13920r = {5, 8, 10, 12};

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f13921s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f13922t = {44100, 48000, 32000};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f13923u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f13924v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f13925w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f13926x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f13927y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i7, int i8) {
        int i9 = -1;
        for (int i10 = 0; i10 < 13; i10++) {
            if (i7 == f13905a[i10]) {
                i9 = i10;
            }
        }
        int i11 = -1;
        for (int i12 = 0; i12 < 16; i12++) {
            if (i8 == f13906b[i12]) {
                i11 = i12;
            }
        }
        if (i7 != -1 && i11 != -1) {
            return b(2, i9, i11);
        }
        throw new IllegalArgumentException(AbstractC0059i.x("Invalid sample rate or number of channels: ", i7, i8, ", "));
    }

    public static byte[] b(int i7, int i8, int i9) {
        return new byte[]{(byte) (((i7 << 3) & 248) | ((i8 >> 1) & 7)), (byte) (((i8 << 7) & RecognitionOptions.ITF) | ((i9 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & ForkServer.ERROR) << 8) | (bArr[10] & ForkServer.ERROR)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r13 == r21.f) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
        if ((r20.u() * org.apache.tika.pipes.pipesiterator.PipesIterator.DEFAULT_QUEUE_SIZE) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
        if (r6 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(K0.q r20, m1.t r21, int r22, H0.C0140u r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.AbstractC1428b.d(K0.q, m1.t, int, H0.u):boolean");
    }

    public static void e(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw J.a(null, str);
    }

    public static void f(long j8, K0.q qVar, G[] gArr) {
        int i7;
        int i8;
        boolean z7;
        while (true) {
            boolean z8 = true;
            if (qVar.a() > 1) {
                int i9 = 0;
                while (true) {
                    if (qVar.a() == 0) {
                        i7 = -1;
                        break;
                    }
                    int u7 = qVar.u();
                    i9 += u7;
                    if (u7 != 255) {
                        i7 = i9;
                        break;
                    }
                }
                int i10 = 0;
                while (true) {
                    if (qVar.a() == 0) {
                        i10 = -1;
                        break;
                    }
                    int u8 = qVar.u();
                    i10 += u8;
                    if (u8 != 255) {
                        break;
                    }
                }
                int i11 = qVar.f2514b + i10;
                if (i10 != -1 && i10 <= qVar.a()) {
                    if (i7 == 4 && i10 >= 8) {
                        int u9 = qVar.u();
                        int A7 = qVar.A();
                        if (A7 == 49) {
                            i8 = qVar.h();
                        } else {
                            i8 = 0;
                        }
                        int u10 = qVar.u();
                        if (A7 == 47) {
                            qVar.H(1);
                        }
                        if (u9 == 181 && ((A7 == 49 || A7 == 47) && u10 == 3)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (A7 == 49) {
                            if (i8 != 1195456820) {
                                z8 = false;
                            }
                            z7 &= z8;
                        }
                        if (z7) {
                            g(j8, qVar, gArr);
                        }
                    }
                } else {
                    K0.a.A("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i11 = qVar.f2515c;
                }
                qVar.G(i11);
            } else {
                return;
            }
        }
    }

    public static void g(long j8, K0.q qVar, G[] gArr) {
        boolean z7;
        int u7 = qVar.u();
        if ((u7 & 64) != 0) {
            qVar.H(1);
            int i7 = (u7 & 31) * 3;
            int i8 = qVar.f2514b;
            for (G g3 : gArr) {
                qVar.G(i8);
                g3.d(i7, qVar);
                if (j8 != -9223372036854775807L) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.j(z7);
                g3.e(j8, 1, i7, 0, null);
            }
        }
    }

    public static int h(int i7, int i8) {
        int i9 = i8 / 2;
        if (i7 >= 0 && i7 < 3 && i8 >= 0 && i9 < 19) {
            int i10 = f13908d[i7];
            if (i10 == 44100) {
                return ((i8 % 2) + f13911h[i9]) * 2;
            }
            int i11 = f13910g[i9];
            if (i10 == 32000) {
                return i11 * 6;
            }
            return i11 * 4;
        }
        return -1;
    }

    public static void i(int i7, K0.q qVar) {
        qVar.D(7);
        byte[] bArr = qVar.f2513a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i7 >> 16) & 255);
        bArr[5] = (byte) ((i7 >> 8) & 255);
        bArr[6] = (byte) (i7 & 255);
    }

    public static int j(int i7) {
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i7 & (-2097152)) == -2097152) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f13922t[i11];
        if (i8 == 2) {
            i14 /= 2;
        } else if (i8 == 0) {
            i14 /= 4;
        }
        int i15 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            if (i8 == 3) {
                i13 = f13923u[i10 - 1];
            } else {
                i13 = f13924v[i10 - 1];
            }
            return (((i13 * 12) / i14) + i15) * 4;
        }
        if (i8 == 3) {
            if (i9 == 2) {
                i12 = f13925w[i10 - 1];
            } else {
                i12 = f13926x[i10 - 1];
            }
        } else {
            i12 = f13927y[i10 - 1];
        }
        int i16 = 144;
        if (i8 == 3) {
            return Y.d(i12, 144, i14, i15);
        }
        if (i9 == 1) {
            i16 = 72;
        }
        return Y.d(i16, i12, i14, i15);
    }

    public static K0.p k(byte[] bArr) {
        byte b5 = bArr[0];
        if (b5 != Byte.MAX_VALUE && b5 != 100 && b5 != 64 && b5 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b7 = copyOf[0];
            if (b7 == -2 || b7 == -1 || b7 == 37 || b7 == -14 || b7 == -24) {
                for (int i7 = 0; i7 < copyOf.length - 1; i7 += 2) {
                    byte b8 = copyOf[i7];
                    int i8 = i7 + 1;
                    copyOf[i7] = copyOf[i8];
                    copyOf[i8] = b8;
                }
            }
            K0.p pVar = new K0.p(copyOf, copyOf.length);
            if (copyOf[0] == 31) {
                K0.p pVar2 = new K0.p(copyOf, copyOf.length);
                while (pVar2.b() >= 16) {
                    pVar2.t(2);
                    int i9 = pVar2.i(14) & 16383;
                    int min = Math.min(8 - pVar.f2508c, 14);
                    int i10 = pVar.f2508c;
                    int i11 = (8 - i10) - min;
                    byte[] bArr2 = pVar.f2509d;
                    int i12 = pVar.f2507b;
                    byte b9 = (byte) (((65280 >> i10) | ((1 << i11) - 1)) & bArr2[i12]);
                    bArr2[i12] = b9;
                    int i13 = 14 - min;
                    bArr2[i12] = (byte) (b9 | ((i9 >>> i13) << i11));
                    int i14 = i12 + 1;
                    while (i13 > 8) {
                        pVar.f2509d[i14] = (byte) (i9 >>> (i13 - 8));
                        i13 -= 8;
                        i14++;
                    }
                    int i15 = 8 - i13;
                    byte[] bArr3 = pVar.f2509d;
                    byte b10 = (byte) (bArr3[i14] & ((1 << i15) - 1));
                    bArr3[i14] = b10;
                    bArr3[i14] = (byte) (((i9 & ((1 << i13) - 1)) << i15) | b10);
                    pVar.t(14);
                    pVar.a();
                }
            }
            pVar.p(copyOf, copyOf.length);
            return pVar;
        }
        return new K0.p(bArr, bArr.length);
    }

    public static long l(byte b5, byte b7) {
        int i7;
        int i8;
        int i9 = b5 & ForkServer.ERROR;
        int i10 = b5 & 3;
        if (i10 != 0) {
            i7 = 2;
            if (i10 != 1 && i10 != 2) {
                i7 = b7 & 63;
            }
        } else {
            i7 = 1;
        }
        int i11 = i9 >> 3;
        int i12 = i11 & 3;
        if (i11 >= 16) {
            i8 = 2500 << i12;
        } else if (i11 >= 12) {
            i8 = 10000 << (i11 & 1);
        } else if (i12 == 3) {
            i8 = 60000;
        } else {
            i8 = 10000 << i12;
        }
        return i7 * i8;
    }

    public static int m(K0.p pVar) {
        int i7 = pVar.i(4);
        if (i7 == 15) {
            if (pVar.b() >= 24) {
                return pVar.i(24);
            }
            throw J.a(null, "AAC header insufficient data");
        } else if (i7 < 13) {
            return f13905a[i7];
        } else {
            throw J.a(null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static int n(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    public static C1429c o(K0.p pVar) {
        boolean z7;
        String str;
        int h8;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int g3 = pVar.g();
        pVar.t(40);
        if (pVar.i(5) > 10) {
            z7 = true;
        } else {
            z7 = false;
        }
        pVar.q(g3);
        int[] iArr = f;
        int[] iArr2 = f13908d;
        int i21 = -1;
        if (z7) {
            pVar.t(16);
            int i22 = pVar.i(2);
            if (i22 != 0) {
                if (i22 != 1) {
                    if (i22 == 2) {
                        i21 = 2;
                    }
                } else {
                    i21 = 1;
                }
            } else {
                i21 = 0;
            }
            pVar.t(3);
            h8 = (pVar.i(11) + 1) * 2;
            int i23 = pVar.i(2);
            if (i23 == 3) {
                i13 = f13909e[pVar.i(2)];
                i12 = 3;
                i14 = 6;
            } else {
                i12 = pVar.i(2);
                int i24 = f13907c[i12];
                i13 = iArr2[i23];
                i14 = i24;
            }
            int i25 = i14 * RecognitionOptions.QR_CODE;
            int i26 = (h8 * i13) / (i14 * 32);
            int i27 = pVar.i(3);
            boolean h9 = pVar.h();
            int i28 = iArr[i27] + (h9 ? 1 : 0);
            pVar.t(10);
            if (pVar.h()) {
                pVar.t(8);
            }
            if (i27 == 0) {
                pVar.t(5);
                if (pVar.h()) {
                    pVar.t(8);
                }
            }
            if (i21 == 1 && pVar.h()) {
                pVar.t(16);
            }
            if (pVar.h()) {
                if (i27 > 2) {
                    pVar.t(2);
                }
                if ((i27 & 1) != 0 && i27 > 2) {
                    i17 = 6;
                    pVar.t(6);
                } else {
                    i17 = 6;
                }
                if ((i27 & 4) != 0) {
                    pVar.t(i17);
                }
                if (h9 && pVar.h()) {
                    pVar.t(5);
                }
                if (i21 == 0) {
                    if (pVar.h()) {
                        i18 = 6;
                        pVar.t(6);
                    } else {
                        i18 = 6;
                    }
                    if (i27 == 0 && pVar.h()) {
                        pVar.t(i18);
                    }
                    if (pVar.h()) {
                        pVar.t(i18);
                    }
                    int i29 = pVar.i(2);
                    if (i29 == 1) {
                        pVar.t(5);
                        i20 = 2;
                    } else {
                        if (i29 == 2) {
                            pVar.t(12);
                        } else if (i29 == 3) {
                            int i30 = pVar.i(5);
                            if (pVar.h()) {
                                pVar.t(5);
                                if (pVar.h()) {
                                    pVar.t(4);
                                }
                                if (pVar.h()) {
                                    pVar.t(4);
                                }
                                if (pVar.h()) {
                                    pVar.t(4);
                                }
                                if (pVar.h()) {
                                    pVar.t(4);
                                }
                                if (pVar.h()) {
                                    pVar.t(4);
                                }
                                if (pVar.h()) {
                                    pVar.t(4);
                                }
                                if (pVar.h()) {
                                    pVar.t(4);
                                }
                                if (pVar.h()) {
                                    if (pVar.h()) {
                                        pVar.t(4);
                                    }
                                    if (pVar.h()) {
                                        pVar.t(4);
                                    }
                                }
                            }
                            if (pVar.h()) {
                                pVar.t(5);
                                if (pVar.h()) {
                                    pVar.t(7);
                                    if (pVar.h()) {
                                        i19 = 8;
                                        pVar.t(8);
                                        i20 = 2;
                                        pVar.t((i30 + 2) * i19);
                                        pVar.c();
                                    }
                                }
                            }
                            i19 = 8;
                            i20 = 2;
                            pVar.t((i30 + 2) * i19);
                            pVar.c();
                        }
                        i20 = 2;
                    }
                    if (i27 < i20) {
                        if (pVar.h()) {
                            pVar.t(14);
                        }
                        if (i27 == 0 && pVar.h()) {
                            pVar.t(14);
                        }
                    }
                    if (pVar.h()) {
                        if (i12 == 0) {
                            pVar.t(5);
                        } else {
                            for (int i31 = 0; i31 < i14; i31++) {
                                if (pVar.h()) {
                                    pVar.t(5);
                                }
                            }
                        }
                    }
                }
            }
            if (pVar.h()) {
                pVar.t(5);
                if (i27 == 2) {
                    pVar.t(4);
                }
                if (i27 >= 6) {
                    pVar.t(2);
                }
                if (pVar.h()) {
                    i16 = 8;
                    pVar.t(8);
                } else {
                    i16 = 8;
                }
                if (i27 == 0 && pVar.h()) {
                    pVar.t(i16);
                }
                if (i23 < 3) {
                    pVar.s();
                }
            }
            if (i21 == 0 && i12 != 3) {
                pVar.s();
            }
            if (i21 == 2 && (i12 == 3 || pVar.h())) {
                i15 = 6;
                pVar.t(6);
            } else {
                i15 = 6;
            }
            if (pVar.h() && pVar.i(i15) == 1 && pVar.i(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i8 = i28;
            i10 = i13;
            i11 = i25;
            i9 = i26;
        } else {
            pVar.t(32);
            int i32 = pVar.i(2);
            if (i32 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            int i33 = pVar.i(6);
            int i34 = f13910g[i33 / 2] * PipesIterator.DEFAULT_QUEUE_SIZE;
            h8 = h(i32, i33);
            pVar.t(8);
            int i35 = pVar.i(3);
            if ((i35 & 1) != 0 && i35 != 1) {
                i7 = 2;
                pVar.t(2);
            } else {
                i7 = 2;
            }
            if ((i35 & 4) != 0) {
                pVar.t(i7);
            }
            if (i35 == i7) {
                pVar.t(i7);
            }
            if (i32 < 3) {
                i21 = iArr2[i32];
            }
            i8 = iArr[i35] + (pVar.h() ? 1 : 0);
            str2 = str;
            i9 = i34;
            i10 = i21;
            i11 = 1536;
        }
        return new C1429c(str2, i8, i10, h8, i11, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Y1.C0406g p(K0.p r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = m1.AbstractC1428b.f13912i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            Y1.g r1 = new Y1.g
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.AbstractC1428b.p(K0.p):Y1.g");
    }

    public static C1427a q(K0.p pVar, boolean z7) {
        int i7 = pVar.i(5);
        if (i7 == 31) {
            i7 = pVar.i(6) + 32;
        }
        int m7 = m(pVar);
        int i8 = pVar.i(4);
        String e7 = io.flutter.plugins.pathprovider.b.e(i7, "mp4a.40.");
        if (i7 == 5 || i7 == 29) {
            m7 = m(pVar);
            int i9 = pVar.i(5);
            if (i9 == 31) {
                i9 = pVar.i(6) + 32;
            }
            i7 = i9;
            if (i7 == 22) {
                i8 = pVar.i(4);
            }
        }
        if (z7) {
            if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 17) {
                switch (i7) {
                    case 19:
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw J.c("Unsupported audio object type: " + i7);
                }
            }
            if (pVar.h()) {
                K0.a.A("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (pVar.h()) {
                pVar.t(14);
            }
            boolean h8 = pVar.h();
            if (i8 != 0) {
                if (i7 == 6 || i7 == 20) {
                    pVar.t(3);
                }
                if (h8) {
                    if (i7 == 22) {
                        pVar.t(16);
                    }
                    if (i7 == 17 || i7 == 19 || i7 == 20 || i7 == 23) {
                        pVar.t(3);
                    }
                    pVar.t(1);
                }
                switch (i7) {
                    case 17:
                    case 19:
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                        int i10 = pVar.i(2);
                        if (i10 == 2 || i10 == 3) {
                            throw J.c("Unsupported epConfig: " + i10);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i11 = f13906b[i8];
        if (i11 != -1) {
            return new C1427a(m7, i11, e7);
        }
        throw J.a(null, null);
    }

    public static int r(K0.p pVar, int[] iArr) {
        int i7 = 0;
        for (int i8 = 0; i8 < 3 && pVar.h(); i8++) {
            i7++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 += 1 << iArr[i10];
        }
        return pVar.i(iArr[i7]) + i9;
    }

    public static H0.H s(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = (String) list.get(i7);
            int i8 = K0.x.f2529a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                K0.a.A("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C2033a.a(new K0.q(Base64.decode(split[1], 0))));
                } catch (RuntimeException e7) {
                    K0.a.B("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new C2034b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new H0.H(arrayList);
    }

    public static int t(int i7, K0.q qVar) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return qVar.u() + 1;
            case 7:
                return qVar.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                return RecognitionOptions.QR_CODE << (i7 - 8);
            default:
                return -1;
        }
    }

    public static t0 u(K0.q qVar) {
        qVar.H(1);
        int x7 = qVar.x();
        long j8 = qVar.f2514b + x7;
        int i7 = x7 / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long o7 = qVar.o();
            if (o7 == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = o7;
            jArr2[i8] = qVar.o();
            qVar.H(2);
            i8++;
        }
        qVar.H((int) (j8 - qVar.f2514b));
        return new t0(27, jArr, jArr2);
    }

    public static io.grpc.okhttp.internal.e v(K0.q qVar, boolean z7, boolean z8) {
        if (z7) {
            w(3, qVar, false);
        }
        qVar.s((int) qVar.l(), z3.h.f16886c);
        long l8 = qVar.l();
        String[] strArr = new String[(int) l8];
        for (int i7 = 0; i7 < l8; i7++) {
            strArr[i7] = qVar.s((int) qVar.l(), z3.h.f16886c);
        }
        if (z8 && (qVar.u() & 1) == 0) {
            throw J.a(null, "framing bit expected to be set");
        }
        return new io.grpc.okhttp.internal.e(strArr);
    }

    public static boolean w(int i7, K0.q qVar, boolean z7) {
        if (qVar.a() < 7) {
            if (z7) {
                return false;
            }
            throw J.a(null, "too short header: " + qVar.a());
        } else if (qVar.u() != i7) {
            if (z7) {
                return false;
            }
            throw J.a(null, "expected header type " + Integer.toHexString(i7));
        } else if (qVar.u() == 118 && qVar.u() == 111 && qVar.u() == 114 && qVar.u() == 98 && qVar.u() == 105 && qVar.u() == 115) {
            return true;
        } else {
            if (z7) {
                return false;
            }
            throw J.a(null, "expected characters 'vorbis'");
        }
    }
}
