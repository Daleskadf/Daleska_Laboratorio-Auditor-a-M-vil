package com.distriqt.extension.inappbilling.controller;

import com.adobe.air.wand.message.MessageManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Purchase {
    public static final String STATE_CANCELLED = "transaction:cancelled";
    public static final String STATE_DEFERRED = "transaction:deferred";
    public static final String STATE_FAILED = "transaction:failed";
    public static final String STATE_NOTALLOWED = "transaction:notallowed";
    public static final String STATE_PURCHASED = "transaction:purchased";
    public static final String STATE_PURCHASING = "transaction:purchasing";
    public static final String STATE_REFUNDED = "transaction:refunded";
    public static final String STATE_REMOVED = "transaction:removed";
    public static final String STATE_RESTORED = "transaction:restored";
    public static final String STATE_UNKNOWN = "transaction:unknown";
    public String productId = "";
    public String parentProductId = "";
    public int quantity = 1;
    public long transactionTimestamp = -1;
    public String transactionId = "";
    public String transactionState = STATE_UNKNOWN;
    public String transactionReceipt = "";
    public String packageName = "";
    public Purchase originalPurchase = null;
    public String developerPayload = "";
    public String applicationUsername = "";
    public String profileId = "";
    public String signature = "";
    public String originalMessage = "";
    public boolean isAutoRenewing = false;
    public long cancelTimestamp = -1;
    public String error = "";
    public String errorCode = "";

    public String toString() {
        return toJSONObject().toString();
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("productId", this.productId);
            jSONObject.putOpt("parentProductId", this.parentProductId);
            jSONObject.putOpt(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(this.quantity));
            jSONObject.putOpt("transactionTimestamp", Long.valueOf(this.transactionTimestamp));
            jSONObject.putOpt("transactionIdentifier", this.transactionId);
            jSONObject.putOpt("transactionState", this.transactionState);
            jSONObject.putOpt("transactionReceipt", this.transactionReceipt);
            jSONObject.putOpt("packageName", this.packageName);
            jSONObject.putOpt("developerPayload", this.developerPayload);
            jSONObject.putOpt("applicationUsername", this.applicationUsername);
            jSONObject.putOpt("profileId", this.profileId);
            jSONObject.putOpt("signature", this.signature);
            jSONObject.putOpt("isAutoRenewing", Boolean.valueOf(this.isAutoRenewing));
            String str = this.originalMessage;
            if (str != null) {
                jSONObject.putOpt("originalMessage", str);
            }
            Purchase purchase = this.originalPurchase;
            if (purchase != null) {
                jSONObject.putOpt("originalTransaction", purchase.toJSONObject());
            }
            long j = this.cancelTimestamp;
            if (j > 0) {
                jSONObject.putOpt("cancelTimestamp", Long.valueOf(j));
            }
            jSONObject.putOpt(MessageManager.NAME_ERROR_MESSAGE, this.error);
            jSONObject.putOpt("errorCode", this.errorCode);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
