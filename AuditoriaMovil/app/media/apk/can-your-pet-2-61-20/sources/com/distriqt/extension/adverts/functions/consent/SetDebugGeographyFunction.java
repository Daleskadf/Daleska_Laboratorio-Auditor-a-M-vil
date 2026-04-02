package com.distriqt.extension.adverts.functions.consent;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class SetDebugGeographyFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                int asInt = fREObjectArr[0].getAsInt();
                if (advertsContext.controller().platform() != null) {
                    advertsContext.controller().platform().setDebugGeography(asInt);
                    return null;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            Errors.handleException(fREContext, th);
            return null;
        }
    }
}
