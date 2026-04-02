package com.distriqt.extension.applicationrater.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.extension.applicationrater.ApplicationRater;
import com.distriqt.extension.applicationrater.utils.Errors;
/* loaded from: classes.dex */
public class VersionFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(ApplicationRater.VERSION);
        } catch (FREWrongThreadException e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
