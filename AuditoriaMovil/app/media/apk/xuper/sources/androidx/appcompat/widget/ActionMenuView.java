package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.u1;
import com.google.common.primitives.Ints;
/* loaded from: classes.dex */
public class ActionMenuView extends u1 implements g.b, androidx.appcompat.view.menu.n {

    /* renamed from: a  reason: collision with root package name */
    public androidx.appcompat.view.menu.g f1325a;

    /* renamed from: b  reason: collision with root package name */
    public Context f1326b;

    /* renamed from: c  reason: collision with root package name */
    public int f1327c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1328d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.appcompat.widget.d f1329e;

    /* renamed from: f  reason: collision with root package name */
    public m.a f1330f;

    /* renamed from: g  reason: collision with root package name */
    public g.a f1331g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1332h;

    /* renamed from: i  reason: collision with root package name */
    public int f1333i;

    /* renamed from: j  reason: collision with root package name */
    public int f1334j;

    /* renamed from: k  reason: collision with root package name */
    public int f1335k;

    /* renamed from: l  reason: collision with root package name */
    public e f1336l;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements m.a {
        @Override // androidx.appcompat.view.menu.m.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }
    }

    /* loaded from: classes.dex */
    public static class c extends u1.a {

        /* renamed from: c  reason: collision with root package name */
        public boolean f1337c;

        /* renamed from: d  reason: collision with root package name */
        public int f1338d;

        /* renamed from: e  reason: collision with root package name */
        public int f1339e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1340f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1341g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1342h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1337c = cVar.f1337c;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1337c = false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements g.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f1336l;
            if (eVar != null && eVar.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void onMenuModeChange(androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.f1331g;
            if (aVar != null) {
                aVar.onMenuModeChange(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int q(View view, int i10, int i11, int i12, int i13) {
        ActionMenuItemView actionMenuItemView;
        boolean z10;
        int i14;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z11 = true;
        if (actionMenuItemView != null && actionMenuItemView.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 > 0) {
            i14 = 2;
            if (!z10 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z10 || i15 >= 2) {
                    i14 = i15;
                }
                cVar.f1340f = (cVar.f1337c && z10) ? false : false;
                cVar.f1338d = i14;
                view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, Ints.MAX_POWER_OF_TWO), makeMeasureSpec);
                return i14;
            }
        }
        i14 = 0;
        cVar.f1340f = (cVar.f1337c && z10) ? false : false;
        cVar.f1338d = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, Ints.MAX_POWER_OF_TWO), makeMeasureSpec);
        return i14;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean b(androidx.appcompat.view.menu.i iVar) {
        return this.f1325a.performItemAction(iVar, 0);
    }

    @Override // androidx.appcompat.widget.u1, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void g() {
        androidx.appcompat.widget.d dVar = this.f1329e;
        if (dVar != null) {
            dVar.p();
        }
    }

    public Menu getMenu() {
        if (this.f1325a == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f1325a = gVar;
            gVar.setCallback(new d());
            androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(context);
            this.f1329e = dVar;
            dVar.A(true);
            androidx.appcompat.widget.d dVar2 = this.f1329e;
            m.a aVar = this.f1330f;
            if (aVar == null) {
                aVar = new b();
            }
            dVar2.setCallback(aVar);
            this.f1325a.addMenuPresenter(this.f1329e, this.f1326b);
            this.f1329e.y(this);
        }
        return this.f1325a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1329e.r();
    }

    public int getPopupTheme() {
        return this.f1327c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.u1, android.view.ViewGroup
    /* renamed from: h */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f1656b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.u1, android.view.ViewGroup
    /* renamed from: i */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.view.menu.n
    public void initialize(androidx.appcompat.view.menu.g gVar) {
        this.f1325a = gVar;
    }

    @Override // androidx.appcompat.widget.u1, android.view.ViewGroup
    /* renamed from: j */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (cVar.f1656b <= 0) {
                cVar.f1656b = 16;
            }
            return cVar;
        }
        return generateDefaultLayoutParams();
    }

    public c k() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1337c = true;
        return generateDefaultLayoutParams;
    }

    public boolean l(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        if (i10 > 0 && (childAt2 instanceof a)) {
            return z10 | ((a) childAt2).b();
        }
        return z10;
    }

    public boolean m() {
        androidx.appcompat.widget.d dVar = this.f1329e;
        if (dVar != null && dVar.s()) {
            return true;
        }
        return false;
    }

    public boolean n() {
        androidx.appcompat.widget.d dVar = this.f1329e;
        if (dVar != null && dVar.u()) {
            return true;
        }
        return false;
    }

    public boolean o() {
        androidx.appcompat.widget.d dVar = this.f1329e;
        if (dVar != null && dVar.v()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.d dVar = this.f1329e;
        if (dVar != null) {
            dVar.updateMenuView(false);
            if (this.f1329e.v()) {
                this.f1329e.s();
                this.f1329e.B();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // androidx.appcompat.widget.u1, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        if (!this.f1332h) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = y2.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1337c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i15 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    l(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        if (i24 > 0) {
            i14 = paddingRight / i24;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (b10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1337c) {
                    int i26 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1337c) {
                int i29 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = i29 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.u1, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        androidx.appcompat.view.menu.g gVar;
        boolean z11 = this.f1332h;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1332h = z10;
        if (z11 != z10) {
            this.f1333i = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1332h && (gVar = this.f1325a) != null && size != this.f1333i) {
            this.f1333i = size;
            gVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f1332h && childCount > 0) {
            r(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public boolean p() {
        return this.f1328d;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [int, boolean] */
    public final void r(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        int i16;
        boolean z14;
        int i17;
        ?? r14;
        boolean z15;
        int i18;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i19 = size - paddingLeft;
        int i20 = this.f1334j;
        int i21 = i19 / i20;
        int i22 = i19 % i20;
        if (i21 == 0) {
            setMeasuredDimension(i19, 0);
            return;
        }
        int i23 = i20 + (i22 / i21);
        int childCount = getChildCount();
        int i24 = 0;
        int i25 = 0;
        boolean z16 = false;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        long j10 = 0;
        while (i25 < childCount) {
            View childAt = getChildAt(i25);
            int i29 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z17 = childAt instanceof ActionMenuItemView;
                int i30 = i26 + 1;
                if (z17) {
                    int i31 = this.f1335k;
                    i17 = i30;
                    r14 = 0;
                    childAt.setPadding(i31, 0, i31, 0);
                } else {
                    i17 = i30;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1342h = r14;
                cVar.f1339e = r14;
                cVar.f1338d = r14;
                cVar.f1340f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                if (z17 && ((ActionMenuItemView) childAt).d()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                cVar.f1341g = z15;
                if (cVar.f1337c) {
                    i18 = 1;
                } else {
                    i18 = i21;
                }
                int q10 = q(childAt, i23, i18, childMeasureSpec, paddingTop);
                i27 = Math.max(i27, q10);
                if (cVar.f1340f) {
                    i28++;
                }
                if (cVar.f1337c) {
                    z16 = true;
                }
                i21 -= q10;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (q10 == 1) {
                    j10 |= 1 << i25;
                    i24 = i24;
                }
                i26 = i17;
            }
            i25++;
            size2 = i29;
        }
        int i32 = size2;
        if (z16 && i26 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z18 = false;
        while (i28 > 0 && i21 > 0) {
            int i33 = 0;
            int i34 = 0;
            int i35 = Integer.MAX_VALUE;
            long j11 = 0;
            while (i34 < childCount) {
                boolean z19 = z18;
                c cVar2 = (c) getChildAt(i34).getLayoutParams();
                int i36 = i24;
                if (cVar2.f1340f) {
                    int i37 = cVar2.f1338d;
                    if (i37 < i35) {
                        j11 = 1 << i34;
                        i35 = i37;
                        i33 = 1;
                    } else if (i37 == i35) {
                        i33++;
                        j11 |= 1 << i34;
                    }
                }
                i34++;
                i24 = i36;
                z18 = z19;
            }
            z11 = z18;
            i14 = i24;
            j10 |= j11;
            if (i33 > i21) {
                i12 = mode;
                i13 = i19;
                break;
            }
            int i38 = i35 + 1;
            int i39 = 0;
            while (i39 < childCount) {
                View childAt2 = getChildAt(i39);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i40 = i19;
                int i41 = mode;
                long j12 = 1 << i39;
                if ((j11 & j12) == 0) {
                    if (cVar3.f1338d == i38) {
                        j10 |= j12;
                    }
                    z14 = z10;
                } else {
                    if (z10 && cVar3.f1341g && i21 == 1) {
                        int i42 = this.f1335k;
                        z14 = z10;
                        childAt2.setPadding(i42 + i23, 0, i42, 0);
                    } else {
                        z14 = z10;
                    }
                    cVar3.f1338d++;
                    cVar3.f1342h = true;
                    i21--;
                }
                i39++;
                mode = i41;
                i19 = i40;
                z10 = z14;
            }
            i24 = i14;
            z18 = true;
        }
        i12 = mode;
        i13 = i19;
        z11 = z18;
        i14 = i24;
        if (!z16 && i26 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i21 > 0 && j10 != 0 && (i21 < i26 - 1 || z12 || i27 > 1)) {
            float bitCount = Long.bitCount(j10);
            if (!z12) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1341g) {
                    bitCount -= 0.5f;
                }
                int i43 = childCount - 1;
                if ((j10 & (1 << i43)) != 0 && !((c) getChildAt(i43).getLayoutParams()).f1341g) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i16 = (int) ((i21 * i23) / bitCount);
            } else {
                i16 = 0;
            }
            z13 = z11;
            for (int i44 = 0; i44 < childCount; i44++) {
                if ((j10 & (1 << i44)) != 0) {
                    View childAt3 = getChildAt(i44);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1339e = i16;
                        cVar4.f1342h = true;
                        if (i44 == 0 && !cVar4.f1341g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i16) / 2;
                        }
                    } else if (cVar4.f1337c) {
                        cVar4.f1339e = i16;
                        cVar4.f1342h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i16) / 2;
                    } else {
                        if (i44 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i16 / 2;
                        }
                        if (i44 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i16 / 2;
                        }
                    }
                    z13 = true;
                }
            }
        } else {
            z13 = z11;
        }
        if (z13) {
            for (int i45 = 0; i45 < childCount; i45++) {
                View childAt4 = getChildAt(i45);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1342h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1338d * i23) + cVar5.f1339e, Ints.MAX_POWER_OF_TWO), childMeasureSpec);
                }
            }
        }
        if (i12 != 1073741824) {
            i15 = i14;
        } else {
            i15 = i32;
        }
        setMeasuredDimension(i13, i15);
    }

    public androidx.appcompat.view.menu.g s() {
        return this.f1325a;
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1329e.x(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f1336l = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1329e.z(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1328d = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1327c != i10) {
            this.f1327c = i10;
            if (i10 == 0) {
                this.f1326b = getContext();
            } else {
                this.f1326b = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.d dVar) {
        this.f1329e = dVar;
        dVar.y(this);
    }

    public void t(m.a aVar, g.a aVar2) {
        this.f1330f = aVar;
        this.f1331g = aVar2;
    }

    public boolean u() {
        androidx.appcompat.widget.d dVar = this.f1329e;
        if (dVar != null && dVar.B()) {
            return true;
        }
        return false;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1334j = (int) (56.0f * f10);
        this.f1335k = (int) (f10 * 4.0f);
        this.f1326b = context;
        this.f1327c = 0;
    }
}
