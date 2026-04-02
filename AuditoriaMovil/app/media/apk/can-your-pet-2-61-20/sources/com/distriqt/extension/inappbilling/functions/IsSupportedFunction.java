package com.distriqt.extension.inappbilling.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.utils.Errors;
/* loaded from: classes.dex */
public class IsSupportedFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        boolean isSupported;
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            if (inAppBillingContext.controller() != null) {
                isSupported = inAppBillingContext.controller().isSupported();
            } else {
                isSupported = inAppBillingContext.controller().isSupported();
            }
            return FREObject.newObject(isSupported);
        } catch (FREWrongThreadException e) {
            Errors.handleException(e);
            return null;
        }
    }
}
