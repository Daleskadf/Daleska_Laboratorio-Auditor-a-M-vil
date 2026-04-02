package com.distriqt.extension.share.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.extension.share.Share;
import com.distriqt.extension.share.utils.Errors;
/* loaded from: classes.dex */
public class ImplementationFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(Share.IMPLEMENTATION);
        } catch (FREWrongThreadException e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
