package m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.f;
/* loaded from: classes.dex */
public abstract class a {
    public static void a(g gVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if ((gVar.R0() & 32) != 32) {
            j(gVar);
            return;
        }
        gVar.O0 = true;
        gVar.I0 = false;
        gVar.J0 = false;
        gVar.K0 = false;
        ArrayList<f> arrayList = gVar.f16613v0;
        List<h> list = gVar.H0;
        f.b s10 = gVar.s();
        f.b bVar = f.b.WRAP_CONTENT;
        if (s10 == bVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (gVar.B() == bVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        list.clear();
        for (f fVar : arrayList) {
            fVar.f16544r = null;
            fVar.f16531k0 = false;
            fVar.S();
        }
        for (f fVar2 : arrayList) {
            if (fVar2.f16544r == null && !b(fVar2, list, z12)) {
                j(gVar);
                gVar.O0 = false;
                return;
            }
        }
        int i10 = 0;
        int i11 = 0;
        for (h hVar : list) {
            i10 = Math.max(i10, c(hVar, 0));
            i11 = Math.max(i11, c(hVar, 1));
        }
        if (z10) {
            gVar.g0(f.b.FIXED);
            gVar.y0(i10);
            gVar.I0 = true;
            gVar.J0 = true;
            gVar.L0 = i10;
        }
        if (z11) {
            gVar.u0(f.b.FIXED);
            gVar.b0(i11);
            gVar.I0 = true;
            gVar.K0 = true;
            gVar.M0 = i11;
        }
        i(list, 0, gVar.D());
        i(list, 1, gVar.r());
    }

    public static boolean b(f fVar, List list, boolean z10) {
        h hVar = new h(new ArrayList(), true);
        list.add(hVar);
        return k(fVar, hVar, list, z10);
    }

    public static int c(h hVar, int i10) {
        boolean z10;
        int i11 = i10 * 2;
        List b10 = hVar.b(i10);
        int size = b10.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            f fVar = (f) b10.get(i13);
            e[] eVarArr = fVar.C;
            e eVar = eVarArr[i11 + 1].f16484d;
            if (eVar != null && (eVarArr[i11].f16484d == null || eVar == null)) {
                z10 = false;
            } else {
                z10 = true;
            }
            i12 = Math.max(i12, d(fVar, i10, z10, 0));
        }
        hVar.f16571e[i10] = i12;
        return i12;
    }

    public static int d(f fVar, int i10, boolean z10, int i11) {
        boolean z11;
        int r10;
        int j10;
        int i12;
        int i13;
        int i14;
        int i15;
        int r11;
        int r12;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 0;
        if (!fVar.f16527i0) {
            return 0;
        }
        if (fVar.f16554y.f16484d != null && i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            r10 = fVar.j();
            j10 = fVar.r() - fVar.j();
            i13 = i10 * 2;
            i12 = i13 + 1;
        } else {
            r10 = fVar.r() - fVar.j();
            j10 = fVar.j();
            i12 = i10 * 2;
            i13 = i12 + 1;
        }
        e[] eVarArr = fVar.C;
        if (eVarArr[i12].f16484d != null && eVarArr[i13].f16484d == null) {
            i14 = -1;
            int i21 = i12;
            i12 = i13;
            i13 = i21;
        } else {
            i14 = 1;
        }
        if (z11) {
            i15 = i11 - r10;
        } else {
            i15 = i11;
        }
        int d10 = (eVarArr[i13].d() * i14) + e(fVar, i10);
        int i22 = i15 + d10;
        if (i10 == 0) {
            r11 = fVar.D();
        } else {
            r11 = fVar.r();
        }
        int i23 = r11 * i14;
        Iterator it = fVar.C[i13].f().f16601a.iterator();
        while (it.hasNext()) {
            i20 = Math.max(i20, d(((m) ((o) it.next())).f16587c.f16482b, i10, z10, i22));
        }
        int i24 = 0;
        for (Iterator it2 = fVar.C[i12].f().f16601a.iterator(); it2.hasNext(); it2 = it2) {
            i24 = Math.max(i24, d(((m) ((o) it2.next())).f16587c.f16482b, i10, z10, i23 + i22));
        }
        if (z11) {
            i20 -= r10;
            i16 = i24 + j10;
        } else {
            if (i10 == 0) {
                r12 = fVar.D();
            } else {
                r12 = fVar.r();
            }
            i16 = i24 + (r12 * i14);
        }
        int i25 = 1;
        if (i10 == 1) {
            Iterator it3 = fVar.f16554y.f().f16601a.iterator();
            int i26 = 0;
            while (it3.hasNext()) {
                Iterator it4 = it3;
                m mVar = (m) ((o) it3.next());
                if (i14 == i25) {
                    i26 = Math.max(i26, d(mVar.f16587c.f16482b, i10, z10, r10 + i22));
                    i19 = i12;
                } else {
                    i19 = i12;
                    i26 = Math.max(i26, d(mVar.f16587c.f16482b, i10, z10, (j10 * i14) + i22));
                }
                it3 = it4;
                i12 = i19;
                i25 = 1;
            }
            i17 = i12;
            int i27 = i26;
            if (fVar.f16554y.f().f16601a.size() > 0 && !z11) {
                if (i14 == 1) {
                    i18 = i27 + r10;
                } else {
                    i18 = i27 - j10;
                }
            } else {
                i18 = i27;
            }
        } else {
            i17 = i12;
            i18 = 0;
        }
        int max = d10 + Math.max(i20, Math.max(i16, i18));
        int i28 = i23 + i22;
        if (i14 == -1) {
            i28 = i22;
            i22 = i28;
        }
        if (z10) {
            k.e(fVar, i10, i22);
            fVar.Z(i22, i28, i10);
        } else {
            fVar.f16544r.a(fVar, i10);
            fVar.q0(i22, i10);
        }
        if (fVar.o(i10) == f.b.MATCH_CONSTRAINT && fVar.I != 0.0f) {
            fVar.f16544r.a(fVar, i10);
        }
        e[] eVarArr2 = fVar.C;
        if (eVarArr2[i13].f16484d != null && eVarArr2[i17].f16484d != null) {
            f u10 = fVar.u();
            e[] eVarArr3 = fVar.C;
            if (eVarArr3[i13].f16484d.f16482b == u10 && eVarArr3[i17].f16484d.f16482b == u10) {
                fVar.f16544r.a(fVar, i10);
            }
        }
        return max;
    }

    public static int e(f fVar, int i10) {
        e eVar;
        float f10;
        int i11 = i10 * 2;
        e[] eVarArr = fVar.C;
        e eVar2 = eVarArr[i11];
        e eVar3 = eVarArr[i11 + 1];
        e eVar4 = eVar2.f16484d;
        if (eVar4 != null) {
            f fVar2 = eVar4.f16482b;
            f fVar3 = fVar.F;
            if (fVar2 == fVar3 && (eVar = eVar3.f16484d) != null && eVar.f16482b == fVar3) {
                int t10 = fVar3.t(i10);
                if (i10 == 0) {
                    f10 = fVar.Z;
                } else {
                    f10 = fVar.f16511a0;
                }
                return (int) ((((t10 - eVar2.d()) - eVar3.d()) - fVar.t(i10)) * f10);
            }
            return 0;
        }
        return 0;
    }

    public static void f(g gVar, f fVar, h hVar) {
        hVar.f16570d = false;
        gVar.O0 = false;
        fVar.f16527i0 = false;
    }

    public static int g(f fVar) {
        float D;
        float r10;
        f.b s10 = fVar.s();
        f.b bVar = f.b.MATCH_CONSTRAINT;
        if (s10 == bVar) {
            if (fVar.J == 0) {
                r10 = fVar.r() * fVar.I;
            } else {
                r10 = fVar.r() / fVar.I;
            }
            int i10 = (int) r10;
            fVar.y0(i10);
            return i10;
        } else if (fVar.B() == bVar) {
            if (fVar.J == 1) {
                D = fVar.D() * fVar.I;
            } else {
                D = fVar.D() / fVar.I;
            }
            int i11 = (int) D;
            fVar.b0(i11);
            return i11;
        } else {
            return -1;
        }
    }

    public static void h(e eVar) {
        m f10 = eVar.f();
        e eVar2 = eVar.f16484d;
        if (eVar2 != null && eVar2.f16484d != eVar) {
            eVar2.f().a(f10);
        }
    }

    public static void i(List list, int i10, int i11) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            for (f fVar : ((h) list.get(i12)).c(i10)) {
                if (fVar.f16527i0) {
                    l(fVar, i10, i11);
                }
            }
        }
    }

    public static void j(g gVar) {
        gVar.H0.clear();
        gVar.H0.add(0, new h(gVar.f16613v0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0159, code lost:
        if (r4.f16482b == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0110, code lost:
        if (r4.f16482b == r5) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(m.f r8, m.h r9, java.util.List r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.k(m.f, m.h, java.util.List, boolean):boolean");
    }

    public static void l(f fVar, int i10, int i11) {
        boolean z10;
        int i12 = i10 * 2;
        e[] eVarArr = fVar.C;
        e eVar = eVarArr[i12];
        e eVar2 = eVarArr[i12 + 1];
        if (eVar.f16484d != null && eVar2.f16484d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            k.e(fVar, i10, e(fVar, i10) + eVar.d());
        } else if (fVar.I != 0.0f && fVar.o(i10) == f.b.MATCH_CONSTRAINT) {
            int g10 = g(fVar);
            int i13 = (int) fVar.C[i12].f().f16592h;
            int i14 = i13 + g10;
            eVar2.f().f16591g = eVar.f();
            eVar2.f().f16592h = g10;
            eVar2.f().f16602b = 1;
            fVar.Z(i13, i14, i10);
        } else {
            int v10 = i11 - fVar.v(i10);
            int t10 = v10 - fVar.t(i10);
            fVar.Z(t10, v10, i10);
            k.e(fVar, i10, t10);
        }
    }
}
