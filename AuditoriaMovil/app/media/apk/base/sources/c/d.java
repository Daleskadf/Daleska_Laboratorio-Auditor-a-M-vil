package C;

import G.k;
import H.i;
import K0.h;
import K0.x;
import O0.H;
import Q0.C0276m;
import X5.E;
import a.AbstractC0412a;
import kotlin.jvm.internal.j;
import n4.C1533t;
import w.C1925j;
import w.C1936u;
import w.EnumC1934s;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f417b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f418c;

    public /* synthetic */ d(Object obj, boolean z7, int i7) {
        this.f416a = i7;
        this.f418c = obj;
        this.f417b = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f416a) {
            case 0:
                e eVar = (e) this.f418c;
                boolean z7 = eVar.f420b;
                boolean z8 = this.f417b;
                if (z7 != z8) {
                    eVar.f420b = z8;
                    if (z8) {
                        if (eVar.f421c) {
                            C1925j c1925j = (C1925j) eVar.f422d;
                            c1925j.getClass();
                            i.d(AbstractC0412a.s(new E(c1925j, 24))).a(new b(eVar, 0), (k) eVar.f423e);
                            eVar.f421c = false;
                            return;
                        }
                        return;
                    }
                    Exception exc = new Exception("The camera control has became inactive.");
                    U.i iVar = (U.i) eVar.f425h;
                    if (iVar != null) {
                        iVar.b(exc);
                        eVar.f425h = null;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C0276m c0276m = (C0276m) this.f418c;
                c0276m.getClass();
                int i7 = x.f2529a;
                H h8 = c0276m.f4297c.f3482a;
                boolean z9 = h8.f3504R0;
                final boolean z10 = this.f417b;
                if (z9 != z10) {
                    h8.f3504R0 = z10;
                    h8.f3523g0.e(23, new h() { // from class: O0.B
                        @Override // K0.h
                        public final void invoke(Object obj) {
                            ((H0.N) obj).k(z10);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((C1533t) this.f418c).f14365g.f15271g.f8247b = this.f417b;
                return;
            case 3:
                r5.b this$0 = (r5.b) this.f418c;
                j.e(this$0, "this$0");
                L5.h hVar = this$0.f15521Y;
                if (hVar != null) {
                    hVar.c(Boolean.valueOf(this.f417b));
                    return;
                }
                return;
            default:
                C1936u c1936u = (C1936u) this.f418c;
                boolean z11 = this.f417b;
                c1936u.f16297y0 = z11;
                if (z11 && c1936u.f16277e == EnumC1934s.PENDING_OPEN) {
                    c1936u.I(false);
                    return;
                }
                return;
        }
    }
}
