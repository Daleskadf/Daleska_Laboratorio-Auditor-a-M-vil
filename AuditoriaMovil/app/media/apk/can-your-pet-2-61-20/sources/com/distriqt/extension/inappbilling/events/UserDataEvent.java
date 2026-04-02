package com.distriqt.extension.inappbilling.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class UserDataEvent {
    public static final String GET_FAILED = "userdata:get:failed";
    public static final String GET_SUCCESS = "userdata:get:success";

    public static String formatForEvent(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("userData", jSONObject);
            return jSONObject2.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
