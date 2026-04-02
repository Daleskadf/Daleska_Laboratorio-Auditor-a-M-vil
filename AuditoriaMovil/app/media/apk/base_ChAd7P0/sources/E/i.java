package e;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f10532a = new Object();

    public final OnBackInvokedDispatcher a(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        kotlin.jvm.internal.j.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
