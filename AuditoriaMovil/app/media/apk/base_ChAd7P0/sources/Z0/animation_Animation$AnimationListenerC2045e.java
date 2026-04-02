package z0;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;
import t4.RunnableC1822b;
/* renamed from: z0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class animation.Animation$AnimationListenerC2045e implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16763a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2046f f16764b;

    public animation.Animation$AnimationListenerC2045e(Y y2, ViewGroup viewGroup, C2046f c2046f) {
        this.f16763a = viewGroup;
        this.f16764b = c2046f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.j.e(animation, "animation");
        C2046f c2046f = this.f16764b;
        ViewGroup viewGroup = this.f16763a;
        viewGroup.post(new RunnableC1822b(24, viewGroup, c2046f));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.j.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.j.e(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
