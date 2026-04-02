package h1;
/* renamed from: h1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067a {

    /* renamed from: a  reason: collision with root package name */
    public final long f11217a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11218b;

    public C1067a(long j, long j8) {
        this.f11217a = j;
        this.f11218b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1067a)) {
            return false;
        }
        C1067a c1067a = (C1067a) obj;
        if (this.f11217a == c1067a.f11217a && this.f11218b == c1067a.f11218b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11217a) * 31) + ((int) this.f11218b);
    }
}
