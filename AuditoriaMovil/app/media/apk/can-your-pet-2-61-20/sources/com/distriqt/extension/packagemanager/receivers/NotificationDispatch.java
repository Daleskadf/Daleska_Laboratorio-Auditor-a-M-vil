package com.distriqt.extension.packagemanager.receivers;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class NotificationDispatch {
    public String code;
    public String data;

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", this.code);
        jSONObject.put("data", this.data);
        return jSONObject;
    }

    public NotificationDispatch fromJSON(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("code")) {
            this.code = jSONObject.getString("code");
        }
        if (jSONObject.has("data")) {
            this.data = jSONObject.getString("data");
        }
        return this;
    }
}
