package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.appecoactivate.R;
import java.lang.reflect.InvocationTargetException;
import k0.RunnableC1375b;
import k0.View$OnTouchListenerC1378e;
/* loaded from: classes.dex */
public abstract class V extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f14732a;

    /* renamed from: b  reason: collision with root package name */
    public int f14733b;

    /* renamed from: c  reason: collision with root package name */
    public int f14734c;

    /* renamed from: d  reason: collision with root package name */
    public int f14735d;

    /* renamed from: e  reason: collision with root package name */
    public int f14736e;

    /* renamed from: e0  reason: collision with root package name */
    public T f14737e0;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f14738f0;

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f14739g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f14740h0;

    /* renamed from: i0  reason: collision with root package name */
    public View$OnTouchListenerC1378e f14741i0;

    /* renamed from: j0  reason: collision with root package name */
    public RunnableC1375b f14742j0;

    public V(Context context, boolean z7) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f14732a = new Rect();
        this.f14733b = 0;
        this.f14734c = 0;
        this.f14735d = 0;
        this.f14736e = 0;
        this.f14739g0 = z7;
        setCacheColorHint(0);
    }

    public final int a(int i7, int i8) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            if (i12 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i7, makeMeasureSpec);
            view.forceLayout();
            if (i11 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i8) {
                return i8;
            }
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.V.b(int, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f14732a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f14742j0 != null) {
            return;
        }
        super.drawableStateChanged();
        T t7 = this.f14737e0;
        if (t7 != null) {
            t7.f14717b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f14740h0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f14739g0 && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f14739g0 && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f14739g0 && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f14739g0 && this.f14738f0) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f14742j0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f14742j0 == null) {
            RunnableC1375b runnableC1375b = new RunnableC1375b(this, 1);
            this.f14742j0 = runnableC1375b;
            post(runnableC1375b);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 >= 30 && Q.f14710d) {
                        try {
                            Q.f14707a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            Q.f14708b.invoke(this, Integer.valueOf(pointToPosition));
                            Q.f14709c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e7) {
                            e7.printStackTrace();
                        } catch (InvocationTargetException e8) {
                            e8.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f14740h0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1375b runnableC1375b = this.f14742j0;
        if (runnableC1375b != null) {
            V v6 = (V) runnableC1375b.f13546b;
            v6.f14742j0 = null;
            v6.removeCallbacks(runnableC1375b);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z7) {
        this.f14738f0 = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.T, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        T t7 = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f14716a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f14716a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f14717b = true;
            t7 = drawable2;
        }
        this.f14737e0 = t7;
        super.setSelector(t7);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f14733b = rect.left;
        this.f14734c = rect.top;
        this.f14735d = rect.right;
        this.f14736e = rect.bottom;
    }
}
