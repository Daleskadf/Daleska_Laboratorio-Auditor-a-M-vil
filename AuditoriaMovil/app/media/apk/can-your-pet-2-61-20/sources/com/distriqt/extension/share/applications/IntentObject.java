package com.distriqt.extension.share.applications;

import java.util.Locale;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class IntentObject {
    public String action;
    public String data;
    public String extrasJSON;
    public String packageName;
    public String type;

    public String toString() {
        Locale locale = Locale.UK;
        Object[] objArr = new Object[2];
        String str = this.action;
        if (str == null) {
            str = "null";
        }
        objArr[0] = str;
        String str2 = this.packageName;
        objArr[1] = str2 != null ? str2 : "null";
        return String.format(locale, "[ %s: %s ]", objArr);
    }

    public static IntentObject fromJSONObject(JSONObject jSONObject) throws Exception {
        IntentObject intentObject = new IntentObject();
        if (jSONObject.has("action")) {
            intentObject.action = jSONObject.getString("action");
        }
        if (jSONObject.has("packageName")) {
            intentObject.packageName = jSONObject.getString("packageName");
        }
        if (jSONObject.has("data")) {
            intentObject.data = jSONObject.getString("data");
        }
        if (jSONObject.has("type")) {
            intentObject.type = jSONObject.getString("type");
        }
        if (jSONObject.has("extrasJSON")) {
            intentObject.extrasJSON = jSONObject.getString("extrasJSON");
        }
        return intentObject;
    }
}
