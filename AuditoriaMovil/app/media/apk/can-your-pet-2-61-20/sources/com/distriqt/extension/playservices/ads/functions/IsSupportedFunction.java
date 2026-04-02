package com.distriqt.extension.playservices.ads.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
/* loaded from: classes.dex */
public class IsSupportedFunction implements FREFunction {
    public static String TAG = "IsSupportedFunction";

    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(true);
        } catch (FREWrongThreadException unused) {
            return null;
        }
    }
}
