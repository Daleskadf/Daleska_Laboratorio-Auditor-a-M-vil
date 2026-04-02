package N3;

import M3.v;
import R3.EnumC0301j0;
import R3.X0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final M3.l f3435a;

    /* renamed from: b  reason: collision with root package name */
    public static final M3.k f3436b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f3437c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f3438d;

    static {
        T3.a b5 = v.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f3435a = new M3.l(m.class);
        f3436b = new M3.k(b5);
        f3437c = new M3.b(k.class);
        f3438d = new M3.a(b5, new A.i(28));
    }

    public static d a(EnumC0301j0 enumC0301j0) {
        int i7 = n.f3433a[enumC0301j0.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            return d.f3410k;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + enumC0301j0.a());
                    }
                    return d.j;
                }
                return d.f3409i;
            }
            return d.f3408h;
        }
        return d.f3407g;
    }

    public static d b(X0 x02) {
        int i7 = n.f3434b[x02.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return d.f3414o;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
                }
                return d.f3413n;
            }
            return d.f3412m;
        }
        return d.f3411l;
    }
}
