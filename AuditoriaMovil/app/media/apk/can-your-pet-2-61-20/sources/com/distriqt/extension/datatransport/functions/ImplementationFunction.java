package com.distriqt.extension.datatransport.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.datatransport.utils.Errors;
/* loaded from: classes.dex */
public class ImplementationFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject("Android");
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
