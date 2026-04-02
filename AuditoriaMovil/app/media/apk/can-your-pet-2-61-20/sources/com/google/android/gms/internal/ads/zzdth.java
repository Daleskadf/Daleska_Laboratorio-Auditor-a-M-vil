package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbdg;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdth implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;
    private final zzhjm zzd;

    public zzdth(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3, zzhjm zzhjmVar4) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
        this.zzd = zzhjmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzciq) this.zzb).zza();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        Map zzb = ((zzhiz) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeQ)).booleanValue()) {
            zzbcx zzbcxVar = new zzbcx(new zzbdf(zza));
            zzbcxVar.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzdti
                @Override // com.google.android.gms.internal.ads.zzbcw
                public final void zza(zzbdg.zzt.zza zzaVar) {
                    zzaVar.zzO(str);
                }
            });
            emptySet = Collections.singleton(new zzdgf(new zzdtk(zzbcxVar, zzb), zzgepVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhjd.zzb(emptySet);
        return emptySet;
    }
}
