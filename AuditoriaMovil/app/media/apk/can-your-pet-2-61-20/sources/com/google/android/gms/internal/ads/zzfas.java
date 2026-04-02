package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfas implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzfau zzd;
    final /* synthetic */ zzfav zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfas(zzfav zzfavVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzfau zzfauVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzfauVar;
        this.zze = zzfavVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcqw, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzfde zzfdeVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfbl zzfblVar;
        zzcxw zzm;
        zzflk zzflkVar;
        zzflh zzflhVar;
        Executor executor;
        zzfdeVar = this.zze.zze;
        zzcqw zzcqwVar = (zzcqw) zzfdeVar.zzd();
        if (zzcqwVar == null) {
            zza = zzfhk.zzb(th, null);
        } else {
            zza = zzcqwVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcqwVar != null) {
                zzcqwVar.zzc().zzdB(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzif)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfar
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfbl zzfblVar2;
                            zzfblVar2 = zzfas.this.zze.zzd;
                            zzfblVar2.zzdB(zza);
                        }
                    });
                }
            } else {
                zzfblVar = this.zze.zzd;
                zzfblVar.zzdB(zza);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzh();
            }
            zzfhf.zzb(zza.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
                zzflhVar.zzc(zza);
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzh(th);
                zzfkwVar.zzg(false);
                zzflhVar.zza(zzfkwVar);
                zzflhVar.zzh();
            } else {
                zzflkVar = this.zze.zzh;
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zza(zza);
                zzfkwVar2.zzh(th);
                zzfkwVar2.zzg(false);
                zzflkVar.zzb(zzfkwVar2.zzm());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzflk zzflkVar;
        zzflh zzflhVar;
        zzfbl zzfblVar;
        zzctv zzctvVar = (zzctv) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzif)).booleanValue()) {
                zzdcv zzn = zzctvVar.zzn();
                zzfblVar = this.zze.zzd;
                zzn.zzb(zzfblVar);
            }
            this.zza.zzb(zzctvVar);
            if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
                zzflhVar.zzg(zzctvVar.zzp().zzb);
                zzflhVar.zzf(zzctvVar.zzl().zzg());
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzg(true);
                zzflhVar.zza(zzfkwVar);
                zzflhVar.zzh();
            } else {
                zzflkVar = this.zze.zzh;
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzb(zzctvVar.zzp().zzb);
                zzfkwVar2.zze(zzctvVar.zzl().zzg());
                zzfkwVar2.zzg(true);
                zzflkVar.zzb(zzfkwVar2.zzm());
            }
        }
    }
}
