package L3;

import F3.g;
import V2.k;
import android.content.Context;
import android.preference.PreferenceManager;
import p.Y0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f2907b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final g f2908a;

    public a(Y0 y02) {
        Context context = (Context) y02.f14759a;
        String str = (String) y02.f14760b;
        String str2 = (String) y02.f14761c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f2908a = (g) y02.f14758X;
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public final synchronized k a() {
        return this.f2908a.c();
    }
}
