package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzezf implements zzewr {
    final zzgep zza;
    final String zzb;
    final zzcav zzc;

    public zzezf(zzcav zzcavVar, zzgep zzgepVar, String str) {
        this.zzc = zzcavVar;
        this.zza = zzgepVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        final ListenableFuture zzh = zzgee.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfR)).booleanValue()) {
            zzh = zzgee.zzh(null);
        }
        final ListenableFuture zzh2 = zzgee.zzh(null);
        return zzgee.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzezg((String) ListenableFuture.this.get(), (String) zzh2.get());
            }
        }, zzcbr.zza);
    }
}
