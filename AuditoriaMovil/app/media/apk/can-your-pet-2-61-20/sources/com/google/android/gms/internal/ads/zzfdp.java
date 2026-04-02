package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfdp implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzdim zzd;
    final /* synthetic */ zzfdq zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfdp(zzfdq zzfdqVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzdim zzdimVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzdimVar;
        this.zze = zzfdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzflk zzflkVar;
        zzflh zzflhVar;
        Executor executor;
        Executor executor2;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzdB(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzig)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeoa zzeoaVar;
                        zzeoaVar = zzfdp.this.zze.zzd;
                        zzeoaVar.zzdB(zza);
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfeq zzfeqVar;
                        zzfeqVar = zzfdp.this.zze.zze;
                        zzfeqVar.zzdB(zza);
                    }
                });
            }
            zzfhf.zzb(zza.zza, th, "InterstitialAdLoader.onFailure");
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
        zzflk zzflkVar;
        zzflh zzflhVar;
        Executor executor;
        Executor executor2;
        zzeoa zzeoaVar;
        zzfeq zzfeqVar;
        zzdhl zzdhlVar = (zzdhl) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzig)).booleanValue()) {
                zzdcv zzn = zzdhlVar.zzn();
                zzeoaVar = this.zze.zzd;
                zzn.zza(zzeoaVar);
                zzfeqVar = this.zze.zze;
                zzn.zzd(zzfeqVar);
            }
            this.zza.zzb(zzdhlVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzig)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeoa zzeoaVar2;
                        zzeoaVar2 = zzfdp.this.zze.zzd;
                        zzeoaVar2.zzs();
                    }
                });
                executor2 = this.zze.zzb;
                executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfeq zzfeqVar2;
                        zzfeqVar2 = zzfdp.this.zze.zze;
                        zzfeqVar2.zzs();
                    }
                });
            }
            if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
                zzflhVar.zzg(zzdhlVar.zzp().zzb);
                zzflhVar.zzf(zzdhlVar.zzl().zzg());
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzg(true);
                zzflhVar.zza(zzfkwVar);
                zzflhVar.zzh();
            } else {
                zzflkVar = this.zze.zzg;
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzb(zzdhlVar.zzp().zzb);
                zzfkwVar2.zze(zzdhlVar.zzl().zzg());
                zzfkwVar2.zzg(true);
                zzflkVar.zzb(zzfkwVar2.zzm());
            }
        }
    }
}
