package L4;

import java.util.UUID;
/* loaded from: classes.dex */
public class Z extends I4.G {
    @Override // I4.G
    public final Object b(Q4.a aVar) {
        if (aVar.D() == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        String B7 = aVar.B();
        try {
            return UUID.fromString(B7);
        } catch (IllegalArgumentException e7) {
            StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("Failed parsing '", B7, "' as UUID; at path ");
            m7.append(aVar.p());
            throw new RuntimeException(m7.toString(), e7);
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        String uuid;
        UUID uuid2 = (UUID) obj;
        if (uuid2 == null) {
            uuid = null;
        } else {
            uuid = uuid2.toString();
        }
        cVar.x(uuid);
    }
}
