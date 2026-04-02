package com.google.android.gms.internal.mlkit_vision_common;

import androidx.datastore.preferences.protobuf.Y;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class zzg {
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
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e7);
                    StringBuilder m7 = Y.m("<", str2, " threw ");
                    m7.append(e7.getClass().getName());
                    m7.append(">");
                    sb = m7.toString();
                }
            }
            objArr[i8] = sb;
            i8++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i9 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (indexOf = str.indexOf("%s", i9)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i9, indexOf);
            sb2.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) str, i9, str.length());
        if (i7 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb2.append(", ");
                sb2.append(objArr[i10]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static boolean zzb(String str) {
        return zze.zza(str);
    }
}
