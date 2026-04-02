package Y1;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import h0.AbstractC1066z;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* renamed from: Y1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405f {

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f6636x = {16842919};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f6637y = new int[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f6638a;

    /* renamed from: b  reason: collision with root package name */
    public final StateListDrawable f6639b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f6640c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6641d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6642e;
    public final StateListDrawable f;

    /* renamed from: g  reason: collision with root package name */
    public final Drawable f6643g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6644h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6645i;
    public float j;

    /* renamed from: k  reason: collision with root package name */
    public float f6646k;

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f6649n;

    /* renamed from: u  reason: collision with root package name */
    public final ValueAnimator f6656u;

    /* renamed from: v  reason: collision with root package name */
    public int f6657v;

    /* renamed from: w  reason: collision with root package name */
    public final G.c f6658w;

    /* renamed from: l  reason: collision with root package name */
    public int f6647l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f6648m = 0;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6650o = false;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6651p = false;

    /* renamed from: q  reason: collision with root package name */
    public int f6652q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f6653r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f6654s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f6655t = new int[2];

    public C0405f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        boolean z7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6656u = ofFloat;
        this.f6657v = 0;
        G.c cVar = new G.c(this, 6);
        this.f6658w = cVar;
        Object obj = new Object();
        this.f6639b = stateListDrawable;
        this.f6640c = drawable;
        this.f = stateListDrawable2;
        this.f6643g = drawable2;
        this.f6641d = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f6642e = Math.max(i7, drawable.getIntrinsicWidth());
        this.f6644h = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f6645i = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f6638a = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0403d(this));
        ofFloat.addUpdateListener(new C0404e(this));
        RecyclerView recyclerView2 = this.f6649n;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                s sVar = recyclerView2.f8044g0;
                if (sVar != null) {
                    sVar.a("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f8045h0;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    if (recyclerView2.getOverScrollMode() == 2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    recyclerView2.setWillNotDraw(z7);
                }
                recyclerView2.m();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f6649n;
                recyclerView3.f8046i0.remove(this);
                if (recyclerView3.f8047j0 == this) {
                    recyclerView3.f8047j0 = null;
                }
                ArrayList arrayList2 = this.f6649n.f8028T0;
                if (arrayList2 != null) {
                    arrayList2.remove(obj);
                }
                this.f6649n.removeCallbacks(cVar);
            }
            this.f6649n = recyclerView;
            if (recyclerView != null) {
                s sVar2 = recyclerView.f8044g0;
                if (sVar2 != null) {
                    sVar2.a("Cannot add item decoration during a scroll  or layout");
                }
                ArrayList arrayList3 = recyclerView.f8045h0;
                if (arrayList3.isEmpty()) {
                    recyclerView.setWillNotDraw(false);
                }
                arrayList3.add(this);
                recyclerView.m();
                recyclerView.requestLayout();
                this.f6649n.f8046i0.add(this);
                RecyclerView recyclerView4 = this.f6649n;
                if (recyclerView4.f8028T0 == null) {
                    recyclerView4.f8028T0 = new ArrayList();
                }
                recyclerView4.f8028T0.add(obj);
            }
        }
    }

    public static int d(float f, float f4, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 == 0) {
            return 0;
        }
        int i11 = i7 - i9;
        int i12 = (int) (((f4 - f) / i10) * i11);
        int i13 = i8 + i12;
        if (i13 >= i11 || i13 < 0) {
            return 0;
        }
        return i12;
    }

    public final boolean a(float f, float f4) {
        if (f4 >= this.f6648m - this.f6644h && f >= 0 - (0 / 2) && f <= (0 / 2) + 0) {
            return true;
        }
        return false;
    }

    public final boolean b(float f, float f4) {
        boolean z7;
        RecyclerView recyclerView = this.f6649n;
        Field field = AbstractC1066z.f11214a;
        if (recyclerView.getLayoutDirection() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i7 = this.f6641d;
        if (z7) {
            if (f > i7 / 2) {
                return false;
            }
        } else if (f < this.f6647l - i7) {
            return false;
        }
        int i8 = 0 / 2;
        if (f4 < 0 - i8 || f4 > i8 + 0) {
            return false;
        }
        return true;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i7 = this.f6652q;
        if (i7 == 1) {
            boolean b5 = b(motionEvent.getX(), motionEvent.getY());
            boolean a7 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b5 && !a7) {
                return false;
            }
            if (a7) {
                this.f6653r = 1;
                this.f6646k = (int) motionEvent.getX();
            } else if (b5) {
                this.f6653r = 2;
                this.j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i7 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i7) {
        G.c cVar = this.f6658w;
        StateListDrawable stateListDrawable = this.f6639b;
        if (i7 == 2 && this.f6652q != 2) {
            stateListDrawable.setState(f6636x);
            this.f6649n.removeCallbacks(cVar);
        }
        if (i7 == 0) {
            this.f6649n.invalidate();
        } else {
            f();
        }
        if (this.f6652q == 2 && i7 != 2) {
            stateListDrawable.setState(f6637y);
            this.f6649n.removeCallbacks(cVar);
            this.f6649n.postDelayed(cVar, 1200);
        } else if (i7 == 1) {
            this.f6649n.removeCallbacks(cVar);
            this.f6649n.postDelayed(cVar, 1500);
        }
        this.f6652q = i7;
    }

    public final void f() {
        int i7 = this.f6657v;
        ValueAnimator valueAnimator = this.f6656u;
        if (i7 != 0) {
            if (i7 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f6657v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
