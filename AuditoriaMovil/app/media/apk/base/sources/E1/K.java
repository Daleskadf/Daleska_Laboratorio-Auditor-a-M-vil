package e1;

import java.io.IOException;
/* loaded from: classes.dex */
public final class K implements U {

    /* renamed from: a  reason: collision with root package name */
    public final int f10656a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ M f10657b;

    public K(M m7, int i7) {
        this.f10657b = m7;
        this.f10656a = i7;
    }

    @Override // e1.U
    public final void a() {
        M m7 = this.f10657b;
        m7.f10687n0[this.f10656a].y();
        int w2 = m7.f10676d.w(m7.f10696x0);
        i1.n nVar = m7.f10679f0;
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
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // e1.U
    public final boolean b() {
        M m7 = this.f10657b;
        if (!m7.C() && m7.f10687n0[this.f10656a].w(m7.f10668G0)) {
            return true;
        }
        return false;
    }

    @Override // e1.U
    public final int g(M0.x xVar, N0.f fVar, int i7) {
        M m7 = this.f10657b;
        if (m7.C()) {
            return -3;
        }
        int i8 = this.f10656a;
        m7.w(i8);
        int B7 = m7.f10687n0[i8].B(xVar, fVar, i7, m7.f10668G0);
        if (B7 == -3) {
            m7.z(i8);
        }
        return B7;
    }

    @Override // e1.U
    public final int h(long j) {
        M m7 = this.f10657b;
        if (m7.C()) {
            return 0;
        }
        int i7 = this.f10656a;
        m7.w(i7);
        T t7 = m7.f10687n0[i7];
        int t8 = t7.t(j, m7.f10668G0);
        t7.H(t8);
        if (t8 == 0) {
            m7.z(i7);
            return t8;
        }
        return t8;
    }
}
