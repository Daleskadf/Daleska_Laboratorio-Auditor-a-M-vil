package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcui implements zzgea {
    final /* synthetic */ zzgea zza;
    final /* synthetic */ zzcuk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcui(zzcuk zzcukVar, zzgea zzgeaVar) {
        this.zza = zzgeaVar;
        this.zzb = zzcukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcue
            @Override // java.lang.Runnable
            public final void run() {
                zzcuk.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuk.zzb(this.zzb, ((zzcud) obj).zza, this.zza);
    }
}
