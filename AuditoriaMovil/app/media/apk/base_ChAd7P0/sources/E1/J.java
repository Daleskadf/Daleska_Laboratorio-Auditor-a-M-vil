package e1;

import H0.C0140u;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import z1.C2067b;
/* loaded from: classes.dex */
public final class J implements i1.k {

    /* renamed from: Y  reason: collision with root package name */
    public volatile boolean f10644Y;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f10647b;

    /* renamed from: c  reason: collision with root package name */
    public final M0.B f10648c;

    /* renamed from: d  reason: collision with root package name */
    public final R1.j f10649d;

    /* renamed from: e  reason: collision with root package name */
    public final M f10650e;

    /* renamed from: e0  reason: collision with root package name */
    public long f10651e0;
    public final A.n f;

    /* renamed from: g0  reason: collision with root package name */
    public m1.G f10653g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f10654h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ M f10655i0;

    /* renamed from: X  reason: collision with root package name */
    public final C0140u f10643X = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public boolean f10645Z = true;

    /* renamed from: a  reason: collision with root package name */
    public final long f10646a = r.f10832b.getAndIncrement();

    /* renamed from: f0  reason: collision with root package name */
    public M0.l f10652f0 = a(0);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, H0.u] */
    public J(M m7, Uri uri, M0.h hVar, R1.j jVar, M m8, A.n nVar) {
        this.f10655i0 = m7;
        this.f10647b = uri;
        this.f10648c = new M0.B(hVar);
        this.f10649d = jVar;
        this.f10650e = m8;
        this.f = nVar;
    }

    public final M0.l a(long j) {
        Collections.emptyMap();
        this.f10655i0.getClass();
        Map map = M.f10660I0;
        Uri uri = this.f10647b;
        K0.a.l(uri, "The uri must be set.");
        return new M0.l(uri, 1, null, map, j, -1L, null, 6);
    }

    @Override // i1.k
    public final void b() {
        M0.h hVar;
        m1.o oVar;
        int i7;
        int i8 = 0;
        while (i8 == 0 && !this.f10644Y) {
            try {
                long j = this.f10643X.f1902a;
                M0.l a7 = a(j);
                this.f10652f0 = a7;
                long e7 = this.f10648c.e(a7);
                if (this.f10644Y) {
                    if (i8 != 1 && this.f10649d.t0() != -1) {
                        this.f10643X.f1902a = this.f10649d.t0();
                    }
                    m5.d.a(this.f10648c);
                    return;
                }
                if (e7 != -1) {
                    e7 += j;
                    M m7 = this.f10655i0;
                    m7.f10684k0.post(new H(m7, 0));
                }
                long j8 = e7;
                this.f10655i0.f10686m0 = C2067b.a(this.f10648c.f3131a.j());
                M0.B b5 = this.f10648c;
                C2067b c2067b = this.f10655i0.f10686m0;
                if (c2067b != null && (i7 = c2067b.f) != -1) {
                    hVar = new C0952q(b5, i7, this);
                    M m8 = this.f10655i0;
                    m8.getClass();
                    m1.G A7 = m8.A(new L(0, true));
                    this.f10653g0 = A7;
                    A7.c(M.f10661J0);
                } else {
                    hVar = b5;
                }
                long j9 = j;
                this.f10649d.D0(hVar, this.f10647b, this.f10648c.f3131a.j(), j, j8, this.f10650e);
                if (this.f10655i0.f10686m0 != null && (oVar = (m1.o) this.f10649d.f4683c) != null) {
                    m1.o c8 = oVar.c();
                    if (c8 instanceof F1.d) {
                        ((F1.d) c8).f1143r = true;
                    }
                }
                if (this.f10645Z) {
                    R1.j jVar = this.f10649d;
                    long j10 = this.f10651e0;
                    m1.o oVar2 = (m1.o) jVar.f4683c;
                    oVar2.getClass();
                    oVar2.a(j9, j10);
                    this.f10645Z = false;
                }
                while (true) {
                    long j11 = j9;
                    while (i8 == 0 && !this.f10644Y) {
                        try {
                            A.n nVar = this.f;
                            synchronized (nVar) {
                                while (!nVar.f29a) {
                                    nVar.wait();
                                }
                            }
                            R1.j jVar2 = this.f10649d;
                            C0140u c0140u = this.f10643X;
                            m1.o oVar3 = (m1.o) jVar2.f4683c;
                            oVar3.getClass();
                            m1.l lVar = (m1.l) jVar2.f4684d;
                            lVar.getClass();
                            i8 = oVar3.i(lVar, c0140u);
                            j9 = this.f10649d.t0();
                            if (j9 > this.f10655i0.f10672Z + j11) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f.a();
                    M m9 = this.f10655i0;
                    m9.f10684k0.post(m9.f10683j0);
                }
                if (i8 == 1) {
                    i8 = 0;
                } else if (this.f10649d.t0() != -1) {
                    this.f10643X.f1902a = this.f10649d.t0();
                }
                m5.d.a(this.f10648c);
            } catch (Throwable th) {
                if (i8 != 1 && this.f10649d.t0() != -1) {
                    this.f10643X.f1902a = this.f10649d.t0();
                }
                m5.d.a(this.f10648c);
                throw th;
            }
        }
    }

    @Override // i1.k
    public final void k() {
        this.f10644Y = true;
    }
}
