package H6;
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f2068a;

    public h(Throwable th) {
        this.f2068a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (kotlin.jvm.internal.j.a(this.f2068a, ((h) obj).f2068a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f2068a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // H6.i
    public final String toString() {
        return "Closed(" + this.f2068a + ')';
    }
}
