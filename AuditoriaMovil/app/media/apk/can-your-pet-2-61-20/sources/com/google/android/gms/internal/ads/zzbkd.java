package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkd implements zzbky {
    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcgm zzcgmVar = (zzcgm) obj;
        zzbgs zzK = zzcgmVar.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcgmVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcgmVar.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
