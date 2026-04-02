package com.distriqt.extension.share.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class ShareEvent {
    public static final String CANCELLED = "share:cancelled";
    public static final String CLOSED = "share:closed";
    public static final String COMPLETE = "share:complete";
    public static final String FAILED = "share:failed";

    public static String formatActivityForEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("activityType", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String formatErrorForEvent(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject.put("activityType", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("error", str2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
