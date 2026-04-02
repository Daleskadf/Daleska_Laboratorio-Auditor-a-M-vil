package H1;

import A3.I;
import A3.K;
import A3.e0;
import H0.J;
import K0.x;
import java.util.List;
import m1.AbstractC1428b;
import m1.l;
import m1.o;
import m1.p;
import m1.q;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a  reason: collision with root package name */
    public q f1933a;

    /* renamed from: b  reason: collision with root package name */
    public i f1934b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1935c;

    @Override // m1.o
    public final void a(long j, long j8) {
        i iVar = this.f1934b;
        if (iVar != null) {
            e eVar = iVar.f1950a;
            f fVar = (f) eVar.f1939d;
            fVar.f1941a = 0;
            fVar.f1942b = 0L;
            fVar.f1943c = 0;
            fVar.f1944d = 0;
            fVar.f1945e = 0;
            ((K0.q) eVar.f1940e).D(0);
            eVar.f1936a = -1;
            eVar.f1938c = false;
            if (j == 0) {
                iVar.d(!iVar.f1959l);
            } else if (iVar.f1956h != 0) {
                long j9 = (iVar.f1957i * j8) / 1000000;
                iVar.f1954e = j9;
                g gVar = iVar.f1953d;
                int i7 = x.f2529a;
                gVar.f(j9);
                iVar.f1956h = 2;
            }
        }
    }

    public final boolean b(l lVar) {
        boolean z7;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f1941a & 2) == 2) {
            int min = Math.min(fVar.f1945e, 8);
            K0.q qVar = new K0.q(min);
            lVar.q(qVar.f2513a, 0, min, false);
            qVar.G(0);
            if (qVar.a() >= 5 && qVar.u() == 127 && qVar.w() == 1179402563) {
                this.f1934b = new i();
            } else {
                qVar.G(0);
                try {
                    z7 = AbstractC1428b.w(1, qVar, true);
                } catch (J unused) {
                    z7 = false;
                }
                if (z7) {
                    this.f1934b = new i();
                } else {
                    qVar.G(0);
                    if (h.e(qVar, h.f1947o)) {
                        this.f1934b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        try {
            return b((l) pVar);
        } catch (J unused) {
            return false;
        }
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(q qVar) {
        this.f1933a = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Type inference failed for: r3v2, types: [H1.g, java.lang.Object] */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r21, H0.C0140u r22) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.d.i(m1.p, H0.u):int");
    }

    @Override // m1.o
    public final void release() {
    }
}
