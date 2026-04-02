package R1;

import H0.J;
import K0.q;
import K0.x;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4680a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(q qVar) {
        qVar.getClass();
        String i7 = qVar.i(z3.h.f16886c);
        if (i7 != null && i7.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i7 = x.f2529a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j8 = j * 1000;
        if (split.length == 2) {
            j8 += Long.parseLong(split[1]);
        }
        return j8 * 1000;
    }

    public static void d(q qVar) {
        int i7 = qVar.f2514b;
        if (a(qVar)) {
            return;
        }
        qVar.G(i7);
        throw J.a(null, "Expected WEBVTT. Got " + qVar.i(z3.h.f16886c));
    }
}
