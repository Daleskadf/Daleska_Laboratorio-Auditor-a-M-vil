package J2;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f2397a;

    /* renamed from: b  reason: collision with root package name */
    public final D2.b f2398b;

    /* renamed from: c  reason: collision with root package name */
    public final D2.a f2399c;

    public b(long j, D2.b bVar, D2.a aVar) {
        this.f2397a = j;
        this.f2398b = bVar;
        this.f2399c = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2397a == bVar.f2397a && this.f2398b.equals(bVar.f2398b) && this.f2399c.equals(bVar.f2399c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2397a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f2398b.hashCode()) * 1000003) ^ this.f2399c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f2397a + ", transportContext=" + this.f2398b + ", event=" + this.f2399c + "}";
    }
}
