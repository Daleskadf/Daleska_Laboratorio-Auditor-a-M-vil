package H0;
/* renamed from: H0.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0141v {

    /* renamed from: a  reason: collision with root package name */
    public final long f1903a;

    static {
        new C0141v(new C0140u());
        K0.x.H(0);
        K0.x.H(1);
        K0.x.H(2);
        K0.x.H(3);
        K0.x.H(4);
        K0.x.H(5);
        K0.x.H(6);
    }

    public C0141v(C0140u c0140u) {
        c0140u.getClass();
        int i7 = K0.x.f2529a;
        this.f1903a = c0140u.f1902a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0141v)) {
            return false;
        }
        C0141v c0141v = (C0141v) obj;
        c0141v.getClass();
        if (this.f1903a == c0141v.f1903a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1903a;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
    }
}
