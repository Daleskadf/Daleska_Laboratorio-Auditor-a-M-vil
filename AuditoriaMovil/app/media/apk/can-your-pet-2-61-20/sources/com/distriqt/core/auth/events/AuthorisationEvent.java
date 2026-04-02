package com.distriqt.core.auth.events;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AuthorisationEvent {
    public static final String CHANGED = "authorisation:changed";
    public static final String COMPLETE = "authorisation:complete";

    public static String formatForEvent() {
        return formatForEvent(null, null);
    }

    public static String formatForEvent(String str) {
        return formatForEvent(str, null);
    }

    public static String formatForEvent(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(NotificationCompat.CATEGORY_STATUS, str);
            jSONObject.putOpt("authType", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }
}
