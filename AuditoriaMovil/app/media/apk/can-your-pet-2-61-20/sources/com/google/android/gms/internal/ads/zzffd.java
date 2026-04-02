package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzffd implements zzeop {
    final /* synthetic */ zzffe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffd(zzffe zzffeVar) {
        this.zza = zzffeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdqm zzdqmVar;
        zzfga zzfgaVar;
        synchronized (this.zza) {
            this.zza.zzi = (zzdqm) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdt)).booleanValue()) {
                zzfgb zzd = ((zzdqm) obj).zzd();
                zzfgaVar = this.zza.zzd;
                zzd.zza = zzfgaVar;
            }
            zzdqmVar = this.zza.zzi;
            zzdqmVar.zzj();
        }
    }
}
