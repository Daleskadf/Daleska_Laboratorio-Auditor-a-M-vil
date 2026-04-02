package com.distriqt.extension.inappbilling.functions;

import com.adobe.fre.FREArray;
import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.inappbilling.InAppBillingContext;
import com.distriqt.extension.inappbilling.utils.Errors;
import java.util.Arrays;
/* loaded from: classes.dex */
public class GetProductsFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            InAppBillingContext inAppBillingContext = (InAppBillingContext) fREContext;
            boolean z = false;
            if (inAppBillingContext.v) {
                String[] GetObjectAsArrayOfStrings = FREUtils.GetObjectAsArrayOfStrings((FREArray) fREObjectArr[0]);
                String[] GetObjectAsArrayOfStrings2 = FREUtils.GetObjectAsArrayOfStrings((FREArray) fREObjectArr[1]);
                z = inAppBillingContext.controller().service().getProducts(Arrays.asList(GetObjectAsArrayOfStrings), Arrays.asList(GetObjectAsArrayOfStrings2), Boolean.valueOf(fREObjectArr[2].getAsBool()));
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
