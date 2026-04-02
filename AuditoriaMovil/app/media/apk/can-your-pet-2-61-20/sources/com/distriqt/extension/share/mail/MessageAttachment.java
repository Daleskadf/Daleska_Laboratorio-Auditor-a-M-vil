package com.distriqt.extension.share.mail;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class MessageAttachment {
    public String filename;
    public String location;
    public String mimeType;
    public String nativePath;

    public static MessageAttachment fromJSON(JSONObject jSONObject) {
        try {
            MessageAttachment messageAttachment = new MessageAttachment();
            messageAttachment.nativePath = jSONObject.getString("nativePath");
            messageAttachment.mimeType = jSONObject.getString("mimeType");
            messageAttachment.filename = jSONObject.getString("filename");
            messageAttachment.location = jSONObject.getString(FirebaseAnalytics.Param.LOCATION);
            return messageAttachment;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject toJSON() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("nativePath", this.nativePath);
            jSONObject.put("mimeType", this.mimeType);
            jSONObject.put("filename", this.filename);
            jSONObject.put(FirebaseAnalytics.Param.LOCATION, this.location);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
