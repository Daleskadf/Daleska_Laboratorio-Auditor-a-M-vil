package L4;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class n0 extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        return new AtomicBoolean(aVar.t());
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        cVar.y(((AtomicBoolean) obj).get());
    }
}
