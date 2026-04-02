package x5;

import B5.AbstractActivityC0032e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import t4.RunnableC1822b;
import w.AbstractC1916a;
/* renamed from: x5.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2003e extends BroadcastReceiver implements L5.i {

    /* renamed from: e  reason: collision with root package name */
    public static final IntentFilter f16506e = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0032e f16507a;

    /* renamed from: b  reason: collision with root package name */
    public L5.h f16508b;

    /* renamed from: c  reason: collision with root package name */
    public K5.h f16509c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16510d;

    public C2003e(AbstractActivityC0032e activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        this.f16507a = activity;
    }

    @Override // L5.i
    public final void a(Object obj, L5.h hVar) {
        this.f16508b = hVar;
    }

    @Override // L5.i
    public final void b() {
        this.f16508b = null;
    }

    public final K5.h c() {
        Display defaultDisplay;
        int i7 = Build.VERSION.SDK_INT;
        AbstractActivityC0032e abstractActivityC0032e = this.f16507a;
        if (i7 >= 30) {
            defaultDisplay = AbstractC1916a.c(abstractActivityC0032e);
            kotlin.jvm.internal.j.b(defaultDisplay);
        } else {
            Object systemService = abstractActivityC0032e.getSystemService("window");
            kotlin.jvm.internal.j.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            kotlin.jvm.internal.j.d(defaultDisplay, "{\n            (activity.….defaultDisplay\n        }");
        }
        int rotation = defaultDisplay.getRotation();
        int i8 = abstractActivityC0032e.getResources().getConfiguration().orientation;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    return K5.h.PORTRAIT_UP;
                }
                if (rotation != 0 && rotation != 1) {
                    return K5.h.LANDSCAPE_RIGHT;
                }
                return K5.h.LANDSCAPE_LEFT;
            } else if (rotation != 0 && rotation != 1) {
                return K5.h.PORTRAIT_DOWN;
            } else {
                return K5.h.PORTRAIT_UP;
            }
        }
        return K5.h.PORTRAIT_UP;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        K5.h c8 = c();
        if (c8 != this.f16509c) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1822b(19, this, c8));
        }
        this.f16509c = c8;
    }
}
