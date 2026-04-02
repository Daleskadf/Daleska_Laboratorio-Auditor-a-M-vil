package K4;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class u extends x {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f2692b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2693c;

    public u(int i7, Method method) {
        this.f2692b = method;
        this.f2693c = i7;
    }

    @Override // K4.x
    public final Object a(Class cls) {
        String f = A.f.f(cls);
        if (f == null) {
            return this.f2692b.invoke(null, cls, Integer.valueOf(this.f2693c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f));
    }
}
