package L4;

import java.net.InetAddress;
/* loaded from: classes.dex */
public class Y extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        return InetAddress.getByName(aVar.B());
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String hostAddress;
        InetAddress inetAddress = (InetAddress) obj;
        if (inetAddress == null) {
            hostAddress = null;
        } else {
            hostAddress = inetAddress.getHostAddress();
        }
        cVar.x(hostAddress);
    }
}
