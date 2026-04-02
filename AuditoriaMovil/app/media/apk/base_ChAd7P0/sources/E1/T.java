package e1;

import H0.C0135o;
import H0.C0137q;
import H0.InterfaceC0131k;
import android.util.SparseArray;
import i1.C1100a;
import java.io.EOFException;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public class T implements m1.G {

    /* renamed from: A  reason: collision with root package name */
    public H0.r f10723A;

    /* renamed from: B  reason: collision with root package name */
    public H0.r f10724B;

    /* renamed from: C  reason: collision with root package name */
    public long f10725C;

    /* renamed from: E  reason: collision with root package name */
    public boolean f10727E;

    /* renamed from: F  reason: collision with root package name */
    public long f10728F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f10729G;

    /* renamed from: a  reason: collision with root package name */
    public final P f10730a;

    /* renamed from: d  reason: collision with root package name */
    public final T0.g f10733d;

    /* renamed from: e  reason: collision with root package name */
    public final T0.d f10734e;
    public S f;

    /* renamed from: g  reason: collision with root package name */
    public H0.r f10735g;

    /* renamed from: h  reason: collision with root package name */
    public A.m f10736h;

    /* renamed from: p  reason: collision with root package name */
    public int f10743p;

    /* renamed from: q  reason: collision with root package name */
    public int f10744q;

    /* renamed from: r  reason: collision with root package name */
    public int f10745r;

    /* renamed from: s  reason: collision with root package name */
    public int f10746s;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10750w;

    /* renamed from: z  reason: collision with root package name */
    public boolean f10753z;

    /* renamed from: b  reason: collision with root package name */
    public final B2.c f10731b = new Object();

    /* renamed from: i  reason: collision with root package name */
    public int f10737i = PipesIterator.DEFAULT_QUEUE_SIZE;
    public long[] j = new long[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: k  reason: collision with root package name */
    public long[] f10738k = new long[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: n  reason: collision with root package name */
    public long[] f10741n = new long[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: m  reason: collision with root package name */
    public int[] f10740m = new int[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: l  reason: collision with root package name */
    public int[] f10739l = new int[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: o  reason: collision with root package name */
    public m1.F[] f10742o = new m1.F[PipesIterator.DEFAULT_QUEUE_SIZE];

    /* renamed from: c  reason: collision with root package name */
    public final A3.N f10732c = new A3.N(new com.it_nomads.fluttersecurestorage.ciphers.d(7));

    /* renamed from: t  reason: collision with root package name */
    public long f10747t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public long f10748u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f10749v = Long.MIN_VALUE;

    /* renamed from: y  reason: collision with root package name */
    public boolean f10752y = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f10751x = true;

    /* renamed from: D  reason: collision with root package name */
    public boolean f10726D = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, B2.c] */
    public T(i1.e eVar, T0.g gVar, T0.d dVar) {
        this.f10733d = gVar;
        this.f10734e = dVar;
        this.f10730a = new P(eVar);
    }

    public final synchronized long A() {
        long j;
        try {
            int s7 = s(this.f10746s);
            if (v()) {
                j = this.j[s7];
            } else {
                j = this.f10725C;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final int B(M0.x xVar, N0.f fVar, int i7, boolean z7) {
        boolean z8;
        int i8;
        boolean z9 = false;
        if ((i7 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        B2.c cVar = this.f10731b;
        synchronized (this) {
            try {
                fVar.f = false;
                i8 = -3;
                if (!v()) {
                    if (!z7 && !this.f10750w) {
                        H0.r rVar = this.f10724B;
                        if (rVar == null || (!z8 && rVar == this.f10735g)) {
                        }
                        z(rVar, xVar);
                        i8 = -5;
                    }
                    fVar.f1354b = 4;
                    fVar.f3345X = Long.MIN_VALUE;
                    i8 = -4;
                } else {
                    H0.r rVar2 = ((Q) this.f10732c.g(r())).f10721a;
                    if (!z8 && rVar2 == this.f10735g) {
                        int s7 = s(this.f10746s);
                        if (!x(s7)) {
                            fVar.f = true;
                        } else {
                            fVar.f1354b = this.f10740m[s7];
                            if (this.f10746s == this.f10743p - 1 && (z7 || this.f10750w)) {
                                fVar.a(536870912);
                            }
                            fVar.f3345X = this.f10741n[s7];
                            cVar.f249a = this.f10739l[s7];
                            cVar.f250b = this.f10738k[s7];
                            cVar.f251c = this.f10742o[s7];
                            i8 = -4;
                        }
                    }
                    z(rVar2, xVar);
                    i8 = -5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i8 == -4 && !fVar.c(4)) {
            if ((i7 & 1) != 0) {
                z9 = true;
            }
            if ((i7 & 4) == 0) {
                if (z9) {
                    P p7 = this.f10730a;
                    P.f(p7.f10719e, fVar, this.f10731b, p7.f10717c);
                } else {
                    P p8 = this.f10730a;
                    p8.f10719e = P.f(p8.f10719e, fVar, this.f10731b, p8.f10717c);
                }
            }
            if (!z9) {
                this.f10746s++;
            }
        }
        return i8;
    }

    public final void C() {
        D(true);
        A.m mVar = this.f10736h;
        if (mVar != null) {
            mVar.k0(this.f10734e);
            this.f10736h = null;
            this.f10735g = null;
        }
    }

    public final void D(boolean z7) {
        boolean z8;
        A3.N n7;
        SparseArray sparseArray;
        P p7 = this.f10730a;
        p7.a(p7.f10718d);
        G1.e eVar = p7.f10718d;
        int i7 = 0;
        if (((C1100a) eVar.f1365c) == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.j(z8);
        eVar.f1363a = 0L;
        eVar.f1364b = p7.f10716b;
        G1.e eVar2 = p7.f10718d;
        p7.f10719e = eVar2;
        p7.f = eVar2;
        p7.f10720g = 0L;
        p7.f10715a.b();
        this.f10743p = 0;
        this.f10744q = 0;
        this.f10745r = 0;
        this.f10746s = 0;
        this.f10751x = true;
        this.f10747t = Long.MIN_VALUE;
        this.f10748u = Long.MIN_VALUE;
        this.f10749v = Long.MIN_VALUE;
        this.f10750w = false;
        while (true) {
            n7 = this.f10732c;
            sparseArray = (SparseArray) n7.f105c;
            if (i7 >= sparseArray.size()) {
                break;
            }
            ((com.it_nomads.fluttersecurestorage.ciphers.d) n7.f106d).accept(sparseArray.valueAt(i7));
            i7++;
        }
        n7.f104b = -1;
        sparseArray.clear();
        if (z7) {
            this.f10723A = null;
            this.f10724B = null;
            this.f10752y = true;
            this.f10726D = true;
        }
    }

    public final synchronized void E() {
        this.f10746s = 0;
        P p7 = this.f10730a;
        p7.f10719e = p7.f10718d;
    }

    public final synchronized boolean F(int i7) {
        E();
        int i8 = this.f10744q;
        if (i7 >= i8 && i7 <= this.f10743p + i8) {
            this.f10747t = Long.MIN_VALUE;
            this.f10746s = i7 - i8;
            return true;
        }
        return false;
    }

    public final synchronized boolean G(long j, boolean z7) {
        int m7;
        try {
            E();
            int s7 = s(this.f10746s);
            if (v() && j >= this.f10741n[s7] && (j <= this.f10749v || z7)) {
                if (this.f10726D) {
                    int i7 = this.f10743p - this.f10746s;
                    m7 = 0;
                    while (true) {
                        if (m7 < i7) {
                            if (this.f10741n[s7] < j) {
                                s7++;
                                if (s7 == this.f10737i) {
                                    s7 = 0;
                                }
                                m7++;
                            }
                        } else {
                            if (!z7) {
                                i7 = -1;
                            }
                            m7 = i7;
                        }
                    }
                } else {
                    m7 = m(s7, this.f10743p - this.f10746s, j, true);
                }
                if (m7 == -1) {
                    return false;
                }
                this.f10747t = j;
                this.f10746s += m7;
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized void H(int i7) {
        boolean z7;
        if (i7 >= 0) {
            try {
                if (this.f10746s + i7 <= this.f10743p) {
                    z7 = true;
                    K0.a.e(z7);
                    this.f10746s += i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z7 = false;
        K0.a.e(z7);
        this.f10746s += i7;
    }

    @Override // m1.G
    public final void a(K0.q qVar, int i7, int i8) {
        while (true) {
            P p7 = this.f10730a;
            if (i7 > 0) {
                int c8 = p7.c(i7);
                G1.e eVar = p7.f;
                C1100a c1100a = (C1100a) eVar.f1365c;
                qVar.f(c1100a.f11381a, ((int) (p7.f10720g - eVar.f1363a)) + c1100a.f11382b, c8);
                i7 -= c8;
                long j = p7.f10720g + c8;
                p7.f10720g = j;
                G1.e eVar2 = p7.f;
                if (j == eVar2.f1364b) {
                    p7.f = (G1.e) eVar2.f1366d;
                }
            } else {
                p7.getClass();
                return;
            }
        }
    }

    @Override // m1.G
    public final int b(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        return f(interfaceC0131k, i7, z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
        if (r1 == 16) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    @Override // m1.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(H0.r r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.T.c(H0.r):void");
    }

    @Override // m1.G
    public final /* synthetic */ void d(int i7, K0.q qVar) {
        io.flutter.plugins.pathprovider.b.b(this, qVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    @Override // m1.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(long r13, int r15, int r16, int r17, m1.F r18) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.T.e(long, int, int, int, m1.F):void");
    }

    @Override // m1.G
    public final int f(InterfaceC0131k interfaceC0131k, int i7, boolean z7) {
        P p7 = this.f10730a;
        int c8 = p7.c(i7);
        G1.e eVar = p7.f;
        C1100a c1100a = (C1100a) eVar.f1365c;
        int read = interfaceC0131k.read(c1100a.f11381a, ((int) (p7.f10720g - eVar.f1363a)) + c1100a.f11382b, c8);
        if (read == -1) {
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }
        long j = p7.f10720g + read;
        p7.f10720g = j;
        G1.e eVar2 = p7.f;
        if (j == eVar2.f1364b) {
            p7.f = (G1.e) eVar2.f1366d;
            return read;
        }
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        if (((e1.Q) r9.valueAt(r9.size() - 1)).f10721a.equals(r8.f10724B) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(long r9, int r11, long r12, int r14, m1.F r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.T.g(long, int, long, int, m1.F):void");
    }

    public final long h(int i7) {
        int i8;
        this.f10748u = Math.max(this.f10748u, q(i7));
        this.f10743p -= i7;
        int i9 = this.f10744q + i7;
        this.f10744q = i9;
        int i10 = this.f10745r + i7;
        this.f10745r = i10;
        int i11 = this.f10737i;
        if (i10 >= i11) {
            this.f10745r = i10 - i11;
        }
        int i12 = this.f10746s - i7;
        this.f10746s = i12;
        int i13 = 0;
        if (i12 < 0) {
            this.f10746s = 0;
        }
        while (true) {
            A3.N n7 = this.f10732c;
            SparseArray sparseArray = (SparseArray) n7.f105c;
            if (i13 >= sparseArray.size() - 1) {
                break;
            }
            int i14 = i13 + 1;
            if (i9 < sparseArray.keyAt(i14)) {
                break;
            }
            ((com.it_nomads.fluttersecurestorage.ciphers.d) n7.f106d).accept(sparseArray.valueAt(i13));
            sparseArray.removeAt(i13);
            int i15 = n7.f104b;
            if (i15 > 0) {
                n7.f104b = i15 - 1;
            }
            i13 = i14;
        }
        if (this.f10743p == 0) {
            int i16 = this.f10745r;
            if (i16 == 0) {
                i16 = this.f10737i;
            }
            return this.f10738k[i16 - 1] + this.f10739l[i8];
        }
        return this.f10738k[this.f10745r];
    }

    public final void i(long j, boolean z7) {
        long j8;
        int i7;
        P p7 = this.f10730a;
        synchronized (this) {
            try {
                int i8 = this.f10743p;
                j8 = -1;
                if (i8 != 0) {
                    long[] jArr = this.f10741n;
                    int i9 = this.f10745r;
                    if (j >= jArr[i9]) {
                        if (z7 && (i7 = this.f10746s) != i8) {
                            i8 = i7 + 1;
                        }
                        int m7 = m(i9, i8, j, false);
                        if (m7 != -1) {
                            j8 = h(m7);
                        }
                    }
                }
            } finally {
            }
        }
        p7.b(j8);
    }

    public final void j() {
        long h8;
        P p7 = this.f10730a;
        synchronized (this) {
            int i7 = this.f10743p;
            if (i7 == 0) {
                h8 = -1;
            } else {
                h8 = h(i7);
            }
        }
        p7.b(h8);
    }

    public final long k(int i7) {
        boolean z7;
        int i8;
        int s7;
        int i9 = this.f10744q;
        int i10 = this.f10743p;
        int i11 = (i9 + i10) - i7;
        boolean z8 = false;
        if (i11 >= 0 && i11 <= i10 - this.f10746s) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        int i12 = this.f10743p - i11;
        this.f10743p = i12;
        this.f10749v = Math.max(this.f10748u, q(i12));
        if (i11 == 0 && this.f10750w) {
            z8 = true;
        }
        this.f10750w = z8;
        A3.N n7 = this.f10732c;
        SparseArray sparseArray = (SparseArray) n7.f105c;
        for (int size = sparseArray.size() - 1; size >= 0 && i7 < sparseArray.keyAt(size); size--) {
            ((com.it_nomads.fluttersecurestorage.ciphers.d) n7.f106d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i8 = Math.min(n7.f104b, sparseArray.size() - 1);
        } else {
            i8 = -1;
        }
        n7.f104b = i8;
        int i13 = this.f10743p;
        if (i13 != 0) {
            return this.f10738k[s(i13 - 1)] + this.f10739l[s7];
        }
        return 0L;
    }

    public final void l(int i7) {
        boolean z7;
        long k2 = k(i7);
        P p7 = this.f10730a;
        if (k2 <= p7.f10720g) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        p7.f10720g = k2;
        int i8 = (k2 > 0L ? 1 : (k2 == 0L ? 0 : -1));
        int i9 = p7.f10716b;
        if (i8 != 0) {
            G1.e eVar = p7.f10718d;
            if (k2 != eVar.f1363a) {
                while (p7.f10720g > eVar.f1364b) {
                    eVar = (G1.e) eVar.f1366d;
                }
                G1.e eVar2 = (G1.e) eVar.f1366d;
                eVar2.getClass();
                p7.a(eVar2);
                G1.e eVar3 = new G1.e(i9, eVar.f1364b);
                eVar.f1366d = eVar3;
                if (p7.f10720g == eVar.f1364b) {
                    eVar = eVar3;
                }
                p7.f = eVar;
                if (p7.f10719e == eVar2) {
                    p7.f10719e = eVar3;
                    return;
                }
                return;
            }
        }
        p7.a(p7.f10718d);
        G1.e eVar4 = new G1.e(i9, p7.f10720g);
        p7.f10718d = eVar4;
        p7.f10719e = eVar4;
        p7.f = eVar4;
    }

    public final int m(int i7, int i8, long j, boolean z7) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = (this.f10741n[i7] > j ? 1 : (this.f10741n[i7] == j ? 0 : -1));
            if (i11 > 0) {
                break;
            }
            if (!z7 || (this.f10740m[i7] & 1) != 0) {
                i9 = i10;
                if (i11 == 0) {
                    break;
                }
            }
            i7++;
            if (i7 == this.f10737i) {
                i7 = 0;
            }
        }
        return i9;
    }

    public H0.r n(H0.r rVar) {
        if (this.f10728F != 0 && rVar.f1891r != Long.MAX_VALUE) {
            C0137q a7 = rVar.a();
            a7.f1855q = rVar.f1891r + this.f10728F;
            return new H0.r(a7);
        }
        return rVar;
    }

    public final synchronized long o() {
        return this.f10749v;
    }

    public final synchronized long p() {
        return Math.max(this.f10748u, q(this.f10746s));
    }

    public final long q(int i7) {
        long j = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int s7 = s(i7 - 1);
        for (int i8 = 0; i8 < i7; i8++) {
            j = Math.max(j, this.f10741n[s7]);
            if ((this.f10740m[s7] & 1) != 0) {
                break;
            }
            s7--;
            if (s7 == -1) {
                s7 = this.f10737i - 1;
            }
        }
        return j;
    }

    public final int r() {
        return this.f10744q + this.f10746s;
    }

    public final int s(int i7) {
        int i8 = this.f10745r + i7;
        int i9 = this.f10737i;
        if (i8 >= i9) {
            return i8 - i9;
        }
        return i8;
    }

    public final synchronized int t(long j, boolean z7) {
        int s7 = s(this.f10746s);
        if (v() && j >= this.f10741n[s7]) {
            if (j > this.f10749v && z7) {
                return this.f10743p - this.f10746s;
            }
            int m7 = m(s7, this.f10743p - this.f10746s, j, true);
            if (m7 == -1) {
                return 0;
            }
            return m7;
        }
        return 0;
    }

    public final synchronized H0.r u() {
        H0.r rVar;
        if (this.f10752y) {
            rVar = null;
        } else {
            rVar = this.f10724B;
        }
        return rVar;
    }

    public final boolean v() {
        if (this.f10746s != this.f10743p) {
            return true;
        }
        return false;
    }

    public final synchronized boolean w(boolean z7) {
        H0.r rVar;
        boolean z8 = true;
        if (!v()) {
            if (!z7 && !this.f10750w && ((rVar = this.f10724B) == null || rVar == this.f10735g)) {
                z8 = false;
            }
            return z8;
        } else if (((Q) this.f10732c.g(r())).f10721a != this.f10735g) {
            return true;
        } else {
            return x(s(this.f10746s));
        }
    }

    public final boolean x(int i7) {
        A.m mVar = this.f10736h;
        if (mVar != null && mVar.i0() != 4) {
            if ((this.f10740m[i7] & 1073741824) == 0) {
                this.f10736h.getClass();
            }
            return false;
        }
        return true;
    }

    public final void y() {
        A.m mVar = this.f10736h;
        if (mVar != null && mVar.i0() == 1) {
            T0.b g02 = this.f10736h.g0();
            g02.getClass();
            throw g02;
        }
    }

    public final void z(H0.r rVar, M0.x xVar) {
        boolean z7;
        C0135o c0135o;
        H0.r rVar2;
        H0.r rVar3 = this.f10735g;
        if (rVar3 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (rVar3 == null) {
            c0135o = null;
        } else {
            c0135o = rVar3.f1890q;
        }
        this.f10735g = rVar;
        C0135o c0135o2 = rVar.f1890q;
        T0.g gVar = this.f10733d;
        if (gVar != null) {
            int q2 = gVar.q(rVar);
            C0137q a7 = rVar.a();
            a7.f1840I = q2;
            rVar2 = new H0.r(a7);
        } else {
            rVar2 = rVar;
        }
        xVar.f3211c = rVar2;
        xVar.f3210b = this.f10736h;
        if (gVar == null) {
            return;
        }
        if (!z7 && K0.x.a(c0135o, c0135o2)) {
            return;
        }
        A.m mVar = this.f10736h;
        T0.d dVar = this.f10734e;
        A.m k2 = gVar.k(dVar, rVar);
        this.f10736h = k2;
        xVar.f3210b = k2;
        if (mVar != null) {
            mVar.k0(dVar);
        }
    }
}
