package com.distriqt.extension.inappbilling.functions.updates;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.utils.Errors;
/* loaded from: classes.dex */
public class IsSupportedFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            return FREObject.newObject((inAppBillingContext.controller() == null || inAppBillingContext.controller().service().inAppUpdates() == null) ? false : inAppBillingContext.controller().service().isInAppUpdatesSupported());
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
