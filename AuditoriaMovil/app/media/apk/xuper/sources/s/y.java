package s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class y extends Drawable implements Drawable.Callback, x, w {

    /* renamed from: g  reason: collision with root package name */
    public static final PorterDuff.Mode f18618g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f18619a;

    /* renamed from: b  reason: collision with root package name */
    public PorterDuff.Mode f18620b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18621c;

    /* renamed from: d  reason: collision with root package name */
    public b0 f18622d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18623e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f18624f;

    public y(b0 b0Var, Resources resources) {
        this.f18622d = b0Var;
        e(resources);
    }

    @Override // s.x
    public final Drawable a() {
        return this.f18624f;
    }

    @Override // s.x
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f18624f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f18624f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            b0 b0Var = this.f18622d;
            if (b0Var != null) {
                b0Var.f18611b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public boolean c() {
        return true;
    }

    public final b0 d() {
        return new b0(this.f18622d);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f18624f.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        b0 b0Var = this.f18622d;
        if (b0Var != null && (constantState = b0Var.f18611b) != null) {
            b(constantState.newDrawable(resources));
        }
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        b0 b0Var = this.f18622d;
        ColorStateList colorStateList = b0Var.f18612c;
        PorterDuff.Mode mode = b0Var.f18613d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f18621c || colorForState != this.f18619a || mode != this.f18620b) {
                setColorFilter(colorForState, mode);
                this.f18619a = colorForState;
                this.f18620b = mode;
                this.f18621c = true;
                return true;
            }
        } else {
            this.f18621c = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i10;
        int changingConfigurations = super.getChangingConfigurations();
        b0 b0Var = this.f18622d;
        if (b0Var != null) {
            i10 = b0Var.getChangingConfigurations();
        } else {
            i10 = 0;
        }
        return changingConfigurations | i10 | this.f18624f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        b0 b0Var = this.f18622d;
        if (b0Var != null && b0Var.a()) {
            this.f18622d.f18610a = getChangingConfigurations();
            return this.f18622d;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f18624f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18624f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18624f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return h.f(this.f18624f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f18624f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f18624f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f18624f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f18624f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f18624f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f18624f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return h.h(this.f18624f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        b0 b0Var;
        if (c() && (b0Var = this.f18622d) != null) {
            colorStateList = b0Var.f18612c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f18624f.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f18624f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f18623e && super.mutate() == this) {
            this.f18622d = d();
            Drawable drawable = this.f18624f;
            if (drawable != null) {
                drawable.mutate();
            }
            b0 b0Var = this.f18622d;
            if (b0Var != null) {
                Drawable drawable2 = this.f18624f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                b0Var.f18611b = constantState;
            }
            this.f18623e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18624f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return h.m(this.f18624f, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        return this.f18624f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f18624f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        h.j(this.f18624f, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f18624f.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18624f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f18624f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f18624f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.f18624f.setState(iArr);
        if (!f(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, s.w
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, s.w
    public void setTintList(ColorStateList colorStateList) {
        this.f18622d.f18612c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, s.w
    public void setTintMode(PorterDuff.Mode mode) {
        this.f18622d.f18613d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f18624f.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public y(Drawable drawable) {
        this.f18622d = d();
        b(drawable);
    }
}
