package U0;

import A3.AbstractC0021t;
import A3.K;
import D.C0054d;
import H0.C0135o;
import H0.C0137q;
import H0.H;
import H0.I;
import K0.x;
import M0.w;
import O0.P;
import O0.Q;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.firebase.firestore.Z;
import e1.C0937b;
import e1.S;
import e1.W;
import e1.b0;
import f1.AbstractC0983e;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m1.G;
import m1.InterfaceC1426A;
/* loaded from: classes.dex */
public final class r implements i1.i, i1.l, W, m1.q, S {

    /* renamed from: T0  reason: collision with root package name */
    public static final Set f5649T0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A0  reason: collision with root package name */
    public H0.r f5650A0;

    /* renamed from: B0  reason: collision with root package name */
    public H0.r f5651B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f5652C0;

    /* renamed from: D0  reason: collision with root package name */
    public b0 f5653D0;

    /* renamed from: E0  reason: collision with root package name */
    public Set f5654E0;

    /* renamed from: F0  reason: collision with root package name */
    public int[] f5655F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f5656G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f5657H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean[] f5658I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean[] f5659J0;

    /* renamed from: K0  reason: collision with root package name */
    public long f5660K0;

    /* renamed from: L0  reason: collision with root package name */
    public long f5661L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f5662M0;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f5663N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f5664O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f5665P0;

    /* renamed from: Q0  reason: collision with root package name */
    public long f5666Q0;

    /* renamed from: R0  reason: collision with root package name */
    public C0135o f5667R0;

    /* renamed from: S0  reason: collision with root package name */
    public k f5668S0;

    /* renamed from: X  reason: collision with root package name */
    public final T0.g f5669X;

    /* renamed from: Y  reason: collision with root package name */
    public final T0.d f5670Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Z f5671Z;

    /* renamed from: a  reason: collision with root package name */
    public final String f5672a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5673b;

    /* renamed from: c  reason: collision with root package name */
    public final C5.i f5674c;

    /* renamed from: d  reason: collision with root package name */
    public final i f5675d;

    /* renamed from: e  reason: collision with root package name */
    public final i1.e f5676e;

    /* renamed from: e0  reason: collision with root package name */
    public final i1.n f5677e0 = new i1.n("Loader:HlsSampleStreamWrapper");
    public final H0.r f;

    /* renamed from: f0  reason: collision with root package name */
    public final T0.d f5678f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f5679g0;

    /* renamed from: h0  reason: collision with root package name */
    public final C0054d f5680h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f5681i0;

    /* renamed from: j0  reason: collision with root package name */
    public final List f5682j0;

    /* renamed from: k0  reason: collision with root package name */
    public final o f5683k0;

    /* renamed from: l0  reason: collision with root package name */
    public final o f5684l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Handler f5685m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f5686n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Map f5687o0;

    /* renamed from: p0  reason: collision with root package name */
    public AbstractC0983e f5688p0;
    public q[] q0;

    /* renamed from: r0  reason: collision with root package name */
    public int[] f5689r0;

    /* renamed from: s0  reason: collision with root package name */
    public final HashSet f5690s0;

    /* renamed from: t0  reason: collision with root package name */
    public final SparseIntArray f5691t0;

    /* renamed from: u0  reason: collision with root package name */
    public p f5692u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f5693v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f5694w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f5695x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f5696y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f5697z0;

    /* JADX WARN: Type inference failed for: r1v12, types: [U0.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [U0.o] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, D.d] */
    public r(String str, int i7, C5.i iVar, i iVar2, Map map, i1.e eVar, long j, H0.r rVar, T0.g gVar, T0.d dVar, Z z7, T0.d dVar2, int i8) {
        this.f5672a = str;
        this.f5673b = i7;
        this.f5674c = iVar;
        this.f5675d = iVar2;
        this.f5687o0 = map;
        this.f5676e = eVar;
        this.f = rVar;
        this.f5669X = gVar;
        this.f5670Y = dVar;
        this.f5671Z = z7;
        this.f5678f0 = dVar2;
        this.f5679g0 = i8;
        ?? obj = new Object();
        obj.f689b = null;
        obj.f688a = false;
        obj.f690c = null;
        this.f5680h0 = obj;
        this.f5689r0 = new int[0];
        Set set = f5649T0;
        this.f5690s0 = new HashSet(set.size());
        this.f5691t0 = new SparseIntArray(set.size());
        this.q0 = new q[0];
        this.f5659J0 = new boolean[0];
        this.f5658I0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f5681i0 = arrayList;
        this.f5682j0 = DesugarCollections.unmodifiableList(arrayList);
        this.f5686n0 = new ArrayList();
        this.f5683k0 = new Runnable(this) { // from class: U0.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ r f5640b;

            {
                this.f5640b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5640b.B();
                        return;
                    default:
                        r rVar2 = this.f5640b;
                        rVar2.f5695x0 = true;
                        rVar2.B();
                        return;
                }
            }
        };
        this.f5684l0 = new Runnable(this) { // from class: U0.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ r f5640b;

            {
                this.f5640b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5640b.B();
                        return;
                    default:
                        r rVar2 = this.f5640b;
                        rVar2.f5695x0 = true;
                        rVar2.B();
                        return;
                }
            }
        };
        this.f5685m0 = x.n(null);
        this.f5660K0 = j;
        this.f5661L0 = j;
    }

    public static m1.n b(int i7, int i8) {
        K0.a.A("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i8);
        return new m1.n();
    }

    public static H0.r u(H0.r rVar, H0.r rVar2, boolean z7) {
        String str;
        String str2;
        int i7;
        int i8;
        if (rVar == null) {
            return rVar2;
        }
        String str3 = rVar2.f1886m;
        int g3 = I.g(str3);
        String str4 = rVar.j;
        if (x.u(g3, str4) == 1) {
            str2 = x.v(g3, str4);
            str = I.c(str2);
        } else {
            String a7 = I.a(str4, str3);
            str = str3;
            str2 = a7;
        }
        C0137q a8 = rVar2.a();
        a8.f1841a = rVar.f1876a;
        a8.f1842b = rVar.f1877b;
        a8.f1843c = K.p(rVar.f1878c);
        a8.f1844d = rVar.f1879d;
        a8.f1845e = rVar.f1880e;
        a8.f = rVar.f;
        if (z7) {
            i7 = rVar.f1881g;
        } else {
            i7 = -1;
        }
        a8.f1846g = i7;
        if (z7) {
            i8 = rVar.f1882h;
        } else {
            i8 = -1;
        }
        a8.f1847h = i8;
        a8.f1848i = str2;
        if (g3 == 2) {
            a8.f1856r = rVar.f1892s;
            a8.f1857s = rVar.f1893t;
            a8.f1858t = rVar.f1894u;
        }
        if (str != null) {
            a8.g(str);
        }
        int i9 = rVar.f1865A;
        if (i9 != -1 && g3 == 1) {
            a8.f1864z = i9;
        }
        H h8 = rVar.f1884k;
        if (h8 != null) {
            H h9 = rVar2.f1884k;
            if (h9 != null) {
                h8 = h9.d(h8);
            }
            a8.j = h8;
        }
        return new H0.r(a8);
    }

    public static int z(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 1;
        }
        return 0;
    }

    public final boolean A() {
        if (this.f5661L0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        boolean z7;
        int i7;
        H0.r u7;
        int i8 = 0;
        if (!this.f5652C0 && this.f5655F0 == null && this.f5695x0) {
            for (q qVar : this.q0) {
                if (qVar.u() == null) {
                    return;
                }
            }
            b0 b0Var = this.f5653D0;
            if (b0Var != null) {
                int i9 = b0Var.f10780a;
                int[] iArr = new int[i9];
                this.f5655F0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = 0;
                    while (true) {
                        q[] qVarArr = this.q0;
                        if (i11 < qVarArr.length) {
                            H0.r u8 = qVarArr[i11].u();
                            K0.a.k(u8);
                            H0.r rVar = this.f5653D0.a(i10).f1742d[0];
                            String str = rVar.f1886m;
                            String str2 = u8.f1886m;
                            int g3 = I.g(str2);
                            if (g3 != 3) {
                                if (g3 == I.g(str)) {
                                    break;
                                }
                                i11++;
                            } else {
                                if (!x.a(str2, str)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || u8.f1870F == rVar.f1870F) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    this.f5655F0[i10] = i11;
                }
                Iterator it = this.f5686n0.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).c();
                }
                return;
            }
            int length = this.q0.length;
            int i12 = 0;
            int i13 = -1;
            int i14 = -2;
            while (true) {
                int i15 = 2;
                if (i12 >= length) {
                    break;
                }
                H0.r u9 = this.q0[i12].u();
                K0.a.k(u9);
                String str3 = u9.f1886m;
                if (!I.k(str3)) {
                    if (I.h(str3)) {
                        i15 = 1;
                    } else if (I.j(str3)) {
                        i15 = 3;
                    } else {
                        i15 = -2;
                    }
                }
                if (z(i15) > z(i14)) {
                    i13 = i12;
                    i14 = i15;
                } else if (i15 == i14 && i13 != -1) {
                    i13 = -1;
                }
                i12++;
            }
            H0.W w2 = this.f5675d.f5564h;
            int i16 = w2.f1739a;
            this.f5656G0 = -1;
            this.f5655F0 = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                this.f5655F0[i17] = i17;
            }
            H0.W[] wArr = new H0.W[length];
            int i18 = 0;
            while (i18 < length) {
                H0.r u10 = this.q0[i18].u();
                K0.a.k(u10);
                String str4 = this.f5672a;
                H0.r rVar2 = this.f;
                if (i18 == i13) {
                    H0.r[] rVarArr = new H0.r[i16];
                    for (int i19 = i8; i19 < i16; i19++) {
                        H0.r rVar3 = w2.f1742d[i19];
                        if (i14 == 1 && rVar2 != null) {
                            rVar3 = rVar3.d(rVar2);
                        }
                        if (i16 == 1) {
                            u7 = u10.d(rVar3);
                        } else {
                            u7 = u(rVar3, u10, true);
                        }
                        rVarArr[i19] = u7;
                    }
                    wArr[i18] = new H0.W(str4, rVarArr);
                    this.f5656G0 = i18;
                    i7 = 0;
                } else {
                    rVar2 = (i14 == 2 && I.h(u10.f1886m)) ? null : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i18 < i13 ? i18 : i18 - 1);
                    i7 = 0;
                    wArr[i18] = new H0.W(sb.toString(), u(rVar2, u10, false));
                }
                i18++;
                i8 = i7;
            }
            int i20 = i8;
            this.f5653D0 = g(wArr);
            if (this.f5654E0 == null) {
                z7 = 1;
            } else {
                z7 = i20;
            }
            K0.a.j(z7);
            this.f5654E0 = Collections.emptySet();
            this.f5696y0 = true;
            this.f5674c.r0();
        }
    }

    public final void C() {
        this.f5677e0.a();
        i iVar = this.f5675d;
        C0937b c0937b = iVar.f5569n;
        if (c0937b == null) {
            Uri uri = iVar.f5570o;
            if (uri != null && iVar.f5574s) {
                V0.b bVar = (V0.b) iVar.f5563g.f5811d.get(uri);
                bVar.f5797b.a();
                IOException iOException = bVar.f5801e0;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw c0937b;
    }

    public final void D(H0.W[] wArr, int... iArr) {
        this.f5653D0 = g(wArr);
        this.f5654E0 = new HashSet();
        for (int i7 : iArr) {
            this.f5654E0.add(this.f5653D0.a(i7));
        }
        this.f5656G0 = 0;
        this.f5685m0.post(new C.b(this.f5674c, 20));
        this.f5696y0 = true;
    }

    @Override // i1.i
    public final void E(i1.k kVar, long j, long j8, boolean z7) {
        AbstractC0983e abstractC0983e = (AbstractC0983e) kVar;
        this.f5688p0 = null;
        long j9 = abstractC0983e.f11003a;
        Uri uri = abstractC0983e.f11002Z.f3133c;
        e1.r rVar = new e1.r(j8);
        this.f5671Z.getClass();
        this.f5678f0.c(rVar, abstractC0983e.f11005c, this.f5673b, abstractC0983e.f11006d, abstractC0983e.f11007e, abstractC0983e.f, abstractC0983e.f11000X, abstractC0983e.f11001Y);
        if (!z7) {
            if (A() || this.f5697z0 == 0) {
                F();
            }
            if (this.f5697z0 > 0) {
                this.f5674c.B(this);
            }
        }
    }

    public final void F() {
        for (q qVar : this.q0) {
            qVar.D(this.f5662M0);
        }
        this.f5662M0 = false;
    }

    public final boolean G(long j, boolean z7) {
        k kVar;
        boolean z8;
        boolean G2;
        this.f5660K0 = j;
        if (A()) {
            this.f5661L0 = j;
            return true;
        }
        boolean z9 = this.f5675d.f5571p;
        ArrayList arrayList = this.f5681i0;
        if (z9) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                kVar = (k) arrayList.get(i7);
                if (kVar.f11000X == j) {
                    break;
                }
            }
        }
        kVar = null;
        if (this.f5695x0 && !z7) {
            int length = this.q0.length;
            for (int i8 = 0; i8 < length; i8++) {
                q qVar = this.q0[i8];
                if (kVar != null) {
                    G2 = qVar.F(kVar.f(i8));
                } else {
                    G2 = qVar.G(j, false);
                }
                if (!G2 && (this.f5659J0[i8] || !this.f5657H0)) {
                    z8 = false;
                    break;
                }
            }
            z8 = true;
            if (z8) {
                return false;
            }
        }
        this.f5661L0 = j;
        this.f5664O0 = false;
        arrayList.clear();
        i1.n nVar = this.f5677e0;
        if (nVar.d()) {
            if (this.f5695x0) {
                for (q qVar2 : this.q0) {
                    qVar2.j();
                }
            }
            nVar.b();
        } else {
            nVar.f11431c = null;
            F();
        }
        return true;
    }

    @Override // e1.S
    public final void T() {
        this.f5685m0.post(this.f5683k0);
    }

    public final void a() {
        K0.a.j(this.f5696y0);
        this.f5653D0.getClass();
        this.f5654E0.getClass();
    }

    @Override // e1.W
    public final boolean d() {
        return this.f5677e0.d();
    }

    @Override // i1.l
    public final void e() {
        for (q qVar : this.q0) {
            qVar.C();
        }
    }

    public final b0 g(H0.W[] wArr) {
        for (int i7 = 0; i7 < wArr.length; i7++) {
            H0.W w2 = wArr[i7];
            H0.r[] rVarArr = new H0.r[w2.f1739a];
            for (int i8 = 0; i8 < w2.f1739a; i8++) {
                H0.r rVar = w2.f1742d[i8];
                int q2 = this.f5669X.q(rVar);
                C0137q a7 = rVar.a();
                a7.f1840I = q2;
                rVarArr[i8] = new H0.r(a7);
            }
            wArr[i7] = new H0.W(w2.f1740b, rVarArr);
        }
        return new b0(wArr);
    }

    @Override // m1.q
    public final void h() {
        this.f5665P0 = true;
        this.f5685m0.post(this.f5684l0);
    }

    @Override // i1.i
    public final void j(i1.k kVar, long j, long j8) {
        AbstractC0983e abstractC0983e = (AbstractC0983e) kVar;
        this.f5688p0 = null;
        i iVar = this.f5675d;
        if (abstractC0983e instanceof e) {
            e eVar = (e) abstractC0983e;
            iVar.f5568m = eVar.f5548e0;
            Uri uri = eVar.f11004b.f3172a;
            byte[] bArr = eVar.f5550g0;
            bArr.getClass();
            A4.c cVar = iVar.j;
            cVar.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((d) cVar.f218b).put(uri, bArr);
        }
        long j9 = abstractC0983e.f11003a;
        Uri uri2 = abstractC0983e.f11002Z.f3133c;
        e1.r rVar = new e1.r(j8);
        this.f5671Z.getClass();
        this.f5678f0.f(rVar, abstractC0983e.f11005c, this.f5673b, abstractC0983e.f11006d, abstractC0983e.f11007e, abstractC0983e.f, abstractC0983e.f11000X, abstractC0983e.f11001Y);
        if (!this.f5696y0) {
            P p7 = new P();
            p7.f3607a = this.f5660K0;
            n(new Q(p7));
            return;
        }
        this.f5674c.B(this);
    }

    @Override // e1.W
    public final long k() {
        if (A()) {
            return this.f5661L0;
        }
        if (this.f5664O0) {
            return Long.MIN_VALUE;
        }
        return w().f11001Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.io.IOException, e1.b] */
    @Override // e1.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(O0.Q r58) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.r.n(O0.Q):boolean");
    }

    @Override // e1.W
    public final long o() {
        if (this.f5664O0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f5661L0;
        }
        long j = this.f5660K0;
        k w2 = w();
        if (!w2.f5579C0) {
            ArrayList arrayList = this.f5681i0;
            if (arrayList.size() > 1) {
                w2 = (k) arrayList.get(arrayList.size() - 2);
            } else {
                w2 = null;
            }
        }
        if (w2 != null) {
            j = Math.max(j, w2.f11001Y);
        }
        if (this.f5695x0) {
            for (q qVar : this.q0) {
                j = Math.max(j, qVar.o());
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [m1.n] */
    @Override // m1.q
    public final G s(int i7, int i8) {
        k kVar;
        q qVar;
        Integer valueOf = Integer.valueOf(i8);
        Set set = f5649T0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f5690s0;
        SparseIntArray sparseIntArray = this.f5691t0;
        boolean z7 = false;
        q qVar2 = null;
        if (contains) {
            K0.a.e(set.contains(Integer.valueOf(i8)));
            int i9 = sparseIntArray.get(i8, -1);
            if (i9 != -1) {
                if (hashSet.add(Integer.valueOf(i8))) {
                    this.f5689r0[i9] = i7;
                }
                if (this.f5689r0[i9] == i7) {
                    qVar = this.q0[i9];
                } else {
                    qVar = b(i7, i8);
                }
                qVar2 = qVar;
            }
        } else {
            int i10 = 0;
            while (true) {
                q[] qVarArr = this.q0;
                if (i10 >= qVarArr.length) {
                    break;
                } else if (this.f5689r0[i10] == i7) {
                    qVar2 = qVarArr[i10];
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (qVar2 == null) {
            if (this.f5665P0) {
                return b(i7, i8);
            }
            int length = this.q0.length;
            if (i8 == 1 || i8 == 2) {
                z7 = true;
            }
            qVar2 = new q(this.f5676e, this.f5669X, this.f5670Y, this.f5687o0);
            qVar2.f10747t = this.f5660K0;
            if (z7) {
                qVar2.f5648I = this.f5667R0;
                qVar2.f10753z = true;
            }
            long j = this.f5666Q0;
            if (qVar2.f10728F != j) {
                qVar2.f10728F = j;
                qVar2.f10753z = true;
            }
            if (this.f5668S0 != null) {
                qVar2.f10725C = kVar.f5583f0;
            }
            qVar2.f = this;
            int i11 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f5689r0, i11);
            this.f5689r0 = copyOf;
            copyOf[length] = i7;
            q[] qVarArr2 = this.q0;
            int i12 = x.f2529a;
            Object[] copyOf2 = Arrays.copyOf(qVarArr2, qVarArr2.length + 1);
            copyOf2[qVarArr2.length] = qVar2;
            this.q0 = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f5659J0, i11);
            this.f5659J0 = copyOf3;
            copyOf3[length] = z7;
            this.f5657H0 |= z7;
            hashSet.add(Integer.valueOf(i8));
            sparseIntArray.append(i8, length);
            if (z(i8) > z(this.f5693v0)) {
                this.f5694w0 = length;
                this.f5693v0 = i8;
            }
            this.f5658I0 = Arrays.copyOf(this.f5658I0, i11);
        }
        if (i8 == 5) {
            if (this.f5692u0 == null) {
                this.f5692u0 = new p(qVar2, this.f5679g0);
            }
            return this.f5692u0;
        }
        return qVar2;
    }

    @Override // e1.W
    public final void t(long j) {
        int size;
        boolean a7;
        i1.n nVar = this.f5677e0;
        if (!nVar.c() && !A()) {
            boolean d7 = nVar.d();
            i iVar = this.f5675d;
            List list = this.f5682j0;
            if (d7) {
                this.f5688p0.getClass();
                AbstractC0983e abstractC0983e = this.f5688p0;
                if (iVar.f5569n != null) {
                    a7 = false;
                } else {
                    a7 = iVar.f5572q.a(j, abstractC0983e, list);
                }
                if (a7) {
                    nVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((k) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                v(size2);
            }
            if (iVar.f5569n == null && iVar.f5572q.length() >= 2) {
                size = iVar.f5572q.t(list, j);
            } else {
                size = list.size();
            }
            if (size < this.f5681i0.size()) {
                v(size);
            }
        }
    }

    public final void v(int i7) {
        ArrayList arrayList;
        K0.a.j(!this.f5677e0.d());
        int i8 = i7;
        loop0: while (true) {
            arrayList = this.f5681i0;
            if (i8 < arrayList.size()) {
                int i9 = i8;
                while (true) {
                    if (i9 < arrayList.size()) {
                        if (((k) arrayList.get(i9)).f5586i0) {
                            break;
                        }
                        i9++;
                    } else {
                        k kVar = (k) arrayList.get(i8);
                        for (int i10 = 0; i10 < this.q0.length; i10++) {
                            if (this.q0[i10].r() > kVar.f(i10)) {
                                break;
                            }
                        }
                        break loop0;
                    }
                }
            } else {
                i8 = -1;
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            return;
        }
        long j = w().f11001Y;
        k kVar2 = (k) arrayList.get(i8);
        x.R(arrayList, i8, arrayList.size());
        for (int i11 = 0; i11 < this.q0.length; i11++) {
            this.q0[i11].l(kVar2.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f5661L0 = this.f5660K0;
        } else {
            ((k) AbstractC0021t.l(arrayList)).f5581E0 = true;
        }
        this.f5664O0 = false;
        this.f5678f0.m(new b1.g(1, this.f5693v0, null, 3, null, x.Z(kVar2.f11000X), x.Z(j)));
    }

    public final k w() {
        ArrayList arrayList = this.f5681i0;
        return (k) arrayList.get(arrayList.size() - 1);
    }

    @Override // i1.i
    public final T1.e y(i1.k kVar, long j, long j8, IOException iOException, int i7) {
        boolean z7;
        T1.e eVar;
        T1.e eVar2;
        int i8;
        AbstractC0983e abstractC0983e = (AbstractC0983e) kVar;
        boolean z8 = abstractC0983e instanceof k;
        if (z8 && !((k) abstractC0983e).f5582F0 && (iOException instanceof w) && ((i8 = ((w) iOException).f3207d) == 410 || i8 == 404)) {
            return i1.n.f11427d;
        }
        long j9 = abstractC0983e.f11002Z.f3132b;
        Uri uri = abstractC0983e.f11002Z.f3133c;
        e1.r rVar = new e1.r(j8);
        x.Z(abstractC0983e.f11000X);
        x.Z(abstractC0983e.f11001Y);
        B5.S s7 = new B5.S(iOException, i7, 9);
        i iVar = this.f5675d;
        i1.h h8 = j3.f.h(iVar.f5572q);
        this.f5671Z.getClass();
        T1.e u7 = Z.u(h8, s7);
        boolean z9 = false;
        if (u7 != null && u7.f5318a == 2) {
            h1.r rVar2 = iVar.f5572q;
            z7 = rVar2.m(rVar2.u(iVar.f5564h.b(abstractC0983e.f11006d)), u7.f5319b);
        } else {
            z7 = false;
        }
        if (z7) {
            if (z8 && j9 == 0) {
                ArrayList arrayList = this.f5681i0;
                if (((k) arrayList.remove(arrayList.size() - 1)) == abstractC0983e) {
                    z9 = true;
                }
                K0.a.j(z9);
                if (arrayList.isEmpty()) {
                    this.f5661L0 = this.f5660K0;
                } else {
                    ((k) AbstractC0021t.l(arrayList)).f5581E0 = true;
                }
            }
            eVar2 = i1.n.f11428e;
        } else {
            long y2 = Z.y(s7);
            if (y2 != -9223372036854775807L) {
                eVar = new T1.e(0, y2, false);
            } else {
                eVar = i1.n.f;
            }
            eVar2 = eVar;
        }
        boolean a7 = eVar2.a();
        this.f5678f0.h(rVar, abstractC0983e.f11005c, this.f5673b, abstractC0983e.f11006d, abstractC0983e.f11007e, abstractC0983e.f, abstractC0983e.f11000X, abstractC0983e.f11001Y, iOException, !a7);
        if (!a7) {
            this.f5688p0 = null;
        }
        if (z7) {
            if (!this.f5696y0) {
                P p7 = new P();
                p7.f3607a = this.f5660K0;
                n(new Q(p7));
            } else {
                this.f5674c.B(this);
            }
        }
        return eVar2;
    }

    @Override // m1.q
    public final void x(InterfaceC1426A interfaceC1426A) {
    }
}
