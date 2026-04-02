package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public final class q extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final C1136a f11738a;

    /* renamed from: b  reason: collision with root package name */
    public final View f11739b;

    public q(Context context, C1136a c1136a, View view) {
        super(context);
        this.f11738a = c1136a;
        this.f11739b = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.o oVar = this.f11738a.f11685a;
        if (oVar == null) {
            return false;
        }
        return oVar.a(this.f11739b, view, accessibilityEvent);
    }
}
