package r4;

import H4.n1;
import H4.p1;
import q4.s;
/* loaded from: classes.dex */
public final class k implements p {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f15505a;

    public k(p1 p1Var) {
        boolean z7;
        if (!s.h(p1Var) && !s.g(p1Var)) {
            z7 = false;
        } else {
            z7 = true;
        }
        m5.d.i("NumericIncrementTransformOperation expects a NumberValue operand", z7, new Object[0]);
        this.f15505a = p1Var;
    }

    @Override // r4.p
    public final p1 a(p1 p1Var) {
        if (!s.h(p1Var) && !s.g(p1Var)) {
            n1 T7 = p1.T();
            T7.h(0L);
            return (p1) T7.b();
        }
        return p1Var;
    }

    @Override // r4.p
    public final p1 c(p1 p1Var, U3.p pVar) {
        long M7;
        p1 a7 = a(p1Var);
        if (s.h(a7)) {
            p1 p1Var2 = this.f15505a;
            if (s.h(p1Var2)) {
                long M8 = a7.M();
                if (s.g(p1Var2)) {
                    M7 = (long) p1Var2.K();
                } else if (s.h(p1Var2)) {
                    M7 = p1Var2.M();
                } else {
                    m5.d.g("Expected 'operand' to be of Number type, but was " + p1Var2.getClass().getCanonicalName(), new Object[0]);
                    throw null;
                }
                long j = M8 + M7;
                if (((M7 ^ j) & (M8 ^ j)) < 0) {
                    if (j >= 0) {
                        j = Long.MIN_VALUE;
                    } else {
                        j = Long.MAX_VALUE;
                    }
                }
                n1 T7 = p1.T();
                T7.h(j);
                return (p1) T7.b();
            }
        }
        if (s.h(a7)) {
            double d7 = d() + a7.M();
            n1 T8 = p1.T();
            T8.g(d7);
            return (p1) T8.b();
        }
        m5.d.i("Expected NumberValue to be of type DoubleValue, but was ", s.g(a7), p1Var.getClass().getCanonicalName());
        double d8 = d() + a7.K();
        n1 T9 = p1.T();
        T9.g(d8);
        return (p1) T9.b();
    }

    public final double d() {
        p1 p1Var = this.f15505a;
        if (s.g(p1Var)) {
            return p1Var.K();
        }
        if (s.h(p1Var)) {
            return p1Var.M();
        }
        m5.d.g("Expected 'operand' to be of Number type, but was " + p1Var.getClass().getCanonicalName(), new Object[0]);
        throw null;
    }

    @Override // r4.p
    public final p1 b(p1 p1Var, p1 p1Var2) {
        return p1Var2;
    }
}
