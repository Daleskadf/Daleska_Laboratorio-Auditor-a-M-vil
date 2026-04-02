package com.distriqt.extension.firebase.controller;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class FirebaseOptions {
    public String apiKey;
    public String clientID;
    public String databaseURL;
    public String gcmSenderID;
    public String googleAppID;
    public String projectId;
    public String storageBucket;

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apiKey", this.apiKey);
            jSONObject.put("clientID", this.clientID);
            jSONObject.put("gcmSenderID", this.gcmSenderID);
            jSONObject.put("googleAppID", this.googleAppID);
            jSONObject.put("databaseURL", this.databaseURL);
            jSONObject.put("storageBucket", this.storageBucket);
            jSONObject.put("projectId", this.projectId);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
