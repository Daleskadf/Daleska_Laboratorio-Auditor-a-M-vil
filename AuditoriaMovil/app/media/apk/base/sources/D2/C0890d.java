package d2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* renamed from: d2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0890d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f10236a;

    public C0890d(Drawable.ConstantState constantState) {
        this.f10236a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f10236a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f10236a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0891e c0891e = new C0891e(null);
        Drawable newDrawable = this.f10236a.newDrawable();
        c0891e.f10242a = newDrawable;
        newDrawable.setCallback(c0891e.f10239d);
        return c0891e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0891e c0891e = new C0891e(null);
        Drawable newDrawable = this.f10236a.newDrawable(resources);
        c0891e.f10242a = newDrawable;
        newDrawable.setCallback(c0891e.f10239d);
        return c0891e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0891e c0891e = new C0891e(null);
        Drawable newDrawable = this.f10236a.newDrawable(resources, theme);
        c0891e.f10242a = newDrawable;
        newDrawable.setCallback(c0891e.f10239d);
        return c0891e;
    }
}
