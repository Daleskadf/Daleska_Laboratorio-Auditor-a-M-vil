package r5;

import B5.AbstractActivityC0032e;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0568u;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0032e f15528a;

    public c(AbstractActivityC0032e thisActivity) {
        j.e(thisActivity, "thisActivity");
        this.f15528a = thisActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j.e(activity, "activity");
        if (this.f15528a == activity && activity.getApplicationContext() != null) {
            Context applicationContext = activity.getApplicationContext();
            j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        j.e(activity, "activity");
        j.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j.e(activity, "activity");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC0568u interfaceC0568u) {
        onActivityDestroyed(this.f15528a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC0568u interfaceC0568u) {
        onActivityStopped(this.f15528a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void g(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC0568u interfaceC0568u) {
    }
}
