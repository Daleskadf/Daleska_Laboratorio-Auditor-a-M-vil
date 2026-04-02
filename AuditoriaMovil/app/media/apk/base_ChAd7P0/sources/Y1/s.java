package Y1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import h0.AbstractC1066z;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public R1.j f6685a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f6686b;

    /* renamed from: c  reason: collision with root package name */
    public final M0.x f6687c;

    /* renamed from: d  reason: collision with root package name */
    public final M0.x f6688d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6689e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f6690g;

    public s() {
        A.m mVar = new A.m(this, 20);
        A.c cVar = new A.c(this, 19);
        this.f6687c = new M0.x(mVar);
        this.f6688d = new M0.x(cVar);
        this.f6689e = false;
    }

    public static int e(int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i8, i9);
            }
            return size;
        }
        return Math.min(size, Math.max(i8, i9));
    }

    public static void v(View view) {
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0410k w(Context context, AttributeSet attributeSet, int i7, int i8) {
        C0410k c0410k = new C0410k(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X1.a.f6372a, i7, i8);
        c0410k.f6673b = obtainStyledAttributes.getInt(0, 1);
        c0410k.f6674c = obtainStyledAttributes.getInt(9, 1);
        c0410k.f6675d = obtainStyledAttributes.getBoolean(8, false);
        c0410k.f6676e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0410k;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f6686b;
        y yVar = recyclerView.f8035a;
        C c8 = recyclerView.f8027S0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z7 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f6686b.canScrollVertically(-1) && !this.f6686b.canScrollHorizontally(-1) && !this.f6686b.canScrollHorizontally(1)) {
                z7 = false;
            }
            accessibilityEvent.setScrollable(z7);
            this.f6686b.getClass();
        }
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p7 = p() - 1;
        if (p7 < 0) {
            return;
        }
        RecyclerView.j(o(p7));
        throw null;
    }

    public final void F(y yVar) {
        int size = ((ArrayList) yVar.f6698c).size();
        int i7 = size - 1;
        ArrayList arrayList = (ArrayList) yVar.f6698c;
        if (i7 < 0) {
            arrayList.clear();
            if (size > 0) {
                this.f6686b.invalidate();
                return;
            }
            return;
        }
        arrayList.get(i7).getClass();
        throw new ClassCastException();
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
        int s7 = s();
        int u7 = u();
        int t7 = this.f - t();
        int r7 = this.f6690g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i7 = left - s7;
        int min = Math.min(0, i7);
        int i8 = top - u7;
        int min2 = Math.min(0, i8);
        int i9 = width - t7;
        int max = Math.max(0, i9);
        int max2 = Math.max(0, height - r7);
        RecyclerView recyclerView2 = this.f6686b;
        Field field = AbstractC1066z.f11214a;
        if (recyclerView2.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i9);
            }
        } else {
            if (min == 0) {
                min = Math.min(i7, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i8, max2);
        }
        int[] iArr = {max, min2};
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (z8) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int s8 = s();
                int u8 = u();
                int t8 = this.f - t();
                int r8 = this.f6690g - r();
                Rect rect2 = this.f6686b.f8042e0;
                int[] iArr2 = RecyclerView.f8005c1;
                t tVar = (t) focusedChild.getLayoutParams();
                Rect rect3 = tVar.f6691a;
                rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) tVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin);
                if (rect2.left - i10 >= t8 || rect2.right - i10 <= s8 || rect2.top - i11 >= r8 || rect2.bottom - i11 <= u8) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (z7) {
            recyclerView.scrollBy(i10, i11);
            return true;
        }
        recyclerView.r(i10, i11);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f6686b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f6686b = null;
            this.f6685a = null;
            this.f = 0;
            this.f6690g = 0;
            return;
        }
        this.f6686b = recyclerView;
        this.f6685a = recyclerView.f8040d;
        this.f = recyclerView.getWidth();
        this.f6690g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(t tVar) {
        if (tVar != null) {
            return true;
        }
        return false;
    }

    public abstract int f(C c8);

    public abstract void g(C c8);

    public abstract int h(C c8);

    public abstract int i(C c8);

    public abstract void j(C c8);

    public abstract int k(C c8);

    public abstract t l();

    public t m(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public t n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t) {
            return new t((t) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new t((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new t(layoutParams);
    }

    public final View o(int i7) {
        R1.j jVar = this.f6685a;
        if (jVar != null) {
            int i8 = -1;
            if (i7 >= 0) {
                int childCount = ((RecyclerView) ((C5.i) jVar.f4682b).f593b).getChildCount();
                int i9 = i7;
                while (true) {
                    if (i9 >= childCount) {
                        break;
                    }
                    J2.e eVar = (J2.e) jVar.f4683c;
                    int y2 = i7 - (i9 - eVar.y(i9));
                    if (y2 == 0) {
                        i8 = i9;
                        while (eVar.A(i8)) {
                            i8++;
                        }
                    } else {
                        i9 += y2;
                    }
                }
            }
            return ((RecyclerView) ((C5.i) jVar.f4682b).f593b).getChildAt(i8);
        }
        return null;
    }

    public final int p() {
        R1.j jVar = this.f6685a;
        if (jVar != null) {
            return ((RecyclerView) ((C5.i) jVar.f4682b).f593b).getChildCount() - ((ArrayList) jVar.f4684d).size();
        }
        return 0;
    }

    public int q(y yVar, C c8) {
        RecyclerView recyclerView = this.f6686b;
        if (recyclerView != null) {
            recyclerView.getClass();
            return 1;
        }
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f6686b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f6686b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f6686b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f6686b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(y yVar, C c8) {
        RecyclerView recyclerView = this.f6686b;
        if (recyclerView != null) {
            recyclerView.getClass();
            return 1;
        }
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i7) {
    }
}
