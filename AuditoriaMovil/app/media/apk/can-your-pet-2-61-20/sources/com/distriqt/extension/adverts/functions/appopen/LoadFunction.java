package com.distriqt.extension.adverts.functions.appopen;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.AdvertRequest;
import com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd;
import com.distriqt.extension.adverts.utils.AdvertsFREObjectUtils;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class LoadFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                AdvertRequest requestFromFREObject = AdvertsFREObjectUtils.requestFromFREObject(fREObjectArr[1]);
                int asInt = fREObjectArr[2].getAsInt();
                AdvertAppOpenAd appOpenAd = advertsContext.controller().platform().appOpenAds().getAppOpenAd(asString);
                if (appOpenAd != null) {
                    appOpenAd.load(requestFromFREObject, asInt);
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
