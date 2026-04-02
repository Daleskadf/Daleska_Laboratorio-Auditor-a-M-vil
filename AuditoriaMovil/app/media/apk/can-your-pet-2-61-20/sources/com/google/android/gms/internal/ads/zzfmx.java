package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfmx {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Context context) {
        zzfop.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfny.zzb().zzd(context);
        zzfnp.zza().zzd(context);
        zzfoj.zzb(context);
        zzfok.zzd(context);
        zzfon.zza(context);
        zzfnv.zzb().zzc(context);
        zzfno.zza().zzd(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zza;
    }
}
