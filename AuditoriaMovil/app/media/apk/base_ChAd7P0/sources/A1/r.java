package a1;

import A3.K;
import A3.N;
import A3.e0;
import A3.j0;
import B5.S;
import H0.W;
import O0.Q;
import O0.l0;
import android.net.Uri;
import android.os.Handler;
import com.google.firebase.firestore.Z;
import e1.InterfaceC0957w;
import e1.InterfaceC0958x;
import e1.T;
import e1.U;
import e1.b0;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
/* loaded from: classes.dex */
public final class r implements InterfaceC0958x {

    /* renamed from: X */
    public final A.m f6879X;

    /* renamed from: Y */
    public final Z f6880Y;

    /* renamed from: Z */
    public InterfaceC0957w f6881Z;

    /* renamed from: a */
    public final i1.e f6882a;

    /* renamed from: b */
    public final Handler f6883b = K0.x.n(null);

    /* renamed from: c */
    public final C5.i f6884c;

    /* renamed from: d */
    public final C0436m f6885d;

    /* renamed from: e */
    public final ArrayList f6886e;

    /* renamed from: e0 */
    public e0 f6887e0;
    public final ArrayList f;

    /* renamed from: f0 */
    public IOException f6888f0;

    /* renamed from: g0 */
    public R0.a f6889g0;

    /* renamed from: h0 */
    public long f6890h0;

    /* renamed from: i0 */
    public long f6891i0;

    /* renamed from: j0 */
    public long f6892j0;

    /* renamed from: k0 */
    public boolean f6893k0;

    /* renamed from: l0 */
    public boolean f6894l0;

    /* renamed from: m0 */
    public boolean f6895m0;

    /* renamed from: n0 */
    public boolean f6896n0;

    /* renamed from: o0 */
    public boolean f6897o0;

    /* renamed from: p0 */
    public int f6898p0;
    public boolean q0;

    public r(i1.e eVar, Z z7, Uri uri, A.m mVar, String str, SocketFactory socketFactory) {
        this.f6882a = eVar;
        this.f6880Y = z7;
        this.f6879X = mVar;
        C5.i iVar = new C5.i(this, 26);
        this.f6884c = iVar;
        this.f6885d = new C0436m(iVar, iVar, str, uri, socketFactory);
        this.f6886e = new ArrayList();
        this.f = new ArrayList();
        this.f6891i0 = -9223372036854775807L;
        this.f6890h0 = -9223372036854775807L;
        this.f6892j0 = -9223372036854775807L;
    }

    public static /* synthetic */ long a(r rVar) {
        return rVar.f6891i0;
    }

    public static /* synthetic */ void b(r rVar) {
        rVar.f6891i0 = -9223372036854775807L;
    }

    public static /* synthetic */ long e(r rVar) {
        return rVar.f6892j0;
    }

    public static /* synthetic */ void g(r rVar) {
        rVar.f6892j0 = -9223372036854775807L;
    }

    public static /* synthetic */ ArrayList h(r rVar) {
        return rVar.f;
    }

    public static /* synthetic */ A.m j(r rVar) {
        return rVar.f6879X;
    }

    public static boolean s(r rVar) {
        if (rVar.f6891i0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ long u(r rVar) {
        return rVar.f6890h0;
    }

    public static /* synthetic */ void v(r rVar) {
        rVar.f6890h0 = -9223372036854775807L;
    }

    public static void w(r rVar) {
        rVar.f6893k0 = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = rVar.f6886e;
            if (i7 < arrayList.size()) {
                rVar.f6893k0 = ((q) arrayList.get(i7)).f6877d & rVar.f6893k0;
                i7++;
            } else {
                return;
            }
        }
    }

    public static void x(r rVar) {
        if (!rVar.f6895m0 && !rVar.f6896n0) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = rVar.f6886e;
                if (i7 < arrayList.size()) {
                    if (((q) arrayList.get(i7)).f6876c.u() != null) {
                        i7++;
                    } else {
                        return;
                    }
                } else {
                    rVar.f6896n0 = true;
                    K p7 = K.p(arrayList);
                    A3.H h8 = new A3.H();
                    for (int i8 = 0; i8 < p7.size(); i8++) {
                        T t7 = ((q) p7.get(i8)).f6876c;
                        String num = Integer.toString(i8);
                        H0.r u7 = t7.u();
                        K0.a.h(u7);
                        h8.c(new W(num, u7));
                    }
                    rVar.f6887e0 = h8.g();
                    InterfaceC0957w interfaceC0957w = rVar.f6881Z;
                    K0.a.h(interfaceC0957w);
                    interfaceC0957w.a(rVar);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, a1.d] */
    /* JADX WARN: Type inference failed for: r2v0, types: [R0.a, java.io.IOException] */
    public static void y(r rVar) {
        rVar.q0 = true;
        C0436m c0436m = rVar.f6885d;
        c0436m.getClass();
        try {
            c0436m.close();
            y yVar = new y(new M0.x(c0436m));
            c0436m.f6851Z = yVar;
            yVar.a(c0436m.j(c0436m.f6850Y));
            c0436m.f6858f0 = null;
            c0436m.f6864l0 = false;
            c0436m.f6861i0 = null;
        } catch (IOException e7) {
            c0436m.f6853b.q0(new IOException(e7));
        }
        rVar.f6880Y.getClass();
        ?? obj = new Object();
        ArrayList arrayList = rVar.f6886e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = rVar.f;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            q qVar = (q) arrayList.get(i7);
            if (!qVar.f6877d) {
                p pVar = qVar.f6874a;
                q qVar2 = new q(rVar, pVar.f6870a, i7, obj);
                arrayList2.add(qVar2);
                qVar2.b();
                if (arrayList3.contains(pVar)) {
                    arrayList4.add(qVar2.f6874a);
                }
            } else {
                arrayList2.add(qVar);
            }
        }
        K p7 = K.p(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i8 = 0; i8 < p7.size(); i8++) {
            ((q) p7.get(i8)).a();
        }
    }

    @Override // e1.W
    public final boolean d() {
        int i7;
        if (!this.f6893k0 && ((i7 = this.f6885d.f6862j0) == 2 || i7 == 1)) {
            return true;
        }
        return false;
    }

    @Override // e1.InterfaceC0958x
    public final void f(InterfaceC0957w interfaceC0957w, long j) {
        C0436m c0436m = this.f6885d;
        this.f6881Z = interfaceC0957w;
        try {
            c0436m.getClass();
            try {
                c0436m.f6851Z.a(c0436m.j(c0436m.f6850Y));
                Uri uri = c0436m.f6850Y;
                String str = c0436m.f6858f0;
                N n7 = c0436m.f6849X;
                n7.r(n7.h(4, str, j0.f157X, uri));
            } catch (IOException e7) {
                K0.x.h(c0436m.f6851Z);
                throw e7;
            }
        } catch (IOException e8) {
            this.f6888f0 = e8;
            K0.x.h(c0436m);
        }
    }

    @Override // e1.InterfaceC0958x
    public final long i(h1.r[] rVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        for (int i7 = 0; i7 < rVarArr.length; i7++) {
            if (uArr[i7] != null && (rVarArr[i7] == null || !zArr[i7])) {
                uArr[i7] = null;
            }
        }
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        int i8 = 0;
        while (true) {
            int length = rVarArr.length;
            arrayList = this.f6886e;
            if (i8 >= length) {
                break;
            }
            h1.r rVar = rVarArr[i8];
            if (rVar != null) {
                W i9 = rVar.i();
                e0 e0Var = this.f6887e0;
                e0Var.getClass();
                int indexOf = e0Var.indexOf(i9);
                q qVar = (q) arrayList.get(indexOf);
                qVar.getClass();
                arrayList2.add(qVar.f6874a);
                if (this.f6887e0.contains(i9) && uArr[i8] == null) {
                    uArr[i8] = new S(this, indexOf, 4);
                    zArr2[i8] = true;
                }
            }
            i8++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            q qVar2 = (q) arrayList.get(i10);
            if (!arrayList2.contains(qVar2.f6874a)) {
                qVar2.a();
            }
        }
        this.f6897o0 = true;
        if (j != 0) {
            this.f6890h0 = j;
            this.f6891i0 = j;
            this.f6892j0 = j;
        }
        z();
        return j;
    }

    @Override // e1.W
    public final long k() {
        return o();
    }

    @Override // e1.InterfaceC0958x
    public final long l() {
        if (this.f6894l0) {
            this.f6894l0 = false;
            return 0L;
        }
        return -9223372036854775807L;
    }

    @Override // e1.InterfaceC0958x
    public final b0 m() {
        K0.a.j(this.f6896n0);
        e0 e0Var = this.f6887e0;
        e0Var.getClass();
        return new b0((W[]) e0Var.toArray(new W[0]));
    }

    @Override // e1.W
    public final boolean n(Q q2) {
        return d();
    }

    @Override // e1.W
    public final long o() {
        if (!this.f6893k0) {
            ArrayList arrayList = this.f6886e;
            if (!arrayList.isEmpty()) {
                long j = this.f6890h0;
                if (j != -9223372036854775807L) {
                    return j;
                }
                boolean z7 = true;
                long j8 = Long.MAX_VALUE;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    q qVar = (q) arrayList.get(i7);
                    if (!qVar.f6877d) {
                        j8 = Math.min(j8, qVar.f6876c.o());
                        z7 = false;
                    }
                }
                if (z7 || j8 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j8;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // e1.InterfaceC0958x
    public final void p() {
        IOException iOException = this.f6888f0;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override // e1.InterfaceC0958x
    public final long q(long j) {
        boolean z7;
        if (o() == 0 && !this.q0) {
            this.f6892j0 = j;
            return j;
        }
        r(j);
        this.f6890h0 = j;
        if (this.f6891i0 != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            C0436m c0436m = this.f6885d;
            int i7 = c0436m.f6862j0;
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f6891i0 = j;
                    c0436m.m(j);
                    return j;
                }
                throw new IllegalStateException();
            }
            return j;
        }
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f6886e;
            if (i8 < arrayList.size()) {
                if (!((q) arrayList.get(i8)).f6876c.G(j, false)) {
                    this.f6891i0 = j;
                    if (this.f6893k0) {
                        for (int i9 = 0; i9 < this.f6886e.size(); i9++) {
                            q qVar = (q) this.f6886e.get(i9);
                            K0.a.j(qVar.f6877d);
                            qVar.f6877d = false;
                            w(qVar.f);
                            qVar.b();
                        }
                        if (this.q0) {
                            this.f6885d.n(K0.x.Z(j));
                        } else {
                            this.f6885d.m(j);
                        }
                    } else {
                        this.f6885d.m(j);
                    }
                    for (int i10 = 0; i10 < this.f6886e.size(); i10++) {
                        q qVar2 = (q) this.f6886e.get(i10);
                        if (!qVar2.f6877d) {
                            C0430g c0430g = qVar2.f6874a.f6871b.f6806Y;
                            c0430g.getClass();
                            synchronized (c0430g.f6820e) {
                                c0430g.f6824k = true;
                            }
                            qVar2.f6876c.D(false);
                            qVar2.f6876c.f10747t = j;
                        }
                    }
                    return j;
                }
                i8++;
            } else {
                return j;
            }
        }
    }

    @Override // e1.InterfaceC0958x
    public final void r(long j) {
        if (this.f6891i0 != -9223372036854775807L) {
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f6886e;
            if (i7 < arrayList.size()) {
                q qVar = (q) arrayList.get(i7);
                if (!qVar.f6877d) {
                    qVar.f6876c.i(j, true);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void z() {
        ArrayList arrayList;
        boolean z7;
        boolean z8 = true;
        int i7 = 0;
        while (true) {
            arrayList = this.f;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (((p) arrayList.get(i7)).f6872c != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 &= z7;
            i7++;
        }
        if (z8 && this.f6897o0) {
            C0436m c0436m = this.f6885d;
            c0436m.f6856e.addAll(arrayList);
            c0436m.g();
        }
    }

    @Override // e1.W
    public final void t(long j) {
    }

    @Override // e1.InterfaceC0958x
    public final long c(long j, l0 l0Var) {
        return j;
    }
}
