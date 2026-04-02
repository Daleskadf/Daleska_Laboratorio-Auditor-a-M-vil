package Y1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* renamed from: Y1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6633a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0405f f6634b;

    public C0403d(C0405f c0405f) {
        this.f6634b = c0405f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f6633a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f6633a) {
            this.f6633a = false;
            return;
        }
        C0405f c0405f = this.f6634b;
        if (((Float) c0405f.f6656u.getAnimatedValue()).floatValue() == 0.0f) {
            c0405f.f6657v = 0;
            c0405f.e(0);
            return;
        }
        c0405f.f6657v = 2;
        c0405f.f6649n.invalidate();
    }
}
