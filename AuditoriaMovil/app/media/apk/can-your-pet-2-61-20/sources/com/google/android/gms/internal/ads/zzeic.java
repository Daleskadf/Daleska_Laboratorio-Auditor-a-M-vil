package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeic implements zzgea {
    final /* synthetic */ zzeid zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeic(zzeid zzeidVar) {
        this.zza = zzeidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzcsm zzcsmVar;
        zzcys zzcysVar;
        zzcsmVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcsmVar.zzd().zza(th);
        zzcysVar = this.zza.zzd;
        zzcysVar.zzdB(zza);
        zzfhf.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcrm) obj).zzj();
    }
}
