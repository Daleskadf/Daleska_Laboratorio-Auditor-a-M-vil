package com.google.android.gms.internal.p002firebaseauthapi;

import f3.AbstractC0991d;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaim  reason: invalid package */
/* loaded from: classes.dex */
public class zzaim implements zzaea<zzaim> {
    private static final String zza = "zzaim";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzaim zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0991d.a(jSONObject.optString("idToken", null));
            this.zzc = AbstractC0991d.a(jSONObject.optString("refreshToken", null));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
