package com.distriqt.extension.inappbilling.functions.purchases;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.utils.Errors;
/* loaded from: classes.dex */
public class RestorePurchasesFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            Boolean bool = false;
            if (inAppBillingContext.v) {
                bool = Boolean.valueOf(inAppBillingContext.controller().service().restorePurchases());
            }
            return FREObject.newObject(bool.booleanValue());
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
