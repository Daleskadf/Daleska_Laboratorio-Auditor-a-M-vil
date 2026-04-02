package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbku implements zzbky {
    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcgmVar.zzdg();
        } else if ("resume".equals(str)) {
            zzcgmVar.zzdh();
        }
    }
}
