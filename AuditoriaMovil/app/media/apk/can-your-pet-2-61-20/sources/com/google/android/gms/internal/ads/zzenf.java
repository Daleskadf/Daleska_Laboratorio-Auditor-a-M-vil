package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzenf implements zzeop {
    final /* synthetic */ zzeng zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenf(zzeng zzengVar) {
        this.zza = zzengVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrm zzcrmVar;
        zzcrm zzcrmVar2;
        zzcrm zzcrmVar3;
        zzcrm zzcrmVar4 = (zzcrm) obj;
        synchronized (this.zza) {
            zzeng zzengVar = this.zza;
            zzcrmVar = zzengVar.zzi;
            if (zzcrmVar != null) {
                zzcrmVar3 = zzengVar.zzi;
                zzcrmVar3.zzb();
            }
            this.zza.zzi = zzcrmVar4;
            zzcrmVar2 = this.zza.zzi;
            zzcrmVar2.zzj();
        }
    }
}
