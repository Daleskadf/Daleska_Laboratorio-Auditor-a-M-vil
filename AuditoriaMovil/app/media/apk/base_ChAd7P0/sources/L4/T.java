package L4;
/* loaded from: classes.dex */
public class T extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        return new StringBuilder(aVar.B());
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String sb;
        StringBuilder sb2 = (StringBuilder) obj;
        if (sb2 == null) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        cVar.x(sb);
    }
}
