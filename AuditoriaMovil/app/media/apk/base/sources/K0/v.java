package K0;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public long f2523a;

    /* renamed from: b  reason: collision with root package name */
    public long f2524b;

    /* renamed from: c  reason: collision with root package name */
    public long f2525c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal f2526d = new ThreadLocal();

    public v(long j) {
        g(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j8 = this.f2523a;
                if (j8 == 9223372036854775806L) {
                    Long l8 = (Long) this.f2526d.get();
                    l8.getClass();
                    j8 = l8.longValue();
                }
                this.f2524b = j8 - j;
                notifyAll();
            }
            this.f2525c = j;
            return j + this.f2524b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f2525c;
            if (j8 != -9223372036854775807L) {
                long j9 = (j8 * 90000) / 1000000;
                long j10 = (4294967296L + j9) / 8589934592L;
                long j11 = ((j10 - 1) * 8589934592L) + j;
                long j12 = (j10 * 8589934592L) + j;
                if (Math.abs(j11 - j9) < Math.abs(j12 - j9)) {
                    j = j11;
                } else {
                    j = j12;
                }
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        long j8;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j9 = this.f2525c;
        if (j9 != -9223372036854775807L) {
            long j10 = (j9 * 90000) / 1000000;
            long j11 = j10 / 8589934592L;
            Long.signum(j11);
            long j12 = (j11 * 8589934592L) + j;
            j8 = ((j11 + 1) * 8589934592L) + j;
            if (j12 >= j10) {
                j8 = j12;
            }
        } else {
            j8 = j;
        }
        return a((j8 * 1000000) / 90000);
    }

    public final synchronized long d() {
        long j;
        j = this.f2523a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long e() {
        return this.f2524b;
    }

    public final synchronized boolean f() {
        boolean z7;
        if (this.f2524b != -9223372036854775807L) {
            z7 = true;
        } else {
            z7 = false;
        }
        return z7;
    }

    public final synchronized void g(long j) {
        long j8;
        this.f2523a = j;
        if (j == Long.MAX_VALUE) {
            j8 = 0;
        } else {
            j8 = -9223372036854775807L;
        }
        this.f2524b = j8;
        this.f2525c = -9223372036854775807L;
    }

    public final synchronized void h(long j, boolean z7) {
        boolean z8;
        try {
            if (this.f2523a == 9223372036854775806L) {
                z8 = true;
            } else {
                z8 = false;
            }
            a.j(z8);
            if (f()) {
                return;
            }
            if (z7) {
                this.f2526d.set(Long.valueOf(j));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
