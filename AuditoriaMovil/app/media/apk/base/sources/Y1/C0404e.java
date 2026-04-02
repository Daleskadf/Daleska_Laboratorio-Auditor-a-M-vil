package Y1;

import android.animation.ValueAnimator;
/* renamed from: Y1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0405f f6635a;

    public C0404e(C0405f c0405f) {
        this.f6635a = c0405f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0405f c0405f = this.f6635a;
        c0405f.f6639b.setAlpha(floatValue);
        c0405f.f6640c.setAlpha(floatValue);
        c0405f.f6649n.invalidate();
    }
}
