package U0;

import A3.AbstractC0021t;
import A3.I;
import A3.K;
import A3.e0;
import D.RunnableC0053c;
import H0.C0137q;
import H0.H;
import H0.J;
import K0.x;
import M0.C;
import O0.P;
import O0.Q;
import O0.l0;
import android.net.Uri;
import android.util.SparseArray;
import com.google.firebase.firestore.Z;
import e1.C0947l;
import e1.InterfaceC0957w;
import e1.InterfaceC0958x;
import e1.b0;
import f5.C0993a;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class l implements InterfaceC0958x, V0.q {

    /* renamed from: X  reason: collision with root package name */
    public final Z f5603X;

    /* renamed from: Y  reason: collision with root package name */
    public final T0.d f5604Y;

    /* renamed from: Z  reason: collision with root package name */
    public final i1.e f5605Z;

    /* renamed from: a  reason: collision with root package name */
    public final c f5606a;

    /* renamed from: b  reason: collision with root package name */
    public final V0.c f5607b;

    /* renamed from: c  reason: collision with root package name */
    public final A.c f5608c;

    /* renamed from: d  reason: collision with root package name */
    public final C f5609d;

    /* renamed from: e  reason: collision with root package name */
    public final T0.g f5610e;

    /* renamed from: e0  reason: collision with root package name */
    public final IdentityHashMap f5611e0;
    public final T0.d f;

    /* renamed from: f0  reason: collision with root package name */
    public final A.m f5612f0;

    /* renamed from: g0  reason: collision with root package name */
    public final C0993a f5613g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f5614h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f5615i0;

    /* renamed from: j0  reason: collision with root package name */
    public final P0.k f5616j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C5.i f5617k0 = new C5.i(this, 22);

    /* renamed from: l0  reason: collision with root package name */
    public InterfaceC0957w f5618l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f5619m0;

    /* renamed from: n0  reason: collision with root package name */
    public b0 f5620n0;

    /* renamed from: o0  reason: collision with root package name */
    public r[] f5621o0;

    /* renamed from: p0  reason: collision with root package name */
    public r[] f5622p0;
    public int q0;

    /* renamed from: r0  reason: collision with root package name */
    public C0947l f5623r0;

    public l(c cVar, V0.c cVar2, A.c cVar3, C c8, T0.g gVar, T0.d dVar, Z z7, T0.d dVar2, i1.e eVar, C0993a c0993a, boolean z8, int i7, P0.k kVar) {
        this.f5606a = cVar;
        this.f5607b = cVar2;
        this.f5608c = cVar3;
        this.f5609d = c8;
        this.f5610e = gVar;
        this.f = dVar;
        this.f5603X = z7;
        this.f5604Y = dVar2;
        this.f5605Z = eVar;
        this.f5613g0 = c0993a;
        this.f5614h0 = z8;
        this.f5615i0 = i7;
        this.f5616j0 = kVar;
        c0993a.getClass();
        I i8 = K.f98b;
        e0 e0Var = e0.f138e;
        this.f5623r0 = new C0947l(e0Var, e0Var);
        this.f5611e0 = new IdentityHashMap();
        this.f5612f0 = new A.m(19);
        this.f5621o0 = new r[0];
        this.f5622p0 = new r[0];
    }

    public static H0.r g(H0.r rVar, H0.r rVar2, boolean z7) {
        H h8;
        int i7;
        String str;
        int i8;
        int i9;
        String str2;
        String str3;
        K k2;
        int i10;
        I i11 = K.f98b;
        K k8 = e0.f138e;
        int i12 = -1;
        if (rVar2 != null) {
            str3 = rVar2.j;
            h8 = rVar2.f1884k;
            i8 = rVar2.f1865A;
            i7 = rVar2.f1880e;
            i9 = rVar2.f;
            str = rVar2.f1879d;
            str2 = rVar2.f1877b;
            k2 = rVar2.f1878c;
        } else {
            String v6 = x.v(1, rVar.j);
            h8 = rVar.f1884k;
            if (z7) {
                i8 = rVar.f1865A;
                i7 = rVar.f1880e;
                i9 = rVar.f;
                str = rVar.f1879d;
                str2 = rVar.f1877b;
                k8 = rVar.f1878c;
            } else {
                i7 = 0;
                str = null;
                i8 = -1;
                i9 = 0;
                str2 = null;
            }
            K k9 = k8;
            str3 = v6;
            k2 = k9;
        }
        String c8 = H0.I.c(str3);
        if (z7) {
            i10 = rVar.f1881g;
        } else {
            i10 = -1;
        }
        if (z7) {
            i12 = rVar.f1882h;
        }
        C0137q c0137q = new C0137q();
        c0137q.f1841a = rVar.f1876a;
        c0137q.f1842b = str2;
        c0137q.f1843c = K.p(k2);
        c0137q.f1849k = H0.I.l(rVar.f1885l);
        c0137q.f1850l = H0.I.l(c8);
        c0137q.f1848i = str3;
        c0137q.j = h8;
        c0137q.f1846g = i10;
        c0137q.f1847h = i12;
        c0137q.f1864z = i8;
        c0137q.f1845e = i7;
        c0137q.f = i9;
        c0137q.f1844d = str;
        return new H0.r(c0137q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0053 A[SYNTHETIC] */
    @Override // V0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.net.Uri r17, B5.S r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            U0.r[] r2 = r0.f5621o0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La4
            r8 = r2[r6]
            U0.i r9 = r8.f5675d
            android.net.Uri[] r10 = r9.f5562e
            boolean r11 = K0.x.l(r10, r1)
            if (r11 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L9f
        L1d:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            h1.r r13 = r9.f5572q
            i1.h r13 = j3.f.h(r13)
            com.google.firebase.firestore.Z r8 = r8.f5671Z
            r8.getClass()
            r8 = r18
            T1.e r13 = com.google.firebase.firestore.Z.u(r13, r8)
            if (r13 == 0) goto L41
            int r14 = r13.f5318a
            r15 = 2
            if (r14 != r15) goto L41
            long r13 = r13.f5319b
            goto L42
        L3f:
            r8 = r18
        L41:
            r13 = r11
        L42:
            r15 = 0
        L43:
            int r5 = r10.length
            r4 = -1
            if (r15 >= r5) goto L53
            r5 = r10[r15]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L50
            goto L54
        L50:
            int r15 = r15 + 1
            goto L43
        L53:
            r15 = r4
        L54:
            if (r15 != r4) goto L59
        L56:
            r4 = 1
            r5 = 1
            goto L96
        L59:
            h1.r r5 = r9.f5572q
            int r5 = r5.u(r15)
            if (r5 != r4) goto L62
            goto L56
        L62:
            boolean r4 = r9.f5574s
            android.net.Uri r10 = r9.f5570o
            boolean r10 = r1.equals(r10)
            r4 = r4 | r10
            r9.f5574s = r4
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L94
            h1.r r4 = r9.f5572q
            boolean r4 = r4.m(r5, r13)
            if (r4 == 0) goto L91
            V0.c r4 = r9.f5563g
            java.util.HashMap r4 = r4.f5811d
            java.lang.Object r4 = r4.get(r1)
            V0.b r4 = (V0.b) r4
            if (r4 == 0) goto L8c
            boolean r4 = V0.b.a(r4, r13)
            r5 = 1
            r4 = r4 ^ r5
            goto L8e
        L8c:
            r5 = 1
            r4 = 0
        L8e:
            if (r4 == 0) goto L92
            goto L95
        L91:
            r5 = 1
        L92:
            r4 = 0
            goto L96
        L94:
            r5 = 1
        L95:
            r4 = r5
        L96:
            if (r4 == 0) goto L9e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9e
            r4 = r5
            goto L9f
        L9e:
            r4 = 0
        L9f:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La4:
            e1.w r1 = r0.f5618l0
            r1.B(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.l.a(android.net.Uri, B5.S, boolean):boolean");
    }

    @Override // V0.q
    public final void b() {
        r[] rVarArr;
        for (r rVar : this.f5621o0) {
            ArrayList arrayList = rVar.f5681i0;
            if (!arrayList.isEmpty()) {
                k kVar = (k) AbstractC0021t.l(arrayList);
                int b5 = rVar.f5675d.b(kVar);
                if (b5 == 1) {
                    kVar.f5582F0 = true;
                } else if (b5 == 0) {
                    rVar.f5685m0.post(new RunnableC0053c(17, rVar, kVar));
                } else if (b5 == 2 && !rVar.f5664O0) {
                    i1.n nVar = rVar.f5677e0;
                    if (nVar.d()) {
                        nVar.b();
                    }
                }
            }
        }
        this.f5618l0.B(this);
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        V0.i iVar;
        long j8;
        r[] rVarArr = this.f5622p0;
        int length = rVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            r rVar = rVarArr[i7];
            if (rVar.f5693v0 == 2) {
                i iVar2 = rVar.f5675d;
                int l8 = iVar2.f5572q.l();
                Uri[] uriArr = iVar2.f5562e;
                int length2 = uriArr.length;
                V0.c cVar = iVar2.f5563g;
                if (l8 < length2 && l8 != -1) {
                    iVar = cVar.a(true, uriArr[iVar2.f5572q.h()]);
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    K k2 = iVar.f5852r;
                    if (!k2.isEmpty() && iVar.f5876c) {
                        long j9 = iVar.f5843h - cVar.f5817i0;
                        long j10 = j - j9;
                        int c8 = x.c(k2, Long.valueOf(j10), true);
                        long j11 = ((V0.f) k2.get(c8)).f5832e;
                        if (c8 != k2.size() - 1) {
                            j8 = ((V0.f) k2.get(c8 + 1)).f5832e;
                        } else {
                            j8 = j11;
                        }
                        return l0Var.a(j10, j11, j8) + j9;
                    }
                }
            } else {
                i7++;
            }
        }
        return j;
    }

    @Override // e1.W
    public final boolean d() {
        return this.f5623r0.d();
    }

    public final r e(String str, int i7, Uri[] uriArr, H0.r[] rVarArr, H0.r rVar, List list, Map map, long j) {
        i iVar = new i(this.f5606a, this.f5607b, uriArr, rVarArr, this.f5608c, this.f5609d, this.f5612f0, list, this.f5616j0);
        T0.d dVar = this.f5604Y;
        return new r(str, i7, this.f5617k0, iVar, map, this.f5605Z, j, rVar, this.f5610e, this.f, this.f5603X, dVar, this.f5615i0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (r2[r7] != 1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // e1.InterfaceC0958x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(e1.InterfaceC0957w r27, long r28) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.l.f(e1.w, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    @Override // e1.InterfaceC0958x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i(h1.r[] r37, boolean[] r38, e1.U[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.l.i(h1.r[], boolean[], e1.U[], boolean[], long):long");
    }

    @Override // e1.W
    public final long k() {
        return this.f5623r0.k();
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        b0 b0Var = this.f5620n0;
        b0Var.getClass();
        return b0Var;
    }

    @Override // e1.W
    public final boolean n(Q q2) {
        r[] rVarArr;
        if (this.f5620n0 == null) {
            for (r rVar : this.f5621o0) {
                if (!rVar.f5696y0) {
                    P p7 = new P();
                    p7.f3607a = rVar.f5660K0;
                    rVar.n(new Q(p7));
                }
            }
            return false;
        }
        return this.f5623r0.n(q2);
    }

    @Override // e1.W
    public final long o() {
        return this.f5623r0.o();
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        r[] rVarArr;
        for (r rVar : this.f5621o0) {
            rVar.C();
            if (rVar.f5664O0 && !rVar.f5696y0) {
                throw J.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // e1.InterfaceC0958x
    public final long q(long j) {
        r[] rVarArr = this.f5622p0;
        if (rVarArr.length > 0) {
            boolean G2 = rVarArr[0].G(j, false);
            int i7 = 1;
            while (true) {
                r[] rVarArr2 = this.f5622p0;
                if (i7 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i7].G(j, G2);
                i7++;
            }
            if (G2) {
                ((SparseArray) this.f5612f0.f28b).clear();
            }
        }
        return j;
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        r[] rVarArr;
        for (r rVar : this.f5622p0) {
            if (rVar.f5695x0 && !rVar.A()) {
                int length = rVar.q0.length;
                for (int i7 = 0; i7 < length; i7++) {
                    rVar.q0[i7].i(j, rVar.f5658I0[i7]);
                }
            }
        }
    }

    @Override // e1.W
    public final void t(long j) {
        this.f5623r0.t(j);
    }
}
