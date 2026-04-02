package L4;

import java.util.Map;
/* loaded from: classes.dex */
public abstract class A extends I4.G {

    /* renamed from: a  reason: collision with root package name */
    public final C f2912a;

    public A(C c8) {
        this.f2912a = c8;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        Object d7 = d();
        Map map = this.f2912a.f2915a;
        try {
            aVar.b();
            while (aVar.q()) {
                C0233z c0233z = (C0233z) map.get(aVar.x());
                if (c0233z == null) {
                    aVar.K();
                } else {
                    f(d7, aVar, c0233z);
                }
            }
            aVar.j();
            return e(d7);
        } catch (IllegalAccessException e7) {
            org.slf4j.helpers.i iVar = N4.c.f3448a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalStateException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        if (obj == null) {
            cVar.o();
            return;
        }
        cVar.c();
        try {
            for (C0233z c0233z : this.f2912a.f2916b) {
                c0233z.a(cVar, obj);
            }
            cVar.j();
        } catch (IllegalAccessException e7) {
            org.slf4j.helpers.i iVar = N4.c.f3448a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, Q4.a aVar, C0233z c0233z);
}
