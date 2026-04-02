package d2;

import android.graphics.drawable.Drawable;
/* renamed from: d2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888b implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10230a = 1;

    /* renamed from: b  reason: collision with root package name */
    public Object f10231b;

    public /* synthetic */ C0888b() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f10230a) {
            case 0:
                ((C0891e) this.f10231b).invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f10230a) {
            case 0:
                ((C0891e) this.f10231b).scheduleSelf(runnable, j);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f10231b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f10230a) {
            case 0:
                ((C0891e) this.f10231b).unscheduleSelf(runnable);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f10231b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public C0888b(C0891e c0891e) {
        this.f10231b = c0891e;
    }

    private final void a(Drawable drawable) {
    }
}
