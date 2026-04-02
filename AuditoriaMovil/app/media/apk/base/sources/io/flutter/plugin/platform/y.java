package io.flutter.plugin.platform;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class y implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11755a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11756b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11757c;

    public y(View view, m mVar) {
        this.f11756b = view;
        this.f11757c = mVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f11755a) {
            case 0:
                x xVar = new x(this, 0);
                View view2 = (View) this.f11756b;
                view2.getViewTreeObserver().addOnDrawListener(new z(view2, xVar));
                view2.removeOnAttachStateChangeListener(this);
                return;
            default:
                kotlin.jvm.internal.j.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f11757c).get();
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                } else {
                    iBinder = null;
                }
                if (activity != null && iBinder != null) {
                    ((o2.h) this.f11756b).g(iBinder, activity);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f11755a) {
            case 0:
                return;
            default:
                kotlin.jvm.internal.j.e(view, "view");
                return;
        }
    }

    public y(o2.h sidecarCompat, Activity activity) {
        kotlin.jvm.internal.j.e(sidecarCompat, "sidecarCompat");
        this.f11756b = sidecarCompat;
        this.f11757c = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}
