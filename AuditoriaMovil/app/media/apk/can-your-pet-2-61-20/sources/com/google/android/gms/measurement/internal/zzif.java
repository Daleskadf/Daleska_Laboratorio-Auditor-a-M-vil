package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzif implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzif(zzhq zzhqVar, zzo zzoVar) {
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
        zzniVar2.zzd(this.zza);
    }
}
