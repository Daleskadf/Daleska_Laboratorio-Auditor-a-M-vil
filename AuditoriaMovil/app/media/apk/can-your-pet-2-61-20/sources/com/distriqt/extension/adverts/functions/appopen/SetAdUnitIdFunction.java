package com.distriqt.extension.adverts.functions.appopen;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class SetAdUnitIdFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                String asString2 = fREObjectArr[1].getAsString();
                AdvertAppOpenAd appOpenAd = advertsContext.controller().platform().appOpenAds().getAppOpenAd(asString);
                if (appOpenAd != null) {
                    appOpenAd.setAdUnitId(asString2);
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
