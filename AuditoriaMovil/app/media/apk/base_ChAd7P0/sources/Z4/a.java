package Z4;

import X.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.example.appecoactivate.R;
/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f6737a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f6738b;

    /* renamed from: c  reason: collision with root package name */
    public int f6739c = -1;

    public a(Context context) {
        this.f6738b = d.getDrawable(context, R.drawable.amu_bubble_mask);
        this.f6737a = d.getDrawable(context, R.drawable.amu_bubble_shadow);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f6738b.draw(canvas);
        canvas.drawColor(this.f6739c, PorterDuff.Mode.SRC_IN);
        this.f6737a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f6738b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i8, int i9, int i10) {
        this.f6738b.setBounds(i7, i8, i9, i10);
        this.f6737a.setBounds(i7, i8, i9, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        this.f6738b.setBounds(rect);
        this.f6737a.setBounds(rect);
    }
}
