package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhz implements Runnable {
    private final /* synthetic */ zzae zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhz(zzhq zzhqVar, zzae zzaeVar, zzo zzoVar) {
        this.zza = zzaeVar;
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
        if (this.zza.zzc.zza() == null) {
            zzniVar3 = this.zzc.zza;
            zzniVar3.zza(this.zza, this.zzb);
            return;
        }
        zzniVar2 = this.zzc.zza;
        zzniVar2.zzb(this.zza, this.zzb);
    }
}
