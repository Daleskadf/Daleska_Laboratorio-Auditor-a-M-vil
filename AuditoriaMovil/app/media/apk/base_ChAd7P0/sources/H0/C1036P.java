package h0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
/* renamed from: h0.P  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036P {

    /* renamed from: b  reason: collision with root package name */
    public static final C1036P f11171b;

    /* renamed from: a  reason: collision with root package name */
    public final C1035O f11172a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            f11171b = C1034N.f11168n;
        } else if (i7 >= 30) {
            f11171b = C1033M.f11167m;
        } else {
            f11171b = C1035O.f11169b;
        }
    }

    public C1036P(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            this.f11172a = new C1034N(this, windowInsets);
        } else if (i7 >= 30) {
            this.f11172a = new C1033M(this, windowInsets);
        } else if (i7 >= 29) {
            this.f11172a = new C1032L(this, windowInsets);
        } else if (i7 >= 28) {
            this.f11172a = new C1031K(this, windowInsets);
        } else {
            this.f11172a = new C1030J(this, windowInsets);
        }
    }

    public static Z.c a(Z.c cVar, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, cVar.f6709a - i7);
        int max2 = Math.max(0, cVar.f6710b - i8);
        int max3 = Math.max(0, cVar.f6711c - i9);
        int max4 = Math.max(0, cVar.f6712d - i10);
        if (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) {
            return cVar;
        }
        return Z.c.a(max, max2, max3, max4);
    }

    public static C1036P c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C1036P c1036p = new C1036P(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = AbstractC1066z.f11214a;
            C1036P a7 = AbstractC1060t.a(view);
            C1035O c1035o = c1036p.f11172a;
            c1035o.l(a7);
            c1035o.d(view.getRootView());
            c1035o.n(view.getWindowSystemUiVisibility());
        }
        return c1036p;
    }

    public final WindowInsets b() {
        C1035O c1035o = this.f11172a;
        if (c1035o instanceof AbstractC1029I) {
            return ((AbstractC1029I) c1035o).f11163c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1036P)) {
            return false;
        }
        return Objects.equals(this.f11172a, ((C1036P) obj).f11172a);
    }

    public final int hashCode() {
        C1035O c1035o = this.f11172a;
        if (c1035o == null) {
            return 0;
        }
        return c1035o.hashCode();
    }

    public C1036P() {
        this.f11172a = new C1035O(this);
    }
}
