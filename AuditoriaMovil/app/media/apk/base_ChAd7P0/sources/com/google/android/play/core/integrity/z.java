package com.google.android.play.core.integrity;

import android.content.Context;
/* loaded from: classes.dex */
final class z {

    /* renamed from: a  reason: collision with root package name */
    private static s f9597a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            try {
                if (f9597a == null) {
                    q qVar = new q(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    qVar.a(context);
                    f9597a = qVar.b();
                }
                sVar = f9597a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}
