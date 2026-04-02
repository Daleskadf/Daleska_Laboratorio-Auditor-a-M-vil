package s;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* loaded from: classes.dex */
public final class b0 extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f18610a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f18611b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f18612c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f18613d;

    public b0(b0 b0Var) {
        this.f18612c = null;
        this.f18613d = y.f18618g;
        if (b0Var != null) {
            this.f18610a = b0Var.f18610a;
            this.f18611b = b0Var.f18611b;
            this.f18612c = b0Var.f18612c;
            this.f18613d = b0Var.f18613d;
        }
    }

    public boolean a() {
        if (this.f18611b != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10;
        int i11 = this.f18610a;
        Drawable.ConstantState constantState = this.f18611b;
        if (constantState != null) {
            i10 = constantState.getChangingConfigurations();
        } else {
            i10 = 0;
        }
        return i11 | i10;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new a0(this, resources);
        }
        return new y(this, resources);
    }
}
