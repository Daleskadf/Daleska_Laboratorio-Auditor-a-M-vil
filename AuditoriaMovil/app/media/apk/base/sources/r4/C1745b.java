package r4;

import H4.C0158f;
import H4.C0160g;
import H4.n1;
import H4.p1;
import com.google.protobuf.G;
import com.google.protobuf.I;
import q4.s;
/* renamed from: r4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745b extends AbstractC1746c {
    @Override // r4.AbstractC1746c
    public final p1 d(p1 p1Var) {
        C0158f B7;
        if (s.f(p1Var)) {
            C0160g G2 = p1Var.G();
            G g3 = (G) G2.j(I.NEW_BUILDER);
            if (!g3.f10005a.equals(G2)) {
                g3.d();
                G.e(g3.f10006b, G2);
            }
            B7 = (C0158f) g3;
        } else {
            B7 = C0160g.B();
        }
        for (p1 p1Var2 : this.f15489a) {
            if (!s.d(B7, p1Var2)) {
                B7.d();
                C0160g.v((C0160g) B7.f10006b, p1Var2);
            }
        }
        n1 T7 = p1.T();
        T7.f(B7);
        return (p1) T7.b();
    }
}
