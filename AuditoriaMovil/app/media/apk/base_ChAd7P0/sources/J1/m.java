package J1;

import A3.I;
import A3.K;
import A3.e0;
import H0.C0140u;
import android.util.SparseArray;
import f5.C0993a;
import java.util.List;
import m1.p;
import m1.q;
/* loaded from: classes.dex */
public final class m implements m1.o {

    /* renamed from: a  reason: collision with root package name */
    public final m1.o f2379a;

    /* renamed from: b  reason: collision with root package name */
    public final C0993a f2380b;

    /* renamed from: c  reason: collision with root package name */
    public V2.k f2381c;

    public m(m1.o oVar, C0993a c0993a) {
        this.f2379a = oVar;
        this.f2380b = c0993a;
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        V2.k kVar = this.f2381c;
        if (kVar != null) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) kVar.f5967d;
                if (i7 >= sparseArray.size()) {
                    break;
                }
                l lVar = ((o) sparseArray.valueAt(i7)).f2390g;
                if (lVar != null) {
                    lVar.a();
                }
                i7++;
            }
        }
        this.f2379a.a(j, j8);
    }

    @Override // m1.o
    public final m1.o c() {
        return this.f2379a;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        return this.f2379a.e(pVar);
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(q qVar) {
        V2.k kVar = new V2.k(qVar, this.f2380b);
        this.f2381c = kVar;
        this.f2379a.g(kVar);
    }

    @Override // m1.o
    public final int i(p pVar, C0140u c0140u) {
        return this.f2379a.i(pVar, c0140u);
    }

    @Override // m1.o
    public final void release() {
        this.f2379a.release();
    }
}
