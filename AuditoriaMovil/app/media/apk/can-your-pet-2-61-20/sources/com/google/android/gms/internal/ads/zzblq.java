package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzblq implements zzbky {
    private final zzblp zza;

    public zzblq(zzblp zzblpVar) {
        this.zza = zzblpVar;
    }

    public static void zzb(zzcgm zzcgmVar, zzblp zzblpVar) {
        zzcgmVar.zzae("/reward", new zzblq(zzblpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbyc zzbycVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbycVar = new zzbyc(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse reward amount.", e);
            }
            this.zza.zza(zzbycVar);
        } else if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
