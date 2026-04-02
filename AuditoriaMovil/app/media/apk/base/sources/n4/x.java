package n4;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final w f14372a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.h f14373b;

    public x(w wVar, q4.h hVar) {
        this.f14372a = wVar;
        this.f14373b = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f14372a.equals(xVar.f14372a) || !this.f14373b.equals(xVar.f14373b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14373b.f15357a.hashCode() + ((this.f14372a.hashCode() + 2077) * 31);
    }
}
