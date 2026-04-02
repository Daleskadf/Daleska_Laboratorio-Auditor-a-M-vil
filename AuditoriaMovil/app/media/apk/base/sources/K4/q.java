package K4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f2688b;

    public q(Method method) {
        this.f2688b = method;
    }

    @Override // K4.s
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f2688b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e7) {
            throw new RuntimeException("Failed invoking canAccess", e7);
        }
    }
}
