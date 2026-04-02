package com.google.android.gms.internal.ads;

import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdzd implements zzhiv {
    public static zzdzd zza() {
        zzdzd zzdzdVar;
        zzdzdVar = zzdzc.zza;
        return zzdzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        zzhjd.zzb(uuid);
        return uuid;
    }
}
