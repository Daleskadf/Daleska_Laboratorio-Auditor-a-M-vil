package h0;

import android.view.View;
import android.view.WindowInsets;
/* renamed from: h0.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1058r {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i7 = AbstractC1022B.f11152a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
