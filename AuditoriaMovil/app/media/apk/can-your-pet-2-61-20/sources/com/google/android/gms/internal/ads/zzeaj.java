package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeaj implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzeaj(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza */
    public final zzeai zzb() {
        Map zzd = ((zzhjc) this.zza).zzd();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        return new zzeai(zzd, zzgepVar, ((zzdbk) this.zzc).zzb());
    }
}
