package com.distriqt.extension.applicationrater.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class ApplicationIDEvent {
    public static final String ERROR = "applicationId:error";
    public static final String RETRIEVED = "applicationId:retrieved";

    public static String formatForEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applicationId", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String formatForErrorEvent(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i);
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
