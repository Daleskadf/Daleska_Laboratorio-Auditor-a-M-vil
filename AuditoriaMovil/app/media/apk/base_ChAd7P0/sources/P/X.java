package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import o.View$OnTouchListenerC1537a;
/* loaded from: classes.dex */
public final class X implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14745a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View$OnTouchListenerC1537a f14746b;

    public /* synthetic */ X(View$OnTouchListenerC1537a view$OnTouchListenerC1537a, int i7) {
        this.f14745a = i7;
        this.f14746b = view$OnTouchListenerC1537a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14745a) {
            case 0:
                ViewParent parent = this.f14746b.f14401d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                View$OnTouchListenerC1537a view$OnTouchListenerC1537a = this.f14746b;
                view$OnTouchListenerC1537a.a();
                View view = view$OnTouchListenerC1537a.f14401d;
                if (view.isEnabled() && !view.isLongClickable() && view$OnTouchListenerC1537a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    view$OnTouchListenerC1537a.f14395X = true;
                    return;
                }
                return;
        }
    }
}
