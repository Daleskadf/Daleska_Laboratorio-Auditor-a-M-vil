package L4;

import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class B extends A {

    /* renamed from: b  reason: collision with root package name */
    public final K4.p f2913b;

    public B(K4.p pVar, C c8) {
        super(c8);
        this.f2913b = pVar;
    }

    @Override // L4.A
    public final Object d() {
        return this.f2913b.c();
    }

    @Override // L4.A
    public final void f(Object obj, Q4.a aVar, C0233z c0233z) {
        Object b5 = c0233z.f3023g.b(aVar);
        if (b5 != null || !c0233z.f3024h) {
            Field field = c0233z.f3019b;
            if (c0233z.f3021d) {
                E.a(obj, field);
            } else if (c0233z.f3025i) {
                throw new RuntimeException(io.flutter.plugins.pathprovider.b.h("Cannot set value of 'static final' ", N4.c.d(field, false)));
            }
            field.set(obj, b5);
        }
    }

    @Override // L4.A
    public final Object e(Object obj) {
        return obj;
    }
}
