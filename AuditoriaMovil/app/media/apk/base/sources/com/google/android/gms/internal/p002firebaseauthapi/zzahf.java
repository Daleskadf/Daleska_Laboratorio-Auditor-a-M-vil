package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahf  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzahf implements zzaeb {
    public static zzahi zzg() {
        return new zzafs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", zzc());
        jSONObject.put("token", zzf());
        jSONObject.put("providerId", zzd());
        jSONObject.put("tokenType", zzb().toString());
        jSONObject.put("tenantId", zze());
        return jSONObject.toString();
    }

    public abstract zzagh zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
