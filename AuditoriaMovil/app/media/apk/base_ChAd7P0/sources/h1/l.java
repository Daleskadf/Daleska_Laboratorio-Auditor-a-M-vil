package h1;

import A3.B;
import A3.K;
import A3.c0;
import A3.e0;
import A3.l0;
import D.AbstractC0059i;
import H0.W;
import java.util.Comparator;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class l extends n implements Comparable {

    /* renamed from: X  reason: collision with root package name */
    public final boolean f11283X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f11284Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f11285Z;

    /* renamed from: e  reason: collision with root package name */
    public final int f11286e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f11287e0;
    public final boolean f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f11288f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f11289g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f11290h0;

    public l(int i7, W w2, int i8, C1076j c1076j, int i9, String str) {
        super(i7, w2, i8);
        boolean z7;
        boolean z8;
        e0 e0Var;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        int i11 = 0;
        this.f = AbstractC0059i.v(i9, false);
        int i12 = this.f11294d.f1880e;
        c1076j.getClass();
        if ((i12 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f11283X = z7;
        if ((i12 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f11284Y = z8;
        e0 e0Var2 = c1076j.f1771n;
        if (e0Var2.isEmpty()) {
            e0Var = K.u(StringUtils.EMPTY);
        } else {
            e0Var = e0Var2;
        }
        int i13 = 0;
        while (true) {
            if (i13 < e0Var.size()) {
                i10 = p.d(this.f11294d, (String) e0Var.get(i13), false);
                if (i10 > 0) {
                    break;
                }
                i13++;
            } else {
                i13 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                i10 = 0;
                break;
            }
        }
        this.f11285Z = i13;
        this.f11287e0 = i10;
        int c8 = p.c(this.f11294d.f, c1076j.f1772o);
        this.f11288f0 = c8;
        if ((this.f11294d.f & 1088) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11290h0 = z9;
        if (p.f(str) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int d7 = p.d(this.f11294d, str, z10);
        this.f11289g0 = d7;
        if (i10 <= 0 && ((!e0Var2.isEmpty() || c8 <= 0) && !this.f11283X && (!this.f11284Y || d7 <= 0))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (AbstractC0059i.v(i9, c1076j.f11278w) && z11) {
            i11 = 1;
        }
        this.f11286e = i11;
    }

    @Override // h1.n
    public final int a() {
        return this.f11286e;
    }

    @Override // h1.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        l lVar = (l) nVar;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(l lVar) {
        B c8 = B.f81a.c(this.f, lVar.f);
        Integer valueOf = Integer.valueOf(this.f11285Z);
        Integer valueOf2 = Integer.valueOf(lVar.f11285Z);
        Comparator comparator = c0.f132a;
        comparator.getClass();
        l0 l0Var = l0.f171a;
        B b5 = c8.b(valueOf, valueOf2, l0Var);
        int i7 = this.f11287e0;
        B a7 = b5.a(i7, lVar.f11287e0);
        int i8 = this.f11288f0;
        B c9 = a7.a(i8, lVar.f11288f0).c(this.f11283X, lVar.f11283X);
        Boolean valueOf3 = Boolean.valueOf(this.f11284Y);
        Boolean valueOf4 = Boolean.valueOf(lVar.f11284Y);
        if (i7 != 0) {
            comparator = l0Var;
        }
        B a8 = c9.b(valueOf3, valueOf4, comparator).a(this.f11289g0, lVar.f11289g0);
        if (i8 == 0) {
            a8 = a8.d(this.f11290h0, lVar.f11290h0);
        }
        return a8.e();
    }
}
