package com.distriqt.extension.adverts.functions.nativeads;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.AdvertViewParams;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAdTemplateStyle;
import com.distriqt.extension.adverts.utils.AdvertsFREObjectUtils;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class ShowWithTemplateFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            boolean z = false;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                String asString2 = fREObjectArr[1].getAsString();
                AdvertViewParams viewParamsFromFREObject = AdvertsFREObjectUtils.viewParamsFromFREObject(fREObjectArr[2]);
                AdvertNativeAdTemplateStyle templateStyleFromFREObject = AdvertsFREObjectUtils.templateStyleFromFREObject(fREObjectArr[3]);
                AdvertNativeAd nativeAd = advertsContext.controller().platform().getNativeAd(asString);
                if (nativeAd != null) {
                    z = nativeAd.showWithTemplate(asString2, viewParamsFromFREObject, templateStyleFromFREObject);
                }
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
