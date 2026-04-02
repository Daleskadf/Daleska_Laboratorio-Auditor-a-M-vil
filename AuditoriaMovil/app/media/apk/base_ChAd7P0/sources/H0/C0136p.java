package H0;

import android.util.SparseBooleanArray;
/* renamed from: H0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136p {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f1831a;

    public C0136p(SparseBooleanArray sparseBooleanArray) {
        this.f1831a = sparseBooleanArray;
    }

    public final int a(int i7) {
        SparseBooleanArray sparseBooleanArray = this.f1831a;
        K0.a.g(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0136p)) {
            return false;
        }
        C0136p c0136p = (C0136p) obj;
        int i7 = K0.x.f2529a;
        SparseBooleanArray sparseBooleanArray = this.f1831a;
        if (i7 < 24) {
            if (sparseBooleanArray.size() != c0136p.f1831a.size()) {
                return false;
            }
            for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
                if (a(i8) != c0136p.a(i8)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray.equals(c0136p.f1831a);
    }

    public final int hashCode() {
        int i7 = K0.x.f2529a;
        SparseBooleanArray sparseBooleanArray = this.f1831a;
        if (i7 < 24) {
            int size = sparseBooleanArray.size();
            for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
                size = (size * 31) + a(i8);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
