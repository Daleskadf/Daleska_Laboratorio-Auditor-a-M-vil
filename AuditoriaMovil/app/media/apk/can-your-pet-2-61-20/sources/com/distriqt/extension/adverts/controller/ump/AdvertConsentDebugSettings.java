package com.distriqt.extension.adverts.controller.ump;

import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdvertConsentDebugSettings {
    public int debugGeography = 0;
    public String[] testDeviceIds;

    public JSONObject toJSONObject() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("debugGeography", this.debugGeography);
        JSONArray jSONArray = new JSONArray();
        for (String str : this.testDeviceIds) {
            jSONArray.put(str);
        }
        jSONObject.put("testDeviceIds", jSONArray);
        return jSONObject;
    }
}
