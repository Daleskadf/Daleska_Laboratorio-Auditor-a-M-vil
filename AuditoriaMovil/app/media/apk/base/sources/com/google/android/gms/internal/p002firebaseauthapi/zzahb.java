package com.google.android.gms.internal.p002firebaseauthapi;

import f3.AbstractC0991d;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzahb {
    private List<zzahc> zza;

    public zzahb() {
        this.zza = new ArrayList();
    }

    public static zzahb zza(JSONArray jSONArray) {
        zzahc zzahcVar;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i7);
                if (jSONObject == null) {
                    zzahcVar = new zzahc();
                } else {
                    zzahcVar = new zzahc(AbstractC0991d.a(jSONObject.optString("federatedId", null)), AbstractC0991d.a(jSONObject.optString("displayName", null)), AbstractC0991d.a(jSONObject.optString("photoUrl", null)), AbstractC0991d.a(jSONObject.optString("providerId", null)), null, AbstractC0991d.a(jSONObject.optString("phoneNumber", null)), AbstractC0991d.a(jSONObject.optString("email", null)));
                }
                arrayList.add(zzahcVar);
            }
            return new zzahb(arrayList);
        }
        return new zzahb(new ArrayList());
    }

    private zzahb(List<zzahc> list) {
        if (!list.isEmpty()) {
            this.zza = DesugarCollections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List<zzahc> zza() {
        return this.zza;
    }
}
