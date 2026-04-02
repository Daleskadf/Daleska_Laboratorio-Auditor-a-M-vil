package com.distriqt.extension.inappbilling.functions;

import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.utils.Errors;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ActiveProductIdsFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            if (inAppBillingContext.v) {
                ArrayList<String> activeProductIds = inAppBillingContext.controller().service().activeProductIds();
                FREArray newArray = FREArray.newArray(activeProductIds.size());
                for (int i = 0; i < activeProductIds.size(); i++) {
                    newArray.setObjectAt(i, FREObject.newObject(activeProductIds.get(i)));
                }
                return newArray;
            }
            return FREArray.newArray(0);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
