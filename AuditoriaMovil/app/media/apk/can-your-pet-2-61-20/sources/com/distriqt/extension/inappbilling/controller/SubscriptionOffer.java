package com.distriqt.extension.inappbilling.controller;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class SubscriptionOffer {
    private static final String TAG = "SubscriptionOffer";
    public String id = "";
    public boolean requiresSignature = false;
    public boolean storeDeterminedEligible = true;
    public ArrayList<SubscriptionPhase> phases = new ArrayList<>();
    public ArrayList<String> tags = new ArrayList<>();

    public JSONObject toJSONObject() throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        JSONArray jSONArray = new JSONArray();
        Iterator<SubscriptionPhase> it = this.phases.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSONObject());
        }
        jSONObject.put("phases", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<String> it2 = this.tags.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(it2.next());
        }
        jSONObject.put("tags", jSONArray2);
        jSONObject.put("requiresSignature", this.requiresSignature);
        jSONObject.put("storeDeterminedEligible", this.storeDeterminedEligible);
        return jSONObject;
    }
}
