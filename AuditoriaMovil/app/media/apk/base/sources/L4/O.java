package L4;
/* loaded from: classes.dex */
public class O extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        Q4.b D4 = aVar.D();
        if (D4 == Q4.b.NULL) {
            aVar.z();
            return null;
        } else if (D4 == Q4.b.BOOLEAN) {
            return Boolean.toString(aVar.t());
        } else {
            return aVar.B();
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        cVar.x((String) obj);
    }
}
