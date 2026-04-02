package D;

import a.AbstractC0412a;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C0498a0;
import androidx.camera.core.impl.C0505g;
import h3.AbstractC1079a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import w.C1907Q;
import w.C1908S;
import w.C1928m;
import w.C1936u;
/* loaded from: classes.dex */
public final /* synthetic */ class H implements androidx.camera.core.impl.l0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f617a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f618b;

    public /* synthetic */ H(Object obj, int i7) {
        this.f617a = i7;
        this.f618b = obj;
    }

    @Override // androidx.camera.core.impl.l0
    public final void a(androidx.camera.core.impl.o0 o0Var, androidx.camera.core.impl.m0 m0Var) {
        Object obj = this.f618b;
        switch (this.f617a) {
            case 0:
                M m7 = (M) obj;
                if (m7.b() != null) {
                    AbstractC1079a.e();
                    androidx.camera.core.impl.k0 k0Var = m7.f628t;
                    if (k0Var != null) {
                        k0Var.b();
                        m7.f628t = null;
                    }
                    t0 t0Var = m7.f627s;
                    if (t0Var != null) {
                        t0Var.a();
                        m7.f627s = null;
                    }
                    m7.f623o.d();
                    m7.d();
                    C0505g c0505g = m7.f804g;
                    c0505g.getClass();
                    androidx.camera.core.impl.j0 B7 = m7.B((androidx.camera.core.impl.M) m7.f, c0505g);
                    m7.f626r = B7;
                    Object[] objArr = {B7.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    m7.A(DesugarCollections.unmodifiableList(arrayList));
                    m7.n();
                    return;
                }
                return;
            case 1:
                X x7 = (X) obj;
                if (x7.b() != null) {
                    E.f fVar = x7.f674u;
                    fVar.getClass();
                    AbstractC1079a.e();
                    fVar.f927d = true;
                    x7.B(true);
                    C0505g c0505g2 = x7.f804g;
                    c0505g2.getClass();
                    androidx.camera.core.impl.j0 C7 = x7.C(x7.d(), (androidx.camera.core.impl.N) x7.f, c0505g2);
                    x7.f672s = C7;
                    Object[] objArr2 = {C7.c()};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList2.add(obj3);
                    x7.A(DesugarCollections.unmodifiableList(arrayList2));
                    x7.n();
                    E.f fVar2 = x7.f674u;
                    fVar2.getClass();
                    AbstractC1079a.e();
                    fVar2.f927d = false;
                    fVar2.c();
                    return;
                }
                return;
            case 2:
                j0 j0Var = (j0) obj;
                if (j0Var.b() != null) {
                    j0Var.D((C0498a0) j0Var.f, j0Var.f804g);
                    j0Var.n();
                    return;
                }
                return;
            case 3:
                Iterator it = ((androidx.camera.core.impl.n0) obj).f7649l.iterator();
                while (it.hasNext()) {
                    ((androidx.camera.core.impl.l0) it.next()).a(o0Var, m0Var);
                }
                return;
            default:
                C1908S c1908s = (C1908S) obj;
                c1908s.f16113b = c1908s.a();
                C1928m c1928m = (C1928m) c1908s.f16116e;
                if (c1928m != null) {
                    C1936u c1936u = c1928m.f16244b;
                    c1936u.getClass();
                    try {
                        if (((Boolean) AbstractC0412a.s(new C1928m(c1936u, 2)).f5535b.get()).booleanValue()) {
                            C1908S c1908s2 = c1936u.f16291s0;
                            c1936u.f16275c.execute(new N.f(c1936u, C1936u.w(c1908s2), (androidx.camera.core.impl.o0) c1908s2.f16113b, (C1907Q) c1908s2.f16114c, null, Collections.singletonList(A0.METERING_REPEATING), 2));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e7) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e7);
                    }
                }
                return;
        }
    }
}
