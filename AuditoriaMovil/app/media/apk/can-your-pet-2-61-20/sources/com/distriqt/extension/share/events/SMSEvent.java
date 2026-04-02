package com.distriqt.extension.share.events;

import com.adobe.air.wand.message.MessageManager;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SMSEvent {
    public static String MESSAGE_SMS_CANCELLED = "sms:cancelled";
    public static String MESSAGE_SMS_DELIVERED = "sms:delivered";
    public static String MESSAGE_SMS_NOT_DELIVERED = "sms:not:delivered";
    public static String MESSAGE_SMS_RECEIVED = "sms:received";
    public static String MESSAGE_SMS_SENT = "sms:sent";
    public static String MESSAGE_SMS_SENT_ERROR = "sms:sent:error";

    public static String formatSMSForEvent(String str, String str2, String str3, String str4) {
        return formatSMSForEvent(str, str2, str3, str4, null, -1);
    }

    public static String formatSMSForEvent(String str, String str2, String str3, String str4, String str5) {
        return formatSMSForEvent(str, str2, str3, str4, str5, -1);
    }

    public static String formatSMSForEvent(String str, String str2, String str3, String str4, String str5, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (str == null) {
                str = "";
            }
            jSONObject2.put("id", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("address", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put(MessageManager.NAME_ERROR_MESSAGE, str3);
            if (str4 != null) {
                jSONObject2.put("scAddress", str4);
            }
            jSONObject2.put("subscriptionId", i);
            jSONObject.put("sms", jSONObject2);
            if (str5 != null) {
                jSONObject.put("error", str5);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
