package com.distriqt.extension.playservices.base.events;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class ProviderInstallerEvent {
    public static final String INSTALLED = "providerinstaller_installed";
    public static final String INSTALL_FAILED = "providerinstaller_install_failed";

    public static String formatForEvent() {
        return formatForEvent(-1);
    }

    public static String formatForEvent(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", i);
            jSONObject.toString();
            return "{}";
        } catch (Exception unused) {
            return "{}";
        }
    }
}
