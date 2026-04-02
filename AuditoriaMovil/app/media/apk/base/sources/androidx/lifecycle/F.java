package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public abstract class F {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
