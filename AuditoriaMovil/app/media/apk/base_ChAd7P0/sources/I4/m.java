package I4;
/* loaded from: classes.dex */
public class m extends L4.F {

    /* renamed from: a  reason: collision with root package name */
    public G f2208a = null;

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        G g3 = this.f2208a;
        if (g3 != null) {
            return g3.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        G g3 = this.f2208a;
        if (g3 != null) {
            g3.c(cVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // L4.F
    public final G d() {
        G g3 = this.f2208a;
        if (g3 != null) {
            return g3;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
