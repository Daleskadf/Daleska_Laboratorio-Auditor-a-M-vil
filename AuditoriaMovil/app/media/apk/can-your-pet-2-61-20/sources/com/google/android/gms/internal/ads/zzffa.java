package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzffa implements zzeoq {
    private final Context zza;
    private final Executor zzb;
    private final zzcik zzc;
    private final zzfeq zzd;
    private final zzfde zze;
    private final zzfga zzf;
    private final zzflk zzg;
    private final zzfgg zzh;
    private ListenableFuture zzi;

    public zzffa(Context context, Executor executor, zzcik zzcikVar, zzfde zzfdeVar, zzfeq zzfeqVar, zzfgg zzfggVar, zzfga zzfgaVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcikVar;
        this.zze = zzfdeVar;
        this.zzd = zzfeqVar;
        this.zzh = zzfggVar;
        this.zzf = zzfgaVar;
        this.zzg = zzcikVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdqq zzk(zzfdc zzfdcVar) {
        zzdqq zzi = this.zzc.zzi();
        zzcxy zzcxyVar = new zzcxy();
        zzcxyVar.zze(this.zza);
        zzcxyVar.zzi(((zzfez) zzfdcVar).zza);
        zzcxyVar.zzh(this.zzf);
        zzi.zzd(zzcxyVar.zzj());
        zzi.zzc(new zzdef().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeoo zzeooVar, zzeop zzeopVar) throws RemoteException {
        zzflh zzflhVar;
        zzbxx zzbxxVar = new zzbxx(zzlVar, str);
        if (zzbxxVar.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfet
                @Override // java.lang.Runnable
                public final void run() {
                    zzffa.this.zzi();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture == null || listenableFuture.isDone()) {
            if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
                zzfde zzfdeVar = this.zze;
                if (zzfdeVar.zzd() != null) {
                    zzflh zzh = ((zzdqr) zzfdeVar.zzd()).zzh();
                    zzh.zzd(zzflq.FORMAT_REWARDED);
                    zzh.zzb(zzbxxVar.zza.zzp);
                    zzflhVar = zzh;
                    zzfhf.zza(this.zza, zzbxxVar.zza.zzf);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue() && zzbxxVar.zza.zzf) {
                        this.zzc.zzl().zzo(true);
                    }
                    Bundle zza = zzdts.zza(new Pair(zzdtq.PUBLIC_API_CALL.zza(), Long.valueOf(zzbxxVar.zza.zzz)), new Pair(zzdtq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
                    zzfgg zzfggVar = this.zzh;
                    zzfggVar.zzt(zzbxxVar.zzb);
                    zzfggVar.zzs(com.google.android.gms.ads.internal.client.zzq.zzd());
                    zzfggVar.zzG(zzbxxVar.zza);
                    zzfggVar.zzz(zza);
                    Context context = this.zza;
                    zzfgi zzI = zzfggVar.zzI();
                    zzfkw zzb = zzfkv.zzb(context, zzflg.zza(zzI), zzflq.FORMAT_REWARDED, zzbxxVar.zza);
                    zzfez zzfezVar = new zzfez(null);
                    zzfezVar.zza = zzI;
                    ListenableFuture zzc = this.zze.zzc(new zzfdf(zzfezVar, null), new zzfdd() { // from class: com.google.android.gms.internal.ads.zzfeu
                        @Override // com.google.android.gms.internal.ads.zzfdd
                        public final zzcxw zza(zzfdc zzfdcVar) {
                            zzdqq zzk;
                            zzk = zzffa.this.zzk(zzfdcVar);
                            return zzk;
                        }
                    }, null);
                    this.zzi = zzc;
                    zzgee.zzr(zzc, new zzfex(this, zzeopVar, zzflhVar, zzb, zzfezVar), this.zzb);
                    return true;
                }
            }
            zzflhVar = null;
            zzfhf.zza(this.zza, zzbxxVar.zza.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue()) {
                this.zzc.zzl().zzo(true);
            }
            Bundle zza2 = zzdts.zza(new Pair(zzdtq.PUBLIC_API_CALL.zza(), Long.valueOf(zzbxxVar.zza.zzz)), new Pair(zzdtq.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
            zzfgg zzfggVar2 = this.zzh;
            zzfggVar2.zzt(zzbxxVar.zzb);
            zzfggVar2.zzs(com.google.android.gms.ads.internal.client.zzq.zzd());
            zzfggVar2.zzG(zzbxxVar.zza);
            zzfggVar2.zzz(zza2);
            Context context2 = this.zza;
            zzfgi zzI2 = zzfggVar2.zzI();
            zzfkw zzb2 = zzfkv.zzb(context2, zzflg.zza(zzI2), zzflq.FORMAT_REWARDED, zzbxxVar.zza);
            zzfez zzfezVar2 = new zzfez(null);
            zzfezVar2.zza = zzI2;
            ListenableFuture zzc2 = this.zze.zzc(new zzfdf(zzfezVar2, null), new zzfdd() { // from class: com.google.android.gms.internal.ads.zzfeu
                @Override // com.google.android.gms.internal.ads.zzfdd
                public final zzcxw zza(zzfdc zzfdcVar) {
                    zzdqq zzk;
                    zzk = zzffa.this.zzk(zzfdcVar);
                    return zzk;
                }
            }, null);
            this.zzi = zzc2;
            zzgee.zzr(zzc2, new zzfex(this, zzeopVar, zzflhVar, zzb2, zzfezVar2), this.zzb);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zzdB(zzfhk.zzd(6, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}
