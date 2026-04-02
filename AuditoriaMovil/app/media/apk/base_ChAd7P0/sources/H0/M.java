package H0;

import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final C0136p f1704a;

    static {
        new SparseBooleanArray();
        K0.a.j(!false);
        K0.x.H(0);
    }

    public M(C0136p c0136p) {
        this.f1704a = c0136p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        return this.f1704a.equals(((M) obj).f1704a);
    }

    public final int hashCode() {
        return this.f1704a.hashCode();
    }
}
