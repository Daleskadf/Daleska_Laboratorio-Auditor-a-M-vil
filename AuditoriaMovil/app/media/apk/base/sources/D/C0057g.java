package D;
/* renamed from: D.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057g {

    /* renamed from: a  reason: collision with root package name */
    public final int f700a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f701b;

    public C0057g(int i7, Throwable th) {
        this.f700a = i7;
        this.f701b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0057g)) {
            return false;
        }
        C0057g c0057g = (C0057g) obj;
        if (this.f700a == c0057g.f700a) {
            Throwable th = c0057g.f701b;
            Throwable th2 = this.f701b;
            if (th2 == null) {
                if (th == null) {
                    return true;
                }
            } else if (th2.equals(th)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = (this.f700a ^ 1000003) * 1000003;
        Throwable th = this.f701b;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return i7 ^ hashCode;
    }

    public final String toString() {
        return "StateError{code=" + this.f700a + ", cause=" + this.f701b + "}";
    }
}
