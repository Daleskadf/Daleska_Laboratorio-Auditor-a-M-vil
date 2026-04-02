package G3;

import R3.EnumC0301j0;
import R3.X0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final M3.l f1563a;

    /* renamed from: b  reason: collision with root package name */
    public static final M3.k f1564b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f1565c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f1566d;

    static {
        T3.a b5 = M3.v.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f1563a = new M3.l(k.class);
        f1564b = new M3.k(b5);
        f1565c = new M3.b(C0118f.class);
        f1566d = new M3.a(b5, new A.i(5));
    }

    public static j a(EnumC0301j0 enumC0301j0) {
        int i7 = l.f1562b[enumC0301j0.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            return j.f1537g;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + enumC0301j0.a());
                    }
                    return j.f;
                }
                return j.f1536e;
            }
            return j.f1535d;
        }
        return j.f1534c;
    }

    public static j b(X0 x02) {
        int i7 = l.f1561a[x02.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return j.j;
                }
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
            }
            return j.f1539i;
        }
        return j.f1538h;
    }
}
