package H0;

import D.AbstractC0059i;
import java.util.Collections;
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final String f1641a;

    /* renamed from: b  reason: collision with root package name */
    public final C0145z f1642b;

    /* renamed from: c  reason: collision with root package name */
    public final C0144y f1643c;

    /* renamed from: d  reason: collision with root package name */
    public final F f1644d;

    /* renamed from: e  reason: collision with root package name */
    public final C0142w f1645e;
    public final A f;

    static {
        C0140u c0140u = new C0140u();
        A3.I i7 = A3.K.f98b;
        A3.e0 e0Var = A3.e0.f138e;
        Collections.emptyList();
        A3.e0 e0Var2 = A3.e0.f138e;
        C0143x c0143x = new C0143x();
        A a7 = A.f1640a;
        c0140u.a();
        c0143x.a();
        F f = F.f1669y;
        AbstractC0059i.F(0, 1, 2, 3, 4);
        K0.x.H(5);
    }

    public C(String str, C0142w c0142w, C0145z c0145z, C0144y c0144y, F f, A a7) {
        this.f1641a = str;
        this.f1642b = c0145z;
        this.f1643c = c0144y;
        this.f1644d = f;
        this.f1645e = c0142w;
        this.f = a7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        if (K0.x.a(this.f1641a, c8.f1641a) && this.f1645e.equals(c8.f1645e) && K0.x.a(this.f1642b, c8.f1642b) && this.f1643c.equals(c8.f1643c) && K0.x.a(this.f1644d, c8.f1644d) && K0.x.a(this.f, c8.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f1641a.hashCode() * 31;
        C0145z c0145z = this.f1642b;
        if (c0145z != null) {
            i7 = c0145z.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f1643c.hashCode();
        int hashCode3 = this.f1645e.hashCode();
        int hashCode4 = (this.f1644d.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i7) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return hashCode4;
    }
}
