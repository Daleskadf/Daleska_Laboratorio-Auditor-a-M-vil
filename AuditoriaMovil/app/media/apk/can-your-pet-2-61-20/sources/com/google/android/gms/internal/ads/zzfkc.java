package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfkc implements zzgea {
    final /* synthetic */ zzfjs zza;
    final /* synthetic */ zzfke zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfkc(zzfke zzfkeVar, zzfjs zzfjsVar) {
        this.zza = zzfjsVar;
        this.zzb = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzfkg zzfkgVar;
        zzfkgVar = this.zzb.zza.zzd;
        zzfkgVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zzb(Object obj) {
        zzfkg zzfkgVar;
        zzfkgVar = this.zzb.zza.zzd;
        zzfkgVar.zzd(this.zza);
    }
}
