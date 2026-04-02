package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.android.gms.common.api.internal.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0730d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    public static final ComponentCallbacks2C0730d f9232e = new ComponentCallbacks2C0730d();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f9233a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f9234b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9235c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f9236d = false;

    public static void b(Application application) {
        ComponentCallbacks2C0730d componentCallbacks2C0730d = f9232e;
        synchronized (componentCallbacks2C0730d) {
            try {
                if (!componentCallbacks2C0730d.f9236d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0730d);
                    application.registerComponentCallbacks(componentCallbacks2C0730d);
                    componentCallbacks2C0730d.f9236d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC0729c interfaceC0729c) {
        synchronized (f9232e) {
            this.f9235c.add(interfaceC0729c);
        }
    }

    public final void c(boolean z7) {
        synchronized (f9232e) {
            try {
                Iterator it = this.f9235c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0729c) it.next()).a(z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f9234b;
        boolean compareAndSet = this.f9233a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f9234b;
        boolean compareAndSet = this.f9233a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20 && this.f9233a.compareAndSet(false, true)) {
            this.f9234b.set(true);
            c(true);
        }
    }
}
