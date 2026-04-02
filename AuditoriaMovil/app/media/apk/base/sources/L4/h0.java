package L4;
/* loaded from: classes.dex */
public class h0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        Q4.b D4 = aVar.D();
        if (D4 == Q4.b.NULL) {
            aVar.z();
            return null;
        } else if (D4 == Q4.b.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.B()));
        } else {
            return Boolean.valueOf(aVar.t());
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        cVar.v((Boolean) obj);
    }
}
