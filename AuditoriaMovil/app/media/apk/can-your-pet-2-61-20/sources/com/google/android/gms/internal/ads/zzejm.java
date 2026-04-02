package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzejm implements zzgea {
    final /* synthetic */ zzffn zza;
    final /* synthetic */ zzejn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejm(zzejn zzejnVar, zzffn zzffnVar) {
        this.zza = zzffnVar;
        this.zzb = zzejnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        zzejo zzejoVar;
        zzejo zzejoVar2;
        zzejo zzejoVar3;
        synchronized (this.zzb) {
            zzejoVar = this.zzb.zzh;
            zzejoVar.zzb(th, this.zza);
            zzejoVar2 = this.zzb.zzh;
            if (zzejoVar2.zze()) {
                zzejn zzejnVar = this.zzb;
                zzejoVar3 = zzejnVar.zzh;
                zzejnVar.zze(zzejoVar3.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzejo zzejoVar;
        zzejo zzejoVar2;
        zzejo zzejoVar3;
        zzeke zzekeVar = (zzeke) obj;
        synchronized (this.zzb) {
            zzejoVar = this.zzb.zzh;
            zzejoVar.zzc(zzekeVar, this.zza);
            zzejoVar2 = this.zzb.zzh;
            if (zzejoVar2.zze()) {
                zzejn zzejnVar = this.zzb;
                zzejoVar3 = zzejnVar.zzh;
                zzejnVar.zze(zzejoVar3.zza());
            }
        }
    }
}
