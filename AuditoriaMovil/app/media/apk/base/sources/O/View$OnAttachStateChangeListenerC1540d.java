package o;

import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: o.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC1540d implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14407a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f14408b;

    public /* synthetic */ View$OnAttachStateChangeListenerC1540d(k kVar, int i7) {
        this.f14407a = i7;
        this.f14408b = kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i7 = this.f14407a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f14407a) {
            case 0:
                View$OnKeyListenerC1542f view$OnKeyListenerC1542f = (View$OnKeyListenerC1542f) this.f14408b;
                ViewTreeObserver viewTreeObserver = view$OnKeyListenerC1542f.f14432s0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        view$OnKeyListenerC1542f.f14432s0 = view.getViewTreeObserver();
                    }
                    view$OnKeyListenerC1542f.f14432s0.removeGlobalOnLayoutListener(view$OnKeyListenerC1542f.f14414Z);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                s sVar = (s) this.f14408b;
                ViewTreeObserver viewTreeObserver2 = sVar.f14508j0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f14508j0 = view.getViewTreeObserver();
                    }
                    sVar.f14508j0.removeGlobalOnLayoutListener(sVar.f14498Z);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
