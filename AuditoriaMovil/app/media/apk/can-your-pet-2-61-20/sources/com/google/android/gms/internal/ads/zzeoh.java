package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeoh implements zzeop {
    final /* synthetic */ zzeoi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeoh(zzeoi zzeoiVar) {
        this.zza = zzeoiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeop
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdhl zzdhlVar;
        zzdhl zzdhlVar2 = (zzdhl) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdhlVar2;
            zzdhlVar = this.zza.zzj;
            zzdhlVar.zzj();
        }
    }
}
