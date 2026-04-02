package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagd  reason: invalid package */
/* loaded from: classes.dex */
public final class zzagd implements zzagc {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzagd(String str, String str2, String str3, String str4, String str5) {
        I.e(str);
        I.e(str2);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = str4;
        this.zzd = str5;
    }

    public static zzagd zza(String str, String str2, String str3, String str4) {
        I.e(str3);
        I.e(str2);
        return new zzagd("phone", str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzb;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zza);
        String str3 = this.zzd;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
