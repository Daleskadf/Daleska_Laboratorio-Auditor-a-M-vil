package com.distriqt.extension.adverts.functions.consent;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class IsSupportedFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            return FREObject.newObject((!advertsContext.v || advertsContext.controller().platform() == null) ? false : advertsContext.controller().platform().isSupported());
        } catch (Throwable th) {
            Errors.handleException(fREContext, th);
            return null;
        }
    }
}
