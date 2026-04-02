package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzehk implements zzegj {
    private final zzcsm zza;
    private final Context zzb;
    private final zzdri zzc;
    private final zzfgi zzd;
    private final Executor zze;
    private final zzfwf zzf;

    public zzehk(zzcsm zzcsmVar, Context context, Executor executor, zzdri zzdriVar, zzfgi zzfgiVar, zzfwf zzfwfVar) {
        this.zzb = context;
        this.zza = zzcsmVar;
        this.zze = executor;
        this.zzc = zzdriVar;
        this.zzd = zzfgiVar;
        this.zzf = zzfwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        return zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzehj
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzehk.this.zzc(zzffzVar, zzffnVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        zzffs zzffsVar = zzffnVar.zzt;
        return (zzffsVar == null || zzffsVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(zzffz zzffzVar, zzffn zzffnVar, Object obj) throws Exception {
        View zzdrlVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfgo.zza(this.zzb, zzffnVar.zzv);
        final zzcgm zza2 = this.zzc.zza(zza, zzffnVar, zzffzVar.zzb.zzb);
        zza2.zzaa(zzffnVar.zzX);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() || !zzffnVar.zzah) {
            zzdrlVar = new zzdrl(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzffnVar));
        } else {
            zzdrlVar = zzcth.zza(this.zzb, (View) zza2, zzffnVar);
        }
        zzcsm zzcsmVar = this.zza;
        zzcul zzculVar = new zzcul(zzffzVar, zzffnVar, null);
        Objects.requireNonNull(zza2);
        final zzcrn zza3 = zzcsmVar.zza(zzculVar, new zzcrt(zzdrlVar, zza2, new zzctt() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzctt
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcgm.this.zzq();
            }
        }, zzfgo.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zza3.zzc().zzo(new zzczk() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // com.google.android.gms.internal.ads.zzczk
            public final void zzr() {
                zzcgm zzcgmVar = zzcgm.this;
                if (zzcgmVar.zzN() != null) {
                    zzcgmVar.zzN().zzr();
                }
            }
        }, zzcbr.zzf);
        zza3.zzh();
        zzffs zzffsVar = zzffnVar.zzt;
        ListenableFuture zzj = zzdrh.zzj(zza2, zzffsVar.zzb, zzffsVar.zza);
        if (zzffnVar.zzN) {
            Objects.requireNonNull(zza2);
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehg
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgm.this.zzaf();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehh
            @Override // java.lang.Runnable
            public final void run() {
                zzehk.this.zzd(zza2);
            }
        }, this.zze);
        return zzgee.zzm(zzj, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj2) {
                return zzcrn.this.zza();
            }
        }, zzcbr.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcgm zzcgmVar) {
        zzcgmVar.zzZ();
        zzchm zzq = zzcgmVar.zzq();
        com.google.android.gms.ads.internal.client.zzfk zzfkVar = this.zzd.zza;
        if (zzfkVar != null && zzq != null) {
            zzq.zzs(zzfkVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbi)).booleanValue() || zzcgmVar.isAttachedToWindow()) {
            return;
        }
        zzcgmVar.onPause();
        zzcgmVar.zzas(true);
    }
}
