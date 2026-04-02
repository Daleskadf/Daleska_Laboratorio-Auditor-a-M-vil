package com.distriqt.extension.adverts.functions.interstitials;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.core.utils.FREUtils;
import com.distriqt.extension.adverts.AdvertsContext;
/* loaded from: classes.dex */
public class IsSupportedFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        if (((AdvertsContext) fREContext).v) {
            try {
                AdvertsContext advertsContext = (AdvertsContext) fREContext;
                return FREObject.newObject(advertsContext.v ? advertsContext.controller().platform().isInterstitialsSupported() : false);
            } catch (Exception e) {
                FREUtils.handleException(fREContext, e);
            }
        }
        return null;
    }
}
