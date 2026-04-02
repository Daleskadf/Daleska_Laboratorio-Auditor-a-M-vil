package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.appecoactivate.R;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.lang.reflect.Field;
import p.b1;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f7303a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7304b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7305c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f7306d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f7307e;

    /* renamed from: e0  reason: collision with root package name */
    public LinearLayout f7308e0;
    public View f;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f7309f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f7310g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f7311h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f7312i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f7313j0;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1091a.f11354d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = AbstractC1740d.o(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        Field field = AbstractC1066z.f11214a;
        setBackground(drawable);
        this.f7311h0 = obtainStyledAttributes.getResourceId(5, 0);
        this.f7312i0 = obtainStyledAttributes.getResourceId(4, 0);
        this.f7303a = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i7, int i8, int i9, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z7) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        if (z7) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void a() {
        int i7;
        if (this.f7308e0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f7308e0 = linearLayout;
            this.f7309f0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f7310g0 = (TextView) this.f7308e0.findViewById(R.id.action_bar_subtitle);
            int i8 = this.f7311h0;
            if (i8 != 0) {
                this.f7309f0.setTextAppearance(getContext(), i8);
            }
            int i9 = this.f7312i0;
            if (i9 != 0) {
                this.f7310g0.setTextAppearance(getContext(), i9);
            }
        }
        this.f7309f0.setText(this.f7306d);
        this.f7310g0.setText(this.f7307e);
        boolean isEmpty = TextUtils.isEmpty(this.f7306d);
        boolean isEmpty2 = TextUtils.isEmpty(this.f7307e);
        TextView textView = this.f7310g0;
        int i10 = 8;
        if (!isEmpty2) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        textView.setVisibility(i7);
        LinearLayout linearLayout2 = this.f7308e0;
        if (!isEmpty || !isEmpty2) {
            i10 = 0;
        }
        linearLayout2.setVisibility(i10);
        if (this.f7308e0.getParent() == null) {
            addView(this.f7308e0);
        }
    }

    @Override // android.view.View
    /* renamed from: c */
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            super.setVisibility(i7);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f7303a;
    }

    public CharSequence getSubtitle() {
        return this.f7307e;
    }

    public CharSequence getTitle() {
        return this.f7306d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1091a.f11351a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f7305c = false;
        }
        if (!this.f7305c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f7305c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f7305c = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int paddingLeft;
        boolean a7 = b1.a(this);
        if (a7) {
            paddingLeft = (i9 - i7) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f7308e0;
        if (linearLayout != null && this.f == null && linearLayout.getVisibility() != 8) {
            paddingLeft += b(this.f7308e0, paddingLeft, paddingTop, paddingTop2, a7);
        }
        View view = this.f;
        if (view != null) {
            b(view, paddingLeft, paddingTop, paddingTop2, a7);
        }
        if (a7) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean z7;
        int i10;
        int i11 = 1073741824;
        if (View.MeasureSpec.getMode(i7) == 1073741824) {
            if (View.MeasureSpec.getMode(i8) != 0) {
                int size = View.MeasureSpec.getSize(i7);
                int i12 = this.f7303a;
                if (i12 <= 0) {
                    i12 = View.MeasureSpec.getSize(i8);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i13 = i12 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
                LinearLayout linearLayout = this.f7308e0;
                if (linearLayout != null && this.f == null) {
                    if (this.f7313j0) {
                        this.f7308e0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f7308e0.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f7308e0;
                        if (z7) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        linearLayout2.setVisibility(i10);
                    } else {
                        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                        paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                    }
                }
                View view = this.f;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i14 = layoutParams.width;
                    if (i14 != -2) {
                        i9 = 1073741824;
                    } else {
                        i9 = Integer.MIN_VALUE;
                    }
                    if (i14 >= 0) {
                        paddingLeft = Math.min(i14, paddingLeft);
                    }
                    int i15 = layoutParams.height;
                    if (i15 == -2) {
                        i11 = Integer.MIN_VALUE;
                    }
                    if (i15 >= 0) {
                        i13 = Math.min(i15, i13);
                    }
                    this.f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i13, i11));
                }
                if (this.f7303a <= 0) {
                    int childCount = getChildCount();
                    int i16 = 0;
                    for (int i17 = 0; i17 < childCount; i17++) {
                        int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i16) {
                            i16 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i16);
                    return;
                }
                setMeasuredDimension(size, i12);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7304b = false;
        }
        if (!this.f7304b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f7304b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f7304b = false;
        }
        return true;
    }

    public void setContentHeight(int i7) {
        this.f7303a = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f = view;
        if (view != null && (linearLayout = this.f7308e0) != null) {
            removeView(linearLayout);
            this.f7308e0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f7307e = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f7306d = charSequence;
        a();
        AbstractC1066z.f(this, charSequence);
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.f7313j0) {
            requestLayout();
        }
        this.f7313j0 = z7;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
