package com.distriqt.extension.adverts.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class GetAdvertisingIdFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            String str = "";
            if (advertsContext.v && advertsContext.controller().platform() != null) {
                str = advertsContext.controller().platform().getAdvertisingId();
            }
            return FREObject.newObject(str);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
