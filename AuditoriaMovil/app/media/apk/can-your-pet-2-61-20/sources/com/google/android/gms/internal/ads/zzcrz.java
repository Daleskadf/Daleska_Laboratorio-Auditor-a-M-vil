package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcrz implements zzhiv {
    private final zzcrt zza;
    private final zzhjm zzb;

    public zzcrz(zzcrt zzcrtVar, zzhjm zzhjmVar) {
        this.zza = zzcrtVar;
        this.zzb = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzs zzn;
        zzcsx zzb = ((zzcsy) this.zzb).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzmi)).booleanValue()) {
            zzn = zzfzs.zzo(new zzdgf(zzb, zzcbr.zza));
        } else {
            zzn = zzfzs.zzn();
        }
        zzhjd.zzb(zzn);
        return zzn;
    }
}
