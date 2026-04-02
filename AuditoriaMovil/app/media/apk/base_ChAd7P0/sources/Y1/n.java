package Y1;

import android.view.animation.Interpolator;
/* loaded from: classes.dex */
public final class n implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f4 = f - 1.0f;
        return (f4 * f4 * f4 * f4 * f4) + 1.0f;
    }
}
