package b1;

import A3.j0;
import H0.J;
import K0.p;
import K0.x;
import a1.C0432i;
import a1.C0434k;
import m1.G;
import m1.q;
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0434k f8128a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8129b;

    /* renamed from: c  reason: collision with root package name */
    public G f8130c;

    /* renamed from: d  reason: collision with root package name */
    public long f8131d;

    /* renamed from: e  reason: collision with root package name */
    public int f8132e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f8133g;

    /* renamed from: h  reason: collision with root package name */
    public long f8134h;

    public f(C0434k c0434k) {
        this.f8128a = c0434k;
        try {
            this.f8129b = e(c0434k.f6843d);
            this.f8131d = -9223372036854775807L;
            this.f8132e = -1;
            this.f = 0;
            this.f8133g = 0L;
            this.f8134h = -9223372036854775807L;
        } catch (J e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int e(j0 j0Var) {
        boolean z7;
        boolean z8;
        String str = (String) j0Var.get("config");
        int i7 = 0;
        boolean z9 = false;
        i7 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] t7 = x.t(str);
            p pVar = new p(t7, t7.length);
            int i8 = pVar.i(1);
            if (i8 == 0) {
                if (pVar.i(1) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                K0.a.d("Only supports allStreamsSameTimeFraming.", z7);
                int i9 = pVar.i(6);
                if (pVar.i(4) == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                K0.a.d("Only suppors one program.", z8);
                if (pVar.i(3) == 0) {
                    z9 = true;
                }
                K0.a.d("Only suppors one layer.", z9);
                i7 = i9;
            } else {
                throw new J(io.flutter.plugins.pathprovider.b.e(i8, "unsupported audio mux version: "), null, true, 0);
            }
        }
        return i7 + 1;
    }

    @Override // b1.i
    public final void a(long j, long j8) {
        this.f8131d = j;
        this.f = 0;
        this.f8133g = j8;
    }

    @Override // b1.i
    public final void b(long j) {
        boolean z7;
        if (this.f8131d == -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        this.f8131d = j;
    }

    @Override // b1.i
    public final void c(q qVar, int i7) {
        G s7 = qVar.s(i7, 2);
        this.f8130c = s7;
        int i8 = x.f2529a;
        s7.c(this.f8128a.f6842c);
    }

    @Override // b1.i
    public final void d(K0.q qVar, long j, int i7, boolean z7) {
        K0.a.k(this.f8130c);
        int a7 = C0432i.a(this.f8132e);
        if (this.f > 0 && a7 < i7) {
            G g3 = this.f8130c;
            g3.getClass();
            g3.e(this.f8134h, 1, this.f, 0, null);
            this.f = 0;
            this.f8134h = -9223372036854775807L;
        }
        for (int i8 = 0; i8 < this.f8129b; i8++) {
            int i9 = 0;
            while (qVar.f2514b < qVar.f2515c) {
                int u7 = qVar.u();
                i9 += u7;
                if (u7 != 255) {
                    break;
                }
            }
            this.f8130c.d(i9, qVar);
            this.f += i9;
        }
        this.f8134h = f7.a.p0(this.f8133g, j, this.f8131d, this.f8128a.f6841b);
        if (z7) {
            G g4 = this.f8130c;
            g4.getClass();
            g4.e(this.f8134h, 1, this.f, 0, null);
            this.f = 0;
            this.f8134h = -9223372036854775807L;
        }
        this.f8132e = i7;
    }
}
