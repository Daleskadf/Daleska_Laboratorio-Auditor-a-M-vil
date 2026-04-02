package M4;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f3267a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i7, char c8) {
        if (i7 < str.length() && str.charAt(i7) == c8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i7, int i8, String str) {
        int i9;
        int i10;
        if (i7 >= 0 && i8 <= str.length() && i7 <= i8) {
            if (i7 < i8) {
                i10 = i7 + 1;
                int digit = Character.digit(str.charAt(i7), 10);
                if (digit >= 0) {
                    i9 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
                }
            } else {
                i9 = 0;
                i10 = i7;
            }
            while (i10 < i8) {
                int i11 = i10 + 1;
                int digit2 = Character.digit(str.charAt(i10), 10);
                if (digit2 >= 0) {
                    i9 = (i9 * 10) - digit2;
                    i10 = i11;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
                }
            }
            return -i9;
        }
        throw new NumberFormatException(str);
    }
}
