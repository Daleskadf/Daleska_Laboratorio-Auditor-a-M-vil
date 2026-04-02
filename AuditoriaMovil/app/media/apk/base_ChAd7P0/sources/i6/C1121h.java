package i6;

import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0473b;
import a6.EnumC0486o;
import a6.L;
import a6.O;
import a6.P;
import a6.Q;
/* renamed from: i6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1121h extends AbstractC1114a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f11520d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f11521e;

    public /* synthetic */ C1121h(Object obj, int i7) {
        this.f11520d = i7;
        this.f11521e = obj;
    }

    @Override // i6.AbstractC1114a, a6.AbstractC0478g
    public AbstractC0471A g(L l8) {
        switch (this.f11520d) {
            case 0:
                P p7 = (P) l8.c();
                AbstractC0471A g3 = super.g(l8);
                if (p7 != null) {
                    C0473b c8 = g3.c();
                    if (c8.f7116a.get(Q.f7101d) == null) {
                        return new C1120g(g3, p7);
                    }
                    return g3;
                }
                return g3;
            default:
                return super.g(l8);
        }
    }

    @Override // i6.AbstractC1114a, a6.AbstractC0478g
    public void r(EnumC0486o enumC0486o, O o7) {
        switch (this.f11520d) {
            case 1:
                C1122i c1122i = (C1122i) this.f11521e;
                if (c1122i.f11527g.f.containsKey(c1122i.f11522a)) {
                    c1122i.f11525d = enumC0486o;
                    c1122i.f11526e = o7;
                    if (!c1122i.f) {
                        w wVar = c1122i.f11527g;
                        if (!wVar.f11571h) {
                            if (enumC0486o == EnumC0486o.IDLE) {
                                c1122i.f11523b.e();
                            }
                            wVar.j();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.r(enumC0486o, o7);
                return;
        }
    }

    @Override // i6.AbstractC1114a
    public final AbstractC0478g s() {
        switch (this.f11520d) {
            case 0:
                return (AbstractC0478g) this.f11521e;
            default:
                return ((C1122i) this.f11521e).f11527g.f11570g;
        }
    }
}
