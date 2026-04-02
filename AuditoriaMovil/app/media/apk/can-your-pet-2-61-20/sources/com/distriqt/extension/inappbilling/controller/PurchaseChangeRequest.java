package com.distriqt.extension.inappbilling.controller;

import java.util.Locale;
/* loaded from: classes.dex */
public class PurchaseChangeRequest {
    public static final int DEFERRED = 4;
    public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
    public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
    public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
    public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
    public String currentProductId = "";
    public String currentTransactionId = "";
    public String newProductId = "";
    public String subscriptionOfferId = null;
    public int prorationMode = 1;
    public String applicationUsername = "";

    public String toString() {
        return String.format(Locale.UK, "[%s, %s, %d]", this.currentProductId, this.newProductId, Integer.valueOf(this.prorationMode));
    }
}
