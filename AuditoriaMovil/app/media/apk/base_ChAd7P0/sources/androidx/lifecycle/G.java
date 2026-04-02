package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
/* loaded from: classes.dex */
public final class G extends AbstractC0555g {
    final /* synthetic */ H this$0;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC0555g {
        final /* synthetic */ H this$0;

        public a(H h8) {
            this.this$0 = h8;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            H h8 = this.this$0;
            int i7 = h8.f7891a + 1;
            h8.f7891a = i7;
            if (i7 == 1 && h8.f7894d) {
                h8.f.e(EnumC0562n.ON_START);
                h8.f7894d = false;
            }
        }
    }

    public G(H h8) {
        this.this$0 = h8;
    }

    @Override // androidx.lifecycle.AbstractC0555g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = K.f7896b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.j.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((K) findFragmentByTag).f7897a = this.this$0.f7890Y;
        }
    }

    @Override // androidx.lifecycle.AbstractC0555g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        H h8 = this.this$0;
        int i7 = h8.f7892b - 1;
        h8.f7892b = i7;
        if (i7 == 0) {
            Handler handler = h8.f7895e;
            kotlin.jvm.internal.j.b(handler);
            handler.postDelayed(h8.f7889X, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
        F.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0555g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        H h8 = this.this$0;
        int i7 = h8.f7891a - 1;
        h8.f7891a = i7;
        if (i7 == 0 && h8.f7893c) {
            h8.f.e(EnumC0562n.ON_STOP);
            h8.f7894d = true;
        }
    }
}
