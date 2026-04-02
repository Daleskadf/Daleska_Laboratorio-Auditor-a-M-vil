package com.distriqt.extension.playservices.adsidentifier.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.playservices.adsidentifier.utils.Errors;
/* loaded from: classes.dex */
public class IsSupportedFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(true);
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
