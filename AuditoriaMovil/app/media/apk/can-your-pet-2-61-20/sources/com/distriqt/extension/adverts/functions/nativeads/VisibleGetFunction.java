package com.distriqt.extension.adverts.functions.nativeads;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.nativeads.AdvertNativeAd;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class VisibleGetFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            boolean z = false;
            if (advertsContext.v) {
                AdvertNativeAd nativeAd = advertsContext.controller().platform().getNativeAd(fREObjectArr[0].getAsString());
                if (nativeAd != null) {
                    z = nativeAd.isVisible();
                }
            }
            return FREObject.newObject(z);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
