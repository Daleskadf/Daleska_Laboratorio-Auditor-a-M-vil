package androidx.recyclerview.widget;

import B5.S;
import C5.i;
import G.c;
import J2.e;
import R1.j;
import X1.a;
import Y1.B;
import Y1.C;
import Y1.C0405f;
import Y1.C0406g;
import Y1.D;
import Y1.E;
import Y1.G;
import Y1.L;
import Y1.RunnableC0408i;
import Y1.n;
import Y1.o;
import Y1.p;
import Y1.q;
import Y1.r;
import Y1.s;
import Y1.t;
import Y1.u;
import Y1.v;
import Y1.w;
import Y1.x;
import Y1.y;
import Y1.z;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.example.appecoactivate.R;
import com.google.firebase.firestore.Z;
import e5.b;
import h0.AbstractC1021A;
import h0.AbstractC1059s;
import h0.AbstractC1061u;
import h0.AbstractC1066z;
import h0.C1046f;
import j6.C1372c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o0.AbstractC1547b;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: c1  reason: collision with root package name */
    public static final int[] f8005c1 = {16843830};

    /* renamed from: d1  reason: collision with root package name */
    public static final int[] f8006d1 = {16842987};

    /* renamed from: e1  reason: collision with root package name */
    public static final Class[] f8007e1;

    /* renamed from: f1  reason: collision with root package name */
    public static final n f8008f1;

    /* renamed from: A0  reason: collision with root package name */
    public EdgeEffect f8009A0;

    /* renamed from: B0  reason: collision with root package name */
    public r f8010B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f8011C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f8012D0;

    /* renamed from: E0  reason: collision with root package name */
    public VelocityTracker f8013E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f8014F0;

    /* renamed from: G0  reason: collision with root package name */
    public int f8015G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f8016H0;

    /* renamed from: I0  reason: collision with root package name */
    public int f8017I0;

    /* renamed from: J0  reason: collision with root package name */
    public int f8018J0;

    /* renamed from: K0  reason: collision with root package name */
    public final int f8019K0;

    /* renamed from: L0  reason: collision with root package name */
    public final int f8020L0;

    /* renamed from: M0  reason: collision with root package name */
    public final float f8021M0;

    /* renamed from: N0  reason: collision with root package name */
    public final float f8022N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f8023O0;

    /* renamed from: P0  reason: collision with root package name */
    public final E f8024P0;

    /* renamed from: Q0  reason: collision with root package name */
    public RunnableC0408i f8025Q0;

    /* renamed from: R0  reason: collision with root package name */
    public final C0406g f8026R0;

    /* renamed from: S0  reason: collision with root package name */
    public final C f8027S0;

    /* renamed from: T0  reason: collision with root package name */
    public ArrayList f8028T0;

    /* renamed from: U0  reason: collision with root package name */
    public final b f8029U0;

    /* renamed from: V0  reason: collision with root package name */
    public G f8030V0;

    /* renamed from: W0  reason: collision with root package name */
    public C1046f f8031W0;

    /* renamed from: X0  reason: collision with root package name */
    public final int[] f8032X0;

    /* renamed from: Y0  reason: collision with root package name */
    public final int[] f8033Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public final int[] f8034Z0;

    /* renamed from: a  reason: collision with root package name */
    public final y f8035a;

    /* renamed from: a1  reason: collision with root package name */
    public final ArrayList f8036a1;

    /* renamed from: b  reason: collision with root package name */
    public B f8037b;

    /* renamed from: b1  reason: collision with root package name */
    public final c f8038b1;

    /* renamed from: c  reason: collision with root package name */
    public final j f8039c;

    /* renamed from: d  reason: collision with root package name */
    public final j f8040d;

    /* renamed from: e  reason: collision with root package name */
    public final C1372c f8041e;

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f8042e0;
    public boolean f;

    /* renamed from: f0  reason: collision with root package name */
    public final Rect f8043f0;

    /* renamed from: g0  reason: collision with root package name */
    public s f8044g0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f8045h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f8046i0;

    /* renamed from: j0  reason: collision with root package name */
    public C0405f f8047j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f8048k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8049l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f8050m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f8051n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f8052o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f8053p0;
    public int q0;

    /* renamed from: r0  reason: collision with root package name */
    public final AccessibilityManager f8054r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f8055s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f8056t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f8057u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f8058v0;

    /* renamed from: w0  reason: collision with root package name */
    public q f8059w0;

    /* renamed from: x0  reason: collision with root package name */
    public EdgeEffect f8060x0;

    /* renamed from: y0  reason: collision with root package name */
    public EdgeEffect f8061y0;

    /* renamed from: z0  reason: collision with root package name */
    public EdgeEffect f8062z0;

    /* JADX WARN: Type inference failed for: r0v6, types: [Y1.n, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f8007e1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f8008f1 = new Object();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [Y1.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [Y1.r, Y1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [Y1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [Y1.C, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a7;
        float a8;
        boolean z7;
        int i7;
        char c8;
        int i8;
        TypedArray typedArray;
        char c9;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        this.f8035a = new y(this);
        this.f8041e = new C1372c();
        this.f8042e0 = new Rect();
        this.f8043f0 = new Rect();
        new RectF();
        this.f8045h0 = new ArrayList();
        this.f8046i0 = new ArrayList();
        this.f8051n0 = 0;
        this.f8055s0 = false;
        this.f8056t0 = false;
        this.f8057u0 = 0;
        this.f8058v0 = 0;
        this.f8059w0 = new Object();
        ?? obj = new Object();
        obj.f6681a = null;
        obj.f6682b = new ArrayList();
        obj.f6683c = 250L;
        obj.f6684d = 250L;
        obj.f6624e = new ArrayList();
        obj.f = new ArrayList();
        obj.f6625g = new ArrayList();
        obj.f6626h = new ArrayList();
        obj.f6627i = new ArrayList();
        obj.j = new ArrayList();
        obj.f6628k = new ArrayList();
        obj.f6629l = new ArrayList();
        obj.f6630m = new ArrayList();
        obj.f6631n = new ArrayList();
        obj.f6632o = new ArrayList();
        this.f8010B0 = obj;
        this.f8011C0 = 0;
        this.f8012D0 = -1;
        this.f8021M0 = Float.MIN_VALUE;
        this.f8022N0 = Float.MIN_VALUE;
        boolean z8 = true;
        this.f8023O0 = true;
        this.f8024P0 = new E(this);
        this.f8026R0 = new Object();
        ?? obj2 = new Object();
        obj2.f6597a = 0;
        obj2.f6598b = false;
        obj2.f6599c = false;
        obj2.f6600d = false;
        obj2.f6601e = false;
        this.f8027S0 = obj2;
        b bVar = new b(13);
        this.f8029U0 = bVar;
        this.f8032X0 = new int[2];
        this.f8033Y0 = new int[2];
        this.f8034Z0 = new int[2];
        this.f8036a1 = new ArrayList();
        this.f8038b1 = new c(this, 7);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8006d1, 0, 0);
            this.f = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8018J0 = viewConfiguration.getScaledTouchSlop();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            Method method = AbstractC1021A.f11151a;
            a7 = X.b.c(viewConfiguration);
        } else {
            a7 = AbstractC1021A.a(viewConfiguration, context);
        }
        this.f8021M0 = a7;
        if (i9 >= 26) {
            a8 = X.b.d(viewConfiguration);
        } else {
            a8 = AbstractC1021A.a(viewConfiguration, context);
        }
        this.f8022N0 = a8;
        this.f8019K0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8020L0 = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        setWillNotDraw(z7);
        this.f8010B0.f6681a = bVar;
        this.f8039c = new j(new Z(this));
        this.f8040d = new j(new i(this, 24));
        Field field = AbstractC1066z.f11214a;
        if (i9 >= 26) {
            i7 = AbstractC1061u.a(this);
        } else {
            i7 = 0;
        }
        if (i7 == 0 && i9 >= 26) {
            AbstractC1061u.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f8054r0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new G(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f6372a, 0, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                    Resources resources = getContext().getResources();
                    c8 = 3;
                    i8 = 4;
                    typedArray = obtainStyledAttributes2;
                    c9 = 2;
                    new C0405f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
                } else {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
            } else {
                c8 = 3;
                i8 = 4;
                typedArray = obtainStyledAttributes2;
                c9 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    String str = trim;
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = classLoader.loadClass(str).asSubclass(s.class);
                        try {
                            constructor = asSubclass.getConstructor(f8007e1);
                            objArr = new Object[i8];
                            objArr[0] = context;
                            objArr[1] = attributeSet;
                            objArr[c9] = 0;
                            objArr[c8] = 0;
                        } catch (NoSuchMethodException e7) {
                            objArr = null;
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e8) {
                                e8.initCause(e7);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e8);
                            }
                        }
                        Object[] objArr2 = objArr;
                        constructor.setAccessible(true);
                        setLayoutManager((s) constructor.newInstance(objArr2));
                    } catch (ClassCastException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e9);
                    } catch (ClassNotFoundException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e10);
                    } catch (IllegalAccessException e11) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e11);
                    } catch (InstantiationException e12) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e12);
                    } catch (InvocationTargetException e13) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f8005c1, 0, 0);
            z8 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z8);
    }

    private C1046f getScrollingChildHelper() {
        if (this.f8031W0 == null) {
            this.f8031W0 = new C1046f(this);
        }
        return this.f8031W0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((t) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i8) {
        s sVar = this.f8044g0;
        if (sVar != null) {
            sVar.getClass();
        }
        super.addFocusables(arrayList, i7, i8);
    }

    public final void b(String str) {
        if (this.f8057u0 > 0) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
            }
            throw new IllegalStateException(str);
        } else if (this.f8058v0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(StringUtils.EMPTY + h()));
        }
    }

    public final void c(int i7, int i8) {
        boolean z7;
        EdgeEffect edgeEffect = this.f8060x0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i7 > 0) {
            this.f8060x0.onRelease();
            z7 = this.f8060x0.isFinished();
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f8062z0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f8062z0.onRelease();
            z7 |= this.f8062z0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f8061y0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f8061y0.onRelease();
            z7 |= this.f8061y0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f8009A0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f8009A0.onRelease();
            z7 |= this.f8009A0.isFinished();
        }
        if (z7) {
            Field field = AbstractC1066z.f11214a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof t) && this.f8044g0.d((t) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        s sVar = this.f8044g0;
        if (sVar == null || !sVar.b()) {
            return 0;
        }
        return this.f8044g0.f(this.f8027S0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        s sVar = this.f8044g0;
        if (sVar != null && sVar.b()) {
            this.f8044g0.g(this.f8027S0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        s sVar = this.f8044g0;
        if (sVar == null || !sVar.b()) {
            return 0;
        }
        return this.f8044g0.h(this.f8027S0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        s sVar = this.f8044g0;
        if (sVar == null || !sVar.c()) {
            return 0;
        }
        return this.f8044g0.i(this.f8027S0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        s sVar = this.f8044g0;
        if (sVar != null && sVar.c()) {
            this.f8044g0.j(this.f8027S0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        s sVar = this.f8044g0;
        if (sVar == null || !sVar.c()) {
            return 0;
        }
        return this.f8044g0.k(this.f8027S0);
    }

    public final void d() {
        j jVar = this.f8039c;
        if (this.f8050m0 && !this.f8055s0) {
            if (((ArrayList) jVar.f4683c).size() > 0) {
                jVar.getClass();
                if (((ArrayList) jVar.f4683c).size() > 0) {
                    int i7 = d0.j.f10170a;
                    Trace.beginSection("RV FullInvalidate");
                    Log.e("RecyclerView", "No adapter attached; skipping layout");
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        int i8 = d0.j.f10170a;
        Trace.beginSection("RV FullInvalidate");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f4, boolean z7) {
        return getScrollingChildHelper().a(f, f4, z7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f4) {
        return getScrollingChildHelper().b(f, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().d(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z7;
        int i7;
        boolean z8;
        boolean z9;
        int i8;
        int i9;
        boolean z10 = true;
        super.draw(canvas);
        ArrayList arrayList = this.f8045h0;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C0405f c0405f = (C0405f) arrayList.get(i10);
            if (c0405f.f6647l == c0405f.f6649n.getWidth() && c0405f.f6648m == c0405f.f6649n.getHeight()) {
                if (c0405f.f6657v != 0) {
                    if (c0405f.f6650o) {
                        int i11 = c0405f.f6647l;
                        int i12 = c0405f.f6641d;
                        int i13 = i11 - i12;
                        int i14 = 0 - (0 / 2);
                        StateListDrawable stateListDrawable = c0405f.f6639b;
                        stateListDrawable.setBounds(0, 0, i12, 0);
                        int i15 = c0405f.f6648m;
                        Drawable drawable = c0405f.f6640c;
                        drawable.setBounds(0, 0, c0405f.f6642e, i15);
                        RecyclerView recyclerView = c0405f.f6649n;
                        Field field = AbstractC1066z.f11214a;
                        if (recyclerView.getLayoutDirection() == 1) {
                            drawable.draw(canvas);
                            canvas.translate(i12, i14);
                            canvas.scale(-1.0f, 1.0f);
                            stateListDrawable.draw(canvas);
                            canvas.scale(1.0f, 1.0f);
                            canvas.translate(-i12, -i14);
                        } else {
                            canvas.translate(i13, 0.0f);
                            drawable.draw(canvas);
                            canvas.translate(0.0f, i14);
                            stateListDrawable.draw(canvas);
                            canvas.translate(-i13, -i14);
                        }
                    }
                    if (c0405f.f6651p) {
                        int i16 = c0405f.f6648m;
                        int i17 = c0405f.f6644h;
                        int i18 = i16 - i17;
                        StateListDrawable stateListDrawable2 = c0405f.f;
                        stateListDrawable2.setBounds(0, 0, 0, i17);
                        int i19 = c0405f.f6647l;
                        Drawable drawable2 = c0405f.f6643g;
                        drawable2.setBounds(0, 0, i19, c0405f.f6645i);
                        canvas.translate(0.0f, i18);
                        drawable2.draw(canvas);
                        canvas.translate(0 - (0 / 2), 0.0f);
                        stateListDrawable2.draw(canvas);
                        canvas.translate(-i9, -i18);
                    }
                }
            } else {
                c0405f.f6647l = c0405f.f6649n.getWidth();
                c0405f.f6648m = c0405f.f6649n.getHeight();
                c0405f.e(0);
            }
        }
        EdgeEffect edgeEffect = this.f8060x0;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f) {
                i8 = getPaddingBottom();
            } else {
                i8 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i8, 0.0f);
            EdgeEffect edgeEffect2 = this.f8060x0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z7 = true;
            } else {
                z7 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect3 = this.f8061y0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f8061y0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z9 = true;
            } else {
                z9 = false;
            }
            z7 |= z9;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f8062z0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f) {
                i7 = getPaddingTop();
            } else {
                i7 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(-i7, -width);
            EdgeEffect edgeEffect6 = this.f8062z0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z8 = true;
            } else {
                z8 = false;
            }
            z7 |= z8;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f8009A0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f8009A0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z7 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z7 || this.f8010B0 == null || arrayList.size() <= 0 || !this.f8010B0.b()) {
            z10 = z7;
        }
        if (z10) {
            Field field2 = AbstractC1066z.f11214a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(int i7, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = AbstractC1066z.f11214a;
        setMeasuredDimension(s.e(i7, paddingRight, getMinimumWidth()), s.e(i8, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i8, i9, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        int i8;
        int i9;
        this.f8044g0.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i7);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i7);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view != null && i(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f8042e0;
                char c8 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f8043f0;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f8044g0.f6686b;
                Field field = AbstractC1066z.f11214a;
                if (recyclerView.getLayoutDirection() == 1) {
                    i8 = -1;
                } else {
                    i8 = 1;
                }
                int i10 = rect.left;
                int i11 = rect2.left;
                if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
                    i9 = 1;
                } else {
                    int i12 = rect.right;
                    int i13 = rect2.right;
                    if ((i12 > i13 || i10 >= i13) && i10 > i11) {
                        i9 = -1;
                    } else {
                        i9 = 0;
                    }
                }
                int i14 = rect.top;
                int i15 = rect2.top;
                if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
                    c8 = 1;
                } else {
                    int i16 = rect.bottom;
                    int i17 = rect2.bottom;
                    if ((i16 > i17 || i14 >= i17) && i14 > i15) {
                        c8 = 65535;
                    }
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 17) {
                            if (i7 != 33) {
                                if (i7 != 66) {
                                    if (i7 == 130) {
                                        if (c8 > 0) {
                                            return findNextFocus;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Invalid direction: " + i7 + h());
                                    }
                                } else if (i9 > 0) {
                                    return findNextFocus;
                                }
                            } else if (c8 < 0) {
                                return findNextFocus;
                            }
                        } else if (i9 < 0) {
                            return findNextFocus;
                        }
                    } else if (c8 <= 0) {
                        if (c8 == 0 && i9 * i8 >= 0) {
                            return findNextFocus;
                        }
                    } else {
                        return findNextFocus;
                    }
                } else if (c8 >= 0) {
                    if (c8 == 0 && i9 * i8 <= 0) {
                        return findNextFocus;
                    }
                } else {
                    return findNextFocus;
                }
            } else {
                return findNextFocus;
            }
        }
        return super.focusSearch(view, i7);
    }

    public final boolean g(int[] iArr, int i7) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i7, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        s sVar = this.f8044g0;
        if (sVar != null) {
            return sVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        s sVar = this.f8044g0;
        if (sVar != null) {
            return sVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public o getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        s sVar = this.f8044g0;
        if (sVar != null) {
            sVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        return super.getChildDrawingOrder(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f;
    }

    public G getCompatAccessibilityDelegate() {
        return this.f8030V0;
    }

    public q getEdgeEffectFactory() {
        return this.f8059w0;
    }

    public r getItemAnimator() {
        return this.f8010B0;
    }

    public int getItemDecorationCount() {
        return this.f8045h0.size();
    }

    public s getLayoutManager() {
        return this.f8044g0;
    }

    public int getMaxFlingVelocity() {
        return this.f8020L0;
    }

    public int getMinFlingVelocity() {
        return this.f8019K0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public u getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f8023O0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, Y1.x] */
    public x getRecycledViewPool() {
        y yVar = this.f8035a;
        if (((x) yVar.f) == null) {
            ?? obj = new Object();
            obj.f6693a = new SparseArray();
            obj.f6694b = 0;
            yVar.f = obj;
        }
        return (x) yVar.f;
    }

    public int getScrollState() {
        return this.f8011C0;
    }

    public final String h() {
        return StringUtils.SPACE + super.toString() + ", adapter:null, layout:" + this.f8044g0 + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View i(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i(android.view.View):android.view.View");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f8048k0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f11191d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        if (this.f8050m0 && !this.f8055s0 && ((ArrayList) this.f8039c.f4683c).size() <= 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        int B02 = this.f8040d.B0();
        for (int i7 = 0; i7 < B02; i7++) {
            ((t) this.f8040d.A0(i7).getLayoutParams()).f6692b = true;
        }
        ArrayList arrayList = (ArrayList) this.f8035a.f6699d;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int i7;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8012D0) {
            if (actionIndex == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            this.f8012D0 = motionEvent.getPointerId(i7);
            int x7 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f8016H0 = x7;
            this.f8014F0 = x7;
            int y2 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f8017I0 = y2;
            this.f8015G0 = y2;
        }
    }

    public final void o(View view, View view2) {
        View view3;
        boolean z7;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f8042e0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof t) {
            t tVar = (t) layoutParams;
            if (!tVar.f6692b) {
                int i7 = rect.left;
                Rect rect2 = tVar.f6691a;
                rect.left = i7 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        s sVar = this.f8044g0;
        boolean z8 = !this.f8050m0;
        if (view2 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        sVar.G(this, view, this.f8042e0, z8, z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r1 >= 30.0f) goto L16;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Y1.i] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f8057u0 = r0
            r1 = 1
            r5.f8048k0 = r1
            boolean r2 = r5.f8050m0
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = r1
        L14:
            r5.f8050m0 = r0
            Y1.s r0 = r5.f8044g0
            if (r0 == 0) goto L1c
            r0.f6689e = r1
        L1c:
            java.lang.ThreadLocal r0 = Y1.RunnableC0408i.f6667e
            java.lang.Object r1 = r0.get()
            Y1.i r1 = (Y1.RunnableC0408i) r1
            r5.f8025Q0 = r1
            if (r1 != 0) goto L64
            Y1.i r1 = new Y1.i
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6668a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6671d = r2
            r5.f8025Q0 = r1
            java.lang.reflect.Field r1 = h0.AbstractC1066z.f11214a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L56
            if (r1 == 0) goto L56
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L56
            goto L58
        L56:
            r1 = 1114636288(0x42700000, float:60.0)
        L58:
            Y1.i r2 = r5.f8025Q0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f6670c = r3
            r0.set(r2)
        L64:
            Y1.i r0 = r5.f8025Q0
            java.util.ArrayList r0 = r0.f6668a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        r rVar = this.f8010B0;
        if (rVar != null) {
            rVar.a();
        }
        setScrollState(0);
        E e7 = this.f8024P0;
        e7.f6602X.removeCallbacks(e7);
        e7.f6605c.abortAnimation();
        this.f8048k0 = false;
        s sVar = this.f8044g0;
        if (sVar != null) {
            sVar.f6689e = false;
            sVar.z(this);
        }
        this.f8036a1.clear();
        removeCallbacks(this.f8038b1);
        this.f8041e.getClass();
        do {
            S s7 = L.f6623a;
            int i7 = s7.f335b;
            obj = null;
            if (i7 > 0) {
                int i8 = i7 - 1;
                Object[] objArr = (Object[]) s7.f336c;
                Object obj2 = objArr[i8];
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i8] = null;
                s7.f335b--;
                obj = obj2;
                continue;
            }
        } while (obj != null);
        RunnableC0408i runnableC0408i = this.f8025Q0;
        if (runnableC0408i != null) {
            runnableC0408i.f6668a.remove(this);
            this.f8025Q0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f8045h0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0405f) arrayList.get(i7)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            Y1.s r0 = r5.f8044g0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f8052o0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            Y1.s r0 = r5.f8044g0
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            Y1.s r3 = r5.f8044g0
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            Y1.s r3 = r5.f8044g0
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            Y1.s r3 = r5.f8044g0
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f8021M0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f8022N0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.q(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        if (this.f8052o0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f8047j0 = null;
        }
        ArrayList arrayList = this.f8046i0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0405f c0405f = (C0405f) arrayList.get(i7);
            if (c0405f.c(motionEvent) && action != 3) {
                this.f8047j0 = c0405f;
                p();
                setScrollState(0);
                return true;
            }
        }
        s sVar = this.f8044g0;
        if (sVar == null) {
            return false;
        }
        boolean b5 = sVar.b();
        boolean c8 = this.f8044g0.c();
        if (this.f8013E0 == null) {
            this.f8013E0 = VelocityTracker.obtain();
        }
        this.f8013E0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                n(motionEvent);
                            }
                        } else {
                            this.f8012D0 = motionEvent.getPointerId(actionIndex);
                            int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f8016H0 = x7;
                            this.f8014F0 = x7;
                            int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f8017I0 = y2;
                            this.f8015G0 = y2;
                        }
                    } else {
                        p();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f8012D0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f8012D0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x8 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f8011C0 != 1) {
                        int i8 = x8 - this.f8014F0;
                        int i9 = y3 - this.f8015G0;
                        if (b5 && Math.abs(i8) > this.f8018J0) {
                            this.f8016H0 = x8;
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (c8 && Math.abs(i9) > this.f8018J0) {
                            this.f8017I0 = y3;
                            z7 = true;
                        }
                        if (z7) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f8013E0.clear();
                s(0);
            }
        } else {
            if (this.f8053p0) {
                this.f8053p0 = false;
            }
            this.f8012D0 = motionEvent.getPointerId(0);
            int x9 = (int) (motionEvent.getX() + 0.5f);
            this.f8016H0 = x9;
            this.f8014F0 = x9;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f8017I0 = y6;
            this.f8015G0 = y6;
            if (this.f8011C0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f8034Z0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = b5;
            if (c8) {
                i10 = (b5 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i10, 0);
        }
        if (this.f8011C0 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11 = d0.j.f10170a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f8050m0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        s sVar = this.f8044g0;
        if (sVar == null) {
            e(i7, i8);
        } else if (sVar.y()) {
            View.MeasureSpec.getMode(i7);
            View.MeasureSpec.getMode(i8);
            this.f8044g0.f6686b.e(i7, i8);
        } else if (this.f8049l0) {
            this.f8044g0.f6686b.e(i7, i8);
        } else {
            C c8 = this.f8027S0;
            if (c8.f6601e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c8.getClass();
            this.f8051n0++;
            this.f8044g0.f6686b.e(i7, i8);
            if (this.f8051n0 < 1) {
                this.f8051n0 = 1;
            }
            this.f8051n0--;
            c8.f6599c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (this.f8057u0 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof B)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        B b5 = (B) parcelable;
        this.f8037b = b5;
        super.onRestoreInstanceState(b5.f14517a);
        s sVar = this.f8044g0;
        if (sVar != null && (parcelable2 = this.f8037b.f6596c) != null) {
            sVar.B(parcelable2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, Y1.B, o0.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? abstractC1547b = new AbstractC1547b(super.onSaveInstanceState());
        B b5 = this.f8037b;
        if (b5 != null) {
            abstractC1547b.f6596c = b5.f6596c;
        } else {
            s sVar = this.f8044g0;
            if (sVar != null) {
                abstractC1547b.f6596c = sVar.C();
            } else {
                abstractC1547b.f6596c = null;
            }
        }
        return abstractC1547b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 != i9 || i8 != i10) {
            this.f8009A0 = null;
            this.f8061y0 = null;
            this.f8062z0 = null;
            this.f8060x0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f8013E0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z7 = false;
        s(0);
        EdgeEffect edgeEffect = this.f8060x0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z7 = this.f8060x0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f8061y0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z7 |= this.f8061y0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f8062z0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z7 |= this.f8062z0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f8009A0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z7 |= this.f8009A0.isFinished();
        }
        if (z7) {
            Field field = AbstractC1066z.f11214a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q(int, int, android.view.MotionEvent):void");
    }

    public final void r(int i7, int i8) {
        int i9;
        int i10;
        boolean z7;
        int height;
        int i11;
        s sVar = this.f8044g0;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f8052o0) {
            if (!sVar.b()) {
                i9 = 0;
            } else {
                i9 = i7;
            }
            if (!this.f8044g0.c()) {
                i10 = 0;
            } else {
                i10 = i8;
            }
            if (i9 != 0 || i10 != 0) {
                E e7 = this.f8024P0;
                e7.getClass();
                int abs = Math.abs(i9);
                int abs2 = Math.abs(i10);
                if (abs > abs2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i10 * i10) + (i9 * i9));
                RecyclerView recyclerView = e7.f6602X;
                if (z7) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                int i12 = height / 2;
                float f = height;
                float f4 = i12;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f4) + f4;
                if (sqrt > 0) {
                    i11 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z7) {
                        abs = abs2;
                    }
                    i11 = (int) (((abs / f) + 1.0f) * 300.0f);
                }
                int min = Math.min(i11, 2000);
                n nVar = f8008f1;
                if (e7.f6606d != nVar) {
                    e7.f6606d = nVar;
                    e7.f6605c = new OverScroller(recyclerView.getContext(), nVar);
                }
                recyclerView.setScrollState(2);
                e7.f6604b = 0;
                e7.f6603a = 0;
                e7.f6605c.startScroll(0, 0, i9, i10, min);
                e7.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z7) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f8044g0.getClass();
        if (this.f8057u0 <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        return this.f8044g0.G(this, view, rect, z7, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        ArrayList arrayList = this.f8046i0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0405f) arrayList.get(i7)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f8051n0 == 0 && !this.f8052o0) {
            super.requestLayout();
        }
    }

    public final void s(int i7) {
        getScrollingChildHelper().h(i7);
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
        s sVar = this.f8044g0;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f8052o0) {
        } else {
            boolean b5 = sVar.b();
            boolean c8 = this.f8044g0.c();
            if (b5 || c8) {
                if (!b5) {
                    i7 = 0;
                }
                if (!c8) {
                    i8 = 0;
                }
                q(i7, i8, null);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i7;
        if (this.f8057u0 > 0) {
            int i8 = 0;
            if (accessibilityEvent != null) {
                i7 = accessibilityEvent.getContentChangeTypes();
            } else {
                i7 = 0;
            }
            if (i7 != 0) {
                i8 = i7;
            }
            this.q0 |= i8;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(G g3) {
        this.f8030V0 = g3;
        AbstractC1066z.e(this, g3);
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, Y1.x] */
    public void setAdapter(o oVar) {
        setLayoutFrozen(false);
        r rVar = this.f8010B0;
        if (rVar != null) {
            rVar.a();
        }
        s sVar = this.f8044g0;
        y yVar = this.f8035a;
        if (sVar != null) {
            sVar.E();
            this.f8044g0.F(yVar);
        }
        ((ArrayList) yVar.f6698c).clear();
        ArrayList arrayList = (ArrayList) yVar.f6699d;
        int size = arrayList.size() - 1;
        if (size < 0) {
            arrayList.clear();
            C0406g c0406g = ((RecyclerView) yVar.f6695X).f8026R0;
            c0406g.getClass();
            c0406g.f6661c = 0;
            j jVar = this.f8039c;
            jVar.P0((ArrayList) jVar.f4683c);
            jVar.P0((ArrayList) jVar.f4684d);
            ((ArrayList) yVar.f6698c).clear();
            ArrayList arrayList2 = (ArrayList) yVar.f6699d;
            int size2 = arrayList2.size() - 1;
            if (size2 < 0) {
                arrayList2.clear();
                RecyclerView recyclerView = (RecyclerView) yVar.f6695X;
                C0406g c0406g2 = recyclerView.f8026R0;
                c0406g2.getClass();
                c0406g2.f6661c = 0;
                if (((x) yVar.f) == null) {
                    ?? obj = new Object();
                    obj.f6693a = new SparseArray();
                    obj.f6694b = 0;
                    yVar.f = obj;
                }
                x xVar = (x) yVar.f;
                if (xVar.f6694b == 0) {
                    SparseArray sparseArray = xVar.f6693a;
                    if (sparseArray.size() > 0) {
                        ((w) sparseArray.valueAt(0)).getClass();
                        throw null;
                    }
                }
                this.f8027S0.f6598b = true;
                this.f8056t0 = this.f8056t0;
                this.f8055s0 = true;
                int B02 = this.f8040d.B0();
                for (int i7 = 0; i7 < B02; i7++) {
                    j(this.f8040d.A0(i7));
                }
                m();
                int size3 = arrayList2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    if (arrayList2.get(i8) != null) {
                        throw new ClassCastException();
                    }
                }
                int size4 = arrayList2.size() - 1;
                if (size4 < 0) {
                    arrayList2.clear();
                    C0406g c0406g3 = recyclerView.f8026R0;
                    c0406g3.getClass();
                    c0406g3.f6661c = 0;
                    requestLayout();
                    return;
                }
                arrayList2.get(size4).getClass();
                throw new ClassCastException();
            }
            arrayList2.get(size2).getClass();
            throw new ClassCastException();
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public void setChildDrawingOrderCallback(p pVar) {
        if (pVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z7) {
        if (z7 != this.f) {
            this.f8009A0 = null;
            this.f8061y0 = null;
            this.f8062z0 = null;
            this.f8060x0 = null;
        }
        this.f = z7;
        super.setClipToPadding(z7);
        if (this.f8050m0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(q qVar) {
        qVar.getClass();
        this.f8059w0 = qVar;
        this.f8009A0 = null;
        this.f8061y0 = null;
        this.f8062z0 = null;
        this.f8060x0 = null;
    }

    public void setHasFixedSize(boolean z7) {
        this.f8049l0 = z7;
    }

    public void setItemAnimator(r rVar) {
        r rVar2 = this.f8010B0;
        if (rVar2 != null) {
            rVar2.a();
            this.f8010B0.f6681a = null;
        }
        this.f8010B0 = rVar;
        if (rVar != null) {
            rVar.f6681a = this.f8029U0;
        }
    }

    public void setItemViewCacheSize(int i7) {
        y yVar = this.f8035a;
        yVar.f6696a = i7;
        yVar.h();
    }

    public void setLayoutFrozen(boolean z7) {
        if (z7 != this.f8052o0) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z7) {
                this.f8052o0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f8052o0 = true;
            this.f8053p0 = true;
            setScrollState(0);
            E e7 = this.f8024P0;
            e7.f6602X.removeCallbacks(e7);
            e7.f6605c.abortAnimation();
        }
    }

    public void setLayoutManager(s sVar) {
        i iVar;
        if (sVar == this.f8044g0) {
            return;
        }
        setScrollState(0);
        E e7 = this.f8024P0;
        e7.f6602X.removeCallbacks(e7);
        e7.f6605c.abortAnimation();
        s sVar2 = this.f8044g0;
        y yVar = this.f8035a;
        if (sVar2 != null) {
            r rVar = this.f8010B0;
            if (rVar != null) {
                rVar.a();
            }
            this.f8044g0.E();
            this.f8044g0.F(yVar);
            ((ArrayList) yVar.f6698c).clear();
            ArrayList arrayList = (ArrayList) yVar.f6699d;
            int size = arrayList.size() - 1;
            if (size < 0) {
                arrayList.clear();
                C0406g c0406g = ((RecyclerView) yVar.f6695X).f8026R0;
                c0406g.getClass();
                c0406g.f6661c = 0;
                if (this.f8048k0) {
                    s sVar3 = this.f8044g0;
                    sVar3.f6689e = false;
                    sVar3.z(this);
                }
                this.f8044g0.I(null);
                this.f8044g0 = null;
            } else {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        } else {
            ((ArrayList) yVar.f6698c).clear();
            ArrayList arrayList2 = (ArrayList) yVar.f6699d;
            int size2 = arrayList2.size() - 1;
            if (size2 < 0) {
                arrayList2.clear();
                C0406g c0406g2 = ((RecyclerView) yVar.f6695X).f8026R0;
                c0406g2.getClass();
                c0406g2.f6661c = 0;
            } else {
                arrayList2.get(size2).getClass();
                throw new ClassCastException();
            }
        }
        j jVar = this.f8040d;
        ((e) jVar.f4683c).B();
        ArrayList arrayList3 = (ArrayList) jVar.f4684d;
        int size3 = arrayList3.size() - 1;
        while (true) {
            iVar = (i) jVar.f4682b;
            if (size3 < 0) {
                break;
            }
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
            size3--;
        }
        RecyclerView recyclerView = (RecyclerView) iVar.f593b;
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f8044g0 = sVar;
        if (sVar != null) {
            if (sVar.f6686b == null) {
                sVar.I(this);
                if (this.f8048k0) {
                    this.f8044g0.f6689e = true;
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + sVar + " is already attached to a RecyclerView:" + sVar.f6686b.h());
            }
        }
        yVar.h();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C1046f scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f11191d) {
            Field field = AbstractC1066z.f11214a;
            AbstractC1059s.f(scrollingChildHelper.f11190c);
        }
        scrollingChildHelper.f11191d = z7;
    }

    public void setPreserveFocusAfterLayout(boolean z7) {
        this.f8023O0 = z7;
    }

    public void setRecycledViewPool(x xVar) {
        x xVar2;
        y yVar = this.f8035a;
        if (((x) yVar.f) != null) {
            xVar2.f6694b--;
        }
        yVar.f = xVar;
        if (xVar != null) {
            ((RecyclerView) yVar.f6695X).getAdapter();
        }
    }

    public void setScrollState(int i7) {
        if (i7 == this.f8011C0) {
            return;
        }
        this.f8011C0 = i7;
        if (i7 != 2) {
            E e7 = this.f8024P0;
            e7.f6602X.removeCallbacks(e7);
            e7.f6605c.abortAnimation();
        }
        s sVar = this.f8044g0;
        if (sVar != null) {
            sVar.D(i7);
        }
        ArrayList arrayList = this.f8028T0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v) this.f8028T0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
            } else {
                this.f8018J0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f8018J0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(D d7) {
        this.f8035a.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f8044g0;
        if (sVar != null) {
            return sVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(u uVar) {
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
    }

    public void setRecyclerListener(z zVar) {
    }
}
