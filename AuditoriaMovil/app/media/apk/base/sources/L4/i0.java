package L4;
/* loaded from: classes.dex */
public class i0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        return Boolean.valueOf(aVar.B());
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String bool;
        Boolean bool2 = (Boolean) obj;
        if (bool2 == null) {
            bool = "null";
        } else {
            bool = bool2.toString();
        }
        cVar.x(bool);
    }
}
