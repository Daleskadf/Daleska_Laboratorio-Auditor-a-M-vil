package S3;

import java.security.SecureRandom;
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final G.b f5258a = new G.b(6);

    public static byte[] a(int i7) {
        byte[] bArr = new byte[i7];
        ((SecureRandom) f5258a.get()).nextBytes(bArr);
        return bArr;
    }
}
