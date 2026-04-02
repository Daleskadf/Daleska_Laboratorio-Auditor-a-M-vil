package h1;

import A3.B;
import A3.c0;
import A3.d0;
import A3.e0;
import A3.l0;
import D.AbstractC0059i;
import H0.W;
import K0.x;
import android.text.TextUtils;
/* renamed from: h1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072f extends n implements Comparable {

    /* renamed from: X  reason: collision with root package name */
    public final String f11243X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1076j f11244Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f11245Z;

    /* renamed from: e  reason: collision with root package name */
    public final int f11246e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f11247e0;
    public final boolean f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f11248f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f11249g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f11250h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f11251i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f11252j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f11253k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f11254l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f11255m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f11256n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f11257o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f11258p0;
    public final boolean q0;

    /* renamed from: r0  reason: collision with root package name */
    public final boolean f11259r0;

    public C1072f(int i7, W w2, int i8, C1076j c1076j, int i9, boolean z7, C1070d c1070d, int i10) {
        super(i7, w2, i8);
        int i11;
        int i12;
        int i13;
        boolean z8;
        boolean z9;
        boolean z10;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        this.f11244Y = c1076j;
        if (c1076j.f11276u) {
            i11 = 24;
        } else {
            i11 = 16;
        }
        int i15 = 0;
        this.f11250h0 = false;
        this.f11243X = p.f(this.f11294d.f1879d);
        this.f11245Z = AbstractC0059i.v(i9, false);
        int i16 = 0;
        while (true) {
            e0 e0Var = c1076j.f1767i;
            int size = e0Var.size();
            i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i16 < size) {
                i13 = p.d(this.f11294d, (String) e0Var.get(i16), false);
                if (i13 > 0) {
                    break;
                }
                i16++;
            } else {
                i13 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f11248f0 = i16;
        this.f11247e0 = i13;
        this.f11249g0 = p.c(this.f11294d.f, 0);
        H0.r rVar = this.f11294d;
        int i17 = rVar.f;
        if (i17 != 0 && (i17 & 1) == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f11251i0 = z8;
        if ((rVar.f1880e & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11254l0 = z9;
        int i18 = rVar.f1865A;
        this.f11255m0 = i18;
        this.f11256n0 = rVar.f1866B;
        int i19 = rVar.f1883i;
        this.f11257o0 = i19;
        if ((i19 == -1 || i19 <= c1076j.f1768k) && ((i18 == -1 || i18 <= c1076j.j) && c1070d.apply(rVar))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f = z10;
        String[] D4 = x.D();
        int i20 = 0;
        while (true) {
            if (i20 < D4.length) {
                i14 = p.d(this.f11294d, D4[i20], false);
                if (i14 > 0) {
                    break;
                }
                i20++;
            } else {
                i14 = 0;
                i20 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f11252j0 = i20;
        this.f11253k0 = i14;
        int i21 = 0;
        while (true) {
            e0 e0Var2 = c1076j.f1769l;
            if (i21 < e0Var2.size()) {
                String str = this.f11294d.f1886m;
                if (str != null && str.equals(e0Var2.get(i21))) {
                    i12 = i21;
                    break;
                }
                i21++;
            } else {
                break;
            }
        }
        this.f11258p0 = i12;
        if (AbstractC0059i.t(i9) == 128) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.q0 = z11;
        if (AbstractC0059i.u(i9) == 64) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f11259r0 = z12;
        C1076j c1076j2 = this.f11244Y;
        if (AbstractC0059i.v(i9, c1076j2.f11278w) && ((z13 = this.f) || c1076j2.f11275t)) {
            c1076j2.f1770m.getClass();
            i15 = (!AbstractC0059i.v(i9, false) || !z13 || this.f11294d.f1883i == -1 || (!c1076j2.f11279x && z7) || (i11 & i9) == 0) ? 1 : 2;
        }
        this.f11246e = i15;
    }

    @Override // h1.n
    public final int a() {
        return this.f11246e;
    }

    @Override // h1.n
    public final boolean b(n nVar) {
        int i7;
        String str;
        C1072f c1072f = (C1072f) nVar;
        this.f11244Y.getClass();
        H0.r rVar = this.f11294d;
        int i8 = rVar.f1865A;
        if (i8 != -1) {
            H0.r rVar2 = c1072f.f11294d;
            if (i8 == rVar2.f1865A && ((this.f11250h0 || ((str = rVar.f1886m) != null && TextUtils.equals(str, rVar2.f1886m))) && (i7 = rVar.f1866B) != -1 && i7 == rVar2.f1866B)) {
                if (this.q0 == c1072f.q0 && this.f11259r0 == c1072f.f11259r0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(C1072f c1072f) {
        d0 a7;
        boolean z7 = this.f11245Z;
        boolean z8 = this.f;
        if (z8 && z7) {
            a7 = p.f11309i;
        } else {
            a7 = p.f11309i.a();
        }
        B c8 = B.f81a.c(z7, c1072f.f11245Z);
        Integer valueOf = Integer.valueOf(this.f11248f0);
        Integer valueOf2 = Integer.valueOf(c1072f.f11248f0);
        c0.f132a.getClass();
        l0 l0Var = l0.f171a;
        B b5 = c8.b(valueOf, valueOf2, l0Var).a(this.f11247e0, c1072f.f11247e0).a(this.f11249g0, c1072f.f11249g0).c(this.f11254l0, c1072f.f11254l0).c(this.f11251i0, c1072f.f11251i0).b(Integer.valueOf(this.f11252j0), Integer.valueOf(c1072f.f11252j0), l0Var).a(this.f11253k0, c1072f.f11253k0).c(z8, c1072f.f).b(Integer.valueOf(this.f11258p0), Integer.valueOf(c1072f.f11258p0), l0Var);
        this.f11244Y.getClass();
        B b7 = b5.c(this.q0, c1072f.q0).c(this.f11259r0, c1072f.f11259r0).b(Integer.valueOf(this.f11255m0), Integer.valueOf(c1072f.f11255m0), a7).b(Integer.valueOf(this.f11256n0), Integer.valueOf(c1072f.f11256n0), a7);
        if (x.a(this.f11243X, c1072f.f11243X)) {
            b7 = b7.b(Integer.valueOf(this.f11257o0), Integer.valueOf(c1072f.f11257o0), a7);
        }
        return b7.e();
    }
}
