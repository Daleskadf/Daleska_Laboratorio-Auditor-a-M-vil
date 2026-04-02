package H0;
/* renamed from: H0.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139t {

    /* renamed from: a  reason: collision with root package name */
    public final String f1900a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1901b;

    static {
        K0.x.H(0);
        K0.x.H(1);
    }

    public C0139t(String str, String str2) {
        this.f1900a = K0.x.N(str);
        this.f1901b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0139t.class != obj.getClass()) {
            return false;
        }
        C0139t c0139t = (C0139t) obj;
        if (K0.x.a(this.f1900a, c0139t.f1900a) && K0.x.a(this.f1901b, c0139t.f1901b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f1901b.hashCode() * 31;
        String str = this.f1900a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
