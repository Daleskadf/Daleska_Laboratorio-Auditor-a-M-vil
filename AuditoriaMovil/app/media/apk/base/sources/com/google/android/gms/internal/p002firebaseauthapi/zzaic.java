package com.google.android.gms.internal.p002firebaseauthapi;

import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b4.Q;
import com.google.android.gms.common.internal.I;
import m5.d;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaic  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaic extends a implements zzaeb {
    public static final Parcelable.Creator<zzaic> CREATOR = new zzaib();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzaic() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.B(parcel, 2, this.zza, false);
        d.B(parcel, 3, this.zzb, false);
        d.B(parcel, 4, this.zzc, false);
        d.B(parcel, 5, this.zzd, false);
        d.B(parcel, 6, this.zze, false);
        d.B(parcel, 7, this.zzf, false);
        d.B(parcel, 8, this.zzg, false);
        d.B(parcel, 9, this.zzh, false);
        boolean z7 = this.zzi;
        d.K(parcel, 10, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzj;
        d.K(parcel, 11, 4);
        parcel.writeInt(z8 ? 1 : 0);
        d.B(parcel, 12, this.zzk, false);
        d.B(parcel, 13, this.zzl, false);
        d.B(parcel, 14, this.zzm, false);
        d.B(parcel, 15, this.zzn, false);
        boolean z9 = this.zzo;
        d.K(parcel, 16, 4);
        parcel.writeInt(z9 ? 1 : 0);
        d.B(parcel, 17, this.zzp, false);
        d.J(G2, parcel);
    }

    public final zzaic zza(boolean z7) {
        this.zzj = false;
        return this;
    }

    public final zzaic zzb(boolean z7) {
        this.zzo = true;
        return this;
    }

    public final zzaic zzc(boolean z7) {
        this.zzi = true;
        return this;
    }

    public final zzaic zza(String str) {
        I.e(str);
        this.zzb = str;
        return this;
    }

    public final zzaic zzb(String str) {
        this.zzn = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzaic(Q q2, String str) {
        I.i(q2);
        String str2 = q2.f8215a;
        I.e(str2);
        this.zzl = str2;
        I.e(str);
        this.zzm = str;
        String str3 = q2.f8217c;
        I.e(str3);
        this.zze = str3;
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzaic(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        I.e(str3);
        this.zze = str3;
        this.zzf = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb.append("id_token=");
            sb.append(this.zzc);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb.append("access_token=");
            sb.append(this.zzd);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb.append("identifier=");
            sb.append(this.zzf);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb.append("oauth_token_secret=");
            sb.append(this.zzh);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb.append("code=");
            sb.append(this.zzk);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb.append("nonce=");
            sb.append(str9);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.zze);
        this.zzg = sb.toString();
        this.zzj = true;
    }

    public zzaic(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z7, boolean z8, String str9, String str10, String str11, String str12, boolean z9, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z7;
        this.zzj = z8;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z9;
        this.zzp = str13;
    }
}
