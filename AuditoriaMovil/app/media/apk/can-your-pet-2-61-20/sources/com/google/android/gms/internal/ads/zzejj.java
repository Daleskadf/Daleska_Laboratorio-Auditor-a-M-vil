package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejj implements zzegp {
    private final Context zza;
    private final zzdji zzb;
    private zzbrd zzc;
    private final VersionInfoParcel zzd;

    public zzejj(Context context, zzdji zzdjiVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdjiVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp, zzekh {
        if (!zzffzVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzekh(2, "Unified must be used for RTB.");
        }
        zzdky zzt = zzdky.zzt(this.zzc);
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        if (!zzfgiVar.zzg.contains(Integer.toString(zzt.zzc()))) {
            throw new zzekh(1, "No corresponding native ad listener");
        }
        zzdla zze = this.zzb.zze(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdlk(zzt), new zzdnb(null, null, this.zzc));
        ((zzeif) zzegmVar.zzc).zzc(zze.zzi());
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        try {
            ((zzbsn) zzegmVar.zzb).zzq(zzffnVar.zzaa);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbH)).intValue()) {
                ((zzbsn) zzegmVar.zzb).zzm(zzffnVar.zzV, zzffnVar.zzw.toString(), zzffzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeji(this, zzegmVar, null), (zzbqu) zzegmVar.zzc);
            } else {
                ((zzbsn) zzegmVar.zzb).zzn(zzffnVar.zzV, zzffnVar.zzw.toString(), zzffzVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeji(this, zzegmVar, null), (zzbqu) zzegmVar.zzc, zzffzVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfgp(e);
        }
    }
}
