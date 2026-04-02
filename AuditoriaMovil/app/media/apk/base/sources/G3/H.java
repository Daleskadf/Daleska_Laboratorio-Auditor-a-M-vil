package G3;

import R3.X0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final M3.l f1520a;

    /* renamed from: b  reason: collision with root package name */
    public static final M3.k f1521b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f1522c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f1523d;

    static {
        T3.a b5 = M3.v.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f1520a = new M3.l(F.class);
        f1521b = new M3.k(b5);
        f1522c = new M3.b(E.class);
        f1523d = new M3.a(b5, new A.i(10));
    }

    public static j a(X0 x02) {
        int i7 = G.f1519a[x02.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return j.f1554y;
                }
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
            }
            return j.f1553x;
        }
        return j.f1552w;
    }
}
