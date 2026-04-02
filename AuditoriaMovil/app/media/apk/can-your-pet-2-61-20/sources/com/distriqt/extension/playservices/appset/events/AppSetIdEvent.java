package com.distriqt.extension.playservices.appset.events;

import com.google.android.gms.appset.AppSetIdInfo;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppSetIdEvent {
    public static final String GETAPPSETIDINFO_COMPLETE = "getAppSetIdInfo_complete";

    public static String formatForEvent(AppSetIdInfo appSetIdInfo) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("info", appSetIdInfoToJSONObject(appSetIdInfo));
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static JSONObject appSetIdInfoToJSONObject(AppSetIdInfo appSetIdInfo) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", appSetIdInfo.getScope());
        jSONObject.put("id", appSetIdInfo.getId());
        return jSONObject;
    }
}
