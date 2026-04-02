package com.distriqt.extension.adverts.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.controller.AdvertRequestConfiguration;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class SetRequestConfigurationFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            AdvertRequestConfiguration fromJSONString = AdvertRequestConfiguration.fromJSONString(fREObjectArr[0].getAsString());
            if (!advertsContext.v || advertsContext.controller().platform() == null) {
                return null;
            }
            advertsContext.controller().platform().setRequestConfiguration(fromJSONString);
            return null;
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
