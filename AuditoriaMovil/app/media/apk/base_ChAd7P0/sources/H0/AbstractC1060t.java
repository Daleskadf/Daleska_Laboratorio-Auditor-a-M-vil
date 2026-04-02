package h0;

import android.view.View;
import android.view.WindowInsets;
/* renamed from: h0.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1060t {
    public static C1036P a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1036P c8 = C1036P.c(null, rootWindowInsets);
        C1035O c1035o = c8.f11172a;
        c1035o.l(c8);
        c1035o.d(view.getRootView());
        return c8;
    }
}
