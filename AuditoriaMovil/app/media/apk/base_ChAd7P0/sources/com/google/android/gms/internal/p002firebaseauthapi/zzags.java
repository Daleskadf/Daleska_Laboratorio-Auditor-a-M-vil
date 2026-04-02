package com.google.android.gms.internal.p002firebaseauthapi;

import f3.AbstractC0991d;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzags  reason: invalid package */
/* loaded from: classes.dex */
public class zzags implements zzaea<zzags> {
    private static final String zza = "zzags";
    private String zzb;

    public zzags() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzags zza(String str) {
        try {
            this.zzb = AbstractC0991d.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    public zzags(String str) {
        this.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }
}
