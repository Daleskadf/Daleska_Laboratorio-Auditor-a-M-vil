package G3;

import R3.X0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final M3.l f1588a;

    /* renamed from: b  reason: collision with root package name */
    public static final M3.k f1589b;

    /* renamed from: c  reason: collision with root package name */
    public static final M3.b f1590c;

    /* renamed from: d  reason: collision with root package name */
    public static final M3.a f1591d;

    static {
        T3.a b5 = M3.v.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f1588a = new M3.l(w.class);
        f1589b = new M3.k(b5);
        f1590c = new M3.b(v.class);
        f1591d = new M3.a(b5, new A.i(8));
    }

    public static j a(X0 x02) {
        int i7 = x.f1587a[x02.ordinal()];
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return j.f1548s;
                }
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + x02.b());
            }
            return j.f1547r;
        }
        return j.f1546q;
    }
}
