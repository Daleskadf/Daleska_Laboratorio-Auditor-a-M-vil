package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class z implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f11758a;

    /* renamed from: b  reason: collision with root package name */
    public x f11759b;

    public z(View view, x xVar) {
        this.f11758a = view;
        this.f11759b = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        x xVar = this.f11759b;
        if (xVar == null) {
            return;
        }
        xVar.run();
        this.f11759b = null;
        this.f11758a.post(new x(this, 1));
    }
}
