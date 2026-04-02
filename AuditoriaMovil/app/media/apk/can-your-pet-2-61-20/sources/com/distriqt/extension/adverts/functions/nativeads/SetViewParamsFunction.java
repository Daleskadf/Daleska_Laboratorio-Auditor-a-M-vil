package com.distriqt.extension.adverts.functions.nativeads;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.AdvertViewParams;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd;
import com.distriqt.extension.adverts.utils.AdvertsFREObjectUtils;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class SetViewParamsFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                AdvertViewParams viewParamsFromFREObject = AdvertsFREObjectUtils.viewParamsFromFREObject(fREObjectArr[1]);
                AdvertNativeAd nativeAd = advertsContext.controller().platform().getNativeAd(asString);
                if (nativeAd != null) {
                    nativeAd.setViewParams(viewParamsFromFREObject);
                    return null;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
