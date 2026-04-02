package B4;

import android.app.Activity;
import com.google.android.gms.common.api.internal.C0738l;
import com.google.android.gms.common.api.internal.InterfaceC0739m;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.firebase.firestore.S;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f273c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f274a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Object f275b = new Object();

    public final void a(Object obj) {
        synchronized (this.f275b) {
            try {
                a aVar = (a) this.f274a.get(obj);
                if (aVar != null) {
                    InterfaceC0739m fragment = LifecycleCallback.getFragment(new C0738l(aVar.f269a));
                    b bVar = (b) fragment.d(b.class, "StorageOnStopCallback");
                    if (bVar == null) {
                        bVar = new b(fragment);
                    }
                    bVar.b(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Activity activity, S s7, Object obj) {
        synchronized (this.f275b) {
            a aVar = new a(activity, s7, obj);
            InterfaceC0739m fragment = LifecycleCallback.getFragment(new C0738l(activity));
            b bVar = (b) fragment.d(b.class, "StorageOnStopCallback");
            if (bVar == null) {
                bVar = new b(fragment);
            }
            bVar.a(aVar);
            this.f274a.put(obj, aVar);
        }
    }
}
