package A3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class m0 extends d0 implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f173a;

    public m0(d0 d0Var) {
        this.f173a = d0Var;
    }

    @Override // A3.d0
    public final d0 a() {
        return this.f173a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f173a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0) {
            return this.f173a.equals(((m0) obj).f173a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f173a.hashCode();
    }

    public final String toString() {
        return this.f173a + ".reverse()";
    }
}
