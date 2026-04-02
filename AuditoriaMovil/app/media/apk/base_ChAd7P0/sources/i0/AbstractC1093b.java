package i0;

import android.app.ActivityManager;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
/* renamed from: i0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1093b {
    public static /* synthetic */ ActivityManager.TaskDescription c(int i7, String str) {
        return new ActivityManager.TaskDescription(str, 0, i7);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout e(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean l(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
