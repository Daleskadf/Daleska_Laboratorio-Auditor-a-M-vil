package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjb implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaw zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjm zze;

    public zzjb(zzjm zzjmVar, boolean z10, zzq zzqVar, boolean z11, zzaw zzawVar, String str) {
        this.zze = zzjmVar;
        this.zza = zzqVar;
        this.zzb = z11;
        this.zzc = zzawVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzaw zzawVar;
        zzjm zzjmVar = this.zze;
        zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            zzjmVar.zzt.zzay().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjm zzjmVar2 = this.zze;
        if (this.zzb) {
            zzawVar = null;
        } else {
            zzawVar = this.zzc;
        }
        zzjmVar2.zzD(zzdxVar, zzawVar, this.zza);
        this.zze.zzQ();
    }
}
