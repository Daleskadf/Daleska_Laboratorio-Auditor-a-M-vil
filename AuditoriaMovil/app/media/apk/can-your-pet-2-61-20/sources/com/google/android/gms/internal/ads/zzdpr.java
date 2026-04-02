package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdpr implements zzgea {
    final /* synthetic */ zzffn zza;
    final /* synthetic */ zzffq zzb;
    final /* synthetic */ zzcpk zzc;
    final /* synthetic */ zzdpx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpr(zzdpx zzdpxVar, zzffn zzffnVar, zzffq zzffqVar, zzcpk zzcpkVar) {
        this.zza = zzffnVar;
        this.zzb = zzffqVar;
        this.zzc = zzcpkVar;
        this.zzd = zzdpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzefd zzefdVar;
        zzfmt zzfmtVar;
        zzefd zzefdVar2;
        zzduh zzduhVar;
        zzcgm zzcgmVar = (zzcgm) obj;
        zzcgmVar.zzU(this.zza, this.zzb);
        zzcic zzN = zzcgmVar.zzN();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjS)).booleanValue() || zzN == null) {
            return;
        }
        zzcpk zzcpkVar = this.zzc;
        zzdpx zzdpxVar = this.zzd;
        zzefdVar = zzdpxVar.zzj;
        zzfmtVar = zzdpxVar.zzk;
        zzN.zzI(zzcpkVar, zzefdVar, zzfmtVar);
        zzcpk zzcpkVar2 = this.zzc;
        zzdpx zzdpxVar2 = this.zzd;
        zzefdVar2 = zzdpxVar2.zzj;
        zzduhVar = zzdpxVar2.zze;
        zzN.zzK(zzcpkVar2, zzefdVar2, zzduhVar);
    }
}
