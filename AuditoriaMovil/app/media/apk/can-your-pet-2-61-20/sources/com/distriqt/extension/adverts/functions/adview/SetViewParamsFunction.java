package com.distriqt.extension.adverts.functions.adview;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.AdvertView;
import com.distriqt.extension.adverts.controller.AdvertViewParams;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class SetViewParamsFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.v) {
                String asString = fREObjectArr[0].getAsString();
                AdvertViewParams fromFREObject = fromFREObject(fREObjectArr[1]);
                AdvertView adView = advertsContext.controller().platform().getAdView(asString);
                if (adView != null) {
                    adView.setViewParams(fromFREObject);
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

    public static AdvertViewParams fromFREObject(FREObject fREObject) {
        AdvertViewParams advertViewParams = new AdvertViewParams();
        if (fREObject != null) {
            try {
                advertViewParams.x = fREObject.getProperty("x").getAsInt();
                advertViewParams.y = fREObject.getProperty("y").getAsInt();
                advertViewParams.width = fREObject.getProperty("width").getAsInt();
                advertViewParams.height = fREObject.getProperty("height").getAsInt();
                advertViewParams.horizontalAlign = AdvertViewParams.alignmentFromString(fREObject.getProperty("horizontalAlign").getAsString());
                advertViewParams.verticalAlign = AdvertViewParams.alignmentFromString(fREObject.getProperty("verticalAlign").getAsString());
            } catch (Exception e) {
                Errors.handleException(e);
            }
        }
        return advertViewParams;
    }
}
