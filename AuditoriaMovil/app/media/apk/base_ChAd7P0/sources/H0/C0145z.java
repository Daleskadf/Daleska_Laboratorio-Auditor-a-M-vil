package H0;

import D.AbstractC0059i;
import android.net.Uri;
import java.util.List;
import r3.AbstractC1740d;
/* renamed from: H0.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145z {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f1914a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1915b;

    /* renamed from: c  reason: collision with root package name */
    public final List f1916c;

    /* renamed from: d  reason: collision with root package name */
    public final A3.K f1917d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1918e;

    static {
        AbstractC0059i.F(0, 1, 2, 3, 4);
        K0.x.H(5);
        K0.x.H(6);
        K0.x.H(7);
    }

    public C0145z(Uri uri, String str, AbstractC1740d abstractC1740d, List list, A3.K k2, long j) {
        this.f1914a = uri;
        this.f1915b = I.l(str);
        this.f1916c = list;
        this.f1917d = k2;
        A3.H o7 = A3.K.o();
        for (int i7 = 0; i7 < k2.size(); i7++) {
            ((B) k2.get(i7)).getClass();
            o7.c(new Object());
        }
        o7.g();
        this.f1918e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0145z)) {
            return false;
        }
        C0145z c0145z = (C0145z) obj;
        if (this.f1914a.equals(c0145z.f1914a) && K0.x.a(this.f1915b, c0145z.f1915b) && K0.x.a(null, null) && K0.x.a(null, null) && this.f1916c.equals(c0145z.f1916c) && K0.x.a(null, null) && this.f1917d.equals(c0145z.f1917d) && K0.x.a(null, null) && Long.valueOf(this.f1918e).equals(Long.valueOf(c0145z.f1918e))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f1914a.hashCode() * 31;
        String str = this.f1915b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.f1916c.hashCode();
        return (int) (((this.f1917d.hashCode() + ((hashCode3 + ((hashCode2 + hashCode) * 29791)) * 961)) * 31 * 31) + this.f1918e);
    }
}
