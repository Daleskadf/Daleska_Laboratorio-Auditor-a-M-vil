package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h0.AbstractC1066z;
import i.AbstractC1091a;
/* loaded from: classes.dex */
public abstract class Z extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14764a;

    /* renamed from: b  reason: collision with root package name */
    public int f14765b;

    /* renamed from: c  reason: collision with root package name */
    public int f14766c;

    /* renamed from: d  reason: collision with root package name */
    public int f14767d;

    /* renamed from: e  reason: collision with root package name */
    public int f14768e;

    /* renamed from: e0  reason: collision with root package name */
    public float f14769e0;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f14770f0;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f14771g0;

    /* renamed from: h0  reason: collision with root package name */
    public int[] f14772h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f14773i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f14774j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f14775k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f14776l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f14777m0;

    public Z(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f14764a = true;
        this.f14765b = -1;
        this.f14766c = 0;
        this.f14768e = 8388659;
        int[] iArr = AbstractC1091a.j;
        R1.j J02 = R1.j.J0(context, attributeSet, iArr, i7);
        AbstractC1066z.d(this, context, iArr, attributeSet, (TypedArray) J02.f4683c, i7);
        TypedArray typedArray = (TypedArray) J02.f4683c;
        int i8 = typedArray.getInt(1, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = typedArray.getInt(0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z7 = typedArray.getBoolean(2, true);
        if (!z7) {
            setBaselineAligned(z7);
        }
        this.f14769e0 = typedArray.getFloat(4, -1.0f);
        this.f14765b = typedArray.getInt(3, -1);
        this.f14770f0 = typedArray.getBoolean(7, false);
        setDividerDrawable(J02.u0(5));
        this.f14776l0 = typedArray.getInt(8, 0);
        this.f14777m0 = typedArray.getDimensionPixelSize(6, 0);
        J02.O0();
    }

    public final void b(Canvas canvas, int i7) {
        this.f14773i0.setBounds(getPaddingLeft() + this.f14777m0, i7, (getWidth() - getPaddingRight()) - this.f14777m0, this.f14775k0 + i7);
        this.f14773i0.draw(canvas);
    }

    public final void c(Canvas canvas, int i7) {
        this.f14773i0.setBounds(i7, getPaddingTop() + this.f14777m0, this.f14774j0 + i7, (getHeight() - getPaddingBottom()) - this.f14777m0);
        this.f14773i0.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Y;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, p.Y] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, p.Y] */
    @Override // android.view.ViewGroup
    /* renamed from: d */
    public Y generateDefaultLayoutParams() {
        int i7 = this.f14767d;
        if (i7 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i7 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, p.Y] */
    @Override // android.view.ViewGroup
    /* renamed from: e */
    public Y generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, p.Y] */
    @Override // android.view.ViewGroup
    /* renamed from: f */
    public Y generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean g(int i7) {
        if (i7 == 0) {
            if ((this.f14776l0 & 1) == 0) {
                return false;
            }
            return true;
        } else if (i7 == getChildCount()) {
            if ((this.f14776l0 & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f14776l0 & 2) == 0) {
            return false;
        } else {
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                if (getChildAt(i8).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f14765b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f14765b;
        if (childCount > i8) {
            View childAt = getChildAt(i8);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f14765b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i9 = this.f14766c;
            if (this.f14767d == 1 && (i7 = this.f14768e & 112) != 48) {
                if (i7 != 16) {
                    if (i7 == 80) {
                        i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                    }
                } else {
                    i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
                }
            }
            return i9 + ((LinearLayout.LayoutParams) ((Y) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14765b;
    }

    public Drawable getDividerDrawable() {
        return this.f14773i0;
    }

    public int getDividerPadding() {
        return this.f14777m0;
    }

    public int getDividerWidth() {
        return this.f14774j0;
    }

    public int getGravity() {
        return this.f14768e;
    }

    public int getOrientation() {
        return this.f14767d;
    }

    public int getShowDividers() {
        return this.f14776l0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f14769e0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        int left2;
        int bottom;
        if (this.f14773i0 == null) {
            return;
        }
        int i8 = 0;
        if (this.f14767d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i8 < virtualChildCount) {
                View childAt = getChildAt(i8);
                if (childAt != null && childAt.getVisibility() != 8 && g(i8)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((Y) childAt.getLayoutParams())).topMargin) - this.f14775k0);
                }
                i8++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f14775k0;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((Y) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a7 = b1.a(this);
        while (i8 < virtualChildCount2) {
            View childAt3 = getChildAt(i8);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i8)) {
                Y y2 = (Y) childAt3.getLayoutParams();
                if (a7) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) y2).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) y2).leftMargin) - this.f14774j0;
                }
                c(canvas, left2);
            }
            i8++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a7) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i7 = this.f14774j0;
                    right = left - i7;
                }
            } else {
                Y y3 = (Y) childAt4.getLayoutParams();
                if (a7) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) y3).leftMargin;
                    i7 = this.f14774j0;
                    right = left - i7;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) y3).rightMargin;
                }
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.Z.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e0, code lost:
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.Z.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z7) {
        this.f14764a = z7;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f14765b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14773i0) {
            return;
        }
        this.f14773i0 = drawable;
        boolean z7 = false;
        if (drawable != null) {
            this.f14774j0 = drawable.getIntrinsicWidth();
            this.f14775k0 = drawable.getIntrinsicHeight();
        } else {
            this.f14774j0 = 0;
            this.f14775k0 = 0;
        }
        if (drawable == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f14777m0 = i7;
    }

    public void setGravity(int i7) {
        if (this.f14768e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f14768e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f14768e;
        if ((8388615 & i9) != i8) {
            this.f14768e = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f14770f0 = z7;
    }

    public void setOrientation(int i7) {
        if (this.f14767d != i7) {
            this.f14767d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f14776l0) {
            requestLayout();
        }
        this.f14776l0 = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f14768e;
        if ((i9 & 112) != i8) {
            this.f14768e = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f14769e0 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
