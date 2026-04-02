package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzciw implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzciw(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdwm zzdwmVar = (zzdwm) this.zza.zzb();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbD)).booleanValue()) {
            emptySet = Collections.singleton(new zzdgf(zzdwmVar, zzgepVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhjd.zzb(emptySet);
        return emptySet;
    }
}
