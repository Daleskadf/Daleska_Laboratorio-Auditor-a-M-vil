package B5;

import android.view.ViewTreeObserver;
/* renamed from: B5.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0034g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ B f358a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0035h f359b;

    public ViewTreeObserver$OnPreDrawListenerC0034g(C0035h c0035h, B b5) {
        this.f359b = c0035h;
        this.f358a = b5;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0035h c0035h = this.f359b;
        if (c0035h.f365g && c0035h.f364e != null) {
            this.f358a.getViewTreeObserver().removeOnPreDrawListener(this);
            c0035h.f364e = null;
        }
        return c0035h.f365g;
    }
}
