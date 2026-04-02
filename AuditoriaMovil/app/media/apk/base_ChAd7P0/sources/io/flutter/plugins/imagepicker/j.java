package io.flutter.plugins.imagepicker;

import B5.AbstractActivityC0032e;
import a1.C0415A;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0568u;
/* loaded from: classes.dex */
public final class j implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0032e f12364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f12365b;

    public j(k kVar, AbstractActivityC0032e abstractActivityC0032e) {
        this.f12365b = kVar;
        this.f12364a = abstractActivityC0032e;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void g(InterfaceC0568u interfaceC0568u) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f12364a == activity && activity.getApplicationContext() != null) {
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a aVar;
        if (this.f12364a == activity) {
            h hVar = (h) this.f12365b.f12367b.f14761c;
            synchronized (hVar.f12361g0) {
                try {
                    R1.j jVar = hVar.f12360f0;
                    if (jVar != null) {
                        r rVar = (r) jVar.f4682b;
                        C0415A c0415a = hVar.f12357d;
                        if (rVar != null) {
                            aVar = a.IMAGE;
                        } else {
                            aVar = a.VIDEO;
                        }
                        c0415a.getClass();
                        int ordinal = aVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                ((Activity) c0415a.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "video").apply();
                            }
                        } else {
                            ((Activity) c0415a.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "image").apply();
                        }
                        if (rVar != null) {
                            SharedPreferences.Editor edit = ((Activity) hVar.f12357d.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
                            Double d7 = rVar.f12379a;
                            if (d7 != null) {
                                edit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(d7.doubleValue()));
                            }
                            Double d8 = rVar.f12380b;
                            if (d8 != null) {
                                edit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(d8.doubleValue()));
                            }
                            edit.putInt("flutter_image_picker_image_quality", rVar.f12381c.intValue());
                            edit.apply();
                        }
                        Uri uri = hVar.f12359e0;
                        if (uri != null) {
                            ((Activity) hVar.f12357d.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC0568u interfaceC0568u) {
        onActivityDestroyed(this.f12364a);
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC0568u interfaceC0568u) {
        onActivityStopped(this.f12364a);
    }
}
