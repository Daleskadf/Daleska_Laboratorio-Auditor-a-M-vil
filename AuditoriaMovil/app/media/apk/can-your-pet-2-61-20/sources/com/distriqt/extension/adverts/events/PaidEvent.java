package com.distriqt.extension.adverts.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class PaidEvent {
    public static final String PAID = "paidevent_paid";

    public static String formatForEvent(String str, long j, String str2, int i, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", j);
            jSONObject.put("currencyCode", str2);
            jSONObject.put("precisionType", i);
            jSONObject.put("adapterClassName", str3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("identifier", str);
            jSONObject2.put("adValue", jSONObject);
            return jSONObject2.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
