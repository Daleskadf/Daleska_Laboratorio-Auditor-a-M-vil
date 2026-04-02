package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhy implements Runnable {
    private final /* synthetic */ zzae zza;
    private final /* synthetic */ zzhq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhy(zzhq zzhqVar, zzae zzaeVar) {
        this.zza = zzaeVar;
        this.zzb = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzni zzniVar;
        zzni zzniVar2;
        zzni zzniVar3;
        zzniVar = this.zzb.zza;
        zzniVar.zzr();
        if (this.zza.zzc.zza() == null) {
            zzniVar3 = this.zzb.zza;
            zzniVar3.zza(this.zza);
            return;
        }
        zzniVar2 = this.zzb.zza;
        zzniVar2.zzb(this.zza);
    }
}
