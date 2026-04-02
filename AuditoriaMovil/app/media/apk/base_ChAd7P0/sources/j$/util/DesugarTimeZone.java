package j$.util;

import j$.time.ZoneId;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public class DesugarTimeZone {
    public static TimeZone getTimeZone(String str) {
        return TimeZone.getTimeZone(str);
    }

    public static TimeZone getTimeZone(ZoneId zoneId) {
        String n7 = zoneId.n();
        char charAt = n7.charAt(0);
        if (charAt == '+' || charAt == '-') {
            n7 = "GMT".concat(n7);
        } else if (charAt == 'Z' && n7.length() == 1) {
            n7 = "UTC";
        }
        return TimeZone.getTimeZone(n7);
    }
}
