package M3;

import j$.util.Objects;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Class f3258a;

    /* renamed from: b  reason: collision with root package name */
    public final T3.a f3259b;

    public s(Class cls, T3.a aVar) {
        this.f3258a = cls;
        this.f3259b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!sVar.f3258a.equals(this.f3258a) || !sVar.f3259b.equals(this.f3259b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f3258a, this.f3259b);
    }

    public final String toString() {
        return this.f3258a.getSimpleName() + ", object identifier: " + this.f3259b;
    }
}
