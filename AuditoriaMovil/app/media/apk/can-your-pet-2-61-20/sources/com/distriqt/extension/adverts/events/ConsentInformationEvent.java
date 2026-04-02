package com.distriqt.extension.adverts.events;

import com.adobe.air.wand.message.MessageManager;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ConsentInformationEvent {
    public static final String CONSENT_INFO_UPDATE_FAILURE = "consentInfoUpdateFailure";
    public static final String CONSENT_INFO_UPDATE_SUCCESS = "consentInfoUpdateSuccess";

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
            jSONObject.put(MessageManager.NAME_ERROR_MESSAGE, str);
            jSONObject.put("errorCode", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", jSONObject);
            return jSONObject2.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
