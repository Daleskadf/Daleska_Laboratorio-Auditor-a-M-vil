package com.google.android.gms.internal.mlkit_vision_common;

import java.util.logging.Logger;
/* loaded from: classes.dex */
final class zze {
    private static final Logger zza = Logger.getLogger(zze.class.getName());
    private static final zzd zzb = new zzd(null);

    private zze() {
    }

    public static boolean zza(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }
}
