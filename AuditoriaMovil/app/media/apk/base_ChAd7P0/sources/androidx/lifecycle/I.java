package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.K;
/* loaded from: classes.dex */
public abstract class I {
    public static void a(Activity activity, EnumC0562n event) {
        kotlin.jvm.internal.j.e(activity, "activity");
        kotlin.jvm.internal.j.e(event, "event");
        if (activity instanceof InterfaceC0568u) {
            C0570w h8 = ((InterfaceC0568u) activity).h();
            if (h8 instanceof C0570w) {
                h8.e(event);
            }
        }
    }

    public static void b(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            K.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new K.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new K(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
