package e1;

import H0.C0137q;
import O0.l0;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import m1.InterfaceC1426A;
import z1.C2067b;
/* loaded from: classes.dex */
public final class M implements InterfaceC0958x, m1.q, i1.i, i1.l, S {

    /* renamed from: I0  reason: collision with root package name */
    public static final Map f10660I0;

    /* renamed from: J0  reason: collision with root package name */
    public static final H0.r f10661J0;

    /* renamed from: A0  reason: collision with root package name */
    public int f10662A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f10663B0;

    /* renamed from: C0  reason: collision with root package name */
    public long f10664C0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f10666E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f10667F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f10668G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f10669H0;

    /* renamed from: X  reason: collision with root package name */
    public final O f10670X;

    /* renamed from: Y  reason: collision with root package name */
    public final i1.e f10671Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f10672Z;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f10673a;

    /* renamed from: b  reason: collision with root package name */
    public final M0.h f10674b;

    /* renamed from: c  reason: collision with root package name */
    public final T0.g f10675c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.firebase.firestore.Z f10676d;

    /* renamed from: e  reason: collision with root package name */
    public final T0.d f10677e;

    /* renamed from: e0  reason: collision with root package name */
    public final long f10678e0;
    public final T0.d f;

    /* renamed from: g0  reason: collision with root package name */
    public final R1.j f10680g0;

    /* renamed from: l0  reason: collision with root package name */
    public InterfaceC0957w f10685l0;

    /* renamed from: m0  reason: collision with root package name */
    public C2067b f10686m0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f10689p0;
    public boolean q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f10690r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f10691s0;

    /* renamed from: t0  reason: collision with root package name */
    public E.e f10692t0;

    /* renamed from: u0  reason: collision with root package name */
    public InterfaceC1426A f10693u0;

    /* renamed from: v0  reason: collision with root package name */
    public long f10694v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f10695w0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f10697y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f10698z0;

    /* renamed from: f0  reason: collision with root package name */
    public final i1.n f10679f0 = new i1.n("ProgressiveMediaPeriod");

    /* renamed from: h0  reason: collision with root package name */
    public final A.n f10681h0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public final H f10682i0 = new H(this, 1);

    /* renamed from: j0  reason: collision with root package name */
    public final H f10683j0 = new H(this, 2);

    /* renamed from: k0  reason: collision with root package name */
    public final Handler f10684k0 = K0.x.n(null);

    /* renamed from: o0  reason: collision with root package name */
    public L[] f10688o0 = new L[0];

    /* renamed from: n0  reason: collision with root package name */
    public T[] f10687n0 = new T[0];

    /* renamed from: D0  reason: collision with root package name */
    public long f10665D0 = -9223372036854775807L;

    /* renamed from: x0  reason: collision with root package name */
    public int f10696x0 = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f10660I0 = DesugarCollections.unmodifiableMap(hashMap);
        C0137q c0137q = new C0137q();
        c0137q.f1841a = "icy";
        c0137q.f1850l = H0.I.l("application/x-icy");
        f10661J0 = new H0.r(c0137q);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [A.n, java.lang.Object] */
    public M(Uri uri, M0.h hVar, R1.j jVar, T0.g gVar, T0.d dVar, com.google.firebase.firestore.Z z7, T0.d dVar2, O o7, i1.e eVar, int i7, long j) {
        this.f10673a = uri;
        this.f10674b = hVar;
        this.f10675c = gVar;
        this.f = dVar;
        this.f10676d = z7;
        this.f10677e = dVar2;
        this.f10670X = o7;
        this.f10671Y = eVar;
        this.f10672Z = i7;
        this.f10680g0 = jVar;
        this.f10678e0 = j;
    }

    public final m1.G A(L l8) {
        int length = this.f10687n0.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (l8.equals(this.f10688o0[i7])) {
                return this.f10687n0[i7];
            }
        }
        if (this.f10689p0) {
            K0.a.A("ProgressiveMediaPeriod", "Extractor added new track (id=" + l8.f10658a + ") after finishing tracks.");
            return new m1.n();
        }
        T0.d dVar = this.f;
        T0.g gVar = this.f10675c;
        gVar.getClass();
        T t7 = new T(this.f10671Y, gVar, dVar);
        t7.f = this;
        int i8 = length + 1;
        L[] lArr = (L[]) Arrays.copyOf(this.f10688o0, i8);
        lArr[length] = l8;
        int i9 = K0.x.f2529a;
        this.f10688o0 = lArr;
        T[] tArr = (T[]) Arrays.copyOf(this.f10687n0, i8);
        tArr[length] = t7;
        this.f10687n0 = tArr;
        return t7;
    }

    public final void B() {
        J j = new J(this, this.f10673a, this.f10674b, this.f10680g0, this, this.f10681h0);
        if (this.q0) {
            K0.a.j(u());
            long j8 = this.f10694v0;
            if (j8 != -9223372036854775807L && this.f10665D0 > j8) {
                this.f10668G0 = true;
                this.f10665D0 = -9223372036854775807L;
                return;
            }
            InterfaceC1426A interfaceC1426A = this.f10693u0;
            interfaceC1426A.getClass();
            long j9 = interfaceC1426A.j(this.f10665D0).f14019a.f13885b;
            long j10 = this.f10665D0;
            j.f10643X.f1902a = j9;
            j.f10651e0 = j10;
            j.f10645Z = true;
            j.f10654h0 = false;
            for (T t7 : this.f10687n0) {
                t7.f10747t = this.f10665D0;
            }
            this.f10665D0 = -9223372036854775807L;
        }
        this.f10667F0 = b();
        this.f10677e.k(new r(j.f10646a, j.f10652f0, this.f10679f0.f(j, this, this.f10676d.w(this.f10696x0))), 1, -1, null, 0, null, j.f10651e0, this.f10694v0);
    }

    public final boolean C() {
        if (!this.f10698z0 && !u()) {
            return false;
        }
        return true;
    }

    @Override // i1.i
    public final void E(i1.k kVar, long j, long j8, boolean z7) {
        J j9 = (J) kVar;
        Uri uri = j9.f10648c.f3133c;
        r rVar = new r(j8);
        this.f10676d.getClass();
        this.f10677e.c(rVar, 1, -1, null, 0, null, j9.f10651e0, this.f10694v0);
        if (!z7) {
            for (T t7 : this.f10687n0) {
                t7.D(false);
            }
            if (this.f10662A0 > 0) {
                InterfaceC0957w interfaceC0957w = this.f10685l0;
                interfaceC0957w.getClass();
                interfaceC0957w.B(this);
            }
        }
    }

    @Override // e1.S
    public final void T() {
        this.f10684k0.post(this.f10682i0);
    }

    public final void a() {
        K0.a.j(this.q0);
        this.f10692t0.getClass();
        this.f10693u0.getClass();
    }

    public final int b() {
        T[] tArr;
        int i7 = 0;
        for (T t7 : this.f10687n0) {
            i7 += t7.f10744q + t7.f10743p;
        }
        return i7;
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        a();
        if (!this.f10693u0.h()) {
            return 0L;
        }
        m1.z j8 = this.f10693u0.j(j);
        return l0Var.a(j, j8.f14019a.f13884a, j8.f14020b.f13884a);
    }

    @Override // e1.W
    public final boolean d() {
        boolean z7;
        if (this.f10679f0.d()) {
            A.n nVar = this.f10681h0;
            synchronized (nVar) {
                z7 = nVar.f29a;
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    @Override // i1.l
    public final void e() {
        for (T t7 : this.f10687n0) {
            t7.C();
        }
        R1.j jVar = this.f10680g0;
        m1.o oVar = (m1.o) jVar.f4683c;
        if (oVar != null) {
            oVar.release();
            jVar.f4683c = null;
        }
        jVar.f4684d = null;
    }

    @Override // e1.InterfaceC0958x
    public final void f(InterfaceC0957w interfaceC0957w, long j) {
        this.f10685l0 = interfaceC0957w;
        this.f10681h0.d();
        B();
    }

    public final long g(boolean z7) {
        long j = Long.MIN_VALUE;
        for (int i7 = 0; i7 < this.f10687n0.length; i7++) {
            if (!z7) {
                E.e eVar = this.f10692t0;
                eVar.getClass();
                if (!((boolean[]) eVar.f922d)[i7]) {
                }
            }
            j = Math.max(j, this.f10687n0[i7].o());
        }
        return j;
    }

    @Override // m1.q
    public final void h() {
        this.f10689p0 = true;
        this.f10684k0.post(this.f10682i0);
    }

    @Override // e1.InterfaceC0958x
    public final long i(h1.r[] rVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j) {
        boolean z7;
        h1.r rVar;
        boolean z8;
        boolean z9;
        a();
        E.e eVar = this.f10692t0;
        b0 b0Var = (b0) eVar.f920b;
        boolean[] zArr3 = (boolean[]) eVar.f922d;
        int i7 = this.f10662A0;
        int i8 = 0;
        for (int i9 = 0; i9 < rVarArr.length; i9++) {
            U u7 = uArr[i9];
            if (u7 != null && (rVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((K) u7).f10656a;
                K0.a.j(zArr3[i10]);
                this.f10662A0--;
                zArr3[i10] = false;
                uArr[i9] = null;
            }
        }
        if (!this.f10697y0 ? !(j == 0 || this.f10691s0) : i7 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            if (uArr[i11] == null && (rVar = rVarArr[i11]) != null) {
                if (rVar.length() == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                K0.a.j(z8);
                if (rVar.f(0) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                K0.a.j(z9);
                int b5 = b0Var.b(rVar.i());
                K0.a.j(!zArr3[b5]);
                this.f10662A0++;
                zArr3[b5] = true;
                uArr[i11] = new K(this, b5);
                zArr2[i11] = true;
                if (!z7) {
                    T t7 = this.f10687n0[b5];
                    if (t7.r() != 0 && !t7.G(j, true)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
            }
        }
        if (this.f10662A0 == 0) {
            this.f10666E0 = false;
            this.f10698z0 = false;
            i1.n nVar = this.f10679f0;
            if (nVar.d()) {
                T[] tArr = this.f10687n0;
                int length = tArr.length;
                while (i8 < length) {
                    tArr[i8].j();
                    i8++;
                }
                nVar.b();
            } else {
                this.f10668G0 = false;
                for (T t8 : this.f10687n0) {
                    t8.D(false);
                }
            }
        } else if (z7) {
            j = q(j);
            while (i8 < uArr.length) {
                if (uArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.f10697y0 = true;
        return j;
    }

    @Override // i1.i
    public final void j(i1.k kVar, long j, long j8) {
        InterfaceC1426A interfaceC1426A;
        long j9;
        J j10 = (J) kVar;
        if (this.f10694v0 == -9223372036854775807L && (interfaceC1426A = this.f10693u0) != null) {
            boolean h8 = interfaceC1426A.h();
            long g3 = g(true);
            if (g3 == Long.MIN_VALUE) {
                j9 = 0;
            } else {
                j9 = g3 + 10000;
            }
            this.f10694v0 = j9;
            this.f10670X.v(j9, h8, this.f10695w0);
        }
        Uri uri = j10.f10648c.f3133c;
        r rVar = new r(j8);
        this.f10676d.getClass();
        this.f10677e.f(rVar, 1, -1, null, 0, null, j10.f10651e0, this.f10694v0);
        this.f10668G0 = true;
        InterfaceC0957w interfaceC0957w = this.f10685l0;
        interfaceC0957w.getClass();
        interfaceC0957w.B(this);
    }

    @Override // e1.W
    public final long k() {
        return o();
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        if (this.f10698z0) {
            if (this.f10668G0 || b() > this.f10667F0) {
                this.f10698z0 = false;
                return this.f10664C0;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        a();
        return (b0) this.f10692t0.f920b;
    }

    @Override // e1.W
    public final boolean n(O0.Q q2) {
        if (!this.f10668G0) {
            i1.n nVar = this.f10679f0;
            if (!nVar.c() && !this.f10666E0) {
                if (!this.q0 || this.f10662A0 != 0) {
                    boolean d7 = this.f10681h0.d();
                    if (!nVar.d()) {
                        B();
                        return true;
                    }
                    return d7;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // e1.W
    public final long o() {
        long j;
        boolean z7;
        a();
        if (this.f10668G0 || this.f10662A0 == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.f10665D0;
        }
        if (this.f10690r0) {
            int length = this.f10687n0.length;
            j = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                E.e eVar = this.f10692t0;
                if (((boolean[]) eVar.f921c)[i7] && ((boolean[]) eVar.f922d)[i7]) {
                    T t7 = this.f10687n0[i7];
                    synchronized (t7) {
                        z7 = t7.f10750w;
                    }
                    if (!z7) {
                        j = Math.min(j, this.f10687n0[i7].o());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = g(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.f10664C0;
        }
        return j;
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        int w2 = this.f10676d.w(this.f10696x0);
        i1.n nVar = this.f10679f0;
        IOException iOException = nVar.f11431c;
        if (iOException == null) {
            i1.j jVar = nVar.f11430b;
            if (jVar != null) {
                if (w2 == Integer.MIN_VALUE) {
                    w2 = jVar.f11421a;
                }
                IOException iOException2 = jVar.f11425e;
                if (iOException2 != null && jVar.f > w2) {
                    throw iOException2;
                }
            }
            if (this.f10668G0 && !this.q0) {
                throw H0.J.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override // e1.InterfaceC0958x
    public final long q(long j) {
        boolean z7;
        boolean G2;
        a();
        boolean[] zArr = (boolean[]) this.f10692t0.f921c;
        if (!this.f10693u0.h()) {
            j = 0;
        }
        this.f10698z0 = false;
        this.f10664C0 = j;
        if (u()) {
            this.f10665D0 = j;
            return j;
        }
        int i7 = this.f10696x0;
        i1.n nVar = this.f10679f0;
        if (i7 != 7 && (this.f10668G0 || nVar.d())) {
            int length = this.f10687n0.length;
            for (int i8 = 0; i8 < length; i8++) {
                T t7 = this.f10687n0[i8];
                if (this.f10691s0) {
                    G2 = t7.F(t7.f10744q);
                } else {
                    G2 = t7.G(j, false);
                }
                if (!G2 && (zArr[i8] || !this.f10690r0)) {
                    z7 = false;
                    break;
                }
            }
            z7 = true;
            if (z7) {
                return j;
            }
        }
        this.f10666E0 = false;
        this.f10665D0 = j;
        this.f10668G0 = false;
        if (nVar.d()) {
            for (T t8 : this.f10687n0) {
                t8.j();
            }
            nVar.b();
        } else {
            nVar.f11431c = null;
            for (T t9 : this.f10687n0) {
                t9.D(false);
            }
        }
        return j;
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        if (this.f10691s0) {
            return;
        }
        a();
        if (u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f10692t0.f922d;
        int length = this.f10687n0.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f10687n0[i7].i(j, zArr[i7]);
        }
    }

    @Override // m1.q
    public final m1.G s(int i7, int i8) {
        return A(new L(i7, false));
    }

    public final boolean u() {
        if (this.f10665D0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void v() {
        long j;
        boolean z7;
        boolean z8;
        H0.H a7;
        int i7;
        if (!this.f10669H0 && !this.q0 && this.f10689p0 && this.f10693u0 != null) {
            for (T t7 : this.f10687n0) {
                if (t7.u() == null) {
                    return;
                }
            }
            this.f10681h0.a();
            int length = this.f10687n0.length;
            H0.W[] wArr = new H0.W[length];
            boolean[] zArr = new boolean[length];
            int i8 = 0;
            while (true) {
                j = this.f10678e0;
                if (i8 >= length) {
                    break;
                }
                H0.r u7 = this.f10687n0[i8].u();
                u7.getClass();
                String str = u7.f1886m;
                boolean h8 = H0.I.h(str);
                if (!h8 && !H0.I.k(str)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                zArr[i8] = z7;
                this.f10690r0 = z7 | this.f10690r0;
                boolean i9 = H0.I.i(str);
                if (j != -9223372036854775807L && length == 1 && i9) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f10691s0 = z8;
                C2067b c2067b = this.f10686m0;
                if (c2067b != null) {
                    if (h8 || this.f10688o0[i8].f10659b) {
                        H0.H h9 = u7.f1884k;
                        if (h9 == null) {
                            a7 = new H0.H(c2067b);
                        } else {
                            a7 = h9.a(c2067b);
                        }
                        C0137q a8 = u7.a();
                        a8.j = a7;
                        u7 = new H0.r(a8);
                    }
                    if (h8 && u7.f1881g == -1 && u7.f1882h == -1 && (i7 = c2067b.f16869a) != -1) {
                        C0137q a9 = u7.a();
                        a9.f1846g = i7;
                        u7 = new H0.r(a9);
                    }
                }
                int q2 = this.f10675c.q(u7);
                C0137q a10 = u7.a();
                a10.f1840I = q2;
                wArr[i8] = new H0.W(Integer.toString(i8), new H0.r(a10));
                i8++;
            }
            this.f10692t0 = new E.e(new b0(wArr), zArr);
            if (this.f10691s0 && this.f10694v0 == -9223372036854775807L) {
                this.f10694v0 = j;
                this.f10693u0 = new I(this, this.f10693u0);
            }
            this.f10670X.v(this.f10694v0, this.f10693u0.h(), this.f10695w0);
            this.q0 = true;
            InterfaceC0957w interfaceC0957w = this.f10685l0;
            interfaceC0957w.getClass();
            interfaceC0957w.a(this);
        }
    }

    public final void w(int i7) {
        a();
        E.e eVar = this.f10692t0;
        boolean[] zArr = (boolean[]) eVar.f923e;
        if (!zArr[i7]) {
            H0.r rVar = ((b0) eVar.f920b).a(i7).f1742d[0];
            this.f10677e.a(H0.I.g(rVar.f1886m), rVar, 0, null, this.f10664C0);
            zArr[i7] = true;
        }
    }

    @Override // m1.q
    public final void x(InterfaceC1426A interfaceC1426A) {
        this.f10684k0.post(new com.google.firebase.firestore.S(6, this, interfaceC1426A));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // i1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T1.e y(i1.k r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.M.y(i1.k, long, long, java.io.IOException, int):T1.e");
    }

    public final void z(int i7) {
        a();
        boolean[] zArr = (boolean[]) this.f10692t0.f921c;
        if (this.f10666E0 && zArr[i7] && !this.f10687n0[i7].w(false)) {
            this.f10665D0 = 0L;
            this.f10666E0 = false;
            this.f10698z0 = true;
            this.f10664C0 = 0L;
            this.f10667F0 = 0;
            for (T t7 : this.f10687n0) {
                t7.D(false);
            }
            InterfaceC0957w interfaceC0957w = this.f10685l0;
            interfaceC0957w.getClass();
            interfaceC0957w.B(this);
        }
    }

    @Override // e1.W
    public final void t(long j) {
    }
}
