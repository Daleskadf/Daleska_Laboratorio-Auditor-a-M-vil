package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
/* renamed from: p.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f14782a;

    public C1573b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f14782a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f14782a;
        actionBarOverlayLayout.f7332r0 = null;
        actionBarOverlayLayout.f7323h0 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f14782a;
        actionBarOverlayLayout.f7332r0 = null;
        actionBarOverlayLayout.f7323h0 = false;
    }
}
