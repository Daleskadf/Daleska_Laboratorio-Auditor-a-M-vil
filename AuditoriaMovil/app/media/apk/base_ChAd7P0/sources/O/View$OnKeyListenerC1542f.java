package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.example.appecoactivate.R;
import g1.C1006c;
import h0.AbstractC1066z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p.AbstractC1588i0;
import p.C1596m0;
/* renamed from: o.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC1542f extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b  reason: collision with root package name */
    public final Context f14415b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14416c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14417d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14418e;
    public final Handler f;

    /* renamed from: i0  reason: collision with root package name */
    public View f14423i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f14424j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f14425k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f14426l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f14427m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f14428n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f14429o0;
    public boolean q0;

    /* renamed from: r0  reason: collision with root package name */
    public o f14431r0;

    /* renamed from: s0  reason: collision with root package name */
    public ViewTreeObserver f14432s0;

    /* renamed from: t0  reason: collision with root package name */
    public l f14433t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f14434u0;

    /* renamed from: X  reason: collision with root package name */
    public final ArrayList f14412X = new ArrayList();

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f14413Y = new ArrayList();

    /* renamed from: Z  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC1539c f14414Z = new ViewTreeObserver$OnGlobalLayoutListenerC1539c(this, 0);

    /* renamed from: e0  reason: collision with root package name */
    public final View$OnAttachStateChangeListenerC1540d f14419e0 = new View$OnAttachStateChangeListenerC1540d(this, 0);

    /* renamed from: f0  reason: collision with root package name */
    public final C1006c f14420f0 = new C1006c(this);

    /* renamed from: g0  reason: collision with root package name */
    public int f14421g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public int f14422h0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f14430p0 = false;

    public View$OnKeyListenerC1542f(Context context, View view, int i7, boolean z7) {
        this.f14415b = context;
        this.f14423i0 = view;
        this.f14417d = i7;
        this.f14418e = z7;
        Field field = AbstractC1066z.f11214a;
        this.f14425k0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f14416c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // o.p
    public final void a(MenuC1545i menuC1545i, boolean z7) {
        int i7;
        ArrayList arrayList = this.f14413Y;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (menuC1545i == ((C1541e) arrayList.get(i8)).f14410b) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 < 0) {
            return;
        }
        int i9 = i8 + 1;
        if (i9 < arrayList.size()) {
            ((C1541e) arrayList.get(i9)).f14410b.c(false);
        }
        C1541e c1541e = (C1541e) arrayList.remove(i8);
        CopyOnWriteArrayList copyOnWriteArrayList = c1541e.f14410b.f14456r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z8 = this.f14434u0;
        C1596m0 c1596m0 = c1541e.f14409a;
        if (z8) {
            AbstractC1588i0.b(c1596m0.q0, null);
            c1596m0.q0.setAnimationStyle(0);
        }
        c1596m0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f14425k0 = ((C1541e) arrayList.get(size2 - 1)).f14411c;
        } else {
            View view = this.f14423i0;
            Field field = AbstractC1066z.f11214a;
            if (view.getLayoutDirection() == 1) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            this.f14425k0 = i7;
        }
        if (size2 == 0) {
            dismiss();
            o oVar = this.f14431r0;
            if (oVar != null) {
                oVar.a(menuC1545i, true);
            }
            ViewTreeObserver viewTreeObserver = this.f14432s0;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f14432s0.removeGlobalOnLayoutListener(this.f14414Z);
                }
                this.f14432s0 = null;
            }
            this.f14424j0.removeOnAttachStateChangeListener(this.f14419e0);
            this.f14433t0.onDismiss();
        } else if (z7) {
            ((C1541e) arrayList.get(0)).f14410b.c(false);
        }
    }

    @Override // o.r
    public final void b() {
        boolean z7;
        if (i()) {
            return;
        }
        ArrayList arrayList = this.f14412X;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC1545i) it.next());
        }
        arrayList.clear();
        View view = this.f14423i0;
        this.f14424j0 = view;
        if (view != null) {
            if (this.f14432s0 == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f14432s0 = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14414Z);
            }
            this.f14424j0.addOnAttachStateChangeListener(this.f14419e0);
        }
    }

    @Override // o.p
    public final void c() {
        Iterator it = this.f14413Y.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1541e) it.next()).f14409a.f14801c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1543g) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.r
    public final ListView d() {
        ArrayList arrayList = this.f14413Y;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1541e) arrayList.get(arrayList.size() - 1)).f14409a.f14801c;
    }

    @Override // o.r
    public final void dismiss() {
        ArrayList arrayList = this.f14413Y;
        int size = arrayList.size();
        if (size > 0) {
            C1541e[] c1541eArr = (C1541e[]) arrayList.toArray(new C1541e[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                C1541e c1541e = c1541eArr[i7];
                if (c1541e.f14409a.q0.isShowing()) {
                    c1541e.f14409a.dismiss();
                }
            }
        }
    }

    @Override // o.p
    public final void f(o oVar) {
        this.f14431r0 = oVar;
    }

    @Override // o.p
    public final boolean h() {
        return false;
    }

    @Override // o.r
    public final boolean i() {
        ArrayList arrayList = this.f14413Y;
        if (arrayList.size() <= 0 || !((C1541e) arrayList.get(0)).f14409a.q0.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // o.p
    public final boolean j(t tVar) {
        Iterator it = this.f14413Y.iterator();
        while (it.hasNext()) {
            C1541e c1541e = (C1541e) it.next();
            if (tVar == c1541e.f14410b) {
                c1541e.f14409a.f14801c.requestFocus();
                return true;
            }
        }
        if (tVar.hasVisibleItems()) {
            l(tVar);
            o oVar = this.f14431r0;
            if (oVar != null) {
                oVar.f(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // o.k
    public final void l(MenuC1545i menuC1545i) {
        menuC1545i.b(this, this.f14415b);
        if (i()) {
            v(menuC1545i);
        } else {
            this.f14412X.add(menuC1545i);
        }
    }

    @Override // o.k
    public final void n(View view) {
        if (this.f14423i0 != view) {
            this.f14423i0 = view;
            int i7 = this.f14421g0;
            Field field = AbstractC1066z.f11214a;
            this.f14422h0 = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // o.k
    public final void o(boolean z7) {
        this.f14430p0 = z7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1541e c1541e;
        ArrayList arrayList = this.f14413Y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                c1541e = (C1541e) arrayList.get(i7);
                if (!c1541e.f14409a.q0.isShowing()) {
                    break;
                }
                i7++;
            } else {
                c1541e = null;
                break;
            }
        }
        if (c1541e != null) {
            c1541e.f14410b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i7 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // o.k
    public final void p(int i7) {
        if (this.f14421g0 != i7) {
            this.f14421g0 = i7;
            View view = this.f14423i0;
            Field field = AbstractC1066z.f11214a;
            this.f14422h0 = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // o.k
    public final void q(int i7) {
        this.f14426l0 = true;
        this.f14428n0 = i7;
    }

    @Override // o.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f14433t0 = (l) onDismissListener;
    }

    @Override // o.k
    public final void s(boolean z7) {
        this.q0 = z7;
    }

    @Override // o.k
    public final void t(int i7) {
        this.f14427m0 = true;
        this.f14429o0 = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b1  */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.m0, p.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(o.MenuC1545i r19) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.View$OnKeyListenerC1542f.v(o.i):void");
    }
}
