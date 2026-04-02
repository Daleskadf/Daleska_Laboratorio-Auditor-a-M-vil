package d2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import h3.AbstractC1079a;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: d2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891e extends AbstractC0894h implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    public final Context f10238c;

    /* renamed from: d  reason: collision with root package name */
    public final C0888b f10239d = new C0888b(this);

    /* renamed from: b  reason: collision with root package name */
    public final C0889c f10237b = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, d2.c] */
    public C0891e(Context context) {
        this.f10238c = context;
    }

    @Override // d2.AbstractC0894h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0889c c0889c = this.f10237b;
        c0889c.f10232a.draw(canvas);
        if (c0889c.f10233b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f10237b.f10232a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f10237b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f10237b.f10232a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f10242a != null && Build.VERSION.SDK_INT >= 24) {
            return new C0890d(this.f10242a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f10237b.f10232a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f10237b.f10232a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f10237b.f10232a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0175, code lost:
        if (r8.f10233b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
        r8.f10233b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
        r8.f10233b.playTogether(r8.f10234c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Type inference failed for: r12v9, types: [S.k, S.f] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0891e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f10237b.f10232a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f10237b.f10233b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f10237b.f10232a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f10237b.f10232a.setBounds(rect);
        }
    }

    @Override // d2.AbstractC0894h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        return this.f10237b.f10232a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f10237b.f10232a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f10237b.f10232a.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setAutoMirrored(z7);
        } else {
            this.f10237b.f10232a.setAutoMirrored(z7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10237b.f10232a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            AbstractC1079a.w(drawable, i7);
        } else {
            this.f10237b.f10232a.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f10237b.f10232a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f10237b.f10232a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f10237b.f10232a.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0889c c0889c = this.f10237b;
        if (c0889c.f10233b.isStarted()) {
            return;
        }
        c0889c.f10233b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f10242a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f10237b.f10233b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
