package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdlz implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;
    private final zzhjm zze;
    private final zzhjm zzf;
    private final zzhjm zzg;
    private final zzhjm zzh;
    private final zzhjm zzi;

    public zzdlz(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4, zzhjm zzhjmVar5, zzhjm zzhjmVar6, zzhjm zzhjmVar7, zzhjm zzhjmVar8, zzhjm zzhjmVar9) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
        this.zze = zzhjmVar5;
        this.zzf = zzhjmVar6;
        this.zzg = zzhjmVar7;
        this.zzh = zzhjmVar8;
        this.zzi = zzhjmVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza */
    public final zzdly zzb() {
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzdly(((zzcio) this.zza).zzb(), ((zzcyh) this.zzb).zza(), (zzdld) this.zzc.zzb(), ((zzdlr) this.zzd).zza(), (zzdmk) this.zze.zzb(), (zzdms) this.zzf.zzb(), (Executor) this.zzg.zzb(), zzgepVar, (zzdkv) this.zzi.zzb());
    }
}
