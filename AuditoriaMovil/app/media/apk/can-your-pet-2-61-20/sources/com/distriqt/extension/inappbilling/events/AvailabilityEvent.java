package com.distriqt.extension.inappbilling.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class AvailabilityEvent {
    public static final String COMPLETE = "availability_complete";
    public static final String TAG = "AvailabilityEvent";

    public static String formatForEvent(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", str);
            jSONObject.put("availability", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
