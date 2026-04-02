package com.distriqt.extension.adverts.functions.appopen;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.appopenads.AdvertAppOpenAd;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class ShowFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            boolean z = false;
            if (advertsContext.v) {
                AdvertAppOpenAd appOpenAd = advertsContext.controller().platform().appOpenAds().getAppOpenAd(fREObjectArr[0].getAsString());
                if (appOpenAd != null) {
                    z = appOpenAd.show();
                }
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
