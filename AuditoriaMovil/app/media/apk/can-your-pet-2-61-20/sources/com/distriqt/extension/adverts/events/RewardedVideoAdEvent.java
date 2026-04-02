package com.distriqt.extension.adverts.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class RewardedVideoAdEvent {
    public static final String ERROR = "rewardedvideoad:error";
    public static final String LOADED = "rewardedvideoad:loaded";
    public static final String REWARD = "rewardedvideoad:reward";

    public static String formatForEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
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

    public static String formatForRewardEvent(String str, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", str);
            jSONObject.put("rewardAmount", i);
            if (str2 != null) {
                jSONObject.put("rewardType", str2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
