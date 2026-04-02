package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzccc implements zzgea {
    final /* synthetic */ zzcca zza;
    final /* synthetic */ zzcby zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccc(zzccd zzccdVar, zzcca zzccaVar, zzcby zzcbyVar) {
        this.zza = zzccaVar;
        this.zzb = zzcbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
