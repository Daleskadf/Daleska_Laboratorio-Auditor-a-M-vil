package com.distriqt.extension.firebase.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;
import com.distriqt.extension.firebase.FirebaseContext;
import com.distriqt.extension.firebase.utils.Errors;
/* loaded from: classes.dex */
public class VersionFunction implements FREFunction {
    @Override // com.adobe.fre.FREFunction
    public FREObject call(FREContext fREContext, FREObject[] fREObjectArr) {
        try {
            return FREObject.newObject(((FirebaseContext) fREContext).controller().version());
        } catch (FREWrongThreadException e) {
            Errors.handleException(fREContext, e);
            return null;
        }
    }
}
