package com.distriqt.extension.inappbilling.events;

import com.adobe.air.wand.message.MessageManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PurchaseEvent {
    public static final String GET_PURCHASES_COMPLETE = "get:purchases:complete";
    public static final String GET_PURCHASES_FAILED = "get:purchases:failed";
    public static final String PURCHASES_UPDATED = "purchases:updated";
    public static final String PURCHASE_FAILED = "purchase:failed";

    public static String formatPurchaseForEvent(JSONObject jSONObject, int i, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2.put(FirebaseAnalytics.Event.PURCHASE, jSONObject);
            }
            jSONObject2.put("errorCode", String.valueOf(i));
            jSONObject2.put(MessageManager.NAME_ERROR_MESSAGE, str);
            return jSONObject2.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String formatPurchasesForEvent(JSONObject jSONObject, int i, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
            jSONObject2.put("purchases", jSONArray);
            jSONObject2.put("errorCode", String.valueOf(i));
            jSONObject2.put(MessageManager.NAME_ERROR_MESSAGE, str);
            return jSONObject2.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String formatPurchasesForEvent(JSONArray jSONArray, int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("purchases", jSONArray);
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put(MessageManager.NAME_ERROR_MESSAGE, str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static String formatErrorForEvent(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put(MessageManager.NAME_ERROR_MESSAGE, str);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }
}
