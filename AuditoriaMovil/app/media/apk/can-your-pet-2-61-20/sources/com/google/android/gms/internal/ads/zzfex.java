package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfex implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzfez zzd;
    final /* synthetic */ zzffa zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfex(zzffa zzffaVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzfez zzfezVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzfezVar;
        this.zze = zzffaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzfde zzfdeVar;
        final com.google.android.gms.ads.internal.client.zze zza;
        zzfeq zzfeqVar;
        zzdqq zzk;
        zzflk zzflkVar;
        zzflh zzflhVar;
        Executor executor;
        zzfdeVar = this.zze.zze;
        zzdqr zzdqrVar = (zzdqr) zzfdeVar.zzd();
        if (zzdqrVar == null) {
            zza = zzfhk.zzb(th, null);
        } else {
            zza = zzdqrVar.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdqrVar != null) {
                zzdqrVar.zza().zzdB(zza);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfev
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfeq zzfeqVar2;
                        zzfeqVar2 = zzfex.this.zze.zzd;
                        zzfeqVar2.zzdB(zza);
                    }
                });
            } else {
                zzfeqVar = this.zze.zzd;
                zzfeqVar.zzdB(zza);
                zzk = this.zze.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzh();
            }
            zzfhf.zzb(zza.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
                zzflhVar.zzc(zza);
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzh(th);
                zzfkwVar.zzg(false);
                zzflhVar.zza(zzfkwVar);
                zzflhVar.zzh();
            } else {
                zzflkVar = this.zze.zzg;
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
        zzfeq zzfeqVar;
        Executor executor;
        final zzfeq zzfeqVar2;
        zzfeq zzfeqVar3;
        zzflk zzflkVar;
        zzflh zzflhVar;
        zzdqm zzdqmVar = (zzdqm) obj;
        synchronized (this.zze) {
            zzdcv zzn = zzdqmVar.zzn();
            zzfeqVar = this.zze.zzd;
            zzn.zzd(zzfeqVar);
            this.zza.zzb(zzdqmVar);
            zzffa zzffaVar = this.zze;
            executor = zzffaVar.zzb;
            zzfeqVar2 = zzffaVar.zzd;
            Objects.requireNonNull(zzfeqVar2);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfew
                @Override // java.lang.Runnable
                public final void run() {
                    zzfeq.this.zzs();
                }
            });
            zzfeqVar3 = this.zze.zzd;
            zzfeqVar3.onAdMetadataChanged();
            if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
                zzflhVar.zzg(zzdqmVar.zzp().zzb);
                zzflhVar.zzf(zzdqmVar.zzl().zzg());
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzg(true);
                zzflhVar.zza(zzfkwVar);
                zzflhVar.zzh();
            } else {
                zzflkVar = this.zze.zzg;
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzb(zzdqmVar.zzp().zzb);
                zzfkwVar2.zze(zzdqmVar.zzl().zzg());
                zzfkwVar2.zzg(true);
                zzflkVar.zzb(zzfkwVar2.zzm());
            }
        }
    }
}
