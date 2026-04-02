package com.google.android.gms.internal.p002firebaseauthapi;

import org.apache.tika.utils.StringUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzr  reason: invalid package */
/* loaded from: classes.dex */
public final class zzr {
    private static final zzs zza = new zzu();

    public static zzl zza(String str) {
        zzw.zza(str);
        return zza.zza(str);
    }

    public static String zzb(String str) {
        if (zzd(str)) {
            return null;
        }
        return str;
    }

    public static String zzc(String str) {
        if (str == null) {
            return StringUtils.EMPTY;
        }
        return str;
    }

    public static boolean zzd(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }
}
