package com.google.android.recaptcha.internal;

import F6.H;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import n6.d;
/* loaded from: classes.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j, d dVar) {
        return zzcv.zzh(zza(application), str, j, null, null, null, dVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        return zzas.zza(H.c(zza(application).zzd().zza(), new zzco(application, str, j, null)));
    }

    public static final Object zzd(Application application, String str, d dVar) {
        return zzcv.zzf(zza(application), str, null, null, dVar, 6, null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(H.c(zza(application).zzd().zza(), new zzcp(application, str, null)));
    }
}
