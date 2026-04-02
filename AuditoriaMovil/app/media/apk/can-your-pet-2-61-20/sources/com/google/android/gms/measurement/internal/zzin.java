package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzin implements Callable<List<zznv>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzhq zzb;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zznv> call() throws Exception {
        zzni zzniVar;
        zzni zzniVar2;
        zzniVar = this.zzb.zza;
        zzniVar.zzr();
        zzniVar2 = this.zzb.zza;
        return zzniVar2.zzf().zzk(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzin(zzhq zzhqVar, String str) {
        this.zza = str;
        this.zzb = zzhqVar;
    }
}
