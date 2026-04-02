package com.google.android.gms.internal.p002firebaseauthapi;

import a4.J;
import f3.AbstractC0991d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagm  reason: invalid package */
/* loaded from: classes.dex */
public class zzagm implements zzaea<zzagm> {
    private static final String zza = "zzagm";
    private zzago zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzagm zza(String str) {
        zzago zzagoVar;
        int i7;
        zzagl zzaglVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("users")) {
                zzagoVar = new zzago();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z7 = false;
                    int i8 = 0;
                    while (i8 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                        if (jSONObject2 == null) {
                            zzaglVar = new zzagl();
                            i7 = i8;
                        } else {
                            i7 = i8;
                            zzaglVar = new zzagl(AbstractC0991d.a(jSONObject2.optString("localId", null)), AbstractC0991d.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z7), AbstractC0991d.a(jSONObject2.optString("displayName", null)), AbstractC0991d.a(jSONObject2.optString("photoUrl", null)), zzahb.zza(jSONObject2.optJSONArray("providerUserInfo")), AbstractC0991d.a(jSONObject2.optString("rawPassword", null)), AbstractC0991d.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzagz.zza(jSONObject2.optJSONArray("mfaInfo")), J.l(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzaglVar);
                        i8 = i7 + 1;
                        z7 = false;
                    }
                    zzagoVar = new zzago(arrayList);
                }
                zzagoVar = new zzago(new ArrayList());
            }
            this.zzb = zzagoVar;
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzail.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzail.zza(e, zza, str);
        }
    }

    public final List<zzagl> zza() {
        return this.zzb.zza();
    }
}
