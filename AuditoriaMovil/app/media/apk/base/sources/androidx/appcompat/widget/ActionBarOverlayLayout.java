package androidx.appcompat.widget;

import H0.C0132l;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.example.appecoactivate.R;
import com.google.android.gms.common.api.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h0.AbstractC1028H;
import h0.AbstractC1058r;
import h0.AbstractC1059s;
import h0.AbstractC1066z;
import h0.C1023C;
import h0.C1025E;
import h0.C1026F;
import h0.C1027G;
import h0.C1035O;
import h0.C1036P;
import h0.InterfaceC1047g;
import h0.InterfaceC1048h;
import java.lang.reflect.Field;
import p.C1573b;
import p.C1579e;
import p.InterfaceC1577d;
import p.L;
import p.RunnableC1575c;
import p.U0;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1047g, InterfaceC1048h {

    /* renamed from: w0  reason: collision with root package name */
    public static final int[] f7314w0 = {R.attr.actionBarSize, 16842841};

    /* renamed from: a  reason: collision with root package name */
    public int f7315a;

    /* renamed from: b  reason: collision with root package name */
    public ContentFrameLayout f7316b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarContainer f7317c;

    /* renamed from: d  reason: collision with root package name */
    public L f7318d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f7319e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7320e0;
    public boolean f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7321f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f7322g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7323h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7324i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f7325j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Rect f7326k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Rect f7327l0;

    /* renamed from: m0  reason: collision with root package name */
    public C1036P f7328m0;

    /* renamed from: n0  reason: collision with root package name */
    public C1036P f7329n0;

    /* renamed from: o0  reason: collision with root package name */
    public C1036P f7330o0;

    /* renamed from: p0  reason: collision with root package name */
    public C1036P f7331p0;
    public OverScroller q0;

    /* renamed from: r0  reason: collision with root package name */
    public ViewPropertyAnimator f7332r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C1573b f7333s0;

    /* renamed from: t0  reason: collision with root package name */
    public final RunnableC1575c f7334t0;

    /* renamed from: u0  reason: collision with root package name */
    public final RunnableC1575c f7335u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C0132l f7336v0;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7325j0 = new Rect();
        this.f7326k0 = new Rect();
        this.f7327l0 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C1036P c1036p = C1036P.f11171b;
        this.f7328m0 = c1036p;
        this.f7329n0 = c1036p;
        this.f7330o0 = c1036p;
        this.f7331p0 = c1036p;
        this.f7333s0 = new C1573b(this);
        this.f7334t0 = new RunnableC1575c(this, 0);
        this.f7335u0 = new RunnableC1575c(this, 1);
        i(context);
        this.f7336v0 = new C0132l(5);
    }

    public static boolean g(View view, Rect rect, boolean z7) {
        boolean z8;
        C1579e c1579e = (C1579e) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) c1579e).leftMargin;
        int i8 = rect.left;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c1579e).leftMargin = i8;
            z8 = true;
        } else {
            z8 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c1579e).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c1579e).topMargin = i10;
            z8 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c1579e).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c1579e).rightMargin = i12;
            z8 = true;
        }
        if (z7) {
            int i13 = ((ViewGroup.MarginLayoutParams) c1579e).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c1579e).bottomMargin = i14;
                return true;
            }
        }
        return z8;
    }

    @Override // h0.InterfaceC1047g
    public final void a(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // h0.InterfaceC1047g
    public final void b(ViewGroup viewGroup, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(viewGroup, i7, i8, i9, i10);
        }
    }

    @Override // h0.InterfaceC1047g
    public final void c(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1579e;
    }

    @Override // h0.InterfaceC1048h
    public final void d(ViewGroup viewGroup, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        b(viewGroup, i7, i8, i9, i10, i11);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        if (this.f7319e != null && !this.f) {
            if (this.f7317c.getVisibility() == 0) {
                i7 = (int) (this.f7317c.getTranslationY() + this.f7317c.getBottom() + 0.5f);
            } else {
                i7 = 0;
            }
            this.f7319e.setBounds(0, i7, getWidth(), this.f7319e.getIntrinsicHeight() + i7);
            this.f7319e.draw(canvas);
        }
    }

    @Override // h0.InterfaceC1047g
    public final boolean f(View view, View view2, int i7, int i8) {
        if (i8 == 0 && onStartNestedScroll(view, view2, i7)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f7317c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0132l c0132l = this.f7336v0;
        return c0132l.f1819c | c0132l.f1818b;
    }

    public CharSequence getTitle() {
        j();
        return ((U0) this.f7318d).f14721a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f7334t0);
        removeCallbacks(this.f7335u0);
        ViewPropertyAnimator viewPropertyAnimator = this.f7332r0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        boolean z7;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f7314w0);
        boolean z8 = false;
        this.f7315a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f7319e = drawable;
        if (drawable == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        setWillNotDraw(z7);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z8 = true;
        }
        this.f = z8;
        this.q0 = new OverScroller(context);
    }

    public final void j() {
        L wrapper;
        if (this.f7316b == null) {
            this.f7316b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f7317c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof L) {
                wrapper = (L) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f7318d = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        C1036P c8 = C1036P.c(this, windowInsets);
        C1035O c1035o = c8.f11172a;
        boolean g3 = g(this.f7317c, new Rect(c1035o.g().f6709a, c1035o.g().f6710b, c1035o.g().f6711c, c1035o.g().f6712d), false);
        Field field = AbstractC1066z.f11214a;
        Rect rect = this.f7325j0;
        AbstractC1059s.a(this, c8, rect);
        C1036P h8 = c1035o.h(rect.left, rect.top, rect.right, rect.bottom);
        this.f7328m0 = h8;
        boolean z7 = true;
        if (!this.f7329n0.equals(h8)) {
            this.f7329n0 = this.f7328m0;
            g3 = true;
        }
        Rect rect2 = this.f7326k0;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z7 = g3;
        }
        if (z7) {
            requestLayout();
        }
        return c1035o.a().f11172a.c().f11172a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = AbstractC1066z.f11214a;
        AbstractC1058r.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1579e c1579e = (C1579e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c1579e).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c1579e).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z7;
        int measuredHeight;
        AbstractC1028H c1023c;
        j();
        measureChildWithMargins(this.f7317c, i7, 0, i8, 0);
        C1579e c1579e = (C1579e) this.f7317c.getLayoutParams();
        int max = Math.max(0, this.f7317c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1579e).leftMargin + ((ViewGroup.MarginLayoutParams) c1579e).rightMargin);
        int max2 = Math.max(0, this.f7317c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1579e).topMargin + ((ViewGroup.MarginLayoutParams) c1579e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f7317c.getMeasuredState());
        Field field = AbstractC1066z.f11214a;
        if ((getWindowSystemUiVisibility() & RecognitionOptions.QR_CODE) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            measuredHeight = this.f7315a;
            if (this.f7321f0 && this.f7317c.getTabContainer() != null) {
                measuredHeight += this.f7315a;
            }
        } else {
            measuredHeight = this.f7317c.getVisibility() != 8 ? this.f7317c.getMeasuredHeight() : 0;
        }
        Rect rect = this.f7325j0;
        Rect rect2 = this.f7327l0;
        rect2.set(rect);
        C1036P c1036p = this.f7328m0;
        this.f7330o0 = c1036p;
        if (!this.f7320e0 && !z7) {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f7330o0 = c1036p.f11172a.h(0, measuredHeight, 0, 0);
        } else {
            Z.c a7 = Z.c.a(c1036p.f11172a.g().f6709a, this.f7330o0.f11172a.g().f6710b + measuredHeight, this.f7330o0.f11172a.g().f6711c, this.f7330o0.f11172a.g().f6712d);
            C1036P c1036p2 = this.f7330o0;
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 34) {
                c1023c = new C1027G(c1036p2);
            } else if (i9 >= 30) {
                c1023c = new C1026F(c1036p2);
            } else if (i9 >= 29) {
                c1023c = new C1025E(c1036p2);
            } else {
                c1023c = new C1023C(c1036p2);
            }
            c1023c.d(a7);
            this.f7330o0 = c1023c.b();
        }
        g(this.f7316b, rect2, true);
        if (!this.f7331p0.equals(this.f7330o0)) {
            C1036P c1036p3 = this.f7330o0;
            this.f7331p0 = c1036p3;
            AbstractC1066z.a(this.f7316b, c1036p3);
        }
        measureChildWithMargins(this.f7316b, i7, 0, i8, 0);
        C1579e c1579e2 = (C1579e) this.f7316b.getLayoutParams();
        int max3 = Math.max(max, this.f7316b.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1579e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1579e2).rightMargin);
        int max4 = Math.max(max2, this.f7316b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1579e2).topMargin + ((ViewGroup.MarginLayoutParams) c1579e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f7316b.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f4, boolean z7) {
        if (this.f7322g0 && z7) {
            this.q0.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER);
            if (this.q0.getFinalY() > this.f7317c.getHeight()) {
                h();
                this.f7335u0.run();
            } else {
                h();
                this.f7334t0.run();
            }
            this.f7323h0 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f7324i0 + i8;
        this.f7324i0 = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f7336v0.f1818b = i7;
        this.f7324i0 = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) != 0 && this.f7317c.getVisibility() == 0) {
            return this.f7322g0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f7322g0 && !this.f7323h0) {
            if (this.f7324i0 <= this.f7317c.getHeight()) {
                h();
                postDelayed(this.f7334t0, 600L);
                return;
            }
            h();
            postDelayed(this.f7335u0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
    }

    public void setActionBarHideOffset(int i7) {
        h();
        this.f7317c.setTranslationY(-Math.max(0, Math.min(i7, this.f7317c.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1577d interfaceC1577d) {
        if (getWindowToken() == null) {
            return;
        }
        throw null;
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f7321f0 = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f7322g0) {
            this.f7322g0 = z7;
            if (!z7) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i7) {
        j();
        U0 u02 = (U0) this.f7318d;
        u02.f14724d = i7 != 0 ? AbstractC1740d.o(u02.f14721a.getContext(), i7) : null;
        u02.c();
    }

    public void setLogo(int i7) {
        Drawable drawable;
        j();
        U0 u02 = (U0) this.f7318d;
        if (i7 != 0) {
            drawable = AbstractC1740d.o(u02.f14721a.getContext(), i7);
        } else {
            drawable = null;
        }
        u02.f14725e = drawable;
        u02.c();
    }

    public void setOverlayMode(boolean z7) {
        boolean z8;
        this.f7320e0 = z7;
        if (z7 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f = z8;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i7) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((U0) this.f7318d).f14729k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        U0 u02 = (U0) this.f7318d;
        if (!u02.f14726g) {
            u02.f14727h = charSequence;
            if ((u02.f14722b & 8) != 0) {
                Toolbar toolbar = u02.f14721a;
                toolbar.setTitle(charSequence);
                if (u02.f14726g) {
                    AbstractC1066z.f(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        U0 u02 = (U0) this.f7318d;
        u02.f14724d = drawable;
        u02.c();
    }

    @Override // h0.InterfaceC1047g
    public final void e(int i7, int i8, int i9, int[] iArr) {
    }
}
