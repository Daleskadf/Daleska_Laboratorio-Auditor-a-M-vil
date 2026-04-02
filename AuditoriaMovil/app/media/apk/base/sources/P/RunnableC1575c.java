package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;
/* renamed from: p.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1575c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f14785b;

    public /* synthetic */ RunnableC1575c(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f14784a = i7;
        this.f14785b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14784a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f14785b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f7332r0 = actionBarOverlayLayout.f7317c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f7333s0);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f14785b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f7332r0 = actionBarOverlayLayout2.f7317c.animate().translationY(-actionBarOverlayLayout2.f7317c.getHeight()).setListener(actionBarOverlayLayout2.f7333s0);
                return;
        }
    }
}
