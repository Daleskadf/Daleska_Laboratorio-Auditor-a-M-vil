package com.distriqt.extension.share.applications;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class Application {
    public String applicationUrl;
    public String packageName;

    public static Application fromJSONObject(JSONObject jSONObject) throws Exception {
        Application application = new Application();
        if (jSONObject.has("packageName")) {
            application.packageName = jSONObject.getString("packageName");
        }
        if (jSONObject.has("applicationUrl")) {
            application.applicationUrl = jSONObject.getString("applicationUrl");
        }
        return application;
    }
}
