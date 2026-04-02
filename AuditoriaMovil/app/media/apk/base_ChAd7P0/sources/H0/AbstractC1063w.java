package h0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
/* renamed from: h0.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1063w {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i8);
    }
}
