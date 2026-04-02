package a6;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* renamed from: a6.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490t implements Comparable {

    /* renamed from: X  reason: collision with root package name */
    public static final long f7202X;

    /* renamed from: d  reason: collision with root package name */
    public static final C0483l f7203d = new C0483l(3);

    /* renamed from: e  reason: collision with root package name */
    public static final long f7204e;
    public static final long f;

    /* renamed from: a  reason: collision with root package name */
    public final C0483l f7205a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7206b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f7207c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f7204e = nanos;
        f = -nanos;
        f7202X = TimeUnit.SECONDS.toNanos(1L);
    }

    public C0490t(long j) {
        boolean z7;
        C0483l c0483l = f7203d;
        long nanoTime = System.nanoTime();
        this.f7205a = c0483l;
        long min = Math.min(f7204e, Math.max(f, j));
        this.f7206b = nanoTime + min;
        if (min <= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f7207c = z7;
    }

    public final boolean a() {
        if (!this.f7207c) {
            long j = this.f7206b;
            this.f7205a.getClass();
            if (j - System.nanoTime() <= 0) {
                this.f7207c = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final long b(TimeUnit timeUnit) {
        this.f7205a.getClass();
        long nanoTime = System.nanoTime();
        if (!this.f7207c && this.f7206b - nanoTime <= 0) {
            this.f7207c = true;
        }
        return timeUnit.convert(this.f7206b - nanoTime, TimeUnit.NANOSECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0490t c0490t = (C0490t) obj;
        C0483l c0483l = c0490t.f7205a;
        C0483l c0483l2 = this.f7205a;
        if (c0483l2 == c0483l) {
            int i7 = ((this.f7206b - c0490t.f7206b) > 0L ? 1 : ((this.f7206b - c0490t.f7206b) == 0L ? 0 : -1));
            if (i7 < 0) {
                return -1;
            }
            if (i7 > 0) {
                return 1;
            }
            return 0;
        }
        throw new AssertionError("Tickers (" + c0483l2 + " and " + c0490t.f7205a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0490t)) {
            return false;
        }
        C0490t c0490t = (C0490t) obj;
        C0483l c0483l = this.f7205a;
        if (c0483l != null ? c0483l != c0490t.f7205a : c0490t.f7205a != null) {
            return false;
        }
        if (this.f7206b == c0490t.f7206b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f7205a, Long.valueOf(this.f7206b)).hashCode();
    }

    public final String toString() {
        long b5 = b(TimeUnit.NANOSECONDS);
        long abs = Math.abs(b5);
        long j = f7202X;
        long j8 = abs / j;
        long abs2 = Math.abs(b5) % j;
        StringBuilder sb = new StringBuilder();
        if (b5 < 0) {
            sb.append('-');
        }
        sb.append(j8);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        C0483l c0483l = f7203d;
        C0483l c0483l2 = this.f7205a;
        if (c0483l2 != c0483l) {
            sb.append(" (ticker=" + c0483l2 + ")");
        }
        return sb.toString();
    }
}
