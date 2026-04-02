package com.google.android.gms.internal.p002firebaseauthapi;

import f3.AbstractC0991d;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahl  reason: invalid package */
/* loaded from: classes.dex */
public class zzahl implements zzaea<zzahl> {
    private static final String zza = "zzahl";
    private String zzb;
    private zzahb zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzahl zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0991d.a(jSONObject.optString("email", null));
            AbstractC0991d.a(jSONObject.optString("passwordHash", null));
            jSONObject.optBoolean("emailVerified", false);
            AbstractC0991d.a(jSONObject.optString("displayName", null));
            AbstractC0991d.a(jSONObject.optString("photoUrl", null));
            this.zzc = zzahb.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = AbstractC0991d.a(jSONObject.optString("idToken", null));
            this.zze = AbstractC0991d.a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzahc> zze() {
        zzahb zzahbVar = this.zzc;
        if (zzahbVar != null) {
            return zzahbVar.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
