package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeim implements zzegj {
    private final Context zza;
    private final zzdri zzb;
    private final zzdim zzc;
    private final zzfgi zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzblb zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziN)).booleanValue();
    private final zzefo zzi;

    public zzeim(Context context, VersionInfoParcel versionInfoParcel, zzfgi zzfgiVar, Executor executor, zzdim zzdimVar, zzdri zzdriVar, zzblb zzblbVar, zzefo zzefoVar) {
        this.zza = context;
        this.zzd = zzfgiVar;
        this.zzc = zzdimVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdriVar;
        this.zzg = zzblbVar;
        this.zzi = zzefoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        final zzdrm zzdrmVar = new zzdrm();
        ListenableFuture zzn = zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzeim.this.zzc(zzffnVar, zzffzVar, zzdrmVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeik
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
        final zzcgm zza = this.zzb.zza(this.zzd.zze, zzffnVar, zzffzVar.zzb.zzb);
        zza.zzaa(zzffnVar.zzX);
        zzdrmVar.zza(this.zza, (View) zza);
        zzcbw zzcbwVar = new zzcbw();
        final zzdhm zze = this.zzc.zze(new zzcul(zzffzVar, zzffnVar, null), new zzdhp(new zzeil(this.zza, this.zzf, zzcbwVar, zzffnVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza));
        zzcbwVar.zzc(zze);
        zze.zzc().zzo(new zzczk() { // from class: com.google.android.gms.internal.ads.zzeih
            @Override // com.google.android.gms.internal.ads.zzczk
            public final void zzr() {
                zzcgm zzcgmVar = zzcgm.this;
                if (zzcgmVar.zzN() != null) {
                    zzcgmVar.zzN().zzr();
                }
            }
        }, zzcbr.zzf);
        zze.zzk().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzk();
        zzffs zzffsVar = zzffnVar.zzt;
        return zzgee.zzm(zzdrh.zzj(zza, zzffsVar.zzb, zzffsVar.zza), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzeii
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj2) {
                zzcgm zzcgmVar = zza;
                if (zzffnVar.zzN) {
                    zzcgmVar.zzaf();
                }
                zzdhm zzdhmVar = zze;
                zzcgmVar.zzZ();
                zzcgmVar.onPause();
                return zzdhmVar.zzg();
            }
        }, this.zze);
    }
}
