package com.distriqt.extension.adverts.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class OpenAdInspectorFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            AdvertsContext advertsContext = (AdvertsContext) fREContext;
            if (advertsContext.controller().platform() != null) {
                advertsContext.controller().platform().openAdInspector();
                return null;
            }
            return null;
        } catch (Exception e) {
            Errors.handleException(e);
            return null;
        }
    }
}
