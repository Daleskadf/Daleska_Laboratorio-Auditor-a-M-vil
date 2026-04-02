package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcvn implements zzhiv {
    private final zzhjm zza;

    public zzcvn(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzs zzn;
        zzcwa zzcwaVar = (zzcwa) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfE)).booleanValue()) {
            zzn = zzfzs.zzo(new zzdgf(zzcwaVar, zzcbr.zzf));
        } else {
            zzn = zzfzs.zzn();
        }
        zzhjd.zzb(zzn);
        return zzn;
    }
}
