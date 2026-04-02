package com.distriqt.extension.adverts.controller.ump;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdvertConsentRequestParameters {
    public AdvertConsentDebugSettings debugSettings;
    public boolean tagForUnderAgeOfConsent = false;

    public JSONObject toJSONObject() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tagForUnderAgeOfConsent", this.tagForUnderAgeOfConsent);
        AdvertConsentDebugSettings advertConsentDebugSettings = this.debugSettings;
        if (advertConsentDebugSettings != null) {
            jSONObject.put("debugSettings", advertConsentDebugSettings.toJSONObject());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSONObject().toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
