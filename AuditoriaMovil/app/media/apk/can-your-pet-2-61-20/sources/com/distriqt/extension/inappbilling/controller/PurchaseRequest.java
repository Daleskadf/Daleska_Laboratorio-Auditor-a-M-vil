package com.distriqt.extension.inappbilling.controller;

import java.util.Locale;
/* loaded from: classes.dex */
public class PurchaseRequest {
    public String productId = "";
    public int quantity = 1;
    public String developerPayload = "";
    public String applicationUsername = "";
    public String profileId = "";
    public String subscriptionOfferId = null;

    public String toString() {
        return String.format(Locale.UK, "[%s, %d]", this.productId, Integer.valueOf(this.quantity));
    }
}
