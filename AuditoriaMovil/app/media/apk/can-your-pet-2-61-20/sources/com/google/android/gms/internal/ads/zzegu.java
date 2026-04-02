package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzegu implements zzegj {
    private final zzcra zza;
    private final Context zzb;
    private final zzdri zzc;
    private final zzfgi zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzblb zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziN)).booleanValue();
    private final zzefo zzi;

    public zzegu(zzcra zzcraVar, Context context, Executor executor, zzdri zzdriVar, zzfgi zzfgiVar, VersionInfoParcel versionInfoParcel, zzblb zzblbVar, zzefo zzefoVar) {
        this.zzb = context;
        this.zza = zzcraVar;
        this.zze = executor;
        this.zzc = zzdriVar;
        this.zzd = zzfgiVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzblbVar;
        this.zzi = zzefoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        final zzdrm zzdrmVar = new zzdrm();
        ListenableFuture zzn = zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzegq
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzegu.this.zzc(zzffnVar, zzffzVar, zzdrmVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegr
            @Override // java.lang.Runnable
            public final void run() {
                zzdrm.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final boolean zzb(zzffz zzffzVar, zzffn zzffnVar) {
        zzffs zzffsVar = zzffnVar.zzt;
        return (zzffsVar == null || zzffsVar.zza == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(final zzffn zzffnVar, zzffz zzffzVar, zzdrm zzdrmVar, Object obj) throws Exception {
        final zzcgm zza = this.zzc.zza(this.zzd.zze, zzffnVar, zzffzVar.zzb.zzb);
        zza.zzaa(zzffnVar.zzX);
        zzdrmVar.zza(this.zzb, (View) zza);
        zzcbw zzcbwVar = new zzcbw();
        final zzcqx zza2 = this.zza.zza(new zzcul(zzffzVar, zzffnVar, null), new zzdhp(new zzegw(this.zzf, zzcbwVar, zzffnVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza), new zzcqy(zzffnVar.zzab));
        zza2.zzh().zzi(zza, false, this.zzh ? this.zzg : null);
        zzcbwVar.zzc(zza2);
        zza2.zzc().zzo(new zzczk() { // from class: com.google.android.gms.internal.ads.zzegs
            @Override // com.google.android.gms.internal.ads.zzczk
            public final void zzr() {
                zzcgm zzcgmVar = zzcgm.this;
                if (zzcgmVar.zzN() != null) {
                    zzcgmVar.zzN().zzr();
                }
            }
        }, zzcbr.zzf);
        zza2.zzh();
        zzffs zzffsVar = zzffnVar.zzt;
        return zzgee.zzm(zzdrh.zzj(zza, zzffsVar.zzb, zzffsVar.zza), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj2) {
                zzcgm zzcgmVar = zza;
                if (zzffnVar.zzN) {
                    zzcgmVar.zzaf();
                }
                zzcqx zzcqxVar = zza2;
                zzcgmVar.zzZ();
                zzcgmVar.onPause();
                return zzcqxVar.zza();
            }
        }, this.zze);
    }
}
