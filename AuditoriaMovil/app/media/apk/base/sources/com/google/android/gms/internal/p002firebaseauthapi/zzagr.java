package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagr  reason: invalid package */
/* loaded from: classes.dex */
public class zzagr implements zzaea<zzagr> {
    private static final String zza = "zzagr";
    private List<String> zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzagr zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    this.zzb.add(optJSONArray.getString(i7));
                }
            }
            return this;
        } catch (JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
