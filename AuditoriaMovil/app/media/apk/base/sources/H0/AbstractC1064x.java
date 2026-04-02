package h0;

import android.view.View;
import android.view.WindowInsets;
/* renamed from: h0.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1064x {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
