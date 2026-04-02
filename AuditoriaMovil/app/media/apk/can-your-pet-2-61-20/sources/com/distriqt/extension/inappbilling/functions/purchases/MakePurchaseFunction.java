package com.distriqt.extension.inappbilling.functions.purchases;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.controller.PurchaseRequest;
import com.distriqt.extension.inappbilling.utils.Errors;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public class MakePurchaseFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        FREObject property;
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            Boolean bool = false;
            if (inAppBillingContext.v) {
                PurchaseRequest purchaseRequest = new PurchaseRequest();
                purchaseRequest.productId = fREObjectArr[0].getProperty("productId").getAsString();
                purchaseRequest.quantity = fREObjectArr[0].getProperty(FirebaseAnalytics.Param.QUANTITY).getAsInt();
                purchaseRequest.developerPayload = fREObjectArr[0].getProperty("developerPayload").getAsString();
                purchaseRequest.applicationUsername = fREObjectArr[0].getProperty("applicationUsername").getAsString();
                purchaseRequest.profileId = fREObjectArr[0].getProperty("profileId").getAsString();
                FREObject property2 = fREObjectArr[0].getProperty("subscriptionOfferRequest");
                if (property2 != null && (property = property2.getProperty("offer")) != null) {
                    purchaseRequest.subscriptionOfferId = property.getProperty("id").getAsString();
                }
                bool = Boolean.valueOf(inAppBillingContext.controller().service().makePurchase(purchaseRequest));
            }
            return FREObject.newObject(bool.booleanValue());
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
