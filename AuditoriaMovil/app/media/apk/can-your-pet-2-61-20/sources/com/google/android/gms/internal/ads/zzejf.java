package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejf implements zzegp {
    private final Context zza;
    private final zzdji zzb;
    private final Executor zzc;

    public zzejf(Context context, zzdji zzdjiVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdjiVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzffz zzffzVar, int i) {
        return zzffzVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp, zzekh {
        zzdky zzah;
        zzbqz zzD = ((zzfhg) zzegmVar.zzb).zzD();
        zzbra zzE = ((zzfhg) zzegmVar.zzb).zzE();
        zzbrd zzd = ((zzfhg) zzegmVar.zzb).zzd();
        if (zzd == null || !zzc(zzffzVar, 6)) {
            if (zzD == null || !zzc(zzffzVar, 6)) {
                if (zzD == null || !zzc(zzffzVar, 2)) {
                    if (zzE == null || !zzc(zzffzVar, 6)) {
                        if (zzE == null || !zzc(zzffzVar, 1)) {
                            throw new zzekh(1, "No native ad mappers");
                        }
                        zzah = zzdky.zzah(zzE);
                    } else {
                        zzah = zzdky.zzaj(zzE);
                    }
                } else {
                    zzah = zzdky.zzag(zzD);
                }
            } else {
                zzah = zzdky.zzai(zzD);
            }
        } else {
            zzah = zzdky.zzt(zzd);
        }
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        if (!zzfgiVar.zzg.contains(Integer.toString(zzah.zzc()))) {
            throw new zzekh(1, "No corresponding native ad listener");
        }
        zzdla zze = this.zzb.zze(new zzcul(zzffzVar, zzffnVar, zzegmVar.zza), new zzdlk(zzah), new zzdnb(zzE, zzD, zzd));
        ((zzeif) zzegmVar.zzc).zzc(zze.zzj());
        zze.zzd().zzo(new zzcpa((zzfhg) zzegmVar.zzb), this.zzc);
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegp
    public final void zzb(zzffz zzffzVar, zzffn zzffnVar, zzegm zzegmVar) throws zzfgp {
        zzfhg zzfhgVar = (zzfhg) zzegmVar.zzb;
        zzfgi zzfgiVar = zzffzVar.zza.zza;
        zzfgi zzfgiVar2 = zzffzVar.zza.zza;
        zzbgt zzbgtVar = zzfgiVar2.zzi;
        zzfhgVar.zzp(this.zza, zzfgiVar.zzd, zzffnVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzffnVar.zzt), (zzbqu) zzegmVar.zzc, zzbgtVar, zzfgiVar2.zzg);
    }
}
