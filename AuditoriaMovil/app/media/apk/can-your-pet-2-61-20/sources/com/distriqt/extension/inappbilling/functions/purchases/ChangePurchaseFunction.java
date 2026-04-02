package com.distriqt.extension.inappbilling.functions.purchases;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.controller.PurchaseChangeRequest;
import com.distriqt.extension.inappbilling.utils.Errors;
/* loaded from: classes.dex */
public class ChangePurchaseFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        FREObject property;
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            Boolean bool = false;
            if (inAppBillingContext.v) {
                PurchaseChangeRequest purchaseChangeRequest = new PurchaseChangeRequest();
                purchaseChangeRequest.currentProductId = fREObjectArr[0].getProperty("currentProductId").getAsString();
                purchaseChangeRequest.currentTransactionId = fREObjectArr[0].getProperty("currentTransactionId").getAsString();
                purchaseChangeRequest.newProductId = fREObjectArr[0].getProperty("newProductId").getAsString();
                purchaseChangeRequest.applicationUsername = fREObjectArr[0].getProperty("applicationUsername").getAsString();
                purchaseChangeRequest.prorationMode = fREObjectArr[0].getProperty("prorationMode").getAsInt();
                FREObject property2 = fREObjectArr[0].getProperty("subscriptionOfferRequest");
                if (property2 != null && (property = property2.getProperty("offer")) != null) {
                    purchaseChangeRequest.subscriptionOfferId = property.getProperty("id").getAsString();
                }
                bool = Boolean.valueOf(inAppBillingContext.controller().service().changePurchase(purchaseChangeRequest));
            }
            return FREObject.newObject(bool.booleanValue());
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
