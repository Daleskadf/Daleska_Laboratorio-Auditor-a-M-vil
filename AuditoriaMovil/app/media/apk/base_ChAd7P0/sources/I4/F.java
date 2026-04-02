package I4;
/* loaded from: classes.dex */
public final class F extends G {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ G f2200a;

    public F(G g3) {
        this.f2200a = g3;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        return this.f2200a.b(aVar);
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        if (obj == null) {
            cVar.o();
        } else {
            this.f2200a.c(cVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f2200a + "]";
    }
}
