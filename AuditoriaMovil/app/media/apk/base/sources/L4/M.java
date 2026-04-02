package L4;
/* loaded from: classes.dex */
public class M extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        return Double.valueOf(aVar.u());
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.o();
        } else {
            cVar.t(number.doubleValue());
        }
    }
}
