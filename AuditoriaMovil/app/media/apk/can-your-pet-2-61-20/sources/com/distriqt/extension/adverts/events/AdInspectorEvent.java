package com.distriqt.extension.adverts.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdInspectorEvent {
    public static final String CLOSED = "adverts_adinspector_closed";

    public static String formatForEvent() {
        try {
            return new JSONObject().toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String formatErrorForEvent(String str, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMessage", str);
            jSONObject.put("errorCode", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", jSONObject);
            return jSONObject2.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
