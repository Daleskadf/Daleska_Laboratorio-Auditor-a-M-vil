package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhw implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzhq zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhw(zzhq zzhqVar, String str, String str2, String str3, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
        this.zze = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzni zzniVar;
        zzni zzniVar2;
        if (this.zza == null) {
            zzniVar2 = this.zze.zza;
            zzniVar2.zza(this.zzb, (zzkv) null);
            return;
        }
        zzkv zzkvVar = new zzkv(this.zzc, this.zza, this.zzd);
        zzniVar = this.zze.zza;
        zzniVar.zza(this.zzb, zzkvVar);
    }
}
