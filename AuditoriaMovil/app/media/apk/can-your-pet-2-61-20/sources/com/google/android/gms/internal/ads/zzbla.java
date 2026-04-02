package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbla implements zzbky {
    private final zzblb zza;

    public zzbla(zzblb zzblbVar) {
        this.zza = zzblbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to parse float", e);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f);
        zzcgmVar.zzav(equals);
    }
}
