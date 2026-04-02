package com.distriqt.extension.adverts.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdViewEvent {
    public static final String CLOSED = "adview:closed";
    public static final String CREATED = "adview:created";
    public static final String ERROR = "adview:error";
    public static final String LEFT_APPLICATION = "adview:leftapplication";
    public static final String LOADED = "adview:loaded";
    public static final String OPENED = "adview:opened";

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
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", str);
            jSONObject.put("errorCode", i);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
