package i6;

import a6.AbstractC0471A;
import a6.AbstractC0478g;
import a6.C0493w;
import a6.EnumC0486o;
import a6.L;
import a6.O;
import a6.Q;
import c6.A1;
import java.util.List;
/* renamed from: i6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117d extends AbstractC1114a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f11505d = 0;

    /* renamed from: e  reason: collision with root package name */
    public Object f11506e;
    public final /* synthetic */ Q f;

    public C1117d(C1118e c1118e) {
        this.f = c1118e;
    }

    @Override // i6.AbstractC1114a, a6.AbstractC0478g
    public AbstractC0471A g(L l8) {
        switch (this.f11505d) {
            case 1:
                C1132s c1132s = (C1132s) this.f;
                C1131r c1131r = new C1131r(c1132s, l8, (C1121h) this.f11506e);
                List list = l8.f7088b;
                if (C1132s.g(list) && c1132s.f.containsKey(((C0493w) list.get(0)).f7224a.get(0))) {
                    C1124k c1124k = (C1124k) c1132s.f.get(((C0493w) list.get(0)).f7224a.get(0));
                    c1124k.a(c1131r);
                    if (c1124k.f11533d != null) {
                        c1131r.r();
                    }
                }
                return c1131r;
            default:
                return super.g(l8);
        }
    }

    @Override // i6.AbstractC1114a, a6.AbstractC0478g
    public final void r(EnumC0486o enumC0486o, O o7) {
        boolean z7;
        switch (this.f11505d) {
            case 0:
                Q q2 = (Q) this.f11506e;
                C1118e c1118e = (C1118e) this.f;
                Q q7 = c1118e.f11511k;
                if (q2 == q7) {
                    G.i.o("there's pending lb while current lb has been out of READY", c1118e.f11514n);
                    c1118e.f11512l = enumC0486o;
                    c1118e.f11513m = o7;
                    if (enumC0486o == EnumC0486o.READY) {
                        c1118e.h();
                        return;
                    }
                    return;
                } else if (q2 == c1118e.f11510i) {
                    if (enumC0486o == EnumC0486o.READY) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    c1118e.f11514n = z7;
                    if (!z7 && q7 != c1118e.f) {
                        c1118e.h();
                        return;
                    } else {
                        c1118e.f11508g.r(enumC0486o, o7);
                        return;
                    }
                } else {
                    return;
                }
            default:
                ((C1121h) this.f11506e).r(enumC0486o, new A1(o7));
                return;
        }
    }

    @Override // i6.AbstractC1114a
    public final AbstractC0478g s() {
        switch (this.f11505d) {
            case 0:
                return ((C1118e) this.f).f11508g;
            default:
                return (C1121h) this.f11506e;
        }
    }

    public C1117d(C1132s c1132s, AbstractC0478g abstractC0478g) {
        this.f = c1132s;
        this.f11506e = new C1121h(abstractC0478g, 0);
    }
}
