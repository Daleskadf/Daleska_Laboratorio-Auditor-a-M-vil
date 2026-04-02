package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzid implements Callable<List<zzae>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzhq zzd;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzae> call() throws Exception {
        zzni zzniVar;
        zzni zzniVar2;
        zzniVar = this.zzd.zza;
        zzniVar.zzr();
        zzniVar2 = this.zzd.zza;
        return zzniVar2.zzf().zza(this.zza, this.zzb, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzid(zzhq zzhqVar, String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzhqVar;
    }
}
