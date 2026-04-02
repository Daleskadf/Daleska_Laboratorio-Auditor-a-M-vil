package b0;

import android.os.Build;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4368a;

    public h(Object obj) {
        this.f4368a = obj;
    }

    public static h e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new h(obj);
    }

    public int a() {
        int safeInsetBottom;
        if (Build.VERSION.SDK_INT >= 28) {
            safeInsetBottom = c.a(this.f4368a).getSafeInsetBottom();
            return safeInsetBottom;
        }
        return 0;
    }

    public int b() {
        int safeInsetLeft;
        if (Build.VERSION.SDK_INT >= 28) {
            safeInsetLeft = c.a(this.f4368a).getSafeInsetLeft();
            return safeInsetLeft;
        }
        return 0;
    }

    public int c() {
        int safeInsetRight;
        if (Build.VERSION.SDK_INT >= 28) {
            safeInsetRight = c.a(this.f4368a).getSafeInsetRight();
            return safeInsetRight;
        }
        return 0;
    }

    public int d() {
        int safeInsetTop;
        if (Build.VERSION.SDK_INT >= 28) {
            safeInsetTop = c.a(this.f4368a).getSafeInsetTop();
            return safeInsetTop;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            return a0.c.a(this.f4368a, ((h) obj).f4368a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f4368a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f4368a + "}";
    }
}
