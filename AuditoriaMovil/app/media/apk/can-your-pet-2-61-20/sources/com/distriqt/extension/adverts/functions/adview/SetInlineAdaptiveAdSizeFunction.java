package com.distriqt.extension.adverts.functions.adview;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.AdvertView;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class SetInlineAdaptiveAdSizeFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                int asInt = fREObjectArr[1].getAsInt();
                String asString2 = fREObjectArr[2].getAsString();
                AdvertView adView = advertsContext.controller().platform().getAdView(asString);
                if (adView != null) {
                    adView.setInlineAdaptiveAdSize(asInt, asString2);
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
