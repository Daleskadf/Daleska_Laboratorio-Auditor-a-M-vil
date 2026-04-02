package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeow implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzdji zzd;
    final /* synthetic */ zzeox zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeow(zzeox zzeoxVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzdji zzdjiVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzdjiVar;
        this.zze = zzeoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzcik zzcikVar;
        zzflk zzflkVar;
        zzflh zzflhVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdB(zza);
        zzcikVar = this.zze.zzb;
        zzcikVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeov
            @Override // java.lang.Runnable
            public final void run() {
                zzeon zzeonVar;
                zzeonVar = zzeow.this.zze.zzd;
                zzeonVar.zza().zzdB(zza);
            }
        });
        zzfhf.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbfm.zzc.zze()).booleanValue() || (zzflhVar = this.zzb) == null) {
            zzeox zzeoxVar = this.zze;
            zzfkw zzfkwVar = this.zzc;
            zzflkVar = zzeoxVar.zze;
            zzfkwVar.zza(zza);
            zzfkwVar.zzh(th);
            zzfkwVar.zzg(false);
            zzflkVar.zzb(zzfkwVar.zzm());
            return;
        }
        zzflhVar.zzc(zza);
        zzfkw zzfkwVar2 = this.zzc;
        zzfkwVar2.zzh(th);
        zzfkwVar2.zzg(false);
        zzflhVar.zza(zzfkwVar2);
        zzflhVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeon zzeonVar;
        zzcik zzcikVar;
        zzflk zzflkVar;
        zzflh zzflhVar;
        zzctv zzctvVar = (zzctv) obj;
        synchronized (this.zze) {
            zzdcv zzn = zzctvVar.zzn();
            zzeonVar = this.zze.zzd;
            zzn.zza(zzeonVar.zzd());
            this.zza.zzb(zzctvVar);
            zzcikVar = this.zze.zzb;
            zzcikVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeou
                @Override // java.lang.Runnable
                public final void run() {
                    zzeon zzeonVar2;
                    zzeonVar2 = zzeow.this.zze.zzd;
                    zzeonVar2.zzb().zzs();
                }
            });
            if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
                zzflhVar.zzg(zzctvVar.zzp().zzb);
                zzflhVar.zzf(zzctvVar.zzl().zzg());
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzg(true);
                zzflhVar.zza(zzfkwVar);
                zzflhVar.zzh();
            } else {
                zzflkVar = this.zze.zze;
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzb(zzctvVar.zzp().zzb);
                zzfkwVar2.zze(zzctvVar.zzl().zzg());
                zzfkwVar2.zzg(true);
                zzflkVar.zzb(zzfkwVar2.zzm());
            }
        }
    }
}
