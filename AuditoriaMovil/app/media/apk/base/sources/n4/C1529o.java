package n4;

import H4.p1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: n4.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1529o extends AbstractC1530p {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1528n f14349a;

    /* renamed from: b  reason: collision with root package name */
    public final p1 f14350b;

    /* renamed from: c  reason: collision with root package name */
    public final q4.k f14351c;

    public C1529o(q4.k kVar, EnumC1528n enumC1528n, p1 p1Var) {
        this.f14351c = kVar;
        this.f14349a = enumC1528n;
        this.f14350b = p1Var;
    }

    public static C1529o e(q4.k kVar, EnumC1528n enumC1528n, p1 p1Var) {
        boolean z7;
        if (kVar.equals(q4.k.f15360b)) {
            if (enumC1528n == EnumC1528n.IN) {
                return new v(kVar, p1Var, 0);
            }
            if (enumC1528n == EnumC1528n.NOT_IN) {
                return new v(kVar, p1Var, 1);
            }
            if (enumC1528n != EnumC1528n.ARRAY_CONTAINS && enumC1528n != EnumC1528n.ARRAY_CONTAINS_ANY) {
                z7 = true;
            } else {
                z7 = false;
            }
            m5.d.i(enumC1528n.toString() + "queries don't make sense on document keys", z7, new Object[0]);
            return new v(kVar, enumC1528n, p1Var);
        }
        EnumC1528n enumC1528n2 = EnumC1528n.ARRAY_CONTAINS;
        if (enumC1528n == enumC1528n2) {
            return new C1515a(kVar, enumC1528n2, p1Var, 1);
        }
        EnumC1528n enumC1528n3 = EnumC1528n.IN;
        if (enumC1528n == enumC1528n3) {
            C1529o c1529o = new C1529o(kVar, enumC1528n3, p1Var);
            m5.d.i("InFilter expects an ArrayValue", q4.s.f(p1Var), new Object[0]);
            return c1529o;
        }
        EnumC1528n enumC1528n4 = EnumC1528n.ARRAY_CONTAINS_ANY;
        if (enumC1528n == enumC1528n4) {
            C1515a c1515a = new C1515a(kVar, enumC1528n4, p1Var, 0);
            m5.d.i("ArrayContainsAnyFilter expects an ArrayValue", q4.s.f(p1Var), new Object[0]);
            return c1515a;
        }
        EnumC1528n enumC1528n5 = EnumC1528n.NOT_IN;
        if (enumC1528n == enumC1528n5) {
            C1515a c1515a2 = new C1515a(kVar, enumC1528n5, p1Var, 2);
            m5.d.i("NotInFilter expects an ArrayValue", q4.s.f(p1Var), new Object[0]);
            return c1515a2;
        }
        return new C1529o(kVar, enumC1528n, p1Var);
    }

    @Override // n4.AbstractC1530p
    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14351c.c());
        sb.append(this.f14349a.toString());
        p1 p1Var = q4.s.f15373a;
        StringBuilder sb2 = new StringBuilder();
        q4.s.a(sb2, this.f14350b);
        sb.append(sb2.toString());
        return sb.toString();
    }

    @Override // n4.AbstractC1530p
    public final List b() {
        return Collections.singletonList(this);
    }

    @Override // n4.AbstractC1530p
    public final List c() {
        return Collections.singletonList(this);
    }

    @Override // n4.AbstractC1530p
    public boolean d(q4.n nVar) {
        p1 f = nVar.f15366e.f(this.f14351c);
        EnumC1528n enumC1528n = this.f14349a;
        EnumC1528n enumC1528n2 = EnumC1528n.NOT_EQUAL;
        p1 p1Var = this.f14350b;
        if (enumC1528n == enumC1528n2) {
            if (f == null || f.S() || !g(q4.s.b(f, p1Var))) {
                return false;
            }
            return true;
        } else if (f == null || q4.s.l(f) != q4.s.l(p1Var) || !g(q4.s.b(f, p1Var))) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1529o)) {
            return false;
        }
        C1529o c1529o = (C1529o) obj;
        if (this.f14349a != c1529o.f14349a || !this.f14351c.equals(c1529o.f14351c) || !this.f14350b.equals(c1529o.f14350b)) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        return Arrays.asList(EnumC1528n.LESS_THAN, EnumC1528n.LESS_THAN_OR_EQUAL, EnumC1528n.GREATER_THAN, EnumC1528n.GREATER_THAN_OR_EQUAL, EnumC1528n.NOT_EQUAL, EnumC1528n.NOT_IN).contains(this.f14349a);
    }

    public final boolean g(int i7) {
        int[] iArr = AbstractC1527m.f14348a;
        EnumC1528n enumC1528n = this.f14349a;
        switch (iArr[enumC1528n.ordinal()]) {
            case 1:
                if (i7 >= 0) {
                    return false;
                }
                return true;
            case 2:
                if (i7 > 0) {
                    return false;
                }
                return true;
            case 3:
                if (i7 != 0) {
                    return false;
                }
                return true;
            case 4:
                if (i7 == 0) {
                    return false;
                }
                return true;
            case 5:
                if (i7 <= 0) {
                    return false;
                }
                return true;
            case 6:
                if (i7 < 0) {
                    return false;
                }
                return true;
            default:
                m5.d.g("Unknown FieldFilter operator: %s", enumC1528n);
                throw null;
        }
    }

    public final int hashCode() {
        int hashCode = this.f14351c.hashCode();
        return this.f14350b.hashCode() + ((hashCode + ((this.f14349a.hashCode() + 1147) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}
