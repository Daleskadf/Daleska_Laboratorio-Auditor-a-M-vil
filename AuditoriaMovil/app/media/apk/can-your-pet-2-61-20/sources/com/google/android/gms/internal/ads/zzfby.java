package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfby implements zzgea {
    final /* synthetic */ zzeop zza;
    final /* synthetic */ zzflh zzb;
    final /* synthetic */ zzfkw zzc;
    final /* synthetic */ zzcsm zzd;
    final /* synthetic */ zzfbz zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfby(zzfbz zzfbzVar, zzeop zzeopVar, zzflh zzflhVar, zzfkw zzfkwVar, zzcsm zzcsmVar) {
        this.zza = zzeopVar;
        this.zzb = zzflhVar;
        this.zzc = zzfkwVar;
        this.zzd = zzcsmVar;
        this.zze = zzfbzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzdbf zzdbfVar;
        zzddm zzddmVar;
        zzflk zzflkVar;
        zzflh zzflhVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzdB(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzie)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeoa zzeoaVar;
                        zzeoaVar = zzfby.this.zze.zzd;
                        zzeoaVar.zzdB(zza);
                    }
                });
            }
            zzfbz zzfbzVar = this.zze;
            zzdbfVar = zzfbzVar.zzh;
            zzddmVar = zzfbzVar.zzj;
            zzdbfVar.zzd(zzddmVar.zzc());
            zzfhf.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
                zzflhVar.zzc(zza);
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzh(th);
                zzfkwVar.zzg(false);
                zzflhVar.zza(zzfkwVar);
                zzflhVar.zzh();
            } else {
                zzflkVar = this.zze.zzi;
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzdbf zzdbfVar;
        zzflk zzflkVar;
        zzflh zzflhVar;
        Executor executor;
        final zzeoa zzeoaVar;
        zzeoa zzeoaVar2;
        zzeoe zzeoeVar;
        zzcrm zzcrmVar = (zzcrm) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcrmVar.zzc() != null) {
                ViewParent parent = zzcrmVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String zzg = zzcrmVar.zzl() != null ? zzcrmVar.zzl().zzg() : "";
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Banner view provided from " + zzg + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcrmVar.zzc());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzie)).booleanValue()) {
                zzdcv zzn = zzcrmVar.zzn();
                zzeoaVar2 = this.zze.zzd;
                zzn.zza(zzeoaVar2);
                zzeoeVar = this.zze.zze;
                zzn.zzc(zzeoeVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcrmVar.zzc());
            this.zza.zzb(zzcrmVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzie)).booleanValue()) {
                zzfbz zzfbzVar = this.zze;
                executor = zzfbzVar.zzb;
                zzeoaVar = zzfbzVar.zzd;
                Objects.requireNonNull(zzeoaVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeoa.this.zzs();
                    }
                });
            }
            zzdbfVar = this.zze.zzh;
            zzdbfVar.zzd(zzcrmVar.zza());
            if (((Boolean) zzbfm.zzc.zze()).booleanValue() && (zzflhVar = this.zzb) != null) {
                zzflhVar.zzg(zzcrmVar.zzp().zzb);
                zzflhVar.zzf(zzcrmVar.zzl().zzg());
                zzfkw zzfkwVar = this.zzc;
                zzfkwVar.zzg(true);
                zzflhVar.zza(zzfkwVar);
                zzflhVar.zzh();
            } else {
                zzflkVar = this.zze.zzi;
                zzfkw zzfkwVar2 = this.zzc;
                zzfkwVar2.zzb(zzcrmVar.zzp().zzb);
                zzfkwVar2.zze(zzcrmVar.zzl().zzg());
                zzfkwVar2.zzg(true);
                zzflkVar.zzb(zzfkwVar2.zzm());
            }
        }
    }
}
