package com.distriqt.extension.playservices.base.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.extension.playservices.base.PlayServicesBase;
/* loaded from: classes.dex */
public class ImplementationFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(PlayServicesBase.IMPLEMENTATION);
        } catch (FREWrongThreadException unused) {
            return null;
        }
    }
}
