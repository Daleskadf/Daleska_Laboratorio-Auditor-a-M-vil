package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqb implements zzbky {
    final /* synthetic */ zzcqc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqb(zzcqc zzcqcVar) {
        this.zza = zzcqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcqc.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqa
                @Override // java.lang.Runnable
                public final void run() {
                    zzcqh zzcqhVar;
                    zzcqhVar = zzcqb.this.zza.zzd;
                    zzcqhVar.zzj();
                }
            });
        }
    }
}
