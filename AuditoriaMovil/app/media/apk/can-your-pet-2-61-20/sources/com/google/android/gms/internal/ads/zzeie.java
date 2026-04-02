package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeie implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;
    private final zzhjm zzf;

    public zzeie(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
        this.zzf = zzhjmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza */
    public final zzeid zzb() {
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzeid((zzcsm) this.zza.zzb(), ((zzehl) this.zzb).zzb(), (zzcys) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzgepVar, (zzduc) this.zzf.zzb());
    }
}
