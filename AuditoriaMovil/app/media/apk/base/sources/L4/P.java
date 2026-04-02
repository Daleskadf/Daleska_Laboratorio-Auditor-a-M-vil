package L4;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public class P extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        String B7 = aVar.B();
        try {
            return K4.d.j(B7);
        } catch (NumberFormatException e7) {
            StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("Failed parsing '", B7, "' as BigDecimal; at path ");
            m7.append(aVar.p());
            throw new RuntimeException(m7.toString(), e7);
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        cVar.w((BigDecimal) obj);
    }
}
