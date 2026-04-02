package p;

import android.widget.TextView;
/* renamed from: p.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1616x {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i7, int i8, int i9, int i10) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
    }

    public static void c(TextView textView, int[] iArr, int i7) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
