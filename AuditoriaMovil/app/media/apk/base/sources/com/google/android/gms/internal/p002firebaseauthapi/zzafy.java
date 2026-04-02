package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0455d;
import a4.C0457f;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafy  reason: invalid package */
/* loaded from: classes.dex */
public class zzafy implements zzaeb {
    private static final String zza = "zzafy";
    private final String zzb;
    private final String zzc;
    private final C0457f zzd;
    private final String zze;
    private final String zzf;

    static {
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        for (int i7 = 2; i7 <= 7 && !Log.isLoggable(zza, i7); i7++) {
        }
    }

    public zzafy(C0457f c0457f, String str, String str2) {
        I.i(c0457f);
        this.zzd = c0457f;
        String str3 = c0457f.f7029a;
        I.e(str3);
        this.zzb = str3;
        String str4 = c0457f.f7031c;
        I.e(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        C0455d c0455d;
        String str;
        String str2 = this.zzc;
        zzan zzanVar = C0455d.f7025d;
        I.e(str2);
        String str3 = null;
        try {
            c0455d = new C0455d(str2);
        } catch (IllegalArgumentException unused) {
            c0455d = null;
        }
        if (c0455d != null) {
            str = c0455d.f7026a;
        } else {
            str = null;
        }
        if (c0455d != null) {
            str3 = c0455d.f7028c;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzail.zza(jSONObject, "captchaResp", str5);
        } else {
            zzail.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C0457f zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
