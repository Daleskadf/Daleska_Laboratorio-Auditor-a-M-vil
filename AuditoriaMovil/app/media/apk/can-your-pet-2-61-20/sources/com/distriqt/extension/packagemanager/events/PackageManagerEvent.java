package com.distriqt.extension.packagemanager.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class PackageManagerEvent {
    public static final String GET_INSTALLED_APPLICATIONS = "packagemanager:getInstalledApplications";
    public static final String PACKAGE_REMOVED = "packagemanager:packageremoved";

    public static String formatForEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
