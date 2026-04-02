package M3;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Class f3260a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f3261b;

    public t(Class cls, Class cls2) {
        this.f3260a = cls;
        this.f3261b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!tVar.f3260a.equals(this.f3260a) || !tVar.f3261b.equals(this.f3261b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f3260a, this.f3261b);
    }

    public final String toString() {
        return this.f3260a.getSimpleName() + " with serialization type: " + this.f3261b.getSimpleName();
    }
}
