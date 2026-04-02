package L4;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class m0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        try {
            return new AtomicInteger(aVar.v());
        } catch (NumberFormatException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        cVar.u(((AtomicInteger) obj).get());
    }
}
