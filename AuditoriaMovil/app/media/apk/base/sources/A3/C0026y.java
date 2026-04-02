package A3;

import java.io.Serializable;
/* renamed from: A3.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026y extends d0 implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final K1.d f211a;

    public C0026y(K1.d dVar) {
        this.f211a = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f211a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0026y) {
            return this.f211a.equals(((C0026y) obj).f211a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f211a.hashCode();
    }

    public final String toString() {
        return this.f211a.toString();
    }
}
