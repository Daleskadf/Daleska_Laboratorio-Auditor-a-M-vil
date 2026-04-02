package K0;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final r f2516c = new r(-1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f2517a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2518b;

    static {
        new r(0, 0);
    }

    public r(int i7, int i8) {
        boolean z7;
        if ((i7 != -1 && i7 < 0) || (i8 != -1 && i8 < 0)) {
            z7 = false;
        } else {
            z7 = true;
        }
        a.e(z7);
        this.f2517a = i7;
        this.f2518b = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f2517a != rVar.f2517a || this.f2518b != rVar.f2518b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f2517a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f2518b;
    }

    public final String toString() {
        return this.f2517a + "x" + this.f2518b;
    }
}
