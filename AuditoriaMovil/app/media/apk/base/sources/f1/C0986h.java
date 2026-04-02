package f1;

import H0.r;
import M0.x;
import O0.Q;
import R0.o;
import a6.t0;
import android.net.Uri;
import com.google.firebase.firestore.Z;
import e1.T;
import e1.U;
import e1.V;
import e1.W;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: f1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986h implements U, W, i1.i, i1.l {

    /* renamed from: X  reason: collision with root package name */
    public final T0.d f11013X;

    /* renamed from: Y  reason: collision with root package name */
    public final Z f11014Y;

    /* renamed from: Z  reason: collision with root package name */
    public final i1.n f11015Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f11016a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f11017b;

    /* renamed from: c  reason: collision with root package name */
    public final r[] f11018c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f11019d;

    /* renamed from: e  reason: collision with root package name */
    public final i f11020e;

    /* renamed from: e0  reason: collision with root package name */
    public final A.l f11021e0;
    public final Object f;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList f11022f0;

    /* renamed from: g0  reason: collision with root package name */
    public final List f11023g0;

    /* renamed from: h0  reason: collision with root package name */
    public final T f11024h0;

    /* renamed from: i0  reason: collision with root package name */
    public final T[] f11025i0;

    /* renamed from: j0  reason: collision with root package name */
    public final t0 f11026j0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC0983e f11027k0;

    /* renamed from: l0  reason: collision with root package name */
    public r f11028l0;

    /* renamed from: m0  reason: collision with root package name */
    public R0.c f11029m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f11030n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f11031o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f11032p0;
    public AbstractC0979a q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f11033r0;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, A.l] */
    public C0986h(int i7, int[] iArr, r[] rVarArr, i iVar, V v6, i1.e eVar, long j, T0.g gVar, T0.d dVar, Z z7, T0.d dVar2) {
        this.f11016a = i7;
        int i8 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f11017b = iArr;
        this.f11018c = rVarArr == null ? new r[0] : rVarArr;
        this.f11020e = iVar;
        this.f = v6;
        this.f11013X = dVar2;
        this.f11014Y = z7;
        this.f11015Z = new i1.n("ChunkSampleStream");
        this.f11021e0 = new Object();
        ArrayList arrayList = new ArrayList();
        this.f11022f0 = arrayList;
        this.f11023g0 = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f11025i0 = new T[length];
        this.f11019d = new boolean[length];
        int i9 = length + 1;
        int[] iArr2 = new int[i9];
        T[] tArr = new T[i9];
        gVar.getClass();
        T t7 = new T(eVar, gVar, dVar);
        this.f11024h0 = t7;
        iArr2[0] = i7;
        tArr[0] = t7;
        while (i8 < length) {
            T t8 = new T(eVar, null, null);
            this.f11025i0[i8] = t8;
            int i10 = i8 + 1;
            tArr[i10] = t8;
            iArr2[i10] = this.f11017b[i8];
            i8 = i10;
        }
        this.f11026j0 = new t0(13, iArr2, tArr);
        this.f11030n0 = j;
        this.f11031o0 = j;
    }

    public final void A(R0.c cVar) {
        T[] tArr;
        this.f11029m0 = cVar;
        T t7 = this.f11024h0;
        t7.j();
        A.m mVar = t7.f10736h;
        if (mVar != null) {
            mVar.k0(t7.f10734e);
            t7.f10736h = null;
            t7.f10735g = null;
        }
        for (T t8 : this.f11025i0) {
            t8.j();
            A.m mVar2 = t8.f10736h;
            if (mVar2 != null) {
                mVar2.k0(t8.f10734e);
                t8.f10736h = null;
                t8.f10735g = null;
            }
        }
        this.f11015Z.e(this);
    }

    public final void B(long j) {
        ArrayList arrayList;
        AbstractC0979a abstractC0979a;
        boolean z7;
        boolean G2;
        this.f11031o0 = j;
        if (w()) {
            this.f11030n0 = j;
            return;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            arrayList = this.f11022f0;
            if (i8 >= arrayList.size()) {
                break;
            }
            abstractC0979a = (AbstractC0979a) arrayList.get(i8);
            int i9 = (abstractC0979a.f11000X > j ? 1 : (abstractC0979a.f11000X == j ? 0 : -1));
            if (i9 == 0 && abstractC0979a.f10978f0 == -9223372036854775807L) {
                break;
            } else if (i9 > 0) {
                break;
            } else {
                i8++;
            }
        }
        abstractC0979a = null;
        T t7 = this.f11024h0;
        if (abstractC0979a != null) {
            G2 = t7.F(abstractC0979a.d(0));
        } else {
            if (j < k()) {
                z7 = true;
            } else {
                z7 = false;
            }
            G2 = t7.G(j, z7);
        }
        T[] tArr = this.f11025i0;
        if (G2) {
            this.f11032p0 = z(t7.r(), 0);
            int length = tArr.length;
            while (i7 < length) {
                tArr[i7].G(j, true);
                i7++;
            }
            return;
        }
        this.f11030n0 = j;
        this.f11033r0 = false;
        arrayList.clear();
        this.f11032p0 = 0;
        i1.n nVar = this.f11015Z;
        if (nVar.d()) {
            t7.j();
            int length2 = tArr.length;
            while (i7 < length2) {
                tArr[i7].j();
                i7++;
            }
            nVar.b();
            return;
        }
        nVar.f11431c = null;
        t7.D(false);
        for (T t8 : tArr) {
            t8.D(false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, e1.V] */
    @Override // i1.i
    public final void E(i1.k kVar, long j, long j8, boolean z7) {
        AbstractC0983e abstractC0983e = (AbstractC0983e) kVar;
        this.f11027k0 = null;
        this.q0 = null;
        long j9 = abstractC0983e.f11003a;
        Uri uri = abstractC0983e.f11002Z.f3133c;
        e1.r rVar = new e1.r(j8);
        this.f11014Y.getClass();
        this.f11013X.c(rVar, abstractC0983e.f11005c, this.f11016a, abstractC0983e.f11006d, abstractC0983e.f11007e, abstractC0983e.f, abstractC0983e.f11000X, abstractC0983e.f11001Y);
        if (!z7) {
            if (w()) {
                this.f11024h0.D(false);
                for (T t7 : this.f11025i0) {
                    t7.D(false);
                }
            } else if (abstractC0983e instanceof AbstractC0979a) {
                ArrayList arrayList = this.f11022f0;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.f11030n0 = this.f11031o0;
                }
            }
            this.f.B(this);
        }
    }

    @Override // e1.U
    public final void a() {
        i1.n nVar = this.f11015Z;
        nVar.a();
        this.f11024h0.y();
        if (!nVar.d()) {
            this.f11020e.a();
        }
    }

    @Override // e1.U
    public final boolean b() {
        if (!w() && this.f11024h0.w(this.f11033r0)) {
            return true;
        }
        return false;
    }

    @Override // e1.W
    public final boolean d() {
        return this.f11015Z.d();
    }

    @Override // i1.l
    public final void e() {
        this.f11024h0.C();
        for (T t7 : this.f11025i0) {
            t7.C();
        }
        this.f11020e.release();
        R0.c cVar = this.f11029m0;
        if (cVar != null) {
            synchronized (cVar) {
                o oVar = (o) cVar.f4541i0.remove(this);
                if (oVar != null) {
                    oVar.f4624a.C();
                }
            }
        }
    }

    @Override // e1.U
    public final int g(x xVar, N0.f fVar, int i7) {
        if (w()) {
            return -3;
        }
        AbstractC0979a abstractC0979a = this.q0;
        T t7 = this.f11024h0;
        if (abstractC0979a != null && abstractC0979a.d(0) <= t7.r()) {
            return -3;
        }
        x();
        return t7.B(xVar, fVar, i7, this.f11033r0);
    }

    @Override // e1.U
    public final int h(long j) {
        if (w()) {
            return 0;
        }
        T t7 = this.f11024h0;
        int t8 = t7.t(j, this.f11033r0);
        AbstractC0979a abstractC0979a = this.q0;
        if (abstractC0979a != null) {
            t8 = Math.min(t8, abstractC0979a.d(0) - t7.r());
        }
        t7.H(t8);
        x();
        return t8;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, e1.V] */
    @Override // i1.i
    public final void j(i1.k kVar, long j, long j8) {
        AbstractC0983e abstractC0983e = (AbstractC0983e) kVar;
        this.f11027k0 = null;
        this.f11020e.b(abstractC0983e);
        long j9 = abstractC0983e.f11003a;
        Uri uri = abstractC0983e.f11002Z.f3133c;
        e1.r rVar = new e1.r(j8);
        this.f11014Y.getClass();
        this.f11013X.f(rVar, abstractC0983e.f11005c, this.f11016a, abstractC0983e.f11006d, abstractC0983e.f11007e, abstractC0983e.f, abstractC0983e.f11000X, abstractC0983e.f11001Y);
        this.f.B(this);
    }

    @Override // e1.W
    public final long k() {
        if (w()) {
            return this.f11030n0;
        }
        if (this.f11033r0) {
            return Long.MIN_VALUE;
        }
        return u().f11001Y;
    }

    @Override // e1.W
    public final boolean n(Q q2) {
        long j;
        List list;
        if (!this.f11033r0) {
            i1.n nVar = this.f11015Z;
            if (!nVar.d() && !nVar.c()) {
                boolean w2 = w();
                if (w2) {
                    list = Collections.emptyList();
                    j = this.f11030n0;
                } else {
                    j = u().f11001Y;
                    list = this.f11023g0;
                }
                this.f11020e.f(q2, j, list, this.f11021e0);
                A.l lVar = this.f11021e0;
                boolean z7 = lVar.f25a;
                AbstractC0983e abstractC0983e = (AbstractC0983e) lVar.f26b;
                lVar.f26b = null;
                lVar.f25a = false;
                if (z7) {
                    this.f11030n0 = -9223372036854775807L;
                    this.f11033r0 = true;
                    return true;
                } else if (abstractC0983e == null) {
                    return false;
                } else {
                    this.f11027k0 = abstractC0983e;
                    boolean z8 = abstractC0983e instanceof AbstractC0979a;
                    t0 t0Var = this.f11026j0;
                    if (z8) {
                        AbstractC0979a abstractC0979a = (AbstractC0979a) abstractC0983e;
                        if (w2) {
                            long j8 = this.f11030n0;
                            if (abstractC0979a.f11000X != j8) {
                                this.f11024h0.f10747t = j8;
                                for (T t7 : this.f11025i0) {
                                    t7.f10747t = this.f11030n0;
                                }
                            }
                            this.f11030n0 = -9223372036854775807L;
                        }
                        abstractC0979a.f10980h0 = t0Var;
                        T[] tArr = (T[]) t0Var.f7210c;
                        int[] iArr = new int[tArr.length];
                        for (int i7 = 0; i7 < tArr.length; i7++) {
                            T t8 = tArr[i7];
                            iArr[i7] = t8.f10744q + t8.f10743p;
                        }
                        abstractC0979a.f10981i0 = iArr;
                        this.f11022f0.add(abstractC0979a);
                    } else if (abstractC0983e instanceof k) {
                        ((k) abstractC0983e).f11041f0 = t0Var;
                    }
                    this.f11013X.k(new e1.r(abstractC0983e.f11003a, abstractC0983e.f11004b, nVar.f(abstractC0983e, this, this.f11014Y.w(abstractC0983e.f11005c))), abstractC0983e.f11005c, this.f11016a, abstractC0983e.f11006d, abstractC0983e.f11007e, abstractC0983e.f, abstractC0983e.f11000X, abstractC0983e.f11001Y);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e1.W
    public final long o() {
        if (this.f11033r0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.f11030n0;
        }
        long j = this.f11031o0;
        AbstractC0979a u7 = u();
        if (!u7.c()) {
            ArrayList arrayList = this.f11022f0;
            if (arrayList.size() > 1) {
                u7 = (AbstractC0979a) arrayList.get(arrayList.size() - 2);
            } else {
                u7 = null;
            }
        }
        if (u7 != null) {
            j = Math.max(j, u7.f11001Y);
        }
        return Math.max(j, this.f11024h0.o());
    }

    public final void r(long j) {
        long j8;
        if (w()) {
            return;
        }
        T t7 = this.f11024h0;
        int i7 = t7.f10744q;
        t7.i(j, true);
        T t8 = this.f11024h0;
        int i8 = t8.f10744q;
        if (i8 > i7) {
            synchronized (t8) {
                if (t8.f10743p == 0) {
                    j8 = Long.MIN_VALUE;
                } else {
                    j8 = t8.f10741n[t8.f10745r];
                }
            }
            int i9 = 0;
            while (true) {
                T[] tArr = this.f11025i0;
                if (i9 >= tArr.length) {
                    break;
                }
                tArr[i9].i(j8, this.f11019d[i9]);
                i9++;
            }
        }
        int min = Math.min(z(i8, 0), this.f11032p0);
        if (min > 0) {
            K0.x.R(this.f11022f0, 0, min);
            this.f11032p0 -= min;
        }
    }

    public final AbstractC0979a s(int i7) {
        ArrayList arrayList = this.f11022f0;
        AbstractC0979a abstractC0979a = (AbstractC0979a) arrayList.get(i7);
        K0.x.R(arrayList, i7, arrayList.size());
        this.f11032p0 = Math.max(this.f11032p0, arrayList.size());
        int i8 = 0;
        this.f11024h0.l(abstractC0979a.d(0));
        while (true) {
            T[] tArr = this.f11025i0;
            if (i8 < tArr.length) {
                T t7 = tArr[i8];
                i8++;
                t7.l(abstractC0979a.d(i8));
            } else {
                return abstractC0979a;
            }
        }
    }

    @Override // e1.W
    public final void t(long j) {
        i1.n nVar = this.f11015Z;
        if (!nVar.c() && !w()) {
            boolean d7 = nVar.d();
            i iVar = this.f11020e;
            ArrayList arrayList = this.f11022f0;
            List list = this.f11023g0;
            if (d7) {
                AbstractC0983e abstractC0983e = this.f11027k0;
                abstractC0983e.getClass();
                boolean z7 = abstractC0983e instanceof AbstractC0979a;
                if ((!z7 || !v(arrayList.size() - 1)) && iVar.e(j, abstractC0983e, list)) {
                    nVar.b();
                    if (z7) {
                        this.q0 = (AbstractC0979a) abstractC0983e;
                        return;
                    }
                    return;
                }
                return;
            }
            int g3 = iVar.g(list, j);
            if (g3 < arrayList.size()) {
                K0.a.j(!nVar.d());
                int size = arrayList.size();
                while (true) {
                    if (g3 < size) {
                        if (!v(g3)) {
                            break;
                        }
                        g3++;
                    } else {
                        g3 = -1;
                        break;
                    }
                }
                if (g3 != -1) {
                    long j8 = u().f11001Y;
                    AbstractC0979a s7 = s(g3);
                    if (arrayList.isEmpty()) {
                        this.f11030n0 = this.f11031o0;
                    }
                    this.f11033r0 = false;
                    this.f11013X.m(new b1.g(1, this.f11016a, null, 3, null, K0.x.Z(s7.f11000X), K0.x.Z(j8)));
                }
            }
        }
    }

    public final AbstractC0979a u() {
        ArrayList arrayList = this.f11022f0;
        return (AbstractC0979a) arrayList.get(arrayList.size() - 1);
    }

    public final boolean v(int i7) {
        int r7;
        AbstractC0979a abstractC0979a = (AbstractC0979a) this.f11022f0.get(i7);
        if (this.f11024h0.r() > abstractC0979a.d(0)) {
            return true;
        }
        int i8 = 0;
        do {
            T[] tArr = this.f11025i0;
            if (i8 >= tArr.length) {
                return false;
            }
            r7 = tArr[i8].r();
            i8++;
        } while (r7 <= abstractC0979a.d(i8));
        return true;
    }

    public final boolean w() {
        if (this.f11030n0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void x() {
        int z7 = z(this.f11024h0.r(), this.f11032p0 - 1);
        while (true) {
            int i7 = this.f11032p0;
            if (i7 <= z7) {
                this.f11032p0 = i7 + 1;
                AbstractC0979a abstractC0979a = (AbstractC0979a) this.f11022f0.get(i7);
                r rVar = abstractC0979a.f11006d;
                if (!rVar.equals(this.f11028l0)) {
                    this.f11013X.a(this.f11016a, rVar, abstractC0979a.f11007e, abstractC0979a.f, abstractC0979a.f11000X);
                }
                this.f11028l0 = rVar;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, e1.V] */
    @Override // i1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T1.e y(i1.k r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            f1.e r1 = (f1.AbstractC0983e) r1
            M0.B r2 = r1.f11002Z
            long r2 = r2.f3132b
            boolean r4 = r1 instanceof f1.AbstractC0979a
            java.util.ArrayList r5 = r0.f11022f0
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L26
            if (r4 == 0) goto L26
            boolean r2 = r0.v(r6)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = r3
            goto L27
        L26:
            r2 = r7
        L27:
            e1.r r9 = new e1.r
            M0.B r8 = r1.f11002Z
            android.net.Uri r8 = r8.f3133c
            r10 = r26
            r9.<init>(r10)
            long r10 = r1.f11000X
            K0.x.Z(r10)
            long r10 = r1.f11001Y
            K0.x.Z(r10)
            B5.S r8 = new B5.S
            r10 = 9
            r15 = r28
            r11 = r29
            r8.<init>(r15, r11, r10)
            f1.i r10 = r0.f11020e
            com.google.firebase.firestore.Z r14 = r0.f11014Y
            boolean r10 = r10.d(r1, r2, r8, r14)
            if (r10 == 0) goto L74
            if (r2 == 0) goto L6d
            if (r4 == 0) goto L6a
            f1.a r2 = r0.s(r6)
            if (r2 != r1) goto L5c
            goto L5d
        L5c:
            r7 = r3
        L5d:
            K0.a.j(r7)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L6a
            long r4 = r0.f11031o0
            r0.f11030n0 = r4
        L6a:
            T1.e r2 = i1.n.f11428e
            goto L75
        L6d:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            K0.a.A(r2, r4)
        L74:
            r2 = 0
        L75:
            if (r2 != 0) goto L90
            r14.getClass()
            long r4 = com.google.firebase.firestore.Z.y(r8)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L8e
            T1.e r2 = new T1.e
            r6 = 0
            r2.<init>(r3, r4, r6)
            goto L90
        L8e:
            T1.e r2 = i1.n.f
        L90:
            boolean r3 = r2.a()
            r20 = r3 ^ 1
            T0.d r8 = r0.f11013X
            long r4 = r1.f11000X
            long r6 = r1.f11001Y
            int r10 = r1.f11005c
            int r11 = r0.f11016a
            H0.r r12 = r1.f11006d
            int r13 = r1.f11007e
            java.lang.Object r1 = r1.f
            r24 = r2
            r2 = 0
            r21 = r14
            r14 = r1
            r15 = r4
            r17 = r6
            r19 = r28
            r8.h(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            if (r3 != 0) goto Lc0
            r0.f11027k0 = r2
            r21.getClass()
            java.lang.Object r1 = r0.f
            r1.B(r0)
        Lc0:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0986h.y(i1.k, long, long, java.io.IOException, int):T1.e");
    }

    public final int z(int i7, int i8) {
        ArrayList arrayList;
        do {
            i8++;
            arrayList = this.f11022f0;
            if (i8 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC0979a) arrayList.get(i8)).d(0) <= i7);
        return i8 - 1;
    }
}
