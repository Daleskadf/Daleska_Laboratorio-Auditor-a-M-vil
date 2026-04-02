package H0;

import A3.AbstractC0021t;
import A3.j0;
import D.AbstractC0059i;
/* loaded from: classes.dex */
public class Z {

    /* renamed from: a  reason: collision with root package name */
    public final int f1760a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1761b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1762c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1763d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1764e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1765g;

    /* renamed from: h  reason: collision with root package name */
    public final A3.e0 f1766h;

    /* renamed from: i  reason: collision with root package name */
    public final A3.e0 f1767i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1768k;

    /* renamed from: l  reason: collision with root package name */
    public final A3.e0 f1769l;

    /* renamed from: m  reason: collision with root package name */
    public final X f1770m;

    /* renamed from: n  reason: collision with root package name */
    public final A3.e0 f1771n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1772o;

    /* renamed from: p  reason: collision with root package name */
    public final j0 f1773p;

    /* renamed from: q  reason: collision with root package name */
    public final A3.P f1774q;

    static {
        new Z(new Y());
        K0.x.H(1);
        K0.x.H(2);
        K0.x.H(3);
        K0.x.H(4);
        AbstractC0059i.F(5, 6, 7, 8, 9);
        AbstractC0059i.F(10, 11, 12, 13, 14);
        AbstractC0059i.F(15, 16, 17, 18, 19);
        AbstractC0059i.F(20, 21, 22, 23, 24);
        AbstractC0059i.F(25, 26, 27, 28, 29);
        K0.x.H(30);
        K0.x.H(31);
    }

    public Z(Y y2) {
        this.f1760a = y2.f1745a;
        this.f1761b = y2.f1746b;
        this.f1762c = y2.f1747c;
        this.f1763d = y2.f1748d;
        this.f1764e = y2.f1749e;
        this.f = y2.f;
        this.f1765g = y2.f1750g;
        this.f1766h = y2.f1751h;
        this.f1767i = y2.f1752i;
        this.j = y2.j;
        this.f1768k = y2.f1753k;
        this.f1769l = y2.f1754l;
        this.f1770m = y2.f1755m;
        this.f1771n = y2.f1756n;
        this.f1772o = y2.f1757o;
        this.f1773p = j0.a(y2.f1758p);
        this.f1774q = A3.P.p(y2.f1759q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Z z7 = (Z) obj;
        if (this.f1760a == z7.f1760a && this.f1761b == z7.f1761b && this.f1762c == z7.f1762c && this.f1763d == z7.f1763d && this.f1765g == z7.f1765g && this.f1764e == z7.f1764e && this.f == z7.f && this.f1766h.equals(z7.f1766h) && this.f1767i.equals(z7.f1767i) && this.j == z7.j && this.f1768k == z7.f1768k && this.f1769l.equals(z7.f1769l) && this.f1770m.equals(z7.f1770m) && this.f1771n.equals(z7.f1771n) && this.f1772o == z7.f1772o) {
            j0 j0Var = this.f1773p;
            j0Var.getClass();
            if (AbstractC0021t.h(j0Var, z7.f1773p) && this.f1774q.equals(z7.f1774q)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f1766h.hashCode();
        int hashCode2 = this.f1767i.hashCode();
        int hashCode3 = this.f1769l.hashCode();
        this.f1770m.getClass();
        int hashCode4 = this.f1771n.hashCode();
        int hashCode5 = this.f1773p.hashCode();
        return this.f1774q.hashCode() + ((hashCode5 + ((((hashCode4 + ((((hashCode3 + ((((((hashCode2 + ((hashCode + ((((((((((((((this.f1760a + 31) * 31) + this.f1761b) * 31) + this.f1762c) * 31) + this.f1763d) * 28629151) + (this.f1765g ? 1 : 0)) * 31) + this.f1764e) * 31) + this.f) * 31)) * 961)) * 961) + this.j) * 31) + this.f1768k) * 31)) * 31) + 29791) * 31)) * 31) + this.f1772o) * 887503681)) * 31);
    }
}
