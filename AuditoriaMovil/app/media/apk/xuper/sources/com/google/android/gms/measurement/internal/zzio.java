package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzio implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzkw zzc;
    final /* synthetic */ zzjm zzd;

    public zzio(zzjm zzjmVar, zzq zzqVar, boolean z10, zzkw zzkwVar) {
        this.zzd = zzjmVar;
        this.zza = zzqVar;
        this.zzb = z10;
        this.zzc = zzkwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzkw zzkwVar;
        zzjm zzjmVar = this.zzd;
        zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            zzjmVar.zzt.zzay().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjm zzjmVar2 = this.zzd;
        if (this.zzb) {
            zzkwVar = null;
        } else {
            zzkwVar = this.zzc;
        }
        zzjmVar2.zzD(zzdxVar, zzkwVar, this.zza);
        this.zzd.zzQ();
    }
}
