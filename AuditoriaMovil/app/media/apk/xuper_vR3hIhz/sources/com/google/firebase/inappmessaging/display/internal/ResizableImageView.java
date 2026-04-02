package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.q;
/* loaded from: classes2.dex */
public class ResizableImageView extends q {
    private int mDensityDpi;

    /* loaded from: classes2.dex */
    public static class Dimensions {

        /* renamed from: h  reason: collision with root package name */
        final int f7036h;

        /* renamed from: w  reason: collision with root package name */
        final int f7037w;

        private Dimensions(int i10, int i11) {
            this.f7037w = i10;
            this.f7036h = i11;
        }
    }

    public ResizableImageView(Context context) {
        super(context);
        init(context);
    }

    private Dimensions bound(int i10, int i11) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i10 > maxWidth) {
            Logging.logdNumber("Image: capping width", maxWidth);
            i11 = (i11 * maxWidth) / i10;
            i10 = maxWidth;
        }
        if (i11 > maxHeight) {
            Logging.logdNumber("Image: capping height", maxHeight);
            i10 = (i10 * maxHeight) / i11;
        } else {
            maxHeight = i11;
        }
        return new Dimensions(i10, maxHeight);
    }

    private void checkMinDim() {
        float f10;
        int max = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int max2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = max;
        float f12 = max2;
        Logging.logdPair("Image: min width, height", f11, f12);
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        Logging.logdPair("Image: actual width, height", f13, f14);
        float f15 = 1.0f;
        if (measuredWidth < max) {
            f10 = f11 / f13;
        } else {
            f10 = 1.0f;
        }
        if (measuredHeight < max2) {
            f15 = f12 / f14;
        }
        if (f10 <= f15) {
            f10 = f15;
        }
        if (f10 > 1.0d) {
            int ceil = (int) Math.ceil(f13 * f10);
            int ceil2 = (int) Math.ceil(f14 * f10);
            Logging.logd("Measured dimension (" + measuredWidth + "x" + measuredHeight + ") too small.  Resizing to " + ceil + "x" + ceil2);
            Dimensions bound = bound(ceil, ceil2);
            setMeasuredDimension(bound.f7037w, bound.f7036h);
        }
    }

    private void init(Context context) {
        this.mDensityDpi = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    private void scalePxToDp(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Logging.logdPair("Image: intrinsic width, height", intrinsicWidth, intrinsicHeight);
        Dimensions bound = bound((int) Math.ceil((intrinsicWidth * this.mDensityDpi) / 160), (int) Math.ceil((intrinsicHeight * this.mDensityDpi) / 160));
        Logging.logdPair("Image: new target dimensions", bound.f7037w, bound.f7036h);
        setMeasuredDimension(bound.f7037w, bound.f7036h);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable != null && adjustViewBounds) {
            scalePxToDp(drawable);
            checkMinDim();
        }
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }
}
