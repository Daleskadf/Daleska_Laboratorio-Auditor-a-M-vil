package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import io.flutter.plugins.pathprovider.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzail  reason: invalid package */
/* loaded from: classes.dex */
public final class zzail {
    public static zzabr zza(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder l8 = b.l("Failed to parse ", str, " for string [", str2, "] with exception: ");
        l8.append(message);
        Log.e(str, l8.toString());
        return new zzabr(b.j("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static List<String> zza(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                arrayList.add(jSONArray.getString(i7));
            }
        }
        return arrayList;
    }

    public static void zza(JSONObject jSONObject) {
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void zza(JSONObject jSONObject, String str, String str2) {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
