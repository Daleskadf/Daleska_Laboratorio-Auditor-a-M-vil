package com.distriqt.extension.share.sms;

import com.adobe.air.wand.message.MessageManager;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SMS {
    public String address;
    public String id;
    public String message;
    public String scAddress = null;

    public static SMS fromJSONObject(JSONObject jSONObject) throws Exception {
        SMS sms = new SMS();
        if (jSONObject.has("address")) {
            sms.address = jSONObject.getString("address");
        }
        if (jSONObject.has(MessageManager.NAME_ERROR_MESSAGE)) {
            sms.message = jSONObject.getString(MessageManager.NAME_ERROR_MESSAGE);
        }
        if (jSONObject.has("id")) {
            sms.id = jSONObject.getString("id");
        }
        if (jSONObject.has("scAddress")) {
            sms.scAddress = jSONObject.getString("scAddress");
        }
        return sms;
    }
}
