package M3;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Class f3248a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f3249b;

    public o(Class cls, Class cls2) {
        this.f3248a = cls;
        this.f3249b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!oVar.f3248a.equals(this.f3248a) || !oVar.f3249b.equals(this.f3249b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f3248a, this.f3249b);
    }

    public final String toString() {
        return this.f3248a.getSimpleName() + " with primitive type: " + this.f3249b.getSimpleName();
    }
}
