package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcxv;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzfjs;
import com.google.android.gms.internal.ads.zzfkh;
import com.google.android.gms.internal.ads.zzfkn;
import com.google.android.gms.internal.ads.zzgee;
import com.google.android.gms.internal.ads.zzhiv;
import com.google.android.gms.internal.ads.zzhjm;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzal implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;

    public zzal(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfjs zza = ((zzfkn) this.zza.zzb()).zzb(zzfkh.GENERATE_SIGNALS, ((zzcxv) this.zzc).zzb().zzc()).zzf(((zzao) this.zzb).zzb()).zzi(((Integer) zzba.zzc().zza(zzbdz.zzfz)).intValue(), TimeUnit.SECONDS).zza();
        zzgee.zzr(zza, new zzad((zzdhc) this.zzd.zzb()), zzcbr.zza);
        return zza;
    }
}
