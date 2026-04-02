package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeil implements zzdiu {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzffn zzd;
    private final zzcgm zze;
    private final zzfgi zzf;
    private final zzblb zzg;
    private final boolean zzh;
    private final zzefo zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeil(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzffn zzffnVar, zzcgm zzcgmVar, zzfgi zzfgiVar, boolean z, zzblb zzblbVar, zzefo zzefoVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzffnVar;
        this.zze = zzcgmVar;
        this.zzf = zzfgiVar;
        this.zzg = zzblbVar;
        this.zzh = z;
        this.zzi = zzefoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zza(boolean z, Context context, zzczd zzczdVar) {
        zzdhm zzdhmVar = (zzdhm) zzgee.zzq(this.zzc);
        this.zze.zzao(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzu.zzp();
        Context context2 = this.zza;
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zze, com.google.android.gms.ads.internal.util.zzt.zzI(context2), z2 ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzczdVar != null) {
            zzczdVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdij zzh = zzdhmVar.zzh();
        zzcgm zzcgmVar = this.zze;
        zzffn zzffnVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i = zzffnVar.zzR;
        String str = zzffnVar.zzC;
        zzffs zzffsVar = zzffnVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzcgmVar, i, versionInfoParcel, str, zzkVar, zzffsVar.zzb, zzffsVar.zza, this.zzf.zzf, zzczdVar, zzffnVar.zzaj ? this.zzi : null), true);
    }
}
