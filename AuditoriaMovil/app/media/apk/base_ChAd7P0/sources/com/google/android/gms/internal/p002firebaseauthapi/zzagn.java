package com.google.android.gms.internal.p002firebaseauthapi;

import a4.C0454c;
import com.google.android.gms.common.internal.I;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagn  reason: invalid package */
/* loaded from: classes.dex */
public final class zzagn implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C0454c zze;
    private String zzf;
    private String zzg;

    public zzagn(int i7) {
        this.zza = zza(i7);
    }

    public static zzagn zza(C0454c c0454c, String str, String str2) {
        I.e(str);
        I.e(str2);
        I.i(c0454c);
        return new zzagn(7, c0454c, null, str2, str, null, null);
    }

    public final C0454c zzb() {
        return this.zze;
    }

    public final zzagn zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzagn zzd(String str) {
        I.e(str);
        this.zzd = str;
        return this;
    }

    public final zzagn zzb(String str) {
        I.e(str);
        this.zzb = str;
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzagn(int i7, C0454c c0454c, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        I.i(c0454c);
        this.zze = c0454c;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzagn zza(C0454c c0454c) {
        I.i(c0454c);
        this.zze = c0454c;
        return this;
    }

    public final zzagn zza(String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i7) {
        if (i7 != 1) {
            if (i7 != 4) {
                if (i7 != 6) {
                    if (i7 != 7) {
                        return "REQUEST_TYPE_UNSET_ENUM_VALUE";
                    }
                    return "VERIFY_AND_CHANGE_EMAIL";
                }
                return "EMAIL_SIGNIN";
            }
            return "VERIFY_EMAIL";
        }
        return "PASSWORD_RESET";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        int i7 = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c8 = 2;
                    break;
                }
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c8 = 3;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                break;
            case 1:
                i7 = 4;
                break;
            case 2:
                i7 = 7;
                break;
            case 3:
                i7 = 6;
                break;
            default:
                i7 = 0;
                break;
        }
        jSONObject.put("requestType", i7);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        C0454c c0454c = this.zze;
        if (c0454c != null) {
            jSONObject.put("androidInstallApp", c0454c.f7022e);
            jSONObject.put("canHandleCodeInApp", this.zze.f7015X);
            String str5 = this.zze.f7018a;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.zze.f7019b;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.zze.f7020c;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.zze.f7021d;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.zze.f;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.zze.f7023e0;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
            String str11 = this.zze.f7024f0;
            if (str11 != null) {
                jSONObject.put("linkDomain", str11);
            }
        }
        String str12 = this.zzf;
        if (str12 != null) {
            jSONObject.put("tenantId", str12);
        }
        String str13 = this.zzg;
        if (str13 != null) {
            zzail.zza(jSONObject, "captchaResp", str13);
        } else {
            zzail.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
