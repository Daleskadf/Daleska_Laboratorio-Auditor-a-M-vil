package androidx.core.widget;

import H0.C0132l;
import H4.W;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import b3.C0585f;
import com.example.appecoactivate.R;
import com.google.android.gms.common.api.f;
import h0.AbstractC1059s;
import h0.AbstractC1066z;
import h0.C1042b;
import h0.C1043c;
import h0.C1046f;
import h0.C1052l;
import h0.InterfaceC1048h;
import j0.AbstractC1361a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k0.AbstractC1377d;
import k0.C1379f;
import k0.C1381h;
import k0.InterfaceC1380g;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1048h {

    /* renamed from: A0  reason: collision with root package name */
    public static final float f7714A0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: B0  reason: collision with root package name */
    public static final C1379f f7715B0 = new C1042b();

    /* renamed from: C0  reason: collision with root package name */
    public static final int[] f7716C0 = {16843130};

    /* renamed from: a  reason: collision with root package name */
    public final float f7717a;

    /* renamed from: b  reason: collision with root package name */
    public long f7718b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f7719c;

    /* renamed from: d  reason: collision with root package name */
    public final OverScroller f7720d;

    /* renamed from: e  reason: collision with root package name */
    public final EdgeEffect f7721e;

    /* renamed from: e0  reason: collision with root package name */
    public C1052l f7722e0;
    public final EdgeEffect f;

    /* renamed from: f0  reason: collision with root package name */
    public int f7723f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f7724g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7725h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f7726i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f7727j0;

    /* renamed from: k0  reason: collision with root package name */
    public VelocityTracker f7728k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7729l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f7730m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f7731n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f7732o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f7733p0;
    public int q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int[] f7734r0;

    /* renamed from: s0  reason: collision with root package name */
    public final int[] f7735s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f7736t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f7737u0;

    /* renamed from: v0  reason: collision with root package name */
    public C1381h f7738v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C0132l f7739w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C1046f f7740x0;

    /* renamed from: y0  reason: collision with root package name */
    public float f7741y0;

    /* renamed from: z0  reason: collision with root package name */
    public final C1043c f7742z0;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f7719c = new Rect();
        this.f7724g0 = true;
        this.f7725h0 = false;
        this.f7726i0 = null;
        this.f7727j0 = false;
        this.f7730m0 = true;
        this.q0 = -1;
        this.f7734r0 = new int[2];
        this.f7735s0 = new int[2];
        this.f7742z0 = new C1043c(getContext(), new C0585f(this, 9));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            edgeEffect = AbstractC1377d.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f7721e = edgeEffect;
        if (i7 >= 31) {
            edgeEffect2 = AbstractC1377d.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f = edgeEffect2;
        this.f7717a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f7720d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f7731n0 = viewConfiguration.getScaledTouchSlop();
        this.f7732o0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7733p0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7716C0, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f7739w0 = new C0132l(5);
        this.f7740x0 = new C1046f(this);
        setNestedScrollingEnabled(true);
        AbstractC1066z.e(this, f7715B0);
    }

    private C1052l getScrollFeedbackProvider() {
        if (this.f7722e0 == null) {
            this.f7722e0 = new C1052l(this);
        }
        return this.f7722e0;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && k((View) parent, nestedScrollView)) {
            return true;
        }
        return false;
    }

    @Override // h0.InterfaceC1047g
    public final void a(View view, View view2, int i7, int i8) {
        C0132l c0132l = this.f7739w0;
        if (i8 == 1) {
            c0132l.f1819c = i7;
        } else {
            c0132l.f1818b = i7;
        }
        u(2, i8);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // h0.InterfaceC1047g
    public final void b(ViewGroup viewGroup, int i7, int i8, int i9, int i10, int i11) {
        m(i10, i11, null);
    }

    @Override // h0.InterfaceC1047g
    public final void c(View view, int i7) {
        C0132l c0132l = this.f7739w0;
        if (i7 == 1) {
            c0132l.f1819c = 0;
        } else {
            c0132l.f1818b = 0;
        }
        w(i7);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // h0.InterfaceC1048h
    public final void d(ViewGroup viewGroup, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        m(i10, i11, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyEvent(r7)
            r1 = 1
            if (r0 != 0) goto Lce
            android.graphics.Rect r0 = r6.f7719c
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r2 = 0
            r3 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto La1
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r0 = r0.getHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r0 = r0 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r0 <= r4) goto La1
            int r0 = r7.getAction()
            if (r0 != 0) goto Lc9
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L91
            r4 = 20
            if (r0 == r4) goto L81
            r4 = 62
            if (r0 == r4) goto L76
            r7 = 92
            if (r0 == r7) goto L71
            r7 = 93
            if (r0 == r7) goto L6c
            r7 = 122(0x7a, float:1.71E-43)
            if (r0 == r7) goto L68
            r7 = 123(0x7b, float:1.72E-43)
            if (r0 == r7) goto L63
            goto Lc9
        L63:
            r6.p(r3)
            goto Lc9
        L68:
            r6.p(r5)
            goto Lc9
        L6c:
            boolean r7 = r6.j(r3)
            goto Lca
        L71:
            boolean r7 = r6.j(r5)
            goto Lca
        L76:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L7d
            r3 = r5
        L7d:
            r6.p(r3)
            goto Lc9
        L81:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L8c
            boolean r7 = r6.j(r3)
            goto Lca
        L8c:
            boolean r7 = r6.g(r3)
            goto Lca
        L91:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L9c
            boolean r7 = r6.j(r5)
            goto Lca
        L9c:
            boolean r7 = r6.g(r5)
            goto Lca
        La1:
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto Lc9
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto Lc9
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto Lb5
            r7 = 0
        Lb5:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto Lc9
            if (r7 == r6) goto Lc9
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto Lc9
            r7 = r1
            goto Lca
        Lc9:
            r7 = r2
        Lca:
            if (r7 == 0) goto Lcd
            goto Lce
        Lcd:
            r1 = r2
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f4, boolean z7) {
        return this.f7740x0.a(f, f4, z7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f4) {
        return this.f7740x0.b(f, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f7740x0.c(i7, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f7740x0.d(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f7721e;
        int i8 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i8 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i8 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // h0.InterfaceC1047g
    public final void e(int i7, int i8, int i9, int[] iArr) {
        this.f7740x0.c(i7, i8, i9, iArr, null);
    }

    @Override // h0.InterfaceC1047g
    public final boolean f(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    public final boolean g(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && l(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f7719c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i7);
        } else {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, -1, null, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0132l c0132l = this.f7739w0;
        return c0132l.f1819c | c0132l.f1818b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f7741y0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f7741y0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f7741y0;
    }

    public final int h(Rect rect) {
        int i7;
        int i8;
        int i9;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i7 = i10 - verticalFadingEdgeLength;
        } else {
            i7 = i10;
        }
        int i11 = rect.bottom;
        if (i11 > i7 && rect.top > scrollY) {
            if (rect.height() > height) {
                i9 = rect.top - scrollY;
            } else {
                i9 = rect.bottom - i7;
            }
            return Math.min(i9, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i11 >= i7) {
            return 0;
        } else {
            if (rect.height() > height) {
                i8 = 0 - (i7 - rect.bottom);
            } else {
                i8 = 0 - (scrollY - rect.top);
            }
            return Math.max(i8, -getScrollY());
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f7740x0.f(0);
    }

    public final void i(int i7) {
        if (getChildCount() > 0) {
            this.f7720d.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER, 0, 0);
            u(2, 1);
            this.f7737u0 = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC1361a.a(this, Math.abs(this.f7720d.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f7740x0.f11191d;
    }

    public final boolean j(int i7) {
        boolean z7;
        int childCount;
        if (i7 == 130) {
            z7 = true;
        } else {
            z7 = false;
        }
        int height = getHeight();
        Rect rect = this.f7719c;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i7, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i7, int i8) {
        Rect rect = this.f7719c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i8) {
            return true;
        }
        return false;
    }

    public final void m(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f7740x0.d(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int i7;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.q0) {
            if (actionIndex == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            this.f7723f0 = (int) motionEvent.getY(i7);
            this.q0 = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f7728k0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i7, int i8, int i9, int i10) {
        boolean z7;
        boolean z8;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i11 = i9 + i7;
        if (i8 > 0 || i8 < 0) {
            i8 = 0;
            z7 = true;
        } else {
            z7 = false;
        }
        if (i11 <= i10) {
            if (i11 < 0) {
                i10 = 0;
            } else {
                i10 = i11;
                z8 = false;
                if (z8 && !this.f7740x0.f(1)) {
                    this.f7720d.springBack(i8, i10, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i8, i10);
                if (z7 && !z8) {
                    return false;
                }
            }
        }
        z8 = true;
        if (z8) {
            this.f7720d.springBack(i8, i10, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i10);
        return z7 ? true : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7725h0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
        if (r5 >= 0) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r28) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action == 2 && this.f7727j0) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 6) {
                            n(motionEvent);
                        }
                    }
                } else {
                    int i8 = this.q0;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f7723f0) > this.f7731n0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f7727j0 = true;
                                this.f7723f0 = y2;
                                if (this.f7728k0 == null) {
                                    this.f7728k0 = VelocityTracker.obtain();
                                }
                                this.f7728k0.addMovement(motionEvent);
                                this.f7736t0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f7727j0 = false;
            this.q0 = -1;
            VelocityTracker velocityTracker = this.f7728k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7728k0 = null;
            }
            if (this.f7720d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x7 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x7 >= childAt.getLeft() && x7 < childAt.getRight()) {
                    this.f7723f0 = y3;
                    this.q0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f7728k0;
                    if (velocityTracker2 == null) {
                        this.f7728k0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f7728k0.addMovement(motionEvent);
                    this.f7720d.computeScrollOffset();
                    if (!v(motionEvent) && this.f7720d.isFinished()) {
                        z7 = false;
                    }
                    this.f7727j0 = z7;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f7720d.isFinished()) {
                z7 = false;
            }
            this.f7727j0 = z7;
            VelocityTracker velocityTracker3 = this.f7728k0;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f7728k0 = null;
            }
        }
        return this.f7727j0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z7, i7, i8, i9, i10);
        int i12 = 0;
        this.f7724g0 = false;
        View view = this.f7726i0;
        if (view != null && k(view, this)) {
            View view2 = this.f7726i0;
            Rect rect = this.f7719c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                scrollBy(0, h8);
            }
        }
        this.f7726i0 = null;
        if (!this.f7725h0) {
            if (this.f7738v0 != null) {
                scrollTo(getScrollX(), this.f7738v0.f13564a);
                this.f7738v0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i11 = 0;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i11 && scrollY >= 0) {
                i12 = paddingTop + scrollY > i11 ? i11 - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f7725h0 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f7729l0 && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f4, boolean z7) {
        if (!z7) {
            dispatchNestedFling(0.0f, f4, true);
            i((int) f4);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f4) {
        return this.f7740x0.b(f, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        this.f7740x0.c(i7, i8, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        m(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        a(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i8, boolean z7, boolean z8) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        View findNextFocusFromRect;
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i7);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        }
        if (findNextFocusFromRect == null || !l(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1381h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1381h c1381h = (C1381h) parcelable;
        super.onRestoreInstanceState(c1381h.getSuperState());
        this.f7738v0 = c1381h;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, k0.h] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f13564a = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && l(findFocus, 0, i10)) {
            Rect rect = this.f7719c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                if (this.f7730m0) {
                    t(0, h8, false);
                } else {
                    scrollBy(0, h8);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return f(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i7) {
        boolean z7;
        if (i7 == 130) {
            z7 = true;
        } else {
            z7 = false;
        }
        int height = getHeight();
        Rect rect = this.f7719c;
        if (z7) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i8 = rect.top;
        int i9 = height + i8;
        rect.bottom = i9;
        q(i7, i8, i9);
    }

    public final boolean q(int i7, int i8, int i9) {
        boolean z7;
        View view;
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        if (i7 == 33) {
            z7 = true;
        } else {
            z7 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view3 = focusables.get(i12);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i8 < bottom && top < i9) {
                if (i8 < top && bottom < i9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (view2 == null) {
                    view2 = view3;
                    z11 = z9;
                } else {
                    if ((z7 && top < view2.getTop()) || (!z7 && bottom > view2.getBottom())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11) {
                        if (z9) {
                            if (!z10) {
                            }
                            view2 = view3;
                        }
                    } else if (z9) {
                        view2 = view3;
                        z11 = true;
                    } else {
                        if (!z10) {
                        }
                        view2 = view3;
                    }
                }
            }
        }
        if (view2 == null) {
            view = this;
        } else {
            view = view2;
        }
        if (i8 >= scrollY && i9 <= i11) {
            z8 = false;
        } else {
            if (z7) {
                i10 = i8 - scrollY;
            } else {
                i10 = i9 - i11;
            }
            r(i10, -1, null, 0, 1, true);
            z8 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i7);
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(int r22, int r23, android.view.MotionEvent r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f7724g0) {
            Rect rect = this.f7719c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                scrollBy(0, h8);
            }
        } else {
            this.f7726i0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        boolean z8;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h8 = h(rect);
        if (h8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (z7) {
                scrollBy(0, h8);
            } else {
                t(0, h8, false);
            }
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        VelocityTracker velocityTracker;
        if (z7 && (velocityTracker = this.f7728k0) != null) {
            velocityTracker.recycle();
            this.f7728k0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f7724g0 = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float o7 = W.o(edgeEffect) * getHeight();
        float f = this.f7717a * 0.015f;
        double log = Math.log((Math.abs(-i7) * 0.35f) / f);
        double d7 = f7714A0;
        if (((float) (Math.exp((d7 / (d7 - 1.0d)) * log) * f)) < o7) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i7 >= 0) {
                if (width + i7 > width2) {
                    i7 = width2 - width;
                }
            } else {
                i7 = 0;
            }
            if (height < height2 && i8 >= 0) {
                if (height + i8 > height2) {
                    i8 = height2 - height;
                }
            } else {
                i8 = 0;
            }
            if (i7 != getScrollX() || i8 != getScrollY()) {
                super.scrollTo(i7, i8);
            }
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f7729l0) {
            this.f7729l0 = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C1046f c1046f = this.f7740x0;
        if (c1046f.f11191d) {
            Field field = AbstractC1066z.f11214a;
            AbstractC1059s.f(c1046f.f11190c);
        }
        c1046f.f11191d = z7;
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f7730m0 = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return this.f7740x0.g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i7, int i8, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f7718b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f7720d;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z7) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f7737u0 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f7720d.isFinished()) {
                this.f7720d.abortAnimation();
                w(1);
            }
            scrollBy(i7, i8);
        }
        this.f7718b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i7, int i8) {
        this.f7740x0.g(2, i8);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z7;
        EdgeEffect edgeEffect = this.f7721e;
        if (W.o(edgeEffect) != 0.0f) {
            W.B(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f;
        if (W.o(edgeEffect2) != 0.0f) {
            W.B(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z7;
    }

    public final void w(int i7) {
        this.f7740x0.h(i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC1380g interfaceC1380g) {
    }
}
