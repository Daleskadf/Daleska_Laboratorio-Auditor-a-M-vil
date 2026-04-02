package K4;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class v extends x {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f2694b;

    public v(Method method) {
        this.f2694b = method;
    }

    @Override // K4.x
    public final Object a(Class cls) {
        String f = A.f.f(cls);
        if (f == null) {
            return this.f2694b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f));
    }
}
