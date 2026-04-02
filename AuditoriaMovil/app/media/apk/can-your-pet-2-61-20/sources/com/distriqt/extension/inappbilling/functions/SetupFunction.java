package com.distriqt.extension.inappbilling.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.controller.BillingService;
import com.distriqt.extension.inappbilling.utils.Errors;
/* loaded from: classes.dex */
public class SetupFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            boolean z = false;
            if (inAppBillingContext.v) {
                BillingService billingService = new BillingService();
                billingService.type = fREObjectArr[0].getProperty("type").getAsString();
                billingService.googlePlayPublicKey = fREObjectArr[0].getProperty("googlePlayPublicKey").getAsString();
                billingService.huaweiAppGalleryPublicKey = fREObjectArr[0].getProperty("huaweiAppGalleryPublicKey").getAsString();
                billingService.catappultPublicKey = fREObjectArr[0].getProperty("catappultPublicKey").getAsString();
                billingService.operationMode = fREObjectArr[0].getProperty("operationMode").getAsString();
                z = inAppBillingContext.controller().setup(billingService);
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
