package S1;

import A3.K;
import A3.N;
import A3.e0;
import H0.C0140u;
import H0.J;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j6.C1372c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class F implements m1.o {

    /* renamed from: a  reason: collision with root package name */
    public final int f4937a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4938b;

    /* renamed from: c  reason: collision with root package name */
    public final List f4939c;

    /* renamed from: d  reason: collision with root package name */
    public final K0.q f4940d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f4941e;
    public final C0338f f;

    /* renamed from: g  reason: collision with root package name */
    public final J1.j f4942g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray f4943h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f4944i;
    public final SparseBooleanArray j;

    /* renamed from: k  reason: collision with root package name */
    public final z f4945k;

    /* renamed from: l  reason: collision with root package name */
    public y f4946l;

    /* renamed from: m  reason: collision with root package name */
    public m1.q f4947m;

    /* renamed from: n  reason: collision with root package name */
    public int f4948n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4949o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4950p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4951q;

    /* renamed from: r  reason: collision with root package name */
    public I f4952r;

    /* renamed from: s  reason: collision with root package name */
    public int f4953s;

    /* renamed from: t  reason: collision with root package name */
    public int f4954t;

    public F(int i7, int i8, J1.j jVar, K0.v vVar, C0338f c0338f) {
        this.f = c0338f;
        this.f4937a = i7;
        this.f4938b = i8;
        this.f4942g = jVar;
        if (i7 != 1 && i7 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f4939c = arrayList;
            arrayList.add(vVar);
        } else {
            this.f4939c = Collections.singletonList(vVar);
        }
        this.f4940d = new K0.q(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f4944i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f4943h = sparseArray;
        this.f4941e = new SparseIntArray();
        this.f4945k = new z(1);
        this.f4947m = m1.q.f13983c0;
        this.f4954t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i9 = 0; i9 < size; i9++) {
            sparseArray.put(sparseArray2.keyAt(i9), (I) sparseArray2.valueAt(i9));
        }
        sparseArray.put(0, new D(new M0.x(this)));
        this.f4952r = null;
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        boolean z7;
        y yVar;
        boolean z8;
        if (this.f4937a != 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        List list = this.f4939c;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            K0.v vVar = (K0.v) list.get(i7);
            if (vVar.e() == -9223372036854775807L) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                long d7 = vVar.d();
                if (d7 != -9223372036854775807L && d7 != 0 && d7 != j8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            if (z8) {
                vVar.g(j8);
            }
        }
        if (j8 != 0 && (yVar = this.f4946l) != null) {
            yVar.d(j8);
        }
        this.f4940d.D(0);
        this.f4941e.clear();
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f4943h;
            if (i8 < sparseArray.size()) {
                ((I) sparseArray.valueAt(i8)).a();
                i8++;
            } else {
                this.f4953s = 0;
                return;
            }
        }
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r2 = r2 + 1;
     */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(m1.p r7) {
        /*
            r6 = this;
            K0.q r0 = r6.f4940d
            byte[] r0 = r0.f2513a
            m1.l r7 = (m1.l) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.q(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.m(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.F.e(m1.p):boolean");
    }

    @Override // m1.o
    public final List f() {
        A3.I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        if ((this.f4938b & 1) == 0) {
            qVar = new V2.k(qVar, this.f4942g);
        }
        this.f4947m = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // m1.o
    public final int i(m1.p pVar, C0140u c0140u) {
        Object[] objArr;
        ?? r22;
        int i7;
        long j;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z7;
        int i12;
        long j8;
        long j9;
        long j10 = ((m1.l) pVar).f13973c;
        int i13 = this.f4937a;
        if (i13 == 2) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (this.f4949o) {
            int i14 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            z zVar = this.f4945k;
            if (i14 != 0 && objArr == null && !zVar.f5212d) {
                int i15 = this.f4954t;
                if (i15 <= 0) {
                    zVar.a((m1.l) pVar);
                    return 0;
                }
                boolean z8 = zVar.f;
                K0.q qVar = zVar.f5211c;
                if (!z8) {
                    m1.l lVar = (m1.l) pVar;
                    long j11 = lVar.f13973c;
                    int min = (int) Math.min(112800, j11);
                    long j12 = j11 - min;
                    if (lVar.f13974d != j12) {
                        c0140u.f1902a = j12;
                    } else {
                        qVar.D(min);
                        lVar.f = 0;
                        lVar.q(qVar.f2513a, 0, min, false);
                        int i16 = qVar.f2514b;
                        int i17 = qVar.f2515c;
                        int i18 = i17 - 188;
                        while (true) {
                            if (i18 >= i16) {
                                byte[] bArr = qVar.f2513a;
                                int i19 = -4;
                                int i20 = 0;
                                while (true) {
                                    if (i19 > 4) {
                                        break;
                                    }
                                    int i21 = (i19 * 188) + i18;
                                    if (i21 >= i16 && i21 < i17 && bArr[i21] == 71) {
                                        i20++;
                                        if (i20 == 5) {
                                            long j02 = f7.a.j0(qVar, i18, i15);
                                            if (j02 != -9223372036854775807L) {
                                                j9 = j02;
                                                break;
                                            }
                                        }
                                    } else {
                                        i20 = 0;
                                    }
                                    i19++;
                                }
                                i18--;
                            } else {
                                j9 = -9223372036854775807L;
                                break;
                            }
                        }
                        zVar.f5215h = j9;
                        zVar.f = true;
                        return 0;
                    }
                } else if (zVar.f5215h == -9223372036854775807L) {
                    zVar.a((m1.l) pVar);
                    return 0;
                } else if (!zVar.f5213e) {
                    m1.l lVar2 = (m1.l) pVar;
                    int min2 = (int) Math.min(112800, lVar2.f13973c);
                    long j13 = 0;
                    if (lVar2.f13974d != j13) {
                        c0140u.f1902a = j13;
                    } else {
                        qVar.D(min2);
                        lVar2.f = 0;
                        lVar2.q(qVar.f2513a, 0, min2, false);
                        int i22 = qVar.f2514b;
                        int i23 = qVar.f2515c;
                        while (true) {
                            if (i22 < i23) {
                                if (qVar.f2513a[i22] == 71) {
                                    long j03 = f7.a.j0(qVar, i22, i15);
                                    if (j03 != -9223372036854775807L) {
                                        j8 = j03;
                                        break;
                                    }
                                }
                                i22++;
                            } else {
                                j8 = -9223372036854775807L;
                                break;
                            }
                        }
                        zVar.f5214g = j8;
                        zVar.f5213e = true;
                        return 0;
                    }
                } else {
                    long j14 = zVar.f5214g;
                    if (j14 == -9223372036854775807L) {
                        zVar.a((m1.l) pVar);
                        return 0;
                    }
                    K0.v vVar = zVar.f5210b;
                    zVar.f5216i = vVar.c(zVar.f5215h) - vVar.b(j14);
                    zVar.a((m1.l) pVar);
                    return 0;
                }
                return 1;
            }
            if (!this.f4950p) {
                this.f4950p = true;
                long j15 = zVar.f5216i;
                if (j15 != -9223372036854775807L) {
                    i7 = i13;
                    j = j10;
                    y yVar = new y(new C1372c(20), new N(this.f4954t, zVar.f5210b), j15, j15 + 1, 0L, j10, 188L, 940);
                    this.f4946l = yVar;
                    this.f4947m.x(yVar.f5205a);
                } else {
                    i7 = i13;
                    j = j10;
                    this.f4947m.x(new m1.s(j15));
                }
            } else {
                i7 = i13;
                j = j10;
            }
            if (this.f4951q) {
                this.f4951q = false;
                a(0L, 0L);
                if (((m1.l) pVar).f13974d != 0) {
                    c0140u.f1902a = 0L;
                    return 1;
                }
            }
            r22 = 1;
            r22 = 1;
            y yVar2 = this.f4946l;
            if (yVar2 != null && yVar2.f5207c != null) {
                return yVar2.b((m1.l) pVar, c0140u);
            }
        } else {
            r22 = 1;
            i7 = i13;
            j = j10;
        }
        K0.q qVar2 = this.f4940d;
        byte[] bArr2 = qVar2.f2513a;
        if (9400 - qVar2.f2514b < 188) {
            int a7 = qVar2.a();
            if (a7 > 0) {
                System.arraycopy(bArr2, qVar2.f2514b, bArr2, 0, a7);
            }
            qVar2.E(bArr2, a7);
        }
        while (true) {
            int a8 = qVar2.a();
            SparseArray sparseArray = this.f4943h;
            if (a8 < 188) {
                int i24 = qVar2.f2515c;
                int read = ((m1.l) pVar).read(bArr2, i24, 9400 - i24);
                if (read == -1) {
                    for (int i25 = 0; i25 < sparseArray.size(); i25++) {
                        I i26 = (I) sparseArray.valueAt(i25);
                        if (i26 instanceof x) {
                            x xVar = (x) i26;
                            if (xVar.f5197c == 3 && xVar.j == -1 && (objArr == null || !(xVar.f5195a instanceof k))) {
                                xVar.b(r22, new K0.q());
                            }
                        }
                    }
                    return -1;
                }
                qVar2.F(i24 + read);
            } else {
                int i27 = qVar2.f2514b;
                int i28 = qVar2.f2515c;
                byte[] bArr3 = qVar2.f2513a;
                int i29 = i27;
                while (i29 < i28 && bArr3[i29] != 71) {
                    i29++;
                }
                qVar2.G(i29);
                int i30 = i29 + 188;
                I i31 = null;
                if (i30 > i28) {
                    int i32 = (i29 - i27) + this.f4953s;
                    this.f4953s = i32;
                    i8 = i7;
                    i9 = 2;
                    if (i8 != 2 || i32 <= 376) {
                        i10 = 0;
                    } else {
                        throw J.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i8 = i7;
                    i9 = 2;
                    i10 = 0;
                    this.f4953s = 0;
                }
                int i33 = qVar2.f2515c;
                if (i30 > i33) {
                    return i10;
                }
                int h8 = qVar2.h();
                if ((8388608 & h8) != 0) {
                    qVar2.G(i30);
                    return i10;
                }
                if ((4194304 & h8) != 0) {
                    i11 = r22;
                } else {
                    i11 = 0;
                }
                int i34 = (2096896 & h8) >> 8;
                if ((h8 & 32) != 0) {
                    z7 = r22;
                } else {
                    z7 = false;
                }
                if ((h8 & 16) != 0) {
                    i31 = (I) sparseArray.get(i34);
                }
                if (i31 == null) {
                    qVar2.G(i30);
                    return 0;
                }
                if (i8 != i9) {
                    int i35 = h8 & 15;
                    SparseIntArray sparseIntArray = this.f4941e;
                    int i36 = sparseIntArray.get(i34, i35 - 1);
                    sparseIntArray.put(i34, i35);
                    if (i36 == i35) {
                        qVar2.G(i30);
                        return 0;
                    } else if (i35 != ((i36 + r22) & 15)) {
                        i31.a();
                    }
                }
                if (z7) {
                    int u7 = qVar2.u();
                    if ((qVar2.u() & 64) != 0) {
                        i12 = i9;
                    } else {
                        i12 = 0;
                    }
                    i11 |= i12;
                    qVar2.H(u7 - r22);
                }
                boolean z9 = this.f4949o;
                if (i8 == i9 || z9 || !this.j.get(i34, false)) {
                    qVar2.F(i30);
                    i31.b(i11, qVar2);
                    qVar2.F(i33);
                }
                if (i8 != i9 && !z9 && this.f4949o && j != -1) {
                    this.f4951q = r22;
                }
                qVar2.G(i30);
                return 0;
            }
        }
    }

    @Override // m1.o
    public final void release() {
    }
}
