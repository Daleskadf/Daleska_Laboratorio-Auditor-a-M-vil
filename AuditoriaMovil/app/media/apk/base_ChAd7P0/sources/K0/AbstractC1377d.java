package k0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
/* renamed from: k0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1377d {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f, float f4) {
        try {
            return edgeEffect.onPullDistance(f, f4);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f4);
            return 0.0f;
        }
    }
}
