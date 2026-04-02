package L4;

import java.net.URL;
/* loaded from: classes.dex */
public class W extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        String B7 = aVar.B();
        if (B7.equals("null")) {
            return null;
        }
        return new URL(B7);
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String externalForm;
        URL url = (URL) obj;
        if (url == null) {
            externalForm = null;
        } else {
            externalForm = url.toExternalForm();
        }
        cVar.x(externalForm);
    }
}
