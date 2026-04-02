package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafw  reason: invalid package */
/* loaded from: classes.dex */
public class zzafw implements zzaea<zzafw> {
    private static final String zza = "zzafw";
    private List<String> zzb;

    public zzafw() {
        zzahx.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzafw zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("authUri", null);
            jSONObject.optBoolean("registered", false);
            jSONObject.optString("providerId", null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                zzahx.zza();
            } else {
                new zzahx(1, zzail.zza(jSONObject.optJSONArray("allProviders")));
            }
            this.zzb = zzail.zza(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzail.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzail.zza(e, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
