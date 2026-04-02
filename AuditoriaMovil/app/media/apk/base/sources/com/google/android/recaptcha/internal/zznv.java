package com.google.android.recaptcha.internal;

import java.util.List;
/* loaded from: classes.dex */
final class zznv {
    public static final List zza(Object obj, long j) {
        int i7;
        zznk zznkVar = (zznk) zzps.zzf(obj, j);
        if (!zznkVar.zzc()) {
            int size = zznkVar.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size + size;
            }
            zznk zzd = zznkVar.zzd(i7);
            zzps.zzs(obj, j, zzd);
            return zzd;
        }
        return zznkVar;
    }
}
