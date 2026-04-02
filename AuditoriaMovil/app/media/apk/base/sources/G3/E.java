package G3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class E extends AbstractC0114b {
    /* JADX WARN: Type inference failed for: r4v6, types: [G3.E, java.lang.Object] */
    public static E b(j jVar, A.c cVar, Integer num) {
        j jVar2 = j.f1554y;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        } else if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            T3.a aVar = (T3.a) cVar.f4b;
            if (aVar.f5335a.length == 32) {
                if (jVar == jVar2) {
                    T3.a.a(new byte[0]);
                } else if (jVar == j.f1553x) {
                    T3.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                } else if (jVar == j.f1552w) {
                    T3.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown Variant: " + jVar);
                }
                return new Object();
            }
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f5335a.length);
        }
    }
}
