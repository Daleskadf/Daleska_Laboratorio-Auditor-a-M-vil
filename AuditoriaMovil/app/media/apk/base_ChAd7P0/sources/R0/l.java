package R0;

import A3.K;
import B5.S;
import H0.I;
import K0.x;
import M0.w;
import O0.Q;
import android.os.SystemClock;
import com.google.firebase.firestore.Z;
import e1.C0937b;
import f1.AbstractC0983e;
import f1.C0982d;
import f5.C0993a;
import h1.r;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import m1.InterfaceC1426A;
/* loaded from: classes.dex */
public final class l implements f1.i {

    /* renamed from: a  reason: collision with root package name */
    public final i1.o f4603a;

    /* renamed from: b  reason: collision with root package name */
    public final E.e f4604b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f4605c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4606d;

    /* renamed from: e  reason: collision with root package name */
    public final M0.h f4607e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4608g;

    /* renamed from: h  reason: collision with root package name */
    public final o f4609h;

    /* renamed from: i  reason: collision with root package name */
    public final j[] f4610i;
    public r j;

    /* renamed from: k  reason: collision with root package name */
    public S0.c f4611k;

    /* renamed from: l  reason: collision with root package name */
    public int f4612l;

    /* renamed from: m  reason: collision with root package name */
    public C0937b f4613m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4614n;

    public l(A.l lVar, i1.o oVar, S0.c cVar, E.e eVar, int i7, int[] iArr, r rVar, int i8, M0.h hVar, long j, int i9, boolean z7, ArrayList arrayList, o oVar2) {
        J1.m nVar;
        String str;
        H0.r rVar2;
        j[] jVarArr;
        S0.m mVar;
        C0982d c0982d;
        this.f4603a = oVar;
        this.f4611k = cVar;
        this.f4604b = eVar;
        this.f4605c = iArr;
        this.j = rVar;
        this.f4606d = i8;
        this.f4607e = hVar;
        this.f4612l = i7;
        this.f = j;
        this.f4608g = i9;
        this.f4609h = oVar2;
        long d7 = cVar.d(i7);
        ArrayList h8 = h();
        this.f4610i = new j[rVar.length()];
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f4610i.length) {
            S0.m mVar2 = (S0.m) h8.get(rVar.f(i11));
            S0.b e02 = eVar.e0(mVar2.f4893b);
            j[] jVarArr2 = this.f4610i;
            S0.b bVar = e02 == null ? (S0.b) mVar2.f4893b.get(i10) : e02;
            H0.r rVar3 = mVar2.f4892a;
            lVar.getClass();
            String str2 = rVar3.f1885l;
            if (I.j(str2)) {
                if (lVar.f25a) {
                    nVar = new J1.h(((C0993a) lVar.f26b).j(rVar3), rVar3);
                } else {
                    c0982d = null;
                    jVarArr = jVarArr2;
                    mVar = mVar2;
                    int i12 = i11;
                    jVarArr[i12] = new j(d7, mVar, bVar, c0982d, 0L, mVar.d());
                    i11 = i12 + 1;
                    i10 = 0;
                }
            } else {
                if (str2 == null || (!str2.startsWith("video/webm") && !str2.startsWith("audio/webm") && !str2.startsWith("application/webm") && !str2.startsWith("video/x-matroska") && !str2.startsWith("audio/x-matroska") && !str2.startsWith("application/x-matroska"))) {
                    if (Objects.equals(str2, "image/jpeg")) {
                        nVar = new I1.a(1);
                    } else if (Objects.equals(str2, "image/png")) {
                        nVar = new I1.a(0, (byte) 0);
                    } else {
                        int i13 = z7 ? 4 : 0;
                        str = str2;
                        rVar2 = rVar3;
                        jVarArr = jVarArr2;
                        mVar = mVar2;
                        nVar = new G1.n((C0993a) lVar.f26b, lVar.f25a ? i13 : i13 | 32, null, null, arrayList, oVar2);
                    }
                } else {
                    str = str2;
                    rVar2 = rVar3;
                    jVarArr = jVarArr2;
                    mVar = mVar2;
                    nVar = new E1.d((C0993a) lVar.f26b, lVar.f25a ? 1 : 3);
                }
                if (lVar.f25a && !I.j(str) && !(nVar.c() instanceof G1.n) && !(nVar.c() instanceof E1.d)) {
                    nVar = new J1.m(nVar, (C0993a) lVar.f26b);
                }
                c0982d = new C0982d(nVar, i8, rVar2);
                int i122 = i11;
                jVarArr[i122] = new j(d7, mVar, bVar, c0982d, 0L, mVar.d());
                i11 = i122 + 1;
                i10 = 0;
            }
            str = str2;
            rVar2 = rVar3;
            jVarArr = jVarArr2;
            mVar = mVar2;
            if (lVar.f25a) {
                nVar = new J1.m(nVar, (C0993a) lVar.f26b);
            }
            c0982d = new C0982d(nVar, i8, rVar2);
            int i1222 = i11;
            jVarArr[i1222] = new j(d7, mVar, bVar, c0982d, 0L, mVar.d());
            i11 = i1222 + 1;
            i10 = 0;
        }
    }

    @Override // f1.i
    public final void a() {
        C0937b c0937b = this.f4613m;
        if (c0937b == null) {
            this.f4603a.a();
            return;
        }
        throw c0937b;
    }

    @Override // f1.i
    public final void b(AbstractC0983e abstractC0983e) {
        m1.j jVar;
        if (abstractC0983e instanceof f1.k) {
            int r7 = this.j.r(((f1.k) abstractC0983e).f11006d);
            j[] jVarArr = this.f4610i;
            j jVar2 = jVarArr[r7];
            if (jVar2.f4599d == null) {
                C0982d c0982d = jVar2.f4596a;
                K0.a.k(c0982d);
                InterfaceC1426A interfaceC1426A = c0982d.f10993Y;
                if (interfaceC1426A instanceof m1.j) {
                    jVar = (m1.j) interfaceC1426A;
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    S0.m mVar = jVar2.f4597b;
                    J2.e eVar = new J2.e(jVar, mVar.f4894c, 2);
                    jVarArr[r7] = new j(jVar2.f4600e, mVar, jVar2.f4598c, jVar2.f4596a, jVar2.f, eVar);
                }
            }
        }
        o oVar = this.f4609h;
        if (oVar != null) {
            long j = oVar.f4627d;
            if (j == -9223372036854775807L || abstractC0983e.f11001Y > j) {
                oVar.f4627d = abstractC0983e.f11001Y;
            }
            oVar.f4628e.f4629X = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r3 < (((r0.R() + r10) + r8) - 1)) goto L14;
     */
    @Override // f1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(long r19, O0.l0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            R0.j[] r0 = r7.f4610i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L5f
            r5 = r0[r4]
            R0.i r6 = r5.f4599d
            if (r6 == 0) goto L5c
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto L5c
        L1b:
            R0.i r0 = r5.f4599d
            K0.a.k(r0)
            long r3 = r5.f4600e
            long r3 = r0.c(r1, r3)
            long r10 = r5.f
            long r3 = r3 + r10
            long r12 = r5.f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L51
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4a
            K0.a.k(r0)
            long r16 = r0.R()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L51
        L4a:
            long r3 = r3 + r14
            long r3 = r5.f(r3)
            r5 = r3
            goto L52
        L51:
            r5 = r12
        L52:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5c:
            int r4 = r4 + 1
            goto L8
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.l.c(long, O0.l0):long");
    }

    @Override // f1.i
    public final boolean d(AbstractC0983e abstractC0983e, boolean z7, S s7, Z z8) {
        long j;
        boolean z9;
        if (!z7) {
            return false;
        }
        o oVar = this.f4609h;
        if (oVar != null) {
            long j8 = oVar.f4627d;
            if (j8 != -9223372036854775807L && j8 < abstractC0983e.f11000X) {
                z9 = true;
            } else {
                z9 = false;
            }
            p pVar = oVar.f4628e;
            if (pVar.f.f4850d) {
                if (!pVar.f4630Y) {
                    if (z9) {
                        if (pVar.f4629X) {
                            pVar.f4630Y = true;
                            pVar.f4629X = false;
                            h hVar = (h) pVar.f4633b.f218b;
                            hVar.f4594y0.removeCallbacks(hVar.f4587r0);
                            hVar.A();
                        }
                    }
                }
                return true;
            }
        }
        boolean z10 = this.f4611k.f4850d;
        j[] jVarArr = this.f4610i;
        if (!z10 && (abstractC0983e instanceof f1.l)) {
            IOException iOException = (IOException) s7.f336c;
            if ((iOException instanceof w) && ((w) iOException).f3207d == 404) {
                j jVar = jVarArr[this.j.r(abstractC0983e.f11006d)];
                long d7 = jVar.d();
                if (d7 != -1 && d7 != 0) {
                    i iVar = jVar.f4599d;
                    K0.a.k(iVar);
                    if (((f1.l) abstractC0983e).a() > ((iVar.R() + jVar.f) + d7) - 1) {
                        this.f4614n = true;
                        return true;
                    }
                }
            }
        }
        j jVar2 = jVarArr[this.j.r(abstractC0983e.f11006d)];
        K k2 = jVar2.f4597b.f4893b;
        E.e eVar = this.f4604b;
        S0.b e02 = eVar.e0(k2);
        S0.b bVar = jVar2.f4598c;
        if (e02 != null && !bVar.equals(e02)) {
            return true;
        }
        r rVar = this.j;
        K k8 = jVar2.f4597b.f4893b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (rVar.c(i8, elapsedRealtime)) {
                i7++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < k8.size(); i9++) {
            hashSet.add(Integer.valueOf(((S0.b) k8.get(i9)).f4845c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList r7 = eVar.r(k8);
        for (int i10 = 0; i10 < r7.size(); i10++) {
            hashSet2.add(Integer.valueOf(((S0.b) r7.get(i10)).f4845c));
        }
        i1.h hVar2 = new i1.h(size, size - hashSet2.size(), length, i7);
        if (!hVar2.a(2) && !hVar2.a(1)) {
            return false;
        }
        z8.getClass();
        T1.e u7 = Z.u(hVar2, s7);
        if (u7 != null) {
            int i11 = u7.f5318a;
            if (hVar2.a(i11)) {
                long j9 = u7.f5319b;
                if (i11 == 2) {
                    r rVar2 = this.j;
                    return rVar2.m(rVar2.r(abstractC0983e.f11006d), j9);
                } else if (i11 != 1) {
                    return false;
                } else {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j9;
                    String str = bVar.f4844b;
                    HashMap hashMap = (HashMap) eVar.f920b;
                    if (hashMap.containsKey(str)) {
                        int i12 = x.f2529a;
                        j = Math.max(elapsedRealtime2, ((Long) hashMap.get(str)).longValue());
                    } else {
                        j = elapsedRealtime2;
                    }
                    hashMap.put(str, Long.valueOf(j));
                    int i13 = bVar.f4845c;
                    if (i13 == Integer.MIN_VALUE) {
                        return true;
                    }
                    Integer valueOf = Integer.valueOf(i13);
                    HashMap hashMap2 = (HashMap) eVar.f921c;
                    if (hashMap2.containsKey(valueOf)) {
                        int i14 = x.f2529a;
                        elapsedRealtime2 = Math.max(elapsedRealtime2, ((Long) hashMap2.get(valueOf)).longValue());
                    }
                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f1.i
    public final boolean e(long j, AbstractC0983e abstractC0983e, List list) {
        if (this.f4613m != null) {
            return false;
        }
        return this.j.a(j, abstractC0983e, list);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.IOException, e1.b] */
    @Override // f1.i
    public final void f(Q q2, long j, List list, A.l lVar) {
        long j8;
        long M7;
        f1.l lVar2;
        j[] jVarArr;
        f1.m[] mVarArr;
        long j9;
        boolean z7;
        boolean z8;
        S0.m mVar;
        long j10;
        long k2;
        long j11;
        H0.r rVar;
        long j12;
        long j13;
        int i7;
        Object jVar;
        int i8;
        boolean z9;
        S0.j jVar2;
        long M8;
        long j14;
        long k8;
        boolean z10;
        if (this.f4613m != null) {
            return;
        }
        long j15 = q2.f3610a;
        long j16 = j - j15;
        long M9 = x.M(this.f4611k.b(this.f4612l).f4879b) + x.M(this.f4611k.f4847a) + j;
        o oVar = this.f4609h;
        if (oVar != null) {
            p pVar = oVar.f4628e;
            S0.c cVar = pVar.f;
            if (!cVar.f4850d) {
                j8 = j16;
                z10 = false;
            } else if (pVar.f4630Y) {
                j8 = j16;
                z10 = true;
            } else {
                Map.Entry ceilingEntry = pVar.f4636e.ceilingEntry(Long.valueOf(cVar.f4853h));
                A4.c cVar2 = pVar.f4633b;
                if (ceilingEntry != null && ((Long) ceilingEntry.getValue()).longValue() < M9) {
                    long longValue = ((Long) ceilingEntry.getKey()).longValue();
                    h hVar = (h) cVar2.f218b;
                    j8 = j16;
                    long j17 = hVar.f4570I0;
                    if (j17 == -9223372036854775807L || j17 < longValue) {
                        hVar.f4570I0 = longValue;
                    }
                    z10 = true;
                } else {
                    j8 = j16;
                    z10 = false;
                }
                if (z10 && pVar.f4629X) {
                    pVar.f4630Y = true;
                    pVar.f4629X = false;
                    h hVar2 = (h) cVar2.f218b;
                    hVar2.f4594y0.removeCallbacks(hVar2.f4587r0);
                    hVar2.A();
                }
            }
            if (z10) {
                return;
            }
        } else {
            j8 = j16;
        }
        long M10 = x.M(x.z(this.f));
        S0.c cVar3 = this.f4611k;
        long j18 = cVar3.f4847a;
        if (j18 == -9223372036854775807L) {
            M7 = -9223372036854775807L;
        } else {
            M7 = M10 - x.M(j18 + cVar3.b(this.f4612l).f4879b);
        }
        S0.j jVar3 = null;
        if (list.isEmpty()) {
            lVar2 = null;
        } else {
            lVar2 = (f1.l) list.get(list.size() - 1);
        }
        int length = this.j.length();
        f1.m[] mVarArr2 = new f1.m[length];
        int i9 = 0;
        while (true) {
            jVarArr = this.f4610i;
            if (i9 >= length) {
                break;
            }
            j jVar4 = jVarArr[i9];
            i iVar = jVar4.f4599d;
            t2.i iVar2 = f1.m.f11045V;
            if (iVar == null) {
                mVarArr2[i9] = iVar2;
                j14 = M7;
            } else {
                long b5 = jVar4.b(M10);
                long c8 = jVar4.c(M10);
                if (lVar2 != null) {
                    j14 = M7;
                    k8 = lVar2.a();
                } else {
                    i iVar3 = jVar4.f4599d;
                    K0.a.k(iVar3);
                    j14 = M7;
                    k8 = x.k(iVar3.c(j, jVar4.f4600e) + jVar4.f, b5, c8);
                }
                if (k8 < b5) {
                    mVarArr2[i9] = iVar2;
                } else {
                    mVarArr2[i9] = new k(i(i9), k8, c8);
                }
            }
            i9++;
            M7 = j14;
        }
        long j19 = M7;
        long j20 = 0;
        if (!this.f4611k.f4850d || jVarArr[0].d() == 0) {
            mVarArr = mVarArr2;
            j9 = -9223372036854775807L;
        } else {
            long e7 = jVarArr[0].e(jVarArr[0].c(M10));
            S0.c cVar4 = this.f4611k;
            long j21 = cVar4.f4847a;
            if (j21 == -9223372036854775807L) {
                mVarArr = mVarArr2;
                M8 = -9223372036854775807L;
            } else {
                mVarArr = mVarArr2;
                M8 = M10 - x.M(j21 + cVar4.b(this.f4612l).f4879b);
            }
            j20 = 0;
            j9 = Math.max(0L, Math.min(M8, e7) - j15);
        }
        long j22 = j8;
        long j23 = j20;
        this.j.q(j15, j22, j9, list, mVarArr);
        int l8 = this.j.l();
        SystemClock.elapsedRealtime();
        j i10 = i(l8);
        i iVar4 = i10.f4599d;
        S0.b bVar = i10.f4598c;
        C0982d c0982d = i10.f4596a;
        S0.m mVar2 = i10.f4597b;
        if (c0982d != null) {
            if (c0982d.f10994Z == null) {
                jVar2 = mVar2.f4896e;
            } else {
                jVar2 = null;
            }
            if (iVar4 == null) {
                jVar3 = mVar2.e();
            }
            S0.j jVar5 = jVar3;
            if (jVar2 != null || jVar5 != null) {
                H0.r j24 = this.j.j();
                int k9 = this.j.k();
                Object o7 = this.j.o();
                if (jVar2 != null) {
                    S0.j a7 = jVar2.a(jVar5, bVar.f4843a);
                    if (a7 != null) {
                        jVar2 = a7;
                    }
                } else {
                    jVar5.getClass();
                    jVar2 = jVar5;
                }
                lVar.f26b = new f1.k(this.f4607e, G.i.b(mVar2, bVar.f4843a, jVar2, 0), j24, k9, o7, i10.f4596a);
                return;
            }
        }
        S0.c cVar5 = this.f4611k;
        if (cVar5.f4850d && this.f4612l == cVar5.f4857m.size() - 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        long j25 = i10.f4600e;
        if (z7 && j25 == -9223372036854775807L) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (i10.d() == j23) {
            lVar.f25a = z8;
            return;
        }
        long b7 = i10.b(M10);
        long c9 = i10.c(M10);
        if (z7) {
            long e8 = i10.e(c9);
            if ((e8 - i10.f(c9)) + e8 >= j25) {
                z9 = true;
            } else {
                z9 = false;
            }
            z8 &= z9;
        }
        long j26 = i10.f;
        if (lVar2 != null) {
            mVar = mVar2;
            k2 = lVar2.a();
            j10 = j25;
        } else {
            K0.a.k(iVar4);
            mVar = mVar2;
            j10 = j25;
            k2 = x.k(iVar4.c(j, j10) + j26, b7, c9);
        }
        if (k2 < b7) {
            this.f4613m = new IOException();
            return;
        }
        int i11 = (k2 > c9 ? 1 : (k2 == c9 ? 0 : -1));
        if (i11 <= 0) {
            S0.m mVar3 = mVar;
            if (!this.f4614n || i11 < 0) {
                if (z8 && i10.f(k2) >= j10) {
                    lVar.f25a = true;
                    return;
                }
                int min = (int) Math.min(this.f4608g, (c9 - k2) + 1);
                int i12 = (j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1));
                if (i12 != 0) {
                    while (min > 1 && i10.f((min + k2) - 1) >= j10) {
                        min--;
                    }
                }
                if (list.isEmpty()) {
                    j11 = j;
                } else {
                    j11 = -9223372036854775807L;
                }
                H0.r j27 = this.j.j();
                int k10 = this.j.k();
                Object o8 = this.j.o();
                long f = i10.f(k2);
                K0.a.k(iVar4);
                long j28 = j10;
                S0.j D4 = iVar4.D(k2 - j26);
                M0.h hVar3 = this.f4607e;
                if (c0982d == null) {
                    long e9 = i10.e(k2);
                    if (i10.g(k2, j19)) {
                        i8 = 0;
                    } else {
                        i8 = 8;
                    }
                    jVar = new f1.n(hVar3, G.i.b(mVar3, bVar.f4843a, D4, i8), j27, k10, o8, f, e9, k2, this.f4606d, j27);
                } else {
                    int i13 = 1;
                    int i14 = 1;
                    while (true) {
                        if (i14 < min) {
                            int i15 = min;
                            rVar = j27;
                            K0.a.k(iVar4);
                            S0.j a8 = D4.a(iVar4.D((i14 + k2) - j26), bVar.f4843a);
                            if (a8 == null) {
                                break;
                            }
                            i13++;
                            i14++;
                            j27 = rVar;
                            D4 = a8;
                            min = i15;
                        } else {
                            rVar = j27;
                            break;
                        }
                    }
                    long j29 = (i13 + k2) - 1;
                    long e10 = i10.e(j29);
                    if (i12 != 0 && j28 <= e10) {
                        j13 = j28;
                        j12 = j19;
                    } else {
                        j12 = j19;
                        j13 = -9223372036854775807L;
                    }
                    if (i10.g(j29, j12)) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    M0.l b8 = G.i.b(mVar3, bVar.f4843a, D4, i7);
                    long j30 = -mVar3.f4894c;
                    H0.r rVar2 = rVar;
                    if (I.i(rVar2.f1886m)) {
                        j30 += f;
                    }
                    jVar = new f1.j(hVar3, b8, rVar2, k10, o8, f, e10, j11, j13, k2, i13, j30, i10.f4596a);
                }
                lVar.f26b = jVar;
                return;
            }
        }
        lVar.f25a = z8;
    }

    @Override // f1.i
    public final int g(List list, long j) {
        if (this.f4613m == null && this.j.length() >= 2) {
            return this.j.t(list, j);
        }
        return list.size();
    }

    public final ArrayList h() {
        List list = this.f4611k.b(this.f4612l).f4880c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f4605c) {
            arrayList.addAll(((S0.a) list.get(i7)).f4840c);
        }
        return arrayList;
    }

    public final j i(int i7) {
        j[] jVarArr = this.f4610i;
        j jVar = jVarArr[i7];
        S0.b e02 = this.f4604b.e0(jVar.f4597b.f4893b);
        if (e02 != null && !e02.equals(jVar.f4598c)) {
            j jVar2 = new j(jVar.f4600e, jVar.f4597b, e02, jVar.f4596a, jVar.f, jVar.f4599d);
            jVarArr[i7] = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // f1.i
    public final void release() {
        for (j jVar : this.f4610i) {
            C0982d c0982d = jVar.f4596a;
            if (c0982d != null) {
                c0982d.f10995a.release();
            }
        }
    }
}
