package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfjv {
    final /* synthetic */ zzfkf zza;
    private final Object zzb;
    private final List zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfjv(zzfkf zzfkfVar, Object obj, List list, zzfju zzfjuVar) {
        this.zza = zzfkfVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfke zza(Callable callable) {
        zzgep zzgepVar;
        zzged zzb = zzgee.zzb(this.zzc);
        ListenableFuture zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcbr.zzf);
        zzgepVar = this.zza.zzb;
        ListenableFuture zza2 = zzb.zza(callable, zzgepVar);
        return new zzfke(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
