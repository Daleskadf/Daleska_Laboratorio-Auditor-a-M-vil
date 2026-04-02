package r1;

import A.i;
import A1.h;
import A3.I;
import A3.K;
import A3.N;
import A3.e0;
import H0.C0140u;
import H0.H;
import H0.J;
import K0.x;
import S1.y;
import X5.E;
import b3.C0585f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.List;
import m1.AbstractC1428b;
import m1.G;
import m1.InterfaceC1426A;
import m1.l;
import m1.o;
import m1.p;
import m1.q;
import m1.s;
import m1.t;
import y1.C2033a;
/* renamed from: r1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1731a implements o {

    /* renamed from: e  reason: collision with root package name */
    public q f15451e;
    public G f;

    /* renamed from: h  reason: collision with root package name */
    public H f15453h;

    /* renamed from: i  reason: collision with root package name */
    public t f15454i;
    public int j;

    /* renamed from: k  reason: collision with root package name */
    public int f15455k;

    /* renamed from: l  reason: collision with root package name */
    public y f15456l;

    /* renamed from: m  reason: collision with root package name */
    public int f15457m;

    /* renamed from: n  reason: collision with root package name */
    public long f15458n;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f15447a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final K0.q f15448b = new K0.q(new byte[RecognitionOptions.TEZ_CODE], 0);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15449c = false;

    /* renamed from: d  reason: collision with root package name */
    public final C0140u f15450d = new Object();

    /* renamed from: g  reason: collision with root package name */
    public int f15452g = 0;

    @Override // m1.o
    public final void a(long j, long j8) {
        long j9 = 0;
        if (j == 0) {
            this.f15452g = 0;
        } else {
            y yVar = this.f15456l;
            if (yVar != null) {
                yVar.d(j8);
            }
        }
        if (j8 != 0) {
            j9 = -1;
        }
        this.f15458n = j9;
        this.f15457m = 0;
        this.f15448b.D(0);
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        l lVar = (l) pVar;
        H S7 = new C0585f(11).S(lVar, h.f60b);
        if (S7 != null) {
            int length = S7.f1692a.length;
        }
        K0.q qVar = new K0.q(4);
        lVar.q(qVar.f2513a, 0, 4, false);
        if (qVar.w() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(q qVar) {
        this.f15451e = qVar;
        this.f = qVar.s(0, 1);
        qVar.h();
    }

    @Override // m1.o
    public final int i(p pVar, C0140u c0140u) {
        i iVar;
        t tVar;
        InterfaceC1426A sVar;
        long j;
        long j8;
        long j9;
        boolean z7;
        long j10;
        boolean z8;
        boolean z9;
        boolean z10 = true;
        int i7 = this.f15452g;
        H h8 = null;
        if (i7 != 0) {
            byte[] bArr = this.f15447a;
            if (i7 != 1) {
                int i8 = 3;
                if (i7 != 2) {
                    int i9 = 7;
                    if (i7 != 3) {
                        long j11 = 0;
                        if (i7 != 4) {
                            if (i7 == 5) {
                                this.f.getClass();
                                this.f15454i.getClass();
                                y yVar = this.f15456l;
                                if (yVar != null && yVar.f5207c != null) {
                                    return yVar.b((l) pVar, c0140u);
                                }
                                if (this.f15458n == -1) {
                                    t tVar2 = this.f15454i;
                                    ((l) pVar).f = 0;
                                    l lVar = (l) pVar;
                                    lVar.b(1, false);
                                    byte[] bArr2 = new byte[1];
                                    lVar.q(bArr2, 0, 1, false);
                                    if ((bArr2[0] & 1) == 1) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    lVar.b(2, false);
                                    if (!z9) {
                                        i9 = 6;
                                    }
                                    K0.q qVar = new K0.q(i9);
                                    byte[] bArr3 = qVar.f2513a;
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        int h9 = lVar.h(bArr3, i10, i9 - i10);
                                        if (h9 == -1) {
                                            break;
                                        }
                                        i10 += h9;
                                    }
                                    qVar.F(i10);
                                    lVar.f = 0;
                                    try {
                                        long B7 = qVar.B();
                                        if (!z9) {
                                            B7 *= tVar2.f13988b;
                                        }
                                        j11 = B7;
                                    } catch (NumberFormatException unused) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        this.f15458n = j11;
                                        return 0;
                                    }
                                    throw J.a(null, null);
                                }
                                K0.q qVar2 = this.f15448b;
                                int i11 = qVar2.f2515c;
                                if (i11 < 32768) {
                                    int read = ((l) pVar).read(qVar2.f2513a, i11, RecognitionOptions.TEZ_CODE - i11);
                                    if (read == -1) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (!z7) {
                                        qVar2.F(i11 + read);
                                    } else if (qVar2.a() == 0) {
                                        t tVar3 = this.f15454i;
                                        int i12 = x.f2529a;
                                        this.f.e((this.f15458n * 1000000) / tVar3.f13991e, 1, this.f15457m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    z7 = false;
                                }
                                int i13 = qVar2.f2514b;
                                int i14 = this.f15457m;
                                int i15 = this.j;
                                if (i14 < i15) {
                                    qVar2.H(Math.min(i15 - i14, qVar2.a()));
                                }
                                this.f15454i.getClass();
                                int i16 = qVar2.f2514b;
                                while (true) {
                                    int i17 = qVar2.f2515c - 16;
                                    C0140u c0140u2 = this.f15450d;
                                    if (i16 <= i17) {
                                        qVar2.G(i16);
                                        if (AbstractC1428b.d(qVar2, this.f15454i, this.f15455k, c0140u2)) {
                                            qVar2.G(i16);
                                            j10 = c0140u2.f1902a;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        if (z7) {
                                            while (true) {
                                                int i18 = qVar2.f2515c;
                                                if (i16 <= i18 - this.j) {
                                                    qVar2.G(i16);
                                                    try {
                                                        z8 = AbstractC1428b.d(qVar2, this.f15454i, this.f15455k, c0140u2);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z8 = false;
                                                    }
                                                    if (qVar2.f2514b > qVar2.f2515c) {
                                                        z8 = false;
                                                    }
                                                    if (z8) {
                                                        qVar2.G(i16);
                                                        j10 = c0140u2.f1902a;
                                                        break;
                                                    }
                                                    i16++;
                                                } else {
                                                    qVar2.G(i18);
                                                    break;
                                                }
                                            }
                                        } else {
                                            qVar2.G(i16);
                                        }
                                        j10 = -1;
                                    }
                                }
                                int i19 = qVar2.f2514b - i13;
                                qVar2.G(i13);
                                this.f.d(i19, qVar2);
                                int i20 = i19 + this.f15457m;
                                this.f15457m = i20;
                                if (j10 != -1) {
                                    t tVar4 = this.f15454i;
                                    int i21 = x.f2529a;
                                    this.f.e((this.f15458n * 1000000) / tVar4.f13991e, 1, i20, 0, null);
                                    this.f15457m = 0;
                                    this.f15458n = j10;
                                }
                                if (qVar2.a() >= 16) {
                                    return 0;
                                }
                                int a7 = qVar2.a();
                                byte[] bArr4 = qVar2.f2513a;
                                System.arraycopy(bArr4, qVar2.f2514b, bArr4, 0, a7);
                                qVar2.G(0);
                                qVar2.F(a7);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        ((l) pVar).f = 0;
                        K0.q qVar3 = new K0.q(2);
                        l lVar2 = (l) pVar;
                        lVar2.q(qVar3.f2513a, 0, 2, false);
                        int A7 = qVar3.A();
                        if ((A7 >> 2) == 16382) {
                            lVar2.f = 0;
                            this.f15455k = A7;
                            q qVar4 = this.f15451e;
                            int i22 = x.f2529a;
                            long j12 = lVar2.f13974d;
                            this.f15454i.getClass();
                            t tVar5 = this.f15454i;
                            if (tVar5.f13995k != null) {
                                sVar = new s(tVar5, j12, 0);
                            } else {
                                long j13 = lVar2.f13973c;
                                if (j13 != -1 && tVar5.j > 0) {
                                    int i23 = this.f15455k;
                                    E e7 = new E(tVar5, 19);
                                    N n7 = new N(tVar5, i23);
                                    long b5 = tVar5.b();
                                    int i24 = tVar5.f13989c;
                                    int i25 = tVar5.f13990d;
                                    if (i25 > 0) {
                                        j = j13;
                                        j9 = ((i25 + i24) / 2) + 1;
                                    } else {
                                        j = j13;
                                        int i26 = tVar5.f13988b;
                                        int i27 = tVar5.f13987a;
                                        if (i27 == i26 && i27 > 0) {
                                            j8 = i27;
                                        } else {
                                            j8 = 4096;
                                        }
                                        j9 = (((j8 * tVar5.f13992g) * tVar5.f13993h) / 8) + 64;
                                    }
                                    y yVar2 = new y(e7, n7, b5, tVar5.j, j12, j, j9, Math.max(6, i24));
                                    this.f15456l = yVar2;
                                    sVar = yVar2.f5205a;
                                } else {
                                    sVar = new s(tVar5.b());
                                }
                            }
                            qVar4.x(sVar);
                            this.f15452g = 5;
                            return 0;
                        }
                        lVar2.f = 0;
                        throw J.a(null, "First frame does not start with sync code.");
                    }
                    t tVar6 = this.f15454i;
                    boolean z11 = false;
                    while (!z11) {
                        ((l) pVar).f = 0;
                        byte[] bArr5 = new byte[4];
                        K0.p pVar2 = new K0.p(bArr5, 4);
                        l lVar3 = (l) pVar;
                        lVar3.q(bArr5, 0, 4, false);
                        boolean h10 = pVar2.h();
                        int i28 = pVar2.i(i9);
                        int i29 = pVar2.i(24) + 4;
                        if (i28 == 0) {
                            byte[] bArr6 = new byte[38];
                            lVar3.f(bArr6, 0, 38, false);
                            tVar6 = new t(bArr6, 4);
                        } else if (tVar6 != null) {
                            if (i28 == i8) {
                                K0.q qVar5 = new K0.q(i29);
                                lVar3.f(qVar5.f2513a, 0, i29, false);
                                tVar = new t(tVar6.f13987a, tVar6.f13988b, tVar6.f13989c, tVar6.f13990d, tVar6.f13991e, tVar6.f13992g, tVar6.f13993h, tVar6.j, AbstractC1428b.u(qVar5), tVar6.f13996l);
                            } else {
                                H h11 = tVar6.f13996l;
                                if (i28 == 4) {
                                    K0.q qVar6 = new K0.q(i29);
                                    lVar3.f(qVar6.f2513a, 0, i29, false);
                                    qVar6.H(4);
                                    H s7 = AbstractC1428b.s(Arrays.asList(AbstractC1428b.v(qVar6, false, false).f12550b));
                                    if (h11 != null) {
                                        s7 = h11.d(s7);
                                    }
                                    tVar = new t(tVar6.f13987a, tVar6.f13988b, tVar6.f13989c, tVar6.f13990d, tVar6.f13991e, tVar6.f13992g, tVar6.f13993h, tVar6.j, tVar6.f13995k, s7);
                                } else if (i28 == 6) {
                                    K0.q qVar7 = new K0.q(i29);
                                    lVar3.f(qVar7.f2513a, 0, i29, false);
                                    qVar7.H(4);
                                    H h12 = new H(K.u(C2033a.a(qVar7)));
                                    if (h11 != null) {
                                        h12 = h11.d(h12);
                                    }
                                    tVar = new t(tVar6.f13987a, tVar6.f13988b, tVar6.f13989c, tVar6.f13990d, tVar6.f13991e, tVar6.f13992g, tVar6.f13993h, tVar6.j, tVar6.f13995k, h12);
                                } else {
                                    lVar3.m(i29);
                                }
                            }
                            tVar6 = tVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i30 = x.f2529a;
                        this.f15454i = tVar6;
                        z11 = h10;
                        i8 = 3;
                        i9 = 7;
                    }
                    this.f15454i.getClass();
                    this.j = Math.max(this.f15454i.f13989c, 6);
                    G g3 = this.f;
                    int i31 = x.f2529a;
                    g3.c(this.f15454i.c(bArr, this.f15453h));
                    this.f15452g = 4;
                    return 0;
                }
                K0.q qVar8 = new K0.q(4);
                ((l) pVar).f(qVar8.f2513a, 0, 4, false);
                if (qVar8.w() == 1716281667) {
                    this.f15452g = 3;
                    return 0;
                }
                throw J.a(null, "Failed to read FLAC stream marker.");
            }
            ((l) pVar).q(bArr, 0, bArr.length, false);
            ((l) pVar).f = 0;
            this.f15452g = 2;
            return 0;
        }
        ((l) pVar).f = 0;
        l lVar4 = (l) pVar;
        long t7 = lVar4.t();
        if (!this.f15449c) {
            iVar = null;
        } else {
            iVar = h.f60b;
        }
        H S7 = new C0585f(11).S(lVar4, iVar);
        if (S7 != null && S7.f1692a.length != 0) {
            h8 = S7;
        }
        lVar4.m((int) (lVar4.t() - t7));
        this.f15453h = h8;
        this.f15452g = 1;
        return 0;
    }

    @Override // m1.o
    public final void release() {
    }
}
