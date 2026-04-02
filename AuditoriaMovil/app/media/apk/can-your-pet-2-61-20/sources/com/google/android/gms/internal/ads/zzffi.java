package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzffi implements zzeop {
    final /* synthetic */ zzffk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffi(zzffk zzffkVar) {
        this.zza = zzffkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdqm zzdqmVar;
        zzfga zzfgaVar;
        synchronized (this.zza) {
            this.zza.zzd = (zzdqm) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdt)).booleanValue()) {
                zzfgb zzd = ((zzdqm) obj).zzd();
                zzfgaVar = this.zza.zzc;
                zzd.zza = zzfgaVar;
            }
            zzdqmVar = this.zza.zzd;
            zzdqmVar.zzj();
        }
    }
}
