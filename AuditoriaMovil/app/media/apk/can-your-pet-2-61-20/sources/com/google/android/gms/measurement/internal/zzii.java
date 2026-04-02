package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzii implements Callable<byte[]> {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhq zzc;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzni zzniVar;
        zzni zzniVar2;
        zzniVar = this.zzc.zza;
        zzniVar.zzr();
        zzniVar2 = this.zzc.zza;
        return zzniVar2.zzm().zza(this.zza, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzii(zzhq zzhqVar, zzbd zzbdVar, String str) {
        this.zza = zzbdVar;
        this.zzb = str;
        this.zzc = zzhqVar;
    }
}
