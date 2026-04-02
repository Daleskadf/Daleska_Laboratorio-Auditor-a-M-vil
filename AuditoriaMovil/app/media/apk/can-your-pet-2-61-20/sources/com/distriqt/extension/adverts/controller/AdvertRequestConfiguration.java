package com.distriqt.extension.adverts.controller;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdvertRequestConfiguration {
    public int tagForChildDirectedTreatment = -1;
    public int tagForUnderAgeOfConsent = -1;
    public String maxAdContentRating = "";
    public List<String> testDeviceIds = new ArrayList();

    public static AdvertRequestConfiguration fromJSONString(String str) {
        AdvertRequestConfiguration advertRequestConfiguration = new AdvertRequestConfiguration();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("tagForChildDirectedTreatment")) {
                advertRequestConfiguration.tagForChildDirectedTreatment = jSONObject.getInt("tagForChildDirectedTreatment");
            }
            if (jSONObject.has("tagForUnderAgeOfConsent")) {
                advertRequestConfiguration.tagForUnderAgeOfConsent = jSONObject.getInt("tagForUnderAgeOfConsent");
            }
            if (jSONObject.has("maxAdContentRating")) {
                advertRequestConfiguration.maxAdContentRating = jSONObject.getString("maxAdContentRating");
            }
            if (jSONObject.has("testDeviceIds")) {
                JSONArray jSONArray = jSONObject.getJSONArray("testDeviceIds");
                for (int i = 0; i < jSONArray.length(); i++) {
                    advertRequestConfiguration.testDeviceIds.add(jSONArray.getString(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return advertRequestConfiguration;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tagForChildDirectedTreatment", this.tagForChildDirectedTreatment);
            jSONObject.put("tagForUnderAgeOfConsent", this.tagForUnderAgeOfConsent);
            jSONObject.put("maxAdContentRating", this.maxAdContentRating);
            if (this.testDeviceIds != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.testDeviceIds) {
                    jSONArray.put(str);
                }
                jSONObject.put("testDeviceIds", jSONArray);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toJSONString() {
        try {
            return toJSONObject().toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }

    public String toString() {
        return toJSONString();
    }
}
