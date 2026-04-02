package G3;

import R3.X0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public static final M3.l f1512a;

    /* renamed from: b  reason: collision with root package name */
    public static final M3.k f1513b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f1514c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f1515d;

    static {
        T3.a b5 = M3.v.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f1512a = new M3.l(A.class);
        f1513b = new M3.k(b5);
        f1514c = new M3.b(z.class);
        f1515d = new M3.a(b5, new A.i(9));
    }

    public static j a(X0 x02) {
        int i7 = B.f1511a[x02.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return j.f1551v;
                }
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
            }
            return j.f1550u;
        }
        return j.f1549t;
    }
}
