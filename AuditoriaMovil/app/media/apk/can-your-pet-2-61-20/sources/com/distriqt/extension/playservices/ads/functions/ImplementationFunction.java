package com.distriqt.extension.playservices.ads.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.extension.playservices.ads.AdsContext;
/* loaded from: classes.dex */
public class ImplementationFunction implements FREFunction {
    public static String TAG = "ImplementationFunction";

    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(AdsContext.IMPLEMENTATION);
        } catch (FREWrongThreadException unused) {
            return null;
        }
    }
}
