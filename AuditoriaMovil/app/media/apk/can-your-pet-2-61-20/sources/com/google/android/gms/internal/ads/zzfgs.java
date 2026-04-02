package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfgs implements zzgea {
    final /* synthetic */ zzcgm zza;
    final /* synthetic */ zzcpk zzb;
    final /* synthetic */ zzfmt zzc;
    final /* synthetic */ zzefd zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgs(zzcgm zzcgmVar, zzcpk zzcpkVar, zzfmt zzfmtVar, zzefd zzefdVar) {
        this.zza = zzcgmVar;
        this.zzb = zzcpkVar;
        this.zzc = zzfmtVar;
        this.zzd = zzefdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzaj) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjR)).booleanValue() || this.zzb == null || !zzcpk.zzj(str)) {
                this.zzc.zzc(str, null);
                return;
            } else {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zze());
                return;
            }
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        String str2 = this.zza.zzP().zzb;
        int i = 2;
        if (!com.google.android.gms.ads.internal.zzu.zzo().zzz(this.zza.getContext())) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgr)).booleanValue() || !this.zza.zzD().zzT) {
                i = 1;
            }
        }
        this.zzd.zzd(new zzeff(currentTimeMillis, str2, str, i));
    }
}
