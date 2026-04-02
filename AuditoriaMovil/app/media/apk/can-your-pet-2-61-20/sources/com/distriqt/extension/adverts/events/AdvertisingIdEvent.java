package com.distriqt.extension.adverts.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdvertisingIdEvent {
    public static final String ADVERTISING_ID = "advert:advertisingid";

    public static String formatAdvertisingIdForEvent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("advertisingId", str);
            jSONObject.put("isLimitAdTrackingEnabled", z);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
