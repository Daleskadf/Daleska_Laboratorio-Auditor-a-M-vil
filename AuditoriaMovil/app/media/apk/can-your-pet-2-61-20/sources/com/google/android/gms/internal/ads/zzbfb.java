package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbfb implements zzhiv {
    private final zzhjm zza;

    public zzbfb(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza */
    public final zzbfa zzb() {
        return new zzbfa((ScheduledExecutorService) this.zza.zzb());
    }
}
