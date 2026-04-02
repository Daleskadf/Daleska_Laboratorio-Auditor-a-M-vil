package com.distriqt.extension.adverts.events;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ConsentEvent {
    public static final String FORM_CLOSED = "consent:form:closed";
    public static final String FORM_ERROR = "consent:form:error";
    public static final String STATUS_ERROR = "consent:status:error";
    public static final String STATUS_UPDATED = "consent:status:updated";

    public static String formatForEvent(String str, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str);
            jSONObject.put("inEeaOrUnknown", z);
            jSONObject.put("userPrefersAdFree", z2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String formatErrorForEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
