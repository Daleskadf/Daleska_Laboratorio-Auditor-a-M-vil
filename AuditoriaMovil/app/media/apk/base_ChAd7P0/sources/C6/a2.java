package c6;

import D.AbstractC0055e;
import java.util.Arrays;
import java.util.Set;
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8766a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8767b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8768c;

    /* renamed from: d  reason: collision with root package name */
    public final double f8769d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f8770e;
    public final A3.P f;

    public a2(int i7, long j, long j8, double d7, Long l8, Set set) {
        this.f8766a = i7;
        this.f8767b = j;
        this.f8768c = j8;
        this.f8769d = d7;
        this.f8770e = l8;
        this.f = A3.P.p(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        if (this.f8766a != a2Var.f8766a || this.f8767b != a2Var.f8767b || this.f8768c != a2Var.f8768c || Double.compare(this.f8769d, a2Var.f8769d) != 0 || !F.f.l(this.f8770e, a2Var.f8770e) || !F.f.l(this.f, a2Var.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8766a), Long.valueOf(this.f8767b), Long.valueOf(this.f8768c), Double.valueOf(this.f8769d), this.f8770e, this.f});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.d("maxAttempts", String.valueOf(this.f8766a));
        C7.b("initialBackoffNanos", this.f8767b);
        C7.b("maxBackoffNanos", this.f8768c);
        C7.d("backoffMultiplier", String.valueOf(this.f8769d));
        C7.a(this.f8770e, "perAttemptRecvTimeoutNanos");
        C7.a(this.f, "retryableStatusCodes");
        return C7.toString();
    }
}
