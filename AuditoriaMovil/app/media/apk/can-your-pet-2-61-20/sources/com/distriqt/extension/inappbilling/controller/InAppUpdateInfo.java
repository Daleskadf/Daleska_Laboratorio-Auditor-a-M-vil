package com.distriqt.extension.inappbilling.controller;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class InAppUpdateInfo {
    public static final int DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS = 3;
    public static final int ERROR_EXCEPTION = 2;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NO_NETWORK = 1;
    public static final int ERROR_UNKNOWN = -1;
    public static final int UPDATE_AVAILABLE = 2;
    public static final int UPDATE_NOT_AVAILABLE = 1;
    public static final int UPDATE_UNKNOWN = 0;
    public String packageName = "";
    public String versionName = "";
    public int versionCode = 0;
    public long totalBytes = 0;

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.packageName;
            if (str != null) {
                jSONObject.put("packageName", str);
            }
            String str2 = this.versionName;
            if (str2 != null) {
                jSONObject.put("versionName", str2);
            }
            jSONObject.put("versionCode", this.versionCode);
            jSONObject.put("totalBytes", this.totalBytes);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
