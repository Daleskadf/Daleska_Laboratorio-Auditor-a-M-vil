package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqn implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzcqn(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        zzcqh zzcqhVar = (zzcqh) this.zza.zzb();
        zzgep zzgepVar = zzcbr.zza;
        zzhjd.zzb(zzgepVar);
        if (((JSONObject) this.zzc.zzb()) == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzdgf(zzcqhVar, zzgepVar));
        }
        zzhjd.zzb(singleton);
        return singleton;
    }
}
