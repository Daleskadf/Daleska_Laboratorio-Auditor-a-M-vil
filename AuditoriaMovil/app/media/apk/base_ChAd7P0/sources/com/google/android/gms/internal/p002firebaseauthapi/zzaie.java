package com.google.android.gms.internal.p002firebaseauthapi;

import a4.K;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import f3.AbstractC0991d;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaie  reason: invalid package */
/* loaded from: classes.dex */
public class zzaie implements zzaea<zzaie> {
    private static final String zza = "zzaie";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List<zzagz> zzp;
    private String zzq;

    public final long zza() {
        return this.zze;
    }

    public final K zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        String str = this.zzg;
        String str2 = this.zzk;
        String str3 = this.zzj;
        String str4 = this.zzn;
        String str5 = this.zzl;
        I.f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new K(str, str2, str3, null, str4, str5, null);
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List<zzagz> zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        if (!TextUtils.isEmpty(this.zzq)) {
            return true;
        }
        return false;
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        if (!this.zzb && TextUtils.isEmpty(this.zzm)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb */
    public final zzaie zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = AbstractC0991d.a(jSONObject.optString("idToken", null));
            this.zzd = AbstractC0991d.a(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            AbstractC0991d.a(jSONObject.optString("localId", null));
            this.zzf = AbstractC0991d.a(jSONObject.optString("email", null));
            AbstractC0991d.a(jSONObject.optString("displayName", null));
            AbstractC0991d.a(jSONObject.optString("photoUrl", null));
            this.zzg = AbstractC0991d.a(jSONObject.optString("providerId", null));
            this.zzh = AbstractC0991d.a(jSONObject.optString("rawUserInfo", null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", null);
            this.zzk = jSONObject.optString("oauthIdToken", null);
            this.zzm = AbstractC0991d.a(jSONObject.optString("errorMessage", null));
            this.zzn = AbstractC0991d.a(jSONObject.optString("pendingToken", null));
            this.zzo = AbstractC0991d.a(jSONObject.optString("tenantId", null));
            this.zzp = zzagz.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = AbstractC0991d.a(jSONObject.optString("mfaPendingCredential", null));
            this.zzl = AbstractC0991d.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }
}
