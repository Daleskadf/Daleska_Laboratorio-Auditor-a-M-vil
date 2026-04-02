package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzik implements Runnable {
    final /* synthetic */ zzie zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzim zzc;

    public zzik(zzim zzimVar, zzie zzieVar, long j10) {
        this.zzc = zzimVar;
        this.zza = zzieVar;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zzim zzimVar = this.zzc;
        zzimVar.zza = null;
        zzimVar.zzt.zzt().zzG(null);
    }
}
