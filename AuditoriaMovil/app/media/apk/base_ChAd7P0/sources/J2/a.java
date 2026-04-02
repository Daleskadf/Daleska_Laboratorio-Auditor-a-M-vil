package J2;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public final class a {
    public static final a f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a  reason: collision with root package name */
    public final long f2392a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2393b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2394c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2395d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2396e;

    public a(long j, int i7, int i8, long j8, int i9) {
        this.f2392a = j;
        this.f2393b = i7;
        this.f2394c = i8;
        this.f2395d = j8;
        this.f2396e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2392a == aVar.f2392a && this.f2393b == aVar.f2393b && this.f2394c == aVar.f2394c && this.f2395d == aVar.f2395d && this.f2396e == aVar.f2396e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2392a;
        long j8 = this.f2395d;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f2393b) * 1000003) ^ this.f2394c) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f2396e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f2392a);
        sb.append(", loadBatchSize=");
        sb.append(this.f2393b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f2394c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f2395d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC0059i.B(sb, this.f2396e, "}");
    }
}
