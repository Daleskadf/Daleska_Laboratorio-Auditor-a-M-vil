package c6;

import D.AbstractC0055e;
import java.util.Arrays;
import java.util.Set;
/* renamed from: c6.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680k0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8876a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8877b;

    /* renamed from: c  reason: collision with root package name */
    public final A3.P f8878c;

    public C0680k0(int i7, long j, Set set) {
        this.f8876a = i7;
        this.f8877b = j;
        this.f8878c = A3.P.p(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0680k0.class != obj.getClass()) {
            return false;
        }
        C0680k0 c0680k0 = (C0680k0) obj;
        if (this.f8876a == c0680k0.f8876a && this.f8877b == c0680k0.f8877b && F.f.l(this.f8878c, c0680k0.f8878c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8876a), Long.valueOf(this.f8877b), this.f8878c});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.d("maxAttempts", String.valueOf(this.f8876a));
        C7.b("hedgingDelayNanos", this.f8877b);
        C7.a(this.f8878c, "nonFatalStatusCodes");
        return C7.toString();
    }
}
