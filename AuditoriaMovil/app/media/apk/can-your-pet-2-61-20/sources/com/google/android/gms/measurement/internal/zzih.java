package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzih implements Callable<zzaj> {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhq zzb;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzaj call() throws Exception {
        zzni zzniVar;
        zzni zzniVar2;
        zzniVar = this.zzb.zza;
        zzniVar.zzr();
        zzniVar2 = this.zzb.zza;
        return new zzaj(zzniVar2.zza(this.zza.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzih(zzhq zzhqVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhqVar;
    }
}
