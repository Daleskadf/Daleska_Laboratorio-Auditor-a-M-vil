package com.distriqt.extension.adverts.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class InterstitialEvent {
    public static final String ERROR = "interstitial:error";
    public static final String LOADED = "interstitial:loaded";

    public static String formatForEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String formatForErrorEvent(String str, int i) {
        return formatForErrorEvent(str, i, null);
    }

    public static String formatForErrorEvent(String str, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", str);
            jSONObject.put("errorCode", i);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("error", str2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
