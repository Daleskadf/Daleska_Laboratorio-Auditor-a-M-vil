package com.distriqt.extension.inappbilling.events;

import com.adobe.air.wand.message.MessageManager;
import com.distriqt.extension.inappbilling.controller.InAppUpdateInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class InAppUpdatesEvent {
    public static final String CHECK_APP_UPDATE_FAILED = "inappupdates:checkAppUpdate:failed";
    public static final String CHECK_APP_UPDATE_SUCCESS = "inappupdates:checkAppUpdate:success";

    public static String formatForEvent(int i, InAppUpdateInfo inAppUpdateInfo) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("updateAvailability", i);
            if (inAppUpdateInfo != null) {
                jSONObject.put("updateInfo", inAppUpdateInfo.toJSONObject());
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String formatForErrorEvent(int i, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorCode", i);
            if (str == null) {
                str = "Unknown error";
            }
            jSONObject2.put(MessageManager.NAME_ERROR_MESSAGE, str);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            return jSONObject2.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
