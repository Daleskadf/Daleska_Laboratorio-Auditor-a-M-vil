package com.distriqt.extension.inappbilling.controller;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SubscriptionPhase {
    public static final String RECURRENCE_MODE_FINITE = "finite";
    public static final String RECURRENCE_MODE_INFINITE = "infinite";
    public static final String RECURRENCE_MODE_NONE = "none";
    private static final String TAG = "SubscriptionPhase";
    public SubscriptionPeriod subscriptionPeriod;
    public double price = 0.0d;
    public String priceString = "";
    public String currencyCode = "";
    public String currencySymbol = "";
    public String recurrenceMode = RECURRENCE_MODE_INFINITE;
    public int numberOfPeriods = 0;
    public String paymentMode = "paymentmode_payAsYouGo";

    public JSONObject toJSONObject() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.Param.PRICE, this.price);
        jSONObject.put("priceString", this.priceString);
        jSONObject.put("currencySymbol", this.currencySymbol);
        jSONObject.put("currencyCode", this.currencyCode);
        SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
        if (subscriptionPeriod != null) {
            jSONObject.put("subscriptionPeriod", subscriptionPeriod.toJSONObject());
        }
        jSONObject.put("recurrenceMode", this.recurrenceMode);
        jSONObject.put("numberOfPeriods", this.numberOfPeriods);
        jSONObject.put("paymentMode", this.paymentMode);
        return jSONObject;
    }
}
