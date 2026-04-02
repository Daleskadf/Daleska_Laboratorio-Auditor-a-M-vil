package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfdq implements zzeoq {
    private final Context zza;
    private final Executor zzb;
    private final zzcik zzc;
    private final zzeoa zzd;
    private final zzfeq zze;
    private zzbeu zzf;
    private final zzflk zzg;
    private final zzfgg zzh;
    private ListenableFuture zzi;

    public zzfdq(Context context, Executor executor, zzcik zzcikVar, zzeoa zzeoaVar, zzfeq zzfeqVar, zzfgg zzfggVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcikVar;
        this.zzd = zzeoaVar;
        this.zzh = zzfggVar;
        this.zze = zzfeqVar;
        this.zzg = zzcikVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoo zzeooVar, zzeop zzeopVar) {
        zzdim zzf;
        zzflh zzflhVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdk
                @Override // java.lang.Runnable
                public final void run() {
                    zzfdq.this.zzh();
                }
            });
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfdj) zzeooVar).zza;
            Bundle zza = zzdts.zza(new Pair(zzdtq.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdtq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
            zzfgg zzfggVar = this.zzh;
            zzfggVar.zzt(str);
            zzfggVar.zzs(zzqVar);
            zzfggVar.zzG(zzlVar);
            zzfggVar.zzz(zza);
            Context context = this.zza;
            zzfgi zzI = zzfggVar.zzI();
            zzfkw zzb = zzfkv.zzb(context, zzflg.zza(zzI), zzflq.FORMAT_INTERSTITIAL, zzlVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzig)).booleanValue()) {
                zzdil zzg = this.zzc.zzg();
                zzcxy zzcxyVar = new zzcxy();
                zzcxyVar.zze(this.zza);
                zzcxyVar.zzi(zzI);
                zzg.zze(zzcxyVar.zzj());
                zzdef zzdefVar = new zzdef();
                zzdefVar.zzj(this.zzd, this.zzb);
                zzdefVar.zzk(this.zzd, this.zzb);
                zzg.zzd(zzdefVar.zzn());
                zzg.zzc(new zzemj(this.zzf));
                zzf = zzg.zzf();
            } else {
                zzdef zzdefVar2 = new zzdef();
                zzfeq zzfeqVar = this.zze;
                if (zzfeqVar != null) {
                    zzdefVar2.zze(zzfeqVar, this.zzb);
                    zzdefVar2.zzf(this.zze, this.zzb);
                    zzdefVar2.zzb(this.zze, this.zzb);
                }
                zzdil zzg2 = this.zzc.zzg();
                zzcxy zzcxyVar2 = new zzcxy();
                zzcxyVar2.zze(this.zza);
                zzcxyVar2.zzi(zzI);
                zzg2.zze(zzcxyVar2.zzj());
                zzdefVar2.zzj(this.zzd, this.zzb);
                zzdefVar2.zze(this.zzd, this.zzb);
                zzdefVar2.zzf(this.zzd, this.zzb);
                zzdefVar2.zzb(this.zzd, this.zzb);
                zzdefVar2.zza(this.zzd, this.zzb);
                zzdefVar2.zzl(this.zzd, this.zzb);
                zzdefVar2.zzk(this.zzd, this.zzb);
                zzdefVar2.zzi(this.zzd, this.zzb);
                zzdefVar2.zzc(this.zzd, this.zzb);
                zzg2.zzd(zzdefVar2.zzn());
                zzg2.zzc(new zzemj(this.zzf));
                zzf = zzg2.zzf();
            }
            zzdim zzdimVar = zzf;
            if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
                zzflh zzf2 = zzdimVar.zzf();
                zzf2.zzd(zzflq.FORMAT_INTERSTITIAL);
                zzf2.zzb(zzlVar.zzp);
                zzflhVar = zzf2;
            } else {
                zzflhVar = null;
            }
            zzcvd zza2 = zzdimVar.zza();
            ListenableFuture zzi = zza2.zzi(zza2.zzj());
            this.zzi = zzi;
            zzgee.zzr(zzi, new zzfdp(this, zzeopVar, zzflhVar, zzb, zzdimVar), this.zzb);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zzdB(zzfhk.zzd(6, null, null));
    }

    public final void zzi(zzbeu zzbeuVar) {
        this.zzf = zzbeuVar;
    }
}
