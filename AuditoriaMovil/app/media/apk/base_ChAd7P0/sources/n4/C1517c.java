package n4;

import H4.p1;
import java.util.List;
/* renamed from: n4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14333a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14334b;

    public C1517c(List list, boolean z7) {
        this.f14334b = list;
        this.f14333a = z7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final int a(List list, q4.n nVar) {
        boolean z7;
        boolean z8;
        int b5;
        ?? r02 = this.f14334b;
        if (r02.size() <= list.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        m5.d.i("Bound has more components than query's orderBy", z7, new Object[0]);
        int i7 = 0;
        for (int i8 = 0; i8 < r02.size(); i8++) {
            C1513B c1513b = (C1513B) list.get(i8);
            p1 p1Var = (p1) r02.get(i8);
            if (c1513b.f14268b.equals(q4.k.f15360b)) {
                m5.d.i("Bound has a non-key value where the key path is being used %s", q4.s.i(p1Var), p1Var);
                b5 = q4.h.c(p1Var.O()).compareTo(nVar.f15362a);
            } else {
                p1 f = nVar.f15366e.f(c1513b.f14268b);
                if (f != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                m5.d.i("Field should exist since document matched the orderBy already.", z8, new Object[0]);
                b5 = q4.s.b(p1Var, f);
            }
            if (c1513b.f14267a.equals(EnumC1512A.DESCENDING)) {
                b5 *= -1;
            }
            i7 = b5;
            if (i7 != 0) {
                break;
            }
        }
        return i7;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final String b() {
        StringBuilder sb = new StringBuilder();
        boolean z7 = true;
        for (p1 p1Var : this.f14334b) {
            if (!z7) {
                sb.append(",");
            }
            p1 p1Var2 = q4.s.f15373a;
            StringBuilder sb2 = new StringBuilder();
            q4.s.a(sb2, p1Var);
            sb.append(sb2.toString());
            z7 = false;
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1517c.class != obj.getClass()) {
            return false;
        }
        C1517c c1517c = (C1517c) obj;
        if (this.f14333a == c1517c.f14333a && this.f14334b.equals(c1517c.f14334b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final int hashCode() {
        return this.f14334b.hashCode() + ((this.f14333a ? 1 : 0) * 31);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Bound(inclusive=");
        sb.append(this.f14333a);
        sb.append(", position=");
        int i7 = 0;
        while (true) {
            ?? r22 = this.f14334b;
            if (i7 < r22.size()) {
                if (i7 > 0) {
                    sb.append(" and ");
                }
                p1 p1Var = q4.s.f15373a;
                StringBuilder sb2 = new StringBuilder();
                q4.s.a(sb2, (p1) r22.get(i7));
                sb.append(sb2.toString());
                i7++;
            } else {
                sb.append(")");
                return sb.toString();
            }
        }
    }
}
