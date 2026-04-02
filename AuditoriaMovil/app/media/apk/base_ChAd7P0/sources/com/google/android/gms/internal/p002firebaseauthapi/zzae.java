package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import io.flutter.plugins.pathprovider.b;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzae  reason: invalid package */
/* loaded from: classes.dex */
public final class zzae {
    public static String zza(String str) {
        return zzr.zzb(str);
    }

    public static String zzb(String str) {
        return zzr.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzr.zzd(str);
    }

    public static String zza(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            objArr[i8] = zza(objArr[i8]);
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i9 = 0;
        while (i7 < objArr.length && (indexOf = valueOf.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) valueOf, i9, indexOf);
            sb.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb.append((CharSequence) valueOf, i9, valueOf.length());
        if (i7 < objArr.length) {
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

    private static String zza(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String A7 = AbstractC0059i.A(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", b.h("Exception during lenientFormat for ", A7), (Throwable) e7);
            return b.j("<", A7, " threw ", e7.getClass().getName(), ">");
        }
    }
}
