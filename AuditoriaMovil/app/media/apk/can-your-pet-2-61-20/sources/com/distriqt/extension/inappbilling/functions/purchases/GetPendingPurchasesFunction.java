package com.distriqt.extension.inappbilling.functions.purchases;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.events.PurchaseEvent;
import com.distriqt.extension.inappbilling.utils.Errors;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class GetPendingPurchasesFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        JSONArray pendingPurchases;
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            String str = "{}";
            if (inAppBillingContext.v && (pendingPurchases = inAppBillingContext.controller().service().getPendingPurchases()) != null) {
                str = PurchaseEvent.formatPurchasesForEvent(pendingPurchases, 0, "");
            }
            return FREObject.newObject(str);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
