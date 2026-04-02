package G3;

import R3.X0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final M3.l f1572a;

    /* renamed from: b  reason: collision with root package name */
    public static final M3.k f1573b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f1574c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f1575d;

    static {
        T3.a b5 = M3.v.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f1572a = new M3.l(o.class);
        f1573b = new M3.k(b5);
        f1574c = new M3.b(n.class);
        f1575d = new M3.a(b5, new A.i(6));
    }

    public static j a(X0 x02) {
        int i7 = p.f1571a[x02.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return j.f1542m;
                }
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
            }
            return j.f1541l;
        }
        return j.f1540k;
    }
}
