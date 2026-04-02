package com.google.android.gms.internal.location;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class zzes {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length = objArr.length;
            if (i8 >= length) {
                break;
            }
            Object obj = objArr[i8];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e7) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append("@");
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb3), (Throwable) e7);
                    String name2 = e7.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + sb3.length() + 8 + 1);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i8] = sb;
            i8++;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + (length * 16));
        int i9 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (indexOf = str.indexOf("%s", i9)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i9, indexOf);
            sb5.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb5.append((CharSequence) str, i9, str.length());
        if (i7 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb5.append(", ");
                sb5.append(objArr[i10]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
