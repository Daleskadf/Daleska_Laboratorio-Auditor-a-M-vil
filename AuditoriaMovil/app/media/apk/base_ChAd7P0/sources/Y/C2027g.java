package y;

import android.os.Build;
/* renamed from: y.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2027g {

    /* renamed from: a  reason: collision with root package name */
    public final C2025e f16577a;

    public C2027g(C2025e c2025e) {
        this.f16577a = c2025e;
    }

    public static C2027g a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new C2027g(new C2025e(obj));
        }
        return new C2027g(new C2025e(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2027g)) {
            return false;
        }
        return this.f16577a.equals(((C2027g) obj).f16577a);
    }

    public final int hashCode() {
        return this.f16577a.hashCode();
    }

    public final String toString() {
        return this.f16577a.toString();
    }
}
