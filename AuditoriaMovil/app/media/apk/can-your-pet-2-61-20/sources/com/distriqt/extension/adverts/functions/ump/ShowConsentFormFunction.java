package com.distriqt.extension.adverts.functions.ump;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class ShowConsentFormFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            return FREObject.newObject(advertsContext.v ? advertsContext.controller().platform().ump().showConsentForm() : false);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
