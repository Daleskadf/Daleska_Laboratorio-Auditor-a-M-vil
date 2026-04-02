package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import n0.C1458a;
import r3.AbstractC1740d;
/* renamed from: p.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1584g0 implements o.r {

    /* renamed from: r0  reason: collision with root package name */
    public static final Method f14793r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final Method f14794s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final Method f14795t0;

    /* renamed from: X  reason: collision with root package name */
    public boolean f14796X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f14797Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f14798Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14799a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f14800b;

    /* renamed from: c  reason: collision with root package name */
    public C1594l0 f14801c;

    /* renamed from: e  reason: collision with root package name */
    public int f14803e;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public C1458a f14805f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f14806g0;

    /* renamed from: h0  reason: collision with root package name */
    public o.k f14807h0;

    /* renamed from: m0  reason: collision with root package name */
    public final Handler f14812m0;

    /* renamed from: o0  reason: collision with root package name */
    public Rect f14814o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f14815p0;
    public final r q0;

    /* renamed from: d  reason: collision with root package name */
    public int f14802d = -2;

    /* renamed from: e0  reason: collision with root package name */
    public int f14804e0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public final RunnableC1578d0 f14808i0 = new RunnableC1578d0(this, 1);

    /* renamed from: j0  reason: collision with root package name */
    public final View$OnTouchListenerC1582f0 f14809j0 = new View$OnTouchListenerC1582f0(this);

    /* renamed from: k0  reason: collision with root package name */
    public final C1580e0 f14810k0 = new C1580e0(this);

    /* renamed from: l0  reason: collision with root package name */
    public final RunnableC1578d0 f14811l0 = new RunnableC1578d0(this, 0);

    /* renamed from: n0  reason: collision with root package name */
    public final Rect f14813n0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f14793r0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f14795t0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f14794s0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [p.r, android.widget.PopupWindow] */
    public AbstractC1584g0(Context context, int i7) {
        Drawable drawable;
        int resourceId;
        this.f14799a = context;
        this.f14812m0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1091a.f11359k, i7, 0);
        this.f14803e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f14796X = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, (AttributeSet) null, i7, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC1091a.f11363o, i7, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = AbstractC1740d.o(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.q0 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // o.r
    public final void b() {
        int i7;
        boolean z7;
        int a7;
        int makeMeasureSpec;
        int i8;
        C1594l0 c1594l0;
        int i9;
        C1594l0 c1594l02 = this.f14801c;
        r rVar = this.q0;
        Context context = this.f14799a;
        if (c1594l02 == null) {
            C1594l0 c1594l03 = new C1594l0(context, !this.f14815p0);
            c1594l03.setHoverListener((C1596m0) this);
            this.f14801c = c1594l03;
            c1594l03.setAdapter(this.f14800b);
            this.f14801c.setOnItemClickListener(this.f14807h0);
            this.f14801c.setFocusable(true);
            this.f14801c.setFocusableInTouchMode(true);
            this.f14801c.setOnItemSelectedListener(new C1572a0(this, 0));
            this.f14801c.setOnScrollListener(this.f14810k0);
            rVar.setContentView(this.f14801c);
        } else {
            ViewGroup viewGroup = (ViewGroup) rVar.getContentView();
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f14813n0;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i7 = rect.bottom + i10;
            if (!this.f14796X) {
                this.f = -i10;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        if (rVar.getInputMethodMode() == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        View view = this.f14806g0;
        int i11 = this.f;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f14794s0;
            if (method != null) {
                try {
                    a7 = ((Integer) method.invoke(rVar, view, Integer.valueOf(i11), Boolean.valueOf(z7))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a7 = rVar.getMaxAvailableHeight(view, i11);
        } else {
            a7 = AbstractC1574b0.a(rVar, view, i11, z7);
        }
        int i12 = this.f14802d;
        int i13 = -1;
        if (i12 != -2) {
            if (i12 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int a8 = this.f14801c.a(makeMeasureSpec, a7);
        if (a8 > 0) {
            i8 = this.f14801c.getPaddingBottom() + this.f14801c.getPaddingTop() + i7;
        } else {
            i8 = 0;
        }
        int i14 = a8 + i8;
        this.q0.getInputMethodMode();
        rVar.setWindowLayoutType(1002);
        if (rVar.isShowing()) {
            View view2 = this.f14806g0;
            Field field = AbstractC1066z.f11214a;
            if (!view2.isAttachedToWindow()) {
                return;
            }
            int i15 = this.f14802d;
            if (i15 == -1) {
                i15 = -1;
            } else if (i15 == -2) {
                i15 = this.f14806g0.getWidth();
            }
            rVar.setOutsideTouchable(true);
            View view3 = this.f14806g0;
            int i16 = this.f14803e;
            int i17 = this.f;
            if (i15 < 0) {
                i9 = -1;
            } else {
                i9 = i15;
            }
            if (i14 >= 0) {
                i13 = i14;
            }
            rVar.update(view3, i16, i17, i9, i13);
            return;
        }
        int i18 = this.f14802d;
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = this.f14806g0.getWidth();
        }
        rVar.setWidth(i18);
        rVar.setHeight(i14);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f14793r0;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1576c0.b(rVar, true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f14809j0);
        if (this.f14798Z) {
            rVar.setOverlapAnchor(this.f14797Y);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f14795t0;
            if (method3 != null) {
                try {
                    method3.invoke(rVar, this.f14814o0);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            AbstractC1576c0.a(rVar, this.f14814o0);
        }
        rVar.showAsDropDown(this.f14806g0, this.f14803e, this.f, this.f14804e0);
        this.f14801c.setSelection(-1);
        if ((!this.f14815p0 || this.f14801c.isInTouchMode()) && (c1594l0 = this.f14801c) != null) {
            c1594l0.setListSelectionHidden(true);
            c1594l0.requestLayout();
        }
        if (!this.f14815p0) {
            this.f14812m0.post(this.f14811l0);
        }
    }

    public final void c(ListAdapter listAdapter) {
        C1458a c1458a = this.f14805f0;
        if (c1458a == null) {
            this.f14805f0 = new C1458a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f14800b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1458a);
            }
        }
        this.f14800b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f14805f0);
        }
        C1594l0 c1594l0 = this.f14801c;
        if (c1594l0 != null) {
            c1594l0.setAdapter(this.f14800b);
        }
    }

    @Override // o.r
    public final ListView d() {
        return this.f14801c;
    }

    @Override // o.r
    public final void dismiss() {
        r rVar = this.q0;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f14801c = null;
        this.f14812m0.removeCallbacks(this.f14808i0);
    }

    @Override // o.r
    public final boolean i() {
        return this.q0.isShowing();
    }
}
