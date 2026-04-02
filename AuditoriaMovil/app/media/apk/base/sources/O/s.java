package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.example.appecoactivate.R;
import h0.AbstractC1066z;
import java.lang.reflect.Field;
import p.AbstractC1584g0;
import p.C1594l0;
import p.C1596m0;
/* loaded from: classes.dex */
public final class s extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: X  reason: collision with root package name */
    public final int f14496X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1596m0 f14497Y;

    /* renamed from: b  reason: collision with root package name */
    public final Context f14499b;

    /* renamed from: c  reason: collision with root package name */
    public final MenuC1545i f14500c;

    /* renamed from: d  reason: collision with root package name */
    public final C1543g f14501d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14502e;
    public final int f;

    /* renamed from: f0  reason: collision with root package name */
    public l f14504f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f14505g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f14506h0;

    /* renamed from: i0  reason: collision with root package name */
    public o f14507i0;

    /* renamed from: j0  reason: collision with root package name */
    public ViewTreeObserver f14508j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f14509k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f14510l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f14511m0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f14513o0;

    /* renamed from: Z  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC1539c f14498Z = new ViewTreeObserver$OnGlobalLayoutListenerC1539c(this, 1);

    /* renamed from: e0  reason: collision with root package name */
    public final View$OnAttachStateChangeListenerC1540d f14503e0 = new View$OnAttachStateChangeListenerC1540d(this, 1);

    /* renamed from: n0  reason: collision with root package name */
    public int f14512n0 = 0;

    /* JADX WARN: Type inference failed for: r6v1, types: [p.m0, p.g0] */
    public s(int i7, Context context, View view, MenuC1545i menuC1545i, boolean z7) {
        this.f14499b = context;
        this.f14500c = menuC1545i;
        this.f14502e = z7;
        this.f14501d = new C1543g(menuC1545i, LayoutInflater.from(context), z7, R.layout.abc_popup_menu_item_layout);
        this.f14496X = i7;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f14505g0 = view;
        this.f14497Y = new AbstractC1584g0(context, i7);
        menuC1545i.b(this, context);
    }

    @Override // o.p
    public final void a(MenuC1545i menuC1545i, boolean z7) {
        if (menuC1545i != this.f14500c) {
            return;
        }
        dismiss();
        o oVar = this.f14507i0;
        if (oVar != null) {
            oVar.a(menuC1545i, z7);
        }
    }

    @Override // o.r
    public final void b() {
        View view;
        boolean z7;
        Rect rect;
        if (!i()) {
            if (!this.f14509k0 && (view = this.f14505g0) != null) {
                this.f14506h0 = view;
                C1596m0 c1596m0 = this.f14497Y;
                c1596m0.q0.setOnDismissListener(this);
                c1596m0.f14807h0 = this;
                c1596m0.f14815p0 = true;
                c1596m0.q0.setFocusable(true);
                View view2 = this.f14506h0;
                if (this.f14508j0 == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f14508j0 = viewTreeObserver;
                if (z7) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f14498Z);
                }
                view2.addOnAttachStateChangeListener(this.f14503e0);
                c1596m0.f14806g0 = view2;
                c1596m0.f14804e0 = this.f14512n0;
                boolean z8 = this.f14510l0;
                Context context = this.f14499b;
                C1543g c1543g = this.f14501d;
                if (!z8) {
                    this.f14511m0 = k.m(c1543g, context, this.f);
                    this.f14510l0 = true;
                }
                int i7 = this.f14511m0;
                Drawable background = c1596m0.q0.getBackground();
                if (background != null) {
                    Rect rect2 = c1596m0.f14813n0;
                    background.getPadding(rect2);
                    c1596m0.f14802d = rect2.left + rect2.right + i7;
                } else {
                    c1596m0.f14802d = i7;
                }
                c1596m0.q0.setInputMethodMode(2);
                Rect rect3 = this.f14485a;
                if (rect3 != null) {
                    rect = new Rect(rect3);
                } else {
                    rect = null;
                }
                c1596m0.f14814o0 = rect;
                c1596m0.b();
                C1594l0 c1594l0 = c1596m0.f14801c;
                c1594l0.setOnKeyListener(this);
                if (this.f14513o0) {
                    MenuC1545i menuC1545i = this.f14500c;
                    if (menuC1545i.f14450l != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1594l0, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(menuC1545i.f14450l);
                        }
                        frameLayout.setEnabled(false);
                        c1594l0.addHeaderView(frameLayout, null, false);
                    }
                }
                c1596m0.c(c1543g);
                c1596m0.b();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // o.p
    public final void c() {
        this.f14510l0 = false;
        C1543g c1543g = this.f14501d;
        if (c1543g != null) {
            c1543g.notifyDataSetChanged();
        }
    }

    @Override // o.r
    public final ListView d() {
        return this.f14497Y.f14801c;
    }

    @Override // o.r
    public final void dismiss() {
        if (i()) {
            this.f14497Y.dismiss();
        }
    }

    @Override // o.p
    public final void f(o oVar) {
        this.f14507i0 = oVar;
    }

    @Override // o.p
    public final boolean h() {
        return false;
    }

    @Override // o.r
    public final boolean i() {
        if (!this.f14509k0 && this.f14497Y.q0.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // o.p
    public final boolean j(t tVar) {
        int i7;
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f14496X, this.f14499b, this.f14506h0, tVar, this.f14502e);
            o oVar = this.f14507i0;
            nVar.f14493h = oVar;
            k kVar = nVar.f14494i;
            if (kVar != null) {
                kVar.f(oVar);
            }
            boolean u7 = k.u(tVar);
            nVar.f14492g = u7;
            k kVar2 = nVar.f14494i;
            if (kVar2 != null) {
                kVar2.o(u7);
            }
            nVar.j = this.f14504f0;
            this.f14504f0 = null;
            this.f14500c.c(false);
            C1596m0 c1596m0 = this.f14497Y;
            int i8 = c1596m0.f14803e;
            if (!c1596m0.f14796X) {
                i7 = 0;
            } else {
                i7 = c1596m0.f;
            }
            int i9 = this.f14512n0;
            View view = this.f14505g0;
            Field field = AbstractC1066z.f11214a;
            if ((Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 7) == 5) {
                i8 += this.f14505g0.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f14491e != null) {
                    nVar.d(i8, i7, true, true);
                }
            }
            o oVar2 = this.f14507i0;
            if (oVar2 != null) {
                oVar2.f(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // o.k
    public final void n(View view) {
        this.f14505g0 = view;
    }

    @Override // o.k
    public final void o(boolean z7) {
        this.f14501d.f14437c = z7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f14509k0 = true;
        this.f14500c.c(true);
        ViewTreeObserver viewTreeObserver = this.f14508j0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f14508j0 = this.f14506h0.getViewTreeObserver();
            }
            this.f14508j0.removeGlobalOnLayoutListener(this.f14498Z);
            this.f14508j0 = null;
        }
        this.f14506h0.removeOnAttachStateChangeListener(this.f14503e0);
        l lVar = this.f14504f0;
        if (lVar != null) {
            lVar.onDismiss();
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
        this.f14512n0 = i7;
    }

    @Override // o.k
    public final void q(int i7) {
        this.f14497Y.f14803e = i7;
    }

    @Override // o.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f14504f0 = (l) onDismissListener;
    }

    @Override // o.k
    public final void s(boolean z7) {
        this.f14513o0 = z7;
    }

    @Override // o.k
    public final void t(int i7) {
        C1596m0 c1596m0 = this.f14497Y;
        c1596m0.f = i7;
        c1596m0.f14796X = true;
    }

    @Override // o.k
    public final void l(MenuC1545i menuC1545i) {
    }
}
