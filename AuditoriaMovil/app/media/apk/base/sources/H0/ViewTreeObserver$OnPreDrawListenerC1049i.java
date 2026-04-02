package h0;

import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: h0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC1049i implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f11193a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f11194b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f11195c;

    public ViewTreeObserver$OnPreDrawListenerC1049i(View view, Runnable runnable) {
        this.f11193a = view;
        this.f11194b = view.getViewTreeObserver();
        this.f11195c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            ViewTreeObserver$OnPreDrawListenerC1049i viewTreeObserver$OnPreDrawListenerC1049i = new ViewTreeObserver$OnPreDrawListenerC1049i(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1049i);
            view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC1049i);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f11194b.isAlive();
        View view = this.f11193a;
        if (isAlive) {
            this.f11194b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f11195c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f11194b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f11194b.isAlive();
        View view2 = this.f11193a;
        if (isAlive) {
            this.f11194b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
