package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdvl {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdvl(String str, zzdvk zzdvkVar) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ String zza(zzdvl zzdvlVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjO);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdvlVar.zza);
            jSONObject.put("eventCategory", zzdvlVar.zzb);
            jSONObject.putOpt("event", zzdvlVar.zzc);
            jSONObject.putOpt("errorCode", zzdvlVar.zzd);
            jSONObject.putOpt("rewardType", zzdvlVar.zze);
            jSONObject.putOpt("rewardAmount", zzdvlVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
