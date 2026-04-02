package a1;

import H0.J;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: a1.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417C {

    /* renamed from: c  reason: collision with root package name */
    public static final C0417C f6749c = new C0417C(0, -9223372036854775807L);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f6750d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a  reason: collision with root package name */
    public final long f6751a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6752b;

    public C0417C(long j, long j8) {
        this.f6751a = j;
        this.f6752b = j8;
    }

    public static C0417C a(String str) {
        long parseFloat;
        long parseFloat2;
        Matcher matcher = f6750d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = z.f6925a;
        if (matches) {
            String group = matcher.group(1);
            if (group != null) {
                int i7 = K0.x.f2529a;
                if (group.equals("now")) {
                    parseFloat = 0;
                } else {
                    parseFloat = Float.parseFloat(group) * 1000.0f;
                }
                String group2 = matcher.group(2);
                if (group2 != null) {
                    try {
                        parseFloat2 = Float.parseFloat(group2) * 1000.0f;
                        if (parseFloat2 < parseFloat) {
                            throw J.b(str, null);
                        }
                    } catch (NumberFormatException e7) {
                        throw J.b(group2, e7);
                    }
                } else {
                    parseFloat2 = -9223372036854775807L;
                }
                return new C0417C(parseFloat, parseFloat2);
            }
            throw J.b(str, null);
        }
        throw J.b(str, null);
    }
}
