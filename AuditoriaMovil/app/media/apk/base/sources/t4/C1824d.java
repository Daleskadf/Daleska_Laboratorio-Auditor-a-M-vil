package t4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: t4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1824d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f15799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ E.e f15800b;

    public C1824d(E.e eVar, AtomicBoolean atomicBoolean) {
        this.f15800b = eVar;
        this.f15799a = atomicBoolean;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f15799a.compareAndSet(true, false)) {
            this.f15800b.V();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.f15799a.compareAndSet(true, false)) {
            this.f15800b.V();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f15799a.compareAndSet(true, false)) {
            this.f15800b.V();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
