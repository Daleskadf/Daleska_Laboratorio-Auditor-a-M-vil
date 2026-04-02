package F6;
/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public static final M f1232a;

    static {
        String str;
        boolean z7;
        M m7;
        int i7 = K6.x.f2808a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z7 = Boolean.parseBoolean(str);
        } else {
            z7 = false;
        }
        if (!z7) {
            m7 = I.f1229e0;
        } else {
            M6.f fVar = P.f1237a;
            x0 x0Var = K6.o.f2797a;
            G6.e eVar = ((G6.e) x0Var).f;
            if (!(x0Var instanceof M)) {
                m7 = I.f1229e0;
            } else {
                m7 = (M) x0Var;
            }
        }
        f1232a = m7;
    }
}
