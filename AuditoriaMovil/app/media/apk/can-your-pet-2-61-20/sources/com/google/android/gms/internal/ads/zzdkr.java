package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdkr implements zzgea {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdkt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkr(zzdkt zzdktVar, String str, boolean z) {
        this.zzb = zzdktVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfd)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdky zzdkyVar;
        zzdky zzdkyVar2;
        zzdkyVar = this.zzb.zze;
        zzdkyVar.zzT((zzcgm) obj);
        zzdkt zzdktVar = this.zzb;
        zzdkyVar2 = zzdktVar.zze;
        zzcbw zzp = zzdkyVar2.zzp();
        zzfmy zzf = zzdktVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
