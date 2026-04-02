package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfbs implements zzeop {
    final /* synthetic */ zzfbt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfbs(zzfbt zzfbtVar) {
        this.zza = zzfbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbl zzfblVar;
        zzfbl zzfblVar2;
        zzduh zzduhVar;
        zzcrg zzcrgVar = (zzcrg) obj;
        synchronized (this.zza) {
            zzcrg zzcrgVar2 = this.zza.zza;
            if (zzcrgVar2 != null) {
                zzcrgVar2.zzb();
            }
            zzfbt zzfbtVar = this.zza;
            zzfbtVar.zza = zzcrgVar;
            zzcrgVar.zzc(zzfbtVar);
            zzfbt zzfbtVar2 = this.zza;
            zzfblVar = zzfbtVar2.zzg;
            zzfblVar2 = zzfbtVar2.zzg;
            zzduhVar = zzfbtVar2.zzi;
            zzfblVar.zzk(new zzcrh(zzcrgVar, zzfbtVar2, zzfblVar2, zzduhVar));
            zzcrgVar.zzj();
        }
    }
}
