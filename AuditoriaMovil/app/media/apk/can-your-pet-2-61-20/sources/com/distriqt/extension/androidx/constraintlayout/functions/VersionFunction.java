package com.distriqt.extension.androidx.constraintlayout.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.distriqt.extension.androidx.constraintlayout.utils.Errors;
/* loaded from: classes.dex */
public class VersionFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject("1.0");
        } catch (Exception e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
