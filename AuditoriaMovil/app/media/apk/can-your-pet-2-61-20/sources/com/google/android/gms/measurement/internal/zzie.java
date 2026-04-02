package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzoe;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzie implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzie(zzhq zzhqVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzni zzniVar;
        zzni zzniVar2;
        zzniVar = this.zzb.zza;
        zzniVar.zzr();
        zzniVar2 = this.zzb.zza;
        zzo zzoVar = this.zza;
        zzniVar2.zzl().zzt();
        zzniVar2.zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        if (zzniVar2.zze().zza(zzbf.zzcp)) {
            zzniVar2.zzf(zzoVar);
            zzniVar2.zze(zzoVar);
            return;
        }
        zziq zza = zziq.zza(zzoVar.zzt, zzoVar.zzy);
        zziq zzb = zzniVar2.zzb(zzoVar.zza);
        zzniVar2.zzj().zzp().zza("Setting storage consent, package, consent", zzoVar.zza, zza);
        zzniVar2.zza(zzoVar.zza, zza);
        if ((!zzoe.zza() || !zzniVar2.zze().zza(zzbf.zzdf)) && zza.zzc(zzb)) {
            zzniVar2.zzd(zzoVar);
        }
        zzav zza2 = zzav.zza(zzoVar.zzz);
        if (zzav.zza.equals(zza2)) {
            return;
        }
        zzniVar2.zzj().zzp().zza("Setting DMA consent. package, consent", zzoVar.zza, zza2);
        zzniVar2.zza(zzoVar.zza, zza2);
    }
}
