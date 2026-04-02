package com.google.android.gms.internal.p002firebaseauthapi;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import f3.AbstractC0991d;
import m5.d;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagw  reason: invalid package */
/* loaded from: classes.dex */
public class zzagw extends a implements zzaea<zzagw> {
    public static final Parcelable.Creator<zzagw> CREATOR = new zzagv();
    private static final String zza = "zzagw";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzagw() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzd */
    public final zzagw zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0991d.a(jSONObject.optString("refresh_token"));
            this.zzc = AbstractC0991d.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = AbstractC0991d.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzail.zza(e7, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.B(parcel, 2, this.zzb, false);
        d.B(parcel, 3, this.zzc, false);
        d.z(parcel, 4, Long.valueOf(zza()));
        d.B(parcel, 5, this.zze, false);
        Long l8 = this.zzf;
        l8.getClass();
        d.z(parcel, 6, l8);
        d.J(G2, parcel);
    }

    public final long zza() {
        Long l8 = this.zzd;
        if (l8 == null) {
            return 0L;
        }
        return l8.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzzp(e7);
        }
    }

    public final boolean zzg() {
        if (System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue()) {
            return true;
        }
        return false;
    }

    public static zzagw zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzagw zzagwVar = new zzagw();
            zzagwVar.zzb = jSONObject.optString("refresh_token", null);
            zzagwVar.zzc = jSONObject.optString("access_token", null);
            zzagwVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzagwVar.zze = jSONObject.optString("token_type", null);
            zzagwVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzagwVar;
        } catch (JSONException e7) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzzp(e7);
        }
    }

    public final void zzc(String str) {
        I.e(str);
        this.zzb = str;
    }

    public zzagw(String str, String str2, Long l8, String str3, Long l9) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l8;
        this.zze = str3;
        this.zzf = l9;
    }

    public final String zzd() {
        return this.zzb;
    }

    public zzagw(String str, String str2, Long l8, String str3) {
        this(str, str2, l8, str3, Long.valueOf(System.currentTimeMillis()));
    }
}
