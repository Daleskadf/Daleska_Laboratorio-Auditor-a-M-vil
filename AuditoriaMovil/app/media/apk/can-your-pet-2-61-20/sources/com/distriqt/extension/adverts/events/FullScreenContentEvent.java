package com.distriqt.extension.adverts.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class FullScreenContentEvent {
    public static final String DISMISSED = "fullscreencontent_dismissed";
    public static final String FAILED_TO_SHOW = "fullscreencontent_failedtoshow";
    public static final String SHOW = "fullscreencontent_show";

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
}
