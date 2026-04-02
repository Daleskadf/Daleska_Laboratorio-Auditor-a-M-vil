package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import i.AbstractC1091a;
/* loaded from: classes.dex */
public abstract class K0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f14688a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f14689b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f14690c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f14691d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f14692e = {16842912};
    public static final int[] f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f14693g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1091a.f11357h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i7) {
        ColorStateList d7 = d(context, i7);
        if (d7 != null && d7.isStateful()) {
            return d7.getColorForState(f14689b, d7.getDefaultColor());
        }
        ThreadLocal threadLocal = f14688a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f4 = typedValue.getFloat();
        int c8 = c(context, i7);
        int round = Math.round(Color.alpha(c8) * f4);
        int i8 = Z.a.f6707a;
        if (round >= 0 && round <= 255) {
            return (c8 & 16777215) | (round << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int c(Context context, int i7) {
        int[] iArr = f14693g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i7) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f14693g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = X.d.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
