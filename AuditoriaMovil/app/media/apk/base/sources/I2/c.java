package I2;

import java.util.Set;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f2177a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2178b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f2179c;

    public c(long j, long j8, Set set) {
        this.f2177a = j;
        this.f2178b = j8;
        this.f2179c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2177a == cVar.f2177a && this.f2178b == cVar.f2178b && this.f2179c.equals(cVar.f2179c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2177a;
        long j8 = this.f2178b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f2179c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f2177a + ", maxAllowedDelay=" + this.f2178b + ", flags=" + this.f2179c + "}";
    }
}
