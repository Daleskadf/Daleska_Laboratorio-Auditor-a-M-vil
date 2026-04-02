package E1;

import A3.I;
import A3.K;
import A3.e0;
import B5.S;
import D.AbstractC0059i;
import H0.J;
import J1.j;
import K0.x;
import L0.g;
import V2.k;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import m1.G;
import m1.H;
import m1.l;
import m1.o;
import m1.p;
import m1.q;
import org.apache.tika.fork.ForkServer;
import z3.h;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f995e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0  reason: collision with root package name */
    public static final byte[] f996f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final byte[] f997g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final byte[] f998h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final UUID f999i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final Map f1000j0;

    /* renamed from: A  reason: collision with root package name */
    public boolean f1001A;

    /* renamed from: B  reason: collision with root package name */
    public long f1002B;

    /* renamed from: C  reason: collision with root package name */
    public long f1003C;

    /* renamed from: D  reason: collision with root package name */
    public long f1004D;

    /* renamed from: E  reason: collision with root package name */
    public S f1005E;

    /* renamed from: F  reason: collision with root package name */
    public S f1006F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f1007G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f1008H;

    /* renamed from: I  reason: collision with root package name */
    public int f1009I;

    /* renamed from: J  reason: collision with root package name */
    public long f1010J;

    /* renamed from: K  reason: collision with root package name */
    public long f1011K;

    /* renamed from: L  reason: collision with root package name */
    public int f1012L;

    /* renamed from: M  reason: collision with root package name */
    public int f1013M;

    /* renamed from: N  reason: collision with root package name */
    public int[] f1014N;

    /* renamed from: O  reason: collision with root package name */
    public int f1015O;

    /* renamed from: P  reason: collision with root package name */
    public int f1016P;

    /* renamed from: Q  reason: collision with root package name */
    public int f1017Q;

    /* renamed from: R  reason: collision with root package name */
    public int f1018R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f1019S;

    /* renamed from: T  reason: collision with root package name */
    public long f1020T;

    /* renamed from: U  reason: collision with root package name */
    public int f1021U;

    /* renamed from: V  reason: collision with root package name */
    public int f1022V;

    /* renamed from: W  reason: collision with root package name */
    public int f1023W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f1024X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f1025Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f1026Z;

    /* renamed from: a  reason: collision with root package name */
    public final b f1027a;

    /* renamed from: a0  reason: collision with root package name */
    public int f1028a0;

    /* renamed from: b  reason: collision with root package name */
    public final e f1029b;
    public byte b0;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f1030c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1031c0;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1032d;

    /* renamed from: d0  reason: collision with root package name */
    public q f1033d0;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1034e;
    public final j f;

    /* renamed from: g  reason: collision with root package name */
    public final K0.q f1035g;

    /* renamed from: h  reason: collision with root package name */
    public final K0.q f1036h;

    /* renamed from: i  reason: collision with root package name */
    public final K0.q f1037i;
    public final K0.q j;

    /* renamed from: k  reason: collision with root package name */
    public final K0.q f1038k;

    /* renamed from: l  reason: collision with root package name */
    public final K0.q f1039l;

    /* renamed from: m  reason: collision with root package name */
    public final K0.q f1040m;

    /* renamed from: n  reason: collision with root package name */
    public final K0.q f1041n;

    /* renamed from: o  reason: collision with root package name */
    public final K0.q f1042o;

    /* renamed from: p  reason: collision with root package name */
    public final K0.q f1043p;

    /* renamed from: q  reason: collision with root package name */
    public ByteBuffer f1044q;

    /* renamed from: r  reason: collision with root package name */
    public long f1045r;

    /* renamed from: s  reason: collision with root package name */
    public long f1046s;

    /* renamed from: t  reason: collision with root package name */
    public long f1047t;

    /* renamed from: u  reason: collision with root package name */
    public long f1048u;

    /* renamed from: v  reason: collision with root package name */
    public long f1049v;

    /* renamed from: w  reason: collision with root package name */
    public c f1050w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1051x;

    /* renamed from: y  reason: collision with root package name */
    public int f1052y;

    /* renamed from: z  reason: collision with root package name */
    public long f1053z;

    static {
        int i7 = x.f2529a;
        f996f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(h.f16886c);
        f997g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f998h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f999i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        AbstractC0059i.G(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC0059i.G(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f1000j0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(j jVar, int i7) {
        boolean z7;
        b bVar = new b();
        this.f1046s = -1L;
        this.f1047t = -9223372036854775807L;
        this.f1048u = -9223372036854775807L;
        this.f1049v = -9223372036854775807L;
        this.f1002B = -1L;
        this.f1003C = -1L;
        this.f1004D = -9223372036854775807L;
        this.f1027a = bVar;
        bVar.f942d = new A.c(this, 4);
        this.f = jVar;
        if ((i7 & 1) == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f1032d = z7;
        this.f1034e = (i7 & 2) == 0;
        this.f1029b = new e();
        this.f1030c = new SparseArray();
        this.f1037i = new K0.q(4);
        this.j = new K0.q(ByteBuffer.allocate(4).putInt(-1).array());
        this.f1038k = new K0.q(4);
        this.f1035g = new K0.q(g.f2861a);
        this.f1036h = new K0.q(4);
        this.f1039l = new K0.q();
        this.f1040m = new K0.q();
        this.f1041n = new K0.q(8);
        this.f1042o = new K0.q();
        this.f1043p = new K0.q();
        this.f1014N = new int[1];
    }

    public static byte[] j(long j, long j8, String str) {
        boolean z7;
        if (j != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        int i7 = (int) (j / 3600000000L);
        long j9 = j - (i7 * 3600000000L);
        int i8 = (int) (j9 / 60000000);
        long j10 = j9 - (i8 * 60000000);
        int i9 = (int) (j10 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (i9 * 1000000)) / j8)));
        int i10 = x.f2529a;
        return format.getBytes(h.f16886c);
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        this.f1004D = -9223372036854775807L;
        this.f1009I = 0;
        b bVar = this.f1027a;
        bVar.f943e = 0;
        bVar.f940b.clear();
        e eVar = bVar.f941c;
        eVar.f1056b = 0;
        eVar.f1057c = 0;
        e eVar2 = this.f1029b;
        eVar2.f1056b = 0;
        eVar2.f1057c = 0;
        l();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f1030c;
            if (i7 < sparseArray.size()) {
                H h8 = ((c) sparseArray.valueAt(i7)).f965U;
                if (h8 != null) {
                    h8.f13897b = false;
                    h8.f13898c = 0;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void b(int i7) {
        if (this.f1005E != null && this.f1006F != null) {
            return;
        }
        throw J.a(null, "Element " + i7 + " must be in a Cues");
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    public final void d(int i7) {
        if (this.f1050w != null) {
            return;
        }
        throw J.a(null, "Element " + i7 + " must be in a TrackEntry");
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        long j;
        int i7;
        S s7 = new S(1, (byte) 0);
        l lVar = (l) pVar;
        long j8 = lVar.f13973c;
        int i8 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
        long j9 = 1024;
        if (i8 != 0 && j8 <= 1024) {
            j9 = j8;
        }
        int i9 = (int) j9;
        K0.q qVar = (K0.q) s7.f336c;
        lVar.q(qVar.f2513a, 0, 4, false);
        s7.f335b = 4;
        for (long w2 = qVar.w(); w2 != 440786851; w2 = ((w2 << 8) & (-256)) | (qVar.f2513a[0] & ForkServer.ERROR)) {
            int i10 = s7.f335b + 1;
            s7.f335b = i10;
            if (i10 == i9) {
                return false;
            }
            lVar.q(qVar.f2513a, 0, 1, false);
        }
        long j10 = s7.j(lVar);
        long j11 = s7.f335b;
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        if (i8 != 0 && j11 + j10 >= j8) {
            return false;
        }
        while (true) {
            int i11 = (s7.f335b > (j11 + j10) ? 1 : (s7.f335b == (j11 + j10) ? 0 : -1));
            if (i11 < 0) {
                if (s7.j(lVar) == Long.MIN_VALUE || (s7.j(lVar)) < 0 || j > 2147483647L) {
                    return false;
                }
                if (i7 != 0) {
                    int i12 = (int) j;
                    lVar.b(i12, false);
                    s7.f335b += i12;
                }
            } else if (i11 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(q qVar) {
        this.f1033d0 = qVar;
        if (this.f1034e) {
            qVar = new k(qVar, this.f);
        }
        this.f1033d0 = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(E1.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.d.h(E1.c, long, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:509:0x0aa3, code lost:
        if (r1.o() == r3.getLeastSignificantBits()) goto L531;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [E1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v24, types: [m1.l] */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r43, H0.C0140u r44) {
        /*
            Method dump skipped, instructions count: 5280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.d.i(m1.p, H0.u):int");
    }

    public final void k(l lVar, int i7) {
        K0.q qVar = this.f1037i;
        if (qVar.f2515c >= i7) {
            return;
        }
        byte[] bArr = qVar.f2513a;
        if (bArr.length < i7) {
            qVar.b(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = qVar.f2513a;
        int i8 = qVar.f2515c;
        lVar.f(bArr2, i8, i7 - i8, false);
        qVar.F(i7);
    }

    public final void l() {
        this.f1021U = 0;
        this.f1022V = 0;
        this.f1023W = 0;
        this.f1024X = false;
        this.f1025Y = false;
        this.f1026Z = false;
        this.f1028a0 = 0;
        this.b0 = (byte) 0;
        this.f1031c0 = false;
        this.f1039l.D(0);
    }

    public final long m(long j) {
        long j8 = this.f1047t;
        if (j8 != -9223372036854775807L) {
            int i7 = x.f2529a;
            return x.U(j, j8, 1000L, RoundingMode.FLOOR);
        }
        throw J.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int n(l lVar, c cVar, int i7, boolean z7) {
        int b5;
        int b7;
        boolean z8;
        boolean z9;
        int i8;
        if ("S_TEXT/UTF8".equals(cVar.f972b)) {
            o(lVar, f995e0, i7);
            int i9 = this.f1022V;
            l();
            return i9;
        } else if ("S_TEXT/ASS".equals(cVar.f972b)) {
            o(lVar, f997g0, i7);
            int i10 = this.f1022V;
            l();
            return i10;
        } else if ("S_TEXT/WEBVTT".equals(cVar.f972b)) {
            o(lVar, f998h0, i7);
            int i11 = this.f1022V;
            l();
            return i11;
        } else {
            G g3 = cVar.f969Y;
            boolean z10 = this.f1024X;
            boolean z11 = true;
            K0.q qVar = this.f1039l;
            if (!z10) {
                boolean z12 = cVar.f977h;
                K0.q qVar2 = this.f1037i;
                if (z12) {
                    this.f1017Q &= -1073741825;
                    boolean z13 = this.f1025Y;
                    int i12 = RecognitionOptions.ITF;
                    if (!z13) {
                        lVar.f(qVar2.f2513a, 0, 1, false);
                        this.f1021U++;
                        byte b8 = qVar2.f2513a[0];
                        if ((b8 & 128) != 128) {
                            this.b0 = b8;
                            this.f1025Y = true;
                        } else {
                            throw J.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b9 = this.b0;
                    if ((b9 & 1) == 1) {
                        if ((b9 & 2) == 2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.f1017Q |= 1073741824;
                        if (!this.f1031c0) {
                            K0.q qVar3 = this.f1041n;
                            lVar.f(qVar3.f2513a, 0, 8, false);
                            this.f1021U += 8;
                            this.f1031c0 = true;
                            byte[] bArr = qVar2.f2513a;
                            if (!z9) {
                                i12 = 0;
                            }
                            bArr[0] = (byte) (i12 | 8);
                            qVar2.G(0);
                            g3.a(qVar2, 1, 1);
                            this.f1022V++;
                            qVar3.G(0);
                            g3.a(qVar3, 8, 1);
                            this.f1022V += 8;
                        }
                        if (z9) {
                            if (!this.f1026Z) {
                                lVar.f(qVar2.f2513a, 0, 1, false);
                                this.f1021U++;
                                qVar2.G(0);
                                this.f1028a0 = qVar2.u();
                                this.f1026Z = true;
                            }
                            int i13 = this.f1028a0 * 4;
                            qVar2.D(i13);
                            lVar.f(qVar2.f2513a, 0, i13, false);
                            this.f1021U += i13;
                            short s7 = (short) ((this.f1028a0 / 2) + 1);
                            int i14 = (s7 * 6) + 2;
                            ByteBuffer byteBuffer = this.f1044q;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f1044q = ByteBuffer.allocate(i14);
                            }
                            this.f1044q.position(0);
                            this.f1044q.putShort(s7);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i8 = this.f1028a0;
                                if (i15 >= i8) {
                                    break;
                                }
                                int y2 = qVar2.y();
                                if (i15 % 2 == 0) {
                                    this.f1044q.putShort((short) (y2 - i16));
                                } else {
                                    this.f1044q.putInt(y2 - i16);
                                }
                                i15++;
                                i16 = y2;
                            }
                            int i17 = (i7 - this.f1021U) - i16;
                            if (i8 % 2 == 1) {
                                this.f1044q.putInt(i17);
                            } else {
                                this.f1044q.putShort((short) i17);
                                this.f1044q.putInt(0);
                            }
                            byte[] array = this.f1044q.array();
                            K0.q qVar4 = this.f1042o;
                            qVar4.E(array, i14);
                            g3.a(qVar4, i14, 1);
                            this.f1022V += i14;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f978i;
                    if (bArr2 != null) {
                        qVar.E(bArr2, bArr2.length);
                    }
                }
                if ("A_OPUS".equals(cVar.f972b)) {
                    z8 = z7;
                } else if (cVar.f > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    this.f1017Q |= 268435456;
                    this.f1043p.D(0);
                    int i18 = (qVar.f2515c + i7) - this.f1021U;
                    qVar2.D(4);
                    byte[] bArr3 = qVar2.f2513a;
                    bArr3[0] = (byte) ((i18 >> 24) & 255);
                    bArr3[1] = (byte) ((i18 >> 16) & 255);
                    bArr3[2] = (byte) ((i18 >> 8) & 255);
                    bArr3[3] = (byte) (i18 & 255);
                    g3.a(qVar2, 4, 2);
                    this.f1022V += 4;
                }
                this.f1024X = true;
            }
            int i19 = i7 + qVar.f2515c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f972b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f972b)) {
                if (cVar.f965U != null) {
                    if (qVar.f2515c != 0) {
                        z11 = false;
                    }
                    K0.a.j(z11);
                    cVar.f965U.c(lVar);
                }
                while (true) {
                    int i20 = this.f1021U;
                    if (i20 >= i19) {
                        break;
                    }
                    int i21 = i19 - i20;
                    int a7 = qVar.a();
                    if (a7 > 0) {
                        b7 = Math.min(i21, a7);
                        g3.d(b7, qVar);
                    } else {
                        b7 = g3.b(lVar, i21, false);
                    }
                    this.f1021U += b7;
                    this.f1022V += b7;
                }
            } else {
                K0.q qVar5 = this.f1036h;
                byte[] bArr4 = qVar5.f2513a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i22 = cVar.f970Z;
                int i23 = 4 - i22;
                while (this.f1021U < i19) {
                    int i24 = this.f1023W;
                    if (i24 == 0) {
                        int min = Math.min(i22, qVar.a());
                        lVar.f(bArr4, i23 + min, i22 - min, false);
                        if (min > 0) {
                            qVar.f(bArr4, i23, min);
                        }
                        this.f1021U += i22;
                        qVar5.G(0);
                        this.f1023W = qVar5.y();
                        K0.q qVar6 = this.f1035g;
                        qVar6.G(0);
                        g3.d(4, qVar6);
                        this.f1022V += 4;
                    } else {
                        int a8 = qVar.a();
                        if (a8 > 0) {
                            b5 = Math.min(i24, a8);
                            g3.d(b5, qVar);
                        } else {
                            b5 = g3.b(lVar, i24, false);
                        }
                        this.f1021U += b5;
                        this.f1022V += b5;
                        this.f1023W -= b5;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f972b)) {
                K0.q qVar7 = this.j;
                qVar7.G(0);
                g3.d(4, qVar7);
                this.f1022V += 4;
            }
            int i25 = this.f1022V;
            l();
            return i25;
        }
    }

    public final void o(l lVar, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        K0.q qVar = this.f1040m;
        byte[] bArr2 = qVar.f2513a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i7);
            qVar.E(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.f(qVar.f2513a, bArr.length, i7, false);
        qVar.G(0);
        qVar.F(length);
    }

    @Override // m1.o
    public final void release() {
    }
}
