package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdwi implements zzgea {
    final /* synthetic */ zzdwk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwi(zzdwk zzdwkVar) {
        this.zza = zzdwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        long j;
        zzcbw zzcbwVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdwk zzdwkVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdwkVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzcbwVar = this.zza.zze;
            zzcbwVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdwk zzdwkVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdwkVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwh
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwk.zzj(zzdwi.this.zza, str);
                }
            });
        }
    }
}
