package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import f3.AbstractC0991d;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagt  reason: invalid package */
/* loaded from: classes.dex */
public class zzagt implements zzaea<zzagt> {
    private static final String zza = "zzagt";
    private String zzb;
    private zzaj<zzahe> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzd */
    public final zzagt zza(String str) {
        zzaj<zzahe> zza2;
        zzahe zza3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC0991d.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzam zzg = zzaj.zzg();
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i7);
                        if (jSONObject2 == null) {
                            zza3 = zzahe.zza(null, null);
                        } else {
                            zza3 = zzahe.zza(AbstractC0991d.a(jSONObject2.optString("provider")), AbstractC0991d.a(jSONObject2.optString("enforcementState")));
                        }
                        zzg.zza(zza3);
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzaj.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzail.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzail.zza(e, zza, str);
        }
    }

    public final String zzb(String str) {
        I.e(str);
        zzaj<zzahe> zzajVar = this.zzc;
        if (zzajVar != null && !zzajVar.isEmpty()) {
            zzaj<zzahe> zzajVar2 = this.zzc;
            int size = zzajVar2.size();
            int i7 = 0;
            while (i7 < size) {
                zzahe zzaheVar = zzajVar2.get(i7);
                i7++;
                zzahe zzaheVar2 = zzaheVar;
                String zza2 = zzaheVar2.zza();
                String zzb = zzaheVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    return zzaheVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        if (!zzb.equals("ENFORCE") && !zzb.equals("AUDIT")) {
            return false;
        }
        return true;
    }

    public final String zza() {
        return this.zzb;
    }
}
