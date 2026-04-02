package com.distriqt.extension.androidx.core.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.core.utils.FREUtils;
/* loaded from: classes.dex */
public class VersionFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject("1.0");
        } catch (FREWrongThreadException e) {
            FREUtils.handleException(fREContext, e);
            return null;
        }
    }
}
