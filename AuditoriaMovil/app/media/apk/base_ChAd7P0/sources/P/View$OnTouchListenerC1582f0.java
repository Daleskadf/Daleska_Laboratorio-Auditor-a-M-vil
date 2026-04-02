package p;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: p.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC1582f0 implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1584g0 f14791a;

    public View$OnTouchListenerC1582f0(AbstractC1584g0 abstractC1584g0) {
        this.f14791a = abstractC1584g0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x7 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        AbstractC1584g0 abstractC1584g0 = this.f14791a;
        if (action == 0 && (rVar = abstractC1584g0.q0) != null && rVar.isShowing() && x7 >= 0 && x7 < abstractC1584g0.q0.getWidth() && y2 >= 0 && y2 < abstractC1584g0.q0.getHeight()) {
            abstractC1584g0.f14812m0.postDelayed(abstractC1584g0.f14808i0, 250L);
            return false;
        } else if (action == 1) {
            abstractC1584g0.f14812m0.removeCallbacks(abstractC1584g0.f14808i0);
            return false;
        } else {
            return false;
        }
    }
}
