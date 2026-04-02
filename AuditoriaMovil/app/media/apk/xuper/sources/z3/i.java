package z3;

import c3.k;
import java.math.BigDecimal;
import java.math.BigInteger;
import k3.c0;
/* loaded from: classes.dex */
public class i extends q {

    /* renamed from: a  reason: collision with root package name */
    public final float f20179a;

    public i(float f10) {
        this.f20179a = f10;
    }

    public static i A(float f10) {
        return new i(f10);
    }

    @Override // z3.b, c3.v
    public k.b a() {
        return k.b.FLOAT;
    }

    @Override // z3.v, c3.v
    public c3.n b() {
        return c3.n.VALUE_NUMBER_FLOAT;
    }

    @Override // z3.b, k3.n
    public final void d(c3.h hVar, c0 c0Var) {
        hVar.c0(this.f20179a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        if (Float.compare(this.f20179a, ((i) obj).f20179a) == 0) {
            return true;
        }
        return false;
    }

    @Override // k3.m
    public String g() {
        return f3.g.v(this.f20179a);
    }

    @Override // k3.m
    public BigInteger h() {
        return j().toBigInteger();
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f20179a);
    }

    @Override // k3.m
    public BigDecimal j() {
        return BigDecimal.valueOf(this.f20179a);
    }

    @Override // k3.m
    public double k() {
        return this.f20179a;
    }

    @Override // k3.m
    public Number t() {
        return Float.valueOf(this.f20179a);
    }

    @Override // z3.q
    public boolean v() {
        float f10 = this.f20179a;
        if (f10 >= -2.14748365E9f && f10 <= 2.14748365E9f) {
            return true;
        }
        return false;
    }

    @Override // z3.q
    public boolean w() {
        float f10 = this.f20179a;
        if (f10 >= -9.223372E18f && f10 <= 9.223372E18f) {
            return true;
        }
        return false;
    }

    @Override // z3.q
    public int x() {
        return (int) this.f20179a;
    }

    @Override // z3.q
    public boolean y() {
        if (!Float.isNaN(this.f20179a) && !Float.isInfinite(this.f20179a)) {
            return false;
        }
        return true;
    }

    @Override // z3.q
    public long z() {
        return this.f20179a;
    }
}
