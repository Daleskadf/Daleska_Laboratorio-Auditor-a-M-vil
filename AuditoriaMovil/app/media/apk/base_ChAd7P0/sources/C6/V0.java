package c6;

import a6.AbstractC0478g;
import a6.AbstractC0479h;
import a6.C0476e;
import a6.C0489s;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class V0 extends AbstractC0478g {

    /* renamed from: e  reason: collision with root package name */
    public final String f8606e;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Z0 f8607g;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f8605d = new AtomicReference(Z0.f8671m0);
    public final S0 f = new S0(this);

    public V0(Z0 z02, String str) {
        this.f8607g = z02;
        G.i.j(str, "authority");
        this.f8606e = str;
    }

    @Override // a6.AbstractC0478g
    public final AbstractC0479h n(Q0.A a7, C0476e c0476e) {
        AtomicReference atomicReference = this.f8605d;
        Object obj = atomicReference.get();
        J0 j02 = Z0.f8671m0;
        if (obj != j02) {
            return s(a7, c0476e);
        }
        Z0 z02 = this.f8607g;
        z02.f8714p.execute(new T0(this, 2));
        if (atomicReference.get() != j02) {
            return s(a7, c0476e);
        }
        if (z02.f8682J.get()) {
            return new C0648I(2);
        }
        U0 u02 = new U0(this, C0489s.b(), a7, c0476e);
        z02.f8714p.execute(new RunnableC0646G(this, u02));
        return u02;
    }

    public final AbstractC0479h s(Q0.A a7, C0476e c0476e) {
        a6.F f = (a6.F) this.f8605d.get();
        S0 s02 = this.f;
        if (f == null) {
            return s02.n(a7, c0476e);
        }
        if (f instanceof C0663e1) {
            C0666f1 c0666f1 = ((C0663e1) f).f8817b;
            c0666f1.getClass();
            C0660d1 c0660d1 = (C0660d1) c0666f1.f8824b.get((String) a7.f4138d);
            if (c0660d1 == null) {
                c0660d1 = (C0660d1) c0666f1.f8825c.get((String) a7.f4139e);
            }
            if (c0660d1 == null) {
                c0660d1 = c0666f1.f8823a;
            }
            if (c0660d1 != null) {
                c0476e = c0476e.c(C0660d1.f8804g, c0660d1);
            }
            return s02.n(a7, c0476e);
        }
        return new O0(f, s02, this.f8607g.f8709k, a7, c0476e);
    }

    public final void t(a6.F f) {
        LinkedHashSet<U0> linkedHashSet;
        AtomicReference atomicReference = this.f8605d;
        a6.F f4 = (a6.F) atomicReference.get();
        atomicReference.set(f);
        if (f4 == Z0.f8671m0 && (linkedHashSet = this.f8607g.f8677E) != null) {
            for (U0 u02 : linkedHashSet) {
                u02.i();
            }
        }
    }
}
