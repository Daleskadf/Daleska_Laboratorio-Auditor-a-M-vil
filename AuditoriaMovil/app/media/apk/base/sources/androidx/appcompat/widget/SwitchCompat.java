package androidx.appcompat.widget;

import D.AbstractC0055e;
import R1.j;
import a.AbstractC0412a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.example.appecoactivate.R;
import h0.AbstractC1066z;
import h0.C1055o;
import i.AbstractC1091a;
import java.lang.reflect.Field;
import m.C1424a;
import p.C1599o;
import p.C1620z;
import p.H0;
import p.I0;
import p.J0;
import p.K0;
import p.O;
import p.b1;
import r3.AbstractC1740d;
import u0.C1852h;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: P0  reason: collision with root package name */
    public static final H0 f7399P0 = new Property(Float.class, "thumbPos");

    /* renamed from: Q0  reason: collision with root package name */
    public static final int[] f7400Q0 = {16842912};

    /* renamed from: A0  reason: collision with root package name */
    public int f7401A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f7402B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f7403C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f7404D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f7405E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f7406F0;

    /* renamed from: G0  reason: collision with root package name */
    public final TextPaint f7407G0;

    /* renamed from: H0  reason: collision with root package name */
    public final ColorStateList f7408H0;

    /* renamed from: I0  reason: collision with root package name */
    public StaticLayout f7409I0;

    /* renamed from: J0  reason: collision with root package name */
    public StaticLayout f7410J0;

    /* renamed from: K0  reason: collision with root package name */
    public final C1424a f7411K0;

    /* renamed from: L0  reason: collision with root package name */
    public ObjectAnimator f7412L0;

    /* renamed from: M0  reason: collision with root package name */
    public C1599o f7413M0;

    /* renamed from: N0  reason: collision with root package name */
    public J0 f7414N0;

    /* renamed from: O0  reason: collision with root package name */
    public final Rect f7415O0;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f7416a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f7417b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f7418c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7419d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7420e;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f7421e0;
    public Drawable f;

    /* renamed from: f0  reason: collision with root package name */
    public PorterDuff.Mode f7422f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f7423g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7424h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7425i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f7426j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f7427k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7428l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f7429m0;

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f7430n0;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f7431o0;

    /* renamed from: p0  reason: collision with root package name */
    public CharSequence f7432p0;
    public boolean q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f7433r0;

    /* renamed from: s0  reason: collision with root package name */
    public final int f7434s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f7435t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f7436u0;

    /* renamed from: v0  reason: collision with root package name */
    public final VelocityTracker f7437v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f7438w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f7439x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f7440y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f7441z0;

    /* JADX WARN: Type inference failed for: r0v15, types: [m.a, java.lang.Object] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i7;
        int resourceId;
        this.f7417b = null;
        this.f7418c = null;
        this.f7419d = false;
        this.f7420e = false;
        this.f7421e0 = null;
        this.f7422f0 = null;
        this.f7423g0 = false;
        this.f7424h0 = false;
        this.f7437v0 = VelocityTracker.obtain();
        this.f7406F0 = true;
        this.f7415O0 = new Rect();
        K0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f7407G0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC1091a.f11366r;
        j J02 = j.J0(context, attributeSet, iArr, R.attr.switchStyle);
        AbstractC1066z.d(this, context, iArr, attributeSet, (TypedArray) J02.f4683c, R.attr.switchStyle);
        Drawable u02 = J02.u0(2);
        this.f7416a = u02;
        if (u02 != null) {
            u02.setCallback(this);
        }
        Drawable u03 = J02.u0(11);
        this.f = u03;
        if (u03 != null) {
            u03.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) J02.f4683c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.q0 = typedArray.getBoolean(3, true);
        this.f7425i0 = typedArray.getDimensionPixelSize(8, 0);
        this.f7426j0 = typedArray.getDimensionPixelSize(5, 0);
        this.f7427k0 = typedArray.getDimensionPixelSize(6, 0);
        this.f7428l0 = typedArray.getBoolean(4, false);
        ColorStateList s02 = J02.s0(9);
        if (s02 != null) {
            this.f7417b = s02;
            this.f7419d = true;
        }
        PorterDuff.Mode c8 = O.c(typedArray.getInt(10, -1), null);
        if (this.f7418c != c8) {
            this.f7418c = c8;
            this.f7420e = true;
        }
        if (this.f7419d || this.f7420e) {
            a();
        }
        ColorStateList s03 = J02.s0(12);
        if (s03 != null) {
            this.f7421e0 = s03;
            this.f7423g0 = true;
        }
        PorterDuff.Mode c9 = O.c(typedArray.getInt(13, -1), null);
        if (this.f7422f0 != c9) {
            this.f7422f0 = c9;
            this.f7424h0 = true;
        }
        if (this.f7423g0 || this.f7424h0) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC1091a.f11367s);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = X.d.getColorStateList(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f7408H0 = colorStateList;
            } else {
                this.f7408H0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i8 = obtainStyledAttributes.getInt(1, -1);
            int i9 = obtainStyledAttributes.getInt(2, -1);
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i9 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i9);
                } else {
                    create = Typeface.create(typeface, i9);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i7 = create.getStyle();
                } else {
                    i7 = 0;
                }
                int i10 = (~i7) & i9;
                textPaint.setFakeBoldText((i10 & 1) != 0);
                textPaint.setTextSkewX((2 & i10) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f13881a = context2.getResources().getConfiguration().locale;
                this.f7411K0 = obj;
            } else {
                this.f7411K0 = null;
            }
            setTextOnInternal(this.f7429m0);
            setTextOffInternal(this.f7431o0);
            obtainStyledAttributes.recycle();
        }
        new C1620z(this).d(attributeSet, R.attr.switchStyle);
        J02.O0();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7434s0 = viewConfiguration.getScaledTouchSlop();
        this.f7438w0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C1599o getEmojiTextViewHelper() {
        if (this.f7413M0 == null) {
            this.f7413M0 = new C1599o(this);
        }
        return this.f7413M0;
    }

    private boolean getTargetCheckedState() {
        if (this.f7439x0 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (b1.a(this)) {
            f = 1.0f - this.f7439x0;
        } else {
            f = this.f7439x0;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f;
        if (drawable != null) {
            Rect rect2 = this.f7415O0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f7416a;
            if (drawable2 != null) {
                rect = O.b(drawable2);
            } else {
                rect = O.f14704c;
            }
            return ((((this.f7440y0 - this.f7401A0) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f7431o0 = charSequence;
        C1599o emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod F7 = ((AbstractC0055e) emojiTextViewHelper.f14856b.f10587a).F(this.f7411K0);
        if (F7 != null) {
            charSequence = F7.getTransformation(charSequence, this);
        }
        this.f7432p0 = charSequence;
        this.f7410J0 = null;
        if (this.q0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f7429m0 = charSequence;
        C1599o emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod F7 = ((AbstractC0055e) emojiTextViewHelper.f14856b.f10587a).F(this.f7411K0);
        if (F7 != null) {
            charSequence = F7.getTransformation(charSequence, this);
        }
        this.f7430n0 = charSequence;
        this.f7409I0 = null;
        if (this.q0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f7416a;
        if (drawable != null) {
            if (this.f7419d || this.f7420e) {
                Drawable mutate = drawable.mutate();
                this.f7416a = mutate;
                if (this.f7419d) {
                    mutate.setTintList(this.f7417b);
                }
                if (this.f7420e) {
                    this.f7416a.setTintMode(this.f7418c);
                }
                if (this.f7416a.isStateful()) {
                    this.f7416a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.f7423g0 || this.f7424h0) {
                Drawable mutate = drawable.mutate();
                this.f = mutate;
                if (this.f7423g0) {
                    mutate.setTintList(this.f7421e0);
                }
                if (this.f7424h0) {
                    this.f.setTintMode(this.f7422f0);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f7429m0);
        setTextOffInternal(this.f7431o0);
        requestLayout();
    }

    public final void d() {
        if (this.f7414N0 == null && ((AbstractC0055e) this.f7413M0.f14856b.f10587a).m() && C1852h.j != null) {
            C1852h a7 = C1852h.a();
            int b5 = a7.b();
            if (b5 == 3 || b5 == 0) {
                J0 j02 = new J0(this);
                this.f7414N0 = j02;
                a7.f(j02);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i7;
        int i8;
        int i9 = this.f7402B0;
        int i10 = this.f7403C0;
        int i11 = this.f7404D0;
        int i12 = this.f7405E0;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.f7416a;
        if (drawable != null) {
            rect = O.b(drawable);
        } else {
            rect = O.f14704c;
        }
        Drawable drawable2 = this.f;
        Rect rect2 = this.f7415O0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i13 = rect2.left;
            thumbOffset += i13;
            if (rect != null) {
                int i14 = rect.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = rect.top;
                int i16 = rect2.top;
                if (i15 > i16) {
                    i7 = (i15 - i16) + i10;
                } else {
                    i7 = i10;
                }
                int i17 = rect.right;
                int i18 = rect2.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                    this.f.setBounds(i9, i7, i11, i8);
                }
            } else {
                i7 = i10;
            }
            i8 = i12;
            this.f.setBounds(i9, i7, i11, i8);
        }
        Drawable drawable3 = this.f7416a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i21 = thumbOffset - rect2.left;
            int i22 = thumbOffset + this.f7401A0 + rect2.right;
            this.f7416a.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f4) {
        super.drawableHotspotChanged(f, f4);
        Drawable drawable = this.f7416a;
        if (drawable != null) {
            drawable.setHotspot(f, f4);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z7;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7416a;
        if (drawable != null && drawable.isStateful()) {
            z7 = drawable.setState(drawableState);
        } else {
            z7 = false;
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            z7 |= drawable2.setState(drawableState);
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!b1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f7440y0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f7427k0;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (b1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f7440y0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f7427k0;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0412a.f0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.q0;
    }

    public boolean getSplitTrack() {
        return this.f7428l0;
    }

    public int getSwitchMinWidth() {
        return this.f7426j0;
    }

    public int getSwitchPadding() {
        return this.f7427k0;
    }

    public CharSequence getTextOff() {
        return this.f7431o0;
    }

    public CharSequence getTextOn() {
        return this.f7429m0;
    }

    public Drawable getThumbDrawable() {
        return this.f7416a;
    }

    public final float getThumbPosition() {
        return this.f7439x0;
    }

    public int getThumbTextPadding() {
        return this.f7425i0;
    }

    public ColorStateList getThumbTintList() {
        return this.f7417b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f7418c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.f7421e0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f7422f0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7416a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f7412L0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f7412L0.end();
            this.f7412L0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7400Q0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.f7415O0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.f7403C0;
        int i8 = this.f7405E0;
        int i9 = i7 + rect.top;
        int i10 = i8 - rect.bottom;
        Drawable drawable2 = this.f7416a;
        if (drawable != null) {
            if (this.f7428l0 && drawable2 != null) {
                Rect b5 = O.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b5.left;
                rect.right -= b5.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f7409I0;
        } else {
            staticLayout = this.f7410J0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f7408H0;
            TextPaint textPaint = this.f7407G0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i9 + i10) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f7429m0;
            } else {
                charSequence = this.f7431o0;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11;
        int width;
        int i12;
        int i13;
        int i14;
        super.onLayout(z7, i7, i8, i9, i10);
        int i15 = 0;
        if (this.f7416a != null) {
            Drawable drawable = this.f;
            Rect rect = this.f7415O0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b5 = O.b(this.f7416a);
            i11 = Math.max(0, b5.left - rect.left);
            i15 = Math.max(0, b5.right - rect.right);
        } else {
            i11 = 0;
        }
        if (b1.a(this)) {
            i12 = getPaddingLeft() + i11;
            width = ((this.f7440y0 + i12) - i11) - i15;
        } else {
            width = (getWidth() - getPaddingRight()) - i15;
            i12 = (width - this.f7440y0) + i11 + i15;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i14 = getPaddingTop();
                i13 = this.f7441z0 + i14;
            } else {
                i13 = getHeight() - getPaddingBottom();
                i14 = i13 - this.f7441z0;
            }
        } else {
            int paddingTop = getPaddingTop();
            int i16 = this.f7441z0;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i16 / 2);
            i13 = i16 + height;
            i14 = height;
        }
        this.f7402B0 = i12;
        this.f7403C0 = i14;
        this.f7405E0 = i13;
        this.f7404D0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (this.q0) {
            StaticLayout staticLayout = this.f7409I0;
            TextPaint textPaint = this.f7407G0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f7430n0;
                if (charSequence != null) {
                    i14 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i14 = 0;
                }
                this.f7409I0 = new StaticLayout(charSequence, textPaint, i14, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f7410J0 == null) {
                CharSequence charSequence2 = this.f7432p0;
                if (charSequence2 != null) {
                    i13 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i13 = 0;
                }
                this.f7410J0 = new StaticLayout(charSequence2, textPaint, i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f7416a;
        Rect rect = this.f7415O0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i9 = (this.f7416a.getIntrinsicWidth() - rect.left) - rect.right;
            i10 = this.f7416a.getIntrinsicHeight();
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (this.q0) {
            i11 = (this.f7425i0 * 2) + Math.max(this.f7409I0.getWidth(), this.f7410J0.getWidth());
        } else {
            i11 = 0;
        }
        this.f7401A0 = Math.max(i11, i9);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f7416a;
        if (drawable3 != null) {
            Rect b5 = O.b(drawable3);
            i16 = Math.max(i16, b5.left);
            i17 = Math.max(i17, b5.right);
        }
        if (this.f7406F0) {
            i12 = Math.max(this.f7426j0, (this.f7401A0 * 2) + i16 + i17);
        } else {
            i12 = this.f7426j0;
        }
        int max = Math.max(i15, i10);
        this.f7440y0 = i12;
        this.f7441z0 = max;
        super.onMeasure(i7, i8);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f7429m0;
        } else {
            charSequence = this.f7431o0;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        ((AbstractC0055e) getEmojiTextViewHelper().f14856b.f10587a).w(z7);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        super.setChecked(z7);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence charSequence = this.f7429m0;
                if (charSequence == null) {
                    charSequence = getResources().getString(R.string.abc_capital_on);
                }
                CharSequence charSequence2 = charSequence;
                Field field = AbstractC1066z.f11214a;
                new C1055o(R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, charSequence2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence3 = this.f7431o0;
            if (charSequence3 == null) {
                charSequence3 = getResources().getString(R.string.abc_capital_off);
            }
            CharSequence charSequence4 = charSequence3;
            Field field2 = AbstractC1066z.f11214a;
            new C1055o(R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, charSequence4);
        }
        float f = 0.0f;
        if (getWindowToken() != null) {
            Field field3 = AbstractC1066z.f11214a;
            if (isLaidOut()) {
                if (isChecked) {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f7399P0, f);
                this.f7412L0 = ofFloat;
                ofFloat.setDuration(250L);
                I0.a(this.f7412L0, true);
                this.f7412L0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f7412L0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0412a.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        ((AbstractC0055e) getEmojiTextViewHelper().f14856b.f10587a).x(z7);
        setTextOnInternal(this.f7429m0);
        setTextOffInternal(this.f7431o0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z7) {
        this.f7406F0 = z7;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0055e) getEmojiTextViewHelper().f14856b.f10587a).i(inputFilterArr));
    }

    public void setShowText(boolean z7) {
        if (this.q0 != z7) {
            this.q0 = z7;
            requestLayout();
            if (z7) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z7) {
        this.f7428l0 = z7;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.f7426j0 = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.f7427k0 = i7;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f7407G0;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.f7431o0;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(R.string.abc_capital_off);
            }
            Field field = AbstractC1066z.f11214a;
            new C1055o(R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, charSequence2);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.f7429m0;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(R.string.abc_capital_on);
            }
            Field field = AbstractC1066z.f11214a;
            new C1055o(R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, charSequence2);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7416a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7416a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f7439x0 = f;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(AbstractC1740d.o(getContext(), i7));
    }

    public void setThumbTextPadding(int i7) {
        this.f7425i0 = i7;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f7417b = colorStateList;
        this.f7419d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f7418c = mode;
        this.f7420e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(AbstractC1740d.o(getContext(), i7));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f7421e0 = colorStateList;
        this.f7423g0 = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f7422f0 = mode;
        this.f7424h0 = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f7416a && drawable != this.f) {
            return false;
        }
        return true;
    }
}
