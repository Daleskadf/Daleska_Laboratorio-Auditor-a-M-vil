package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafu  reason: invalid package */
/* loaded from: classes.dex */
public class zzafu implements zzaea<zzafu> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzafu";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzafu zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e7) {
            String str2 = zza;
            String message = e7.getMessage();
            Log.e(str2, "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new zzabr(AbstractC0059i.M("Failed to parse error for string [", str, "]"), e7);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
