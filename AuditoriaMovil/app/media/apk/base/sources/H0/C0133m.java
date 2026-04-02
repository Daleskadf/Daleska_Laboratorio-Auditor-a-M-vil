package H0;
/* renamed from: H0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133m {

    /* renamed from: a  reason: collision with root package name */
    public final int f1820a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1821b;

    static {
        boolean z7;
        C0132l c0132l = new C0132l(0);
        if (c0132l.f1818b <= c0132l.f1819c) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        new C0133m(c0132l);
        K0.x.H(0);
        K0.x.H(1);
        K0.x.H(2);
        K0.x.H(3);
    }

    public C0133m(C0132l c0132l) {
        c0132l.getClass();
        this.f1820a = c0132l.f1818b;
        this.f1821b = c0132l.f1819c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0133m)) {
            return false;
        }
        C0133m c0133m = (C0133m) obj;
        c0133m.getClass();
        if (this.f1820a == c0133m.f1820a && this.f1821b == c0133m.f1821b && K0.x.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((16337 + this.f1820a) * 31) + this.f1821b) * 31;
    }
}
