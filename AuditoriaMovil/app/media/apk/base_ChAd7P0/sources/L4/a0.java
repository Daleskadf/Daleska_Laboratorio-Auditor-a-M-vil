package L4;

import java.util.Currency;
/* loaded from: classes.dex */
public class a0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        String B7 = aVar.B();
        try {
            return Currency.getInstance(B7);
        } catch (IllegalArgumentException e7) {
            StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("Failed parsing '", B7, "' as Currency; at path ");
            m7.append(aVar.p());
            throw new RuntimeException(m7.toString(), e7);
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        cVar.x(((Currency) obj).getCurrencyCode());
    }
}
