package z0;

import D.AbstractC0059i;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.example.appecoactivate.R;
import h0.AbstractC1058r;
import h0.AbstractC1066z;
import h0.C1036P;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.tika.utils.StringUtils;
import y0.AbstractC2032a;
/* renamed from: z0.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2040A extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16623a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16624b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f16625c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2040A(Context context, AttributeSet attrs, L fm) {
        super(context, attrs);
        AbstractActivityC2064y abstractActivityC2064y;
        String str;
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(attrs, "attrs");
        kotlin.jvm.internal.j.e(fm, "fm");
        this.f16623a = new ArrayList();
        this.f16624b = new ArrayList();
        this.f16626d = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC2032a.f16603b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC2061v C7 = fm.C(id);
        if (classAttribute != null && C7 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = StringUtils.EMPTY;
                }
                throw new IllegalStateException(AbstractC0059i.M("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
            }
            F H7 = fm.H();
            context.getClassLoader();
            AbstractComponentCallbacksC2061v a7 = H7.a(classAttribute);
            kotlin.jvm.internal.j.d(a7, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a7.f16843r0 = id;
            a7.f16844s0 = id;
            a7.f16845t0 = string;
            a7.f16840n0 = fm;
            C2063x c2063x = fm.f16677v;
            a7.f16841o0 = c2063x;
            a7.f16850y0 = true;
            if (c2063x == null) {
                abstractActivityC2064y = null;
            } else {
                abstractActivityC2064y = c2063x.f16856d;
            }
            if (abstractActivityC2064y != null) {
                a7.f16850y0 = true;
            }
            C2041a c2041a = new C2041a(fm);
            c2041a.f16740o = true;
            a7.f16851z0 = this;
            c2041a.e(getId(), a7, string);
            if (!c2041a.f16733g) {
                L l8 = c2041a.f16741p;
                if (l8.f16677v != null && !l8.f16651I) {
                    l8.z(true);
                    c2041a.a(l8.f16653K, l8.f16654L);
                    l8.f16659b = true;
                    try {
                        l8.T(l8.f16653K, l8.f16654L);
                        l8.d();
                        l8.e0();
                        l8.v();
                        ((HashMap) l8.f16660c.f921c).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        l8.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm.f16660c.F().iterator();
        while (it.hasNext()) {
            int i7 = ((T) it.next()).f16712c.f16844s0;
            getId();
        }
    }

    public final void a(View view) {
        if (this.f16624b.contains(view)) {
            this.f16623a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i7, ViewGroup.LayoutParams layoutParams) {
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v;
        kotlin.jvm.internal.j.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof AbstractComponentCallbacksC2061v) {
            abstractComponentCallbacksC2061v = (AbstractComponentCallbacksC2061v) tag;
        } else {
            abstractComponentCallbacksC2061v = null;
        }
        if (abstractComponentCallbacksC2061v != null) {
            super.addView(child, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        C1036P c1036p;
        kotlin.jvm.internal.j.e(insets, "insets");
        C1036P c8 = C1036P.c(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f16625c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.j.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c1036p = C1036P.c(null, onApplyWindowInsets);
        } else {
            Field field = AbstractC1066z.f11214a;
            WindowInsets b5 = c8.b();
            if (b5 != null) {
                WindowInsets b7 = AbstractC1058r.b(this, b5);
                if (!b7.equals(b5)) {
                    c8 = C1036P.c(this, b7);
                }
            }
            c1036p = c8;
        }
        if (!c1036p.f11172a.i()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                AbstractC1066z.a(getChildAt(i7), c1036p);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.j.e(canvas, "canvas");
        if (this.f16626d) {
            Iterator it = this.f16623a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        kotlin.jvm.internal.j.e(canvas, "canvas");
        kotlin.jvm.internal.j.e(child, "child");
        if (this.f16626d) {
            ArrayList arrayList = this.f16623a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        this.f16624b.remove(view);
        if (this.f16623a.remove(view)) {
            this.f16626d = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final <F extends AbstractComponentCallbacksC2061v> F getFragment() {
        AbstractActivityC2064y abstractActivityC2064y;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v;
        L j;
        C2040A c2040a = this;
        while (true) {
            abstractActivityC2064y = null;
            if (c2040a != 0) {
                Object tag = c2040a.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof AbstractComponentCallbacksC2061v) {
                    abstractComponentCallbacksC2061v = (AbstractComponentCallbacksC2061v) tag;
                } else {
                    abstractComponentCallbacksC2061v = null;
                }
                if (abstractComponentCallbacksC2061v != null) {
                    break;
                }
                ViewParent parent = c2040a.getParent();
                if (parent instanceof View) {
                    c2040a = (View) parent;
                } else {
                    c2040a = 0;
                }
            } else {
                abstractComponentCallbacksC2061v = null;
                break;
            }
        }
        if (abstractComponentCallbacksC2061v != null) {
            if (abstractComponentCallbacksC2061v.q()) {
                j = abstractComponentCallbacksC2061v.l();
            } else {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC2061v + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof AbstractActivityC2064y) {
                    abstractActivityC2064y = (AbstractActivityC2064y) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (abstractActivityC2064y != null) {
                j = abstractActivityC2064y.j();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) j.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.j.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.j.d(view, "view");
                a(view);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        View view = getChildAt(i7);
        kotlin.jvm.internal.j.d(view, "view");
        a(view);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View view = getChildAt(i10);
            kotlin.jvm.internal.j.d(view, "view");
            a(view);
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View view = getChildAt(i10);
            kotlin.jvm.internal.j.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i7, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z7) {
        this.f16626d = z7;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.j.e(listener, "listener");
        this.f16625c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.j.e(view, "view");
        if (view.getParent() == this) {
            this.f16624b.add(view);
        }
        super.startViewTransition(view);
    }
}
