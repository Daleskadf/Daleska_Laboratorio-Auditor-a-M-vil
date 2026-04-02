package h0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
/* renamed from: h0.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1059s {
    public static C1036P a(View view, C1036P c1036p, Rect rect) {
        WindowInsets b5 = c1036p.b();
        if (b5 != null) {
            return C1036P.c(view, view.computeSystemWindowInsets(b5, rect));
        }
        rect.setEmpty();
        return c1036p;
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode c(View view) {
        return view.getBackgroundTintMode();
    }

    public static void d(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void e(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void f(View view) {
        view.stopNestedScroll();
    }
}
