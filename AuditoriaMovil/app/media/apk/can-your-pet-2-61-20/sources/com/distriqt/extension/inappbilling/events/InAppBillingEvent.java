package com.distriqt.extension.inappbilling.events;

import com.distriqt.extension.inappbilling.controller.Product;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class InAppBillingEvent {
    public static String CONSUME_FAILED = "inappbilling:consume:failed";
    public static String CONSUME_SUCCESS = "inappbilling:consume:success";
    public static String FINISH_FAILED = "inappbilling:finish:failed";
    public static String FINISH_SUCCESS = "inappbilling:finish:success";
    public static String PRODUCTS_FAILED = "inappbilling:products:failed";
    public static String PRODUCTS_LOADED = "inappbilling:products:loaded";
    public static String PRODUCT_INVALID = "inappbilling:product:invalid";
    public static String RESTORE_PURCHASES_FAILED = "inappbilling:restore:purchases:failed";
    public static String RESTORE_PURCHASES_SUCCESS = "inappbilling:restore:purchases:success";
    public static String SETUP_FAILURE = "inappbilling:setup:failure";
    public static String SETUP_SUCCESS = "inappbilling:setup:success";

    public static String formatProductsForEvent(Map<String, Product> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, Product> entry : map.entrySet()) {
                entry.getKey();
                try {
                    JSONObject jSONObject2 = entry.getValue().toJSONObject();
                    if (jSONObject2 != null) {
                        jSONArray.put(jSONObject2);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            jSONObject.put("products", jSONArray);
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String formatErrorForEvent(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", str);
            jSONObject.put("errorCode", String.valueOf(i));
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
