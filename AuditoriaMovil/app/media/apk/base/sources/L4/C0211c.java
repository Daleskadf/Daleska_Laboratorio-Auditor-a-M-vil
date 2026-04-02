package L4;

import java.lang.reflect.Type;
import java.util.Collection;
/* renamed from: L4.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211c extends I4.G {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2941a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2942b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2943c;

    public C0211c(I4.n nVar, Type type, I4.G g3, K4.p pVar) {
        this.f2942b = new I(nVar, g3, type);
        this.f2943c = pVar;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        switch (this.f2941a) {
            case 0:
                if (aVar.D() == Q4.b.NULL) {
                    aVar.z();
                    return null;
                }
                Collection collection = (Collection) ((K4.p) this.f2943c).c();
                aVar.a();
                while (aVar.q()) {
                    collection.add(((I4.G) ((I) this.f2942b).f2936c).b(aVar));
                }
                aVar.g();
                return collection;
            default:
                Object b5 = ((d0) this.f2943c).f2948c.b(aVar);
                if (b5 != null) {
                    Class cls = (Class) this.f2942b;
                    if (!cls.isInstance(b5)) {
                        throw new RuntimeException("Expected a " + cls.getName() + " but was " + b5.getClass().getName() + "; at path " + aVar.p());
                    }
                }
                return b5;
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        switch (this.f2941a) {
            case 0:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    cVar.o();
                    return;
                }
                cVar.b();
                for (Object obj2 : collection) {
                    ((I) this.f2942b).c(cVar, obj2);
                }
                cVar.g();
                return;
            default:
                ((d0) this.f2943c).f2948c.c(cVar, obj);
                return;
        }
    }

    public C0211c(d0 d0Var, Class cls) {
        this.f2943c = d0Var;
        this.f2942b = cls;
    }
}
