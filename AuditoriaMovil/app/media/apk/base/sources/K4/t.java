package K4;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f2690b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2691c;

    public t(Method method, Object obj) {
        this.f2690b = method;
        this.f2691c = obj;
    }

    @Override // K4.x
    public final Object a(Class cls) {
        String f = A.f.f(cls);
        if (f == null) {
            return this.f2690b.invoke(this.f2691c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f));
    }
}
