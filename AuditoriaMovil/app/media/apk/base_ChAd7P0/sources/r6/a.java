package R6;

import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4783a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(E6.a.f1074a);
        j.d(bytes, "this as java.lang.String).getBytes(charset)");
        f4783a = bytes;
    }

    public static final String a(Q6.e eVar, long j) {
        if (j > 0) {
            long j8 = j - 1;
            if (eVar.c(j8) == 13) {
                String q2 = eVar.q(j8, E6.a.f1074a);
                eVar.r(2L);
                return q2;
            }
        }
        String q7 = eVar.q(j, E6.a.f1074a);
        eVar.r(1L);
        return q7;
    }
}
