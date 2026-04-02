package O0;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f3797c;

    /* renamed from: a  reason: collision with root package name */
    public final long f3798a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3799b;

    static {
        l0 l0Var = new l0(0L, 0L);
        new l0(Long.MAX_VALUE, Long.MAX_VALUE);
        new l0(Long.MAX_VALUE, 0L);
        new l0(0L, Long.MAX_VALUE);
        f3797c = l0Var;
    }

    public l0(long j, long j8) {
        boolean z7;
        if (j >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        K0.a.e(j8 >= 0);
        this.f3798a = j;
        this.f3799b = j8;
    }

    public final long a(long j, long j8, long j9) {
        boolean z7;
        long j10 = this.f3798a;
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        long j11 = this.f3799b;
        if (i7 == 0 && j11 == 0) {
            return j;
        }
        int i8 = K0.x.f2529a;
        long j12 = j - j10;
        if (((j10 ^ j) & (j ^ j12)) < 0) {
            j12 = Long.MIN_VALUE;
        }
        long j13 = j + j11;
        if (((j11 ^ j13) & (j ^ j13)) < 0) {
            j13 = Long.MAX_VALUE;
        }
        boolean z8 = false;
        if (j12 <= j8 && j8 <= j13) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (j12 <= j9 && j9 <= j13) {
            z8 = true;
        }
        if (z7 && z8) {
            if (Math.abs(j8 - j) <= Math.abs(j9 - j)) {
                return j8;
            }
            return j9;
        } else if (z7) {
            return j8;
        } else {
            if (z8) {
                return j9;
            }
            return j12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f3798a == l0Var.f3798a && this.f3799b == l0Var.f3799b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3798a) * 31) + ((int) this.f3799b);
    }
}
