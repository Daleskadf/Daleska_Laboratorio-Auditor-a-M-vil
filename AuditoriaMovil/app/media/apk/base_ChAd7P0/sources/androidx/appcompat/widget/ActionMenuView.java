package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import b3.C0585f;
import com.google.android.gms.common.api.f;
import f5.C0993a;
import o.InterfaceC1544h;
import o.MenuC1545i;
import o.j;
import p.C1581f;
import p.C1585h;
import p.C1587i;
import p.C1591k;
import p.InterfaceC1589j;
import p.InterfaceC1593l;
import p.Y;
import p.Z;
import p.b1;
/* loaded from: classes.dex */
public class ActionMenuView extends Z implements InterfaceC1544h {

    /* renamed from: n0  reason: collision with root package name */
    public MenuC1545i f7337n0;

    /* renamed from: o0  reason: collision with root package name */
    public Context f7338o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f7339p0;
    public C1587i q0;

    /* renamed from: r0  reason: collision with root package name */
    public C0585f f7340r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f7341s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f7342t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f7343u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f7344v0;

    /* renamed from: w0  reason: collision with root package name */
    public InterfaceC1593l f7345w0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f7343u0 = (int) (56.0f * f);
        this.f7344v0 = (int) (f * 4.0f);
        this.f7338o0 = context;
        this.f7339p0 = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, p.k] */
    public static C1591k h() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f14837a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, p.k] */
    public static C1591k i(ViewGroup.LayoutParams layoutParams) {
        C1591k c1591k;
        if (layoutParams != null) {
            if (layoutParams instanceof C1591k) {
                C1591k c1591k2 = (C1591k) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c1591k2);
                layoutParams2.f14837a = c1591k2.f14837a;
                c1591k = layoutParams2;
            } else {
                c1591k = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c1591k).gravity <= 0) {
                ((LinearLayout.LayoutParams) c1591k).gravity = 16;
            }
            return c1591k;
        }
        return h();
    }

    @Override // o.InterfaceC1544h
    public final boolean a(j jVar) {
        return this.f7337n0.p(jVar, null, 0);
    }

    @Override // p.Z, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1591k;
    }

    @Override // p.Z
    public final /* bridge */ /* synthetic */ Y d() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, p.Y] */
    @Override // p.Z
    public final Y e(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // p.Z
    public final /* bridge */ /* synthetic */ Y f(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // p.Z, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // p.Z, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f7337n0 == null) {
            Context context = getContext();
            MenuC1545i menuC1545i = new MenuC1545i(context);
            this.f7337n0 = menuC1545i;
            menuC1545i.f14445e = new C0585f(this, 13);
            C1587i c1587i = new C1587i(context);
            this.q0 = c1587i;
            c1587i.f14826f0 = true;
            c1587i.f14827g0 = true;
            c1587i.f14824e = new C0993a(21);
            this.f7337n0.b(c1587i, this.f7338o0);
            C1587i c1587i2 = this.q0;
            c1587i2.f14817X = this;
            this.f7337n0 = c1587i2.f14822c;
        }
        return this.f7337n0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1587i c1587i = this.q0;
        C1585h c1585h = c1587i.f14818Y;
        if (c1585h != null) {
            return c1585h.getDrawable();
        }
        if (c1587i.f14825e0) {
            return c1587i.f14819Z;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f7339p0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i7) {
        boolean z7 = false;
        if (i7 == 0) {
            return false;
        }
        View childAt = getChildAt(i7 - 1);
        View childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC1589j)) {
            z7 = ((InterfaceC1589j) childAt).b();
        }
        if (i7 > 0 && (childAt2 instanceof InterfaceC1589j)) {
            return z7 | ((InterfaceC1589j) childAt2).c();
        }
        return z7;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1587i c1587i = this.q0;
        if (c1587i != null) {
            c1587i.c();
            C1581f c1581f = this.q0.f14833m0;
            if (c1581f != null && c1581f.b()) {
                this.q0.d();
                this.q0.i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1587i c1587i = this.q0;
        if (c1587i != null) {
            c1587i.d();
            C1581f c1581f = c1587i.f14834n0;
            if (c1581f != null && c1581f.b()) {
                c1581f.f14494i.dismiss();
            }
        }
    }

    @Override // p.Z, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11;
        int width;
        int i12;
        if (!this.f7341s0) {
            super.onLayout(z7, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i9 - i7;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean a7 = b1.a(this);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C1591k c1591k = (C1591k) childAt.getLayoutParams();
                if (c1591k.f14837a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a7) {
                        i12 = getPaddingLeft() + ((LinearLayout.LayoutParams) c1591k).leftMargin;
                        width = i12 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1591k).rightMargin;
                        i12 = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(i12, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1591k).leftMargin) + ((LinearLayout.LayoutParams) c1591k).rightMargin;
                    j(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        if (i21 > 0) {
            i11 = paddingRight / i21;
        } else {
            i11 = 0;
        }
        int max = Math.max(0, i11);
        if (a7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                C1591k c1591k2 = (C1591k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1591k2.f14837a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) c1591k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1591k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            C1591k c1591k3 = (C1591k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1591k3.f14837a) {
                int i26 = paddingLeft + ((LinearLayout.LayoutParams) c1591k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c1591k3).rightMargin + max + i26;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // p.Z, android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z7;
        int i9;
        boolean z8;
        boolean z9;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        ?? r42;
        boolean z12;
        int i15;
        int i16;
        int i17;
        ActionMenuItemView actionMenuItemView;
        boolean z13;
        int i18;
        boolean z14;
        MenuC1545i menuC1545i;
        boolean z15 = this.f7341s0;
        if (View.MeasureSpec.getMode(i7) == 1073741824) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f7341s0 = z7;
        if (z15 != z7) {
            this.f7342t0 = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f7341s0 && (menuC1545i = this.f7337n0) != null && size != this.f7342t0) {
            this.f7342t0 = size;
            menuC1545i.o(true);
        }
        int childCount = getChildCount();
        if (this.f7341s0 && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i7);
            int size3 = View.MeasureSpec.getSize(i8);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
            int i19 = size2 - paddingRight;
            int i20 = this.f7343u0;
            int i21 = i19 / i20;
            int i22 = i19 % i20;
            if (i21 == 0) {
                setMeasuredDimension(i19, 0);
                return;
            }
            int i23 = (i22 / i21) + i20;
            int childCount2 = getChildCount();
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            boolean z16 = false;
            int i28 = 0;
            long j = 0;
            while (true) {
                i9 = this.f7344v0;
                if (i27 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i27);
                int i29 = size3;
                int i30 = i19;
                if (childAt.getVisibility() == 8) {
                    i16 = mode;
                    i17 = paddingBottom;
                } else {
                    boolean z17 = childAt instanceof ActionMenuItemView;
                    int i31 = i25 + 1;
                    if (z17) {
                        childAt.setPadding(i9, 0, i9, 0);
                    }
                    C1591k c1591k = (C1591k) childAt.getLayoutParams();
                    c1591k.f = false;
                    c1591k.f14839c = 0;
                    c1591k.f14838b = 0;
                    c1591k.f14840d = false;
                    ((LinearLayout.LayoutParams) c1591k).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c1591k).rightMargin = 0;
                    if (z17 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c1591k.f14841e = z12;
                    if (c1591k.f14837a) {
                        i15 = 1;
                    } else {
                        i15 = i21;
                    }
                    C1591k c1591k2 = (C1591k) childAt.getLayoutParams();
                    i16 = mode;
                    i17 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z17) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i15 > 0 && (!z13 || i15 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i23, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i18 = measuredWidth / i23;
                        if (measuredWidth % i23 != 0) {
                            i18++;
                        }
                        if (z13 && i18 < 2) {
                            i18 = 2;
                        }
                    } else {
                        i18 = 0;
                    }
                    if (!c1591k2.f14837a && z13) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c1591k2.f14840d = z14;
                    c1591k2.f14838b = i18;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i23, 1073741824), makeMeasureSpec);
                    i26 = Math.max(i26, i18);
                    if (c1591k.f14840d) {
                        i28++;
                    }
                    if (c1591k.f14837a) {
                        z16 = true;
                    }
                    i21 -= i18;
                    i24 = Math.max(i24, childAt.getMeasuredHeight());
                    if (i18 == 1) {
                        j |= 1 << i27;
                    }
                    i25 = i31;
                }
                i27++;
                size3 = i29;
                i19 = i30;
                paddingBottom = i17;
                mode = i16;
            }
            int i32 = mode;
            int i33 = i19;
            int i34 = size3;
            if (z16 && i25 == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z18 = false;
            while (i28 > 0 && i21 > 0) {
                int i35 = f.API_PRIORITY_OTHER;
                int i36 = 0;
                int i37 = 0;
                long j8 = 0;
                while (i37 < childCount2) {
                    C1591k c1591k3 = (C1591k) getChildAt(i37).getLayoutParams();
                    boolean z19 = z18;
                    if (c1591k3.f14840d) {
                        int i38 = c1591k3.f14838b;
                        if (i38 < i35) {
                            j8 = 1 << i37;
                            i35 = i38;
                            i36 = 1;
                        } else if (i38 == i35) {
                            j8 |= 1 << i37;
                            i36++;
                        }
                    }
                    i37++;
                    z18 = z19;
                }
                z9 = z18;
                j |= j8;
                if (i36 > i21) {
                    break;
                }
                int i39 = i35 + 1;
                int i40 = 0;
                while (i40 < childCount2) {
                    View childAt2 = getChildAt(i40);
                    C1591k c1591k4 = (C1591k) childAt2.getLayoutParams();
                    int i41 = i24;
                    int i42 = childMeasureSpec;
                    int i43 = childCount2;
                    long j9 = 1 << i40;
                    if ((j8 & j9) == 0) {
                        if (c1591k4.f14838b == i39) {
                            j |= j9;
                        }
                    } else {
                        if (z8 && c1591k4.f14841e) {
                            r42 = 1;
                            r42 = 1;
                            if (i21 == 1) {
                                childAt2.setPadding(i9 + i23, 0, i9, 0);
                            }
                        } else {
                            r42 = 1;
                        }
                        c1591k4.f14838b += r42;
                        c1591k4.f = r42;
                        i21--;
                    }
                    i40++;
                    childMeasureSpec = i42;
                    i24 = i41;
                    childCount2 = i43;
                }
                z18 = true;
            }
            z9 = z18;
            int i44 = i24;
            int i45 = childMeasureSpec;
            int i46 = childCount2;
            if (!z16 && i25 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i21 <= 0 || j == 0 || (i21 >= i25 - 1 && !z10 && i26 <= 1)) {
                i10 = i46;
                z11 = z9;
            } else {
                float bitCount = Long.bitCount(j);
                if (!z10) {
                    if ((j & 1) != 0 && !((C1591k) getChildAt(0).getLayoutParams()).f14841e) {
                        bitCount -= 0.5f;
                    }
                    int i47 = i46 - 1;
                    if ((j & (1 << i47)) != 0 && !((C1591k) getChildAt(i47).getLayoutParams()).f14841e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i14 = (int) ((i21 * i23) / bitCount);
                } else {
                    i14 = 0;
                }
                boolean z20 = z9;
                i10 = i46;
                for (int i48 = 0; i48 < i10; i48++) {
                    if ((j & (1 << i48)) != 0) {
                        View childAt3 = getChildAt(i48);
                        C1591k c1591k5 = (C1591k) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c1591k5.f14839c = i14;
                            c1591k5.f = true;
                            if (i48 == 0 && !c1591k5.f14841e) {
                                ((LinearLayout.LayoutParams) c1591k5).leftMargin = (-i14) / 2;
                            }
                            z20 = true;
                        } else {
                            if (c1591k5.f14837a) {
                                c1591k5.f14839c = i14;
                                c1591k5.f = true;
                                ((LinearLayout.LayoutParams) c1591k5).rightMargin = (-i14) / 2;
                                z20 = true;
                            } else {
                                if (i48 != 0) {
                                    ((LinearLayout.LayoutParams) c1591k5).leftMargin = i14 / 2;
                                }
                                if (i48 != i10 - 1) {
                                    ((LinearLayout.LayoutParams) c1591k5).rightMargin = i14 / 2;
                                }
                            }
                        }
                    }
                }
                z11 = z20;
            }
            if (z11) {
                int i49 = 0;
                while (i49 < i10) {
                    View childAt4 = getChildAt(i49);
                    C1591k c1591k6 = (C1591k) childAt4.getLayoutParams();
                    if (!c1591k6.f) {
                        i13 = i45;
                    } else {
                        i13 = i45;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1591k6.f14838b * i23) + c1591k6.f14839c, 1073741824), i13);
                    }
                    i49++;
                    i45 = i13;
                }
            }
            if (i32 != 1073741824) {
                i12 = i33;
                i11 = i44;
            } else {
                i11 = i34;
                i12 = i33;
            }
            setMeasuredDimension(i12, i11);
            return;
        }
        for (int i50 = 0; i50 < childCount; i50++) {
            C1591k c1591k7 = (C1591k) getChildAt(i50).getLayoutParams();
            ((LinearLayout.LayoutParams) c1591k7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c1591k7).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.q0.f14831k0 = z7;
    }

    public void setOnMenuItemClickListener(InterfaceC1593l interfaceC1593l) {
        this.f7345w0 = interfaceC1593l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1587i c1587i = this.q0;
        C1585h c1585h = c1587i.f14818Y;
        if (c1585h != null) {
            c1585h.setImageDrawable(drawable);
            return;
        }
        c1587i.f14825e0 = true;
        c1587i.f14819Z = drawable;
    }

    public void setOverflowReserved(boolean z7) {
    }

    public void setPopupTheme(int i7) {
        if (this.f7339p0 != i7) {
            this.f7339p0 = i7;
            if (i7 == 0) {
                this.f7338o0 = getContext();
            } else {
                this.f7338o0 = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C1587i c1587i) {
        this.q0 = c1587i;
        c1587i.f14817X = this;
        this.f7337n0 = c1587i.f14822c;
    }

    @Override // p.Z, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
