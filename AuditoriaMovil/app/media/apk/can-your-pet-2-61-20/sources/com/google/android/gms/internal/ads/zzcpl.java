package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpl implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;
    private final zzhjm zzf;
    private final zzhjm zzg;

    public zzcpl(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6, zzhjm zzhjmVar7) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
        this.zzf = zzhjmVar6;
        this.zzg = zzhjmVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzcpk(((zzciq) this.zza).zza(), ((zzcio) this.zzb).zzb(), (zzegf) this.zzc.zzb(), (zzdrn) this.zzd.zzb(), zzgepVar, (zzgep) this.zzf.zzb(), (ScheduledExecutorService) this.zzg.zzb());
    }
}
