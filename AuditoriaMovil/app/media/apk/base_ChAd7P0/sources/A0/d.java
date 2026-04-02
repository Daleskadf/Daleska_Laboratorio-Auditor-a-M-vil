package A0;

import android.util.Log;
import kotlin.jvm.internal.j;
import z0.AbstractComponentCallbacksC2061v;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f35a = c.f34a;

    public static c a(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        while (abstractComponentCallbacksC2061v != null) {
            if (abstractComponentCallbacksC2061v.q()) {
                abstractComponentCallbacksC2061v.n();
            }
            abstractComponentCallbacksC2061v = abstractComponentCallbacksC2061v.q0;
        }
        return f35a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f33a.getClass().getName()), aVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC2061v fragment, String previousFragmentId) {
        j.e(fragment, "fragment");
        j.e(previousFragmentId, "previousFragmentId");
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
    }
}
