package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzil implements Runnable {
    private final /* synthetic */ zznt zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzil(zzhq zzhqVar, zznt zzntVar, zzo zzoVar) {
        this.zza = zzntVar;
        this.zzb = zzoVar;
        this.zzc = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzni zzniVar;
        zzni zzniVar2;
        zzni zzniVar3;
        zzniVar = this.zzc.zza;
        zzniVar.zzr();
        if (this.zza.zza() == null) {
            zzniVar3 = this.zzc.zza;
            zzniVar3.zza(this.zza.zza, this.zzb);
            return;
        }
        zzniVar2 = this.zzc.zza;
        zzniVar2.zza(this.zza, this.zzb);
    }
}
