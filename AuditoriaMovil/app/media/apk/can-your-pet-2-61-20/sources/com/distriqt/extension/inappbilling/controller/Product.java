package com.distriqt.extension.inappbilling.controller;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Product {
    public static final String TYPE_CONSUMABLE = "consumable";
    public static final String TYPE_PRODUCT = "inapp";
    public static final String TYPE_SUBSCRIPTION = "subs";
    public SubscriptionPeriod subscriptionPeriod;
    public String id = "";
    public String title = "";
    public String description = "";
    public String type = "inapp";
    public double price = 0.0d;
    public String priceString = "";
    public String locale = "";
    public String countryCode = "";
    public String currencySymbol = "";
    public String internationalCurrencySymbol = "";
    public String currencyCode = "";
    public String itemType = "";
    public String source = "";
    public ArrayList<SubscriptionOffer> subscriptionOffers = new ArrayList<>();

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("title", this.title);
            jSONObject.put("description", this.description);
            jSONObject.put("type", this.type);
            jSONObject.put(FirebaseAnalytics.Param.PRICE, this.price);
            jSONObject.put("priceString", this.priceString);
            jSONObject.put("locale", this.locale);
            jSONObject.put("countryCode", this.countryCode);
            jSONObject.put("currencySymbol", this.currencySymbol);
            jSONObject.put("internationalCurrencySymbol", this.internationalCurrencySymbol);
            jSONObject.put("currencyCode", this.currencyCode);
            jSONObject.put("itemType", this.itemType);
            jSONObject.put(FirebaseAnalytics.Param.SOURCE, this.source);
            JSONArray jSONArray = new JSONArray();
            Iterator<SubscriptionOffer> it = this.subscriptionOffers.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSONObject());
            }
            jSONObject.put("subscriptionOffers", jSONArray);
            SubscriptionPeriod subscriptionPeriod = this.subscriptionPeriod;
            if (subscriptionPeriod != null) {
                jSONObject.put("subscriptionPeriod", subscriptionPeriod.toJSONObject());
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
