package com.distriqt.extension.adverts.functions.ump;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.adverts.AdvertsContext;
import com.distriqt.extension.adverts.utils.Errors;
/* loaded from: classes.dex */
public class IsSupportedFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(((AdvertsContext) fREContext).controller().platform().ump().isSupported());
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
