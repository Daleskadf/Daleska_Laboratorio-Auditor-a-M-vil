package L4;

import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes.dex */
public class X extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        try {
            String B7 = aVar.B();
            if (B7.equals("null")) {
                return null;
            }
            return new URI(B7);
        } catch (URISyntaxException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        cVar.x(aSCIIString);
    }
}
