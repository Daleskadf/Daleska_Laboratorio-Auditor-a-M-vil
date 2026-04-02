package com.distriqt.extension.adverts.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class NativeAdEvent {
    public static final String CLICKED = "nativead:clicked";
    public static final String CLOSED = "nativead:closed";
    public static final String ERROR = "nativead:error";
    public static final String LOADED = "nativead:loaded";
    public static final String OPENED = "nativead:opened";

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
