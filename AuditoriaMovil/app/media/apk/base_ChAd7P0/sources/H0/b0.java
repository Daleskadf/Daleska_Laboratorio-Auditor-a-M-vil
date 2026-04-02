package H0;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f1789b;

    /* renamed from: a  reason: collision with root package name */
    public final A3.K f1790a;

    static {
        A3.I i7 = A3.K.f98b;
        f1789b = new b0(A3.e0.f138e);
        K0.x.H(0);
    }

    public b0(A3.K k2) {
        this.f1790a = A3.K.p(k2);
    }

    public final boolean a(int i7) {
        int i8 = 0;
        while (true) {
            A3.K k2 = this.f1790a;
            if (i8 >= k2.size()) {
                return false;
            }
            a0 a0Var = (a0) k2.get(i8);
            boolean[] zArr = a0Var.f1784e;
            int length = zArr.length;
            boolean z7 = false;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                } else if (zArr[i9]) {
                    z7 = true;
                    break;
                } else {
                    i9++;
                }
            }
            if (z7 && a0Var.f1781b.f1741c == i7) {
                return true;
            }
            i8++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            return this.f1790a.equals(((b0) obj).f1790a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1790a.hashCode();
    }
}
