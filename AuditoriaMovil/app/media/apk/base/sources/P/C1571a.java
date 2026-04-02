package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
/* renamed from: p.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1571a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f14779a;

    public C1571a(ActionBarContainer actionBarContainer) {
        this.f14779a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f14779a;
        if (actionBarContainer.f7300e0) {
            Drawable drawable = actionBarContainer.f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f7298d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f7299e;
        if (drawable3 != null && actionBarContainer.f7301f0) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f14779a;
        if (actionBarContainer.f7300e0) {
            if (actionBarContainer.f != null) {
                actionBarContainer.f7298d.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable = actionBarContainer.f7298d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
