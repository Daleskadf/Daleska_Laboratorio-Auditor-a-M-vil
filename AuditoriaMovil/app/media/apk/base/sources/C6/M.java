package c6;

import a6.AbstractC0482k;
import a6.C0489s;
/* loaded from: classes.dex */
public final class M extends S {
    public final D1 j;

    /* renamed from: k  reason: collision with root package name */
    public final C0489s f8498k = C0489s.b();

    /* renamed from: l  reason: collision with root package name */
    public final AbstractC0482k[] f8499l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ N f8500m;

    public M(N n7, D1 d12, AbstractC0482k[] abstractC0482kArr) {
        this.f8500m = n7;
        this.j = d12;
        this.f8499l = abstractC0482kArr;
    }

    @Override // c6.S, c6.InterfaceC0711v
    public final void d(C0692o0 c0692o0) {
        if (Boolean.TRUE.equals(this.j.f8438a.f)) {
            c0692o0.f8937b.add("wait_for_ready");
        }
        super.d(c0692o0);
    }

    @Override // c6.S, c6.InterfaceC0711v
    public final void i(a6.o0 o0Var) {
        super.i(o0Var);
        synchronized (this.f8500m.f8505b) {
            try {
                N n7 = this.f8500m;
                if (n7.f8509g != null) {
                    boolean remove = n7.f8511i.remove(this);
                    if (!this.f8500m.h() && remove) {
                        N n8 = this.f8500m;
                        n8.f8507d.b(n8.f);
                        N n9 = this.f8500m;
                        if (n9.j != null) {
                            n9.f8507d.b(n9.f8509g);
                            this.f8500m.f8509g = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8500m.f8507d.a();
    }

    @Override // c6.S
    public final void q(a6.o0 o0Var) {
        for (AbstractC0482k abstractC0482k : this.f8499l) {
            abstractC0482k.m(o0Var);
        }
    }
}
