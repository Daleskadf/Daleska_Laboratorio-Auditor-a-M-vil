package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzehu implements zzegp {
    private final Context zza;
    private final zzcsm zzb;
    private View zzc;
    private zzbqx zzd;

    public zzehu(Context context, zzcsm zzcsmVar) {
        this.zza = context;
        this.zzb = zzcsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, final zzffn zzffnVar, final zzegm zzegmVar) throws zzfgp, zzekh {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() && zzffnVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfgp(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzehr
                            @Override // com.google.android.gms.internal.ads.zzgdl
                            public final ListenableFuture zza(Object obj) {
                                return zzehu.this.zzc(view, zzffnVar, obj);
                            }
                        }, zzcbr.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfgp(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfgp(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcrn zza = this.zzb.zza(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzcrt(view, null, new zzctt() { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // com.google.android.gms.internal.ads.zzctt
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                try {
                    return ((zzbsn) zzegm.this.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfgp(e3);
                }
            }
        }, (zzffo) zzffnVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzeif) zzegmVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        try {
            ((zzbsn) zzegmVar.zzb).zzq(zzffnVar.zzaa);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhN)).booleanValue() || !zzffnVar.zzah) {
                ((zzbsn) zzegmVar.zzb).zzj(zzffnVar.zzV, zzffnVar.zzw.toString(), zzffzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeht(this, zzegmVar, null), (zzbqu) zzegmVar.zzc, zzffzVar.zza.zza.zze);
            } else {
                ((zzbsn) zzegmVar.zzb).zzk(zzffnVar.zzV, zzffnVar.zzw.toString(), zzffzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeht(this, zzegmVar, null), (zzbqu) zzegmVar.zzc, zzffzVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfgp(e);
        }
    }

    public final /* synthetic */ ListenableFuture zzc(View view, zzffn zzffnVar, Object obj) throws Exception {
        return zzgee.zzh(zzcth.zza(this.zza, view, zzffnVar));
    }
}
