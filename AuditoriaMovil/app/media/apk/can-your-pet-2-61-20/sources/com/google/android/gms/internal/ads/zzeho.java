package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeho implements zzegp {
    private final Context zza;
    private final zzcsm zzb;
    private final Executor zzc;

    public zzeho(Context context, zzcsm zzcsmVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcsmVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, final zzffn zzffnVar, zzegm zzegmVar) throws zzfgp, zzekh {
        final View zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() || !zzffnVar.zzah) {
            zza = ((zzfhg) zzegmVar.zzb).zza();
        } else {
            zzbqx zzc = ((zzfhg) zzegmVar.zzb).zzc();
            if (zzc == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfgp(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfgp(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzehm
                            @Override // com.google.android.gms.internal.ads.zzgdl
                            public final ListenableFuture zza(Object obj) {
                                return zzeho.this.zzc(zza, zzffnVar, obj);
                            }
                        }, zzcbr.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfgp(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfgp(e2);
            }
        }
        zzcsm zzcsmVar = this.zzb;
        zzcul zzculVar = new zzcul(zzffzVar, zzffnVar, zzegmVar.zza);
        final zzfhg zzfhgVar = (zzfhg) zzegmVar.zzb;
        Objects.requireNonNull(zzfhgVar);
        zzcrn zza2 = zzcsmVar.zza(zzculVar, new zzcrt(zza, null, new zzctt() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // com.google.android.gms.internal.ads.zzctt
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfhg.this.zzb();
            }
        }, (zzffo) zzffnVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcpa((zzfhg) zzegmVar.zzb), this.zzc);
        ((zzeif) zzegmVar.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        com.google.android.gms.ads.internal.client.zzq zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = zzffzVar.zza.zza.zze;
        if (zzqVar.zzn) {
            zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb));
        } else {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() || !zzffnVar.zzah) {
                zza = zzfgo.zza(this.zza, zzffnVar.zzv);
            } else {
                zza = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb));
            }
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() || !zzffnVar.zzah) {
            Object obj = zzegmVar.zzb;
            Context context = this.zza;
            zzfgi zzfgiVar = zzffzVar.zza.zza;
            ((zzfhg) obj).zzm(context, zzqVar2, zzfgiVar.zzd, zzffnVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzffnVar.zzt), (zzbqu) zzegmVar.zzc);
            return;
        }
        Object obj2 = zzegmVar.zzb;
        Context context2 = this.zza;
        zzfgi zzfgiVar2 = zzffzVar.zza.zza;
        ((zzfhg) obj2).zzn(context2, zzqVar2, zzfgiVar2.zzd, zzffnVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzffnVar.zzt), (zzbqu) zzegmVar.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(View view, zzffn zzffnVar, Object obj) throws Exception {
        return zzgee.zzh(zzcth.zza(this.zza, view, zzffnVar));
    }
}
