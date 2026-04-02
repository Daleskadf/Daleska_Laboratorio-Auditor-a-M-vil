package z0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
/* renamed from: z0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2048h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16769a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f16770b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C2049i f16771c;

    public C2048h(ViewGroup viewGroup, boolean z7, Y y2, C2049i c2049i) {
        this.f16769a = viewGroup;
        this.f16770b = z7;
        this.f16771c = c2049i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.j.e(anim, "anim");
        this.f16769a.endViewTransition(null);
        if (!this.f16770b) {
            C2047g c2047g = this.f16771c.f16772b;
            throw null;
        }
        throw null;
    }
}
