package com.android.billingclient.api;

import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes.dex */
public final class zzcu {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final ProductDetails.PricingPhase zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcu(JSONObject jSONObject) throws JSONException {
        this.zza = jSONObject.getString("productId");
        this.zzb = jSONObject.optString("title");
        this.zzc = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.zzd = jSONObject.optString("description");
        this.zze = jSONObject.optString("basePlanId");
        JSONObject optJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.zzf = optJSONObject == null ? null : new ProductDetails.PricingPhase(optJSONObject);
    }
}
