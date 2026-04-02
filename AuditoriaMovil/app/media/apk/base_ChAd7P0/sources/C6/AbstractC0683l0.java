package c6;

import java.nio.charset.Charset;
import java.util.Locale;
/* renamed from: c6.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0683l0 extends AbstractC0652b {

    /* renamed from: u  reason: collision with root package name */
    public static final a6.c0 f8882u = a6.I.a(":status", new q2(12));

    /* renamed from: q  reason: collision with root package name */
    public a6.o0 f8883q;

    /* renamed from: r  reason: collision with root package name */
    public a6.e0 f8884r;

    /* renamed from: s  reason: collision with root package name */
    public Charset f8885s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8886t;

    public static Charset i(a6.e0 e0Var) {
        String str = (String) e0Var.c(AbstractC0671h0.f8836i);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return z3.h.f16886c;
    }

    public static a6.o0 j(a6.e0 e0Var) {
        char charAt;
        Integer num = (Integer) e0Var.c(f8882u);
        if (num == null) {
            return a6.o0.f7179m.g("Missing HTTP status code");
        }
        String str = (String) e0Var.c(AbstractC0671h0.f8836i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        a6.o0 g3 = AbstractC0671h0.g(num.intValue());
        return g3.a("invalid content-type: " + str);
    }
}
