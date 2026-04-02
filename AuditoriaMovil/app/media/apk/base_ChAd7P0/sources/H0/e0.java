package H0;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: e  reason: collision with root package name */
    public static final e0 f1792e = new e0(0, 0, 0, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final int f1793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1794b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1795c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1796d;

    static {
        K0.x.H(0);
        K0.x.H(1);
        K0.x.H(2);
        K0.x.H(3);
    }

    public e0(int i7, int i8, int i9, float f) {
        this.f1793a = i7;
        this.f1794b = i8;
        this.f1795c = i9;
        this.f1796d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f1793a == e0Var.f1793a && this.f1794b == e0Var.f1794b && this.f1795c == e0Var.f1795c && this.f1796d == e0Var.f1796d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1796d) + ((((((217 + this.f1793a) * 31) + this.f1794b) * 31) + this.f1795c) * 31);
    }
}
