package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i.AbstractC1091a;
import java.lang.ref.WeakReference;
import p.a1;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f7482a;

    /* renamed from: b  reason: collision with root package name */
    public int f7483b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f7484c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f7485d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7482a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1091a.f11370v, 0, 0);
        this.f7483b = obtainStyledAttributes.getResourceId(2, -1);
        this.f7482a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f7483b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f7485d;
    }

    public int getLayoutResource() {
        return this.f7482a;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f7483b = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f7485d = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f7482a = i7;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference weakReference = this.f7484c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i7);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                if (this.f7482a != 0) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutInflater layoutInflater = this.f7485d;
                    if (layoutInflater == null) {
                        layoutInflater = LayoutInflater.from(getContext());
                    }
                    View inflate = layoutInflater.inflate(this.f7482a, viewGroup, false);
                    int i8 = this.f7483b;
                    if (i8 != -1) {
                        inflate.setId(i8);
                    }
                    int indexOfChild = viewGroup.indexOfChild(this);
                    viewGroup.removeViewInLayout(this);
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        viewGroup.addView(inflate, indexOfChild, layoutParams);
                    } else {
                        viewGroup.addView(inflate, indexOfChild);
                    }
                    this.f7484c = new WeakReference(inflate);
                    return;
                }
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    public void setOnInflateListener(a1 a1Var) {
    }
}
