package L4;
/* loaded from: classes.dex */
public class V extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        return new StringBuffer(aVar.B());
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String stringBuffer;
        StringBuffer stringBuffer2 = (StringBuffer) obj;
        if (stringBuffer2 == null) {
            stringBuffer = null;
        } else {
            stringBuffer = stringBuffer2.toString();
        }
        cVar.x(stringBuffer);
    }
}
