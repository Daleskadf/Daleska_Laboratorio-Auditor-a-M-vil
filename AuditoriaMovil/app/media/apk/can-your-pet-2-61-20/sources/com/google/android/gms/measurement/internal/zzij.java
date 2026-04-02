package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzij implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzij(zzhq zzhqVar, zzbd zzbdVar, String str) {
        this.zza = zzbdVar;
        this.zzb = str;
        this.zzc = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzni zzniVar;
        zzni zzniVar2;
        zzniVar = this.zzc.zza;
        zzniVar.zzr();
        zzniVar2 = this.zzc.zza;
        zzniVar2.zza(this.zza, this.zzb);
    }
}
