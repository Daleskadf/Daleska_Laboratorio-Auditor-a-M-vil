package com.distriqt.extension.playservices.base.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleApiAvailabilityEvent {
    public static final String ERROR_DIALOG_CLOSED = "apiavailability_error_dialog_closed";

    public static String formatForEvent(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", i);
            jSONObject.toString();
            return "{}";
        } catch (Exception unused) {
            return "{}";
        }
    }
}
