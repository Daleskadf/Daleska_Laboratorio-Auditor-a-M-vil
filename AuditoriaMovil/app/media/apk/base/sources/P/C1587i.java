package p;

import a1.C0415A;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.example.appecoactivate.R;
import java.util.ArrayList;
import o.MenuC1545i;
/* renamed from: p.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587i implements o.p {

    /* renamed from: X  reason: collision with root package name */
    public ActionMenuView f14817X;

    /* renamed from: Y  reason: collision with root package name */
    public C1585h f14818Y;

    /* renamed from: Z  reason: collision with root package name */
    public Drawable f14819Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14820a;

    /* renamed from: b  reason: collision with root package name */
    public Context f14821b;

    /* renamed from: c  reason: collision with root package name */
    public MenuC1545i f14822c;

    /* renamed from: d  reason: collision with root package name */
    public final LayoutInflater f14823d;

    /* renamed from: e  reason: collision with root package name */
    public o.o f14824e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f14825e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f14826f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f14827g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f14828h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f14829i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f14830j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f14831k0;

    /* renamed from: m0  reason: collision with root package name */
    public C1581f f14833m0;

    /* renamed from: n0  reason: collision with root package name */
    public C1581f f14834n0;

    /* renamed from: o0  reason: collision with root package name */
    public H.h f14835o0;

    /* renamed from: p0  reason: collision with root package name */
    public C1583g f14836p0;
    public final int f = R.layout.abc_action_menu_item_layout;

    /* renamed from: l0  reason: collision with root package name */
    public final SparseBooleanArray f14832l0 = new SparseBooleanArray();
    public final C0415A q0 = new C0415A(this);

    public C1587i(Context context) {
        this.f14820a = context;
        this.f14823d = LayoutInflater.from(context);
    }

    @Override // o.p
    public final void a(MenuC1545i menuC1545i, boolean z7) {
        d();
        C1581f c1581f = this.f14834n0;
        if (c1581f != null && c1581f.b()) {
            c1581f.f14494i.dismiss();
        }
        o.o oVar = this.f14824e;
        if (oVar != null) {
            oVar.a(menuC1545i, z7);
        }
    }

    public final View b(o.j jVar, View view, ActionMenuView actionMenuView) {
        o.q qVar;
        View view2 = jVar.f14484z;
        if (view2 == null) {
            view2 = null;
        }
        int i7 = 0;
        if (view2 == null || jVar.c()) {
            if (view instanceof o.q) {
                qVar = (o.q) view;
            } else {
                qVar = (o.q) this.f14823d.inflate(this.f, (ViewGroup) actionMenuView, false);
            }
            qVar.a(jVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qVar;
            actionMenuItemView.setItemInvoker(this.f14817X);
            if (this.f14836p0 == null) {
                this.f14836p0 = new C1583g(this);
            }
            actionMenuItemView.setPopupCallback(this.f14836p0);
            view2 = (View) qVar;
        }
        if (jVar.f14460B) {
            i7 = 8;
        }
        view2.setVisibility(i7);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C1591k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // o.p
    public final void c() {
        int i7;
        o.j jVar;
        ActionMenuView actionMenuView = this.f14817X;
        ArrayList arrayList = null;
        boolean z7 = false;
        if (actionMenuView != null) {
            MenuC1545i menuC1545i = this.f14822c;
            if (menuC1545i != null) {
                menuC1545i.i();
                ArrayList k2 = this.f14822c.k();
                int size = k2.size();
                i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    o.j jVar2 = (o.j) k2.get(i8);
                    if (jVar2.d()) {
                        View childAt = actionMenuView.getChildAt(i7);
                        if (childAt instanceof o.q) {
                            jVar = ((o.q) childAt).getItemData();
                        } else {
                            jVar = null;
                        }
                        View b5 = b(jVar2, childAt, actionMenuView);
                        if (jVar2 != jVar) {
                            b5.setPressed(false);
                            b5.jumpDrawablesToCurrentState();
                        }
                        if (b5 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) b5.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b5);
                            }
                            this.f14817X.addView(b5, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i7) == this.f14818Y) {
                    i7++;
                } else {
                    actionMenuView.removeViewAt(i7);
                }
            }
        }
        this.f14817X.requestLayout();
        MenuC1545i menuC1545i2 = this.f14822c;
        if (menuC1545i2 != null) {
            menuC1545i2.i();
            ArrayList arrayList2 = menuC1545i2.f14448i;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((o.j) arrayList2.get(i9)).getClass();
            }
        }
        MenuC1545i menuC1545i3 = this.f14822c;
        if (menuC1545i3 != null) {
            menuC1545i3.i();
            arrayList = menuC1545i3.j;
        }
        if (this.f14826f0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z7 = !((o.j) arrayList.get(0)).f14460B;
            } else if (size3 > 0) {
                z7 = true;
            }
        }
        if (z7) {
            if (this.f14818Y == null) {
                this.f14818Y = new C1585h(this, this.f14820a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f14818Y.getParent();
            if (viewGroup2 != this.f14817X) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f14818Y);
                }
                ActionMenuView actionMenuView2 = this.f14817X;
                C1585h c1585h = this.f14818Y;
                actionMenuView2.getClass();
                C1591k h8 = ActionMenuView.h();
                h8.f14837a = true;
                actionMenuView2.addView(c1585h, h8);
            }
        } else {
            C1585h c1585h2 = this.f14818Y;
            if (c1585h2 != null) {
                ViewParent parent = c1585h2.getParent();
                ActionMenuView actionMenuView3 = this.f14817X;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f14818Y);
                }
            }
        }
        this.f14817X.setOverflowReserved(this.f14826f0);
    }

    public final boolean d() {
        ActionMenuView actionMenuView;
        H.h hVar = this.f14835o0;
        if (hVar != null && (actionMenuView = this.f14817X) != null) {
            actionMenuView.removeCallbacks(hVar);
            this.f14835o0 = null;
            return true;
        }
        C1581f c1581f = this.f14833m0;
        if (c1581f != null) {
            if (c1581f.b()) {
                c1581f.f14494i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // o.p
    public final boolean e(o.j jVar) {
        return false;
    }

    @Override // o.p
    public final void f(o.o oVar) {
        throw null;
    }

    @Override // o.p
    public final void g(Context context, MenuC1545i menuC1545i) {
        this.f14821b = context;
        LayoutInflater.from(context);
        this.f14822c = menuC1545i;
        Resources resources = context.getResources();
        if (!this.f14827g0) {
            this.f14826f0 = true;
        }
        int i7 = 2;
        this.f14828h0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i8 <= 600 && ((i8 <= 960 || i9 <= 720) && (i8 <= 720 || i9 <= 960))) {
            if (i8 < 500 && ((i8 <= 640 || i9 <= 480) && (i8 <= 480 || i9 <= 640))) {
                if (i8 >= 360) {
                    i7 = 3;
                }
            } else {
                i7 = 4;
            }
        } else {
            i7 = 5;
        }
        this.f14830j0 = i7;
        int i10 = this.f14828h0;
        if (this.f14826f0) {
            if (this.f14818Y == null) {
                C1585h c1585h = new C1585h(this, this.f14820a);
                this.f14818Y = c1585h;
                if (this.f14825e0) {
                    c1585h.setImageDrawable(this.f14819Z);
                    this.f14819Z = null;
                    this.f14825e0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f14818Y.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f14818Y.getMeasuredWidth();
        } else {
            this.f14818Y = null;
        }
        this.f14829i0 = i10;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // o.p
    public final boolean h() {
        int i7;
        ArrayList arrayList;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        MenuC1545i menuC1545i = this.f14822c;
        if (menuC1545i != null) {
            arrayList = menuC1545i.k();
            i7 = arrayList.size();
        } else {
            i7 = 0;
            arrayList = null;
        }
        int i9 = this.f14830j0;
        int i10 = this.f14829i0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f14817X;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 2;
            z7 = true;
            if (i11 >= i7) {
                break;
            }
            o.j jVar = (o.j) arrayList.get(i11);
            int i14 = jVar.f14483y;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z11 = true;
            }
            if (this.f14831k0 && jVar.f14460B) {
                i9 = 0;
            }
            i11++;
        }
        if (this.f14826f0 && (z11 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = this.f14832l0;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i7) {
            o.j jVar2 = (o.j) arrayList.get(i16);
            int i18 = jVar2.f14483y;
            if ((i18 & 2) == i8) {
                z8 = z7;
            } else {
                z8 = false;
            }
            int i19 = jVar2.f14462b;
            if (z8) {
                View b5 = b(jVar2, null, actionMenuView);
                b5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b5.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z7);
                }
                jVar2.f(z7);
            } else if ((i18 & 1) == z7) {
                boolean z12 = sparseBooleanArray.get(i19);
                if ((i15 > 0 || z12) && i10 > 0) {
                    z9 = z7;
                } else {
                    z9 = false;
                }
                if (z9) {
                    View b7 = b(jVar2, null, actionMenuView);
                    b7.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b7.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    if (i10 + i17 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z9 &= z10;
                }
                if (z9 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z12) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        o.j jVar3 = (o.j) arrayList.get(i20);
                        if (jVar3.f14462b == i19) {
                            if (jVar3.d()) {
                                i15++;
                            }
                            jVar3.f(false);
                        }
                    }
                }
                if (z9) {
                    i15--;
                }
                jVar2.f(z9);
            } else {
                jVar2.f(false);
                i16++;
                i8 = 2;
                z7 = true;
            }
            i16++;
            i8 = 2;
            z7 = true;
        }
        return z7;
    }

    public final boolean i() {
        MenuC1545i menuC1545i;
        if (this.f14826f0) {
            C1581f c1581f = this.f14833m0;
            if ((c1581f == null || !c1581f.b()) && (menuC1545i = this.f14822c) != null && this.f14817X != null && this.f14835o0 == null) {
                menuC1545i.i();
                if (!menuC1545i.j.isEmpty()) {
                    H.h hVar = new H.h(this, new C1581f(this, this.f14821b, this.f14822c, this.f14818Y), 21, false);
                    this.f14835o0 = hVar;
                    this.f14817X.post(hVar);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o.p
    public final boolean j(o.t tVar) {
        boolean z7;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        o.t tVar2 = tVar;
        while (true) {
            MenuC1545i menuC1545i = tVar2.f14514v;
            if (menuC1545i == this.f14822c) {
                break;
            }
            tVar2 = (o.t) menuC1545i;
        }
        ActionMenuView actionMenuView = this.f14817X;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i7);
                if ((childAt instanceof o.q) && ((o.q) childAt).getItemData() == tVar2.f14515w) {
                    view = childAt;
                    break;
                }
                i7++;
            }
        }
        if (view == null) {
            return false;
        }
        tVar.f14515w.getClass();
        int size = tVar.f.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                MenuItem item = tVar.getItem(i8);
                if (item.isVisible() && item.getIcon() != null) {
                    z7 = true;
                    break;
                }
                i8++;
            } else {
                z7 = false;
                break;
            }
        }
        C1581f c1581f = new C1581f(this, this.f14821b, tVar, view);
        this.f14834n0 = c1581f;
        c1581f.f14492g = z7;
        o.k kVar = c1581f.f14494i;
        if (kVar != null) {
            kVar.o(z7);
        }
        C1581f c1581f2 = this.f14834n0;
        if (!c1581f2.b()) {
            if (c1581f2.f14491e != null) {
                c1581f2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        o.o oVar = this.f14824e;
        if (oVar != null) {
            oVar.f(tVar);
        }
        return true;
    }

    @Override // o.p
    public final boolean k(o.j jVar) {
        return false;
    }
}
