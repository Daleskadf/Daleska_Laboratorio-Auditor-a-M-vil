package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.appecoactivate.R;
import h0.AbstractC1021A;
import h0.AbstractC1066z;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class X0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: f0  reason: collision with root package name */
    public static X0 f14747f0;

    /* renamed from: g0  reason: collision with root package name */
    public static X0 f14748g0;

    /* renamed from: X  reason: collision with root package name */
    public int f14749X;

    /* renamed from: Y  reason: collision with root package name */
    public Y0 f14750Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f14751Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f14752a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f14753b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14754c;

    /* renamed from: d  reason: collision with root package name */
    public final W0 f14755d = new Runnable(this) { // from class: p.W0

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ X0 f14744b;

        {
            this.f14744b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            switch (r2) {
                case 0:
                    this.f14744b.c(false);
                    return;
                default:
                    this.f14744b.a();
                    return;
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public final W0 f14756e = new Runnable(this) { // from class: p.W0

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ X0 f14744b;

        {
            this.f14744b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            switch (r2) {
                case 0:
                    this.f14744b.c(false);
                    return;
                default:
                    this.f14744b.a();
                    return;
            }
        }
    };

    /* renamed from: e0  reason: collision with root package name */
    public boolean f14757e0;
    public int f;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.W0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.W0] */
    public X0(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f14752a = view;
        this.f14753b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC1021A.f11151a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = X.c.g(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f14754c = scaledTouchSlop;
        this.f14757e0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(X0 x02) {
        X0 x03 = f14747f0;
        if (x03 != null) {
            x03.f14752a.removeCallbacks(x03.f14755d);
        }
        f14747f0 = x02;
        if (x02 != null) {
            x02.f14752a.postDelayed(x02.f14755d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        X0 x02 = f14748g0;
        View view = this.f14752a;
        if (x02 == this) {
            f14748g0 = null;
            Y0 y02 = this.f14750Y;
            if (y02 != null) {
                View view2 = (View) y02.f14760b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) y02.f14759a).getSystemService("window")).removeView(view2);
                }
                this.f14750Y = null;
                this.f14757e0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f14747f0 == this) {
            b(null);
        }
        view.removeCallbacks(this.f14756e);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [p.Y0, java.lang.Object] */
    public final void c(boolean z7) {
        int height;
        int i7;
        int i8;
        String str;
        int i9;
        String str2;
        int i10;
        long longPressTimeout;
        long j;
        long j8;
        Field field = AbstractC1066z.f11214a;
        View view = this.f14752a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        X0 x02 = f14748g0;
        if (x02 != null) {
            x02.a();
        }
        f14748g0 = this;
        this.f14751Z = z7;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.f14762d = layoutParams;
        obj.f14763e = new Rect();
        obj.f = new int[2];
        obj.f14758X = new int[2];
        obj.f14759a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.f14760b = inflate;
        obj.f14761c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(Y0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131689476;
        layoutParams.flags = 24;
        this.f14750Y = obj;
        int i11 = this.f;
        int i12 = this.f14749X;
        boolean z8 = this.f14751Z;
        View view2 = (View) obj.f14760b;
        ViewParent parent = view2.getParent();
        Context context2 = (Context) obj.f14759a;
        if (parent != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f14761c).setText(this.f14753b);
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f14762d;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i11 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i12 + dimensionPixelOffset2;
            i7 = i12 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i7 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z8) {
            i8 = R.dimen.tooltip_y_offset_touch;
        } else {
            i8 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i8);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                } else if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                } else {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = (Rect) obj.f14763e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i9 = 0;
            } else {
                Resources resources2 = context2.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i10 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i10 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i9 = 0;
                rect.set(0, i10, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = (int[]) obj.f14758X;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = (int[]) obj.f;
            view.getLocationOnScreen(iArr2);
            int i13 = iArr2[i9] - iArr[i9];
            iArr2[i9] = i13;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams2.x = (i13 + i11) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, i9);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i14 = iArr2[1];
            int i15 = ((i7 + i14) - dimensionPixelOffset3) - measuredHeight;
            int i16 = i14 + height + dimensionPixelOffset3;
            if (z8) {
                if (i15 >= 0) {
                    layoutParams2.y = i15;
                } else {
                    layoutParams2.y = i16;
                }
            } else if (measuredHeight + i16 <= rect.height()) {
                layoutParams2.y = i16;
            } else {
                layoutParams2.y = i15;
            }
            str2 = str;
        }
        ((WindowManager) context2.getSystemService(str2)).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f14751Z) {
            j8 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j8 = j - longPressTimeout;
        }
        W0 w02 = this.f14756e;
        view.removeCallbacks(w02);
        view.postDelayed(w02, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (java.lang.Math.abs(r5 - r3.f14749X) <= r2) goto L17;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            p.Y0 r4 = r3.f14750Y
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f14751Z
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f14752a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f14757e0 = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            p.Y0 r4 = r3.f14750Y
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f14757e0
            if (r1 != 0) goto L66
            int r1 = r3.f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f14754c
            if (r1 > r2) goto L66
            int r1 = r3.f14749X
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f = r4
            r3.f14749X = r5
            r3.f14757e0 = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.X0.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.f14749X = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
