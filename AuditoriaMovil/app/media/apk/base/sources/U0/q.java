package U0;

import H0.C0135o;
import H0.C0137q;
import H0.G;
import H0.H;
import e1.T;
import java.util.Map;
/* loaded from: classes.dex */
public final class q extends T {

    /* renamed from: H  reason: collision with root package name */
    public final Map f5647H;

    /* renamed from: I  reason: collision with root package name */
    public C0135o f5648I;

    public q(i1.e eVar, T0.g gVar, T0.d dVar, Map map) {
        super(eVar, gVar, dVar);
        this.f5647H = map;
    }

    @Override // e1.T
    public final H0.r n(H0.r rVar) {
        C0135o c0135o;
        C0135o c0135o2 = this.f5648I;
        if (c0135o2 == null) {
            c0135o2 = rVar.f1890q;
        }
        if (c0135o2 != null && (c0135o = (C0135o) this.f5647H.get(c0135o2.f1829c)) != null) {
            c0135o2 = c0135o;
        }
        H h8 = rVar.f1884k;
        H h9 = null;
        if (h8 != null) {
            G[] gArr = h8.f1692a;
            int length = gArr.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    G g3 = gArr[i7];
                    if ((g3 instanceof A1.m) && "com.apple.streaming.transportStreamTimestamp".equals(((A1.m) g3).f71b)) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                if (length != 1) {
                    G[] gArr2 = new G[length - 1];
                    for (int i8 = 0; i8 < length; i8++) {
                        if (i8 != i7) {
                            gArr2[i8 < i7 ? i8 : i8 - 1] = gArr[i8];
                        }
                    }
                    h9 = new H(gArr2);
                }
            }
            if (c0135o2 == rVar.f1890q || h8 != rVar.f1884k) {
                C0137q a7 = rVar.a();
                a7.f1854p = c0135o2;
                a7.j = h8;
                rVar = new H0.r(a7);
            }
            return super.n(rVar);
        }
        h8 = h9;
        if (c0135o2 == rVar.f1890q) {
        }
        C0137q a72 = rVar.a();
        a72.f1854p = c0135o2;
        a72.j = h8;
        rVar = new H0.r(a72);
        return super.n(rVar);
    }
}
