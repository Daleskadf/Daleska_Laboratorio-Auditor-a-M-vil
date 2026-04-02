package S0;

import K0.x;
import java.math.RoundingMode;
import java.util.List;
/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d  reason: collision with root package name */
    public final long f4897d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4898e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4899g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4900h;

    /* renamed from: i  reason: collision with root package name */
    public final long f4901i;

    public n(j jVar, long j, long j8, long j9, long j10, List list, long j11, long j12, long j13) {
        super(jVar, j, j8);
        this.f4897d = j9;
        this.f4898e = j10;
        this.f = list;
        this.f4901i = j11;
        this.f4899g = j12;
        this.f4900h = j13;
    }

    public final long b(long j, long j8) {
        long d7 = d(j);
        if (d7 != -1) {
            return d7;
        }
        return (int) (f((j8 - this.f4900h) + this.f4901i, j) - c(j, j8));
    }

    public final long c(long j, long j8) {
        int i7 = (d(j) > (-1L) ? 1 : (d(j) == (-1L) ? 0 : -1));
        long j9 = this.f4897d;
        if (i7 == 0) {
            long j10 = this.f4899g;
            if (j10 != -9223372036854775807L) {
                return Math.max(j9, f((j8 - this.f4900h) - j10, j));
            }
        }
        return j9;
    }

    public abstract long d(long j);

    public final long e(long j, long j8) {
        long j9 = this.f4909b;
        long j10 = this.f4897d;
        List list = this.f;
        if (list != null) {
            return (((q) list.get((int) (j - j10))).f4905b * 1000000) / j9;
        }
        long d7 = d(j8);
        if (d7 != -1 && j == (j10 + d7) - 1) {
            return j8 - g(j);
        }
        return (this.f4898e * 1000000) / j9;
    }

    public final long f(long j, long j8) {
        long d7 = d(j8);
        int i7 = (d7 > 0L ? 1 : (d7 == 0L ? 0 : -1));
        long j9 = this.f4897d;
        if (i7 == 0) {
            return j9;
        }
        if (this.f == null) {
            long j10 = (j / ((this.f4898e * 1000000) / this.f4909b)) + j9;
            if (j10 >= j9) {
                if (d7 == -1) {
                    return j10;
                }
                return Math.min(j10, (j9 + d7) - 1);
            }
            return j9;
        }
        long j11 = (d7 + j9) - 1;
        long j12 = j9;
        while (j12 <= j11) {
            long j13 = ((j11 - j12) / 2) + j12;
            int i8 = (g(j13) > j ? 1 : (g(j13) == j ? 0 : -1));
            if (i8 < 0) {
                j12 = j13 + 1;
            } else if (i8 > 0) {
                j11 = j13 - 1;
            } else {
                return j13;
            }
        }
        if (j12 == j9) {
            return j12;
        }
        return j11;
    }

    public final long g(long j) {
        long j8;
        long j9 = this.f4897d;
        List list = this.f;
        if (list != null) {
            j8 = ((q) list.get((int) (j - j9))).f4904a - this.f4910c;
        } else {
            j8 = (j - j9) * this.f4898e;
        }
        long j10 = j8;
        int i7 = x.f2529a;
        return x.U(j10, 1000000L, this.f4909b, RoundingMode.FLOOR);
    }

    public abstract j h(k kVar, long j);

    public boolean i() {
        if (this.f != null) {
            return true;
        }
        return false;
    }
}
