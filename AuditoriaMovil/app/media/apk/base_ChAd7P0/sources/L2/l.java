package l2;

import android.graphics.Rect;
import h0.C1036P;
import i2.C1102b;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final C1102b f13841a;

    /* renamed from: b  reason: collision with root package name */
    public final C1036P f13842b;

    public l(C1102b c1102b, C1036P _windowInsetsCompat) {
        kotlin.jvm.internal.j.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f13841a = c1102b;
        this.f13842b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.class.equals(cls)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        if (kotlin.jvm.internal.j.a(this.f13841a, lVar.f13841a) && kotlin.jvm.internal.j.a(this.f13842b, lVar.f13842b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13842b.hashCode() + (this.f13841a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f13841a + ", windowInsetsCompat=" + this.f13842b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, C1036P insets) {
        this(new C1102b(rect), insets);
        kotlin.jvm.internal.j.e(insets, "insets");
    }
}
