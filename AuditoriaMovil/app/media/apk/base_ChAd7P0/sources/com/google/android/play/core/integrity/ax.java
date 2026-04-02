package com.google.android.play.core.integrity;

import android.content.Context;
/* loaded from: classes.dex */
final class ax {

    /* renamed from: a  reason: collision with root package name */
    private static aw f9517a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            try {
                if (f9517a == null) {
                    u uVar = new u(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    uVar.a(context);
                    f9517a = uVar.b();
                }
                awVar = f9517a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return awVar;
    }
}
