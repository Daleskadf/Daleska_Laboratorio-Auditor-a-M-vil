package N3;

import M3.v;
import R3.X0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final M3.l f3421a;

    /* renamed from: b  reason: collision with root package name */
    public static final M3.k f3422b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f3423c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f3424d;

    static {
        T3.a b5 = v.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f3421a = new M3.l(e.class);
        f3422b = new M3.k(b5);
        f3423c = new M3.b(a.class);
        f3424d = new M3.a(b5, new A.i(26));
    }

    public static d a(X0 x02) {
        int i7 = f.f3420a[x02.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return d.f;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
                }
                return d.f3406e;
            }
            return d.f3405d;
        }
        return d.f3404c;
    }
}
