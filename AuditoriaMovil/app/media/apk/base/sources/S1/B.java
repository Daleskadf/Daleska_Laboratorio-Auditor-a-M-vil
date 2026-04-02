package S1;

import A3.K;
import A3.e0;
import H0.C0140u;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j6.C1372c;
import java.util.List;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class B implements m1.o {

    /* renamed from: e  reason: collision with root package name */
    public boolean f4924e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4925g;

    /* renamed from: h  reason: collision with root package name */
    public long f4926h;

    /* renamed from: i  reason: collision with root package name */
    public y f4927i;
    public m1.q j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4928k;

    /* renamed from: a  reason: collision with root package name */
    public final K0.v f4920a = new K0.v(0);

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f4922c = new K0.q((int) RecognitionOptions.AZTEC);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray f4921b = new SparseArray();

    /* renamed from: d  reason: collision with root package name */
    public final z f4923d = new z(0);

    @Override // m1.o
    public final void a(long j, long j8) {
        boolean z7;
        K0.v vVar = this.f4920a;
        boolean z8 = true;
        if (vVar.e() == -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            long d7 = vVar.d();
            if (d7 == -9223372036854775807L || d7 == 0 || d7 == j8) {
                z8 = false;
            }
            z7 = z8;
        }
        if (z7) {
            vVar.g(j8);
        }
        y yVar = this.f4927i;
        if (yVar != null) {
            yVar.d(j8);
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f4921b;
            if (i7 < sparseArray.size()) {
                A a7 = (A) sparseArray.valueAt(i7);
                a7.f = false;
                a7.f4914a.a();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(m1.p pVar) {
        byte[] bArr = new byte[14];
        m1.l lVar = (m1.l) pVar;
        lVar.q(bArr, 0, 14, false);
        if (442 != (((bArr[0] & ForkServer.ERROR) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.b(bArr[13] & 7, false);
        lVar.q(bArr, 0, 3, false);
        if (1 != (((bArr[0] & ForkServer.ERROR) << 16) | ((bArr[1] & ForkServer.ERROR) << 8) | (bArr[2] & ForkServer.ERROR))) {
            return false;
        }
        return true;
    }

    @Override // m1.o
    public final List f() {
        A3.I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        this.j = qVar;
    }

    @Override // m1.o
    public final int i(m1.p pVar, C0140u c0140u) {
        int i7;
        long j;
        long j8;
        long j9;
        InterfaceC0341i interfaceC0341i;
        long j10;
        long j11;
        K0.a.k(this.j);
        long j12 = ((m1.l) pVar).f13973c;
        int i8 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
        int i9 = 1;
        z zVar = this.f4923d;
        if (i8 != 0 && !zVar.f5212d) {
            boolean z7 = zVar.f;
            K0.q qVar = zVar.f5211c;
            if (!z7) {
                m1.l lVar = (m1.l) pVar;
                long j13 = lVar.f13973c;
                int min = (int) Math.min(20000L, j13);
                long j14 = j13 - min;
                if (lVar.f13974d != j14) {
                    c0140u.f1902a = j14;
                } else {
                    qVar.D(min);
                    lVar.f = 0;
                    lVar.q(qVar.f2513a, 0, min, false);
                    int i10 = qVar.f2514b;
                    int i11 = qVar.f2515c - 4;
                    while (true) {
                        if (i11 >= i10) {
                            if (z.b(qVar.f2513a, i11) == 442) {
                                qVar.G(i11 + 4);
                                j11 = z.c(qVar);
                                if (j11 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i11--;
                        } else {
                            j11 = -9223372036854775807L;
                            break;
                        }
                    }
                    zVar.f5215h = j11;
                    zVar.f = true;
                    i9 = 0;
                }
            } else if (zVar.f5215h == -9223372036854775807L) {
                zVar.a((m1.l) pVar);
                return 0;
            } else if (!zVar.f5213e) {
                m1.l lVar2 = (m1.l) pVar;
                int min2 = (int) Math.min(20000L, lVar2.f13973c);
                long j15 = 0;
                if (lVar2.f13974d != j15) {
                    c0140u.f1902a = j15;
                } else {
                    qVar.D(min2);
                    lVar2.f = 0;
                    lVar2.q(qVar.f2513a, 0, min2, false);
                    int i12 = qVar.f2514b;
                    int i13 = qVar.f2515c;
                    while (true) {
                        if (i12 < i13 - 3) {
                            if (z.b(qVar.f2513a, i12) == 442) {
                                qVar.G(i12 + 4);
                                j10 = z.c(qVar);
                                if (j10 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i12++;
                        } else {
                            j10 = -9223372036854775807L;
                            break;
                        }
                    }
                    zVar.f5214g = j10;
                    zVar.f5213e = true;
                    i9 = 0;
                }
            } else {
                long j16 = zVar.f5214g;
                if (j16 == -9223372036854775807L) {
                    zVar.a((m1.l) pVar);
                    return 0;
                }
                K0.v vVar = zVar.f5210b;
                zVar.f5216i = vVar.c(zVar.f5215h) - vVar.b(j16);
                zVar.a((m1.l) pVar);
                return 0;
            }
            return i9;
        }
        if (!this.f4928k) {
            this.f4928k = true;
            long j17 = zVar.f5216i;
            if (j17 != -9223372036854775807L) {
                i7 = i8;
                j = j12;
                y yVar = new y(new C1372c(20), new M0.x(zVar.f5210b), j17, j17 + 1, 0L, j12, 188L, PipesIterator.DEFAULT_QUEUE_SIZE);
                this.f4927i = yVar;
                this.j.x(yVar.f5205a);
            } else {
                i7 = i8;
                j = j12;
                this.j.x(new m1.s(j17));
            }
        } else {
            i7 = i8;
            j = j12;
        }
        y yVar2 = this.f4927i;
        if (yVar2 != null && yVar2.f5207c != null) {
            return yVar2.b((m1.l) pVar, c0140u);
        }
        m1.l lVar3 = (m1.l) pVar;
        lVar3.f = 0;
        if (i7 != 0) {
            j8 = j - lVar3.t();
        } else {
            j8 = -1;
        }
        if (j8 != -1 && j8 < 4) {
            return -1;
        }
        K0.q qVar2 = this.f4922c;
        if (!lVar3.q(qVar2.f2513a, 0, 4, true)) {
            return -1;
        }
        qVar2.G(0);
        int h8 = qVar2.h();
        if (h8 == 441) {
            return -1;
        }
        if (h8 == 442) {
            lVar3.q(qVar2.f2513a, 0, 10, false);
            qVar2.G(9);
            lVar3.m((qVar2.u() & 7) + 14);
            return 0;
        } else if (h8 == 443) {
            lVar3.q(qVar2.f2513a, 0, 2, false);
            qVar2.G(0);
            lVar3.m(qVar2.A() + 6);
            return 0;
        } else if (((h8 & (-256)) >> 8) != 1) {
            lVar3.m(1);
            return 0;
        } else {
            int i14 = h8 & 255;
            SparseArray sparseArray = this.f4921b;
            A a7 = (A) sparseArray.get(i14);
            if (!this.f4924e) {
                if (a7 == null) {
                    if (i14 == 189) {
                        interfaceC0341i = new C0334b();
                        this.f = true;
                        this.f4926h = lVar3.f13974d;
                    } else if ((h8 & 224) == 192) {
                        interfaceC0341i = new u(null, 0);
                        this.f = true;
                        this.f4926h = lVar3.f13974d;
                    } else if ((h8 & 240) == 224) {
                        interfaceC0341i = new k(null);
                        this.f4925g = true;
                        this.f4926h = lVar3.f13974d;
                    } else {
                        interfaceC0341i = null;
                    }
                    if (interfaceC0341i != null) {
                        interfaceC0341i.e(this.j, new H(i14, (int) RecognitionOptions.QR_CODE));
                        a7 = new A(interfaceC0341i, this.f4920a);
                        sparseArray.put(i14, a7);
                    }
                }
                if (this.f && this.f4925g) {
                    j9 = this.f4926h + 8192;
                } else {
                    j9 = 1048576;
                }
                if (lVar3.f13974d > j9) {
                    this.f4924e = true;
                    this.j.h();
                }
            }
            lVar3.q(qVar2.f2513a, 0, 2, false);
            qVar2.G(0);
            int A7 = qVar2.A() + 6;
            if (a7 == null) {
                lVar3.m(A7);
            } else {
                qVar2.D(A7);
                lVar3.f(qVar2.f2513a, 0, A7, false);
                qVar2.G(6);
                K0.p pVar2 = a7.f4916c;
                qVar2.f(pVar2.f2509d, 0, 3);
                pVar2.q(0);
                pVar2.t(8);
                a7.f4917d = pVar2.h();
                a7.f4918e = pVar2.h();
                pVar2.t(6);
                qVar2.f(pVar2.f2509d, 0, pVar2.i(8));
                pVar2.q(0);
                a7.f4919g = 0L;
                if (a7.f4917d) {
                    pVar2.t(4);
                    pVar2.t(1);
                    pVar2.t(1);
                    long i15 = (pVar2.i(3) << 30) | (pVar2.i(15) << 15) | pVar2.i(15);
                    pVar2.t(1);
                    boolean z8 = a7.f;
                    K0.v vVar2 = a7.f4915b;
                    if (!z8 && a7.f4918e) {
                        pVar2.t(4);
                        pVar2.t(1);
                        pVar2.t(1);
                        pVar2.t(1);
                        vVar2.b((pVar2.i(3) << 30) | (pVar2.i(15) << 15) | pVar2.i(15));
                        a7.f = true;
                    }
                    a7.f4919g = vVar2.b(i15);
                }
                long j18 = a7.f4919g;
                InterfaceC0341i interfaceC0341i2 = a7.f4914a;
                interfaceC0341i2.d(4, j18);
                interfaceC0341i2.b(qVar2);
                interfaceC0341i2.c(false);
                qVar2.F(qVar2.f2513a.length);
            }
            return 0;
        }
    }

    @Override // m1.o
    public final void release() {
    }
}
