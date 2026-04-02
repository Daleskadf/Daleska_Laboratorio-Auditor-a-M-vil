package com.distriqt.extension.inappbilling.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.utils.Errors;
/* loaded from: classes.dex */
public class CheckAvailabilityFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            String str = "";
            if (inAppBillingContext.controller() != null && inAppBillingContext.controller().service() != null) {
                str = inAppBillingContext.controller().service().checkAvailability();
            }
            return FREObject.newObject(str);
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
