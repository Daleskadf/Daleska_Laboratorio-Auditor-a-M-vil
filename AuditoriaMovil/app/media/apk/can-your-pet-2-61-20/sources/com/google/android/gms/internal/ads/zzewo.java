package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzewo implements zzewr {
    private final zzgep zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewo(zzgep zzgepVar, Context context) {
        this.zza = zzgepVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzewo.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzewq zzc() throws Exception {
        zzbdq zzbdqVar = zzbdz.zzgi;
        final Bundle zzb = com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdqVar));
        if (zzb.isEmpty()) {
            return null;
        }
        return new zzewq() { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // com.google.android.gms.internal.ads.zzewq
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", zzb);
            }
        };
    }
}
