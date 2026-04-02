package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.example.appecoactivate.R;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7347a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7348b;

    /* renamed from: c  reason: collision with root package name */
    public int f7349c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7349c = -1;
        int[] iArr = AbstractC1091a.f11358i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC1066z.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f7347a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f7347a);
        }
    }

    private void setStacked(boolean z7) {
        int i7;
        int i8;
        if (this.f7348b != z7) {
            if (!z7 || this.f7347a) {
                this.f7348b = z7;
                setOrientation(z7 ? 1 : 0);
                if (z7) {
                    i7 = 8388613;
                } else {
                    i7 = 80;
                }
                setGravity(i7);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z7) {
                        i8 = 8;
                    } else {
                        i8 = 4;
                    }
                    findViewById.setVisibility(i8);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean z7;
        int i10;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = 0;
        if (this.f7347a) {
            if (size > this.f7349c && this.f7348b) {
                setStacked(false);
            }
            this.f7349c = size;
        }
        if (!this.f7348b && View.MeasureSpec.getMode(i7) == 1073741824) {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z7 = true;
        } else {
            i9 = i7;
            z7 = false;
        }
        super.onMeasure(i9, i8);
        if (this.f7347a && !this.f7348b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z7 = true;
        }
        if (z7) {
            super.onMeasure(i7, i8);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 < childCount) {
                if (getChildAt(i12).getVisibility() == 0) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f7348b) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    } else if (getChildAt(i13).getVisibility() == 0) {
                        i10 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i10 >= 0) {
                    i11 = getChildAt(i10).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i11 = measuredHeight;
                }
            } else {
                i11 = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = AbstractC1066z.f11214a;
        if (getMinimumHeight() != i11) {
            setMinimumHeight(i11);
            if (i8 == 0) {
                super.onMeasure(i7, i8);
            }
        }
    }

    public void setAllowStacking(boolean z7) {
        if (this.f7347a != z7) {
            this.f7347a = z7;
            if (!z7 && this.f7348b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
