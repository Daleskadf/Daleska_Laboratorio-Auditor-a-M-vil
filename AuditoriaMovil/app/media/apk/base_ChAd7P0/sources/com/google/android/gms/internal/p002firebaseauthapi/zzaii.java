package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import f3.AbstractC0991d;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaii  reason: invalid package */
/* loaded from: classes.dex */
public class zzaii implements zzaea<zzaii> {
    private static final String zza = "zzaii";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzagz> zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzaii zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AbstractC0991d.a(jSONObject.optString("localId", null));
            AbstractC0991d.a(jSONObject.optString("email", null));
            AbstractC0991d.a(jSONObject.optString("displayName", null));
            this.zzb = AbstractC0991d.a(jSONObject.optString("idToken", null));
            AbstractC0991d.a(jSONObject.optString("photoUrl", null));
            this.zzc = AbstractC0991d.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzagz.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzagz> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        if (!TextUtils.isEmpty(this.zzf)) {
            return true;
        }
        return false;
    }

    public final String zzb() {
        return this.zzb;
    }
}
