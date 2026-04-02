package com.distriqt.extension.share.applications;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ApplicationOptions {
    public String action;
    public String data;
    public Map<String, String> extras = new HashMap();
    public String parameters;
    public String type;

    public static ApplicationOptions fromJSONObject(JSONObject jSONObject) throws Exception {
        ApplicationOptions applicationOptions = new ApplicationOptions();
        if (jSONObject.has("action")) {
            applicationOptions.action = jSONObject.getString("action");
        }
        if (jSONObject.has("data")) {
            applicationOptions.data = jSONObject.getString("data");
        }
        if (jSONObject.has("type")) {
            applicationOptions.type = jSONObject.getString("type");
        }
        if (jSONObject.has("parameters")) {
            applicationOptions.parameters = jSONObject.getString("parameters");
        }
        return applicationOptions;
    }
}
