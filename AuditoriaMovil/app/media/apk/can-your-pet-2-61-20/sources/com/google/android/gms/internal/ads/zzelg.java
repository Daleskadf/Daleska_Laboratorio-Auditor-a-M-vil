package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzelg implements zzegj {
    private final Context zza;
    private final zzdri zzb;
    private final zzdqr zzc;
    private final zzfgi zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzblb zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziN)).booleanValue();
    private final zzefo zzi;

    public zzelg(Context context, VersionInfoParcel versionInfoParcel, zzfgi zzfgiVar, Executor executor, zzdqr zzdqrVar, zzdri zzdriVar, zzblb zzblbVar, zzefo zzefoVar) {
        this.zza = context;
        this.zzd = zzfgiVar;
        this.zzc = zzdqrVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdriVar;
        this.zzg = zzblbVar;
        this.zzi = zzefoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegj
    public final ListenableFuture zza(final zzffz zzffzVar, final zzffn zzffnVar) {
        final zzdrm zzdrmVar = new zzdrm();
        ListenableFuture zzn = zzgee.zzn(zzgee.zzh(null), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzekz
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzelg.this.zzc(zzffnVar, zzffzVar, zzdrmVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzela
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
        final zzdqn zze = this.zzc.zze(new zzcul(zzffzVar, zzffnVar, null), new zzdqo(new zzelf(this.zza, this.zzb, this.zzd, this.zzf, zzffnVar, zzcbwVar, zza, this.zzg, this.zzh, this.zzi), zza));
        zzcbwVar.zzc(zze);
        zzblq.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzczk() { // from class: com.google.android.gms.internal.ads.zzelb
            @Override // com.google.android.gms.internal.ads.zzczk
            public final void zzr() {
                zzcgm zzcgmVar = zzcgm.this;
                if (zzcgmVar.zzN() != null) {
                    zzcgmVar.zzN().zzr();
                }
            }
        }, zzcbr.zzf);
        zze.zzl().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzl();
        zzffs zzffsVar = zzffnVar.zzt;
        return zzgee.zzm(zzdrh.zzj(zza, zzffsVar.zzb, zzffsVar.zza), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj2) {
                zzcgm zzcgmVar = zza;
                if (zzffnVar.zzN) {
                    zzcgmVar.zzaf();
                }
                zzdqn zzdqnVar = zze;
                zzcgmVar.zzZ();
                zzcgmVar.onPause();
                return zzdqnVar.zzk();
            }
        }, this.zze);
    }
}
