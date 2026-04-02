package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: classes.dex */
public final class J {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f14675l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f14676m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f14677a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14678b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f14679c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f14680d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f14681e = -1.0f;
    public int[] f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f14682g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f14683h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f14684i;
    public final Context j;

    /* renamed from: k  reason: collision with root package name */
    public final G f14685k;

    static {
        new ConcurrentHashMap();
    }

    public J(TextView textView) {
        this.f14684i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f14685k = new H();
        } else {
            this.f14685k = new G();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f14676m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (this.f14677a != 0) {
            if (this.f14678b) {
                if (this.f14684i.getMeasuredHeight() > 0 && this.f14684i.getMeasuredWidth() > 0) {
                    if (this.f14685k.b(this.f14684i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f14684i.getMeasuredWidth() - this.f14684i.getTotalPaddingLeft()) - this.f14684i.getTotalPaddingRight();
                    }
                    int height = (this.f14684i.getHeight() - this.f14684i.getCompoundPaddingBottom()) - this.f14684i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f14675l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c8 = c(rectF);
                                if (c8 != this.f14684i.getTextSize()) {
                                    f(c8, 0);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f14678b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.f.length;
        if (length != 0) {
            int i7 = length - 1;
            int i8 = 0;
            int i9 = 1;
            while (i9 <= i7) {
                int i10 = (i9 + i7) / 2;
                int i11 = this.f[i10];
                TextView textView = this.f14684i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int b5 = D.b(textView);
                TextPaint textPaint = this.f14683h;
                if (textPaint == null) {
                    this.f14683h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f14683h.set(textView.getPaint());
                this.f14683h.setTextSize(i11);
                StaticLayout a7 = F.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), b5, textView, this.f14683h, this.f14685k);
                if ((b5 != -1 && (a7.getLineCount() > b5 || a7.getLineEnd(a7.getLineCount() - 1) != charSequence.length())) || a7.getHeight() > rectF.bottom) {
                    i8 = i10 - 1;
                    i7 = i8;
                } else {
                    int i12 = i10 + 1;
                    i8 = i9;
                    i9 = i12;
                }
            }
            return this.f[i8];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(float f, int i7) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i7, f, resources.getDisplayMetrics());
        TextView textView = this.f14684i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a7 = E.a(textView);
            if (textView.getLayout() != null) {
                this.f14678b = false;
                try {
                    Method d7 = d("nullLayouts");
                    if (d7 != null) {
                        d7.invoke(textView, null);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (!a7) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f14677a == 1) {
            if (!this.f14682g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.f14681e - this.f14680d) / this.f14679c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f14679c) + this.f14680d);
                }
                this.f = b(iArr);
            }
            this.f14678b = true;
        } else {
            this.f14678b = false;
        }
        return this.f14678b;
    }

    public final boolean h() {
        int[] iArr;
        int length;
        boolean z7;
        if (this.f.length > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f14682g = z7;
        if (z7) {
            this.f14677a = 1;
            this.f14680d = iArr[0];
            this.f14681e = iArr[length - 1];
            this.f14679c = -1.0f;
        }
        return z7;
    }

    public final void i(float f, float f4, float f8) {
        if (f > 0.0f) {
            if (f4 > f) {
                if (f8 > 0.0f) {
                    this.f14677a = 1;
                    this.f14680d = f;
                    this.f14681e = f4;
                    this.f14679c = f8;
                    this.f14682g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
    }
}
