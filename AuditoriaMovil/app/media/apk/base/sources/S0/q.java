package S0;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final long f4904a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4905b;

    public q(long j, long j8) {
        this.f4904a = j;
        this.f4905b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f4904a == qVar.f4904a && this.f4905b == qVar.f4905b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4904a) * 31) + ((int) this.f4905b);
    }
}
