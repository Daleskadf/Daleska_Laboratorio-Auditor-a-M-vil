package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzcae {
    static zzcae zza;

    public static synchronized zzcae zzd(Context context) {
        synchronized (zzcae.class) {
            zzcae zzcaeVar = zza;
            if (zzcaeVar != null) {
                return zzcaeVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbdz.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
            zzi.zzq(applicationContext);
            zzbzw zzbzwVar = new zzbzw(null);
            zzbzwVar.zzb(applicationContext);
            zzbzwVar.zzc(com.google.android.gms.ads.internal.zzu.zzB());
            zzbzwVar.zza(zzi);
            zzbzwVar.zzd(com.google.android.gms.ads.internal.zzu.zzn());
            zzcae zze = zzbzwVar.zze();
            zza = zze;
            zze.zza().zza();
            zzcai zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaq)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzp();
                Map zzv = com.google.android.gms.ads.internal.util.zzt.zzv((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzas));
                for (String str : zzv.keySet()) {
                    zzc.zzc(str);
                }
                zzc.zzd(new zzcag(zzc, zzv));
            }
            return zza;
        }
    }

    abstract zzbzp zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zzbzt zzb();

    abstract zzcai zzc();
}
