package com.distriqt.extension.adverts.functions.adview;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.AdvertSize;
import com.distriqt.extension.adverts.controller.AdvertView;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class SetAdSizeFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                AdvertSize advertSize = new AdvertSize();
                advertSize.width = fREObjectArr[1].getProperty("width").getAsInt();
                advertSize.height = fREObjectArr[1].getProperty("height").getAsInt();
                advertSize.type = fREObjectArr[1].getProperty("type").getAsString();
                AdvertView adView = advertsContext.controller().platform().getAdView(asString);
                if (adView != null) {
                    adView.setAdSize(advertSize);
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
