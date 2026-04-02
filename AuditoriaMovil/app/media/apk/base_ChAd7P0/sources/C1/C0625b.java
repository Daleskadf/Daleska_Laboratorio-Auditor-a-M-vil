package c1;

import A3.AbstractC0021t;
import A3.K;
import A3.e0;
import D.C0054d;
import H0.C0137q;
import H0.I;
import H0.W;
import H0.r;
import M0.C;
import M0.h;
import O0.Q;
import O0.l0;
import T0.g;
import X5.L;
import com.google.firebase.firestore.Z;
import e1.C0947l;
import e1.InterfaceC0957w;
import e1.InterfaceC0958x;
import e1.U;
import e1.V;
import e1.b0;
import f1.C0986h;
import f5.C0993a;
import i1.e;
import i1.o;
import java.util.AbstractList;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
/* renamed from: c1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625b implements InterfaceC0958x, V {

    /* renamed from: X  reason: collision with root package name */
    public final T0.d f8334X;

    /* renamed from: Y  reason: collision with root package name */
    public final e f8335Y;

    /* renamed from: Z  reason: collision with root package name */
    public final b0 f8336Z;

    /* renamed from: a  reason: collision with root package name */
    public final C0054d f8337a;

    /* renamed from: b  reason: collision with root package name */
    public final C f8338b;

    /* renamed from: c  reason: collision with root package name */
    public final o f8339c;

    /* renamed from: d  reason: collision with root package name */
    public final g f8340d;

    /* renamed from: e  reason: collision with root package name */
    public final T0.d f8341e;

    /* renamed from: e0  reason: collision with root package name */
    public final C0993a f8342e0;
    public final Z f;

    /* renamed from: f0  reason: collision with root package name */
    public InterfaceC0957w f8343f0;

    /* renamed from: g0  reason: collision with root package name */
    public d1.c f8344g0;

    /* renamed from: h0  reason: collision with root package name */
    public C0986h[] f8345h0;

    /* renamed from: i0  reason: collision with root package name */
    public C0947l f8346i0;

    public C0625b(d1.c cVar, C0054d c0054d, C c8, C0993a c0993a, g gVar, T0.d dVar, Z z7, T0.d dVar2, o oVar, e eVar) {
        String str;
        this.f8344g0 = cVar;
        this.f8337a = c0054d;
        this.f8338b = c8;
        this.f8339c = oVar;
        this.f8340d = gVar;
        this.f8341e = dVar;
        this.f = z7;
        this.f8334X = dVar2;
        this.f8335Y = eVar;
        this.f8342e0 = c0993a;
        W[] wArr = new W[cVar.f.length];
        int i7 = 0;
        while (true) {
            d1.b[] bVarArr = cVar.f;
            if (i7 < bVarArr.length) {
                r[] rVarArr = bVarArr[i7].j;
                r[] rVarArr2 = new r[rVarArr.length];
                for (int i8 = 0; i8 < rVarArr.length; i8++) {
                    r rVar = rVarArr[i8];
                    C0137q a7 = rVar.a();
                    a7.f1840I = gVar.q(rVar);
                    r rVar2 = new r(a7);
                    if (c0054d.f688a && ((C0993a) c0054d.f690c).i(rVar2)) {
                        C0137q a8 = rVar2.a();
                        a8.f1850l = I.l("application/x-media3-cues");
                        a8.f1837F = ((C0993a) c0054d.f690c).k(rVar2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(rVar2.f1886m);
                        String str2 = rVar2.j;
                        if (str2 != null) {
                            str = StringUtils.SPACE.concat(str2);
                        } else {
                            str = StringUtils.EMPTY;
                        }
                        sb.append(str);
                        a8.f1848i = sb.toString();
                        a8.f1855q = Long.MAX_VALUE;
                        rVar2 = new r(a8);
                    }
                    rVarArr2[i8] = rVar2;
                }
                wArr[i7] = new W(Integer.toString(i7), rVarArr2);
                i7++;
            } else {
                this.f8336Z = new b0(wArr);
                this.f8345h0 = new C0986h[0];
                c0993a.getClass();
                A3.I i9 = K.f98b;
                e0 e0Var = e0.f138e;
                this.f8346i0 = new C0947l(e0Var, e0Var);
                return;
            }
        }
    }

    @Override // e1.V
    public final void B(e1.W w2) {
        InterfaceC0957w interfaceC0957w = this.f8343f0;
        interfaceC0957w.getClass();
        interfaceC0957w.B(this);
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        C0986h[] c0986hArr;
        for (C0986h c0986h : this.f8345h0) {
            if (c0986h.f11016a == 2) {
                return c0986h.f11020e.c(j, l0Var);
            }
        }
        return j;
    }

    @Override // e1.W
    public final boolean d() {
        return this.f8346i0.d();
    }

    @Override // e1.InterfaceC0958x
    public final void f(InterfaceC0957w interfaceC0957w, long j) {
        this.f8343f0 = interfaceC0957w;
        interfaceC0957w.a(this);
    }

    @Override // e1.InterfaceC0958x
    public final long i(h1.r[] rVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j) {
        int i7;
        h1.r rVar;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < rVarArr.length) {
            U u7 = uArr[i8];
            if (u7 != null) {
                C0986h c0986h = (C0986h) u7;
                h1.r rVar2 = rVarArr[i8];
                if (rVar2 != null && zArr[i8]) {
                    ((C0624a) c0986h.f11020e).f8331e = rVar2;
                    arrayList.add(c0986h);
                } else {
                    c0986h.A(null);
                    uArr[i8] = null;
                }
            }
            if (uArr[i8] == null && (rVar = rVarArr[i8]) != null) {
                int b5 = this.f8336Z.b(rVar.i());
                d1.c cVar = this.f8344g0;
                C0054d c0054d = this.f8337a;
                h a7 = ((M0.g) c0054d.f689b).a();
                C c8 = this.f8338b;
                if (c8 != null) {
                    a7.n(c8);
                }
                i7 = i8;
                C0986h c0986h2 = new C0986h(this.f8344g0.f[b5].f10174a, null, null, new C0624a(this.f8339c, cVar, b5, rVar, a7, (C0993a) c0054d.f690c, c0054d.f688a), this, this.f8335Y, j, this.f8340d, this.f8341e, this.f, this.f8334X);
                arrayList.add(c0986h2);
                uArr[i7] = c0986h2;
                zArr2[i7] = true;
            } else {
                i7 = i8;
            }
            i8 = i7 + 1;
        }
        C0986h[] c0986hArr = new C0986h[arrayList.size()];
        this.f8345h0 = c0986hArr;
        arrayList.toArray(c0986hArr);
        AbstractList w2 = AbstractC0021t.w(arrayList, new L(20));
        this.f8342e0.getClass();
        this.f8346i0 = new C0947l(arrayList, w2);
        return j;
    }

    @Override // e1.W
    public final long k() {
        return this.f8346i0.k();
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        return this.f8336Z;
    }

    @Override // e1.W
    public final boolean n(Q q2) {
        return this.f8346i0.n(q2);
    }

    @Override // e1.W
    public final long o() {
        return this.f8346i0.o();
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        this.f8339c.a();
    }

    @Override // e1.InterfaceC0958x
    public final long q(long j) {
        for (C0986h c0986h : this.f8345h0) {
            c0986h.B(j);
        }
        return j;
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        for (C0986h c0986h : this.f8345h0) {
            c0986h.r(j);
        }
    }

    @Override // e1.W
    public final void t(long j) {
        this.f8346i0.t(j);
    }
}
