package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.example.appecoactivate.R;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.lang.reflect.Field;
import p.AbstractC1607s0;
import p.C1571a;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7295a;

    /* renamed from: b  reason: collision with root package name */
    public View f7296b;

    /* renamed from: c  reason: collision with root package name */
    public View f7297c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f7298d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f7299e;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f7300e0;
    public Drawable f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7301f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f7302g0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1571a c1571a = new C1571a(this);
        Field field = AbstractC1066z.f11214a;
        setBackground(c1571a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1091a.f11351a);
        boolean z7 = false;
        this.f7298d = obtainStyledAttributes.getDrawable(0);
        this.f7299e = obtainStyledAttributes.getDrawable(2);
        this.f7302g0 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f7300e0 = true;
            this.f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f7300e0 ? !(this.f7298d != null || this.f7299e != null) : this.f == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7298d;
        if (drawable != null && drawable.isStateful()) {
            this.f7298d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f7299e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f7299e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7298d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7299e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f7296b = findViewById(R.id.action_bar);
        this.f7297c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f7295a && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        boolean z8 = true;
        if (this.f7300e0) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z8 = false;
            }
        } else {
            if (this.f7298d != null) {
                if (this.f7296b.getVisibility() == 0) {
                    this.f7298d.setBounds(this.f7296b.getLeft(), this.f7296b.getTop(), this.f7296b.getRight(), this.f7296b.getBottom());
                } else {
                    View view = this.f7297c;
                    if (view != null && view.getVisibility() == 0) {
                        this.f7298d.setBounds(this.f7297c.getLeft(), this.f7297c.getTop(), this.f7297c.getRight(), this.f7297c.getBottom());
                    } else {
                        this.f7298d.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z8 = false;
            }
            this.f7301f0 = false;
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (this.f7296b == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f7302g0) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f7296b == null) {
            return;
        }
        View.MeasureSpec.getMode(i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f7298d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f7298d);
        }
        this.f7298d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f7296b;
            if (view != null) {
                this.f7298d.setBounds(view.getLeft(), this.f7296b.getTop(), this.f7296b.getRight(), this.f7296b.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f7300e0 ? !(this.f7298d != null || this.f7299e != null) : this.f == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        boolean z7 = this.f7300e0;
        boolean z8 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z7 && (drawable2 = this.f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z7 ? !(this.f7298d != null || this.f7299e != null) : this.f == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f7299e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f7299e);
        }
        this.f7299e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f7301f0 && this.f7299e != null) {
                throw null;
            }
        }
        boolean z7 = false;
        if (!this.f7300e0 ? !(this.f7298d != null || this.f7299e != null) : this.f == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z7) {
        int i7;
        this.f7295a = z7;
        if (z7) {
            i7 = 393216;
        } else {
            i7 = 262144;
        }
        setDescendantFocusability(i7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        boolean z7;
        super.setVisibility(i7);
        if (i7 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        Drawable drawable = this.f7298d;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f7299e;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7298d;
        boolean z7 = this.f7300e0;
        if ((drawable == drawable2 && !z7) || ((drawable == this.f7299e && this.f7301f0) || ((drawable == this.f && z7) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }

    public void setTabContainer(AbstractC1607s0 abstractC1607s0) {
    }
}
