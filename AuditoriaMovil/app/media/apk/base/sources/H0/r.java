package H0;

import D.AbstractC0059i;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: A  reason: collision with root package name */
    public final int f1865A;

    /* renamed from: B  reason: collision with root package name */
    public final int f1866B;

    /* renamed from: C  reason: collision with root package name */
    public final int f1867C;

    /* renamed from: D  reason: collision with root package name */
    public final int f1868D;

    /* renamed from: E  reason: collision with root package name */
    public final int f1869E;

    /* renamed from: F  reason: collision with root package name */
    public final int f1870F;

    /* renamed from: G  reason: collision with root package name */
    public final int f1871G;

    /* renamed from: H  reason: collision with root package name */
    public final int f1872H;

    /* renamed from: I  reason: collision with root package name */
    public final int f1873I;

    /* renamed from: J  reason: collision with root package name */
    public final int f1874J;

    /* renamed from: K  reason: collision with root package name */
    public int f1875K;

    /* renamed from: a  reason: collision with root package name */
    public final String f1876a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1877b;

    /* renamed from: c  reason: collision with root package name */
    public final A3.K f1878c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1879d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1880e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1881g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1882h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1883i;
    public final String j;

    /* renamed from: k  reason: collision with root package name */
    public final H f1884k;

    /* renamed from: l  reason: collision with root package name */
    public final String f1885l;

    /* renamed from: m  reason: collision with root package name */
    public final String f1886m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1887n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1888o;

    /* renamed from: p  reason: collision with root package name */
    public final List f1889p;

    /* renamed from: q  reason: collision with root package name */
    public final C0135o f1890q;

    /* renamed from: r  reason: collision with root package name */
    public final long f1891r;

    /* renamed from: s  reason: collision with root package name */
    public final int f1892s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1893t;

    /* renamed from: u  reason: collision with root package name */
    public final float f1894u;

    /* renamed from: v  reason: collision with root package name */
    public final int f1895v;

    /* renamed from: w  reason: collision with root package name */
    public final float f1896w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f1897x;

    /* renamed from: y  reason: collision with root package name */
    public final int f1898y;

    /* renamed from: z  reason: collision with root package name */
    public final C0130j f1899z;

    static {
        new C0137q().a();
        K0.x.H(0);
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
        K0.x.H(32);
    }

    public r(C0137q c0137q) {
        boolean z7;
        String str;
        this.f1876a = c0137q.f1841a;
        String N7 = K0.x.N(c0137q.f1844d);
        this.f1879d = N7;
        if (c0137q.f1843c.isEmpty() && c0137q.f1842b != null) {
            this.f1878c = A3.K.u(new C0139t(N7, c0137q.f1842b));
            this.f1877b = c0137q.f1842b;
        } else if (!c0137q.f1843c.isEmpty() && c0137q.f1842b == null) {
            A3.K k2 = c0137q.f1843c;
            this.f1878c = k2;
            Iterator it = k2.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0139t c0139t = (C0139t) it.next();
                    if (TextUtils.equals(c0139t.f1900a, N7)) {
                        str = c0139t.f1901b;
                        break;
                    }
                } else {
                    str = ((C0139t) k2.get(0)).f1901b;
                    break;
                }
            }
            this.f1877b = str;
        } else {
            if (!c0137q.f1843c.isEmpty() || c0137q.f1842b != null) {
                for (int i7 = 0; i7 < c0137q.f1843c.size(); i7++) {
                    if (!((C0139t) c0137q.f1843c.get(i7)).f1901b.equals(c0137q.f1842b)) {
                    }
                }
                z7 = false;
                K0.a.j(z7);
                this.f1878c = c0137q.f1843c;
                this.f1877b = c0137q.f1842b;
            }
            z7 = true;
            K0.a.j(z7);
            this.f1878c = c0137q.f1843c;
            this.f1877b = c0137q.f1842b;
        }
        this.f1880e = c0137q.f1845e;
        this.f = c0137q.f;
        int i8 = c0137q.f1846g;
        this.f1881g = i8;
        int i9 = c0137q.f1847h;
        this.f1882h = i9;
        this.f1883i = i9 != -1 ? i9 : i8;
        this.j = c0137q.f1848i;
        this.f1884k = c0137q.j;
        this.f1885l = c0137q.f1849k;
        this.f1886m = c0137q.f1850l;
        this.f1887n = c0137q.f1851m;
        this.f1888o = c0137q.f1852n;
        List list = c0137q.f1853o;
        this.f1889p = list == null ? Collections.emptyList() : list;
        C0135o c0135o = c0137q.f1854p;
        this.f1890q = c0135o;
        this.f1891r = c0137q.f1855q;
        this.f1892s = c0137q.f1856r;
        this.f1893t = c0137q.f1857s;
        this.f1894u = c0137q.f1858t;
        int i10 = c0137q.f1859u;
        this.f1895v = i10 == -1 ? 0 : i10;
        float f = c0137q.f1860v;
        this.f1896w = f == -1.0f ? 1.0f : f;
        this.f1897x = c0137q.f1861w;
        this.f1898y = c0137q.f1862x;
        this.f1899z = c0137q.f1863y;
        this.f1865A = c0137q.f1864z;
        this.f1866B = c0137q.f1832A;
        this.f1867C = c0137q.f1833B;
        int i11 = c0137q.f1834C;
        this.f1868D = i11 == -1 ? 0 : i11;
        int i12 = c0137q.f1835D;
        this.f1869E = i12 != -1 ? i12 : 0;
        this.f1870F = c0137q.f1836E;
        this.f1871G = c0137q.f1837F;
        this.f1872H = c0137q.f1838G;
        this.f1873I = c0137q.f1839H;
        int i13 = c0137q.f1840I;
        if (i13 == 0 && c0135o != null) {
            this.f1874J = 1;
        } else {
            this.f1874J = i13;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, H0.q] */
    public final C0137q a() {
        ?? obj = new Object();
        obj.f1841a = this.f1876a;
        obj.f1842b = this.f1877b;
        obj.f1843c = this.f1878c;
        obj.f1844d = this.f1879d;
        obj.f1845e = this.f1880e;
        obj.f = this.f;
        obj.f1846g = this.f1881g;
        obj.f1847h = this.f1882h;
        obj.f1848i = this.j;
        obj.j = this.f1884k;
        obj.f1849k = this.f1885l;
        obj.f1850l = this.f1886m;
        obj.f1851m = this.f1887n;
        obj.f1852n = this.f1888o;
        obj.f1853o = this.f1889p;
        obj.f1854p = this.f1890q;
        obj.f1855q = this.f1891r;
        obj.f1856r = this.f1892s;
        obj.f1857s = this.f1893t;
        obj.f1858t = this.f1894u;
        obj.f1859u = this.f1895v;
        obj.f1860v = this.f1896w;
        obj.f1861w = this.f1897x;
        obj.f1862x = this.f1898y;
        obj.f1863y = this.f1899z;
        obj.f1864z = this.f1865A;
        obj.f1832A = this.f1866B;
        obj.f1833B = this.f1867C;
        obj.f1834C = this.f1868D;
        obj.f1835D = this.f1869E;
        obj.f1836E = this.f1870F;
        obj.f1837F = this.f1871G;
        obj.f1838G = this.f1872H;
        obj.f1839H = this.f1873I;
        obj.f1840I = this.f1874J;
        return obj;
    }

    public final int b() {
        int i7;
        int i8 = this.f1892s;
        if (i8 == -1 || (i7 = this.f1893t) == -1) {
            return -1;
        }
        return i8 * i7;
    }

    public final boolean c(r rVar) {
        List list = this.f1889p;
        if (list.size() != rVar.f1889p.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) rVar.f1889p.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final r d(r rVar) {
        String str;
        float f;
        String str2;
        C0135o c0135o;
        int i7;
        int i8;
        if (this == rVar) {
            return this;
        }
        int g3 = I.g(this.f1886m);
        String str3 = rVar.f1876a;
        String str4 = rVar.f1877b;
        if (str4 == null) {
            str4 = this.f1877b;
        }
        A3.K k2 = rVar.f1878c;
        if (k2.isEmpty()) {
            k2 = this.f1878c;
        }
        if ((g3 != 3 && g3 != 1) || (str = rVar.f1879d) == null) {
            str = this.f1879d;
        }
        int i9 = this.f1881g;
        if (i9 == -1) {
            i9 = rVar.f1881g;
        }
        int i10 = this.f1882h;
        if (i10 == -1) {
            i10 = rVar.f1882h;
        }
        String str5 = this.j;
        if (str5 == null) {
            String v6 = K0.x.v(g3, rVar.j);
            if (K0.x.X(v6).length == 1) {
                str5 = v6;
            }
        }
        H h8 = rVar.f1884k;
        H h9 = this.f1884k;
        if (h9 != null) {
            h8 = h9.d(h8);
        }
        float f4 = this.f1894u;
        if (f4 == -1.0f && g3 == 2) {
            f4 = rVar.f1894u;
        }
        int i11 = this.f1880e | rVar.f1880e;
        int i12 = this.f | rVar.f;
        ArrayList arrayList = new ArrayList();
        C0135o c0135o2 = rVar.f1890q;
        if (c0135o2 != null) {
            C0134n[] c0134nArr = c0135o2.f1827a;
            int length = c0134nArr.length;
            f = f4;
            int i13 = 0;
            while (i13 < length) {
                int i14 = length;
                C0134n c0134n = c0134nArr[i13];
                C0134n[] c0134nArr2 = c0134nArr;
                if (c0134n.f1826e != null) {
                    arrayList.add(c0134n);
                }
                i13++;
                length = i14;
                c0134nArr = c0134nArr2;
            }
            str2 = c0135o2.f1829c;
        } else {
            f = f4;
            str2 = null;
        }
        C0135o c0135o3 = this.f1890q;
        if (c0135o3 != null) {
            if (str2 == null) {
                str2 = c0135o3.f1829c;
            }
            int size = arrayList.size();
            C0134n[] c0134nArr3 = c0135o3.f1827a;
            int length2 = c0134nArr3.length;
            int i15 = 0;
            while (true) {
                String str6 = str2;
                if (i15 >= length2) {
                    break;
                }
                C0134n c0134n2 = c0134nArr3[i15];
                C0134n[] c0134nArr4 = c0134nArr3;
                if (c0134n2.f1826e != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < size) {
                            i7 = size;
                            i8 = length2;
                            if (((C0134n) arrayList.get(i16)).f1823b.equals(c0134n2.f1823b)) {
                                break;
                            }
                            i16++;
                            length2 = i8;
                            size = i7;
                        } else {
                            i7 = size;
                            i8 = length2;
                            arrayList.add(c0134n2);
                            break;
                        }
                    }
                } else {
                    i7 = size;
                    i8 = length2;
                }
                i15++;
                str2 = str6;
                c0134nArr3 = c0134nArr4;
                length2 = i8;
                size = i7;
            }
        }
        if (arrayList.isEmpty()) {
            c0135o = null;
        } else {
            c0135o = new C0135o(str2, arrayList);
        }
        C0137q a7 = a();
        a7.f1841a = str3;
        a7.f1842b = str4;
        a7.f1843c = A3.K.p(k2);
        a7.f1844d = str;
        a7.f1845e = i11;
        a7.f = i12;
        a7.f1846g = i9;
        a7.f1847h = i10;
        a7.f1848i = str5;
        a7.j = h8;
        a7.f1854p = c0135o;
        a7.f1858t = f;
        a7.f1838G = rVar.f1872H;
        a7.f1839H = rVar.f1873I;
        return new r(a7);
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        int i8 = this.f1875K;
        if (i8 != 0 && (i7 = rVar.f1875K) != 0 && i8 != i7) {
            return false;
        }
        if (this.f1880e == rVar.f1880e && this.f == rVar.f && this.f1881g == rVar.f1881g && this.f1882h == rVar.f1882h && this.f1887n == rVar.f1887n && this.f1891r == rVar.f1891r && this.f1892s == rVar.f1892s && this.f1893t == rVar.f1893t && this.f1895v == rVar.f1895v && this.f1898y == rVar.f1898y && this.f1865A == rVar.f1865A && this.f1866B == rVar.f1866B && this.f1867C == rVar.f1867C && this.f1868D == rVar.f1868D && this.f1869E == rVar.f1869E && this.f1870F == rVar.f1870F && this.f1872H == rVar.f1872H && this.f1873I == rVar.f1873I && this.f1874J == rVar.f1874J && Float.compare(this.f1894u, rVar.f1894u) == 0 && Float.compare(this.f1896w, rVar.f1896w) == 0 && Objects.equals(this.f1876a, rVar.f1876a) && Objects.equals(this.f1877b, rVar.f1877b) && this.f1878c.equals(rVar.f1878c) && Objects.equals(this.j, rVar.j) && Objects.equals(this.f1885l, rVar.f1885l) && Objects.equals(this.f1886m, rVar.f1886m) && Objects.equals(this.f1879d, rVar.f1879d) && Arrays.equals(this.f1897x, rVar.f1897x) && Objects.equals(this.f1884k, rVar.f1884k) && Objects.equals(this.f1899z, rVar.f1899z) && Objects.equals(this.f1890q, rVar.f1890q) && c(rVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.f1875K == 0) {
            int i7 = 0;
            String str = this.f1876a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i8 = (527 + hashCode) * 31;
            String str2 = this.f1877b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f1878c.hashCode() + ((i8 + hashCode2) * 31)) * 31;
            String str3 = this.f1879d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i9 = (((((((((hashCode7 + hashCode3) * 31) + this.f1880e) * 31) + this.f) * 31) + this.f1881g) * 31) + this.f1882h) * 31;
            String str4 = this.j;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i10 = (i9 + hashCode4) * 31;
            H h8 = this.f1884k;
            if (h8 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = h8.hashCode();
            }
            int i11 = (i10 + hashCode5) * 961;
            String str5 = this.f1885l;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i12 = (i11 + hashCode6) * 31;
            String str6 = this.f1886m;
            if (str6 != null) {
                i7 = str6.hashCode();
            }
            this.f1875K = ((((((((((((((((((((Float.floatToIntBits(this.f1896w) + ((((Float.floatToIntBits(this.f1894u) + ((((((((((i12 + i7) * 31) + this.f1887n) * 31) + ((int) this.f1891r)) * 31) + this.f1892s) * 31) + this.f1893t) * 31)) * 31) + this.f1895v) * 31)) * 31) + this.f1898y) * 31) + this.f1865A) * 31) + this.f1866B) * 31) + this.f1867C) * 31) + this.f1868D) * 31) + this.f1869E) * 31) + this.f1870F) * 31) + this.f1872H) * 31) + this.f1873I) * 31) + this.f1874J;
        }
        return this.f1875K;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f1876a);
        sb.append(", ");
        sb.append(this.f1877b);
        sb.append(", ");
        sb.append(this.f1885l);
        sb.append(", ");
        sb.append(this.f1886m);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.f1883i);
        sb.append(", ");
        sb.append(this.f1879d);
        sb.append(", [");
        sb.append(this.f1892s);
        sb.append(", ");
        sb.append(this.f1893t);
        sb.append(", ");
        sb.append(this.f1894u);
        sb.append(", ");
        sb.append(this.f1899z);
        sb.append("], [");
        sb.append(this.f1865A);
        sb.append(", ");
        return AbstractC0059i.B(sb, this.f1866B, "])");
    }
}
