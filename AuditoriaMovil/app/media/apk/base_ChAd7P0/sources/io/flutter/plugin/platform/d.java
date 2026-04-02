package io.flutter.plugin.platform;

import B5.C0042o;
import android.view.MotionEvent;
/* loaded from: classes.dex */
public final class d extends C0042o {

    /* renamed from: e0  reason: collision with root package name */
    public C1136a f11692e0;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean e7;
        C1136a c1136a = this.f11692e0;
        if (c1136a != null) {
            io.flutter.view.o oVar = c1136a.f11685a;
            if (oVar == null) {
                e7 = false;
            } else {
                e7 = oVar.e(motionEvent, true);
            }
            if (e7) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
