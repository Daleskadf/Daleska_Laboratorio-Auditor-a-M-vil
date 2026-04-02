package com.distriqt.extension.adverts.functions.interstitials;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.InterstitialAd;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class HideFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            boolean z = false;
            if (advertsContext.v) {
                InterstitialAd interstitialAd = advertsContext.controller().platform().getInterstitialAd(fREObjectArr[0].getAsString());
                if (interstitialAd != null) {
                    z = interstitialAd.hide();
                }
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
