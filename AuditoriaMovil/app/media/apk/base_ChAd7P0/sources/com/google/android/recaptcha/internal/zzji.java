package com.google.android.recaptcha.internal;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class zzji {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String j;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length = objArr.length;
            if (i8 >= length) {
                break;
            }
            Object obj = objArr[i8];
            if (obj == null) {
                j = "null";
            } else {
                try {
                    j = obj.toString();
                } catch (Exception e7) {
                    String A7 = AbstractC0059i.A(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(A7), (Throwable) e7);
                    j = b.j("<", A7, " threw ", e7.getClass().getName(), ">");
                }
            }
            objArr[i8] = j;
            i8++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i9 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (indexOf = str.indexOf("%s", i9)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i9, indexOf);
            sb.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb.append((CharSequence) str, i9, str.length());
        if (i7 < length2) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
