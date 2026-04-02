package U3;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f5732a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5733b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5734c;

    public a(long j, long j8, long j9) {
        this.f5732a = j;
        this.f5733b = j8;
        this.f5734c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5732a == aVar.f5732a && this.f5733b == aVar.f5733b && this.f5734c == aVar.f5734c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5732a;
        long j8 = this.f5733b;
        long j9 = this.f5734c;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f5732a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f5733b);
        sb.append(", uptimeMillis=");
        return AbstractC0059i.C(sb, this.f5734c, "}");
    }
}
