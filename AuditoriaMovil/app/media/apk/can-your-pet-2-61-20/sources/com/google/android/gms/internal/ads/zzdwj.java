package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdwj extends zzbmz {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfkw zzd;
    final /* synthetic */ zzcbw zze;
    final /* synthetic */ zzdwk zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwj(zzdwk zzdwkVar, Object obj, String str, long j, zzfkw zzfkwVar, zzcbw zzcbwVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfkwVar;
        this.zze = zzcbwVar;
        this.zzf = zzdwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zze(String str) {
        zzdur zzdurVar;
        zzdfm zzdfmVar;
        zzflk zzflkVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            zzdurVar = this.zzf.zzl;
            zzdurVar.zzb(this.zzb, "error");
            zzdfmVar = this.zzf.zzo;
            zzdfmVar.zzb(this.zzb, "error");
            zzflkVar = this.zzf.zzp;
            zzfkw zzfkwVar = this.zzd;
            zzfkwVar.zzc(str);
            zzfkwVar.zzg(false);
            zzflkVar.zzb(zzfkwVar.zzm());
            this.zze.zzc(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zzf() {
        zzdur zzdurVar;
        zzdfm zzdfmVar;
        zzflk zzflkVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            zzdurVar = this.zzf.zzl;
            zzdurVar.zzd(this.zzb);
            zzdfmVar = this.zzf.zzo;
            zzdfmVar.zzd(this.zzb);
            zzflkVar = this.zzf.zzp;
            zzfkw zzfkwVar = this.zzd;
            zzfkwVar.zzg(true);
            zzflkVar.zzb(zzfkwVar.zzm());
            this.zze.zzc(true);
        }
    }
}
