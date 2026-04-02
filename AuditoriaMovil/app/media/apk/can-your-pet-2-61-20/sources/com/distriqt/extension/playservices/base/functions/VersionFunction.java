package com.distriqt.extension.playservices.base.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.extension.playservices.base.PlayServicesBase;
/* loaded from: classes.dex */
public class VersionFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(PlayServicesBase.VERSION);
        } catch (FREWrongThreadException unused) {
            return null;
        }
    }
}
