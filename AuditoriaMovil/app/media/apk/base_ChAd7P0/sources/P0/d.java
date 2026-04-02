package P0;

import A3.I;
import A3.K;
import A3.e0;
import A3.j0;
import H0.C;
import H0.C0126f;
import H0.F;
import H0.L;
import H0.M;
import H0.N;
import H0.O;
import H0.P;
import H0.T;
import H0.U;
import H0.V;
import H0.b0;
import K0.s;
import K0.u;
import K0.x;
import M3.q;
import O0.C0250l;
import O0.C0260w;
import O0.C0261x;
import O0.D;
import O0.H;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import e1.C0960z;
import e1.InterfaceC0934D;
import e1.r;
import java.io.IOException;
import java.util.List;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class d implements N, InterfaceC0934D, T0.e {

    /* renamed from: X  reason: collision with root package name */
    public P f3903X;

    /* renamed from: Y  reason: collision with root package name */
    public u f3904Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f3905Z;

    /* renamed from: a  reason: collision with root package name */
    public final s f3906a;

    /* renamed from: b  reason: collision with root package name */
    public final T f3907b;

    /* renamed from: c  reason: collision with root package name */
    public final U f3908c;

    /* renamed from: d  reason: collision with root package name */
    public final q f3909d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray f3910e;
    public K0.k f;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, M3.q] */
    public d(s sVar) {
        sVar.getClass();
        this.f3906a = sVar;
        int i7 = x.f2529a;
        Looper myLooper = Looper.myLooper();
        this.f = new K0.k(myLooper == null ? Looper.getMainLooper() : myLooper, sVar, new b(1));
        T t7 = new T();
        this.f3907b = t7;
        this.f3908c = new U();
        ?? obj = new Object();
        obj.f3252a = t7;
        I i8 = K.f98b;
        obj.f3254c = e0.f138e;
        obj.f3255d = j0.f157X;
        this.f3909d = obj;
        this.f3910e = new SparseArray();
    }

    @Override // e1.InterfaceC0934D
    public final void A(int i7, C0960z c0960z, r rVar, b1.g gVar, IOException iOException, boolean z7) {
        a H7 = H(i7, c0960z);
        J(H7, 1003, new A.j(H7, rVar, gVar, iOException, z7));
    }

    @Override // e1.InterfaceC0934D
    public final void B(int i7, C0960z c0960z, b1.g gVar) {
        a H7 = H(i7, c0960z);
        J(H7, 1004, new A4.d(8, H7, gVar));
    }

    @Override // e1.InterfaceC0934D
    public final void C(int i7, C0960z c0960z, b1.g gVar) {
        J(H(i7, c0960z), 1005, new b(16));
    }

    @Override // H0.N
    public final void D(boolean z7) {
        J(E(), 7, new C0260w(24));
    }

    public final a E() {
        return G((C0960z) this.f3909d.f3256e);
    }

    public final a F(V v6, int i7, C0960z c0960z) {
        C0960z c0960z2;
        boolean z7;
        if (v6.p()) {
            c0960z2 = null;
        } else {
            c0960z2 = c0960z;
        }
        this.f3906a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (v6.equals(((H) this.f3903X).H()) && i7 == ((H) this.f3903X).E()) {
            z7 = true;
        } else {
            z7 = false;
        }
        long j = 0;
        if (c0960z2 != null && c0960z2.b()) {
            if (z7 && ((H) this.f3903X).C() == c0960z2.f10853b && ((H) this.f3903X).D() == c0960z2.f10854c) {
                j = ((H) this.f3903X).F();
            }
        } else if (z7) {
            H h8 = (H) this.f3903X;
            h8.Z();
            j = h8.A(h8.f3513Y0);
        } else if (!v6.p()) {
            j = x.Z(v6.m(i7, this.f3908c, 0L).f1733l);
        }
        C0960z c0960z3 = (C0960z) this.f3909d.f3256e;
        V H7 = ((H) this.f3903X).H();
        int E4 = ((H) this.f3903X).E();
        long F7 = ((H) this.f3903X).F();
        H h9 = (H) this.f3903X;
        h9.Z();
        return new a(elapsedRealtime, v6, i7, c0960z2, j, H7, E4, c0960z3, F7, x.Z(h9.f3513Y0.f3728r));
    }

    public final a G(C0960z c0960z) {
        V v6;
        this.f3903X.getClass();
        if (c0960z == null) {
            v6 = null;
        } else {
            v6 = (V) ((j0) this.f3909d.f3255d).get(c0960z);
        }
        if (c0960z != null && v6 != null) {
            return F(v6, v6.g(c0960z.f10852a, this.f3907b).f1718c, c0960z);
        }
        int E4 = ((H) this.f3903X).E();
        V H7 = ((H) this.f3903X).H();
        if (E4 >= H7.o()) {
            H7 = V.f1738a;
        }
        return F(H7, E4, null);
    }

    public final a H(int i7, C0960z c0960z) {
        this.f3903X.getClass();
        if (c0960z != null) {
            if (((V) ((j0) this.f3909d.f3255d).get(c0960z)) != null) {
                return G(c0960z);
            }
            return F(V.f1738a, i7, c0960z);
        }
        V H7 = ((H) this.f3903X).H();
        if (i7 >= H7.o()) {
            H7 = V.f1738a;
        }
        return F(H7, i7, null);
    }

    public final a I() {
        return G((C0960z) this.f3909d.f3253b);
    }

    public final void J(a aVar, int i7, K0.h hVar) {
        this.f3910e.put(i7, aVar);
        this.f.e(i7, hVar);
    }

    public final void K(P p7, Looper looper) {
        boolean z7;
        if (this.f3903X != null && !((K) this.f3909d.f3254c).isEmpty()) {
            z7 = false;
        } else {
            z7 = true;
        }
        K0.a.j(z7);
        p7.getClass();
        this.f3903X = p7;
        this.f3904Y = this.f3906a.a(looper, null);
        K0.k kVar = this.f;
        A4.d dVar = new A4.d(9, this, p7);
        this.f = new K0.k(kVar.f2488d, looper, kVar.f2485a, dVar, kVar.f2492i);
    }

    @Override // H0.N
    public final void a(int i7) {
        J(E(), 6, new C0260w(26));
    }

    @Override // H0.N
    public final void b(int i7) {
        P p7 = this.f3903X;
        p7.getClass();
        q qVar = this.f3909d;
        qVar.f3256e = q.o(p7, (K) qVar.f3254c, (C0960z) qVar.f, (T) qVar.f3252a);
        qVar.z(((H) p7).H());
        J(E(), 0, new C0260w(15));
    }

    @Override // H0.N
    public final void c(int i7, O o7, O o8) {
        if (i7 == 1) {
            this.f3905Z = false;
        }
        P p7 = this.f3903X;
        p7.getClass();
        q qVar = this.f3909d;
        qVar.f3256e = q.o(p7, (K) qVar.f3254c, (C0960z) qVar.f, (T) qVar.f3252a);
        a E4 = E();
        J(E4, 11, new C0261x(E4, i7, o7, o8));
    }

    @Override // e1.InterfaceC0934D
    public final void d(int i7, C0960z c0960z, r rVar, b1.g gVar) {
        J(H(i7, c0960z), PipesIterator.DEFAULT_QUEUE_SIZE, new C0260w(13));
    }

    @Override // e1.InterfaceC0934D
    public final void e(int i7, C0960z c0960z, r rVar, b1.g gVar) {
        J(H(i7, c0960z), 1001, new b(15));
    }

    @Override // H0.N
    public final void f(L l8) {
        J(E(), 12, new C0260w(5));
    }

    @Override // H0.N
    public final void g(C c8, int i7) {
        J(E(), 1, new C0260w(16));
    }

    @Override // H0.N
    public final void h(int i7) {
        J(E(), 8, new b(10));
    }

    @Override // H0.N
    public final void i(M m7) {
        J(E(), 13, new C0260w(14));
    }

    @Override // H0.N
    public final void j(boolean z7) {
        J(E(), 3, new C0260w(10));
    }

    @Override // H0.N
    public final void k(boolean z7) {
        J(I(), 23, new C0260w(2));
    }

    @Override // H0.N
    public final void l(F f) {
        J(E(), 14, new C0260w(8));
    }

    @Override // H0.N
    public final void m(C0126f c0126f) {
        J(I(), 20, new C0260w(20));
    }

    @Override // H0.N
    public final void n(List list) {
        a E4 = E();
        J(E4, 27, new O0.C(E4, list));
    }

    @Override // e1.InterfaceC0934D
    public final void o(int i7, C0960z c0960z, r rVar, b1.g gVar) {
        J(H(i7, c0960z), 1002, new b(9));
    }

    @Override // H0.N
    public final void p(int i7, boolean z7) {
        J(E(), -1, new C0260w(19));
    }

    @Override // H0.N
    public final void q(int i7, boolean z7) {
        J(E(), 5, new b(0));
    }

    @Override // H0.N
    public final void r(float f) {
        J(I(), 22, new C0260w(17));
    }

    @Override // H0.N
    public final void s(H0.e0 e0Var) {
        a I7 = I();
        J(I7, 25, new D(I7, e0Var));
    }

    @Override // H0.N
    public final void t(int i7) {
        J(E(), 4, new b(4));
    }

    @Override // H0.N
    public final void u(J0.c cVar) {
        J(E(), 27, new C0260w(7));
    }

    @Override // H0.N
    public final void v(H0.K k2) {
        a E4;
        C0960z c0960z;
        if ((k2 instanceof C0250l) && (c0960z = ((C0250l) k2).f3792Y) != null) {
            E4 = G(c0960z);
        } else {
            E4 = E();
        }
        J(E4, 10, new A.j(E4, k2, 22));
    }

    @Override // H0.N
    public final void w(H0.H h8) {
        J(E(), 28, new C0260w(22));
    }

    @Override // H0.N
    public final void x(b0 b0Var) {
        J(E(), 2, new C0260w(6));
    }

    @Override // H0.N
    public final void y(int i7, int i8) {
        J(I(), 24, new b(14));
    }

    @Override // H0.N
    public final void z(H0.K k2) {
        a E4;
        C0960z c0960z;
        if ((k2 instanceof C0250l) && (c0960z = ((C0250l) k2).f3792Y) != null) {
            E4 = G(c0960z);
        } else {
            E4 = E();
        }
        J(E4, 10, new C0260w(29));
    }
}
