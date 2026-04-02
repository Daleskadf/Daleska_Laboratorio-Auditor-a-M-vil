package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeso implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzeso(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzs zzn;
        zzeto zzb = ((zzetq) this.zza).zzb();
        Context zza = ((zzciq) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzla)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzB(zza)) {
                zzn = zzfzs.zzo(zzb);
                zzhjd.zzb(zzn);
                return zzn;
            }
        }
        zzn = zzfzs.zzn();
        zzhjd.zzb(zzn);
        return zzn;
    }
}
