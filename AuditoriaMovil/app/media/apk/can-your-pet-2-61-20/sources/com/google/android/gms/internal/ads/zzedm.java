package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzedm {
    private final zzbwx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedm(zzbwx zzbwxVar) {
        this.zza = zzbwxVar;
    }

    public static void zza(Map map, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("pii");
        if (optJSONObject != null) {
            if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
            }
            if (TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                return;
            }
            map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
    }

    public final void zzb() {
        ListenableFuture zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzhJ)).booleanValue()) {
            zzcbu.zzb(zza, "persistFlags");
        } else {
            zzcbu.zza(zza, "persistFlags");
        }
    }
}
