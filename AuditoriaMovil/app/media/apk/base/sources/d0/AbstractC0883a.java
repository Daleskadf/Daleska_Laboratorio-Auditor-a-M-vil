package d0;

import android.os.Build;
import java.util.Locale;
/* renamed from: d0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0883a {
    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            F.d.g(30);
        }
        if (i7 >= 30) {
            F.d.g(31);
        }
        if (i7 >= 30) {
            F.d.g(33);
        }
        if (i7 >= 30) {
            F.d.g(1000000);
        }
    }

    public static final boolean a() {
        Integer num;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33) {
            if (i7 < 32) {
                return false;
            }
            String CODENAME = Build.VERSION.CODENAME;
            kotlin.jvm.internal.j.d(CODENAME, "CODENAME");
            if ("REL".equals(CODENAME)) {
                return false;
            }
            Locale locale = Locale.ROOT;
            String upperCase = CODENAME.toUpperCase(locale);
            kotlin.jvm.internal.j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Integer num2 = null;
            if (upperCase.equals("BAKLAVA")) {
                num = 0;
            } else {
                num = null;
            }
            String upperCase2 = "Tiramisu".toUpperCase(locale);
            kotlin.jvm.internal.j.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (upperCase2.equals("BAKLAVA")) {
                num2 = 0;
            }
            if (num != null && num2 != null) {
                if (num.intValue() < num2.intValue()) {
                    return false;
                }
            } else if (num == null && num2 == null) {
                String upperCase3 = CODENAME.toUpperCase(locale);
                kotlin.jvm.internal.j.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase4 = "Tiramisu".toUpperCase(locale);
                kotlin.jvm.internal.j.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (upperCase3.compareTo(upperCase4) < 0) {
                    return false;
                }
            } else if (num == null) {
                return false;
            }
        }
        return true;
    }
}
