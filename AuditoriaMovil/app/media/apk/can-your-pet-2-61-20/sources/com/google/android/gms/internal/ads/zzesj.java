package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzesj implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzesj(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzs zzn;
        zzerr zza = zzert.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdX)).booleanValue()) {
            zzn = zzfzs.zzo(new zzeuz(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdY)).intValue(), scheduledExecutorService));
        } else {
            zzn = zzfzs.zzn();
        }
        zzhjd.zzb(zzn);
        return zzn;
    }
}
