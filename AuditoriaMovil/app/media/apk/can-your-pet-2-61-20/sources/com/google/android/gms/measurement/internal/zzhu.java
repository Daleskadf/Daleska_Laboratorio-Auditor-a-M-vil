package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhu implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhu(zzhq zzhqVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzni zzniVar;
        zzni zzniVar2;
        zzniVar = this.zzb.zza;
        zzniVar.zzr();
        zzniVar2 = this.zzb.zza;
        zzo zzoVar = this.zza;
        zzniVar2.zzl().zzt();
        zzniVar2.zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        zzniVar2.zza(zzoVar);
    }
}
