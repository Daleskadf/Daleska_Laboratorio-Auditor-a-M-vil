package r4;

import H4.C0159f0;
import H4.C0163h0;
import H4.n1;
import H4.p1;
import com.google.protobuf.M0;
import com.google.protobuf.N0;
import h3.AbstractC1079a;
/* loaded from: classes.dex */
public final class n implements p {

    /* renamed from: a  reason: collision with root package name */
    public static final n f15511a = new Object();

    @Override // r4.p
    public final p1 a(p1 p1Var) {
        return null;
    }

    @Override // r4.p
    public final p1 c(p1 p1Var, U3.p pVar) {
        n1 T7 = p1.T();
        T7.k("server_timestamp");
        n1 T8 = p1.T();
        M0 A7 = N0.A();
        A7.f(pVar.f5765a);
        A7.d();
        N0.w((N0) A7.f10006b, pVar.f5766b);
        T8.l(A7);
        C0159f0 B7 = C0163h0.B();
        B7.f((p1) T7.b(), "__type__");
        B7.f((p1) T8.b(), "__local_write_time__");
        if (AbstractC1079a.o(p1Var)) {
            p1Var = AbstractC1079a.n(p1Var);
        }
        if (p1Var != null) {
            B7.f(p1Var, "__previous_value__");
        }
        n1 T9 = p1.T();
        T9.i(B7);
        return (p1) T9.b();
    }

    @Override // r4.p
    public final p1 b(p1 p1Var, p1 p1Var2) {
        return p1Var2;
    }
}
