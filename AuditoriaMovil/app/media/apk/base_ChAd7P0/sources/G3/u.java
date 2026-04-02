package G3;

import R3.X0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final M3.l f1581a;

    /* renamed from: b  reason: collision with root package name */
    public static final M3.k f1582b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f1583c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f1584d;

    static {
        T3.a b5 = M3.v.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f1581a = new M3.l(s.class);
        f1582b = new M3.k(b5);
        f1583c = new M3.b(r.class);
        f1584d = new M3.a(b5, new A.i(7));
    }

    public static j a(X0 x02) {
        int i7 = t.f1580a[x02.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return j.f1545p;
                }
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
            }
            return j.f1544o;
        }
        return j.f1543n;
    }
}
