package p;

import D.AbstractC0055e;
import a.AbstractC0412a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b4.C0597e;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.C0927b;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k0.InterfaceC1383j;
import r3.AbstractC1740d;
/* renamed from: p.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1570C extends TextView implements InterfaceC1383j {

    /* renamed from: a  reason: collision with root package name */
    public final h1.t f14639a;

    /* renamed from: b  reason: collision with root package name */
    public final C1620z f14640b;

    /* renamed from: c  reason: collision with root package name */
    public final C1608t f14641c;

    /* renamed from: d  reason: collision with root package name */
    public C1599o f14642d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14643e;

    /* renamed from: e0  reason: collision with root package name */
    public Future f14644e0;
    public C0927b f;

    public C1570C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private C1599o getEmojiTextViewHelper() {
        if (this.f14642d == null) {
            this.f14642d = new C1599o(this);
        }
        return this.f14642d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h1.t tVar = this.f14639a;
        if (tVar != null) {
            tVar.l();
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    public final void f() {
        Future future = this.f14644e0;
        if (future != null) {
            try {
                this.f14644e0 = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    AbstractC0412a.v(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b1.f14783a) {
            return super.getAutoSizeMaxTextSize();
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            return Math.round(c1620z.f14896i.f14681e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b1.f14783a) {
            return super.getAutoSizeMinTextSize();
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            return Math.round(c1620z.f14896i.f14680d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b1.f14783a) {
            return super.getAutoSizeStepGranularity();
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            return Math.round(c1620z.f14896i.f14679c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b1.f14783a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            return c1620z.f14896i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (b1.f14783a) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C1620z c1620z = this.f14640b;
        if (c1620z == null) {
            return 0;
        }
        return c1620z.f14896i.f14677a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0412a.f0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1568A getSuperCaller() {
        if (this.f == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                this.f = new C1569B(this);
            } else if (i7 >= 26) {
                this.f = new C0927b(this);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0597e c0597e;
        h1.t tVar = this.f14639a;
        if (tVar == null || (c0597e = (C0597e) tVar.f11321e) == null) {
            return null;
        }
        return (ColorStateList) c0597e.f8248c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0597e c0597e;
        h1.t tVar = this.f14639a;
        if (tVar == null || (c0597e = (C0597e) tVar.f11321e) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0597e.f8249d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0597e c0597e = this.f14640b.f14895h;
        if (c0597e != null) {
            return (ColorStateList) c0597e.f8248c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0597e c0597e = this.f14640b.f14895h;
        if (c0597e != null) {
            return (PorterDuff.Mode) c0597e.f8249d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1608t c1608t;
        if (Build.VERSION.SDK_INT < 28 && (c1608t = this.f14641c) != null) {
            TextClassifier textClassifier = (TextClassifier) c1608t.f14881c;
            if (textClassifier == null) {
                return AbstractC1606s.a((C1570C) c1608t.f14880b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public f0.d getTextMetricsParamsCompat() {
        return AbstractC0412a.v(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i7;
        int i8;
        CharSequence subSequence;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14640b.getClass();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i9 >= 30) {
                F.d.i(editorInfo, text);
            } else {
                text.getClass();
                if (i9 >= 30) {
                    F.d.i(editorInfo, text);
                } else {
                    int i10 = editorInfo.initialSelStart;
                    int i11 = editorInfo.initialSelEnd;
                    if (i10 > i11) {
                        i7 = i11;
                    } else {
                        i7 = i10;
                    }
                    if (i10 <= i11) {
                        i10 = i11;
                    }
                    int length = text.length();
                    if (i7 >= 0 && i10 <= length) {
                        int i12 = editorInfo.inputType & 4095;
                        if (i12 != 129 && i12 != 225 && i12 != 18) {
                            if (length <= 2048) {
                                AbstractC0055e.y(editorInfo, text, i7, i10);
                            } else {
                                int i13 = i10 - i7;
                                if (i13 > 1024) {
                                    i8 = 0;
                                } else {
                                    i8 = i13;
                                }
                                int i14 = RecognitionOptions.PDF417 - i8;
                                int min = Math.min(text.length() - i10, i14 - Math.min(i7, (int) (i14 * 0.8d)));
                                int min2 = Math.min(i7, i14 - min);
                                int i15 = i7 - min2;
                                if (Character.isLowSurrogate(text.charAt(i15))) {
                                    i15++;
                                    min2--;
                                }
                                if (Character.isHighSurrogate(text.charAt((i10 + min) - 1))) {
                                    min--;
                                }
                                int i16 = min2 + i8;
                                int i17 = i16 + min;
                                if (i8 != i13) {
                                    subSequence = TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i10, min + i10));
                                } else {
                                    subSequence = text.subSequence(i15, i17 + i15);
                                }
                                AbstractC0055e.y(editorInfo, subSequence, min2, i16);
                            }
                        } else {
                            AbstractC0055e.y(editorInfo, null, 0, 0);
                        }
                    } else {
                        AbstractC0055e.y(editorInfo, null, 0, 0);
                    }
                }
            }
        }
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        C1620z c1620z = this.f14640b;
        if (c1620z != null && !b1.f14783a) {
            c1620z.f14896i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        f();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C1620z c1620z = this.f14640b;
        if (c1620z != null && !b1.f14783a) {
            J j = c1620z.f14896i;
            if (j.f14677a != 0) {
                j.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        ((AbstractC0055e) getEmojiTextViewHelper().f14856b.f10587a).w(z7);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (b1.f14783a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            J j = c1620z.f14896i;
            DisplayMetrics displayMetrics = j.j.getResources().getDisplayMetrics();
            j.i(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (j.g()) {
                j.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (b1.f14783a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            J j = c1620z.f14896i;
            j.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = j.j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                j.f = J.b(iArr2);
                if (!j.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                j.f14682g = false;
            }
            if (j.g()) {
                j.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (b1.f14783a) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            J j = c1620z.f14896i;
            if (i7 != 0) {
                if (i7 == 1) {
                    DisplayMetrics displayMetrics = j.j.getResources().getDisplayMetrics();
                    j.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (j.g()) {
                        j.a();
                        return;
                    }
                    return;
                }
                j.getClass();
                throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Unknown auto-size text type: "));
            }
            j.f14677a = 0;
            j.f14680d = -1.0f;
            j.f14681e = -1.0f;
            j.f14679c = -1.0f;
            j.f = new int[0];
            j.f14678b = false;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h1.t tVar = this.f14639a;
        if (tVar != null) {
            tVar.f11317a = -1;
            tVar.r(null);
            tVar.l();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h1.t tVar = this.f14639a;
        if (tVar != null) {
            tVar.p(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0412a.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        ((AbstractC0055e) getEmojiTextViewHelper().f14856b.f10587a).x(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0055e) getEmojiTextViewHelper().f14856b.f10587a).i(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().s(i7);
        } else {
            AbstractC0412a.S(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i7);
        } else {
            AbstractC0412a.T(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        if (i7 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i7 != fontMetricsInt) {
                setLineSpacing(i7 - fontMetricsInt, 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setPrecomputedText(f0.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0412a.v(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h1.t tVar = this.f14639a;
        if (tVar != null) {
            tVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h1.t tVar = this.f14639a;
        if (tVar != null) {
            tVar.t(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b4.e, java.lang.Object] */
    @Override // k0.InterfaceC1383j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z7;
        C1620z c1620z = this.f14640b;
        if (c1620z.f14895h == null) {
            c1620z.f14895h = new Object();
        }
        C0597e c0597e = c1620z.f14895h;
        c0597e.f8248c = colorStateList;
        if (colorStateList != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        c0597e.f8247b = z7;
        c1620z.f14890b = c0597e;
        c1620z.f14891c = c0597e;
        c1620z.f14892d = c0597e;
        c1620z.f14893e = c0597e;
        c1620z.f = c0597e;
        c1620z.f14894g = c0597e;
        c1620z.b();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b4.e, java.lang.Object] */
    @Override // k0.InterfaceC1383j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z7;
        C1620z c1620z = this.f14640b;
        if (c1620z.f14895h == null) {
            c1620z.f14895h = new Object();
        }
        C0597e c0597e = c1620z.f14895h;
        c0597e.f8249d = mode;
        if (mode != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        c0597e.f8246a = z7;
        c1620z.f14890b = c0597e;
        c1620z.f14891c = c0597e;
        c1620z.f14892d = c0597e;
        c1620z.f14893e = c0597e;
        c1620z.f = c0597e;
        c1620z.f14894g = c0597e;
        c1620z.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            c1620z.e(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1608t c1608t;
        if (Build.VERSION.SDK_INT < 28 && (c1608t = this.f14641c) != null) {
            c1608t.f14881c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<f0.e> future) {
        this.f14644e0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(f0.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f10971b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        getPaint().set(dVar.f10970a);
        setBreakStrategy(dVar.f10972c);
        setHyphenationFrequency(dVar.f10973d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f) {
        boolean z7 = b1.f14783a;
        if (z7) {
            super.setTextSize(i7, f);
            return;
        }
        C1620z c1620z = this.f14640b;
        if (c1620z != null && !z7) {
            J j = c1620z.f14896i;
            if (j.f14677a == 0) {
                j.f(f, i7);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typeface2;
        if (this.f14643e) {
            return;
        }
        if (typeface != null && i7 > 0) {
            Context context = getContext();
            android.support.v4.media.session.a aVar = Z.f.f6716a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i7);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f14643e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f14643e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570C(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        L0.a(context);
        this.f14643e = false;
        this.f = null;
        K0.a(this, getContext());
        h1.t tVar = new h1.t(this);
        this.f14639a = tVar;
        tVar.o(attributeSet, i7);
        C1620z c1620z = new C1620z(this);
        this.f14640b = c1620z;
        c1620z.d(attributeSet, i7);
        c1620z.b();
        C1608t c1608t = new C1608t(0, false);
        c1608t.f14880b = this;
        this.f14641c = c1608t;
        getEmojiTextViewHelper().a(attributeSet, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? AbstractC1740d.o(context, i7) : null, i8 != 0 ? AbstractC1740d.o(context, i8) : null, i9 != 0 ? AbstractC1740d.o(context, i9) : null, i10 != 0 ? AbstractC1740d.o(context, i10) : null);
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            c1620z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? AbstractC1740d.o(context, i7) : null, i8 != 0 ? AbstractC1740d.o(context, i8) : null, i9 != 0 ? AbstractC1740d.o(context, i9) : null, i10 != 0 ? AbstractC1740d.o(context, i10) : null);
        C1620z c1620z = this.f14640b;
        if (c1620z != null) {
            c1620z.b();
        }
    }
}
