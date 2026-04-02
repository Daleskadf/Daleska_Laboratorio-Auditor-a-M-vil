package com.distriqt.extension.inappbilling.functions.purchases;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.controller.Purchase;
import com.distriqt.extension.inappbilling.events.InAppBillingEvent;
import com.distriqt.extension.inappbilling.events.PurchaseEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public class ConsumePurchaseFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            Boolean bool = false;
            if (inAppBillingContext.v) {
                Purchase purchase = new Purchase();
                purchase.productId = fREObjectArr[0].getProperty("productId").getAsString();
                purchase.parentProductId = fREObjectArr[0].getProperty("parentProductId").getAsString();
                purchase.quantity = fREObjectArr[0].getProperty(FirebaseAnalytics.Param.QUANTITY).getAsInt();
                purchase.transactionTimestamp = (long) fREObjectArr[0].getProperty("transactionTimestamp").getAsDouble();
                purchase.transactionId = fREObjectArr[0].getProperty("transactionId").getAsString();
                purchase.transactionState = fREObjectArr[0].getProperty("transactionState").getAsString();
                purchase.transactionReceipt = fREObjectArr[0].getProperty("transactionReceipt").getAsString();
                purchase.developerPayload = fREObjectArr[0].getProperty("developerPayload").getAsString();
                purchase.signature = fREObjectArr[0].getProperty("signature").getAsString();
                purchase.originalMessage = fREObjectArr[0].getProperty("originalMessage").getAsString();
                purchase.error = fREObjectArr[0].getProperty("error").getAsString();
                purchase.errorCode = fREObjectArr[0].getProperty("errorCode").getAsString();
                bool = Boolean.valueOf(inAppBillingContext.controller().service().consumePurchase(purchase));
            }
            return FREObject.newObject(bool.booleanValue());
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            ((InAppBillingContext) fREContext).dispatchEvent(InAppBillingEvent.CONSUME_FAILED, PurchaseEvent.formatErrorForEvent(5, "Invalid purchase details provided"));
            return null;
        }
    }
}
