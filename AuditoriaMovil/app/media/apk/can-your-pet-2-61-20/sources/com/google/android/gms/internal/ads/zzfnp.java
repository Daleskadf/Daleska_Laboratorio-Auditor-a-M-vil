package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfnp extends zzfns {
    private static final zzfnp zzb = new zzfnp();

    private zzfnp() {
    }

    public static zzfnp zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final void zzb(boolean z) {
        for (zzfnc zzfncVar : zzfnq.zza().zzc()) {
            zzfncVar.zzg().zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfns
    public final boolean zzc() {
        for (zzfnc zzfncVar : zzfnq.zza().zzb()) {
            View zzf = zzfncVar.zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
