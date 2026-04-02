package B5;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
/* renamed from: B5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031d implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0032e f350a;

    public C0031d(AbstractActivityC0032e abstractActivityC0032e) {
        this.f350a = abstractActivityC0032e;
    }

    public final void onBackCancelled() {
        AbstractActivityC0032e abstractActivityC0032e = this.f350a;
        if (abstractActivityC0032e.m("cancelBackGesture")) {
            C0035h c0035h = abstractActivityC0032e.f353b;
            c0035h.c();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                ((L5.r) cVar.j.f593b).a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0032e abstractActivityC0032e = this.f350a;
        if (abstractActivityC0032e.m("commitBackGesture")) {
            C0035h c0035h = abstractActivityC0032e.f353b;
            c0035h.c();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                ((L5.r) cVar.j.f593b).a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0032e abstractActivityC0032e = this.f350a;
        if (abstractActivityC0032e.m("updateBackGestureProgress")) {
            C0035h c0035h = abstractActivityC0032e.f353b;
            c0035h.c();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                C5.i iVar = cVar.j;
                iVar.getClass();
                ((L5.r) iVar.f593b).a("updateBackGestureProgress", C5.i.i0(backEvent), null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0032e abstractActivityC0032e = this.f350a;
        if (abstractActivityC0032e.m("startBackGesture")) {
            C0035h c0035h = abstractActivityC0032e.f353b;
            c0035h.c();
            C5.c cVar = c0035h.f361b;
            if (cVar != null) {
                C5.i iVar = cVar.j;
                iVar.getClass();
                ((L5.r) iVar.f593b).a("startBackGesture", C5.i.i0(backEvent), null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }
}
