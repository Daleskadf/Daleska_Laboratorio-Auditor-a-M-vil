package k0;

import a6.o0;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import h0.AbstractC1066z;
import java.lang.reflect.Field;
import p.C1587i;
import p.V;
import t4.AbstractC1823c;
import t4.u;
import z0.AbstractComponentCallbacksC2061v;
import z0.L;
import z0.r;
/* renamed from: k0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1375b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13545a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13546b;

    public /* synthetic */ RunnableC1375b(Object obj, int i7) {
        this.f13545a = i7;
        this.f13546b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1587i c1587i;
        Object obj = this.f13546b;
        switch (this.f13545a) {
            case 0:
                View$OnTouchListenerC1378e view$OnTouchListenerC1378e = (View$OnTouchListenerC1378e) obj;
                if (view$OnTouchListenerC1378e.f13561j0) {
                    boolean z7 = view$OnTouchListenerC1378e.f13559h0;
                    C1374a c1374a = view$OnTouchListenerC1378e.f13551a;
                    if (z7) {
                        view$OnTouchListenerC1378e.f13559h0 = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c1374a.f13541e = currentAnimationTimeMillis;
                        c1374a.f13542g = -1L;
                        c1374a.f = currentAnimationTimeMillis;
                        c1374a.f13543h = 0.5f;
                    }
                    if ((c1374a.f13542g > 0 && AnimationUtils.currentAnimationTimeMillis() > c1374a.f13542g + c1374a.f13544i) || !view$OnTouchListenerC1378e.e()) {
                        view$OnTouchListenerC1378e.f13561j0 = false;
                        return;
                    }
                    boolean z8 = view$OnTouchListenerC1378e.f13560i0;
                    ListView listView = view$OnTouchListenerC1378e.f13553c;
                    if (z8) {
                        view$OnTouchListenerC1378e.f13560i0 = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c1374a.f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a7 = c1374a.a(currentAnimationTimeMillis2);
                        c1374a.f = currentAnimationTimeMillis2;
                        view$OnTouchListenerC1378e.f13563l0.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - c1374a.f)) * ((a7 * 4.0f) + ((-4.0f) * a7 * a7)) * c1374a.f13540d));
                        Field field = AbstractC1066z.f11214a;
                        listView.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 1:
                V v6 = (V) obj;
                v6.f14742j0 = null;
                v6.drawableStateChanged();
                return;
            case 2:
                ActionMenuView actionMenuView = ((Toolbar) obj).f7456a;
                if (actionMenuView != null && (c1587i = actionMenuView.q0) != null) {
                    c1587i.i();
                    return;
                }
                return;
            case 3:
                AbstractC1823c abstractC1823c = (AbstractC1823c) obj;
                if (abstractC1823c.c()) {
                    abstractC1823c.a(u.Initial, o0.f7173e);
                    return;
                }
                return;
            case 4:
                r rVar = (r) obj;
                rVar.f16787O0.onDismiss(rVar.f16795W0);
                return;
            case 5:
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = (AbstractComponentCallbacksC2061v) obj;
                if (abstractComponentCallbacksC2061v.f16813C0 != null) {
                    abstractComponentCallbacksC2061v.k().getClass();
                    return;
                }
                return;
            default:
                ((L) obj).A(true);
                return;
        }
    }
}
