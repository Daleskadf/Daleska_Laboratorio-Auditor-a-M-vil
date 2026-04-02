package androidx.appcompat.widget;

import D.AbstractC0055e;
import R1.j;
import a1.C0415A;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b3.C0585f;
import com.example.appecoactivate.R;
import h0.AbstractC1066z;
import h0.InterfaceC1045e;
import i.AbstractC1091a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.RunnableC1375b;
import n.C1457d;
import o.MenuC1545i;
import o0.AbstractC1547b;
import p.C1570C;
import p.C1581f;
import p.C1587i;
import p.C1601p;
import p.C1603q;
import p.C1605r0;
import p.L;
import p.N0;
import p.O0;
import p.P0;
import p.Q0;
import p.R0;
import p.S0;
import p.T0;
import p.U0;
import p.b1;
import r3.AbstractC1740d;
import z0.E;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1045e {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f7442A0;

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f7443B0;

    /* renamed from: C0  reason: collision with root package name */
    public final ArrayList f7444C0;

    /* renamed from: D0  reason: collision with root package name */
    public final int[] f7445D0;

    /* renamed from: E0  reason: collision with root package name */
    public final j f7446E0;

    /* renamed from: F0  reason: collision with root package name */
    public ArrayList f7447F0;

    /* renamed from: G0  reason: collision with root package name */
    public final C0415A f7448G0;

    /* renamed from: H0  reason: collision with root package name */
    public U0 f7449H0;

    /* renamed from: I0  reason: collision with root package name */
    public Q0 f7450I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f7451J0;

    /* renamed from: K0  reason: collision with root package name */
    public OnBackInvokedCallback f7452K0;

    /* renamed from: L0  reason: collision with root package name */
    public OnBackInvokedDispatcher f7453L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f7454M0;

    /* renamed from: N0  reason: collision with root package name */
    public final RunnableC1375b f7455N0;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f7456a;

    /* renamed from: b  reason: collision with root package name */
    public C1570C f7457b;

    /* renamed from: c  reason: collision with root package name */
    public C1570C f7458c;

    /* renamed from: d  reason: collision with root package name */
    public C1601p f7459d;

    /* renamed from: e  reason: collision with root package name */
    public C1603q f7460e;

    /* renamed from: e0  reason: collision with root package name */
    public final CharSequence f7461e0;
    public final Drawable f;

    /* renamed from: f0  reason: collision with root package name */
    public C1601p f7462f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f7463g0;

    /* renamed from: h0  reason: collision with root package name */
    public Context f7464h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7465i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f7466j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f7467k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f7468l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f7469m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f7470n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f7471o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f7472p0;
    public int q0;

    /* renamed from: r0  reason: collision with root package name */
    public C1605r0 f7473r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f7474s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f7475t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f7476u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f7477v0;

    /* renamed from: w0  reason: collision with root package name */
    public CharSequence f7478w0;

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f7479x0;

    /* renamed from: y0  reason: collision with root package name */
    public ColorStateList f7480y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f7481z0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f7476u0 = 8388627;
        this.f7443B0 = new ArrayList();
        this.f7444C0 = new ArrayList();
        this.f7445D0 = new int[2];
        this.f7446E0 = new j(new N0(this, 1));
        this.f7447F0 = new ArrayList();
        this.f7448G0 = new C0415A(this);
        this.f7455N0 = new RunnableC1375b(this, 2);
        Context context2 = getContext();
        int[] iArr = AbstractC1091a.f11368t;
        j J02 = j.J0(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC1066z.d(this, context, iArr, attributeSet, (TypedArray) J02.f4683c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) J02.f4683c;
        this.f7466j0 = typedArray.getResourceId(28, 0);
        this.f7467k0 = typedArray.getResourceId(19, 0);
        this.f7476u0 = typedArray.getInteger(0, 8388627);
        this.f7468l0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.q0 = dimensionPixelOffset;
        this.f7472p0 = dimensionPixelOffset;
        this.f7471o0 = dimensionPixelOffset;
        this.f7470n0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f7470n0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f7471o0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f7472p0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.q0 = dimensionPixelOffset5;
        }
        this.f7469m0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C1605r0 c1605r0 = this.f7473r0;
        c1605r0.f14878h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1605r0.f14876e = dimensionPixelSize;
            c1605r0.f14872a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1605r0.f = dimensionPixelSize2;
            c1605r0.f14873b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1605r0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f7474s0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f7475t0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = J02.u0(4);
        this.f7461e0 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f7464h0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable u02 = J02.u0(16);
        if (u02 != null) {
            setNavigationIcon(u02);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable u03 = J02.u0(11);
        if (u03 != null) {
            setLogo(u03);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(J02.s0(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(J02.s0(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        J02.O0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, p.R0] */
    public static R0 g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f14715b = 0;
        marginLayoutParams.f14714a = 8388627;
        return marginLayoutParams;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1457d(getContext());
    }

    public static R0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z7 = layoutParams instanceof R0;
        if (z7) {
            R0 r02 = (R0) layoutParams;
            R0 r03 = new R0(r02);
            r03.f14715b = 0;
            r03.f14715b = r02.f14715b;
            return r03;
        } else if (z7) {
            R0 r04 = new R0((R0) layoutParams);
            r04.f14715b = 0;
            return r04;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            R0 r05 = new R0(marginLayoutParams);
            r05.f14715b = 0;
            ((ViewGroup.MarginLayoutParams) r05).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) r05).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) r05).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) r05).bottomMargin = marginLayoutParams.bottomMargin;
            return r05;
        } else {
            R0 r06 = new R0(layoutParams);
            r06.f14715b = 0;
            return r06;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i7, ArrayList arrayList) {
        boolean z7;
        Field field = AbstractC1066z.f11214a;
        if (getLayoutDirection() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (z7) {
            for (int i8 = childCount - 1; i8 >= 0; i8--) {
                View childAt = getChildAt(i8);
                R0 r02 = (R0) childAt.getLayoutParams();
                if (r02.f14715b == 0 && s(childAt) && i(r02.f14714a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            R0 r03 = (R0) childAt2.getLayoutParams();
            if (r03.f14715b == 0 && s(childAt2) && i(r03.f14714a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z7) {
        R0 r02;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            r02 = g();
        } else if (!checkLayoutParams(layoutParams)) {
            r02 = h(layoutParams);
        } else {
            r02 = (R0) layoutParams;
        }
        r02.f14715b = 1;
        if (z7 && this.f7463g0 != null) {
            view.setLayoutParams(r02);
            this.f7444C0.add(view);
            return;
        }
        addView(view, r02);
    }

    public final void c() {
        if (this.f7462f0 == null) {
            C1601p c1601p = new C1601p(getContext());
            this.f7462f0 = c1601p;
            c1601p.setImageDrawable(this.f);
            this.f7462f0.setContentDescription(this.f7461e0);
            R0 g3 = g();
            g3.f14714a = (this.f7468l0 & 112) | 8388611;
            g3.f14715b = 2;
            this.f7462f0.setLayoutParams(g3);
            this.f7462f0.setOnClickListener(new O0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof R0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p.r0] */
    public final void d() {
        if (this.f7473r0 == null) {
            ?? obj = new Object();
            obj.f14872a = 0;
            obj.f14873b = 0;
            obj.f14874c = Integer.MIN_VALUE;
            obj.f14875d = Integer.MIN_VALUE;
            obj.f14876e = 0;
            obj.f = 0;
            obj.f14877g = false;
            obj.f14878h = false;
            this.f7473r0 = obj;
        }
    }

    public final void e() {
        if (this.f7456a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f7456a = actionMenuView;
            actionMenuView.setPopupTheme(this.f7465i0);
            this.f7456a.setOnMenuItemClickListener(this.f7448G0);
            ActionMenuView actionMenuView2 = this.f7456a;
            C0585f c0585f = new C0585f(this, 14);
            actionMenuView2.getClass();
            actionMenuView2.f7340r0 = c0585f;
            R0 g3 = g();
            g3.f14714a = (this.f7468l0 & 112) | 8388613;
            this.f7456a.setLayoutParams(g3);
            b(this.f7456a, false);
        }
        ActionMenuView actionMenuView3 = this.f7456a;
        if (actionMenuView3.f7337n0 == null) {
            MenuC1545i menuC1545i = (MenuC1545i) actionMenuView3.getMenu();
            if (this.f7450I0 == null) {
                this.f7450I0 = new Q0(this);
            }
            this.f7456a.setExpandedActionViewsExclusive(true);
            menuC1545i.b(this.f7450I0, this.f7464h0);
            t();
        }
    }

    public final void f() {
        if (this.f7459d == null) {
            this.f7459d = new C1601p(getContext());
            R0 g3 = g();
            g3.f14714a = (this.f7468l0 & 112) | 8388611;
            this.f7459d.setLayoutParams(g3);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1601p c1601p = this.f7462f0;
        if (c1601p != null) {
            return c1601p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1601p c1601p = this.f7462f0;
        if (c1601p != null) {
            return c1601p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1605r0 c1605r0 = this.f7473r0;
        if (c1605r0 != null) {
            if (c1605r0.f14877g) {
                return c1605r0.f14872a;
            }
            return c1605r0.f14873b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f7475t0;
        if (i7 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i7;
    }

    public int getContentInsetLeft() {
        C1605r0 c1605r0 = this.f7473r0;
        if (c1605r0 != null) {
            return c1605r0.f14872a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1605r0 c1605r0 = this.f7473r0;
        if (c1605r0 != null) {
            return c1605r0.f14873b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1605r0 c1605r0 = this.f7473r0;
        if (c1605r0 != null) {
            if (c1605r0.f14877g) {
                return c1605r0.f14873b;
            }
            return c1605r0.f14872a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f7474s0;
        if (i7 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i7;
    }

    public int getCurrentContentInsetEnd() {
        MenuC1545i menuC1545i;
        ActionMenuView actionMenuView = this.f7456a;
        if (actionMenuView != null && (menuC1545i = actionMenuView.f7337n0) != null && menuC1545i.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f7475t0, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        Field field = AbstractC1066z.f11214a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = AbstractC1066z.f11214a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f7474s0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C1603q c1603q = this.f7460e;
        if (c1603q != null) {
            return c1603q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1603q c1603q = this.f7460e;
        if (c1603q != null) {
            return c1603q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f7456a.getMenu();
    }

    public View getNavButtonView() {
        return this.f7459d;
    }

    public CharSequence getNavigationContentDescription() {
        C1601p c1601p = this.f7459d;
        if (c1601p != null) {
            return c1601p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1601p c1601p = this.f7459d;
        if (c1601p != null) {
            return c1601p.getDrawable();
        }
        return null;
    }

    public C1587i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f7456a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f7464h0;
    }

    public int getPopupTheme() {
        return this.f7465i0;
    }

    public CharSequence getSubtitle() {
        return this.f7478w0;
    }

    public final TextView getSubtitleTextView() {
        return this.f7458c;
    }

    public CharSequence getTitle() {
        return this.f7477v0;
    }

    public int getTitleMarginBottom() {
        return this.q0;
    }

    public int getTitleMarginEnd() {
        return this.f7471o0;
    }

    public int getTitleMarginStart() {
        return this.f7470n0;
    }

    public int getTitleMarginTop() {
        return this.f7472p0;
    }

    public final TextView getTitleTextView() {
        return this.f7457b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p.U0] */
    public L getWrapper() {
        boolean z7;
        Drawable drawable;
        if (this.f7449H0 == null) {
            ?? obj = new Object();
            obj.f14730l = 0;
            obj.f14721a = this;
            obj.f14727h = getTitle();
            obj.f14728i = getSubtitle();
            if (obj.f14727h != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            obj.f14726g = z7;
            obj.f = getNavigationIcon();
            String str = null;
            j J02 = j.J0(getContext(), null, AbstractC1091a.f11351a, R.attr.actionBarStyle);
            obj.f14731m = J02.u0(15);
            TypedArray typedArray = (TypedArray) J02.f4683c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f14726g = true;
                obj.f14727h = text;
                if ((obj.f14722b & 8) != 0) {
                    Toolbar toolbar = obj.f14721a;
                    toolbar.setTitle(text);
                    if (obj.f14726g) {
                        AbstractC1066z.f(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f14728i = text2;
                if ((obj.f14722b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable u02 = J02.u0(20);
            if (u02 != null) {
                obj.f14725e = u02;
                obj.c();
            }
            Drawable u03 = J02.u0(17);
            if (u03 != null) {
                obj.f14724d = u03;
                obj.c();
            }
            if (obj.f == null && (drawable = obj.f14731m) != null) {
                obj.f = drawable;
                int i7 = obj.f14722b & 4;
                Toolbar toolbar2 = obj.f14721a;
                if (i7 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f14723c;
                if (view != null && (obj.f14722b & 16) != 0) {
                    removeView(view);
                }
                obj.f14723c = inflate;
                if (inflate != null && (obj.f14722b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f14722b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f7473r0.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f7466j0 = resourceId2;
                C1570C c1570c = this.f7457b;
                if (c1570c != null) {
                    c1570c.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f7467k0 = resourceId3;
                C1570C c1570c2 = this.f7458c;
                if (c1570c2 != null) {
                    c1570c2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            J02.O0();
            if (R.string.abc_action_bar_up_description != obj.f14730l) {
                obj.f14730l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i8 = obj.f14730l;
                    if (i8 != 0) {
                        str = getContext().getString(i8);
                    }
                    obj.j = str;
                    obj.b();
                }
            }
            obj.j = getNavigationContentDescription();
            setNavigationOnClickListener(new O0((U0) obj));
            this.f7449H0 = obj;
        }
        return this.f7449H0;
    }

    public final int i(int i7) {
        Field field = AbstractC1066z.f11214a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, layoutDirection) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    public final int j(View view, int i7) {
        int i8;
        R0 r02 = (R0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i7 > 0) {
            i8 = (measuredHeight - i7) / 2;
        } else {
            i8 = 0;
        }
        int i9 = r02.f14714a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f7476u0 & 112;
        }
        if (i9 != 48) {
            if (i9 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i11 = ((ViewGroup.MarginLayoutParams) r02).topMargin;
                if (i10 < i11) {
                    i10 = i11;
                } else {
                    int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
                    int i13 = ((ViewGroup.MarginLayoutParams) r02).bottomMargin;
                    if (i12 < i13) {
                        i10 = Math.max(0, i10 - (i13 - i12));
                    }
                }
                return paddingTop + i10;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) r02).bottomMargin) - i8;
        }
        return getPaddingTop() - i8;
    }

    public final void m() {
        Iterator it = this.f7447F0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f7446E0.f4683c).iterator();
        while (it2.hasNext()) {
            ((E) it2.next()).f16634a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f7447F0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        if (view.getParent() != this && !this.f7444C0.contains(view)) {
            return false;
        }
        return true;
    }

    public final int o(View view, int i7, int i8, int[] iArr) {
        R0 r02 = (R0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) r02).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i7;
        iArr[0] = Math.max(0, -i9);
        int j = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) r02).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f7455N0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f7442A0 = false;
        }
        if (!this.f7442A0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f7442A0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f7442A0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029b A[LOOP:0: B:106:0x0299->B:107:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8 A[LOOP:1: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d6 A[LOOP:2: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325 A[LOOP:3: B:121:0x0323->B:122:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean a7 = b1.a(this);
        int i16 = !a7 ? 1 : 0;
        int i17 = 0;
        if (s(this.f7459d)) {
            r(this.f7459d, i7, 0, i8, this.f7469m0);
            i9 = k(this.f7459d) + this.f7459d.getMeasuredWidth();
            i10 = Math.max(0, l(this.f7459d) + this.f7459d.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f7459d.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (s(this.f7462f0)) {
            r(this.f7462f0, i7, 0, i8, this.f7469m0);
            i9 = k(this.f7462f0) + this.f7462f0.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f7462f0) + this.f7462f0.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f7462f0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        int max2 = Math.max(0, currentContentInsetStart - i9);
        int[] iArr = this.f7445D0;
        iArr[a7 ? 1 : 0] = max2;
        if (s(this.f7456a)) {
            r(this.f7456a, i7, max, i8, this.f7469m0);
            i12 = k(this.f7456a) + this.f7456a.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f7456a) + this.f7456a.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f7456a.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[i16] = Math.max(0, currentContentInsetEnd - i12);
        if (s(this.f7463g0)) {
            max3 += q(this.f7463g0, i7, max3, i8, 0, iArr);
            i10 = Math.max(i10, l(this.f7463g0) + this.f7463g0.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f7463g0.getMeasuredState());
        }
        if (s(this.f7460e)) {
            max3 += q(this.f7460e, i7, max3, i8, 0, iArr);
            i10 = Math.max(i10, l(this.f7460e) + this.f7460e.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f7460e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((R0) childAt.getLayoutParams()).f14715b == 0 && s(childAt)) {
                max3 += q(childAt, i7, max3, i8, 0, iArr);
                i10 = Math.max(i10, l(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        int i19 = this.f7472p0 + this.q0;
        int i20 = this.f7470n0 + this.f7471o0;
        if (s(this.f7457b)) {
            q(this.f7457b, i7, max3 + i20, i8, i19, iArr);
            int k2 = k(this.f7457b) + this.f7457b.getMeasuredWidth();
            i13 = l(this.f7457b) + this.f7457b.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i11, this.f7457b.getMeasuredState());
            i15 = k2;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (s(this.f7458c)) {
            i15 = Math.max(i15, q(this.f7458c, i7, max3 + i20, i8, i13 + i19, iArr));
            i13 += l(this.f7458c) + this.f7458c.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i14, this.f7458c.getMeasuredState());
        }
        int max4 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i15, getSuggestedMinimumWidth()), i7, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, i14 << 16);
        if (this.f7451J0) {
            int childCount2 = getChildCount();
            for (int i21 = 0; i21 < childCount2; i21++) {
                View childAt2 = getChildAt(i21);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i17);
        }
        i17 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i17);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuC1545i menuC1545i;
        MenuItem findItem;
        if (!(parcelable instanceof T0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T0 t02 = (T0) parcelable;
        super.onRestoreInstanceState(t02.f14517a);
        ActionMenuView actionMenuView = this.f7456a;
        if (actionMenuView != null) {
            menuC1545i = actionMenuView.f7337n0;
        } else {
            menuC1545i = null;
        }
        int i7 = t02.f14718c;
        if (i7 != 0 && this.f7450I0 != null && menuC1545i != null && (findItem = menuC1545i.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (t02.f14719d) {
            RunnableC1375b runnableC1375b = this.f7455N0;
            removeCallbacks(runnableC1375b);
            post(runnableC1375b);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        d();
        C1605r0 c1605r0 = this.f7473r0;
        boolean z7 = true;
        if (i7 != 1) {
            z7 = false;
        }
        if (z7 != c1605r0.f14877g) {
            c1605r0.f14877g = z7;
            if (c1605r0.f14878h) {
                if (z7) {
                    int i8 = c1605r0.f14875d;
                    if (i8 == Integer.MIN_VALUE) {
                        i8 = c1605r0.f14876e;
                    }
                    c1605r0.f14872a = i8;
                    int i9 = c1605r0.f14874c;
                    if (i9 == Integer.MIN_VALUE) {
                        i9 = c1605r0.f;
                    }
                    c1605r0.f14873b = i9;
                    return;
                }
                int i10 = c1605r0.f14874c;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = c1605r0.f14876e;
                }
                c1605r0.f14872a = i10;
                int i11 = c1605r0.f14875d;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = c1605r0.f;
                }
                c1605r0.f14873b = i11;
                return;
            }
            c1605r0.f14872a = c1605r0.f14876e;
            c1605r0.f14873b = c1605r0.f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, o0.b, p.T0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z7;
        C1587i c1587i;
        C1581f c1581f;
        o.j jVar;
        ?? abstractC1547b = new AbstractC1547b(super.onSaveInstanceState());
        Q0 q0 = this.f7450I0;
        if (q0 != null && (jVar = q0.f14712b) != null) {
            abstractC1547b.f14718c = jVar.f14461a;
        }
        ActionMenuView actionMenuView = this.f7456a;
        if (actionMenuView != null && (c1587i = actionMenuView.q0) != null && (c1581f = c1587i.f14833m0) != null && c1581f.b()) {
            z7 = true;
        } else {
            z7 = false;
        }
        abstractC1547b.f14719d = z7;
        return abstractC1547b;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7481z0 = false;
        }
        if (!this.f7481z0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f7481z0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f7481z0 = false;
        }
        return true;
    }

    public final int p(View view, int i7, int i8, int[] iArr) {
        R0 r02 = (R0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) r02).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int j = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) r02).leftMargin);
    }

    public final int q(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public void setBackInvokedCallbackEnabled(boolean z7) {
        if (this.f7454M0 != z7) {
            this.f7454M0 = z7;
            t();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(AbstractC1740d.o(getContext(), i7));
    }

    public void setCollapsible(boolean z7) {
        this.f7451J0 = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f7475t0) {
            this.f7475t0 = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f7474s0) {
            this.f7474s0 = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(AbstractC1740d.o(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(AbstractC1740d.o(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f7459d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f7456a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f7465i0 != i7) {
            this.f7465i0 = i7;
            if (i7 == 0) {
                this.f7464h0 = getContext();
            } else {
                this.f7464h0 = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.q0 = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f7471o0 = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f7470n0 = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f7472p0 = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public final void t() {
        boolean z7;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a7 = P0.a(this);
            Q0 q0 = this.f7450I0;
            if (q0 != null && q0.f14712b != null && a7 != null) {
                Field field = AbstractC1066z.f11214a;
                if (isAttachedToWindow() && this.f7454M0) {
                    z7 = true;
                    if (!z7 && this.f7453L0 == null) {
                        if (this.f7452K0 == null) {
                            this.f7452K0 = P0.b(new N0(this, 0));
                        }
                        P0.c(a7, this.f7452K0);
                        this.f7453L0 = a7;
                        return;
                    } else if (z7 && (onBackInvokedDispatcher = this.f7453L0) != null) {
                        P0.d(onBackInvokedDispatcher, this.f7452K0);
                        this.f7453L0 = null;
                        return;
                    }
                }
            }
            z7 = false;
            if (!z7) {
            }
            if (z7) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, p.R0] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f14714a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1091a.f11352b);
        marginLayoutParams.f14714a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f14715b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1601p c1601p = this.f7462f0;
        if (c1601p != null) {
            c1601p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f7462f0.setImageDrawable(drawable);
            return;
        }
        C1601p c1601p = this.f7462f0;
        if (c1601p != null) {
            c1601p.setImageDrawable(this.f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f7460e == null) {
                this.f7460e = new C1603q(getContext(), 0);
            }
            if (!n(this.f7460e)) {
                b(this.f7460e, true);
            }
        } else {
            C1603q c1603q = this.f7460e;
            if (c1603q != null && n(c1603q)) {
                removeView(this.f7460e);
                this.f7444C0.remove(this.f7460e);
            }
        }
        C1603q c1603q2 = this.f7460e;
        if (c1603q2 != null) {
            c1603q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f7460e == null) {
            this.f7460e = new C1603q(getContext(), 0);
        }
        C1603q c1603q = this.f7460e;
        if (c1603q != null) {
            c1603q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C1601p c1601p = this.f7459d;
        if (c1601p != null) {
            c1601p.setContentDescription(charSequence);
            AbstractC0055e.z(this.f7459d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!n(this.f7459d)) {
                b(this.f7459d, true);
            }
        } else {
            C1601p c1601p = this.f7459d;
            if (c1601p != null && n(c1601p)) {
                removeView(this.f7459d);
                this.f7444C0.remove(this.f7459d);
            }
        }
        C1601p c1601p2 = this.f7459d;
        if (c1601p2 != null) {
            c1601p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f7458c == null) {
                Context context = getContext();
                C1570C c1570c = new C1570C(context, null);
                this.f7458c = c1570c;
                c1570c.setSingleLine();
                this.f7458c.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f7467k0;
                if (i7 != 0) {
                    this.f7458c.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f7480y0;
                if (colorStateList != null) {
                    this.f7458c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f7458c)) {
                b(this.f7458c, true);
            }
        } else {
            C1570C c1570c2 = this.f7458c;
            if (c1570c2 != null && n(c1570c2)) {
                removeView(this.f7458c);
                this.f7444C0.remove(this.f7458c);
            }
        }
        C1570C c1570c3 = this.f7458c;
        if (c1570c3 != null) {
            c1570c3.setText(charSequence);
        }
        this.f7478w0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f7480y0 = colorStateList;
        C1570C c1570c = this.f7458c;
        if (c1570c != null) {
            c1570c.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f7457b == null) {
                Context context = getContext();
                C1570C c1570c = new C1570C(context, null);
                this.f7457b = c1570c;
                c1570c.setSingleLine();
                this.f7457b.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f7466j0;
                if (i7 != 0) {
                    this.f7457b.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f7479x0;
                if (colorStateList != null) {
                    this.f7457b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f7457b)) {
                b(this.f7457b, true);
            }
        } else {
            C1570C c1570c2 = this.f7457b;
            if (c1570c2 != null && n(c1570c2)) {
                removeView(this.f7457b);
                this.f7444C0.remove(this.f7457b);
            }
        }
        C1570C c1570c3 = this.f7457b;
        if (c1570c3 != null) {
            c1570c3.setText(charSequence);
        }
        this.f7477v0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f7479x0 = colorStateList;
        C1570C c1570c = this.f7457b;
        if (c1570c != null) {
            c1570c.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(S0 s02) {
    }
}
